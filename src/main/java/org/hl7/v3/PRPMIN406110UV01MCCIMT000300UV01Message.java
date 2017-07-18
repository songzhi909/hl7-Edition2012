//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.10 时间 10:45:02 AM CST 
//


package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PRPM_IN406110UV01.MCCI_MT000300UV01.Message complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PRPM_IN406110UV01.MCCI_MT000300UV01.Message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II"/>
 *         &lt;element name="creationTime" type="{urn:hl7-org:v3}TS"/>
 *         &lt;element name="securityText" type="{urn:hl7-org:v3}ST" minOccurs="0"/>
 *         &lt;element name="versionCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="interactionId" type="{urn:hl7-org:v3}II"/>
 *         &lt;element name="profileId" type="{urn:hl7-org:v3}DSET_II" minOccurs="0"/>
 *         &lt;element name="processingCode" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="processingModeCode" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="acceptAckCode" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="attachmentText" type="{urn:hl7-org:v3}DSET_ED" minOccurs="0"/>
 *         &lt;element name="receiver" type="{urn:hl7-org:v3}MCCI_MT000300UV01.Receiver" maxOccurs="unbounded"/>
 *         &lt;element name="respondTo" type="{urn:hl7-org:v3}MCCI_MT000300UV01.RespondTo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sender" type="{urn:hl7-org:v3}MCCI_MT000300UV01.Sender"/>
 *         &lt;element name="attentionLine" type="{urn:hl7-org:v3}MCCI_MT000300UV01.AttentionLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="acknowledgement" type="{urn:hl7-org:v3}MCCI_MT000300UV01.Acknowledgement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="controlActProcess" type="{urn:hl7-org:v3}PRPM_IN406110UV01.MFMI_MT700711UV01.ControlActProcess"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPM_IN406110UV01.MCCI_MT000300UV01.Message", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "creationTime",
    "securityText",
    "versionCode",
    "interactionId",
    "profileId",
    "processingCode",
    "processingModeCode",
    "acceptAckCode",
    "attachmentText",
    "receiver",
    "respondTo",
    "sender",
    "attentionLine",
    "acknowledgement",
    "controlActProcess"
})
@XmlSeeAlso({
    PRPMIN406110UV01 .class
})
public class PRPMIN406110UV01MCCIMT000300UV01Message {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    @XmlElement(required = true)
    protected II id;
    @XmlElement(required = true)
    protected TS creationTime;
    protected ST securityText;
    protected CS versionCode;
    @XmlElement(required = true)
    protected II interactionId;
    protected DSETII profileId;
    @XmlElement(required = true)
    protected CS processingCode;
    @XmlElement(required = true)
    protected CS processingModeCode;
    @XmlElement(required = true)
    protected CS acceptAckCode;
    protected DSETED attachmentText;
    @XmlElement(required = true)
    protected List<MCCIMT000300UV01Receiver> receiver;
    @XmlElement(nillable = true)
    protected List<MCCIMT000300UV01RespondTo> respondTo;
    @XmlElement(required = true)
    protected MCCIMT000300UV01Sender sender;
    @XmlElement(nillable = true)
    protected List<MCCIMT000300UV01AttentionLine> attentionLine;
    @XmlElement(nillable = true)
    protected List<MCCIMT000300UV01Acknowledgement> acknowledgement;
    @XmlElement(required = true)
    protected PRPMIN406110UV01MFMIMT700711UV01ControlActProcess controlActProcess;

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
     * 获取creationTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getCreationTime() {
        return creationTime;
    }

    /**
     * 设置creationTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setCreationTime(TS value) {
        this.creationTime = value;
    }

    /**
     * 获取securityText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getSecurityText() {
        return securityText;
    }

    /**
     * 设置securityText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setSecurityText(ST value) {
        this.securityText = value;
    }

    /**
     * 获取versionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getVersionCode() {
        return versionCode;
    }

    /**
     * 设置versionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setVersionCode(CS value) {
        this.versionCode = value;
    }

    /**
     * 获取interactionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getInteractionId() {
        return interactionId;
    }

    /**
     * 设置interactionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setInteractionId(II value) {
        this.interactionId = value;
    }

    /**
     * 获取profileId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DSETII }
     *     
     */
    public DSETII getProfileId() {
        return profileId;
    }

    /**
     * 设置profileId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DSETII }
     *     
     */
    public void setProfileId(DSETII value) {
        this.profileId = value;
    }

    /**
     * 获取processingCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getProcessingCode() {
        return processingCode;
    }

    /**
     * 设置processingCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setProcessingCode(CS value) {
        this.processingCode = value;
    }

    /**
     * 获取processingModeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getProcessingModeCode() {
        return processingModeCode;
    }

    /**
     * 设置processingModeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setProcessingModeCode(CS value) {
        this.processingModeCode = value;
    }

    /**
     * 获取acceptAckCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getAcceptAckCode() {
        return acceptAckCode;
    }

    /**
     * 设置acceptAckCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setAcceptAckCode(CS value) {
        this.acceptAckCode = value;
    }

    /**
     * 获取attachmentText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DSETED }
     *     
     */
    public DSETED getAttachmentText() {
        return attachmentText;
    }

    /**
     * 设置attachmentText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DSETED }
     *     
     */
    public void setAttachmentText(DSETED value) {
        this.attachmentText = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCCIMT000300UV01Receiver }
     * 
     * 
     */
    public List<MCCIMT000300UV01Receiver> getReceiver() {
        if (receiver == null) {
            receiver = new ArrayList<MCCIMT000300UV01Receiver>();
        }
        return this.receiver;
    }

    /**
     * Gets the value of the respondTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respondTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespondTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCCIMT000300UV01RespondTo }
     * 
     * 
     */
    public List<MCCIMT000300UV01RespondTo> getRespondTo() {
        if (respondTo == null) {
            respondTo = new ArrayList<MCCIMT000300UV01RespondTo>();
        }
        return this.respondTo;
    }

    /**
     * 获取sender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MCCIMT000300UV01Sender }
     *     
     */
    public MCCIMT000300UV01Sender getSender() {
        return sender;
    }

    /**
     * 设置sender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MCCIMT000300UV01Sender }
     *     
     */
    public void setSender(MCCIMT000300UV01Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the attentionLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attentionLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttentionLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCCIMT000300UV01AttentionLine }
     * 
     * 
     */
    public List<MCCIMT000300UV01AttentionLine> getAttentionLine() {
        if (attentionLine == null) {
            attentionLine = new ArrayList<MCCIMT000300UV01AttentionLine>();
        }
        return this.attentionLine;
    }

    /**
     * Gets the value of the acknowledgement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acknowledgement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcknowledgement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCCIMT000300UV01Acknowledgement }
     * 
     * 
     */
    public List<MCCIMT000300UV01Acknowledgement> getAcknowledgement() {
        if (acknowledgement == null) {
            acknowledgement = new ArrayList<MCCIMT000300UV01Acknowledgement>();
        }
        return this.acknowledgement;
    }

    /**
     * 获取controlActProcess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PRPMIN406110UV01MFMIMT700711UV01ControlActProcess }
     *     
     */
    public PRPMIN406110UV01MFMIMT700711UV01ControlActProcess getControlActProcess() {
        return controlActProcess;
    }

    /**
     * 设置controlActProcess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PRPMIN406110UV01MFMIMT700711UV01ControlActProcess }
     *     
     */
    public void setControlActProcess(PRPMIN406110UV01MFMIMT700711UV01ControlActProcess value) {
        this.controlActProcess = value;
    }

}
