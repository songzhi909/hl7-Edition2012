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
 * <p>PRPA_MT201302UV02.Patient complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PRPA_MT201302UV02.Patient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II"/>
 *         &lt;element name="addr" type="{urn:hl7-org:v3}COLL_AD" minOccurs="0"/>
 *         &lt;element name="telecom" type="{urn:hl7-org:v3}COLL_TEL" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;element name="confidentialityCode" type="{urn:hl7-org:v3}DSET_CD" minOccurs="0"/>
 *         &lt;element name="veryImportantPersonCode" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="patientPerson" type="{urn:hl7-org:v3}PRPA_MT201302UV02.Patient.patientPerson"/>
 *           &lt;element name="patientNonPersonLivingSubject" type="{urn:hl7-org:v3}PRPA_MT201302UV02.Patient.patientNonPersonLivingSubject"/>
 *         &lt;/choice>
 *         &lt;element name="providerOrganization" type="{urn:hl7-org:v3}COCT_MT150003UV03.Organization" minOccurs="0"/>
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}PRPA_MT201302UV02.Subject4" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coveredPartyOf" type="{urn:hl7-org:v3}PRPA_MT201302UV02.CoveredParty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassPatient" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_MT201302UV02.Patient", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "addr",
    "telecom",
    "statusCode",
    "effectiveTime",
    "confidentialityCode",
    "veryImportantPersonCode",
    "patientPerson",
    "patientNonPersonLivingSubject",
    "providerOrganization",
    "subjectOf",
    "coveredPartyOf"
})
public class PRPAMT201302UV02Patient {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    @XmlElement(required = true)
    protected II id;
    protected COLLAD addr;
    protected COLLTEL telecom;
    @XmlElement(required = true)
    protected CS statusCode;
    protected IVLTS effectiveTime;
    protected DSETCD confidentialityCode;
    protected CD veryImportantPersonCode;
    @XmlElementRef(name = "patientPerson", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPAMT201302UV02PatientPatientPerson> patientPerson;
    @XmlElementRef(name = "patientNonPersonLivingSubject", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPAMT201302UV02PatientPatientNonPersonLivingSubject> patientNonPersonLivingSubject;
    @XmlElementRef(name = "providerOrganization", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT150003UV03Organization> providerOrganization;
    @XmlElement(nillable = true)
    protected List<PRPAMT201302UV02Subject4> subjectOf;
    @XmlElement(nillable = true)
    protected List<PRPAMT201302UV02CoveredParty> coveredPartyOf;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassPatient classCode;

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
     * 获取addr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link COLLAD }
     *     
     */
    public COLLAD getAddr() {
        return addr;
    }

    /**
     * 设置addr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link COLLAD }
     *     
     */
    public void setAddr(COLLAD value) {
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
     * 获取confidentialityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DSETCD }
     *     
     */
    public DSETCD getConfidentialityCode() {
        return confidentialityCode;
    }

    /**
     * 设置confidentialityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DSETCD }
     *     
     */
    public void setConfidentialityCode(DSETCD value) {
        this.confidentialityCode = value;
    }

    /**
     * 获取veryImportantPersonCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getVeryImportantPersonCode() {
        return veryImportantPersonCode;
    }

    /**
     * 设置veryImportantPersonCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setVeryImportantPersonCode(CD value) {
        this.veryImportantPersonCode = value;
    }

    /**
     * 获取patientPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPAMT201302UV02PatientPatientPerson }{@code >}
     *     
     */
    public JAXBElement<PRPAMT201302UV02PatientPatientPerson> getPatientPerson() {
        return patientPerson;
    }

    /**
     * 设置patientPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPAMT201302UV02PatientPatientPerson }{@code >}
     *     
     */
    public void setPatientPerson(JAXBElement<PRPAMT201302UV02PatientPatientPerson> value) {
        this.patientPerson = value;
    }

    /**
     * 获取patientNonPersonLivingSubject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPAMT201302UV02PatientPatientNonPersonLivingSubject }{@code >}
     *     
     */
    public JAXBElement<PRPAMT201302UV02PatientPatientNonPersonLivingSubject> getPatientNonPersonLivingSubject() {
        return patientNonPersonLivingSubject;
    }

    /**
     * 设置patientNonPersonLivingSubject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPAMT201302UV02PatientPatientNonPersonLivingSubject }{@code >}
     *     
     */
    public void setPatientNonPersonLivingSubject(JAXBElement<PRPAMT201302UV02PatientPatientNonPersonLivingSubject> value) {
        this.patientNonPersonLivingSubject = value;
    }

    /**
     * 获取providerOrganization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}
     *     
     */
    public JAXBElement<COCTMT150003UV03Organization> getProviderOrganization() {
        return providerOrganization;
    }

    /**
     * 设置providerOrganization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}
     *     
     */
    public void setProviderOrganization(JAXBElement<COCTMT150003UV03Organization> value) {
        this.providerOrganization = value;
    }

    /**
     * Gets the value of the subjectOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201302UV02Subject4 }
     * 
     * 
     */
    public List<PRPAMT201302UV02Subject4> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<PRPAMT201302UV02Subject4>();
        }
        return this.subjectOf;
    }

    /**
     * Gets the value of the coveredPartyOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveredPartyOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveredPartyOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201302UV02CoveredParty }
     * 
     * 
     */
    public List<PRPAMT201302UV02CoveredParty> getCoveredPartyOf() {
        if (coveredPartyOf == null) {
            coveredPartyOf = new ArrayList<PRPAMT201302UV02CoveredParty>();
        }
        return this.coveredPartyOf;
    }

    /**
     * 获取classCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoleClassPatient }
     *     
     */
    public RoleClassPatient getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassPatient }
     *     
     */
    public void setClassCode(RoleClassPatient value) {
        this.classCode = value;
    }

}
