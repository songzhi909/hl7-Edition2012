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
 * <p>EntityNamePartQualifierR2的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EntityNamePartQualifierR2">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="DEV"/>
 *     &lt;enumeration value="FRM"/>
 *     &lt;enumeration value="HOM"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="INV"/>
 *     &lt;enumeration value="LS"/>
 *     &lt;enumeration value="MID"/>
 *     &lt;enumeration value="NB"/>
 *     &lt;enumeration value="PFX"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="SCI"/>
 *     &lt;enumeration value="SFX"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="STR"/>
 *     &lt;enumeration value="TMK"/>
 *     &lt;enumeration value="USE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityNamePartQualifierR2")
@XmlEnum
public enum EntityNamePartQualifierR2 {

    AC,
    AD,
    BR,
    CL,
    CON,
    DEV,
    FRM,
    HOM,
    IN,
    INV,
    LS,
    MID,
    NB,
    PFX,
    PR,
    SCI,
    SFX,
    SP,
    STR,
    TMK,
    USE;

    public String value() {
        return name();
    }

    public static EntityNamePartQualifierR2 fromValue(String v) {
        return valueOf(v);
    }

}
