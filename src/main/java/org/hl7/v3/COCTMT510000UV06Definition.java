//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.13 时间 05:16:19 PM CST 
//


package org.hl7.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>COCT_MT510000UV06.Definition complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="COCT_MT510000UV06.Definition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;choice>
 *           &lt;choice>
 *             &lt;element name="billableClinicalService1" type="{urn:hl7-org:v3}COCT_MT290000UV06.BillableClinicalService"/>
 *             &lt;element name="billableClinicalProduct1" type="{urn:hl7-org:v3}COCT_MT490000UV04.BillableClinicalProduct"/>
 *             &lt;element name="supplyEvent1" type="{urn:hl7-org:v3}COCT_MT300000UV04.SupplyEvent"/>
 *             &lt;element name="accomodationSupplied1" type="{urn:hl7-org:v3}COCT_MT310000UV04.AccomodationSupplied"/>
 *             &lt;element name="supplyEvent2" type="{urn:hl7-org:v3}COCT_MT600000UV06.SupplyEvent"/>
 *             &lt;element name="oralHealthService1" type="{urn:hl7-org:v3}COCT_MT740000UV04.OralHealthService"/>
 *             &lt;element name="crossReference1" type="{urn:hl7-org:v3}COCT_MT280000UV04.CrossReference"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;choice>
 *               &lt;element name="observation" type="{urn:hl7-org:v3}COCT_MT530000UV.Observation"/>
 *               &lt;element name="substanceAdministration" type="{urn:hl7-org:v3}COCT_MT530000UV.SubstanceAdministration"/>
 *               &lt;element name="supply" type="{urn:hl7-org:v3}COCT_MT530000UV.Supply"/>
 *               &lt;element name="procedure" type="{urn:hl7-org:v3}COCT_MT530000UV.Procedure"/>
 *               &lt;element name="encounter" type="{urn:hl7-org:v3}COCT_MT530000UV.Encounter"/>
 *               &lt;element name="act" type="{urn:hl7-org:v3}COCT_MT530000UV.Act"/>
 *               &lt;element name="organizer" type="{urn:hl7-org:v3}COCT_MT530000UV.Organizer"/>
 *             &lt;/choice>
 *             &lt;element name="actReference" type="{urn:hl7-org:v3}COCT_MT530000UV.ActReference"/>
 *           &lt;/choice>
 *           &lt;element name="transportation" type="{urn:hl7-org:v3}COCT_MT060000UV01.Transportation"/>
 *           &lt;element name="serviceDefinition" type="{urn:hl7-org:v3}COCT_MT510000UV06.ServiceDefinition"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}ActRelationshipInstantiatesMaster" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT510000UV06.Definition", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "billableClinicalService1",
    "billableClinicalProduct1",
    "supplyEvent1",
    "accomodationSupplied1",
    "supplyEvent2",
    "oralHealthService1",
    "crossReference1",
    "observation",
    "substanceAdministration",
    "supply",
    "procedure",
    "encounter",
    "act",
    "organizer",
    "actReference",
    "transportation",
    "serviceDefinition"
})
public class COCTMT510000UV06Definition {

