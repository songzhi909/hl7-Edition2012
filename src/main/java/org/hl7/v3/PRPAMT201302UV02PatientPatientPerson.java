//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.13 时间 05:16:19 PM CST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PRPA_MT201302UV02.Patient.patientPerson complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PRPA_MT201302UV02.Patient.patientPerson">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}PRPA_MT201302UV02.Person">
 *       &lt;attribute name="updateMode" type="{urn:hl7-org:v3}PRPA_MT201302UV02.Patient.patientPerson.updateMode" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_MT201302UV02.Patient.patientPerson")
public class PRPAMT201302UV02PatientPatientPerson
    extends PRPAMT201302UV02Person
{

    @XmlAttribute(name = "updateMode")
    protected PRPAMT201302UV02PatientPatientPersonUpdateMode updateMode;

    /**
     * 获取updateMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PRPAMT201302UV02PatientPatientPersonUpdateMode }
     *     
     */
    public PRPAMT201302UV02PatientPatientPersonUpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * 设置updateMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PRPAMT201302UV02PatientPatientPersonUpdateMode }
     *     
     */
    public void setUpdateMode(PRPAMT201302UV02PatientPatientPersonUpdateMode value) {
        this.updateMode = value;
    }

}
