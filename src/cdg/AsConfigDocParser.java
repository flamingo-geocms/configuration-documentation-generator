/*
 * AsConfigDocParser.java
 *
 * Created on 26 februari 2009, 19:02
 *
 */

package cdg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import nl.fmc.configuration.Attribute;
import nl.fmc.configuration.Component;
import nl.fmc.configuration.Configcursor;
import nl.fmc.configuration.Configcursors;
import nl.fmc.configuration.Configstring;
import nl.fmc.configuration.Configstrings;
import nl.fmc.configuration.Configstyle;
import nl.fmc.configuration.Configstyles;
import nl.fmc.configuration.Configtag;
import nl.fmc.configuration.Configtags;
import nl.fmc.configuration.Event;
import nl.fmc.configuration.Events;
import nl.fmc.configuration.Flamingodoc;
import nl.fmc.configuration.Method;
import nl.fmc.configuration.Methods;
import nl.fmc.configuration.Parameter;
import org.exolab.castor.xml.Marshaller;

/**
 *
 * @author Roy Braam
 * RoyBraam@B3partners.nl
 */
public class AsConfigDocParser {
    private static String componentType = "@component";
    private static String fileType = "@file";
    private static String tagType = "@tag";
    private static String changeType = "@change";
    private static String attributeType = "@attr";
    private static String hierarchyType = "@hierarchy";
    private static String exampleType = "@example";
    private static String paramType = "@param";
    private static String returnType= "@return";
    private static String configstringType= "@configstring";
    private static String configstyleType= "@configstyle";
    private static String versionType="@version";
    private static String configcursorType="@configcursor";
    private File sourceDir;
    private File destDir;
    private boolean flaExists=false;
    private ArrayList filesToGenerate=null;
    private ArrayList asFiles=null;
    private ArrayList flaFiles=null;
    private ArrayList<String> succesFiles=new ArrayList();
    private BufferedWriter indexWriter;
    /** Creates a new instance of AsConfigDocParser */
    public AsConfigDocParser(File source,File dest, boolean flaExists) {
        setFlaExists(flaExists);
        setSourceDir(source);
        setDestDir(dest);
    }
    public void generateDoc()throws IOException, Exception{
        if (flaExists){            
            createFileListForDoc();
        }
        File indexFile = new File(destDir,"index.html");
        FileWriter fstream = new FileWriter(indexFile);

        indexWriter = new BufferedWriter(fstream);
        indexWriter.append("<html>\n"+
                "<head>\n<title>Flamingo-mc Configuration Documentation</title>"+
                "<link rel=\"stylesheet\" href=\"style.css\">"+
                "\n</head>\n<body>\n<div class=\"blockContent\">"
                + "\n<h1>Available Components</h1>");
        try{
            generateDoc(sourceDir);
        }catch(IOException ioe){
            throw ioe;
        }finally{
            //sort the ahrefs.
            String[] ahrefs = new String[succesFiles.size()];
            succesFiles.toArray(ahrefs);
            Arrays.sort(ahrefs);
            for (int i=0; i < ahrefs.length; i++){
                indexWriter.append("<div class=\"link\">"+ahrefs[i]+"</div>\n");
            }
            indexWriter.append("\n</div>\n</body>\n</html>");
            indexWriter.close();
        }
        System.out.println("Succesfully created documentation for "+succesFiles.size()+" components");
    }
    private void createFileListForDoc() throws IOException {
        filesToGenerate=new ArrayList();
        asFiles=new ArrayList();
        flaFiles=new ArrayList();
        checkForFla(sourceDir);
        for (int i=0; i < asFiles.size(); i++){
            String fileName=(String)asFiles.get(i);
            String asName =fileName.substring(0,fileName.indexOf("."));
            boolean addAsFile=false;
            for (int b=0 ; b < flaFiles.size()&& !addAsFile ; b++){
                String flaName=(String)flaFiles.get(b);
                flaName =flaName.substring(0,flaName.indexOf("."));
                if (asName.equalsIgnoreCase(flaName)){
                    addAsFile=true;
                }
            }
            if (addAsFile){
                filesToGenerate.add(fileName);
            }
        }
    }
    private void checkForFla(File file) throws IOException{
        if (file.isDirectory()){
            File[] childFiles=file.listFiles();
            for (int i=0; i < childFiles.length; i++){
                checkForFla(childFiles[i]);
            }
        }else{
            if (file.getName().toLowerCase().endsWith(".as")){
                asFiles.add(file.getName().toLowerCase());
            }else if (file.getName().toLowerCase().endsWith(".fla")){
                flaFiles.add(file.getName().toLowerCase());
            }
        }
    }
    
