
package com.cdyne.ws.weatherws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour temp complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="temp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MorningLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaytimeHigh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "temp", propOrder = {
    "morningLow",
    "daytimeHigh"
})
public class Temp {

    @XmlElement(name = "MorningLow")
    protected String morningLow;
    @XmlElement(name = "DaytimeHigh")
    protected String daytimeHigh;

    /**
     * Obtient la valeur de la propri�t� morningLow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMorningLow() {
        return morningLow;
    }

    /**
     * D�finit la valeur de la propri�t� morningLow.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorningLow(String value) {
        this.morningLow = value;
    }

    /**
     * Obtient la valeur de la propri�t� daytimeHigh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaytimeHigh() {
        return daytimeHigh;
    }

    /**
     * D�finit la valeur de la propri�t� daytimeHigh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaytimeHigh(String value) {
        this.daytimeHigh = value;
    }

}
