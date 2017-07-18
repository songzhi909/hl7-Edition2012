//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.10 时间 10:45:02 AM CST 
//


package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}QTY">
 *       &lt;sequence>
 *         &lt;element name="translation" type="{urn:hl7-org:v3}PQR" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="value" type="{urn:hl7-org:v3}Decimal" />
 *       &lt;attribute name="unit" type="{urn:hl7-org:v3}Code" />
 *       &lt;attribute name="codingRationale" type="{urn:hl7-org:v3}CodingRationale" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PQ", propOrder = {
    "translation"
})
public class PQ
    extends QTY
{

    protected List<PQR> translation;
    @XmlAttribute(name = "value")
    protected Double value;
    @XmlAttribute(name = "unit")
    protected String unit;
    @XmlAttribute(name = "codingRationale")
    protected CodingRationale codingRationale;

    /**
     * Gets the value of the translation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PQR }
     * 
     * 
     */
    public List<PQR> getTranslation() {
        if (translation == null) {
            translation = new ArrayList<PQR>();
        }
        return this.translation;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * 获取unit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置unit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * 获取codingRationale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodingRationale }
     *     
     */
    public CodingRationale getCodingRationale() {
        return codingRationale;
    }

    /**
     * 设置codingRationale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodingRationale }
     *     
     */
    public void setCodingRationale(CodingRationale value) {
        this.codingRationale = value;
    }

}
