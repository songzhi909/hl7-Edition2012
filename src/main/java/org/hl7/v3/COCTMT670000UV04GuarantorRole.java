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
 * <p>COCT_MT670000UV04.GuarantorRole complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="COCT_MT670000UV04.GuarantorRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}DSET_II" minOccurs="0"/>
 *         &lt;element name="addr" type="{urn:hl7-org:v3}AD" minOccurs="0"/>
 *         &lt;element name="telecom" type="{urn:hl7-org:v3}TEL" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="guarantorPerson" type="{urn:hl7-org:v3}COCT_MT670000UV04.GuarantorPerson" minOccurs="0"/>
 *           &lt;element name="guarantorOrganization" type="{urn:hl7-org:v3}COCT_MT670000UV04.GuarantorOrganization" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="contractHeld" type="{urn:hl7-org:v3}COCT_MT670000UV04.Holder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassGuarantor" />
 *       &lt;attribute name="negationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT670000UV04.GuarantorRole", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "addr",
    "telecom",
    "statusCode",
    "effectiveTime",
    "guarantorPerson",
    "guarantorOrganization",
    "contractHeld"
})
public class COCTMT670000UV04GuarantorRole {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    protected DSETII id;
    protected AD addr;
    protected TEL telecom;
    protected CS statusCode;
    protected IVLTS effectiveTime;
    @XmlElementRef(name = "guarantorPerson", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT670000UV04GuarantorPerson> guarantorPerson;
    @XmlElementRef(name = "guarantorOrganization", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT670000UV04GuarantorOrganization> guarantorOrganization;
    @XmlElement(nillable = true)
    protected List<COCTMT670000UV04Holder> contractHeld;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassGuarantor classCode;
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
     * 获取addr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AD }
     *     
     */
    public AD getAddr() {
        return addr;
    }

    /**
     * 设置addr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AD }
     *     
     */
    public void setAddr(AD value) {
        this.addr = value;
    }

    /**
     * 获取telecom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TEL }
     *     
     */
    public TEL getTelecom() {
        return telecom;
    }

    /**
     * 设置telecom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TEL }
     *     
     */
    public void setTelecom(TEL value) {
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
     * 获取guarantorPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT670000UV04GuarantorPerson }{@code >}
     *     
     */
    public JAXBElement<COCTMT670000UV04GuarantorPerson> getGuarantorPerson() {
        return guarantorPerson;
    }

    /**
     * 设置guarantorPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT670000UV04GuarantorPerson }{@code >}
     *     
     */
    public void setGuarantorPerson(JAXBElement<COCTMT670000UV04GuarantorPerson> value) {
        this.guarantorPerson = value;
    }

    /**
     * 获取guarantorOrganization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT670000UV04GuarantorOrganization }{@code >}
     *     
     */
    public JAXBElement<COCTMT670000UV04GuarantorOrganization> getGuarantorOrganization() {
        return guarantorOrganization;
    }

    /**
     * 设置guarantorOrganization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT670000UV04GuarantorOrganization }{@code >}
     *     
     */
    public void setGuarantorOrganization(JAXBElement<COCTMT670000UV04GuarantorOrganization> value) {
        this.guarantorOrganization = value;
    }

    /**
     * Gets the value of the contractHeld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractHeld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractHeld().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT670000UV04Holder }
     * 
     * 
     */
    public List<COCTMT670000UV04Holder> getContractHeld() {
        if (contractHeld == null) {
            contractHeld = new ArrayList<COCTMT670000UV04Holder>();
        }
        return this.contractHeld;
    }

    /**
     * 获取classCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoleClassGuarantor }
     *     
     */
    public RoleClassGuarantor getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassGuarantor }
     *     
     */
    public void setClassCode(RoleClassGuarantor value) {
        this.classCode = value;
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
