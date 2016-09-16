
package com.cdyne.ws.weatherws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WeatherReturn complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WeatherReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ResponseText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeatherStationCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeatherID" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Temperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelativeHumidity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pressure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Visibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WindChill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherReturn", propOrder = {
    "success",
    "responseText",
    "state",
    "city",
    "weatherStationCity",
    "weatherID",
    "description",
    "temperature",
    "relativeHumidity",
    "wind",
    "pressure",
    "visibility",
    "windChill",
    "remarks"
})
public class WeatherReturn {

    @XmlElement(name = "Success")
    protected boolean success;
    @XmlElement(name = "ResponseText")
    protected String responseText;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "WeatherStationCity")
    protected String weatherStationCity;
    @XmlElement(name = "WeatherID")
    protected short weatherID;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Temperature")
    protected String temperature;
    @XmlElement(name = "RelativeHumidity")
    protected String relativeHumidity;
    @XmlElement(name = "Wind")
    protected String wind;
    @XmlElement(name = "Pressure")
    protected String pressure;
    @XmlElement(name = "Visibility")
    protected String visibility;
    @XmlElement(name = "WindChill")
    protected String windChill;
    @XmlElement(name = "Remarks")
    protected String remarks;

    /**
     * Obtient la valeur de la propriété success.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Définit la valeur de la propriété success.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Obtient la valeur de la propriété responseText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseText() {
        return responseText;
    }

    /**
     * Définit la valeur de la propriété responseText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseText(String value) {
        this.responseText = value;
    }

    /**
     * Obtient la valeur de la propriété state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Définit la valeur de la propriété state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtient la valeur de la propriété city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Définit la valeur de la propriété city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtient la valeur de la propriété weatherStationCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherStationCity() {
        return weatherStationCity;
    }

    /**
     * Définit la valeur de la propriété weatherStationCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherStationCity(String value) {
        this.weatherStationCity = value;
    }

    /**
     * Obtient la valeur de la propriété weatherID.
     * 
     */
    public short getWeatherID() {
        return weatherID;
    }

    /**
     * Définit la valeur de la propriété weatherID.
     * 
     */
    public void setWeatherID(short value) {
        this.weatherID = value;
    }

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propriété temperature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * Définit la valeur de la propriété temperature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperature(String value) {
        this.temperature = value;
    }

    /**
     * Obtient la valeur de la propriété relativeHumidity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * Définit la valeur de la propriété relativeHumidity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeHumidity(String value) {
        this.relativeHumidity = value;
    }

    /**
     * Obtient la valeur de la propriété wind.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWind() {
        return wind;
    }

    /**
     * Définit la valeur de la propriété wind.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWind(String value) {
        this.wind = value;
    }

    /**
     * Obtient la valeur de la propriété pressure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPressure() {
        return pressure;
    }

    /**
     * Définit la valeur de la propriété pressure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPressure(String value) {
        this.pressure = value;
    }

    /**
     * Obtient la valeur de la propriété visibility.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Définit la valeur de la propriété visibility.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Obtient la valeur de la propriété windChill.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindChill() {
        return windChill;
    }

    /**
     * Définit la valeur de la propriété windChill.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindChill(String value) {
        this.windChill = value;
    }

    /**
     * Obtient la valeur de la propriété remarks.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Définit la valeur de la propriété remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

}
