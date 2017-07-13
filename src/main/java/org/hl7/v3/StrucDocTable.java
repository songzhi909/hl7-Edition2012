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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StrucDoc.Table complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StrucDoc.Table">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}StrucDoc.Captioned">
 *       &lt;sequence>
 *         &lt;element name="col" type="{urn:hl7-org:v3}StrucDoc.Col" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="colgroup" type="{urn:hl7-org:v3}StrucDoc.ColGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="thead" type="{urn:hl7-org:v3}StrucDoc.TRowGroup" minOccurs="0"/>
 *         &lt;element name="tfoot" type="{urn:hl7-org:v3}StrucDoc.TRowGroup" minOccurs="0"/>
 *         &lt;element name="tbody" type="{urn:hl7-org:v3}StrucDoc.TRowGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="width" type="{urn:hl7-org:v3}StrucDoc.Length" />
 *       &lt;attribute name="border" type="{urn:hl7-org:v3}StrucDoc.Length" />
 *       &lt;attribute name="frame" type="{urn:hl7-org:v3}StrucDoc.Frame" />
 *       &lt;attribute name="rules" type="{urn:hl7-org:v3}StrucDoc.Rules" />
 *       &lt;attribute name="cellspacing" type="{urn:hl7-org:v3}StrucDoc.Length" />
 *       &lt;attribute name="cellpadding" type="{urn:hl7-org:v3}StrucDoc.Length" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrucDoc.Table")
public class StrucDocTable
    extends StrucDocCaptioned
{

    @XmlAttribute(name = "summary")
    protected String summary;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "border")
    protected String border;
    @XmlAttribute(name = "frame")
    protected StrucDocFrame frame;
    @XmlAttribute(name = "rules")
    protected StrucDocRules rules;
    @XmlAttribute(name = "cellspacing")
    protected String cellspacing;
    @XmlAttribute(name = "cellpadding")
    protected String cellpadding;

    /**
     * 获取summary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置summary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * 获取border属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorder() {
        return border;
    }

    /**
     * 设置border属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
     * 获取frame属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StrucDocFrame }
     *     
     */
    public StrucDocFrame getFrame() {
        return frame;
    }

    /**
     * 设置frame属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StrucDocFrame }
     *     
     */
    public void setFrame(StrucDocFrame value) {
        this.frame = value;
    }

    /**
     * 获取rules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StrucDocRules }
     *     
     */
    public StrucDocRules getRules() {
        return rules;
    }

    /**
     * 设置rules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StrucDocRules }
     *     
     */
    public void setRules(StrucDocRules value) {
        this.rules = value;
    }

    /**
     * 获取cellspacing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellspacing() {
        return cellspacing;
    }

    /**
     * 设置cellspacing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellspacing(String value) {
        this.cellspacing = value;
    }

    /**
     * 获取cellpadding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellpadding() {
        return cellpadding;
    }

    /**
     * 设置cellpadding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellpadding(String value) {
        this.cellpadding = value;
    }

}
