//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.10 时间 10:45:02 AM CST 
//


package org.hl7.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PRPM_IN301010UV01.MFMI_MT700721UV01.Subject2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PRPM_IN301010UV01.MFMI_MT700721UV01.Subject2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;choice>
 *           &lt;element name="assignedEntity" type="{urn:hl7-org:v3}PRPM_MT301010UV01.AssignedEntity"/>
 *           &lt;element name="healthCareProvider" type="{urn:hl7-org:v3}PRPM_MT301010UV01.HealthCareProvider"/>
 *           &lt;element name="qualifiedEntity" type="{urn:hl7-org:v3}PRPM_MT301010UV01.QualifiedEntity"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}ParticipationTargetSubject" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPM_IN301010UV01.MFMI_MT700721UV01.Subject2", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "assignedEntity",
    "healthCareProvider",
    "qualifiedEntity"
})
public class PRPMIN301010UV01MFMIMT700721UV01Subject2 {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    @XmlElementRef(name = "assignedEntity", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT301010UV01AssignedEntity> assignedEntity;
    @XmlElementRef(name = "healthCareProvider", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT301010UV01HealthCareProvider> healthCareProvider;
    @XmlElementRef(name = "qualifiedEntity", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT301010UV01QualifiedEntity> qualifiedEntity;
    @XmlAttribute(name = "typeCode", required = true)
    protected ParticipationTargetSubject typeCode;

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
     *     {@link JAXBElement }{@code <}{@link PRPMMT301010UV01AssignedEntity }{@code >}
     *     
     */
    public JAXBElement<PRPMMT301010UV01AssignedEntity> getAssignedEntity() {
        return assignedEntity;
    }

    /**
     * 设置assignedEntity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT301010UV01AssignedEntity }{@code >}
     *     
     */
    public void setAssignedEntity(JAXBElement<PRPMMT301010UV01AssignedEntity> value) {
        this.assignedEntity = value;
    }

    /**
     * 获取healthCareProvider属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT301010UV01HealthCareProvider }{@code >}
     *     
     */
    public JAXBElement<PRPMMT301010UV01HealthCareProvider> getHealthCareProvider() {
        return healthCareProvider;
    }

    /**
     * 设置healthCareProvider属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT301010UV01HealthCareProvider }{@code >}
     *     
     */
    public void setHealthCareProvider(JAXBElement<PRPMMT301010UV01HealthCareProvider> value) {
        this.healthCareProvider = value;
    }

    /**
     * 获取qualifiedEntity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT301010UV01QualifiedEntity }{@code >}
     *     
     */
    public JAXBElement<PRPMMT301010UV01QualifiedEntity> getQualifiedEntity() {
        return qualifiedEntity;
    }

    /**
     * 设置qualifiedEntity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT301010UV01QualifiedEntity }{@code >}
     *     
     */
    public void setQualifiedEntity(JAXBElement<PRPMMT301010UV01QualifiedEntity> value) {
        this.qualifiedEntity = value;
    }

    /**
     * 获取typeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParticipationTargetSubject }
     *     
     */
    public ParticipationTargetSubject getTypeCode() {
        return typeCode;
    }

    /**
     * 设置typeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationTargetSubject }
     *     
     */
    public void setTypeCode(ParticipationTargetSubject value) {
        this.typeCode = value;
    }

}
