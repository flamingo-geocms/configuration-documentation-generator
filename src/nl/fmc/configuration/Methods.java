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
 * Class Methods.
 * 
 * @version $Revision$ $Date$
 */
public class Methods implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _methodList
     */
    private java.util.ArrayList _methodList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Methods() 
     {
        super();
        _methodList = new java.util.ArrayList();
    } //-- nl.fmc.configuration.Methods()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMethod
     * 
     * 
     * 
     * @param vMethod
     */
    public void addMethod(nl.fmc.configuration.Method vMethod)
        throws java.lang.IndexOutOfBoundsException
    {
        _methodList.add(vMethod);
    } //-- void addMethod(nl.fmc.configuration.Method) 

    /**
     * Method addMethod
     * 
     * 
     * 
     * @param index
     * @param vMethod
     */
    public void addMethod(int index, nl.fmc.configuration.Method vMethod)
        throws java.lang.IndexOutOfBoundsException
    {
        _methodList.add(index, vMethod);
    } //-- void addMethod(int, nl.fmc.configuration.Method) 

    /**
     * Method clearMethod
     * 
     */
    public void clearMethod()
    {
        _methodList.clear();
    } //-- void clearMethod() 

    /**
     * Method enumerateMethod
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateMethod()
    {
        return Collections.enumeration(_methodList);
    } //-- java.util.Enumeration enumerateMethod() 

    /**
     * Method getMethod
     * 
     * 
     * 
     * @param index
     * @return Method
     */
    public nl.fmc.configuration.Method getMethod(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _methodList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (nl.fmc.configuration.Method) _methodList.get(index);
    } //-- nl.fmc.configuration.Method getMethod(int) 

    /**
     * Method getMethod
     * 
     * 
     * 
     * @return Method
     */
    public nl.fmc.configuration.Method[] getMethod()
    {
        int size = _methodList.size();
        nl.fmc.configuration.Method[] mArray = new nl.fmc.configuration.Method[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (nl.fmc.configuration.Method) _methodList.get(index);
        }
        return mArray;
    } //-- nl.fmc.configuration.Method[] getMethod() 

    /**
     * Method getMethodCount
     * 
     * 
     * 
     * @return int
     */
    public int getMethodCount()
    {
        return _methodList.size();
    } //-- int getMethodCount() 

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
     * Method removeMethod
     * 
     * 
     * 
     * @param vMethod
     * @return boolean
     */
    public boolean removeMethod(nl.fmc.configuration.Method vMethod)
    {
        boolean removed = _methodList.remove(vMethod);
        return removed;
    } //-- boolean removeMethod(nl.fmc.configuration.Method) 

    /**
     * Method setMethod
     * 
     * 
     * 
     * @param index
     * @param vMethod
     */
    public void setMethod(int index, nl.fmc.configuration.Method vMethod)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _methodList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _methodList.set(index, vMethod);
    } //-- void setMethod(int, nl.fmc.configuration.Method) 

    /**
     * Method setMethod
     * 
     * 
     * 
     * @param methodArray
     */
    public void setMethod(nl.fmc.configuration.Method[] methodArray)
    {
        //-- copy array
        _methodList.clear();
        for (int i = 0; i < methodArray.length; i++) {
            _methodList.add(methodArray[i]);
        }
    } //-- void setMethod(nl.fmc.configuration.Method) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Methods
     */
    public static nl.fmc.configuration.Methods unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (nl.fmc.configuration.Methods) Unmarshaller.unmarshal(nl.fmc.configuration.Methods.class, reader);
    } //-- nl.fmc.configuration.Methods unmarshal(java.io.Reader) 

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
