//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.13 时间 05:16:19 PM CST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QTY complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QTY">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}ANY">
 *       &lt;sequence>
 *         &lt;element name="expression" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="originalText" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="uncertainty" type="{urn:hl7-org:v3}QTY" minOccurs="0"/>
 *         &lt;element name="uncertainRange" type="{urn:hl7-org:v3}IVL_QTY" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uncertaintyType" type="{urn:hl7-org:v3}UncertaintyType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTY", propOrder = {
    "expression",
    "originalText",
    "uncertainty",
    "uncertainRange"
})
@XmlSeeAlso({
    TS.class,
    INT.class,
    REAL.class,
    CO.class,
    MO.class,
    PQ.class,
    RTO.class
})
public abstract class QTY
    extends ANY
{

    protected ED expression;
    protected ED originalText;
    protected QTY uncertainty;
    protected IVLQTY uncertainRange;
    @XmlAttribute(name = "uncertaintyType")
    protected UncertaintyType uncertaintyType;

    /**
     * 获取expression属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getExpression() {
        return expression;
    }

    /**
     * 设置expression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setExpression(ED value) {
        this.expression = value;
    }

    /**
     * 获取originalText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getOriginalText() {
        return originalText;
    }

    /**
     * 设置originalText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setOriginalText(ED value) {
        this.originalText = value;
    }

    /**
     * 获取uncertainty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QTY }
     *     
     */
    public QTY getUncertainty() {
        return uncertainty;
    }

    /**
     * 设置uncertainty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QTY }
     *     
     */
    public void setUncertainty(QTY value) {
        this.uncertainty = value;
    }

    /**
     * 获取uncertainRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IVLQTY }
     *     
     */
    public IVLQTY getUncertainRange() {
        return uncertainRange;
    }

    /**
     * 设置uncertainRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IVLQTY }
     *     
     */
    public void setUncertainRange(IVLQTY value) {
        this.uncertainRange = value;
    }

    /**
     * 获取uncertaintyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UncertaintyType }
     *     
     */
    public UncertaintyType getUncertaintyType() {
        return uncertaintyType;
    }

    /**
     * 设置uncertaintyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UncertaintyType }
     *     
     */
    public void setUncertaintyType(UncertaintyType value) {
        this.uncertaintyType = value;
    }

}
