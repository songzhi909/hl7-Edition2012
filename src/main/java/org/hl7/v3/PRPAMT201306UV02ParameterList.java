//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.13 时间 05:16:19 PM CST 
//


package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PRPA_MT201306UV02.ParameterList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PRPA_MT201306UV02.ParameterList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" minOccurs="0"/>
 *         &lt;element name="livingSubjectAdministrativeGender" type="{urn:hl7-org:v3}PRPA_MT201306UV02.LivingSubjectAdministrativeGender" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="livingSubjectBirthPlaceAddress" type="{urn:hl7-org:v3}PRPA_MT201306UV02.LivingSubjectBirthPlaceAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="livingSubjectBirthPlaceName" type="{urn:hl7-org:v3}PRPA_MT201306UV02.LivingSubjectBirthPlaceName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="livingSubjectBirthTime" type="{urn:hl7-org:v3}PRPA_MT201306UV02.LivingSubjectBirthTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="livingSubjectDeceasedTime" type="{urn:hl7-org:v3}PRPA_MT201306UV02.LivingSubjectDeceasedTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="livingSubjectId" type="{urn:hl7-org:v3}PRPA_MT201306UV02.LivingSubjectId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="livingSubjectName" type="{urn:hl7-org:v3}PRPA_MT201306UV02.LivingSubjectName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mothersMaidenName" type="{urn:hl7-org:v3}PRPA_MT201306UV02.MothersMaidenName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherIDsScopingOrganization" type="{urn:hl7-org:v3}PRPA_MT201306UV02.OtherIDsScopingOrganization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patientAddress" type="{urn:hl7-org:v3}PRPA_MT201306UV02.PatientAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patientStatusCode" type="{urn:hl7-org:v3}PRPA_MT201306UV02.PatientStatusCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patientTelecom" type="{urn:hl7-org:v3}PRPA_MT201306UV02.PatientTelecom" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="principalCareProviderId" type="{urn:hl7-org:v3}PRPA_MT201306UV02.PrincipalCareProviderId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="principalCareProvisionId" type="{urn:hl7-org:v3}PRPA_MT201306UV02.PrincipalCareProvisionId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_MT201306UV02.ParameterList", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "livingSubjectAdministrativeGender",
    "livingSubjectBirthPlaceAddress",
    "livingSubjectBirthPlaceName",
    "livingSubjectBirthTime",
    "livingSubjectDeceasedTime",
    "livingSubjectId",
    "livingSubjectName",
    "mothersMaidenName",
    "otherIDsScopingOrganization",
    "patientAddress",
    "patientStatusCode",
    "patientTelecom",
    "principalCareProviderId",
    "principalCareProvisionId"
})
public class PRPAMT201306UV02ParameterList {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    protected II id;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02LivingSubjectAdministrativeGender> livingSubjectAdministrativeGender;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02LivingSubjectBirthPlaceAddress> livingSubjectBirthPlaceAddress;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02LivingSubjectBirthPlaceName> livingSubjectBirthPlaceName;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02LivingSubjectBirthTime> livingSubjectBirthTime;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02LivingSubjectDeceasedTime> livingSubjectDeceasedTime;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02LivingSubjectId> livingSubjectId;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02LivingSubjectName> livingSubjectName;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02MothersMaidenName> mothersMaidenName;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02OtherIDsScopingOrganization> otherIDsScopingOrganization;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02PatientAddress> patientAddress;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02PatientStatusCode> patientStatusCode;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02PatientTelecom> patientTelecom;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02PrincipalCareProviderId> principalCareProviderId;
    @XmlElement(nillable = true)
    protected List<PRPAMT201306UV02PrincipalCareProvisionId> principalCareProvisionId;

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
     * Gets the value of the livingSubjectAdministrativeGender property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livingSubjectAdministrativeGender property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivingSubjectAdministrativeGender().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02LivingSubjectAdministrativeGender }
     * 
     * 
     */
    public List<PRPAMT201306UV02LivingSubjectAdministrativeGender> getLivingSubjectAdministrativeGender() {
        if (livingSubjectAdministrativeGender == null) {
            livingSubjectAdministrativeGender = new ArrayList<PRPAMT201306UV02LivingSubjectAdministrativeGender>();
        }
        return this.livingSubjectAdministrativeGender;
    }

    /**
     * Gets the value of the livingSubjectBirthPlaceAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livingSubjectBirthPlaceAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivingSubjectBirthPlaceAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02LivingSubjectBirthPlaceAddress }
     * 
     * 
     */
    public List<PRPAMT201306UV02LivingSubjectBirthPlaceAddress> getLivingSubjectBirthPlaceAddress() {
        if (livingSubjectBirthPlaceAddress == null) {
            livingSubjectBirthPlaceAddress = new ArrayList<PRPAMT201306UV02LivingSubjectBirthPlaceAddress>();
        }
        return this.livingSubjectBirthPlaceAddress;
    }

    /**
     * Gets the value of the livingSubjectBirthPlaceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livingSubjectBirthPlaceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivingSubjectBirthPlaceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02LivingSubjectBirthPlaceName }
     * 
     * 
     */
    public List<PRPAMT201306UV02LivingSubjectBirthPlaceName> getLivingSubjectBirthPlaceName() {
        if (livingSubjectBirthPlaceName == null) {
            livingSubjectBirthPlaceName = new ArrayList<PRPAMT201306UV02LivingSubjectBirthPlaceName>();
        }
        return this.livingSubjectBirthPlaceName;
    }

    /**
     * Gets the value of the livingSubjectBirthTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livingSubjectBirthTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivingSubjectBirthTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02LivingSubjectBirthTime }
     * 
     * 
     */
    public List<PRPAMT201306UV02LivingSubjectBirthTime> getLivingSubjectBirthTime() {
        if (livingSubjectBirthTime == null) {
            livingSubjectBirthTime = new ArrayList<PRPAMT201306UV02LivingSubjectBirthTime>();
        }
        return this.livingSubjectBirthTime;
    }

    /**
     * Gets the value of the livingSubjectDeceasedTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livingSubjectDeceasedTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivingSubjectDeceasedTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02LivingSubjectDeceasedTime }
     * 
     * 
     */
    public List<PRPAMT201306UV02LivingSubjectDeceasedTime> getLivingSubjectDeceasedTime() {
        if (livingSubjectDeceasedTime == null) {
            livingSubjectDeceasedTime = new ArrayList<PRPAMT201306UV02LivingSubjectDeceasedTime>();
        }
        return this.livingSubjectDeceasedTime;
    }

    /**
     * Gets the value of the livingSubjectId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livingSubjectId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivingSubjectId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02LivingSubjectId }
     * 
     * 
     */
    public List<PRPAMT201306UV02LivingSubjectId> getLivingSubjectId() {
        if (livingSubjectId == null) {
            livingSubjectId = new ArrayList<PRPAMT201306UV02LivingSubjectId>();
        }
        return this.livingSubjectId;
    }

    /**
     * Gets the value of the livingSubjectName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livingSubjectName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivingSubjectName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02LivingSubjectName }
     * 
     * 
     */
    public List<PRPAMT201306UV02LivingSubjectName> getLivingSubjectName() {
        if (livingSubjectName == null) {
            livingSubjectName = new ArrayList<PRPAMT201306UV02LivingSubjectName>();
        }
        return this.livingSubjectName;
    }

    /**
     * Gets the value of the mothersMaidenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mothersMaidenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMothersMaidenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02MothersMaidenName }
     * 
     * 
     */
    public List<PRPAMT201306UV02MothersMaidenName> getMothersMaidenName() {
        if (mothersMaidenName == null) {
            mothersMaidenName = new ArrayList<PRPAMT201306UV02MothersMaidenName>();
        }
        return this.mothersMaidenName;
    }

    /**
     * Gets the value of the otherIDsScopingOrganization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherIDsScopingOrganization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherIDsScopingOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02OtherIDsScopingOrganization }
     * 
     * 
     */
    public List<PRPAMT201306UV02OtherIDsScopingOrganization> getOtherIDsScopingOrganization() {
        if (otherIDsScopingOrganization == null) {
            otherIDsScopingOrganization = new ArrayList<PRPAMT201306UV02OtherIDsScopingOrganization>();
        }
        return this.otherIDsScopingOrganization;
    }

    /**
     * Gets the value of the patientAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patientAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatientAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02PatientAddress }
     * 
     * 
     */
    public List<PRPAMT201306UV02PatientAddress> getPatientAddress() {
        if (patientAddress == null) {
            patientAddress = new ArrayList<PRPAMT201306UV02PatientAddress>();
        }
        return this.patientAddress;
    }

    /**
     * Gets the value of the patientStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patientStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatientStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02PatientStatusCode }
     * 
     * 
     */
    public List<PRPAMT201306UV02PatientStatusCode> getPatientStatusCode() {
        if (patientStatusCode == null) {
            patientStatusCode = new ArrayList<PRPAMT201306UV02PatientStatusCode>();
        }
        return this.patientStatusCode;
    }

    /**
     * Gets the value of the patientTelecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patientTelecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatientTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02PatientTelecom }
     * 
     * 
     */
    public List<PRPAMT201306UV02PatientTelecom> getPatientTelecom() {
        if (patientTelecom == null) {
            patientTelecom = new ArrayList<PRPAMT201306UV02PatientTelecom>();
        }
        return this.patientTelecom;
    }

    /**
     * Gets the value of the principalCareProviderId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalCareProviderId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalCareProviderId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02PrincipalCareProviderId }
     * 
     * 
     */
    public List<PRPAMT201306UV02PrincipalCareProviderId> getPrincipalCareProviderId() {
        if (principalCareProviderId == null) {
            principalCareProviderId = new ArrayList<PRPAMT201306UV02PrincipalCareProviderId>();
        }
        return this.principalCareProviderId;
    }

    /**
     * Gets the value of the principalCareProvisionId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalCareProvisionId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalCareProvisionId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPAMT201306UV02PrincipalCareProvisionId }
     * 
     * 
     */
    public List<PRPAMT201306UV02PrincipalCareProvisionId> getPrincipalCareProvisionId() {
        if (principalCareProvisionId == null) {
            principalCareProvisionId = new ArrayList<PRPAMT201306UV02PrincipalCareProvisionId>();
        }
        return this.principalCareProvisionId;
    }

}
