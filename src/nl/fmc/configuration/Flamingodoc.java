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

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Flamingodoc.
 * 
 * @version $Revision$ $Date$
 */
public class Flamingodoc implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _title
     */
    private java.lang.String _title;

    /**
     * Field _generated
     */
    private java.lang.String _generated;

    /**
     * Field _component
     */
    private nl.fmc.configuration.Component _component;


      //----------------/
     //- Constructors -/
    //----------------/

    public Flamingodoc() 
     {
        super();
    } //-- nl.fmc.configuration.Flamingodoc()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'component'.
     * 
     * @return Component
     * @return the value of field 'component'.
     */
    public nl.fmc.configuration.Component getComponent()
    {
        return this._component;
    } //-- nl.fmc.configuration.Component getComponent() 

    /**
     * Returns the value of field 'generated'.
     * 
     * @return String
     * @return the value of field 'generated'.
     */
    public java.lang.String getGenerated()
    {
        return this._generated;
    } //-- java.lang.String getGenerated() 

    /**
     * Returns the value of field 'title'.
     * 
     * @return String
     * @return the value of field 'title'.
     */
    public java.lang.String getTitle()
    {
        return this._title;
    } //-- java.lang.String getTitle() 

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
     * Sets the value of field 'component'.
     * 
     * @param component the value of field 'component'.
     */
    public void setComponent(nl.fmc.configuration.Component component)
    {
        this._component = component;
    } //-- void setComponent(nl.fmc.configuration.Component) 

    /**
     * Sets the value of field 'generated'.
     * 
     * @param generated the value of field 'generated'.
     */
    public void setGenerated(java.lang.String generated)
    {
        this._generated = generated;
    } //-- void setGenerated(java.lang.String) 

    /**
     * Sets the value of field 'title'.
     * 
     * @param title the value of field 'title'.
     */
    public void setTitle(java.lang.String title)
    {
        this._title = title;
    } //-- void setTitle(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Flamingodoc
     */
    public static nl.fmc.configuration.Flamingodoc unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (nl.fmc.configuration.Flamingodoc) Unmarshaller.unmarshal(nl.fmc.configuration.Flamingodoc.class, reader);
    } //-- nl.fmc.configuration.Flamingodoc unmarshal(java.io.Reader) 

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
