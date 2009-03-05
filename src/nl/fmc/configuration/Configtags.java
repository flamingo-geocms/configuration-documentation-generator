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
 * Class Configtags.
 * 
 * @version $Revision$ $Date$
 */
public class Configtags implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _configtagList
     */
    private java.util.ArrayList _configtagList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Configtags() 
     {
        super();
        _configtagList = new java.util.ArrayList();
    } //-- nl.fmc.configuration.Configtags()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addConfigtag
     * 
     * 
     * 
     * @param vConfigtag
     */
    public void addConfigtag(nl.fmc.configuration.Configtag vConfigtag)
        throws java.lang.IndexOutOfBoundsException
    {
        _configtagList.add(vConfigtag);
    } //-- void addConfigtag(nl.fmc.configuration.Configtag) 

    /**
     * Method addConfigtag
     * 
     * 
     * 
     * @param index
     * @param vConfigtag
     */
    public void addConfigtag(int index, nl.fmc.configuration.Configtag vConfigtag)
        throws java.lang.IndexOutOfBoundsException
    {
        _configtagList.add(index, vConfigtag);
    } //-- void addConfigtag(int, nl.fmc.configuration.Configtag) 

    /**
     * Method clearConfigtag
     * 
     */
    public void clearConfigtag()
    {
        _configtagList.clear();
    } //-- void clearConfigtag() 

    /**
     * Method enumerateConfigtag
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateConfigtag()
    {
        return Collections.enumeration(_configtagList);
    } //-- java.util.Enumeration enumerateConfigtag() 

    /**
     * Method getConfigtag
     * 
     * 
     * 
     * @param index
     * @return Configtag
     */
    public nl.fmc.configuration.Configtag getConfigtag(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _configtagList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (nl.fmc.configuration.Configtag) _configtagList.get(index);
    } //-- nl.fmc.configuration.Configtag getConfigtag(int) 

    /**
     * Method getConfigtag
     * 
     * 
     * 
     * @return Configtag
     */
    public nl.fmc.configuration.Configtag[] getConfigtag()
    {
        int size = _configtagList.size();
        nl.fmc.configuration.Configtag[] mArray = new nl.fmc.configuration.Configtag[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (nl.fmc.configuration.Configtag) _configtagList.get(index);
        }
        return mArray;
    } //-- nl.fmc.configuration.Configtag[] getConfigtag() 

    /**
     * Method getConfigtagCount
     * 
     * 
     * 
     * @return int
     */
    public int getConfigtagCount()
    {
        return _configtagList.size();
    } //-- int getConfigtagCount() 

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
     * Method removeConfigtag
     * 
     * 
     * 
     * @param vConfigtag
     * @return boolean
     */
    public boolean removeConfigtag(nl.fmc.configuration.Configtag vConfigtag)
    {
        boolean removed = _configtagList.remove(vConfigtag);
        return removed;
    } //-- boolean removeConfigtag(nl.fmc.configuration.Configtag) 

    /**
     * Method setConfigtag
     * 
     * 
     * 
     * @param index
     * @param vConfigtag
     */
    public void setConfigtag(int index, nl.fmc.configuration.Configtag vConfigtag)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _configtagList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _configtagList.set(index, vConfigtag);
    } //-- void setConfigtag(int, nl.fmc.configuration.Configtag) 

    /**
     * Method setConfigtag
     * 
     * 
     * 
     * @param configtagArray
     */
    public void setConfigtag(nl.fmc.configuration.Configtag[] configtagArray)
    {
        //-- copy array
        _configtagList.clear();
        for (int i = 0; i < configtagArray.length; i++) {
            _configtagList.add(configtagArray[i]);
        }
    } //-- void setConfigtag(nl.fmc.configuration.Configtag) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Configtags
     */
    public static nl.fmc.configuration.Configtags unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (nl.fmc.configuration.Configtags) Unmarshaller.unmarshal(nl.fmc.configuration.Configtags.class, reader);
    } //-- nl.fmc.configuration.Configtags unmarshal(java.io.Reader) 

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
