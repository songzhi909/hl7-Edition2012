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
 * <p>StrucDoc.List complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StrucDoc.List">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}StrucDoc.Captioned">
 *       &lt;sequence>
 *         &lt;element name="item" type="{urn:hl7-org:v3}StrucDoc.Item" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="listType" type="{urn:hl7-org:v3}StrucDoc.ListType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrucDoc.List")
public class StrucDocList
    extends StrucDocCaptioned
{

    @XmlAttribute(name = "listType")
    protected StrucDocListType listType;

    /**
     * 获取listType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StrucDocListType }
     *     
     */
    public StrucDocListType getListType() {
        return listType;
    }

    /**
     * 设置listType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StrucDocListType }
     *     
     */
    public void setListType(StrucDocListType value) {
        this.listType = value;
    }

}
