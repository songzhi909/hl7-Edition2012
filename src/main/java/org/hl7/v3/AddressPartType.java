//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.10 时间 10:45:02 AM CST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AddressPartType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AddressPartType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="ADL"/>
 *     &lt;enumeration value="UNID"/>
 *     &lt;enumeration value="UNIT"/>
 *     &lt;enumeration value="DAL"/>
 *     &lt;enumeration value="DINST"/>
 *     &lt;enumeration value="DINSTA"/>
 *     &lt;enumeration value="DINSTQ"/>
 *     &lt;enumeration value="DMOD"/>
 *     &lt;enumeration value="DMODID"/>
 *     &lt;enumeration value="SAL"/>
 *     &lt;enumeration value="BNR"/>
 *     &lt;enumeration value="BNN"/>
 *     &lt;enumeration value="BNS"/>
 *     &lt;enumeration value="STR"/>
 *     &lt;enumeration value="STB"/>
 *     &lt;enumeration value="STTYP"/>
 *     &lt;enumeration value="DIR"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="CAR"/>
 *     &lt;enumeration value="CEN"/>
 *     &lt;enumeration value="CNT"/>
 *     &lt;enumeration value="CPA"/>
 *     &lt;enumeration value="CTY"/>
 *     &lt;enumeration value="DEL"/>
 *     &lt;enumeration value="POB"/>
 *     &lt;enumeration value="PRE"/>
 *     &lt;enumeration value="STA"/>
 *     &lt;enumeration value="ZIP"/>
 *     &lt;enumeration value="DPID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressPartType")
@XmlEnum
public enum AddressPartType {

    AL,
    ADL,
    UNID,
    UNIT,
    DAL,
    DINST,
    DINSTA,
    DINSTQ,
    DMOD,
    DMODID,
    SAL,
    BNR,
    BNN,
    BNS,
    STR,
    STB,
    STTYP,
    DIR,
    INT,
    CAR,
    CEN,
    CNT,
    CPA,
    CTY,
    DEL,
    POB,
    PRE,
    STA,
    ZIP,
    DPID;

    public String value() {
        return name();
    }

    public static AddressPartType fromValue(String v) {
        return valueOf(v);
    }

}
