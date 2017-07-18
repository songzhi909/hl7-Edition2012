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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>COCT_MT080000UV09.ControlVariable complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="COCT_MT080000UV09.ControlVariable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="sequenceNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="dillution" type="{urn:hl7-org:v3}COCT_MT210000UV02.Dillution"/>
 *           &lt;element name="endogenousContent" type="{urn:hl7-org:v3}COCT_MT210000UV02.EndogenousContent"/>
 *           &lt;element name="reflexPermission" type="{urn:hl7-org:v3}COCT_MT210000UV02.ReflexPermission"/>
 *           &lt;element name="autoRepeatPermission" type="{urn:hl7-org:v3}COCT_MT210000UV02.AutoRepeatPermission"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}ActRelationshipHasControlVariable" />
 *       &lt;attribute name="contextControlCode" type="{urn:hl7-org:v3}ContextControl" default="AN" />
 *       &lt;attribute name="contextConductionInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT080000UV09.ControlVariable", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "sequenceNumber",
    "dillution",
    "endogenousContent",
    "reflexPermission",
    "autoRepeatPermission"
})
public class COCTMT080000UV09ControlVariable {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    protected INT sequenceNumber;
    @XmlElementRef(name = "dillution", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT210000UV02Dillution> dillution;
    @XmlElementRef(name = "endogenousContent", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT210000UV02EndogenousContent> endogenousContent;
    @XmlElementRef(name = "reflexPermission", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT210000UV02ReflexPermission> reflexPermission;
    @XmlElementRef(name = "autoRepeatPermission", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT210000UV02AutoRepeatPermission> autoRepeatPermission;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "typeCode", required = true)
    protected ActRelationshipHasControlVariable typeCode;
    @XmlAttribute(name = "contextControlCode")
    protected ContextControl contextControlCode;
    @XmlAttribute(name = "contextConductionInd", required = true)
    protected boolean contextConductionInd;

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
     * 获取sequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * 设置sequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setSequenceNumber(INT value) {
        this.sequenceNumber = value;
    }

    /**
     * 获取dillution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT210000UV02Dillution }{@code >}
     *     
     */
    public JAXBElement<COCTMT210000UV02Dillution> getDillution() {
        return dillution;
    }

    /**
     * 设置dillution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT210000UV02Dillution }{@code >}
     *     
     */
    public void setDillution(JAXBElement<COCTMT210000UV02Dillution> value) {
        this.dillution = value;
    }

    /**
     * 获取endogenousContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT210000UV02EndogenousContent }{@code >}
     *     
     */
    public JAXBElement<COCTMT210000UV02EndogenousContent> getEndogenousContent() {
        return endogenousContent;
    }

    /**
     * 设置endogenousContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT210000UV02EndogenousContent }{@code >}
     *     
     */
    public void setEndogenousContent(JAXBElement<COCTMT210000UV02EndogenousContent> value) {
        this.endogenousContent = value;
    }

    /**
     * 获取reflexPermission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT210000UV02ReflexPermission }{@code >}
     *     
     */
    public JAXBElement<COCTMT210000UV02ReflexPermission> getReflexPermission() {
        return reflexPermission;
    }

    /**
     * 设置reflexPermission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT210000UV02ReflexPermission }{@code >}
     *     
     */
    public void setReflexPermission(JAXBElement<COCTMT210000UV02ReflexPermission> value) {
        this.reflexPermission = value;
    }

    /**
     * 获取autoRepeatPermission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT210000UV02AutoRepeatPermission }{@code >}
     *     
     */
    public JAXBElement<COCTMT210000UV02AutoRepeatPermission> getAutoRepeatPermission() {
        return autoRepeatPermission;
    }

    /**
     * 设置autoRepeatPermission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT210000UV02AutoRepeatPermission }{@code >}
     *     
     */
    public void setAutoRepeatPermission(JAXBElement<COCTMT210000UV02AutoRepeatPermission> value) {
        this.autoRepeatPermission = value;
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
     * 获取typeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActRelationshipHasControlVariable }
     *     
     */
    public ActRelationshipHasControlVariable getTypeCode() {
        return typeCode;
    }

    /**
     * 设置typeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActRelationshipHasControlVariable }
     *     
     */
    public void setTypeCode(ActRelationshipHasControlVariable value) {
        this.typeCode = value;
    }

    /**
     * 获取contextControlCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContextControl }
     *     
     */
    public ContextControl getContextControlCode() {
        if (contextControlCode == null) {
            return ContextControl.AN;
        } else {
            return contextControlCode;
        }
    }

    /**
     * 设置contextControlCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContextControl }
     *     
     */
    public void setContextControlCode(ContextControl value) {
        this.contextControlCode = value;
    }

    /**
     * 获取contextConductionInd属性的值。
     * 
     */
    public boolean isContextConductionInd() {
        return contextConductionInd;
    }

    /**
     * 设置contextConductionInd属性的值。
     * 
     */
    public void setContextConductionInd(boolean value) {
        this.contextConductionInd = value;
    }

}
