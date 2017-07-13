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
 * <p>COCT_MT230100UV.Medication complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="COCT_MT230100UV.Medication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="administrableMedicine" type="{urn:hl7-org:v3}COCT_MT230100UV.Medicine"/>
 *         &lt;element name="subjectOf1" type="{urn:hl7-org:v3}COCT_MT230100UV.Subject2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectOf2" type="{urn:hl7-org:v3}COCT_MT230100UV.Subject1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectOf3" type="{urn:hl7-org:v3}COCT_MT230100UV.Subject22" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectOf4" type="{urn:hl7-org:v3}COCT_MT230100UV.Subject3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectOf5" type="{urn:hl7-org:v3}COCT_MT230100UV.Subject7" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassAdministerableMaterial" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT230100UV.Medication", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "administrableMedicine",
    "subjectOf1",
    "subjectOf2",
    "subjectOf3",
    "subjectOf4",
    "subjectOf5"
})
public class COCTMT230100UVMedication {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    @XmlElement(required = true)
    protected COCTMT230100UVMedicine administrableMedicine;
    @XmlElement(nillable = true)
    protected List<COCTMT230100UVSubject2> subjectOf1;
    @XmlElement(nillable = true)
    protected List<COCTMT230100UVSubject1> subjectOf2;
    @XmlElement(nillable = true)
    protected List<COCTMT230100UVSubject22> subjectOf3;
    @XmlElement(nillable = true)
    protected List<COCTMT230100UVSubject3> subjectOf4;
    @XmlElementRef(name = "subjectOf5", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT230100UVSubject7> subjectOf5;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassAdministerableMaterial classCode;

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
     * 获取administrableMedicine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link COCTMT230100UVMedicine }
     *     
     */
    public COCTMT230100UVMedicine getAdministrableMedicine() {
        return administrableMedicine;
    }

    /**
     * 设置administrableMedicine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT230100UVMedicine }
     *     
     */
    public void setAdministrableMedicine(COCTMT230100UVMedicine value) {
        this.administrableMedicine = value;
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
     * {@link COCTMT230100UVSubject2 }
     * 
     * 
     */
    public List<COCTMT230100UVSubject2> getSubjectOf1() {
        if (subjectOf1 == null) {
            subjectOf1 = new ArrayList<COCTMT230100UVSubject2>();
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
     * {@link COCTMT230100UVSubject1 }
     * 
     * 
     */
    public List<COCTMT230100UVSubject1> getSubjectOf2() {
        if (subjectOf2 == null) {
            subjectOf2 = new ArrayList<COCTMT230100UVSubject1>();
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
     * {@link COCTMT230100UVSubject22 }
     * 
     * 
     */
    public List<COCTMT230100UVSubject22> getSubjectOf3() {
        if (subjectOf3 == null) {
            subjectOf3 = new ArrayList<COCTMT230100UVSubject22>();
        }
        return this.subjectOf3;
    }

    /**
     * Gets the value of the subjectOf4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT230100UVSubject3 }
     * 
     * 
     */
    public List<COCTMT230100UVSubject3> getSubjectOf4() {
        if (subjectOf4 == null) {
            subjectOf4 = new ArrayList<COCTMT230100UVSubject3>();
        }
        return this.subjectOf4;
    }

    /**
     * 获取subjectOf5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject7 }{@code >}
     *     
     */
    public JAXBElement<COCTMT230100UVSubject7> getSubjectOf5() {
        return subjectOf5;
    }

    /**
     * 设置subjectOf5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject7 }{@code >}
     *     
     */
    public void setSubjectOf5(JAXBElement<COCTMT230100UVSubject7> value) {
        this.subjectOf5 = value;
    }

    /**
     * 获取classCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoleClassAdministerableMaterial }
     *     
     */
    public RoleClassAdministerableMaterial getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassAdministerableMaterial }
     *     
     */
    public void setClassCode(RoleClassAdministerableMaterial value) {
        this.classCode = value;
    }

}
