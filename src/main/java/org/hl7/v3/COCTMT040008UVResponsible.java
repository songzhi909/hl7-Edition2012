//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.10 时间 10:45:02 AM CST 
//


package org.hl7.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>COCT_MT040008UV.Responsible complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="COCT_MT040008UV.Responsible">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}DSET_II"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="agentOrganization" type="{urn:hl7-org:v3}COCT_MT150007UV.Organization" minOccurs="0"/>
 *           &lt;element name="agentPerson" type="{urn:hl7-org:v3}COCT_MT030207UV07.Person" minOccurs="0"/>
 *           &lt;element name="agentDevice" type="{urn:hl7-org:v3}COCT_MT140007UV.Device" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="representedOrganization" type="{urn:hl7-org:v3}COCT_MT150007UV.Organization" minOccurs="0"/>
 *           &lt;element name="representedPerson" type="{urn:hl7-org:v3}COCT_MT030207UV07.Person" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassAgent" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT040008UV.Responsible", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "effectiveTime",
    "agentOrganization",
    "agentPerson",
    "agentDevice",
    "representedOrganization",
    "representedPerson"
})
public class COCTMT040008UVResponsible {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    @XmlElement(required = true)
    protected DSETII id;
    protected CD code;
    protected IVLTS effectiveTime;
    @XmlElementRef(name = "agentOrganization", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT150007UVOrganization> agentOrganization;
    @XmlElementRef(name = "agentPerson", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT030207UV07Person> agentPerson;
    @XmlElementRef(name = "agentDevice", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT140007UVDevice> agentDevice;
    @XmlElementRef(name = "representedOrganization", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT150007UVOrganization> representedOrganization;
    @XmlElementRef(name = "representedPerson", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT030207UV07Person> representedPerson;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassAgent classCode;

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
     * 获取agentOrganization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}
     *     
     */
    public JAXBElement<COCTMT150007UVOrganization> getAgentOrganization() {
        return agentOrganization;
    }

    /**
     * 设置agentOrganization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}
     *     
     */
    public void setAgentOrganization(JAXBElement<COCTMT150007UVOrganization> value) {
        this.agentOrganization = value;
    }

    /**
     * 获取agentPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}
     *     
     */
    public JAXBElement<COCTMT030207UV07Person> getAgentPerson() {
        return agentPerson;
    }

    /**
     * 设置agentPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}
     *     
     */
    public void setAgentPerson(JAXBElement<COCTMT030207UV07Person> value) {
        this.agentPerson = value;
    }

    /**
     * 获取agentDevice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT140007UVDevice }{@code >}
     *     
     */
    public JAXBElement<COCTMT140007UVDevice> getAgentDevice() {
        return agentDevice;
    }

    /**
     * 设置agentDevice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT140007UVDevice }{@code >}
     *     
     */
    public void setAgentDevice(JAXBElement<COCTMT140007UVDevice> value) {
        this.agentDevice = value;
    }

    /**
     * 获取representedOrganization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}
     *     
     */
    public JAXBElement<COCTMT150007UVOrganization> getRepresentedOrganization() {
        return representedOrganization;
    }

    /**
     * 设置representedOrganization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}
     *     
     */
    public void setRepresentedOrganization(JAXBElement<COCTMT150007UVOrganization> value) {
        this.representedOrganization = value;
    }

    /**
     * 获取representedPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}
     *     
     */
    public JAXBElement<COCTMT030207UV07Person> getRepresentedPerson() {
        return representedPerson;
    }

    /**
     * 设置representedPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}
     *     
     */
    public void setRepresentedPerson(JAXBElement<COCTMT030207UV07Person> value) {
        this.representedPerson = value;
    }

    /**
     * 获取classCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoleClassAgent }
     *     
     */
    public RoleClassAgent getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassAgent }
     *     
     */
    public void setClassCode(RoleClassAgent value) {
        this.classCode = value;
    }

}
