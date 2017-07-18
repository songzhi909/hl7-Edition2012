//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.10 时间 10:45:02 AM CST 
//


package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PRPM_MT301010UV01.HealthCareProvider complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PRPM_MT301010UV01.HealthCareProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD"/>
 *         &lt;element name="name" type="{urn:hl7-org:v3}COLL_EN" minOccurs="0"/>
 *         &lt;element name="addr" type="{urn:hl7-org:v3}COLL_AD2" minOccurs="0"/>
 *         &lt;element name="telecom" type="{urn:hl7-org:v3}COLL_TEL" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;element name="healthCarePrincipalPerson" type="{urn:hl7-org:v3}PRPM_MT301010UV01.PrincipalPerson" minOccurs="0"/>
 *         &lt;element name="issuingOrganization" type="{urn:hl7-org:v3}PRPM_MT301010UV01.Organization" minOccurs="0"/>
 *         &lt;element name="subjectOf1" type="{urn:hl7-org:v3}PRPM_MT301010UV01.Subject2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectOf2" type="{urn:hl7-org:v3}PRPM_MT301010UV01.Subject3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectOf3" type="{urn:hl7-org:v3}PRPM_MT301010UV01.Subject8" minOccurs="0"/>
 *         &lt;element name="subjectOf4" type="{urn:hl7-org:v3}PRPM_MT301010UV01.Subject9" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responsibleFor" type="{urn:hl7-org:v3}PRPM_MT301010UV01.ResponsibleParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedTo" type="{urn:hl7-org:v3}PRPM_MT301010UV01.RelatedTo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassHealthcareProvider" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPM_MT301010UV01.HealthCareProvider", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "name",
    "addr",
    "telecom",
    "statusCode",
    "effectiveTime",
    "healthCarePrincipalPerson",
    "issuingOrganization",
    "subjectOf1",
    "subjectOf2",
    "subjectOf3",
    "subjectOf4",
    "responsibleFor",
    "relatedTo"
})
public class PRPMMT301010UV01HealthCareProvider {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    @XmlElement(required = true)
    protected II id;
    @XmlElement(required = true)
    protected CD code;
    protected COLLEN name;
    protected COLLAD2 addr;
    protected COLLTEL telecom;
    protected CS statusCode;
    protected IVLTS effectiveTime;
    @XmlElementRef(name = "healthCarePrincipalPerson", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT301010UV01PrincipalPerson> healthCarePrincipalPerson;
    @XmlElementRef(name = "issuingOrganization", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT301010UV01Organization> issuingOrganization;
    @XmlElement(nillable = true)
    protected List<PRPMMT301010UV01Subject2> subjectOf1;
    @XmlElement(nillable = true)
    protected List<PRPMMT301010UV01Subject3> subjectOf2;
    @XmlElementRef(name = "subjectOf3", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT301010UV01Subject8> subjectOf3;
    @XmlElement(nillable = true)
    protected List<PRPMMT301010UV01Subject9> subjectOf4;
    @XmlElement(nillable = true)
    protected List<PRPMMT301010UV01ResponsibleParty> responsibleFor;
    @XmlElement(nillable = true)
    protected List<PRPMMT301010UV01RelatedTo> relatedTo;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassHealthcareProvider classCode;

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
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setId(II value) {
        this.id = value;
    }

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCode(CD value) {
        this.code = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link COLLEN }
     *     
     */
    public COLLEN getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link COLLEN }
     *     
     */
    public void setName(COLLEN value) {
        this.name = value;
    }

    /**
     * 获取addr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link COLLAD2 }
     *     
     */
    public COLLAD2 getAddr() {
        return addr;
    }

    /**
     * 设置addr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link COLLAD2 }
     *     
     */
    public void setAddr(COLLAD2 value) {
        this.addr = value;
    }

    /**
     * 获取telecom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link COLLTEL }
     *     
     */
    public COLLTEL getTelecom() {
        return telecom;
    }

    /**
     * 设置telecom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link COLLTEL }
     *     
     */
    public void setTelecom(COLLTEL value) {
        this.telecom = value;
    }

    /**
     * 获取statusCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getStatusCode() {
        return statusCode;
    }

    /**
     * 设置statusCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setStatusCode(CS value) {
        this.statusCode = value;
    }

    /**
     * 获取effectiveTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * 设置effectiveTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setEffectiveTime(IVLTS value) {
        this.effectiveTime = value;
    }

    /**
     * 获取healthCarePrincipalPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT301010UV01PrincipalPerson }{@code >}
     *     
     */
    public JAXBElement<PRPMMT301010UV01PrincipalPerson> getHealthCarePrincipalPerson() {
        return healthCarePrincipalPerson;
    }

    /**
     * 设置healthCarePrincipalPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT301010UV01PrincipalPerson }{@code >}
     *     
     */
    public void setHealthCarePrincipalPerson(JAXBElement<PRPMMT301010UV01PrincipalPerson> value) {
        this.healthCarePrincipalPerson = value;
    }

    /**
     * 获取issuingOrganization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Organization }{@code >}
     *     
     */
    public JAXBElement<PRPMMT301010UV01Organization> getIssuingOrganization() {
        return issuingOrganization;
    }

    /**
     * 设置issuingOrganization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Organization }{@code >}
     *     
     */
    public void setIssuingOrganization(JAXBElement<PRPMMT301010UV01Organization> value) {
        this.issuingOrganization = value;
    }

    /**
     * Gets the value of the subjectOf1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT301010UV01Subject2 }
     * 
     * 
     */
    public List<PRPMMT301010UV01Subject2> getSubjectOf1() {
        if (subjectOf1 == null) {
            subjectOf1 = new ArrayList<PRPMMT301010UV01Subject2>();
        }
        return this.subjectOf1;
    }

    /**
     * Gets the value of the subjectOf2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT301010UV01Subject3 }
     * 
     * 
     */
    public List<PRPMMT301010UV01Subject3> getSubjectOf2() {
        if (subjectOf2 == null) {
            subjectOf2 = new ArrayList<PRPMMT301010UV01Subject3>();
        }
        return this.subjectOf2;
    }

    /**
     * 获取subjectOf3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Subject8 }{@code >}
     *     
     */
    public JAXBElement<PRPMMT301010UV01Subject8> getSubjectOf3() {
        return subjectOf3;
    }

    /**
     * 设置subjectOf3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Subject8 }{@code >}
     *     
     */
    public void setSubjectOf3(JAXBElement<PRPMMT301010UV01Subject8> value) {
        this.subjectOf3 = value;
    }

    /**
     * Gets the value of the subjectOf4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT301010UV01Subject9 }
     * 
     * 
     */
    public List<PRPMMT301010UV01Subject9> getSubjectOf4() {
        if (subjectOf4 == null) {
            subjectOf4 = new ArrayList<PRPMMT301010UV01Subject9>();
        }
        return this.subjectOf4;
    }

    /**
     * Gets the value of the responsibleFor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibleFor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibleFor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT301010UV01ResponsibleParty }
     * 
     * 
     */
    public List<PRPMMT301010UV01ResponsibleParty> getResponsibleFor() {
        if (responsibleFor == null) {
            responsibleFor = new ArrayList<PRPMMT301010UV01ResponsibleParty>();
        }
        return this.responsibleFor;
    }

    /**
     * Gets the value of the relatedTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT301010UV01RelatedTo }
     * 
     * 
     */
    public List<PRPMMT301010UV01RelatedTo> getRelatedTo() {
        if (relatedTo == null) {
            relatedTo = new ArrayList<PRPMMT301010UV01RelatedTo>();
        }
        return this.relatedTo;
    }

    /**
     * 获取classCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoleClassHealthcareProvider }
     *     
     */
    public RoleClassHealthcareProvider getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassHealthcareProvider }
     *     
     */
    public void setClassCode(RoleClassHealthcareProvider value) {
        this.classCode = value;
    }

}
