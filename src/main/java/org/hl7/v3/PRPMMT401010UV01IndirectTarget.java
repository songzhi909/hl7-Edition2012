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
 * <p>PRPM_MT401010UV01.IndirectTarget complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PRPM_MT401010UV01.IndirectTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;choice>
 *           &lt;element name="assignedEntity" type="{urn:hl7-org:v3}PRPM_MT401010UV01.AssignedEntity"/>
 *           &lt;element name="serviceDeliveryLocation" type="{urn:hl7-org:v3}PRPM_MT401010UV01.ServiceDeliveryLocation"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}ParticipationIndirectTarget" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPM_MT401010UV01.IndirectTarget", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "assignedEntity",
    "serviceDeliveryLocation"
})
public class PRPMMT401010UV01IndirectTarget {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    protected PRPMMT401010UV01AssignedEntity assignedEntity;
    protected PRPMMT401010UV01ServiceDeliveryLocation serviceDeliveryLocation;
    @XmlAttribute(name = "typeCode", required = true)
    protected ParticipationIndirectTarget typeCode;

    /**
     * 获取realmCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DSETCS }
     *     
     */
    public DSETCS getRealmCode() {
        return realmCode;
    }

    /**
     * 设置realmCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DSETCS }
     *     
     */
    public void setRealmCode(DSETCS value) {
        this.realmCode = value;
    }

    /**
     * 获取typeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTypeId() {
        return typeId;
    }

    /**
     * 设置typeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTypeId(II value) {
        this.typeId = value;
    }

    /**
     * 获取templateId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LISTII }
     *     
     */
    public LISTII getTemplateId() {
        return templateId;
    }

    /**
     * 设置templateId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LISTII }
     *     
     */
    public void setTemplateId(LISTII value) {
        this.templateId = value;
    }

    /**
     * 获取assignedEntity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PRPMMT401010UV01AssignedEntity }
     *     
     */
    public PRPMMT401010UV01AssignedEntity getAssignedEntity() {
        return assignedEntity;
    }

    /**
     * 设置assignedEntity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PRPMMT401010UV01AssignedEntity }
     *     
     */
    public void setAssignedEntity(PRPMMT401010UV01AssignedEntity value) {
        this.assignedEntity = value;
    }

    /**
     * 获取serviceDeliveryLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PRPMMT401010UV01ServiceDeliveryLocation }
     *     
     */
    public PRPMMT401010UV01ServiceDeliveryLocation getServiceDeliveryLocation() {
        return serviceDeliveryLocation;
    }

    /**
     * 设置serviceDeliveryLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PRPMMT401010UV01ServiceDeliveryLocation }
     *     
     */
    public void setServiceDeliveryLocation(PRPMMT401010UV01ServiceDeliveryLocation value) {
        this.serviceDeliveryLocation = value;
    }

    /**
     * 获取typeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParticipationIndirectTarget }
     *     
     */
    public ParticipationIndirectTarget getTypeCode() {
        return typeCode;
    }

    /**
     * 设置typeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationIndirectTarget }
     *     
     */
    public void setTypeCode(ParticipationIndirectTarget value) {
        this.typeCode = value;
    }

}
