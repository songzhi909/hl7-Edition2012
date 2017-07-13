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
 * <p>HXIT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HXIT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="validTimeLow" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="validTimeHigh" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="controlInformationRoot" type="{urn:hl7-org:v3}Uid" />
 *       &lt;attribute name="controlInformationExtension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HXIT")
@XmlSeeAlso({
    ANY.class
})
public abstract class HXIT {

    @XmlAttribute(name = "validTimeLow")
    protected String validTimeLow;
    @XmlAttribute(name = "validTimeHigh")
    protected String validTimeHigh;
    @XmlAttribute(name = "controlInformationRoot")
    protected String controlInformationRoot;
    @XmlAttribute(name = "controlInformationExtension")
    protected String controlInformationExtension;

    /**
     * 获取validTimeLow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidTimeLow() {
        return validTimeLow;
    }

    /**
     * 设置validTimeLow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTimeLow(String value) {
        this.validTimeLow = value;
    }

    /**
     * 获取validTimeHigh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidTimeHigh() {
        return validTimeHigh;
    }

    /**
     * 设置validTimeHigh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTimeHigh(String value) {
        this.validTimeHigh = value;
    }

    /**
     * 获取controlInformationRoot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlInformationRoot() {
        return controlInformationRoot;
    }

    /**
     * 设置controlInformationRoot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlInformationRoot(String value) {
        this.controlInformationRoot = value;
    }

    /**
     * 获取controlInformationExtension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlInformationExtension() {
        return controlInformationExtension;
    }

    /**
     * 设置controlInformationExtension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlInformationExtension(String value) {
        this.controlInformationExtension = value;
    }

}
