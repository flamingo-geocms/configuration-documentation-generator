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
 * Class Configstrings.
 * 
 * @version $Revision$ $Date$
 */
public class Configstrings implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _configstringList
     */
    private java.util.ArrayList _configstringList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Configstrings() 
     {
        super();
        _configstringList = new java.util.ArrayList();
    } //-- nl.fmc.configuration.Configstrings()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConfigstring
     * 
     * 
     * 
     * @param vConfigstring
     */
    public void addConfigstring(nl.fmc.configuration.Configstring vConfigstring)
        throws java.lang.IndexOutOfBoundsException
    {
        _configstringList.add(vConfigstring);
    } //-- void addConfigstring(nl.fmc.configuration.Configstring) 

    /**
     * Method addConfigstring
     * 
     * 
     * 
     * @param index
     * @param vConfigstring
     */
    public void addConfigstring(int index, nl.fmc.configuration.Configstring vConfigstring)
        throws java.lang.IndexOutOfBoundsException
    {
        _configstringList.add(index, vConfigstring);
    } //-- void addConfigstring(int, nl.fmc.configuration.Configstring) 

    /**
     * Method clearConfigstring
     * 
     */
    public void clearConfigstring()
    {
        _configstringList.clear();
    } //-- void clearConfigstring() 

    /**
     * Method enumerateConfigstring
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateConfigstring()
    {
        return Collections.enumeration(_configstringList);
    } //-- java.util.Enumeration enumerateConfigstring() 

    /**
     * Method getConfigstring
     * 
     * 
     * 
     * @param index
     * @return Configstring
     */
    public nl.fmc.configuration.Configstring getConfigstring(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _configstringList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (nl.fmc.configuration.Configstring) _configstringList.get(index);
    } //-- nl.fmc.configuration.Configstring getConfigstring(int) 

    /**
     * Method getConfigstring
     * 
     * 
     * 
     * @return Configstring
     */
    public nl.fmc.configuration.Configstring[] getConfigstring()
    {
        int size = _configstringList.size();
        nl.fmc.configuration.Configstring[] mArray = new nl.fmc.configuration.Configstring[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (nl.fmc.configuration.Configstring) _configstringList.get(index);
        }
        return mArray;
    } //-- nl.fmc.configuration.Configstring[] getConfigstring() 

    /**
     * Method getConfigstringCount
     * 
     * 
     * 
     * @return int
     */
    public int getConfigstringCount()
    {
        return _configstringList.size();
    } //-- int getConfigstringCount() 

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
     * Method removeConfigstring
     * 
     * 
     * 
     * @param vConfigstring
     * @return boolean
     */
    public boolean removeConfigstring(nl.fmc.configuration.Configstring vConfigstring)
    {
        boolean removed = _configstringList.remove(vConfigstring);
        return removed;
    } //-- boolean removeConfigstring(nl.fmc.configuration.Configstring) 

    /**
     * Method setConfigstring
     * 
     * 
     * 
     * @param index
     * @param vConfigstring
     */
    public void setConfigstring(int index, nl.fmc.configuration.Configstring vConfigstring)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _configstringList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _configstringList.set(index, vConfigstring);
    } //-- void setConfigstring(int, nl.fmc.configuration.Configstring) 

    /**
     * Method setConfigstring
     * 
     * 
     * 
     * @param configstringArray
     */
    public void setConfigstring(nl.fmc.configuration.Configstring[] configstringArray)
    {
        //-- copy array
        _configstringList.clear();
        for (int i = 0; i < configstringArray.length; i++) {
            _configstringList.add(configstringArray[i]);
        }
    } //-- void setConfigstring(nl.fmc.configuration.Configstring) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Configstrings
     */
    public static nl.fmc.configuration.Configstrings unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (nl.fmc.configuration.Configstrings) Unmarshaller.unmarshal(nl.fmc.configuration.Configstrings.class, reader);
    } //-- nl.fmc.configuration.Configstrings unmarshal(java.io.Reader) 

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
