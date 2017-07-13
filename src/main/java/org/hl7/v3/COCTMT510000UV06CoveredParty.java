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
 * <p>COCT_MT510000UV06.CoveredParty complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="COCT_MT510000UV06.CoveredParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}DSET_II"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *         &lt;element name="addr" type="{urn:hl7-org:v3}COLL_AD" minOccurs="0"/>
 *         &lt;element name="telecom" type="{urn:hl7-org:v3}COLL_TEL" minOccurs="0"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="coveredOrganization1" type="{urn:hl7-org:v3}COCT_MT150000UV02.Organization" minOccurs="0"/>
 *           &lt;choice>
 *             &lt;element name="coveredPerson" type="{urn:hl7-org:v3}COCT_MT030007UV.Person" minOccurs="0"/>
 *             &lt;element name="coveredNonPersonLivingSubject" type="{urn:hl7-org:v3}COCT_MT030007UV.NonPersonLivingSubject" minOccurs="0"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *         &lt;element name="underwritingOrganization" type="{urn:hl7-org:v3}COCT_MT150000UV02.Organization" minOccurs="0"/>
 *         &lt;element name="subjectOf1" type="{urn:hl7-org:v3}COCT_MT510000UV06.Subject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectOf2" type="{urn:hl7-org:v3}COCT_MT510000UV06.Subject3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="part" type="{urn:hl7-org:v3}COCT_MT510000UV06.Part" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="indirectAuthority1" type="{urn:hl7-org:v3}COCT_MT510000UV06.IndirectAuthorithyOver" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="indirectAuthority2" type="{urn:hl7-org:v3}COCT_MT510000UV06.IndirectAuthorithyOver2" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassCoveredParty" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT510000UV06.CoveredParty", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "addr",
    "telecom",
    "effectiveTime",
    "coveredOrganization1",
    "coveredPerson",
    "coveredNonPersonLivingSubject",
    "underwritingOrganization",
    "subjectOf1",
    "subjectOf2",
    "part",
    "indirectAuthority1",
    "indirectAuthority2"
})
public class COCTMT510000UV06CoveredParty {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    @XmlElement(required = true)
    protected DSETII id;
    protected CD code;
    protected COLLAD addr;
    protected COLLTEL telecom;
    protected IVLTS effectiveTime;
    @XmlElementRef(name = "coveredOrganization1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT150000UV02Organization> coveredOrganization1;
    @XmlElementRef(name = "coveredPerson", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT030007UVPerson> coveredPerson;
    @XmlElementRef(name = "coveredNonPersonLivingSubject", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT030007UVNonPersonLivingSubject> coveredNonPersonLivingSubject;
    @XmlElementRef(name = "underwritingOrganization", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT150000UV02Organization> underwritingOrganization;
    @XmlElement(nillable = true)
    protected List<COCTMT510000UV06Subject> subjectOf1;
    @XmlElement(nillable = true)
    protected List<COCTMT510000UV06Subject3> subjectOf2;
    @XmlElement(nillable = true)
    protected List<COCTMT510000UV06Part> part;
    @XmlElement(nillable = true)
    protected List<COCTMT510000UV06IndirectAuthorithyOver> indirectAuthority1;
    @XmlElementRef(name = "indirectAuthority2", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT510000UV06IndirectAuthorithyOver2> indirectAuthority2;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassCoveredParty classCode;

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
     * 获取coveredOrganization1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}
     *     
     */
    public JAXBElement<COCTMT150000UV02Organization> getCoveredOrganization1() {
        return coveredOrganization1;
    }

    /**
     * 设置coveredOrganization1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}
     *     
     */
    public void setCoveredOrganization1(JAXBElement<COCTMT150000UV02Organization> value) {
        this.coveredOrganization1 = value;
    }

    /**
     * 获取coveredPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}
     *     
     */
    public JAXBElement<COCTMT030007UVPerson> getCoveredPerson() {
        return coveredPerson;
    }

    /**
     * 设置coveredPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}
     *     
     */
    public void setCoveredPerson(JAXBElement<COCTMT030007UVPerson> value) {
        this.coveredPerson = value;
    }

    /**
     * 获取coveredNonPersonLivingSubject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}
     *     
     */
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> getCoveredNonPersonLivingSubject() {
        return coveredNonPersonLivingSubject;
    }

    /**
     * 设置coveredNonPersonLivingSubject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}
     *     
     */
    public void setCoveredNonPersonLivingSubject(JAXBElement<COCTMT030007UVNonPersonLivingSubject> value) {
        this.coveredNonPersonLivingSubject = value;
    }

    /**
     * 获取underwritingOrganization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}
     *     
     */
    public JAXBElement<COCTMT150000UV02Organization> getUnderwritingOrganization() {
        return underwritingOrganization;
    }

    /**
     * 设置underwritingOrganization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}
     *     
     */
    public void setUnderwritingOrganization(JAXBElement<COCTMT150000UV02Organization> value) {
        this.underwritingOrganization = value;
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
     * {@link COCTMT510000UV06Subject }
     * 
     * 
     */
    public List<COCTMT510000UV06Subject> getSubjectOf1() {
        if (subjectOf1 == null) {
            subjectOf1 = new ArrayList<COCTMT510000UV06Subject>();
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
     * {@link COCTMT510000UV06Subject3 }
     * 
     * 
     */
    public List<COCTMT510000UV06Subject3> getSubjectOf2() {
        if (subjectOf2 == null) {
            subjectOf2 = new ArrayList<COCTMT510000UV06Subject3>();
        }
        return this.subjectOf2;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT510000UV06Part }
     * 
     * 
     */
    public List<COCTMT510000UV06Part> getPart() {
        if (part == null) {
            part = new ArrayList<COCTMT510000UV06Part>();
        }
        return this.part;
    }

    /**
     * Gets the value of the indirectAuthority1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indirectAuthority1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndirectAuthority1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT510000UV06IndirectAuthorithyOver }
     * 
     * 
     */
    public List<COCTMT510000UV06IndirectAuthorithyOver> getIndirectAuthority1() {
        if (indirectAuthority1 == null) {
            indirectAuthority1 = new ArrayList<COCTMT510000UV06IndirectAuthorithyOver>();
        }
        return this.indirectAuthority1;
    }

    /**
     * 获取indirectAuthority2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06IndirectAuthorithyOver2 }{@code >}
     *     
     */
    public JAXBElement<COCTMT510000UV06IndirectAuthorithyOver2> getIndirectAuthority2() {
        return indirectAuthority2;
    }

    /**
     * 设置indirectAuthority2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06IndirectAuthorithyOver2 }{@code >}
     *     
     */
    public void setIndirectAuthority2(JAXBElement<COCTMT510000UV06IndirectAuthorithyOver2> value) {
        this.indirectAuthority2 = value;
    }

    /**
     * 获取nullFlavor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NullFlavor }
     *     
     */
    public NullFlavor getNullFlavor() {
        return nullFlavor;
    }

    /**
     * 设置nullFlavor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NullFlavor }
     *     
     */
    public void setNullFlavor(NullFlavor value) {
        this.nullFlavor = value;
    }

    /**
     * 获取classCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoleClassCoveredParty }
     *     
     */
    public RoleClassCoveredParty getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassCoveredParty }
     *     
     */
    public void setClassCode(RoleClassCoveredParty value) {
        this.classCode = value;
    }

}
