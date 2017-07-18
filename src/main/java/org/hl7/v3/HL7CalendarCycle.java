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
 * <p>HL7CalendarCycle的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HL7CalendarCycle">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CW"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="DM"/>
 *     &lt;enumeration value="DW"/>
 *     &lt;enumeration value="DY"/>
 *     &lt;enumeration value="HD"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="NH"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="WY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HL7CalendarCycle")
@XmlEnum
public enum HL7CalendarCycle {

    CD,
    CH,
    CM,
    CN,
    CS,
    CW,
    CY,
    DM,
    DW,
    DY,
    HD,
    MY,
    NH,
    SN,
    WY;

    public String value() {
        return name();
    }

    public static HL7CalendarCycle fromValue(String v) {
        return valueOf(v);
    }

}
