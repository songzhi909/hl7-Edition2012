//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.10 时间 10:45:02 AM CST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IVL_TS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IVL_TS">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}QSET_TS">
 *       &lt;sequence>
 *         &lt;element name="low" type="{urn:hl7-org:v3}TS" minOccurs="0"/>
 *         &lt;element name="high" type="{urn:hl7-org:v3}TS" minOccurs="0"/>
 *         &lt;element name="width" type="{urn:hl7-org:v3}QTY" minOccurs="0"/>
 *         &lt;element name="any" type="{urn:hl7-org:v3}TS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lowClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="highClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL_TS", propOrder = {
    "low",
    "high",
    "width",
    "any"
})
public class IVLTS
    extends QSETTS
{

    protected TS low;
    protected TS high;
    protected QTY width;
    protected TS any;
    @XmlAttribute(name = "lowClosed")
    protected Boolean lowClosed;
    @XmlAttribute(name = "highClosed")
    protected Boolean highClosed;
    @XmlAttribute(name = "value")
    protected String value;

    /**
     * 获取low属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getLow() {
        return low;
    }

    /**
     * 设置low属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setLow(TS value) {
        this.low = value;
    }

    /**
     * 获取high属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getHigh() {
        return high;
    }

    /**
     * 设置high属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setHigh(TS value) {
        this.high = value;
    }

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QTY }
     *     
     */
    public QTY getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QTY }
     *     
     */
    public void setWidth(QTY value) {
        this.width = value;
    }

    /**
     * 获取any属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getAny() {
        return any;
    }

    /**
     * 设置any属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setAny(TS value) {
        this.any = value;
    }

    /**
     * 获取lowClosed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowClosed() {
        return lowClosed;
    }

    /**
     * 设置lowClosed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowClosed(Boolean value) {
        this.lowClosed = value;
    }

    /**
     * 获取highClosed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighClosed() {
        return highClosed;
    }

    /**
     * 设置highClosed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighClosed(Boolean value) {
        this.highClosed = value;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
