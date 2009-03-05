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
 * Class Configstyles.
 * 
 * @version $Revision$ $Date$
 */
public class Configstyles implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _configstyleList
     */
    private java.util.ArrayList _configstyleList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Configstyles() 
     {
        super();
        _configstyleList = new java.util.ArrayList();
    } //-- nl.fmc.configuration.Configstyles()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConfigstyle
     * 
     * 
     * 
     * @param vConfigstyle
     */
    public void addConfigstyle(nl.fmc.configuration.Configstyle vConfigstyle)
        throws java.lang.IndexOutOfBoundsException
    {
        _configstyleList.add(vConfigstyle);
    } //-- void addConfigstyle(nl.fmc.configuration.Configstyle) 

    /**
     * Method addConfigstyle
     * 
     * 
     * 
     * @param index
     * @param vConfigstyle
     */
    public void addConfigstyle(int index, nl.fmc.configuration.Configstyle vConfigstyle)
        throws java.lang.IndexOutOfBoundsException
    {
        _configstyleList.add(index, vConfigstyle);
    } //-- void addConfigstyle(int, nl.fmc.configuration.Configstyle) 

    /**
     * Method clearConfigstyle
     * 
     */
    public void clearConfigstyle()
    {
        _configstyleList.clear();
    } //-- void clearConfigstyle() 

    /**
     * Method enumerateConfigstyle
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateConfigstyle()
    {
        return Collections.enumeration(_configstyleList);
    } //-- java.util.Enumeration enumerateConfigstyle() 

    /**
     * Method getConfigstyle
     * 
     * 
     * 
     * @param index
     * @return Configstyle
     */
    public nl.fmc.configuration.Configstyle getConfigstyle(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _configstyleList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (nl.fmc.configuration.Configstyle) _configstyleList.get(index);
    } //-- nl.fmc.configuration.Configstyle getConfigstyle(int) 

    /**
     * Method getConfigstyle
     * 
     * 
     * 
     * @return Configstyle
     */
    public nl.fmc.configuration.Configstyle[] getConfigstyle()
    {
        int size = _configstyleList.size();
        nl.fmc.configuration.Configstyle[] mArray = new nl.fmc.configuration.Configstyle[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (nl.fmc.configuration.Configstyle) _configstyleList.get(index);
        }
        return mArray;
    } //-- nl.fmc.configuration.Configstyle[] getConfigstyle() 

    /**
     * Method getConfigstyleCount
     * 
     * 
     * 
     * @return int
     */
    public int getConfigstyleCount()
    {
        return _configstyleList.size();
    } //-- int getConfigstyleCount() 

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
     * Method removeConfigstyle
     * 
     * 
     * 
     * @param vConfigstyle
     * @return boolean
     */
    public boolean removeConfigstyle(nl.fmc.configuration.Configstyle vConfigstyle)
    {
        boolean removed = _configstyleList.remove(vConfigstyle);
        return removed;
    } //-- boolean removeConfigstyle(nl.fmc.configuration.Configstyle) 

    /**
     * Method setConfigstyle
     * 
     * 
     * 
     * @param index
     * @param vConfigstyle
     */
    public void setConfigstyle(int index, nl.fmc.configuration.Configstyle vConfigstyle)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _configstyleList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _configstyleList.set(index, vConfigstyle);
    } //-- void setConfigstyle(int, nl.fmc.configuration.Configstyle) 

    /**
     * Method setConfigstyle
     * 
     * 
     * 
     * @param configstyleArray
     */
    public void setConfigstyle(nl.fmc.configuration.Configstyle[] configstyleArray)
    {
        //-- copy array
        _configstyleList.clear();
        for (int i = 0; i < configstyleArray.length; i++) {
            _configstyleList.add(configstyleArray[i]);
        }
    } //-- void setConfigstyle(nl.fmc.configuration.Configstyle) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Configstyles
     */
    public static nl.fmc.configuration.Configstyles unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (nl.fmc.configuration.Configstyles) Unmarshaller.unmarshal(nl.fmc.configuration.Configstyles.class, reader);
    } //-- nl.fmc.configuration.Configstyles unmarshal(java.io.Reader) 

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
