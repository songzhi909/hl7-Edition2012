//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.13 时间 05:16:19 PM CST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UncertaintyType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="UncertaintyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="LN"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="X2"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UncertaintyType")
@XmlEnum
public enum UncertaintyType {

    U("U"),
    N("N"),
    LN("LN"),
    G("G"),
    E("E"),
    @XmlEnumValue("X2")
    X_2("X2"),
    T("T"),
    F("F"),
    B("B");
    private final String value;

    UncertaintyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UncertaintyType fromValue(String v) {
        for (UncertaintyType c: UncertaintyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