    /**Start generating the doc.*/
    private void generateDoc(File file) throws IOException, Exception{
        if (file.isDirectory()){
            File[] childFiles=file.listFiles();
            for (int i=0; i < childFiles.length; i++){
                generateDoc(childFiles[i]);
            }
        }else{
            if (file.getName().toLowerCase().endsWith(".as")){
                if (generateThisFile(file.getName())){
                    String newFileString=file.getName().substring(0,file.getName().length()-2)+"xml";
                    File newFile = new File(destDir,newFileString);
                    if (newFile.exists()){
                        System.out.println("File: "+newFile.getAbsolutePath()+" already exists. Skipping: "+file.getAbsolutePath());
                        return;
                    }
                    boolean success=parseAsFile2Doc(file,newFile);    
                    if (success){
                        succesFiles.add("<a href=\""+newFileString+"\">"+(file.getName().substring(0,file.getName().length()-3))+"</a>");                        
                    }
                }                
            }
        }
    }
    
    /**Parses the .as file to a doc file with destination dest*/
    private boolean parseAsFile2Doc(File source, File dest) throws IOException, Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter(dest));
        BufferedReader reader= new BufferedReader(new FileReader(source));
        Flamingodoc fd= new Flamingodoc();
        setMetadata(fd);
        String thisLine=null;
        while ((thisLine = reader.readLine()) != null) { 
            if (thisLine.indexOf("/**")==0){
                ArrayList commentRows = readCommentBlock(thisLine,reader);
                parseComment(commentRows,fd,reader);
            }
        }
        reader.close();
        boolean doDelete=false;
        if (fd.getComponent()!=null && fd.getComponent().getName()!=null){
            Marshaller m = new Marshaller(writer);
            m.addProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=\"mkcfgdoc.xsl\"");
            try {
                m.marshal(fd);
                //System.out.println("Done: "+source.getAbsolutePath());
            } catch (Exception ex) {
                System.out.println("Failed: "+source.getAbsolutePath());
                doDelete=true;
                ex.printStackTrace();                
            }
        }else{
            //System.out.println("Can't create xml: "+dest.getAbsolutePath()+" no @component found.");
            doDelete=true;
        }
        writer.close();
        if (doDelete){
            dest.delete();
            return false;
        }else{
            return true;
        }
    }
    
    /**Parse a found commented block*/
    private void parseComment(ArrayList rows, Flamingodoc fd, BufferedReader reader) throws IOException {
        boolean commentParsed=false;
        for (int i=0;i < rows.size() && !commentParsed; i++){
            String row=(String)rows.get(0);
            if (row.toLowerCase().indexOf(componentType)>0){
                addComponent(rows,fd);
                commentParsed=true;
            }else if (row.toLowerCase().indexOf(tagType)>0){
                addTag(rows,fd);
                commentParsed=true;
            }else{
                String functionDecl=reader.readLine();
                if (functionDecl.indexOf("{")>0){
                    functionDecl=functionDecl.substring(0,functionDecl.indexOf("{"));
                }
                functionDecl=functionDecl.trim();
                if (functionDecl.indexOf("function on") >=0 && functionDecl.indexOf("(")>0){
                    addEvent(rows,fd,functionDecl);
                    commentParsed=true;
                }else if (functionDecl.indexOf("function")>=0 && functionDecl.indexOf("(")>0){
                    addMethod(rows,fd,functionDecl);
                    commentParsed=true;
                }
                
            }
        }
    }
    /**Create the component object
     */
    private void addComponent(ArrayList rows,Flamingodoc fd){
        if (fd.getComponent()==null){
            fd.setComponent(new Component());
        }
        ArrayList list=getCommentOfObjects(rows, componentType,true);
        if (list.size()>0)
            fd.getComponent().setName((String) list.get(0));
        else
            fd.getComponent().setName("");
        String description = getDescription(rows);
        fd.getComponent().setDescription(description);
        list = getCommentOfObjects(rows,fileType,false);
        for (int f=0; f < list.size(); f++){
            fd.getComponent().addFile((String) list.get(f));
        }      
        list= getCommentOfObjects(rows,changeType,false);
        for (int c=0; c < list.size(); c++){
            fd.getComponent().addChange((String)list.get(c));
        }
        list = getCommentOfObjects(rows,versionType,false);
        if (list.size()>0){
            fd.getComponent().setVersion((String) list.get(0));
        }        
        list= getCommentOfObjects(rows,configstringType,false);
        for (int c=0; c < list.size(); c++){
            Configstring cs = new Configstring();
            String configstring= (String) list.get(c);
            configstring=configstring.trim();
            String name=configstring.split(" ")[0];
            String descr="";
            if (name.length()+1<configstring.length()){
                descr=configstring.substring(name.length()+1);
            }
            cs.setName(name);
            cs.setDescription(descr);
            if (fd.getComponent().getConfigstrings()==null){
                fd.getComponent().setConfigstrings(new Configstrings());
            }
            fd.getComponent().getConfigstrings().addConfigstring(cs);
        }
        list= getCommentOfObjects(rows,configstyleType,false);
        for (int c=0; c < list.size(); c++){
            Configstyle cs = new Configstyle();
            String configstyle= (String) list.get(c);
            configstyle=configstyle.trim();
            String name=configstyle.split(" ")[0];
            String descr="";
            if (name.length()+1<configstyle.length()){
                descr=configstyle.substring(name.length()+1);
            }
            cs.setName(name);
            cs.setDescription(descr);
            if (fd.getComponent().getConfigstyles()==null){
                fd.getComponent().setConfigstyles(new Configstyles());
            }
            fd.getComponent().getConfigstyles().addConfigstyle(cs);
        }    
        list= getCommentOfObjects(rows,configcursorType,false);
        for (int c=0; c < list.size(); c++){
            Configcursor cs = new Configcursor();
            String configcursor= (String) list.get(c);
            configcursor=configcursor.trim();
            String name=configcursor.split(" ")[0];
            String descr="";
            if (name.length()+1<configcursor.length()){
                descr=configcursor.substring(name.length()+1);
            }
            cs.setName(name);
            cs.setDescription(descr);
            if (fd.getComponent().getConfigcursors()==null){
                fd.getComponent().setConfigcursors(new Configcursors());
            }
            fd.getComponent().getConfigcursors().addConfigcursor(cs);
        }    
    }
    /**Adds a tag to the component.*/
    private void addTag(ArrayList rows, Flamingodoc fd) {
        Configtag tag= new Configtag();
        //get and set the name
        ArrayList foundList =getCommentOfObjects(rows,tagType,true);
        if (foundList.size()>0){
            tag.setName((String)foundList.get(0));
        }
        //get and set the attributes
        foundList = getCommentOfObjects(rows,attributeType,false);
        for (int i=0 ; i< foundList.size(); i ++){
            Attribute atr = new Attribute();
            String attribute = (String) foundList.get(i);
            attribute=attribute.trim();
            int indexOfIs=attribute.indexOf("=");
            int indexOfSpace=attribute.indexOf(" ");
            int splitIndex=indexOfSpace;
            if (indexOfIs >=0 && indexOfSpace > indexOfIs ){
                splitIndex=indexOfIs;
            }
            String name="";
            if (splitIndex==-1)
                name=attribute;
            else
                name=attribute.substring(0,splitIndex);
            String descr="";
            if (name.length()+1<attribute.length()){
                descr=attribute.substring(splitIndex+1);
            }
            atr.setName(name);
            atr.setDescription(descr);
            tag.addAttribute(atr);
        }
        //get and set the description
        tag.setDescription(getDescription(rows));
        //get and set the hierarchy
        foundList= getCommentOfObjects(rows,hierarchyType,false);
        if (foundList.size() > 0){
            tag.setHierarchy((String) foundList.get(0));
        }
        //get and set the examples
        foundList = getCommentOfObjects(rows,exampleType,false);
        for (int i=0; i < foundList.size(); i++){
            //TODO:
            tag.addExample((String)foundList.get(i));
        }        
        if (fd.getComponent()==null){
            fd.setComponent(new Component());
        }
        if (fd.getComponent().getConfigtags()==null){
            fd.getComponent().setConfigtags(new Configtags());
        }
        fd.getComponent().getConfigtags().addConfigtag(tag);
    }
    //** Add the method*/
    /**
     * Gets the holdonidentify setting.
     * @return Boolean True or false.
     *@param value:Boolean  True or false.
     */
    //public function getHoldOnIdentify(value:Boolean):Boolean {
    
    private void addMethod(ArrayList rows, Flamingodoc fd,String functionDecl) {
        Method method= new Method();
        method.setDescription(getDescription(rows));
        ArrayList list= getCommentOfObjects(rows,exampleType,false);
        for (int i=0 ; i < list.size(); i ++){
            method.addExample((String) list.get(i));
        }
        //get the method params
        list= getCommentOfObjects(rows,paramType,false);
        for (int i=0 ; i < list.size(); i ++){
            Parameter param=createParam((String)list.get(i));
            method.addParameter(param);
        }
        //get the returntype
        list =getCommentOfObjects(rows,returnType,false);
        if (list.size()>0){
            method.setReturn((String) list.get(0));
        }
        method.setName(getMethodName(functionDecl));
        method.setReturntype(getMethodReturnType(functionDecl));
        method.setUsage(functionDecl);
        int indexStart=functionDecl.indexOf(method.getName())+method.getName().length();
        method.setArguments(functionDecl.substring(indexStart));
        if(fd.getComponent()==null){
            fd.setComponent(new Component());
        }
        if(fd.getComponent().getMethods()==null){
            fd.getComponent().setMethods(new Methods());
        }
        fd.getComponent().getMethods().addMethod(method);
    }
    //** adds the event*/
    /**
     * Dispatched when a map is up and ready to run.
     * @param map:MovieClip a reference to the map.
     */
    //public function onInit(map:MovieClip):Void {
    //}
    private void addEvent(ArrayList rows, Flamingodoc fd,String functionDecl){
        Event event = new Event();
        event.setDescription(getDescription(rows));
        ArrayList list= getCommentOfObjects(rows,paramType,false);
        for (int i=0 ; i < list.size(); i ++){
            Parameter param=createParam((String)list.get(i));
            event.addParameter(param);
        }
        event.setName(getMethodName(functionDecl));
        event.setReturntype(getMethodReturnType(functionDecl));
        event.setUsage(functionDecl);
        int indexStart=functionDecl.indexOf(event.getName())+event.getName().length();
        event.setArguments(functionDecl.substring(indexStart));
        
        if(fd.getComponent().getEvents()==null){
            fd.getComponent().setEvents(new Events());
        }
        fd.getComponent().getEvents().addEvent(event);
    }
    private String getMethodName(String functionDecl){
        if (functionDecl.indexOf("function")>=0 && functionDecl.indexOf("(")>0){
            String name=functionDecl.substring(functionDecl.indexOf("function")+8,functionDecl.indexOf("("));
            return name.trim();
        }else{
            return "";
        }
    }
    private String getMethodReturnType(String functionDecl){
        int index1=functionDecl.indexOf(")");
        int index2=functionDecl.length();
        if (index1+2 < index2){
            index1+=2;        
            if (functionDecl.indexOf("{")>index1){
                index2=functionDecl.indexOf("{");
            }        
            String rt=functionDecl.substring(index1,index2);
            return rt.trim();
        }
        return "";
    }
    private Parameter createParam(String paramString){
        Parameter param = new Parameter();
        int firstSemicolumnIndex=paramString.indexOf(":");
        if (firstSemicolumnIndex>0){
            int indexEndType=paramString.length();
            if (paramString.indexOf(" ",firstSemicolumnIndex)>0){
                indexEndType=paramString.indexOf(" ",firstSemicolumnIndex);
            }
            param.setName(paramString.substring(0,firstSemicolumnIndex));
            param.setType(paramString.substring(firstSemicolumnIndex+1,indexEndType));
        }else{
            int indexNameEnd=paramString.indexOf(" ");
            if (indexNameEnd==-1)
                indexNameEnd=paramString.length();
            param.setName(paramString.substring(0,indexNameEnd));
        }
        if (paramString.indexOf(" ")<paramString.length() && paramString.indexOf(" ")>=0){
            param.setDescription(paramString.substring(paramString.indexOf(" "),paramString.length()).trim());
        }
        return param;
    }
    
    /**Get the comment of a object*/
    private ArrayList getCommentOfObjects(ArrayList rows,String commentType, boolean oneRow){
        ArrayList returnValue=new ArrayList();
        String currentComment=null;
        for (int i=0; i < rows.size(); i++){
            String row= (String)rows.get(i);
            row=row.trim();
            //3. already some comment found
            if (currentComment!=null){
                //5. if the next object is found then put the found comment in the arraylist
                if(row.indexOf("@")>=0){
                    returnValue.add(new String(currentComment).trim());
                    currentComment=null;
                }else{//4. add the new row to the already found comment.
                    if (row.length()>0)  
                        if(currentComment.length()>0)
                            currentComment+="\n";
                        if (row.indexOf("*")==0)
                            currentComment+=row.substring(1).trim();
                        else
                            currentComment+=row;
                }
            }
            //1. no comment found yet.
            if (currentComment==null){
                int typeIndex=row.toLowerCase().indexOf(commentType);
                //2. if > 0 then this is the comment we are looking for
                if (typeIndex>0){
                    currentComment="";
                    if (row.length()> typeIndex+commentType.length()){
                        currentComment=row.substring(typeIndex+commentType.length());
                        //returnValue.add(name.trim());
                    }
                    if (oneRow){
                        returnValue.add(new String(currentComment).trim());
                        currentComment=null;
                    }
                }
            }            
        }
        if (currentComment!=null){
            returnValue.add(new String(currentComment).trim());
        }
        return returnValue;
    }
    /**Get the descriptoin of a object.
     */
    private String getDescription(ArrayList rows){
        String description="";
        for (int i=0; i < rows.size(); i++) {
            String row=(String)rows.get(i);
            row=row.trim();
            if (row.indexOf("/**")>=0){
            }else if (row.indexOf("@")>=0 || row.indexOf("*/") >= 0){
                return description;
            }else{
                if(description.length()>0)
                    description+="\n";
                if(row.indexOf("*")==0){
                    description+=row.substring(1).trim();
                } else{
                    description+=row.trim();
                }
                
            }
        }
        return description;
    }
    
    
    private void setMetadata(Flamingodoc fd) {
        fd.setTitle("Flamingo Component Reference");
        fd.setGenerated(new Date().toString());
    }
    
    /**Reades the comment block to a ArrayList of strings (rows)*/
    private ArrayList readCommentBlock(String thisLine,BufferedReader reader) throws IOException, Exception{
        ArrayList<String> block = new ArrayList<String>();
        try{
            thisLine=thisLine.trim();
            if (!thisLine.endsWith("/**"))
                block.add(new String(thisLine));
            if (!thisLine.endsWith("*/")){
                while ((thisLine = reader.readLine()).indexOf("*/") < 0) {
                    block.add(new String(thisLine));
                }
            }
        }catch(Exception e){
            String sBlock="";
            for (String s : block){
                sBlock+="\n"+s;
            }
            System.out.print("Error while reading block: "+sBlock);
            throw e;
        }
        return block;
    }
    
    public File getSourceDir() {
        return sourceDir;
    }
    
    public void setSourceDir(File sourceDir) {
        this.sourceDir = sourceDir;
    }
    
    public File getDestDir() {
        return destDir;
    }
    
    public void setDestDir(File destDir) {
        this.destDir = destDir;
    }
    public void setFlaExists(boolean flaExists){
        this.flaExists=flaExists;
    }
    public boolean getFlaExists(){
        return flaExists;
    }

    private boolean generateThisFile(String fileName) {
        if(!getFlaExists())
            return true;
        for (int i=0;i <filesToGenerate.size(); i ++){
            String f = (String) filesToGenerate.get(i);
            if(f.equalsIgnoreCase(fileName)){
                return true;
            }
        }
        return false;
    }

    
    
}
