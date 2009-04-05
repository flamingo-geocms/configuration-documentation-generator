/*
 * Main.java
 *
 * Created on 12 februari 2009, 22:37
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package cdg;

import java.io.File;

/**
 *
 * @author Roy
 */
public class Main {
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            File sourceDir= new File("I:/dev/flamingoOfficialCore/fmc");
            File destDir= new File("C:/temp/dest");     
            boolean onlyWithFla=true;
            if (args.length>1){
                sourceDir = new File(args[0]);
                destDir= new File(args[1]);
                if (args.length >=3){
                   for (int i=2; i < args.length; i++){
                        if (args[i].equalsIgnoreCase("-f")){
                            onlyWithFla=false;
                        }
                   }                       
                }
            }            
            AsConfigDocParser acdp = new AsConfigDocParser(sourceDir,destDir,true);
            acdp.generateDoc();
        }catch(Exception e){
            e.printStackTrace();
        }
    }    
}
