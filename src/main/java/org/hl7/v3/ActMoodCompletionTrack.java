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
 * <p>ActMoodCompletionTrack的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ActMoodCompletionTrack">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DEF"/>
 *     &lt;enumeration value="PERM"/>
 *     &lt;enumeration value="SLOT"/>
 *     &lt;enumeration value="EVN"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="ARQ"/>
 *     &lt;enumeration value="PERMRQ"/>
 *     &lt;enumeration value="RQO"/>
 *     &lt;enumeration value="PRP"/>
 *     &lt;enumeration value="RMD"/>
 *     &lt;enumeration value="PRMS"/>
 *     &lt;enumeration value="APT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActMoodCompletionTrack")
@XmlEnum
public enum ActMoodCompletionTrack {

    DEF,
    PERM,
    SLOT,
    EVN,
    INT,
    ARQ,
    PERMRQ,
    RQO,
    PRP,
    RMD,
    PRMS,
    APT;

    public String value() {
        return name();
    }

    public static ActMoodCompletionTrack fromValue(String v) {
        return valueOf(v);
    }

}
