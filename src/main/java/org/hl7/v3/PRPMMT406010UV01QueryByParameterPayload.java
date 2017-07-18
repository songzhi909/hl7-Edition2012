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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PRPM_MT406010UV01.QueryByParameterPayload complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PRPM_MT406010UV01.QueryByParameterPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="queryId" type="{urn:hl7-org:v3}II" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="modifyCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="responseElementGroupId" type="{urn:hl7-org:v3}DSET_II" minOccurs="0"/>
 *         &lt;element name="responseModalityCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="responsePriorityCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="initialQuantity" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         &lt;element name="initialQuantityCode" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *         &lt;element name="audit" type="{urn:hl7-org:v3}PRPM_MT406010UV01.Audit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="confidence" type="{urn:hl7-org:v3}PRPM_MT406010UV01.Confidence" minOccurs="0"/>
 *         &lt;element name="history" type="{urn:hl7-org:v3}PRPM_MT406010UV01.History" minOccurs="0"/>
 *         &lt;element name="jurisdiction" type="{urn:hl7-org:v3}PRPM_MT406010UV01.Jurisdiction" minOccurs="0"/>
 *         &lt;element name="organizationAddress" type="{urn:hl7-org:v3}PRPM_MT406010UV01.OrganizationAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organizationID" type="{urn:hl7-org:v3}PRPM_MT406010UV01.OrganizationID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organizationName" type="{urn:hl7-org:v3}PRPM_MT406010UV01.OrganizationName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qualification" type="{urn:hl7-org:v3}PRPM_MT406010UV01.Qualification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responseObject" type="{urn:hl7-org:v3}PRPM_MT406010UV01.ResponseObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="roleEffectiveDate" type="{urn:hl7-org:v3}PRPM_MT406010UV01.RoleEffectiveDate" minOccurs="0"/>
 *         &lt;element name="roleType" type="{urn:hl7-org:v3}PRPM_MT406010UV01.RoleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="routedDocType" type="{urn:hl7-org:v3}PRPM_MT406010UV01.RoutedDocType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sdlcAddress" type="{urn:hl7-org:v3}PRPM_MT406010UV01.SdlcAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sdlcId" type="{urn:hl7-org:v3}PRPM_MT406010UV01.SdlcId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sdlcType" type="{urn:hl7-org:v3}PRPM_MT406010UV01.SdlcType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sortControl" type="{urn:hl7-org:v3}PRPM_MT406010UV01.SortControl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:hl7-org:v3}PRPM_MT406010UV01.Status" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="telecom" type="{urn:hl7-org:v3}PRPM_MT406010UV01.Telecom" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PRPM_MT406010UV01.QueryByParameterPayload", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "queryId",
    "statusCode",
    "modifyCode",
    "responseElementGroupId",
    "responseModalityCode",
    "responsePriorityCode",
    "initialQuantity",
    "initialQuantityCode",
    "audit",
    "confidence",
    "history",
    "jurisdiction",
    "organizationAddress",
    "organizationID",
    "organizationName",
    "qualification",
    "responseObject",
    "roleEffectiveDate",
    "roleType",
    "routedDocType",
    "sdlcAddress",
    "sdlcId",
    "sdlcType",
    "sortControl",
    "status",
    "telecom"
})
public class PRPMMT406010UV01QueryByParameterPayload {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    protected II queryId;
    @XmlElement(required = true)
    protected CS statusCode;
    protected CS modifyCode;
    protected DSETII responseElementGroupId;
    protected CS responseModalityCode;
    protected CS responsePriorityCode;
    protected INT initialQuantity;
    protected CD initialQuantityCode;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01Audit> audit;
    @XmlElementRef(name = "confidence", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT406010UV01Confidence> confidence;
    @XmlElementRef(name = "history", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT406010UV01History> history;
    @XmlElementRef(name = "jurisdiction", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT406010UV01Jurisdiction> jurisdiction;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01OrganizationAddress> organizationAddress;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01OrganizationID> organizationID;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01OrganizationName> organizationName;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01Qualification> qualification;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01ResponseObject> responseObject;
    @XmlElementRef(name = "roleEffectiveDate", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT406010UV01RoleEffectiveDate> roleEffectiveDate;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01RoleType> roleType;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01RoutedDocType> routedDocType;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01SdlcAddress> sdlcAddress;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01SdlcId> sdlcId;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01SdlcType> sdlcType;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01SortControl> sortControl;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01Status> status;
    @XmlElement(nillable = true)
    protected List<PRPMMT406010UV01Telecom> telecom;

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
     * 获取queryId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getQueryId() {
        return queryId;
    }

    /**
     * 设置queryId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setQueryId(II value) {
        this.queryId = value;
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
     * 获取modifyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getModifyCode() {
        return modifyCode;
    }

    /**
     * 设置modifyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setModifyCode(CS value) {
        this.modifyCode = value;
    }

    /**
     * 获取responseElementGroupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DSETII }
     *     
     */
    public DSETII getResponseElementGroupId() {
        return responseElementGroupId;
    }

    /**
     * 设置responseElementGroupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DSETII }
     *     
     */
    public void setResponseElementGroupId(DSETII value) {
        this.responseElementGroupId = value;
    }

    /**
     * 获取responseModalityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getResponseModalityCode() {
        return responseModalityCode;
    }

    /**
     * 设置responseModalityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setResponseModalityCode(CS value) {
        this.responseModalityCode = value;
    }

    /**
     * 获取responsePriorityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getResponsePriorityCode() {
        return responsePriorityCode;
    }

    /**
     * 设置responsePriorityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setResponsePriorityCode(CS value) {
        this.responsePriorityCode = value;
    }

    /**
     * 获取initialQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getInitialQuantity() {
        return initialQuantity;
    }

    /**
     * 设置initialQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setInitialQuantity(INT value) {
        this.initialQuantity = value;
    }

    /**
     * 获取initialQuantityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getInitialQuantityCode() {
        return initialQuantityCode;
    }

    /**
     * 设置initialQuantityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setInitialQuantityCode(CD value) {
        this.initialQuantityCode = value;
    }

    /**
     * Gets the value of the audit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01Audit }
     * 
     * 
     */
    public List<PRPMMT406010UV01Audit> getAudit() {
        if (audit == null) {
            audit = new ArrayList<PRPMMT406010UV01Audit>();
        }
        return this.audit;
    }

    /**
     * 获取confidence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT406010UV01Confidence }{@code >}
     *     
     */
    public JAXBElement<PRPMMT406010UV01Confidence> getConfidence() {
        return confidence;
    }

    /**
     * 设置confidence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT406010UV01Confidence }{@code >}
     *     
     */
    public void setConfidence(JAXBElement<PRPMMT406010UV01Confidence> value) {
        this.confidence = value;
    }

    /**
     * 获取history属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT406010UV01History }{@code >}
     *     
     */
    public JAXBElement<PRPMMT406010UV01History> getHistory() {
        return history;
    }

    /**
     * 设置history属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT406010UV01History }{@code >}
     *     
     */
    public void setHistory(JAXBElement<PRPMMT406010UV01History> value) {
        this.history = value;
    }

    /**
     * 获取jurisdiction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT406010UV01Jurisdiction }{@code >}
     *     
     */
    public JAXBElement<PRPMMT406010UV01Jurisdiction> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * 设置jurisdiction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT406010UV01Jurisdiction }{@code >}
     *     
     */
    public void setJurisdiction(JAXBElement<PRPMMT406010UV01Jurisdiction> value) {
        this.jurisdiction = value;
    }

    /**
     * Gets the value of the organizationAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01OrganizationAddress }
     * 
     * 
     */
    public List<PRPMMT406010UV01OrganizationAddress> getOrganizationAddress() {
        if (organizationAddress == null) {
            organizationAddress = new ArrayList<PRPMMT406010UV01OrganizationAddress>();
        }
        return this.organizationAddress;
    }

    /**
     * Gets the value of the organizationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01OrganizationID }
     * 
     * 
     */
    public List<PRPMMT406010UV01OrganizationID> getOrganizationID() {
        if (organizationID == null) {
            organizationID = new ArrayList<PRPMMT406010UV01OrganizationID>();
        }
        return this.organizationID;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01OrganizationName }
     * 
     * 
     */
    public List<PRPMMT406010UV01OrganizationName> getOrganizationName() {
        if (organizationName == null) {
            organizationName = new ArrayList<PRPMMT406010UV01OrganizationName>();
        }
        return this.organizationName;
    }

    /**
     * Gets the value of the qualification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01Qualification }
     * 
     * 
     */
    public List<PRPMMT406010UV01Qualification> getQualification() {
        if (qualification == null) {
            qualification = new ArrayList<PRPMMT406010UV01Qualification>();
        }
        return this.qualification;
    }

    /**
     * Gets the value of the responseObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01ResponseObject }
     * 
     * 
     */
    public List<PRPMMT406010UV01ResponseObject> getResponseObject() {
        if (responseObject == null) {
            responseObject = new ArrayList<PRPMMT406010UV01ResponseObject>();
        }
        return this.responseObject;
    }

    /**
     * 获取roleEffectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT406010UV01RoleEffectiveDate }{@code >}
     *     
     */
    public JAXBElement<PRPMMT406010UV01RoleEffectiveDate> getRoleEffectiveDate() {
        return roleEffectiveDate;
    }

    /**
     * 设置roleEffectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT406010UV01RoleEffectiveDate }{@code >}
     *     
     */
    public void setRoleEffectiveDate(JAXBElement<PRPMMT406010UV01RoleEffectiveDate> value) {
        this.roleEffectiveDate = value;
    }

    /**
     * Gets the value of the roleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01RoleType }
     * 
     * 
     */
    public List<PRPMMT406010UV01RoleType> getRoleType() {
        if (roleType == null) {
            roleType = new ArrayList<PRPMMT406010UV01RoleType>();
        }
        return this.roleType;
    }

    /**
     * Gets the value of the routedDocType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routedDocType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutedDocType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01RoutedDocType }
     * 
     * 
     */
    public List<PRPMMT406010UV01RoutedDocType> getRoutedDocType() {
        if (routedDocType == null) {
            routedDocType = new ArrayList<PRPMMT406010UV01RoutedDocType>();
        }
        return this.routedDocType;
    }

    /**
     * Gets the value of the sdlcAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdlcAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdlcAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01SdlcAddress }
     * 
     * 
     */
    public List<PRPMMT406010UV01SdlcAddress> getSdlcAddress() {
        if (sdlcAddress == null) {
            sdlcAddress = new ArrayList<PRPMMT406010UV01SdlcAddress>();
        }
        return this.sdlcAddress;
    }

    /**
     * Gets the value of the sdlcId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdlcId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdlcId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01SdlcId }
     * 
     * 
     */
    public List<PRPMMT406010UV01SdlcId> getSdlcId() {
        if (sdlcId == null) {
            sdlcId = new ArrayList<PRPMMT406010UV01SdlcId>();
        }
        return this.sdlcId;
    }

    /**
     * Gets the value of the sdlcType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdlcType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdlcType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01SdlcType }
     * 
     * 
     */
    public List<PRPMMT406010UV01SdlcType> getSdlcType() {
        if (sdlcType == null) {
            sdlcType = new ArrayList<PRPMMT406010UV01SdlcType>();
        }
        return this.sdlcType;
    }

    /**
     * Gets the value of the sortControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01SortControl }
     * 
     * 
     */
    public List<PRPMMT406010UV01SortControl> getSortControl() {
        if (sortControl == null) {
            sortControl = new ArrayList<PRPMMT406010UV01SortControl>();
        }
        return this.sortControl;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01Status }
     * 
     * 
     */
    public List<PRPMMT406010UV01Status> getStatus() {
        if (status == null) {
            status = new ArrayList<PRPMMT406010UV01Status>();
        }
        return this.status;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT406010UV01Telecom }
     * 
     * 
     */
    public List<PRPMMT406010UV01Telecom> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<PRPMMT406010UV01Telecom>();
        }
        return this.telecom;
    }

}
