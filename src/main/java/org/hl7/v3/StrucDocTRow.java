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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StrucDoc.TRow complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StrucDoc.TRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}StrucDoc.TableItem">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="th" type="{urn:hl7-org:v3}StrucDoc.TCell"/>
 *           &lt;element name="td" type="{urn:hl7-org:v3}StrucDoc.TCell"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrucDoc.TRow", propOrder = {
    "thOrTd"
})
public class StrucDocTRow
    extends StrucDocTableItem
{

    @XmlElementRefs({
        @XmlElementRef(name = "th", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "td", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<StrucDocTCell>> thOrTd;

    /**
     * Gets the value of the thOrTd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thOrTd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThOrTd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link StrucDocTCell }{@code >}
     * {@link JAXBElement }{@code <}{@link StrucDocTCell }{@code >}
     * 
     * 
     */
    public List<JAXBElement<StrucDocTCell>> getThOrTd() {
        if (thOrTd == null) {
            thOrTd = new ArrayList<JAXBElement<StrucDocTCell>>();
        }
        return this.thOrTd;
    }

}
