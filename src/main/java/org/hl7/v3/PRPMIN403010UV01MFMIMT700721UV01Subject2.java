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
 * <p>PRPM_IN403010UV01.MFMI_MT700721UV01.Subject2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PRPM_IN403010UV01.MFMI_MT700721UV01.Subject2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;choice>
 *           &lt;element name="assignedEntity" type="{urn:hl7-org:v3}PRPM_MT403010UV01.AssignedEntity"/>
 *           &lt;element name="licensedEntity" type="{urn:hl7-org:v3}PRPM_MT403010UV01.LicensedEntity"/>
 *           &lt;element name="member" type="{urn:hl7-org:v3}PRPM_MT403010UV01.Member"/>
 *           &lt;element name="qualifiedEntity" type="{urn:hl7-org:v3}PRPM_MT403010UV01.QualifiedEntity"/>
 *           &lt;element name="roleOther" type="{urn:hl7-org:v3}PRPM_MT403010UV01.RoleOther"/>
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
@XmlType(name = "PRPM_IN403010UV01.MFMI_MT700721UV01.Subject2", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "assignedEntity",
    "licensedEntity",
    "member",
    "qualifiedEntity",
    "roleOther"
})
public class PRPMIN403010UV01MFMIMT700721UV01Subject2 {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    @XmlElementRef(name = "assignedEntity", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT403010UV01AssignedEntity> assignedEntity;
    @XmlElementRef(name = "licensedEntity", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT403010UV01LicensedEntity> licensedEntity;
    @XmlElementRef(name = "member", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT403010UV01Member> member;
    @XmlElementRef(name = "qualifiedEntity", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT403010UV01QualifiedEntity> qualifiedEntity;
    @XmlElementRef(name = "roleOther", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT403010UV01RoleOther> roleOther;
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
     *     {@link JAXBElement }{@code <}{@link PRPMMT403010UV01AssignedEntity }{@code >}
     *     
     */
    public JAXBElement<PRPMMT403010UV01AssignedEntity> getAssignedEntity() {
        return assignedEntity;
    }

    /**
     * 设置assignedEntity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT403010UV01AssignedEntity }{@code >}
     *     
     */
    public void setAssignedEntity(JAXBElement<PRPMMT403010UV01AssignedEntity> value) {
        this.assignedEntity = value;
    }

    /**
     * 获取licensedEntity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT403010UV01LicensedEntity }{@code >}
     *     
     */
    public JAXBElement<PRPMMT403010UV01LicensedEntity> getLicensedEntity() {
        return licensedEntity;
    }

    /**
     * 设置licensedEntity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT403010UV01LicensedEntity }{@code >}
     *     
     */
    public void setLicensedEntity(JAXBElement<PRPMMT403010UV01LicensedEntity> value) {
        this.licensedEntity = value;
    }

    /**
     * 获取member属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Member }{@code >}
     *     
     */
    public JAXBElement<PRPMMT403010UV01Member> getMember() {
        return member;
    }

    /**
     * 设置member属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Member }{@code >}
     *     
     */
    public void setMember(JAXBElement<PRPMMT403010UV01Member> value) {
        this.member = value;
    }

    /**
     * 获取qualifiedEntity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT403010UV01QualifiedEntity }{@code >}
     *     
     */
    public JAXBElement<PRPMMT403010UV01QualifiedEntity> getQualifiedEntity() {
        return qualifiedEntity;
    }

    /**
     * 设置qualifiedEntity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT403010UV01QualifiedEntity }{@code >}
     *     
     */
    public void setQualifiedEntity(JAXBElement<PRPMMT403010UV01QualifiedEntity> value) {
        this.qualifiedEntity = value;
    }

    /**
     * 获取roleOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT403010UV01RoleOther }{@code >}
     *     
     */
    public JAXBElement<PRPMMT403010UV01RoleOther> getRoleOther() {
        return roleOther;
    }

    /**
     * 设置roleOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT403010UV01RoleOther }{@code >}
     *     
     */
    public void setRoleOther(JAXBElement<PRPMMT403010UV01RoleOther> value) {
        this.roleOther = value;
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
