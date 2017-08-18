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
 * <p>COCT_MT490000UV04.BillableClinicalProduct complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="COCT_MT490000UV04.BillableClinicalProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS"/>
 *         &lt;element name="product" type="{urn:hl7-org:v3}COCT_MT490000UV04.Product"/>
 *         &lt;element name="referrer" type="{urn:hl7-org:v3}COCT_MT490000UV04.Referrer" minOccurs="0"/>
 *         &lt;element name="consultant" type="{urn:hl7-org:v3}COCT_MT490000UV04.Consultant" minOccurs="0"/>
 *         &lt;element name="origin" type="{urn:hl7-org:v3}COCT_MT490000UV04.Origin" minOccurs="0"/>
 *         &lt;element name="destination" type="{urn:hl7-org:v3}COCT_MT490000UV04.Destination" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:hl7-org:v3}COCT_MT490000UV04.Location"/>
 *         &lt;element name="pertinentInformation" type="{urn:hl7-org:v3}COCT_MT490000UV04.PertinentInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}ActClassSupply" />
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}x_ActMoodIntentEvent" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT490000UV04.BillableClinicalProduct", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "effectiveTime",
    "product",
    "referrer",
    "consultant",
    "origin",
    "destination",
    "location",
    "pertinentInformation"
})
public class COCTMT490000UV04BillableClinicalProduct {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    protected II id;
    @XmlElement(required = true)
    protected CS code;
    @XmlElement(required = true)
    protected IVLTS effectiveTime;
    @XmlElement(required = true)
    protected COCTMT490000UV04Product product;
    @XmlElementRef(name = "referrer", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT490000UV04Referrer> referrer;
    @XmlElementRef(name = "consultant", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT490000UV04Consultant> consultant;
    @XmlElementRef(name = "origin", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT490000UV04Origin> origin;
    @XmlElementRef(name = "destination", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT490000UV04Destination> destination;
    @XmlElement(required = true)
    protected COCTMT490000UV04Location location;
    @XmlElement(nillable = true)
    protected List<COCTMT490000UV04PertinentInformation> pertinentInformation;
    @XmlAttribute(name = "classCode", required = true)
    protected ActClassSupply classCode;
    @XmlAttribute(name = "moodCode", required = true)
    protected XActMoodIntentEvent moodCode;

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
     *     {@link CS }
     *     
     */
    public CS getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setCode(CS value) {
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
     * 获取product属性的值。
     * 
     * @return
     *     possible object is
     *     {@link COCTMT490000UV04Product }
     *     
     */
    public COCTMT490000UV04Product getProduct() {
        return product;
    }

    /**
     * 设置product属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT490000UV04Product }
     *     
     */
    public void setProduct(COCTMT490000UV04Product value) {
        this.product = value;
    }

    /**
     * 获取referrer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT490000UV04Referrer }{@code >}
     *     
     */
    public JAXBElement<COCTMT490000UV04Referrer> getReferrer() {
        return referrer;
    }

    /**
     * 设置referrer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT490000UV04Referrer }{@code >}
     *     
     */
    public void setReferrer(JAXBElement<COCTMT490000UV04Referrer> value) {
        this.referrer = value;
    }

    /**
     * 获取consultant属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT490000UV04Consultant }{@code >}
     *     
     */
    public JAXBElement<COCTMT490000UV04Consultant> getConsultant() {
        return consultant;
    }

    /**
     * 设置consultant属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT490000UV04Consultant }{@code >}
     *     
     */
    public void setConsultant(JAXBElement<COCTMT490000UV04Consultant> value) {
        this.consultant = value;
    }

    /**
     * 获取origin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT490000UV04Origin }{@code >}
     *     
     */
    public JAXBElement<COCTMT490000UV04Origin> getOrigin() {
        return origin;
    }

    /**
     * 设置origin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT490000UV04Origin }{@code >}
     *     
     */
    public void setOrigin(JAXBElement<COCTMT490000UV04Origin> value) {
        this.origin = value;
    }

    /**
     * 获取destination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT490000UV04Destination }{@code >}
     *     
     */
    public JAXBElement<COCTMT490000UV04Destination> getDestination() {
        return destination;
    }

    /**
     * 设置destination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT490000UV04Destination }{@code >}
     *     
     */
    public void setDestination(JAXBElement<COCTMT490000UV04Destination> value) {
        this.destination = value;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link COCTMT490000UV04Location }
     *     
     */
    public COCTMT490000UV04Location getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT490000UV04Location }
     *     
     */
    public void setLocation(COCTMT490000UV04Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the pertinentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pertinentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPertinentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT490000UV04PertinentInformation }
     * 
     * 
     */
    public List<COCTMT490000UV04PertinentInformation> getPertinentInformation() {
        if (pertinentInformation == null) {
            pertinentInformation = new ArrayList<COCTMT490000UV04PertinentInformation>();
        }
        return this.pertinentInformation;
    }

    /**
     * 获取classCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActClassSupply }
     *     
     */
    public ActClassSupply getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActClassSupply }
     *     
     */
    public void setClassCode(ActClassSupply value) {
        this.classCode = value;
    }

    /**
     * 获取moodCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XActMoodIntentEvent }
     *     
     */
    public XActMoodIntentEvent getMoodCode() {
        return moodCode;
    }

    /**
     * 设置moodCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XActMoodIntentEvent }
     *     
     */
    public void setMoodCode(XActMoodIntentEvent value) {
        this.moodCode = value;
    }

}
