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
 * <p>RoleLinkRelated的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RoleLinkRelated">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="REL"/>
 *     &lt;enumeration value="BACKUP"/>
 *     &lt;enumeration value="CONT"/>
 *     &lt;enumeration value="DIRAUTH"/>
 *     &lt;enumeration value="IDENT"/>
 *     &lt;enumeration value="INDAUTH"/>
 *     &lt;enumeration value="PART"/>
 *     &lt;enumeration value="REPL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleLinkRelated")
@XmlEnum
public enum RoleLinkRelated {

    REL,
    BACKUP,
    CONT,
    DIRAUTH,
    IDENT,
    INDAUTH,
    PART,
    REPL;

    public String value() {
        return name();
    }

    public static RoleLinkRelated fromValue(String v) {
        return valueOf(v);
    }

}
