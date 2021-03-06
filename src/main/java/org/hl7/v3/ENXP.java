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
 * <p>ENXP complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ENXP">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}XP">
 *       &lt;attribute name="type" type="{urn:hl7-org:v3}EntityNamePartType" />
 *       &lt;attribute name="qualifier" type="{urn:hl7-org:v3}set_EntityNamePartQualifier" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENXP")
public class ENXP
    extends XP
{

    @XmlAttribute(name = "type")
    protected EntityNamePartType type;
    @XmlAttribute(name = "qualifier")
    protected List<EntityNamePartQualifier> qualifier;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EntityNamePartType }
     *     
     */
    public EntityNamePartType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EntityNamePartType }
     *     
     */
    public void setType(EntityNamePartType value) {
        this.type = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityNamePartQualifier }
     * 
     * 
     */
    public List<EntityNamePartQualifier> getQualifier() {
        if (qualifier == null) {
            qualifier = new ArrayList<EntityNamePartQualifier>();
        }
        return this.qualifier;
    }

}
