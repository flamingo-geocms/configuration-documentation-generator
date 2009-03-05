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
 * Class Method.
 * 
 * @version $Revision$ $Date$
 */
public class Method implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _usage
     */
    private java.lang.String _usage;

    /**
     * Field _exampleList
     */
    private java.util.ArrayList _exampleList;

    /**
     * Field _arguments
     */
    private java.lang.String _arguments;

    /**
     * Field _returntype
     */
    private java.lang.String _returntype;

    /**
     * Field _description
     */
    private java.lang.String _description;

    /**
     * Field _parameterList
     */
    private java.util.ArrayList _parameterList;

    /**
     * Field _return
     */
    private java.lang.String _return;

    /**
     * Field _name
     */
    private java.lang.String _name;


      //----------------/
     //- Constructors -/
    //----------------/

    public Method() 
     {
        super();
        _exampleList = new java.util.ArrayList();
        _parameterList = new java.util.ArrayList();
    } //-- nl.fmc.configuration.Method()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Method addParameter
     * 
     * 
     * 
     * @param vParameter
     */
    public void addParameter(nl.fmc.configuration.Parameter vParameter)
        throws java.lang.IndexOutOfBoundsException
    {
        _parameterList.add(vParameter);
    } //-- void addParameter(nl.fmc.configuration.Parameter) 

    /**
     * Method addParameter
     * 
     * 
     * 
     * @param index
     * @param vParameter
     */
    public void addParameter(int index, nl.fmc.configuration.Parameter vParameter)
        throws java.lang.IndexOutOfBoundsException
    {
        _parameterList.add(index, vParameter);
    } //-- void addParameter(int, nl.fmc.configuration.Parameter) 

    /**
     * Method clearExample
     * 
     */
    public void clearExample()
    {
        _exampleList.clear();
    } //-- void clearExample() 

    /**
     * Method clearParameter
     * 
     */
    public void clearParameter()
    {
        _parameterList.clear();
    } //-- void clearParameter() 

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
     * Method enumerateParameter
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateParameter()
    {
        return Collections.enumeration(_parameterList);
    } //-- java.util.Enumeration enumerateParameter() 

    /**
     * Returns the value of field 'arguments'.
     * 
     * @return String
     * @return the value of field 'arguments'.
     */
    public java.lang.String getArguments()
    {
        return this._arguments;
    } //-- java.lang.String getArguments() 

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
     * Method getParameter
     * 
     * 
     * 
     * @param index
     * @return Parameter
     */
    public nl.fmc.configuration.Parameter getParameter(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _parameterList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (nl.fmc.configuration.Parameter) _parameterList.get(index);
    } //-- nl.fmc.configuration.Parameter getParameter(int) 

    /**
     * Method getParameter
     * 
     * 
     * 
     * @return Parameter
     */
    public nl.fmc.configuration.Parameter[] getParameter()
    {
        int size = _parameterList.size();
        nl.fmc.configuration.Parameter[] mArray = new nl.fmc.configuration.Parameter[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (nl.fmc.configuration.Parameter) _parameterList.get(index);
        }
        return mArray;
    } //-- nl.fmc.configuration.Parameter[] getParameter() 

    /**
     * Method getParameterCount
     * 
     * 
     * 
     * @return int
     */
    public int getParameterCount()
    {
        return _parameterList.size();
    } //-- int getParameterCount() 

    /**
     * Returns the value of field 'return'.
     * 
     * @return String
     * @return the value of field 'return'.
     */
    public java.lang.String getReturn()
    {
        return this._return;
    } //-- java.lang.String getReturn() 

    /**
     * Returns the value of field 'returntype'.
     * 
     * @return String
     * @return the value of field 'returntype'.
     */
    public java.lang.String getReturntype()
    {
        return this._returntype;
    } //-- java.lang.String getReturntype() 

    /**
     * Returns the value of field 'usage'.
     * 
     * @return String
     * @return the value of field 'usage'.
     */
    public java.lang.String getUsage()
    {
        return this._usage;
    } //-- java.lang.String getUsage() 

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
     * Method removeParameter
     * 
     * 
     * 
     * @param vParameter
     * @return boolean
     */
    public boolean removeParameter(nl.fmc.configuration.Parameter vParameter)
    {
        boolean removed = _parameterList.remove(vParameter);
        return removed;
    } //-- boolean removeParameter(nl.fmc.configuration.Parameter) 

    /**
     * Sets the value of field 'arguments'.
     * 
     * @param arguments the value of field 'arguments'.
     */
    public void setArguments(java.lang.String arguments)
    {
        this._arguments = arguments;
    } //-- void setArguments(java.lang.String) 

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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Method setParameter
     * 
     * 
     * 
     * @param index
     * @param vParameter
     */
    public void setParameter(int index, nl.fmc.configuration.Parameter vParameter)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _parameterList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _parameterList.set(index, vParameter);
    } //-- void setParameter(int, nl.fmc.configuration.Parameter) 

    /**
     * Method setParameter
     * 
     * 
     * 
     * @param parameterArray
     */
    public void setParameter(nl.fmc.configuration.Parameter[] parameterArray)
    {
        //-- copy array
        _parameterList.clear();
        for (int i = 0; i < parameterArray.length; i++) {
            _parameterList.add(parameterArray[i]);
        }
    } //-- void setParameter(nl.fmc.configuration.Parameter) 

    /**
     * Sets the value of field 'return'.
     * 
     * @param _return
     * @param return the value of field 'return'.
     */
    public void setReturn(java.lang.String _return)
    {
        this._return = _return;
    } //-- void setReturn(java.lang.String) 

    /**
     * Sets the value of field 'returntype'.
     * 
     * @param returntype the value of field 'returntype'.
     */
    public void setReturntype(java.lang.String returntype)
    {
        this._returntype = returntype;
    } //-- void setReturntype(java.lang.String) 

    /**
     * Sets the value of field 'usage'.
     * 
     * @param usage the value of field 'usage'.
     */
    public void setUsage(java.lang.String usage)
    {
        this._usage = usage;
    } //-- void setUsage(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Method
     */
    public static nl.fmc.configuration.Method unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (nl.fmc.configuration.Method) Unmarshaller.unmarshal(nl.fmc.configuration.Method.class, reader);
    } //-- nl.fmc.configuration.Method unmarshal(java.io.Reader) 

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
