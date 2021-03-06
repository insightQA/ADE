/*
 
    Copyright IBM Corp. 2012, 2016
    This file is part of Anomaly Detection Engine for Linux Logs (ADE).

    ADE is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    ADE is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with ADE.  If not, see <http://www.gnu.org/licenses/>.
 
*/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.21 at 10:03:48 AM IST 
//

package org.openmainframe.ade.impl.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for AnalyzedMessageSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalyzedMessageSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOccurrences" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnomalyScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ScoreSet" type="{}ScoreSetType" minOccurs="0"/>
 *         &lt;element name="SummarizedText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TextSample" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActiveRules" type="{}ActiveRulesType" minOccurs="0"/>
 *         &lt;element name="TimeLine" type="{}TimeLineType"/>
 *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MsgId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyzedMessageSummaryType", propOrder = {
        "numOccurrences",
        "anomalyScore",
        "scoreSet",
        "summarizedText",
        "textSample",
        "activeRules",
        "timeLine",
        "any"
})
public class AnalyzedMessageSummaryType {

    @XmlElement(name = "NumOccurrences")
    protected int numOccurrences;
    @XmlElement(name = "AnomalyScore")
    protected double anomalyScore;
    @XmlElement(name = "ScoreSet")
    protected ScoreSetType scoreSet;
    @XmlElement(name = "SummarizedText", required = true)
    protected String summarizedText;
    @XmlElement(name = "TextSample", required = true)
    protected String textSample;
    @XmlElement(name = "ActiveRules")
    protected ActiveRulesType activeRules;
    @XmlElement(name = "TimeLine", required = true)
    protected TimeLineType timeLine;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "MsgId", required = true)
    protected String msgId;

    /**
     * Gets the value of the numOccurrences property.
     * 
     */
    public int getNumOccurrences() {
        return numOccurrences;
    }

    /**
     * Sets the value of the numOccurrences property.
     * 
     */
    public void setNumOccurrences(int value) {
        this.numOccurrences = value;
    }

    /**
     * Gets the value of the anomalyScore property.
     * 
     */
    public double getAnomalyScore() {
        return anomalyScore;
    }

    /**
     * Sets the value of the anomalyScore property.
     * 
     */
    public void setAnomalyScore(double value) {
        this.anomalyScore = value;
    }

    /**
     * Gets the value of the scoreSet property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreSetType }
     *     
     */
    public ScoreSetType getScoreSet() {
        return scoreSet;
    }

    /**
     * Sets the value of the scoreSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreSetType }
     *     
     */
    public void setScoreSet(ScoreSetType value) {
        this.scoreSet = value;
    }

    /**
     * Gets the value of the summarizedText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummarizedText() {
        return summarizedText;
    }

    /**
     * Sets the value of the summarizedText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummarizedText(String value) {
        this.summarizedText = value;
    }

    /**
     * Gets the value of the textSample property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextSample() {
        return textSample;
    }

    /**
     * Sets the value of the textSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextSample(String value) {
        this.textSample = value;
    }

    /**
     * Gets the value of the activeRules property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveRulesType }
     *     
     */
    public ActiveRulesType getActiveRules() {
        return activeRules;
    }

    /**
     * Sets the value of the activeRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveRulesType }
     *     
     */
    public void setActiveRules(ActiveRulesType value) {
        this.activeRules = value;
    }

    /**
     * Gets the value of the timeLine property.
     * 
     * @return
     *     possible object is
     *     {@link TimeLineType }
     *     
     */
    public TimeLineType getTimeLine() {
        return timeLine;
    }

    /**
     * Sets the value of the timeLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeLineType }
     *     
     */
    public void setTimeLine(TimeLineType value) {
        this.timeLine = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

}
