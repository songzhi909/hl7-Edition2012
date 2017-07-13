//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.13 时间 05:16:19 PM CST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CalendarCycleOneLetter的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarCycleOneLetter">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CW"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="DM"/>
 *     &lt;enumeration value="DW"/>
 *     &lt;enumeration value="J"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="HD"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="NH"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="J"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalendarCycleOneLetter")
@XmlEnum
public enum CalendarCycleOneLetter {

    CW,
    W,
    CY,
    Y,
    D,
    DM,
    DW,
    J,
    H,
    HD,
    M,
    MY,
    N,
    NH,
    S,
    SN;

    public String value() {
        return name();
    }

    public static CalendarCycleOneLetter fromValue(String v) {
        return valueOf(v);
    }

}
