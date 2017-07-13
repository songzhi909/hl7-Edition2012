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
 * <p>CalendarCycle的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarCycle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CW"/>
 *     &lt;enumeration value="WM"/>
 *     &lt;enumeration value="WY"/>
 *     &lt;enumeration value="DM"/>
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="DY"/>
 *     &lt;enumeration value="DW"/>
 *     &lt;enumeration value="HD"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="NH"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="CS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalendarCycle")
@XmlEnum
public enum CalendarCycle {

    CY,
    MY,
    CM,
    CW,
    WM,
    WY,
    DM,
    CD,
    DY,
    DW,
    HD,
    CH,
    NH,
    CN,
    SN,
    CS;

    public String value() {
        return name();
    }

    public static CalendarCycle fromValue(String v) {
        return valueOf(v);
    }

}
