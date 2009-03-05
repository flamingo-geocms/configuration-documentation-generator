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
 * Class ReturntypeType.
 * 
 * @version $Revision$ $Date$
 */
public class ReturntypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The Array  type
     */
    public static final int ARRAY__TYPE = 0;

    /**
     * The instance of the Array  type
     */
    public static final ReturntypeType ARRAY_ = new ReturntypeType(ARRAY__TYPE, "Array ");

    /**
     * The Boolean  type
     */
    public static final int BOOLEAN__TYPE = 1;

    /**
     * The instance of the Boolean  type
     */
    public static final ReturntypeType BOOLEAN_ = new ReturntypeType(BOOLEAN__TYPE, "Boolean ");

    /**
     * The MovieClip  type
     */
    public static final int MOVIECLIP__TYPE = 2;

    /**
     * The instance of the MovieClip  type
     */
    public static final ReturntypeType MOVIECLIP_ = new ReturntypeType(MOVIECLIP__TYPE, "MovieClip ");

    /**
     * The Object  type
     */
    public static final int OBJECT__TYPE = 3;

    /**
     * The instance of the Object  type
     */
    public static final ReturntypeType OBJECT_ = new ReturntypeType(OBJECT__TYPE, "Object ");

    /**
     * The String  type
     */
    public static final int STRING__TYPE = 4;

    /**
     * The instance of the String  type
     */
    public static final ReturntypeType STRING_ = new ReturntypeType(STRING__TYPE, "String ");

    /**
     * The Void  type
     */
    public static final int VOID__TYPE = 5;

    /**
     * The instance of the Void  type
     */
    public static final ReturntypeType VOID_ = new ReturntypeType(VOID__TYPE, "Void ");

    /**
     * The XML  type
     */
    public static final int XML__TYPE = 6;

    /**
     * The instance of the XML  type
     */
    public static final ReturntypeType XML_ = new ReturntypeType(XML__TYPE, "XML ");

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

    private ReturntypeType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- nl.fmc.configuration.types.ReturntypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of
     * ReturntypeType
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
     * Returns the type of this ReturntypeType
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
        members.put("Array ", ARRAY_);
        members.put("Boolean ", BOOLEAN_);
        members.put("MovieClip ", MOVIECLIP_);
        members.put("Object ", OBJECT_);
        members.put("String ", STRING_);
        members.put("Void ", VOID_);
        members.put("XML ", XML_);
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
     * Returns the String representation of this ReturntypeType
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
     * Returns a new ReturntypeType based on the given String
     * value.
     * 
     * @param string
     * @return ReturntypeType
     */
    public static nl.fmc.configuration.types.ReturntypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ReturntypeType";
            throw new IllegalArgumentException(err);
        }
        return (ReturntypeType) obj;
    } //-- nl.fmc.configuration.types.ReturntypeType valueOf(java.lang.String) 

}
