/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0.2</a>, using an XML
 * Schema.
 * $Id$
 */

package nl.fmc.configuration;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Collections;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Configcursors.
 * 
 * @version $Revision$ $Date$
 */
public class Configcursors implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _configcursorList
     */
    private java.util.ArrayList _configcursorList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Configcursors() 
     {
        super();
        _configcursorList = new java.util.ArrayList();
    } //-- nl.fmc.configuration.Configcursors()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConfigcursor
     * 
     * 
     * 
     * @param vConfigcursor
     */
    public void addConfigcursor(nl.fmc.configuration.Configcursor vConfigcursor)
        throws java.lang.IndexOutOfBoundsException
    {
        _configcursorList.add(vConfigcursor);
    } //-- void addConfigcursor(nl.fmc.configuration.Configcursor) 

    /**
     * Method addConfigcursor
     * 
     * 
     * 
     * @param index
     * @param vConfigcursor
     */
    public void addConfigcursor(int index, nl.fmc.configuration.Configcursor vConfigcursor)
        throws java.lang.IndexOutOfBoundsException
    {
        _configcursorList.add(index, vConfigcursor);
    } //-- void addConfigcursor(int, nl.fmc.configuration.Configcursor) 

    /**
     * Method clearConfigcursor
     * 
     */
    public void clearConfigcursor()
    {
        _configcursorList.clear();
    } //-- void clearConfigcursor() 

    /**
     * Method enumerateConfigcursor
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateConfigcursor()
    {
        return Collections.enumeration(_configcursorList);
    } //-- java.util.Enumeration enumerateConfigcursor() 

    /**
     * Method getConfigcursor
     * 
     * 
     * 
     * @param index
     * @return Configcursor
     */
    public nl.fmc.configuration.Configcursor getConfigcursor(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _configcursorList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (nl.fmc.configuration.Configcursor) _configcursorList.get(index);
    } //-- nl.fmc.configuration.Configcursor getConfigcursor(int) 

    /**
     * Method getConfigcursor
     * 
     * 
     * 
     * @return Configcursor
     */
    public nl.fmc.configuration.Configcursor[] getConfigcursor()
    {
        int size = _configcursorList.size();
        nl.fmc.configuration.Configcursor[] mArray = new nl.fmc.configuration.Configcursor[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (nl.fmc.configuration.Configcursor) _configcursorList.get(index);
        }
        return mArray;
    } //-- nl.fmc.configuration.Configcursor[] getConfigcursor() 

    /**
     * Method getConfigcursorCount
     * 
     * 
     * 
     * @return int
     */
    public int getConfigcursorCount()
    {
        return _configcursorList.size();
    } //-- int getConfigcursorCount() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeConfigcursor
     * 
     * 
     * 
     * @param vConfigcursor
     * @return boolean
     */
    public boolean removeConfigcursor(nl.fmc.configuration.Configcursor vConfigcursor)
    {
        boolean removed = _configcursorList.remove(vConfigcursor);
        return removed;
    } //-- boolean removeConfigcursor(nl.fmc.configuration.Configcursor) 

    /**
     * Method setConfigcursor
     * 
     * 
     * 
     * @param index
     * @param vConfigcursor
     */
    public void setConfigcursor(int index, nl.fmc.configuration.Configcursor vConfigcursor)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _configcursorList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _configcursorList.set(index, vConfigcursor);
    } //-- void setConfigcursor(int, nl.fmc.configuration.Configcursor) 

    /**
     * Method setConfigcursor
     * 
     * 
     * 
     * @param configcursorArray
     */
    public void setConfigcursor(nl.fmc.configuration.Configcursor[] configcursorArray)
    {
        //-- copy array
        _configcursorList.clear();
        for (int i = 0; i < configcursorArray.length; i++) {
            _configcursorList.add(configcursorArray[i]);
        }
    } //-- void setConfigcursor(nl.fmc.configuration.Configcursor) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Configcursors
     */
    public static nl.fmc.configuration.Configcursors unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (nl.fmc.configuration.Configcursors) Unmarshaller.unmarshal(nl.fmc.configuration.Configcursors.class, reader);
    } //-- nl.fmc.configuration.Configcursors unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
