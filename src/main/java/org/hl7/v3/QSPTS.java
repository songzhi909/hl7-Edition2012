//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.10 时间 10:45:02 AM CST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QSP_TS complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QSP_TS">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}QSET_TS">
 *       &lt;sequence>
 *         &lt;element name="low" type="{urn:hl7-org:v3}QSET_TS" minOccurs="0"/>
 *         &lt;element name="high" type="{urn:hl7-org:v3}QSET_TS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSP_TS", propOrder = {
    "low",
    "high"
})
public class QSPTS
    extends QSETTS
{

    protected QSETTS low;
    protected QSETTS high;

    /**
     * 获取low属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QSETTS }
     *     
     */
    public QSETTS getLow() {
        return low;
    }

    /**
     * 设置low属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTS }
     *     
     */
    public void setLow(QSETTS value) {
        this.low = value;
    }

    /**
     * 获取high属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QSETTS }
     *     
     */
    public QSETTS getHigh() {
        return high;
    }

    /**
     * 设置high属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTS }
     *     
     */
    public void setHigh(QSETTS value) {
        this.high = value;
    }

}
