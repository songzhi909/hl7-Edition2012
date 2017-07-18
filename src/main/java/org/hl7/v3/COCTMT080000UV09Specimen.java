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
 * <p>COCT_MT080000UV09.Specimen complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="COCT_MT080000UV09.Specimen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD"/>
 *         &lt;choice>
 *           &lt;element name="specimenNatural" type="{urn:hl7-org:v3}COCT_MT080000UV09.Natural" minOccurs="0"/>
 *           &lt;element name="specimenManufacturedMaterial" type="{urn:hl7-org:v3}COCT_MT080000UV09.ManufacturedMaterial" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="sourceNatural" type="{urn:hl7-org:v3}COCT_MT080000UV09.Natural" minOccurs="0"/>
 *           &lt;element name="sourceManufacturedMaterial" type="{urn:hl7-org:v3}COCT_MT080000UV09.ManufacturedMaterial" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="subjectOf1" type="{urn:hl7-org:v3}COCT_MT080000UV09.Subject2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectOf2" type="{urn:hl7-org:v3}COCT_MT080000UV09.Subject3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productOf" type="{urn:hl7-org:v3}COCT_MT080000UV09.Product" minOccurs="0"/>
 *         &lt;element name="related" type="{urn:hl7-org:v3}COCT_MT080000UV09.SourceOf" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassSpecimen" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT080000UV09.Specimen", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "specimenNatural",
    "specimenManufacturedMaterial",
    "sourceNatural",
    "sourceManufacturedMaterial",
    "subjectOf1",
    "subjectOf2",
    "productOf",
    "related"
})
public class COCTMT080000UV09Specimen {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    @XmlElement(required = true)
    protected II id;
    @XmlElement(required = true)
    protected CD code;
    @XmlElementRef(name = "specimenNatural", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UV09Natural> specimenNatural;
    @XmlElementRef(name = "specimenManufacturedMaterial", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UV09ManufacturedMaterial> specimenManufacturedMaterial;
    @XmlElementRef(name = "sourceNatural", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UV09Natural> sourceNatural;
    @XmlElementRef(name = "sourceManufacturedMaterial", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UV09ManufacturedMaterial> sourceManufacturedMaterial;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UV09Subject2> subjectOf1;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UV09Subject3> subjectOf2;
    @XmlElementRef(name = "productOf", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UV09Product> productOf;
    @XmlElementRef(name = "related", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UV09SourceOf> related;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassSpecimen classCode;

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
     * 获取specimenNatural属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09Natural }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UV09Natural> getSpecimenNatural() {
        return specimenNatural;
    }

    /**
     * 设置specimenNatural属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09Natural }{@code >}
     *     
     */
    public void setSpecimenNatural(JAXBElement<COCTMT080000UV09Natural> value) {
        this.specimenNatural = value;
    }

    /**
     * 获取specimenManufacturedMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09ManufacturedMaterial }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UV09ManufacturedMaterial> getSpecimenManufacturedMaterial() {
        return specimenManufacturedMaterial;
    }

    /**
     * 设置specimenManufacturedMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09ManufacturedMaterial }{@code >}
     *     
     */
    public void setSpecimenManufacturedMaterial(JAXBElement<COCTMT080000UV09ManufacturedMaterial> value) {
        this.specimenManufacturedMaterial = value;
    }

    /**
     * 获取sourceNatural属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09Natural }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UV09Natural> getSourceNatural() {
        return sourceNatural;
    }

    /**
     * 设置sourceNatural属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09Natural }{@code >}
     *     
     */
    public void setSourceNatural(JAXBElement<COCTMT080000UV09Natural> value) {
        this.sourceNatural = value;
    }

    /**
     * 获取sourceManufacturedMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09ManufacturedMaterial }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UV09ManufacturedMaterial> getSourceManufacturedMaterial() {
        return sourceManufacturedMaterial;
    }

    /**
     * 设置sourceManufacturedMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09ManufacturedMaterial }{@code >}
     *     
     */
    public void setSourceManufacturedMaterial(JAXBElement<COCTMT080000UV09ManufacturedMaterial> value) {
        this.sourceManufacturedMaterial = value;
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
     * {@link COCTMT080000UV09Subject2 }
     * 
     * 
     */
    public List<COCTMT080000UV09Subject2> getSubjectOf1() {
        if (subjectOf1 == null) {
            subjectOf1 = new ArrayList<COCTMT080000UV09Subject2>();
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
     * {@link COCTMT080000UV09Subject3 }
     * 
     * 
     */
    public List<COCTMT080000UV09Subject3> getSubjectOf2() {
        if (subjectOf2 == null) {
            subjectOf2 = new ArrayList<COCTMT080000UV09Subject3>();
        }
        return this.subjectOf2;
    }

    /**
     * 获取productOf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09Product }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UV09Product> getProductOf() {
        return productOf;
    }

    /**
     * 设置productOf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09Product }{@code >}
     *     
     */
    public void setProductOf(JAXBElement<COCTMT080000UV09Product> value) {
        this.productOf = value;
    }

    /**
     * 获取related属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09SourceOf }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UV09SourceOf> getRelated() {
        return related;
    }

    /**
     * 设置related属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09SourceOf }{@code >}
     *     
     */
    public void setRelated(JAXBElement<COCTMT080000UV09SourceOf> value) {
        this.related = value;
    }

    /**
     * 获取classCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoleClassSpecimen }
     *     
     */
    public RoleClassSpecimen getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassSpecimen }
     *     
     */
    public void setClassCode(RoleClassSpecimen value) {
        this.classCode = value;
    }

}
