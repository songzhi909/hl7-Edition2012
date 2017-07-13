//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.13 时间 05:16:19 PM CST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QSD_PQ complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QSD_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}QSET_PQ">
 *       &lt;sequence>
 *         &lt;element name="minuend" type="{urn:hl7-org:v3}QSET_PQ" minOccurs="0"/>
 *         &lt;element name="subtrahend" type="{urn:hl7-org:v3}QSET_PQ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSD_PQ", propOrder = {
    "minuend",
    "subtrahend"
})
public class QSDPQ
    extends QSETPQ
{

    protected QSETPQ minuend;
    protected QSETPQ subtrahend;

    /**
     * 获取minuend属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QSETPQ }
     *     
     */
    public QSETPQ getMinuend() {
        return minuend;
    }

    /**
     * 设置minuend属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QSETPQ }
     *     
     */
    public void setMinuend(QSETPQ value) {
        this.minuend = value;
    }

    /**
     * 获取subtrahend属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QSETPQ }
     *     
     */
    public QSETPQ getSubtrahend() {
        return subtrahend;
    }

    /**
     * 设置subtrahend属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QSETPQ }
     *     
     */
    public void setSubtrahend(QSETPQ value) {
        this.subtrahend = value;
    }

}
