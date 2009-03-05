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
 * Class SeeType.
 * 
 * @version $Revision$ $Date$
 */
public class SeeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The addListener type
     */
    public static final int ADDLISTENER_TYPE = 0;

    /**
     * The instance of the addListener type
     */
    public static final SeeType ADDLISTENER = new SeeType(ADDLISTENER_TYPE, "addListener");

    /**
     * The getPosition type
     */
    public static final int GETPOSITION_TYPE = 1;

    /**
     * The instance of the getPosition type
     */
    public static final SeeType GETPOSITION = new SeeType(GETPOSITION_TYPE, "getPosition");

    /**
     * The removeListener type
     */
    public static final int REMOVELISTENER_TYPE = 2;

    /**
     * The instance of the removeListener type
     */
    public static final SeeType REMOVELISTENER = new SeeType(REMOVELISTENER_TYPE, "removeListener");

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

    private SeeType(int type, java.lang.String value) 
     {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- nl.fmc.configuration.types.SeeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate
     * 
     * Returns an enumeration of all possible instances of SeeType
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
     * Returns the type of this SeeType
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
        members.put("addListener", ADDLISTENER);
        members.put("getPosition", GETPOSITION);
        members.put("removeListener", REMOVELISTENER);
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
     * Returns the String representation of this SeeType
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
     * Returns a new SeeType based on the given String value.
     * 
     * @param string
     * @return SeeType
     */
    public static nl.fmc.configuration.types.SeeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid SeeType";
            throw new IllegalArgumentException(err);
        }
        return (SeeType) obj;
    } //-- nl.fmc.configuration.types.SeeType valueOf(java.lang.String) 

}
