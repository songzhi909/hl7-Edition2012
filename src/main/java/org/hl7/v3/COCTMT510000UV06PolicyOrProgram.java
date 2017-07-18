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
 * <p>COCT_MT510000UV06.PolicyOrProgram complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="COCT_MT510000UV06.PolicyOrProgram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}DSET_II" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;element name="confidentialityCode" type="{urn:hl7-org:v3}DSET_CD" minOccurs="0"/>
 *         &lt;element name="coveredParty" type="{urn:hl7-org:v3}COCT_MT510000UV06.CoveredParty2"/>
 *         &lt;element name="holder" type="{urn:hl7-org:v3}COCT_MT510000UV06.Holder" minOccurs="0"/>
 *         &lt;element name="responsibleParty" type="{urn:hl7-org:v3}COCT_MT510000UV06.ResponsibleParty2" minOccurs="0"/>
 *         &lt;element name="primaryPerformer" type="{urn:hl7-org:v3}COCT_MT510000UV06.PrimaryPerformer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="author" type="{urn:hl7-org:v3}COCT_MT510000UV06.Author2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="definition" type="{urn:hl7-org:v3}COCT_MT510000UV06.Definition3" minOccurs="0"/>
 *         &lt;element name="replacementOf" type="{urn:hl7-org:v3}COCT_MT510000UV06.ReplacementOf" minOccurs="0"/>
 *         &lt;element name="limitation1" type="{urn:hl7-org:v3}COCT_MT510000UV06.Limitation3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="limitation2" type="{urn:hl7-org:v3}COCT_MT510000UV06.Limitation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coverageOf" type="{urn:hl7-org:v3}COCT_MT510000UV06.Coverage2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}ActClassCoverage" />
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}ActMoodEventOccurrence" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT510000UV06.PolicyOrProgram", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "statusCode",
    "effectiveTime",
    "confidentialityCode",
    "coveredParty",
    "holder",
    "responsibleParty",
    "primaryPerformer",
    "author",
    "definition",
    "replacementOf",
    "limitation1",
    "limitation2",
    "coverageOf"
})
public class COCTMT510000UV06PolicyOrProgram {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    protected DSETII id;
    @XmlElement(required = true)
    protected CD code;
    protected CS statusCode;
    protected IVLTS effectiveTime;
    protected DSETCD confidentialityCode;
    @XmlElement(required = true, nillable = true)
    protected COCTMT510000UV06CoveredParty2 coveredParty;
    @XmlElementRef(name = "holder", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT510000UV06Holder> holder;
    @XmlElementRef(name = "responsibleParty", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT510000UV06ResponsibleParty2> responsibleParty;
    @XmlElement(nillable = true)
    protected List<COCTMT510000UV06PrimaryPerformer> primaryPerformer;
    @XmlElement(nillable = true)
    protected List<COCTMT510000UV06Author2> author;
    @XmlElementRef(name = "definition", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT510000UV06Definition3> definition;
    @XmlElementRef(name = "replacementOf", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT510000UV06ReplacementOf> replacementOf;
    @XmlElement(nillable = true)
    protected List<COCTMT510000UV06Limitation3> limitation1;
    @XmlElement(nillable = true)
    protected List<COCTMT510000UV06Limitation> limitation2;
    @XmlElement(nillable = true)
    protected List<COCTMT510000UV06Coverage2> coverageOf;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected ActClassCoverage classCode;
    @XmlAttribute(name = "moodCode", required = true)
    protected ActMoodEventOccurrence moodCode;

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
     * 获取coveredParty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link COCTMT510000UV06CoveredParty2 }
     *     
     */
    public COCTMT510000UV06CoveredParty2 getCoveredParty() {
        return coveredParty;
    }

    /**
     * 设置coveredParty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT510000UV06CoveredParty2 }
     *     
     */
    public void setCoveredParty(COCTMT510000UV06CoveredParty2 value) {
        this.coveredParty = value;
    }

    /**
     * 获取holder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06Holder }{@code >}
     *     
     */
    public JAXBElement<COCTMT510000UV06Holder> getHolder() {
        return holder;
    }

    /**
     * 设置holder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06Holder }{@code >}
     *     
     */
    public void setHolder(JAXBElement<COCTMT510000UV06Holder> value) {
        this.holder = value;
    }

    /**
     * 获取responsibleParty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06ResponsibleParty2 }{@code >}
     *     
     */
    public JAXBElement<COCTMT510000UV06ResponsibleParty2> getResponsibleParty() {
        return responsibleParty;
    }

    /**
     * 设置responsibleParty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06ResponsibleParty2 }{@code >}
     *     
     */
    public void setResponsibleParty(JAXBElement<COCTMT510000UV06ResponsibleParty2> value) {
        this.responsibleParty = value;
    }

    /**
     * Gets the value of the primaryPerformer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryPerformer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryPerformer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT510000UV06PrimaryPerformer }
     * 
     * 
     */
    public List<COCTMT510000UV06PrimaryPerformer> getPrimaryPerformer() {
        if (primaryPerformer == null) {
            primaryPerformer = new ArrayList<COCTMT510000UV06PrimaryPerformer>();
        }
        return this.primaryPerformer;
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
     * {@link COCTMT510000UV06Author2 }
     * 
     * 
     */
    public List<COCTMT510000UV06Author2> getAuthor() {
        if (author == null) {
            author = new ArrayList<COCTMT510000UV06Author2>();
        }
        return this.author;
    }

    /**
     * 获取definition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06Definition3 }{@code >}
     *     
     */
    public JAXBElement<COCTMT510000UV06Definition3> getDefinition() {
        return definition;
    }

    /**
     * 设置definition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06Definition3 }{@code >}
     *     
     */
    public void setDefinition(JAXBElement<COCTMT510000UV06Definition3> value) {
        this.definition = value;
    }

    /**
     * 获取replacementOf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06ReplacementOf }{@code >}
     *     
     */
    public JAXBElement<COCTMT510000UV06ReplacementOf> getReplacementOf() {
        return replacementOf;
    }

    /**
     * 设置replacementOf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06ReplacementOf }{@code >}
     *     
     */
    public void setReplacementOf(JAXBElement<COCTMT510000UV06ReplacementOf> value) {
        this.replacementOf = value;
    }

    /**
     * Gets the value of the limitation1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitation1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitation1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT510000UV06Limitation3 }
     * 
     * 
     */
    public List<COCTMT510000UV06Limitation3> getLimitation1() {
        if (limitation1 == null) {
            limitation1 = new ArrayList<COCTMT510000UV06Limitation3>();
        }
        return this.limitation1;
    }

    /**
     * Gets the value of the limitation2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitation2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitation2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT510000UV06Limitation }
     * 
     * 
     */
    public List<COCTMT510000UV06Limitation> getLimitation2() {
        if (limitation2 == null) {
            limitation2 = new ArrayList<COCTMT510000UV06Limitation>();
        }
        return this.limitation2;
    }

    /**
     * Gets the value of the coverageOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT510000UV06Coverage2 }
     * 
     * 
     */
    public List<COCTMT510000UV06Coverage2> getCoverageOf() {
        if (coverageOf == null) {
            coverageOf = new ArrayList<COCTMT510000UV06Coverage2>();
        }
        return this.coverageOf;
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
     *     {@link ActClassCoverage }
     *     
     */
    public ActClassCoverage getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActClassCoverage }
     *     
     */
    public void setClassCode(ActClassCoverage value) {
        this.classCode = value;
    }

    /**
     * 获取moodCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActMoodEventOccurrence }
     *     
     */
    public ActMoodEventOccurrence getMoodCode() {
        return moodCode;
    }

    /**
     * 设置moodCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActMoodEventOccurrence }
     *     
     */
    public void setMoodCode(ActMoodEventOccurrence value) {
        this.moodCode = value;
    }

}
