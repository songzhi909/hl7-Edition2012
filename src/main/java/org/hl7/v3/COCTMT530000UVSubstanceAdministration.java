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
 * <p>COCT_MT530000UV.SubstanceAdministration complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="COCT_MT530000UV.SubstanceAdministration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}DSET_II" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *         &lt;element name="text" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}QSET_TS" minOccurs="0"/>
 *         &lt;element name="availabilityTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/>
 *         &lt;element name="priorityCode" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *         &lt;element name="confidentialityCode" type="{urn:hl7-org:v3}DSET_CD" minOccurs="0"/>
 *         &lt;element name="repeatNumber" type="{urn:hl7-org:v3}IVL_INT" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *         &lt;element name="approachSiteCode" type="{urn:hl7-org:v3}DSET_CD" minOccurs="0"/>
 *         &lt;element name="routeCode" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *         &lt;element name="doseQuantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *         &lt;element name="rateQuantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *         &lt;element name="doseCheckQuantity" type="{urn:hl7-org:v3}DSET_RTO" minOccurs="0"/>
 *         &lt;element name="maxDoseQuantity" type="{urn:hl7-org:v3}RTO" minOccurs="0"/>
 *         &lt;element name="administrationUnitCode" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *         &lt;element name="subject" type="{urn:hl7-org:v3}COCT_MT530000UV.Subject2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="consumable" type="{urn:hl7-org:v3}COCT_MT530000UV.Consumable" minOccurs="0"/>
 *         &lt;element name="recordTarget" type="{urn:hl7-org:v3}COCT_MT530000UV.RecordTarget" minOccurs="0"/>
 *         &lt;element name="responsibleParty" type="{urn:hl7-org:v3}COCT_MT530000UV.ResponsibleParty2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="performer" type="{urn:hl7-org:v3}COCT_MT530000UV.Performer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="author" type="{urn:hl7-org:v3}COCT_MT530000UV.Author" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataEnterer" type="{urn:hl7-org:v3}COCT_MT530000UV.DataEnterer" minOccurs="0"/>
 *         &lt;element name="informant" type="{urn:hl7-org:v3}COCT_MT530000UV.Informant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verifier" type="{urn:hl7-org:v3}COCT_MT530000UV.Verifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:hl7-org:v3}COCT_MT530000UV.Location" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="definition" type="{urn:hl7-org:v3}COCT_MT530000UV.Definition" minOccurs="0"/>
 *         &lt;element name="conditions" type="{urn:hl7-org:v3}COCT_MT530000UV.Conditions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outboundRelationship1" type="{urn:hl7-org:v3}COCT_MT530000UV.SourceOf1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outboundRelationship2" type="{urn:hl7-org:v3}COCT_MT530000UV.SourceOf3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}COCT_MT530000UV.Subject1" minOccurs="0"/>
 *         &lt;element name="inboundRelationship" type="{urn:hl7-org:v3}COCT_MT530000UV.SourceOf2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}ActClassSubstanceAdministration" />
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}x_ClinicalStatementSubstanceMood" />
 *       &lt;attribute name="negationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT530000UV.SubstanceAdministration", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "text",
    "statusCode",
    "effectiveTime",
    "availabilityTime",
    "priorityCode",
    "confidentialityCode",
    "repeatNumber",
    "languageCode",
    "approachSiteCode",
    "routeCode",
    "doseQuantity",
    "rateQuantity",
    "doseCheckQuantity",
    "maxDoseQuantity",
    "administrationUnitCode",
    "subject",
    "consumable",
    "recordTarget",
    "responsibleParty",
    "performer",
    "author",
    "dataEnterer",
    "informant",
    "verifier",
    "location",
    "definition",
    "conditions",
    "outboundRelationship1",
    "outboundRelationship2",
    "subjectOf",
    "inboundRelationship"
})
public class COCTMT530000UVSubstanceAdministration {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    protected DSETII id;
    protected CD code;
    protected ED text;
    protected CS statusCode;
    protected QSETTS effectiveTime;
    protected TS availabilityTime;
    protected CD priorityCode;
    protected DSETCD confidentialityCode;
    protected IVLINT repeatNumber;
    protected CD languageCode;
    protected DSETCD approachSiteCode;
    protected CD routeCode;
    protected PQ doseQuantity;
    protected PQ rateQuantity;
    protected DSETRTO doseCheckQuantity;
    protected RTO maxDoseQuantity;
    protected CD administrationUnitCode;
    @XmlElement(nillable = true)
    protected List<COCTMT530000UVSubject2> subject;
    @XmlElementRef(name = "consumable", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVConsumable> consumable;
    @XmlElementRef(name = "recordTarget", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVRecordTarget> recordTarget;
    @XmlElement(nillable = true)
    protected List<COCTMT530000UVResponsibleParty2> responsibleParty;
    @XmlElement(nillable = true)
    protected List<COCTMT530000UVPerformer> performer;
    @XmlElement(nillable = true)
    protected List<COCTMT530000UVAuthor> author;
    @XmlElementRef(name = "dataEnterer", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVDataEnterer> dataEnterer;
    @XmlElement(nillable = true)
    protected List<COCTMT530000UVInformant> informant;
    @XmlElement(nillable = true)
    protected List<COCTMT530000UVVerifier> verifier;
    @XmlElement(nillable = true)
    protected List<COCTMT530000UVLocation> location;
    @XmlElementRef(name = "definition", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVDefinition> definition;
    @XmlElement(nillable = true)
    protected List<COCTMT530000UVConditions> conditions;
    @XmlElement(nillable = true)
    protected List<COCTMT530000UVSourceOf1> outboundRelationship1;
    @XmlElement(nillable = true)
    protected List<COCTMT530000UVSourceOf3> outboundRelationship2;
    @XmlElementRef(name = "subjectOf", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVSubject1> subjectOf;
    @XmlElement(nillable = true)
    protected List<COCTMT530000UVSourceOf2> inboundRelationship;
    @XmlAttribute(name = "classCode", required = true)
    protected ActClassSubstanceAdministration classCode;
    @XmlAttribute(name = "moodCode", required = true)
    protected XClinicalStatementSubstanceMood moodCode;
    @XmlAttribute(name = "negationInd")
    protected Boolean negationInd;

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
     *     {@link DSETII }
     *     
     */
    public DSETII getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DSETII }
     *     
     */
    public void setId(DSETII value) {
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
     * 获取text属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getText() {
        return text;
    }

    /**
     * 设置text属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setText(ED value) {
        this.text = value;
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
     *     {@link QSETTS }
     *     
     */
    public QSETTS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * 设置effectiveTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTS }
     *     
     */
    public void setEffectiveTime(QSETTS value) {
        this.effectiveTime = value;
    }

    /**
     * 获取availabilityTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getAvailabilityTime() {
        return availabilityTime;
    }

    /**
     * 设置availabilityTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setAvailabilityTime(TS value) {
        this.availabilityTime = value;
    }

    /**
     * 获取priorityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getPriorityCode() {
        return priorityCode;
    }

    /**
     * 设置priorityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setPriorityCode(CD value) {
        this.priorityCode = value;
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
     * 获取repeatNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IVLINT }
     *     
     */
    public IVLINT getRepeatNumber() {
        return repeatNumber;
    }

    /**
     * 设置repeatNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IVLINT }
     *     
     */
    public void setRepeatNumber(IVLINT value) {
        this.repeatNumber = value;
    }

    /**
     * 获取languageCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getLanguageCode() {
        return languageCode;
    }

    /**
     * 设置languageCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setLanguageCode(CD value) {
        this.languageCode = value;
    }

    /**
     * 获取approachSiteCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DSETCD }
     *     
     */
    public DSETCD getApproachSiteCode() {
        return approachSiteCode;
    }

    /**
     * 设置approachSiteCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DSETCD }
     *     
     */
    public void setApproachSiteCode(DSETCD value) {
        this.approachSiteCode = value;
    }

    /**
     * 获取routeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getRouteCode() {
        return routeCode;
    }

    /**
     * 设置routeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setRouteCode(CD value) {
        this.routeCode = value;
    }

    /**
     * 获取doseQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getDoseQuantity() {
        return doseQuantity;
    }

    /**
     * 设置doseQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setDoseQuantity(PQ value) {
        this.doseQuantity = value;
    }

    /**
     * 获取rateQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getRateQuantity() {
        return rateQuantity;
    }

    /**
     * 设置rateQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setRateQuantity(PQ value) {
        this.rateQuantity = value;
    }

    /**
     * 获取doseCheckQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DSETRTO }
     *     
     */
    public DSETRTO getDoseCheckQuantity() {
        return doseCheckQuantity;
    }

    /**
     * 设置doseCheckQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DSETRTO }
     *     
     */
    public void setDoseCheckQuantity(DSETRTO value) {
        this.doseCheckQuantity = value;
    }

    /**
     * 获取maxDoseQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RTO }
     *     
     */
    public RTO getMaxDoseQuantity() {
        return maxDoseQuantity;
    }

    /**
     * 设置maxDoseQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RTO }
     *     
     */
    public void setMaxDoseQuantity(RTO value) {
        this.maxDoseQuantity = value;
    }

    /**
     * 获取administrationUnitCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getAdministrationUnitCode() {
        return administrationUnitCode;
    }

    /**
     * 设置administrationUnitCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setAdministrationUnitCode(CD value) {
        this.administrationUnitCode = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT530000UVSubject2 }
     * 
     * 
     */
    public List<COCTMT530000UVSubject2> getSubject() {
        if (subject == null) {
            subject = new ArrayList<COCTMT530000UVSubject2>();
        }
        return this.subject;
    }

    /**
     * 获取consumable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVConsumable }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVConsumable> getConsumable() {
        return consumable;
    }

    /**
     * 设置consumable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVConsumable }{@code >}
     *     
     */
    public void setConsumable(JAXBElement<COCTMT530000UVConsumable> value) {
        this.consumable = value;
    }

    /**
     * 获取recordTarget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVRecordTarget> getRecordTarget() {
        return recordTarget;
    }

    /**
     * 设置recordTarget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}
     *     
     */
    public void setRecordTarget(JAXBElement<COCTMT530000UVRecordTarget> value) {
        this.recordTarget = value;
    }

    /**
     * Gets the value of the responsibleParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibleParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibleParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT530000UVResponsibleParty2 }
     * 
     * 
     */
    public List<COCTMT530000UVResponsibleParty2> getResponsibleParty() {
        if (responsibleParty == null) {
            responsibleParty = new ArrayList<COCTMT530000UVResponsibleParty2>();
        }
        return this.responsibleParty;
    }

    /**
     * Gets the value of the performer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT530000UVPerformer }
     * 
     * 
     */
    public List<COCTMT530000UVPerformer> getPerformer() {
        if (performer == null) {
            performer = new ArrayList<COCTMT530000UVPerformer>();
        }
        return this.performer;
    }

    /**
     * Gets the value of the author property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the author property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT530000UVAuthor }
     * 
     * 
     */
    public List<COCTMT530000UVAuthor> getAuthor() {
        if (author == null) {
            author = new ArrayList<COCTMT530000UVAuthor>();
        }
        return this.author;
    }

    /**
     * 获取dataEnterer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVDataEnterer> getDataEnterer() {
        return dataEnterer;
    }

    /**
     * 设置dataEnterer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}
     *     
     */
    public void setDataEnterer(JAXBElement<COCTMT530000UVDataEnterer> value) {
        this.dataEnterer = value;
    }

    /**
     * Gets the value of the informant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT530000UVInformant }
     * 
     * 
     */
    public List<COCTMT530000UVInformant> getInformant() {
        if (informant == null) {
            informant = new ArrayList<COCTMT530000UVInformant>();
        }
        return this.informant;
    }

    /**
     * Gets the value of the verifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT530000UVVerifier }
     * 
     * 
     */
    public List<COCTMT530000UVVerifier> getVerifier() {
        if (verifier == null) {
            verifier = new ArrayList<COCTMT530000UVVerifier>();
        }
        return this.verifier;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT530000UVLocation }
     * 
     * 
     */
    public List<COCTMT530000UVLocation> getLocation() {
        if (location == null) {
            location = new ArrayList<COCTMT530000UVLocation>();
        }
        return this.location;
    }

    /**
     * 获取definition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVDefinition> getDefinition() {
        return definition;
    }

    /**
     * 设置definition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}
     *     
     */
    public void setDefinition(JAXBElement<COCTMT530000UVDefinition> value) {
        this.definition = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT530000UVConditions }
     * 
     * 
     */
    public List<COCTMT530000UVConditions> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<COCTMT530000UVConditions>();
        }
        return this.conditions;
    }

    /**
     * Gets the value of the outboundRelationship1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outboundRelationship1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutboundRelationship1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT530000UVSourceOf1 }
     * 
     * 
     */
    public List<COCTMT530000UVSourceOf1> getOutboundRelationship1() {
        if (outboundRelationship1 == null) {
            outboundRelationship1 = new ArrayList<COCTMT530000UVSourceOf1>();
        }
        return this.outboundRelationship1;
    }

    /**
     * Gets the value of the outboundRelationship2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outboundRelationship2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutboundRelationship2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT530000UVSourceOf3 }
     * 
     * 
     */
    public List<COCTMT530000UVSourceOf3> getOutboundRelationship2() {
        if (outboundRelationship2 == null) {
            outboundRelationship2 = new ArrayList<COCTMT530000UVSourceOf3>();
        }
        return this.outboundRelationship2;
    }

    /**
     * 获取subjectOf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVSubject1> getSubjectOf() {
        return subjectOf;
    }

    /**
     * 设置subjectOf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}
     *     
     */
    public void setSubjectOf(JAXBElement<COCTMT530000UVSubject1> value) {
        this.subjectOf = value;
    }

    /**
     * Gets the value of the inboundRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inboundRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInboundRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT530000UVSourceOf2 }
     * 
     * 
     */
    public List<COCTMT530000UVSourceOf2> getInboundRelationship() {
        if (inboundRelationship == null) {
            inboundRelationship = new ArrayList<COCTMT530000UVSourceOf2>();
        }
        return this.inboundRelationship;
    }

    /**
     * 获取classCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActClassSubstanceAdministration }
     *     
     */
    public ActClassSubstanceAdministration getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActClassSubstanceAdministration }
     *     
     */
    public void setClassCode(ActClassSubstanceAdministration value) {
        this.classCode = value;
    }

    /**
     * 获取moodCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XClinicalStatementSubstanceMood }
     *     
     */
    public XClinicalStatementSubstanceMood getMoodCode() {
        return moodCode;
    }

    /**
     * 设置moodCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XClinicalStatementSubstanceMood }
     *     
     */
    public void setMoodCode(XClinicalStatementSubstanceMood value) {
        this.moodCode = value;
    }

    /**
     * 获取negationInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegationInd() {
        return negationInd;
    }

    /**
     * 设置negationInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegationInd(Boolean value) {
        this.negationInd = value;
    }

}
