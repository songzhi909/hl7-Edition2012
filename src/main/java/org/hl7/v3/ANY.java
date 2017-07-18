//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.10 时间 10:45:02 AM CST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ANY complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ANY">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}HXIT">
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="flavorId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateMode" type="{urn:hl7-org:v3}UpdateMode" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANY")
@XmlSeeAlso({
    II.class,
    CS.class,
    UVPRTO.class,
    NPPDINT.class,
    UVPINT.class,
    SLISTREAL.class,
    SLISTINT.class,
    QSETCO.class,
    QSETMO.class,
    NPPDMO.class,
    NPPDPQ.class,
    QSETQTY.class,
    NPPDSC.class,
    NPPDCO.class,
    NPPDCS.class,
    NPPDCD.class,
    NPPDEN.class,
    NPPDED.class,
    NPPDREAL.class,
    SLISTTS.class,
    NPPDII.class,
    SLISTPQ.class,
    NPPDBL.class,
    NPPDAD.class,
    NPPDRTO.class,
    AD.class,
    BL.class,
    CD.class,
    UVPII.class,
    ED.class,
    UVPED.class,
    UVPEN.class,
    UVPCS.class,
    UVPCO.class,
    UVPCD.class,
    UVPBL.class,
    UVPAD.class,
    NPPDTEL.class,
    UVPTEL.class,
    ST.class,
    UVPTS.class,
    UVPREAL.class,
    NPPDTS.class,
    UVPSC.class,
    NPPDST.class,
    UVPST.class,
    GLISTREAL.class,
    UVPPQ.class,
    UVPMO.class,
    COLLII.class,
    QSETINT.class,
    QSETREAL.class,
    COLLBL.class,
    TEL.class,
    COLLAD.class,
    COLLMO.class,
    COLLED.class,
    COLLEN.class,
    COLLCS.class,
    COLLCD.class,
    COLLCO.class,
    GLISTPQ.class,
    QSETPQ.class,
    COLLPQ.class,
    QTY.class,
    COLLINT.class,
    GLISTTS.class,
    COLLSC.class,
    COLLST.class,
    COLLREAL.class,
    COLLTS.class,
    COLLRTO.class,
    QSETTS.class
})
public class ANY
    extends HXIT
{

    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "flavorId")
    protected String flavorId;
    @XmlAttribute(name = "updateMode")
    protected UpdateMode updateMode;

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
     * 获取flavorId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlavorId() {
        return flavorId;
    }

    /**
     * 设置flavorId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlavorId(String value) {
        this.flavorId = value;
    }

    /**
     * 获取updateMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UpdateMode }
     *     
     */
    public UpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * 设置updateMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMode }
     *     
     */
    public void setUpdateMode(UpdateMode value) {
        this.updateMode = value;
    }

}