    protected DSETCS realmCode;
    protected II typeId;
    protected LISTII templateId;
    @XmlElementRef(name = "billableClinicalService1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT290000UV06BillableClinicalService> billableClinicalService1;
    @XmlElementRef(name = "billableClinicalProduct1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT490000UV04BillableClinicalProduct> billableClinicalProduct1;
    @XmlElementRef(name = "supplyEvent1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT300000UV04SupplyEvent> supplyEvent1;
    @XmlElementRef(name = "accomodationSupplied1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT310000UV04AccomodationSupplied> accomodationSupplied1;
    @XmlElementRef(name = "supplyEvent2", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT600000UV06SupplyEvent> supplyEvent2;
    @XmlElementRef(name = "oralHealthService1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT740000UV04OralHealthService> oralHealthService1;
    @XmlElementRef(name = "crossReference1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT280000UV04CrossReference> crossReference1;
    @XmlElementRef(name = "observation", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVObservation> observation;
    @XmlElementRef(name = "substanceAdministration", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVSubstanceAdministration> substanceAdministration;
    @XmlElementRef(name = "supply", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVSupply> supply;
    @XmlElementRef(name = "procedure", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVProcedure> procedure;
    @XmlElementRef(name = "encounter", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVEncounter> encounter;
    @XmlElementRef(name = "act", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVAct> act;
    @XmlElementRef(name = "organizer", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVOrganizer> organizer;
    @XmlElementRef(name = "actReference", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVActReference> actReference;
    @XmlElementRef(name = "transportation", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT060000UV01Transportation> transportation;
    @XmlElementRef(name = "serviceDefinition", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT510000UV06ServiceDefinition> serviceDefinition;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "typeCode", required = true)
    protected ActRelationshipInstantiatesMaster typeCode;

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
     * 获取billableClinicalService1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06BillableClinicalService }{@code >}
     *     
     */
    public JAXBElement<COCTMT290000UV06BillableClinicalService> getBillableClinicalService1() {
        return billableClinicalService1;
    }

    /**
     * 设置billableClinicalService1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06BillableClinicalService }{@code >}
     *     
     */
    public void setBillableClinicalService1(JAXBElement<COCTMT290000UV06BillableClinicalService> value) {
        this.billableClinicalService1 = value;
    }

    /**
     * 获取billableClinicalProduct1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT490000UV04BillableClinicalProduct }{@code >}
     *     
     */
    public JAXBElement<COCTMT490000UV04BillableClinicalProduct> getBillableClinicalProduct1() {
        return billableClinicalProduct1;
    }

    /**
     * 设置billableClinicalProduct1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT490000UV04BillableClinicalProduct }{@code >}
     *     
     */
    public void setBillableClinicalProduct1(JAXBElement<COCTMT490000UV04BillableClinicalProduct> value) {
        this.billableClinicalProduct1 = value;
    }

    /**
     * 获取supplyEvent1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT300000UV04SupplyEvent }{@code >}
     *     
     */
    public JAXBElement<COCTMT300000UV04SupplyEvent> getSupplyEvent1() {
        return supplyEvent1;
    }

    /**
     * 设置supplyEvent1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT300000UV04SupplyEvent }{@code >}
     *     
     */
    public void setSupplyEvent1(JAXBElement<COCTMT300000UV04SupplyEvent> value) {
        this.supplyEvent1 = value;
    }

    /**
     * 获取accomodationSupplied1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT310000UV04AccomodationSupplied }{@code >}
     *     
     */
    public JAXBElement<COCTMT310000UV04AccomodationSupplied> getAccomodationSupplied1() {
        return accomodationSupplied1;
    }

    /**
     * 设置accomodationSupplied1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT310000UV04AccomodationSupplied }{@code >}
     *     
     */
    public void setAccomodationSupplied1(JAXBElement<COCTMT310000UV04AccomodationSupplied> value) {
        this.accomodationSupplied1 = value;
    }

    /**
     * 获取supplyEvent2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT600000UV06SupplyEvent }{@code >}
     *     
     */
    public JAXBElement<COCTMT600000UV06SupplyEvent> getSupplyEvent2() {
        return supplyEvent2;
    }

    /**
     * 设置supplyEvent2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT600000UV06SupplyEvent }{@code >}
     *     
     */
    public void setSupplyEvent2(JAXBElement<COCTMT600000UV06SupplyEvent> value) {
        this.supplyEvent2 = value;
    }

    /**
     * 获取oralHealthService1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT740000UV04OralHealthService }{@code >}
     *     
     */
    public JAXBElement<COCTMT740000UV04OralHealthService> getOralHealthService1() {
        return oralHealthService1;
    }

    /**
     * 设置oralHealthService1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT740000UV04OralHealthService }{@code >}
     *     
     */
    public void setOralHealthService1(JAXBElement<COCTMT740000UV04OralHealthService> value) {
        this.oralHealthService1 = value;
    }

    /**
     * 获取crossReference1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT280000UV04CrossReference }{@code >}
     *     
     */
    public JAXBElement<COCTMT280000UV04CrossReference> getCrossReference1() {
        return crossReference1;
    }

    /**
     * 设置crossReference1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT280000UV04CrossReference }{@code >}
     *     
     */
    public void setCrossReference1(JAXBElement<COCTMT280000UV04CrossReference> value) {
        this.crossReference1 = value;
    }

    /**
     * 获取observation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVObservation> getObservation() {
        return observation;
    }

    /**
     * 设置observation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}
     *     
     */
    public void setObservation(JAXBElement<COCTMT530000UVObservation> value) {
        this.observation = value;
    }

    /**
     * 获取substanceAdministration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVSubstanceAdministration> getSubstanceAdministration() {
        return substanceAdministration;
    }

    /**
     * 设置substanceAdministration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}
     *     
     */
    public void setSubstanceAdministration(JAXBElement<COCTMT530000UVSubstanceAdministration> value) {
        this.substanceAdministration = value;
    }

    /**
     * 获取supply属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVSupply> getSupply() {
        return supply;
    }

    /**
     * 设置supply属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}
     *     
     */
    public void setSupply(JAXBElement<COCTMT530000UVSupply> value) {
        this.supply = value;
    }

    /**
     * 获取procedure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVProcedure> getProcedure() {
        return procedure;
    }

    /**
     * 设置procedure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}
     *     
     */
    public void setProcedure(JAXBElement<COCTMT530000UVProcedure> value) {
        this.procedure = value;
    }

    /**
     * 获取encounter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVEncounter> getEncounter() {
        return encounter;
    }

    /**
     * 设置encounter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}
     *     
     */
    public void setEncounter(JAXBElement<COCTMT530000UVEncounter> value) {
        this.encounter = value;
    }

    /**
     * 获取act属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVAct> getAct() {
        return act;
    }

    /**
     * 设置act属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}
     *     
     */
    public void setAct(JAXBElement<COCTMT530000UVAct> value) {
        this.act = value;
    }

    /**
     * 获取organizer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVOrganizer> getOrganizer() {
        return organizer;
    }

    /**
     * 设置organizer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}
     *     
     */
    public void setOrganizer(JAXBElement<COCTMT530000UVOrganizer> value) {
        this.organizer = value;
    }

    /**
     * 获取actReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVActReference }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVActReference> getActReference() {
        return actReference;
    }

    /**
     * 设置actReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVActReference }{@code >}
     *     
     */
    public void setActReference(JAXBElement<COCTMT530000UVActReference> value) {
        this.actReference = value;
    }

    /**
     * 获取transportation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT060000UV01Transportation }{@code >}
     *     
     */
    public JAXBElement<COCTMT060000UV01Transportation> getTransportation() {
        return transportation;
    }

    /**
     * 设置transportation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT060000UV01Transportation }{@code >}
     *     
     */
    public void setTransportation(JAXBElement<COCTMT060000UV01Transportation> value) {
        this.transportation = value;
    }

    /**
     * 获取serviceDefinition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06ServiceDefinition }{@code >}
     *     
     */
    public JAXBElement<COCTMT510000UV06ServiceDefinition> getServiceDefinition() {
        return serviceDefinition;
    }

    /**
     * 设置serviceDefinition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06ServiceDefinition }{@code >}
     *     
     */
    public void setServiceDefinition(JAXBElement<COCTMT510000UV06ServiceDefinition> value) {
        this.serviceDefinition = value;
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
     *     {@link ActRelationshipInstantiatesMaster }
     *     
     */
    public ActRelationshipInstantiatesMaster getTypeCode() {
        return typeCode;
    }

    /**
     * 设置typeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActRelationshipInstantiatesMaster }
     *     
     */
    public void setTypeCode(ActRelationshipInstantiatesMaster value) {
        this.typeCode = value;
    }

}
