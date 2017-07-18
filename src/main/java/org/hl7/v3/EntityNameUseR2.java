//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.10 时间 10:45:02 AM CST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EntityNameUseR2的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EntityNameUseR2">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="ABC"/>
 *     &lt;enumeration value="ANON"/>
 *     &lt;enumeration value="Assumed"/>
 *     &lt;enumeration value="DN"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="IDE"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="NameRepresentationUse"/>
 *     &lt;enumeration value="OLD"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="PHON"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="SRCH"/>
 *     &lt;enumeration value="SYL"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityNameUseR2")
@XmlEnum
public enum EntityNameUseR2 {

    A("A"),
    ABC("ABC"),
    ANON("ANON"),
    @XmlEnumValue("Assumed")
    ASSUMED("Assumed"),
    DN("DN"),
    I("I"),
    IDE("IDE"),
    M("M"),
    N("N"),
    @XmlEnumValue("NameRepresentationUse")
    NAME_REPRESENTATION_USE("NameRepresentationUse"),
    OLD("OLD"),
    OR("OR"),
    P("P"),
    PHON("PHON"),
    R("R"),
    SRCH("SRCH"),
    SYL("SYL"),
    T("T");
    private final String value;

    EntityNameUseR2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityNameUseR2 fromValue(String v) {
        for (EntityNameUseR2 c: EntityNameUseR2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
