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
 * Class Configtag.
 * 
 * @version $Revision$ $Date$
 */
public class Configtag implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _attributeList
     */
    private java.util.ArrayList _attributeList;

    /**
     * Field _description
     */
    private java.lang.String _description;

    /**
     * Field _hierarchy
     */
    private java.lang.String _hierarchy;

    /**
     * Field _exampleList
     */
    private java.util.ArrayList _exampleList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Configtag() 
     {
        super();
        _attributeList = new java.util.ArrayList();
        _exampleList = new java.util.ArrayList();
    } //-- nl.fmc.configuration.Configtag()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addAttribute
     * 
     * 
     * 
     * @param vAttribute
     */
    public void addAttribute(nl.fmc.configuration.Attribute vAttribute)
        throws java.lang.IndexOutOfBoundsException
    {
        _attributeList.add(vAttribute);
    } //-- void addAttribute(nl.fmc.configuration.Attribute) 

    /**
     * Method addAttribute
     * 
     * 
     * 
     * @param index
     * @param vAttribute
     */
    public void addAttribute(int index, nl.fmc.configuration.Attribute vAttribute)
        throws java.lang.IndexOutOfBoundsException
    {
        _attributeList.add(index, vAttribute);
    } //-- void addAttribute(int, nl.fmc.configuration.Attribute) 

    /**
     * Method addExample
     * 
     * 
     * 
     * @param vExample
     */
    public void addExample(java.lang.String vExample)
        throws java.lang.IndexOutOfBoundsException
    {
        _exampleList.add(vExample);
    } //-- void addExample(java.lang.String) 

    /**
     * Method addExample
     * 
     * 
     * 
     * @param index
     * @param vExample
     */
    public void addExample(int index, java.lang.String vExample)
        throws java.lang.IndexOutOfBoundsException
    {
        _exampleList.add(index, vExample);
    } //-- void addExample(int, java.lang.String) 

    /**
     * Method clearAttribute
     * 
     */
    public void clearAttribute()
    {
        _attributeList.clear();
    } //-- void clearAttribute() 

    /**
     * Method clearExample
     * 
     */
    public void clearExample()
    {
        _exampleList.clear();
    } //-- void clearExample() 

    /**
     * Method enumerateAttribute
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateAttribute()
    {
        return Collections.enumeration(_attributeList);
    } //-- java.util.Enumeration enumerateAttribute() 

    /**
     * Method enumerateExample
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateExample()
    {
        return Collections.enumeration(_exampleList);
    } //-- java.util.Enumeration enumerateExample() 

    /**
     * Method getAttribute
     * 
     * 
     * 
     * @param index
     * @return Attribute
     */
    public nl.fmc.configuration.Attribute getAttribute(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _attributeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (nl.fmc.configuration.Attribute) _attributeList.get(index);
    } //-- nl.fmc.configuration.Attribute getAttribute(int) 

    /**
     * Method getAttribute
     * 
     * 
     * 
     * @return Attribute
     */
    public nl.fmc.configuration.Attribute[] getAttribute()
    {
        int size = _attributeList.size();
        nl.fmc.configuration.Attribute[] mArray = new nl.fmc.configuration.Attribute[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (nl.fmc.configuration.Attribute) _attributeList.get(index);
        }
        return mArray;
    } //-- nl.fmc.configuration.Attribute[] getAttribute() 

    /**
     * Method getAttributeCount
     * 
     * 
     * 
     * @return int
     */
    public int getAttributeCount()
    {
        return _attributeList.size();
    } //-- int getAttributeCount() 

    /**
     * Returns the value of field 'description'.
     * 
     * @return String
     * @return the value of field 'description'.
     */
    public java.lang.String getDescription()
    {
        return this._description;
    } //-- java.lang.String getDescription() 

    /**
     * Method getExample
     * 
     * 
     * 
     * @param index
     * @return String
     */
    public java.lang.String getExample(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _exampleList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_exampleList.get(index);
    } //-- java.lang.String getExample(int) 

    /**
     * Method getExample
     * 
     * 
     * 
     * @return String
     */
    public java.lang.String[] getExample()
    {
        int size = _exampleList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_exampleList.get(index);
        }
        return mArray;
    } //-- java.lang.String[] getExample() 

    /**
     * Method getExampleCount
     * 
     * 
     * 
     * @return int
     */
    public int getExampleCount()
    {
        return _exampleList.size();
    } //-- int getExampleCount() 

    /**
     * Returns the value of field 'hierarchy'.
     * 
     * @return String
     * @return the value of field 'hierarchy'.
     */
    public java.lang.String getHierarchy()
    {
        return this._hierarchy;
    } //-- java.lang.String getHierarchy() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return String
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

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
     * Method removeAttribute
     * 
     * 
     * 
     * @param vAttribute
     * @return boolean
     */
    public boolean removeAttribute(nl.fmc.configuration.Attribute vAttribute)
    {
        boolean removed = _attributeList.remove(vAttribute);
        return removed;
    } //-- boolean removeAttribute(nl.fmc.configuration.Attribute) 

    /**
     * Method removeExample
     * 
     * 
     * 
     * @param vExample
     * @return boolean
     */
    public boolean removeExample(java.lang.String vExample)
    {
        boolean removed = _exampleList.remove(vExample);
        return removed;
    } //-- boolean removeExample(java.lang.String) 

    /**
     * Method setAttribute
     * 
     * 
     * 
     * @param index
     * @param vAttribute
     */
    public void setAttribute(int index, nl.fmc.configuration.Attribute vAttribute)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _attributeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _attributeList.set(index, vAttribute);
    } //-- void setAttribute(int, nl.fmc.configuration.Attribute) 

    /**
     * Method setAttribute
     * 
     * 
     * 
     * @param attributeArray
     */
    public void setAttribute(nl.fmc.configuration.Attribute[] attributeArray)
    {
        //-- copy array
        _attributeList.clear();
        for (int i = 0; i < attributeArray.length; i++) {
            _attributeList.add(attributeArray[i]);
        }
    } //-- void setAttribute(nl.fmc.configuration.Attribute) 

    /**
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(java.lang.String description)
    {
        this._description = description;
    } //-- void setDescription(java.lang.String) 

    /**
     * Method setExample
     * 
     * 
     * 
     * @param index
     * @param vExample
     */
    public void setExample(int index, java.lang.String vExample)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _exampleList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _exampleList.set(index, vExample);
    } //-- void setExample(int, java.lang.String) 

    /**
     * Method setExample
     * 
     * 
     * 
     * @param exampleArray
     */
    public void setExample(java.lang.String[] exampleArray)
    {
        //-- copy array
        _exampleList.clear();
        for (int i = 0; i < exampleArray.length; i++) {
            _exampleList.add(exampleArray[i]);
        }
    } //-- void setExample(java.lang.String) 

    /**
     * Sets the value of field 'hierarchy'.
     * 
     * @param hierarchy the value of field 'hierarchy'.
     */
    public void setHierarchy(java.lang.String hierarchy)
    {
        this._hierarchy = hierarchy;
    } //-- void setHierarchy(java.lang.String) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Configtag
     */
    public static nl.fmc.configuration.Configtag unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (nl.fmc.configuration.Configtag) Unmarshaller.unmarshal(nl.fmc.configuration.Configtag.class, reader);
    } //-- nl.fmc.configuration.Configtag unmarshal(java.io.Reader) 

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
