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
 * <p>PRPM_MT309000UV01.AssignedEntity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PRPM_MT309000UV01.AssignedEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}DSET_II" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:hl7-org:v3}COLL_EN" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="assignedPrincipalPerson" type="{urn:hl7-org:v3}PRPM_MT309000UV01.PrincipalPerson" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="representedOrganization" type="{urn:hl7-org:v3}PRPM_MT309000UV01.Organization" minOccurs="0"/>
 *         &lt;element name="subjectOf1" type="{urn:hl7-org:v3}PRPM_MT309000UV01.Subject2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectOf2" type="{urn:hl7-org:v3}PRPM_MT309000UV01.Subject3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectOf3" type="{urn:hl7-org:v3}PRPM_MT309000UV01.Subject9" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responsibleFor" type="{urn:hl7-org:v3}PRPM_MT309000UV01.ResponsibleParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="performance" type="{urn:hl7-org:v3}PRPM_MT309000UV01.PrimaryPerformer3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedTo" type="{urn:hl7-org:v3}PRPM_MT309000UV01.RelatedTo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassAssignedEntity" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPM_MT309000UV01.AssignedEntity", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "name",
    "assignedPrincipalPerson",
    "representedOrganization",
    "subjectOf1",
    "subjectOf2",
    "subjectOf3",
    "responsibleFor",
    "performance",
    "relatedTo"
})
public class PRPMMT309000UV01AssignedEntity {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    protected DSETII id;
    protected CD code;
    protected COLLEN name;
    @XmlElementRef(name = "assignedPrincipalPerson", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT309000UV01PrincipalPerson> assignedPrincipalPerson;
    @XmlElementRef(name = "representedOrganization", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<PRPMMT309000UV01Organization> representedOrganization;
    @XmlElement(nillable = true)
    protected List<PRPMMT309000UV01Subject2> subjectOf1;
    @XmlElement(nillable = true)
    protected List<PRPMMT309000UV01Subject3> subjectOf2;
    @XmlElement(nillable = true)
    protected List<PRPMMT309000UV01Subject9> subjectOf3;
    @XmlElement(nillable = true)
    protected List<PRPMMT309000UV01ResponsibleParty> responsibleFor;
    @XmlElement(nillable = true)
    protected List<PRPMMT309000UV01PrimaryPerformer3> performance;
    @XmlElement(nillable = true)
    protected List<PRPMMT309000UV01RelatedTo> relatedTo;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassAssignedEntity classCode;

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
     * 获取assignedPrincipalPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT309000UV01PrincipalPerson }{@code >}
     *     
     */
    public JAXBElement<PRPMMT309000UV01PrincipalPerson> getAssignedPrincipalPerson() {
        return assignedPrincipalPerson;
    }

    /**
     * 设置assignedPrincipalPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT309000UV01PrincipalPerson }{@code >}
     *     
     */
    public void setAssignedPrincipalPerson(JAXBElement<PRPMMT309000UV01PrincipalPerson> value) {
        this.assignedPrincipalPerson = value;
    }

    /**
     * 获取representedOrganization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT309000UV01Organization }{@code >}
     *     
     */
    public JAXBElement<PRPMMT309000UV01Organization> getRepresentedOrganization() {
        return representedOrganization;
    }

    /**
     * 设置representedOrganization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRPMMT309000UV01Organization }{@code >}
     *     
     */
    public void setRepresentedOrganization(JAXBElement<PRPMMT309000UV01Organization> value) {
        this.representedOrganization = value;
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
     * {@link PRPMMT309000UV01Subject2 }
     * 
     * 
     */
    public List<PRPMMT309000UV01Subject2> getSubjectOf1() {
        if (subjectOf1 == null) {
            subjectOf1 = new ArrayList<PRPMMT309000UV01Subject2>();
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
     * {@link PRPMMT309000UV01Subject3 }
     * 
     * 
     */
    public List<PRPMMT309000UV01Subject3> getSubjectOf2() {
        if (subjectOf2 == null) {
            subjectOf2 = new ArrayList<PRPMMT309000UV01Subject3>();
        }
        return this.subjectOf2;
    }

    /**
     * Gets the value of the subjectOf3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT309000UV01Subject9 }
     * 
     * 
     */
    public List<PRPMMT309000UV01Subject9> getSubjectOf3() {
        if (subjectOf3 == null) {
            subjectOf3 = new ArrayList<PRPMMT309000UV01Subject9>();
        }
        return this.subjectOf3;
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
     * {@link PRPMMT309000UV01ResponsibleParty }
     * 
     * 
     */
    public List<PRPMMT309000UV01ResponsibleParty> getResponsibleFor() {
        if (responsibleFor == null) {
            responsibleFor = new ArrayList<PRPMMT309000UV01ResponsibleParty>();
        }
        return this.responsibleFor;
    }

    /**
     * Gets the value of the performance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMMT309000UV01PrimaryPerformer3 }
     * 
     * 
     */
    public List<PRPMMT309000UV01PrimaryPerformer3> getPerformance() {
        if (performance == null) {
            performance = new ArrayList<PRPMMT309000UV01PrimaryPerformer3>();
        }
        return this.performance;
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
     * {@link PRPMMT309000UV01RelatedTo }
     * 
     * 
     */
    public List<PRPMMT309000UV01RelatedTo> getRelatedTo() {
        if (relatedTo == null) {
            relatedTo = new ArrayList<PRPMMT309000UV01RelatedTo>();
        }
        return this.relatedTo;
    }

    /**
     * 获取classCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoleClassAssignedEntity }
     *     
     */
    public RoleClassAssignedEntity getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassAssignedEntity }
     *     
     */
    public void setClassCode(RoleClassAssignedEntity value) {
        this.classCode = value;
    }

}
