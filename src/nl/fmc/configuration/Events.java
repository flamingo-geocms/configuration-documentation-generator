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
 * Class Events.
 * 
 * @version $Revision$ $Date$
 */
public class Events implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _eventList
     */
    private java.util.ArrayList _eventList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Events() 
     {
        super();
        _eventList = new java.util.ArrayList();
    } //-- nl.fmc.configuration.Events()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addEvent
     * 
     * 
     * 
     * @param vEvent
     */
    public void addEvent(nl.fmc.configuration.Event vEvent)
        throws java.lang.IndexOutOfBoundsException
    {
        _eventList.add(vEvent);
    } //-- void addEvent(nl.fmc.configuration.Event) 

    /**
     * Method addEvent
     * 
     * 
     * 
     * @param index
     * @param vEvent
     */
    public void addEvent(int index, nl.fmc.configuration.Event vEvent)
        throws java.lang.IndexOutOfBoundsException
    {
        _eventList.add(index, vEvent);
    } //-- void addEvent(int, nl.fmc.configuration.Event) 

    /**
     * Method clearEvent
     * 
     */
    public void clearEvent()
    {
        _eventList.clear();
    } //-- void clearEvent() 

    /**
     * Method enumerateEvent
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateEvent()
    {
        return Collections.enumeration(_eventList);
    } //-- java.util.Enumeration enumerateEvent() 

    /**
     * Method getEvent
     * 
     * 
     * 
     * @param index
     * @return Event
     */
    public nl.fmc.configuration.Event getEvent(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _eventList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (nl.fmc.configuration.Event) _eventList.get(index);
    } //-- nl.fmc.configuration.Event getEvent(int) 

    /**
     * Method getEvent
     * 
     * 
     * 
     * @return Event
     */
    public nl.fmc.configuration.Event[] getEvent()
    {
        int size = _eventList.size();
        nl.fmc.configuration.Event[] mArray = new nl.fmc.configuration.Event[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (nl.fmc.configuration.Event) _eventList.get(index);
        }
        return mArray;
    } //-- nl.fmc.configuration.Event[] getEvent() 

    /**
     * Method getEventCount
     * 
     * 
     * 
     * @return int
     */
    public int getEventCount()
    {
        return _eventList.size();
    } //-- int getEventCount() 

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
     * Method removeEvent
     * 
     * 
     * 
     * @param vEvent
     * @return boolean
     */
    public boolean removeEvent(nl.fmc.configuration.Event vEvent)
    {
        boolean removed = _eventList.remove(vEvent);
        return removed;
    } //-- boolean removeEvent(nl.fmc.configuration.Event) 

    /**
     * Method setEvent
     * 
     * 
     * 
     * @param index
     * @param vEvent
     */
    public void setEvent(int index, nl.fmc.configuration.Event vEvent)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _eventList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _eventList.set(index, vEvent);
    } //-- void setEvent(int, nl.fmc.configuration.Event) 

    /**
     * Method setEvent
     * 
     * 
     * 
     * @param eventArray
     */
    public void setEvent(nl.fmc.configuration.Event[] eventArray)
    {
        //-- copy array
        _eventList.clear();
        for (int i = 0; i < eventArray.length; i++) {
            _eventList.add(eventArray[i]);
        }
    } //-- void setEvent(nl.fmc.configuration.Event) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Events
     */
    public static nl.fmc.configuration.Events unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (nl.fmc.configuration.Events) Unmarshaller.unmarshal(nl.fmc.configuration.Events.class, reader);
    } //-- nl.fmc.configuration.Events unmarshal(java.io.Reader) 

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
