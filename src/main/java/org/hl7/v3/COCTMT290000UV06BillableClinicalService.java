//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.13 时间 05:16:19 PM CST 
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
 * <p>COCT_MT290000UV06.BillableClinicalService complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="COCT_MT290000UV06.BillableClinicalService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}DSET_II" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS"/>
 *         &lt;element name="priorityCode" type="{urn:hl7-org:v3}DSET_CD" minOccurs="0"/>
 *         &lt;element name="confidentialityCode" type="{urn:hl7-org:v3}DSET_CD" minOccurs="0"/>
 *         &lt;element name="repeatNumber" type="{urn:hl7-org:v3}IVL_INT" minOccurs="0"/>
 *         &lt;element name="reasonCode" type="{urn:hl7-org:v3}DSET_CD" minOccurs="0"/>
 *         &lt;element name="subject" type="{urn:hl7-org:v3}COCT_MT290000UV06.Subject5" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reusableDevice" type="{urn:hl7-org:v3}COCT_MT290000UV06.ReusableDevice" minOccurs="0"/>
 *         &lt;element name="product" type="{urn:hl7-org:v3}COCT_MT290000UV06.Product1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responsibleParty" type="{urn:hl7-org:v3}COCT_MT290000UV06.ResponsibleParty" minOccurs="0"/>
 *         &lt;element name="secondaryPerformer" type="{urn:hl7-org:v3}COCT_MT290000UV06.SecondaryPerformer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="performer" type="{urn:hl7-org:v3}COCT_MT290000UV06.Performer" minOccurs="0"/>
 *         &lt;element name="author" type="{urn:hl7-org:v3}COCT_MT290000UV06.Author" minOccurs="0"/>
 *         &lt;element name="consultant" type="{urn:hl7-org:v3}COCT_MT290000UV06.Consultant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:hl7-org:v3}COCT_MT290000UV06.Location" minOccurs="0"/>
 *         &lt;element name="inFulfillmentOf" type="{urn:hl7-org:v3}COCT_MT290000UV06.InFulfillmentOf" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reason1" type="{urn:hl7-org:v3}COCT_MT290000UV06.Reason1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reason2" type="{urn:hl7-org:v3}COCT_MT290000UV06.Reason4" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reason3" type="{urn:hl7-org:v3}COCT_MT290000UV06.Reason3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="component" type="{urn:hl7-org:v3}COCT_MT290000UV06.Component2" minOccurs="0"/>
 *         &lt;element name="subjectOf1" type="{urn:hl7-org:v3}COCT_MT290000UV06.Subject2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectOf2" type="{urn:hl7-org:v3}COCT_MT290000UV06.Subject" minOccurs="0"/>
 *         &lt;element name="componentOf" type="{urn:hl7-org:v3}COCT_MT290000UV06.Component1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}ActClassRoot" />
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}ActMoodCompletionTrack" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT290000UV06.BillableClinicalService", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "effectiveTime",
    "priorityCode",
    "confidentialityCode",
    "repeatNumber",
    "reasonCode",
    "subject",
    "reusableDevice",
    "product",
    "responsibleParty",
    "secondaryPerformer",
    "performer",
    "author",
    "consultant",
    "location",
    "inFulfillmentOf",
    "reason1",
    "reason2",
    "reason3",
    "component",
    "subjectOf1",
    "subjectOf2",
    "componentOf"
})
public class COCTMT290000UV06BillableClinicalService {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    protected DSETII id;
    @XmlElement(required = true)
    protected CD code;
    @XmlElement(required = true)
    protected IVLTS effectiveTime;
    protected DSETCD priorityCode;
    protected DSETCD confidentialityCode;
    protected IVLINT repeatNumber;
    protected DSETCD reasonCode;
    @XmlElement(nillable = true)
    protected List<COCTMT290000UV06Subject5> subject;
    @XmlElementRef(name = "reusableDevice", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT290000UV06ReusableDevice> reusableDevice;
    @XmlElement(nillable = true)
    protected List<COCTMT290000UV06Product1> product;
    @XmlElementRef(name = "responsibleParty", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT290000UV06ResponsibleParty> responsibleParty;
    @XmlElement(nillable = true)
    protected List<COCTMT290000UV06SecondaryPerformer> secondaryPerformer;
    @XmlElementRef(name = "performer", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT290000UV06Performer> performer;
    @XmlElementRef(name = "author", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT290000UV06Author> author;
    @XmlElement(nillable = true)
    protected List<COCTMT290000UV06Consultant> consultant;
    @XmlElementRef(name = "location", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT290000UV06Location> location;
    @XmlElement(nillable = true)
    protected List<COCTMT290000UV06InFulfillmentOf> inFulfillmentOf;
    @XmlElement(nillable = true)
    protected List<COCTMT290000UV06Reason1> reason1;
    @XmlElement(nillable = true)
    protected List<COCTMT290000UV06Reason4> reason2;
    @XmlElement(nillable = true)
    protected List<COCTMT290000UV06Reason3> reason3;
    @XmlElementRef(name = "component", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT290000UV06Component2> component;
    @XmlElement(nillable = true)
    protected List<COCTMT290000UV06Subject2> subjectOf1;
    @XmlElementRef(name = "subjectOf2", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT290000UV06Subject> subjectOf2;
    @XmlElement(nillable = true)
    protected List<COCTMT290000UV06Component1> componentOf;
    @XmlAttribute(name = "classCode", required = true)
    protected ActClassRoot classCode;
    @XmlAttribute(name = "moodCode", required = true)
    protected ActMoodCompletionTrack moodCode;

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
     * 获取priorityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DSETCD }
     *     
     */
    public DSETCD getPriorityCode() {
        return priorityCode;
    }

    /**
     * 设置priorityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DSETCD }
     *     
     */
    public void setPriorityCode(DSETCD value) {
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
     * 获取reasonCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DSETCD }
     *     
     */
    public DSETCD getReasonCode() {
        return reasonCode;
    }

    /**
     * 设置reasonCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DSETCD }
     *     
     */
    public void setReasonCode(DSETCD value) {
        this.reasonCode = value;
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
     * {@link COCTMT290000UV06Subject5 }
     * 
     * 
     */
    public List<COCTMT290000UV06Subject5> getSubject() {
        if (subject == null) {
            subject = new ArrayList<COCTMT290000UV06Subject5>();
        }
        return this.subject;
    }

    /**
     * 获取reusableDevice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06ReusableDevice }{@code >}
     *     
     */
    public JAXBElement<COCTMT290000UV06ReusableDevice> getReusableDevice() {
        return reusableDevice;
    }

    /**
     * 设置reusableDevice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06ReusableDevice }{@code >}
     *     
     */
    public void setReusableDevice(JAXBElement<COCTMT290000UV06ReusableDevice> value) {
        this.reusableDevice = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT290000UV06Product1 }
     * 
     * 
     */
    public List<COCTMT290000UV06Product1> getProduct() {
        if (product == null) {
            product = new ArrayList<COCTMT290000UV06Product1>();
        }
        return this.product;
    }

    /**
     * 获取responsibleParty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06ResponsibleParty }{@code >}
     *     
     */
    public JAXBElement<COCTMT290000UV06ResponsibleParty> getResponsibleParty() {
        return responsibleParty;
    }

    /**
     * 设置responsibleParty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06ResponsibleParty }{@code >}
     *     
     */
    public void setResponsibleParty(JAXBElement<COCTMT290000UV06ResponsibleParty> value) {
        this.responsibleParty = value;
    }

    /**
     * Gets the value of the secondaryPerformer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryPerformer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryPerformer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT290000UV06SecondaryPerformer }
     * 
     * 
     */
    public List<COCTMT290000UV06SecondaryPerformer> getSecondaryPerformer() {
        if (secondaryPerformer == null) {
            secondaryPerformer = new ArrayList<COCTMT290000UV06SecondaryPerformer>();
        }
        return this.secondaryPerformer;
    }

    /**
     * 获取performer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06Performer }{@code >}
     *     
     */
    public JAXBElement<COCTMT290000UV06Performer> getPerformer() {
        return performer;
    }

    /**
     * 设置performer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06Performer }{@code >}
     *     
     */
    public void setPerformer(JAXBElement<COCTMT290000UV06Performer> value) {
        this.performer = value;
    }

    /**
     * 获取author属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06Author }{@code >}
     *     
     */
    public JAXBElement<COCTMT290000UV06Author> getAuthor() {
        return author;
    }

    /**
     * 设置author属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06Author }{@code >}
     *     
     */
    public void setAuthor(JAXBElement<COCTMT290000UV06Author> value) {
        this.author = value;
    }

    /**
     * Gets the value of the consultant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT290000UV06Consultant }
     * 
     * 
     */
    public List<COCTMT290000UV06Consultant> getConsultant() {
        if (consultant == null) {
            consultant = new ArrayList<COCTMT290000UV06Consultant>();
        }
        return this.consultant;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06Location }{@code >}
     *     
     */
    public JAXBElement<COCTMT290000UV06Location> getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06Location }{@code >}
     *     
     */
    public void setLocation(JAXBElement<COCTMT290000UV06Location> value) {
        this.location = value;
    }

    /**
     * Gets the value of the inFulfillmentOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inFulfillmentOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInFulfillmentOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT290000UV06InFulfillmentOf }
     * 
     * 
     */
    public List<COCTMT290000UV06InFulfillmentOf> getInFulfillmentOf() {
        if (inFulfillmentOf == null) {
            inFulfillmentOf = new ArrayList<COCTMT290000UV06InFulfillmentOf>();
        }
        return this.inFulfillmentOf;
    }

    /**
     * Gets the value of the reason1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT290000UV06Reason1 }
     * 
     * 
     */
    public List<COCTMT290000UV06Reason1> getReason1() {
        if (reason1 == null) {
            reason1 = new ArrayList<COCTMT290000UV06Reason1>();
        }
        return this.reason1;
    }

    /**
     * Gets the value of the reason2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT290000UV06Reason4 }
     * 
     * 
     */
    public List<COCTMT290000UV06Reason4> getReason2() {
        if (reason2 == null) {
            reason2 = new ArrayList<COCTMT290000UV06Reason4>();
        }
        return this.reason2;
    }

    /**
     * Gets the value of the reason3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT290000UV06Reason3 }
     * 
     * 
     */
    public List<COCTMT290000UV06Reason3> getReason3() {
        if (reason3 == null) {
            reason3 = new ArrayList<COCTMT290000UV06Reason3>();
        }
        return this.reason3;
    }

    /**
     * 获取component属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06Component2 }{@code >}
     *     
     */
    public JAXBElement<COCTMT290000UV06Component2> getComponent() {
        return component;
    }

    /**
     * 设置component属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06Component2 }{@code >}
     *     
     */
    public void setComponent(JAXBElement<COCTMT290000UV06Component2> value) {
        this.component = value;
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
     * {@link COCTMT290000UV06Subject2 }
     * 
     * 
     */
    public List<COCTMT290000UV06Subject2> getSubjectOf1() {
        if (subjectOf1 == null) {
            subjectOf1 = new ArrayList<COCTMT290000UV06Subject2>();
        }
        return this.subjectOf1;
    }

    /**
     * 获取subjectOf2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06Subject }{@code >}
     *     
     */
    public JAXBElement<COCTMT290000UV06Subject> getSubjectOf2() {
        return subjectOf2;
    }

    /**
     * 设置subjectOf2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06Subject }{@code >}
     *     
     */
    public void setSubjectOf2(JAXBElement<COCTMT290000UV06Subject> value) {
        this.subjectOf2 = value;
    }

    /**
     * Gets the value of the componentOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT290000UV06Component1 }
     * 
     * 
     */
    public List<COCTMT290000UV06Component1> getComponentOf() {
        if (componentOf == null) {
            componentOf = new ArrayList<COCTMT290000UV06Component1>();
        }
        return this.componentOf;
    }

    /**
     * 获取classCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActClassRoot }
     *     
     */
    public ActClassRoot getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActClassRoot }
     *     
     */
    public void setClassCode(ActClassRoot value) {
        this.classCode = value;
    }

    /**
     * 获取moodCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActMoodCompletionTrack }
     *     
     */
    public ActMoodCompletionTrack getMoodCode() {
        return moodCode;
    }

    /**
     * 设置moodCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActMoodCompletionTrack }
     *     
     */
    public void setMoodCode(ActMoodCompletionTrack value) {
        this.moodCode = value;
    }

}
