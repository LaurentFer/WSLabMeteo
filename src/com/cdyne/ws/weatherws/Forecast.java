
package com.cdyne.ws.weatherws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Forecast complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Forecast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WeatherID" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Desciption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Temperatures" type="{http://ws.cdyne.com/WeatherWS/}temp"/>
 *         &lt;element name="ProbabilityOfPrecipiation" type="{http://ws.cdyne.com/WeatherWS/}POP"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Forecast", propOrder = {
    "date",
    "weatherID",
    "desciption",
    "temperatures",
    "probabilityOfPrecipiation"
})
public class Forecast {

    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "WeatherID")
    protected short weatherID;
    @XmlElement(name = "Desciption")
    protected String desciption;
    @XmlElement(name = "Temperatures", required = true)
    protected Temp temperatures;
    @XmlElement(name = "ProbabilityOfPrecipiation", required = true)
    protected POP probabilityOfPrecipiation;

    /**
     * Obtient la valeur de la propri�t� date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * D�finit la valeur de la propri�t� date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Obtient la valeur de la propri�t� weatherID.
     * 
     */
    public short getWeatherID() {
        return weatherID;
    }

    /**
     * D�finit la valeur de la propri�t� weatherID.
     * 
     */
    public void setWeatherID(short value) {
        this.weatherID = value;
    }

    /**
     * Obtient la valeur de la propri�t� desciption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesciption() {
        return desciption;
    }

    /**
     * D�finit la valeur de la propri�t� desciption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesciption(String value) {
        this.desciption = value;
    }

    /**
     * Obtient la valeur de la propri�t� temperatures.
     * 
     * @return
     *     possible object is
     *     {@link Temp }
     *     
     */
    public Temp getTemperatures() {
        return temperatures;
    }

    /**
     * D�finit la valeur de la propri�t� temperatures.
     * 
     * @param value
     *     allowed object is
     *     {@link Temp }
     *     
     */
    public void setTemperatures(Temp value) {
        this.temperatures = value;
    }

    /**
     * Obtient la valeur de la propri�t� probabilityOfPrecipiation.
     * 
     * @return
     *     possible object is
     *     {@link POP }
     *     
     */
    public POP getProbabilityOfPrecipiation() {
        return probabilityOfPrecipiation;
    }

    /**
     * D�finit la valeur de la propri�t� probabilityOfPrecipiation.
     * 
     * @param value
     *     allowed object is
     *     {@link POP }
     *     
     */
    public void setProbabilityOfPrecipiation(POP value) {
        this.probabilityOfPrecipiation = value;
    }

}
