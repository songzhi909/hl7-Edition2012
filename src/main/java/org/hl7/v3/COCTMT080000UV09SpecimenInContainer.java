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
 * <p>COCT_MT080000UV09.SpecimenInContainer complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="COCT_MT080000UV09.SpecimenInContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}DSET_II" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="containerHolder" type="{urn:hl7-org:v3}COCT_MT080000UV09.Holder" minOccurs="0"/>
 *           &lt;element name="container" type="{urn:hl7-org:v3}COCT_MT080000UV09.Container" minOccurs="0"/>
 *           &lt;element name="containerAdditiveMaterial" type="{urn:hl7-org:v3}COCT_MT080000UV09.AdditiveMaterial" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="related" type="{urn:hl7-org:v3}COCT_MT080000UV09.SourceOf" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassContent" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT080000UV09.SpecimenInContainer", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "containerHolder",
    "container",
    "containerAdditiveMaterial",
    "related"
})
public class COCTMT080000UV09SpecimenInContainer {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    protected DSETII id;
    @XmlElementRef(name = "containerHolder", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UV09Holder> containerHolder;
    @XmlElementRef(name = "container", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UV09Container> container;
    @XmlElementRef(name = "containerAdditiveMaterial", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UV09AdditiveMaterial> containerAdditiveMaterial;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UV09SourceOf> related;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassContent classCode;

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
     * 获取containerHolder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09Holder }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UV09Holder> getContainerHolder() {
        return containerHolder;
    }

    /**
     * 设置containerHolder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09Holder }{@code >}
     *     
     */
    public void setContainerHolder(JAXBElement<COCTMT080000UV09Holder> value) {
        this.containerHolder = value;
    }

    /**
     * 获取container属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09Container }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UV09Container> getContainer() {
        return container;
    }

    /**
     * 设置container属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09Container }{@code >}
     *     
     */
    public void setContainer(JAXBElement<COCTMT080000UV09Container> value) {
        this.container = value;
    }

    /**
     * 获取containerAdditiveMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09AdditiveMaterial }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UV09AdditiveMaterial> getContainerAdditiveMaterial() {
        return containerAdditiveMaterial;
    }

    /**
     * 设置containerAdditiveMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UV09AdditiveMaterial }{@code >}
     *     
     */
    public void setContainerAdditiveMaterial(JAXBElement<COCTMT080000UV09AdditiveMaterial> value) {
        this.containerAdditiveMaterial = value;
    }

    /**
     * Gets the value of the related property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the related property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UV09SourceOf }
     * 
     * 
     */
    public List<COCTMT080000UV09SourceOf> getRelated() {
        if (related == null) {
            related = new ArrayList<COCTMT080000UV09SourceOf>();
        }
        return this.related;
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
     *     {@link RoleClassContent }
     *     
     */
    public RoleClassContent getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassContent }
     *     
     */
    public void setClassCode(RoleClassContent value) {
        this.classCode = value;
    }

}
