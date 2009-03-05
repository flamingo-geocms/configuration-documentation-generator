/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.2</a>, using an XML
 * Schema.
 * $Id$
 */

package nl.fmc.configuration.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class TypeType.
 * 
 * @version $Revision$ $Date$
 */
public class TypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ? type
     */
    public static final int __TYPE = 0;

    /**
     * The instance of the ? type
     */
    public static final TypeType _ = new TypeType(__TYPE, "?");

    /**
     * The Boolean type
     */
    public static final int BOOLEAN_TYPE = 1;

    /**
     * The instance of the Boolean type
     */
    public static final TypeType BOOLEAN = new TypeType(BOOLEAN_TYPE, "Boolean");

    /**
     * The MovieCli type
     */
    public static final int MOVIECLI_TYPE = 2;

    /**
     * The instance of the MovieCli type
     */
    public static final TypeType MOVIECLI = new TypeType(MOVIECLI_TYPE, "MovieCli");

    /**
     * The Movieclip type
     */
    public static final int MOVIECLIP_TYPE = 4;

    /**
     * The instance of the Movieclip type
     */
    public static final TypeType MOVIECLIP = new TypeType(MOVIECLIP_TYPE, "Movieclip");

    /**
     * The Number type
     */
    public static final int NUMBER_TYPE = 5;

    /**
     * The instance of the Number type
     */
    public static final TypeType NUMBER = new TypeType(NUMBER_TYPE, "Number");

    /**
     * The Object type
     */
    public static final int OBJECT_TYPE = 6;

    /**
     * The instance of the Object type
     */
    public static final TypeType OBJECT = new TypeType(OBJECT_TYPE, "Object");

    /**
     * The String type
     */
    public static final int STRING_TYPE = 7;

    /**
     * The instance of the String type
     */
    public static final TypeType STRING = new TypeType(STRING_TYPE, "String");

    /**
     * The XML type
     */
    public static final int XML_TYPE = 8;

    /**
     * The instance of the XML type
     */
    public static final TypeType XML = new TypeType(XML_TYPE, "XML");

    /**
     * Field _memberTable
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type
     */
    private int type = -1;

    /**
     * Field stringValue
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private TypeType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- nl.fmc.configuration.types.TypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of TypeType
     * 
     * @return Enumeration
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getType
     * 
     * Returns the type of this TypeType
     * 
     * @return int
     */
    public int getType()
    {
        return this.type;
    } //-- int getType() 

    /**
     * Method init
     * 
     * 
     * 
     * @return Hashtable
     */
    private static java.util.Hashtable init()
    {
        Hashtable members = new Hashtable();
        members.put("?", _);
        members.put("Boolean", BOOLEAN);
        members.put("MovieCli", MOVIECLI);
        members.put("MovieClip", MOVIECLIP);
        members.put("Number", NUMBER);
        members.put("Object", OBJECT);
        members.put("String", STRING);
        members.put("XML", XML);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method readResolve
     * 
     *  will be called during deserialization to replace the
     * deserialized object with the correct constant instance.
     * <br/>
     * 
     * @return Object
     */
    private java.lang.Object readResolve()
    {
        return valueOf(this.stringValue);
    } //-- java.lang.Object readResolve() 

    /**
     * Method toString
     * 
     * Returns the String representation of this TypeType
     * 
     * @return String
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOf
     * 
     * Returns a new TypeType based on the given String value.
     * 
     * @param string
     * @return TypeType
     */
    public static nl.fmc.configuration.types.TypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid TypeType";
            throw new IllegalArgumentException(err);
        }
        return (TypeType) obj;
    } //-- nl.fmc.configuration.types.TypeType valueOf(java.lang.String) 

}
