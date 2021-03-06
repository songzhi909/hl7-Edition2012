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
 * <p>ActRelationshipConditional的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipConditional">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CIND"/>
 *     &lt;enumeration value="PRCN"/>
 *     &lt;enumeration value="RSON"/>
 *     &lt;enumeration value="BLOCK"/>
 *     &lt;enumeration value="CURE"/>
 *     &lt;enumeration value="CURE.ADJ"/>
 *     &lt;enumeration value="DIAG"/>
 *     &lt;enumeration value="MITGT"/>
 *     &lt;enumeration value="RCVY"/>
 *     &lt;enumeration value="MTGT.ADJ"/>
 *     &lt;enumeration value="SYMP"/>
 *     &lt;enumeration value="TRIG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipConditional")
@XmlEnum
public enum ActRelationshipConditional {

    CIND("CIND"),
    PRCN("PRCN"),
    RSON("RSON"),
    BLOCK("BLOCK"),
    CURE("CURE"),
    @XmlEnumValue("CURE.ADJ")
    CURE_ADJ("CURE.ADJ"),
    DIAG("DIAG"),
    MITGT("MITGT"),
    RCVY("RCVY"),
    @XmlEnumValue("MTGT.ADJ")
    MTGT_ADJ("MTGT.ADJ"),
    SYMP("SYMP"),
    TRIG("TRIG");
    private final String value;

    ActRelationshipConditional(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActRelationshipConditional fromValue(String v) {
        for (ActRelationshipConditional c: ActRelationshipConditional.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
