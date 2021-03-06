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
 * <p>TelecommunicationCapability的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TelecommunicationCapability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="voice"/>
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="data"/>
 *     &lt;enumeration value="tty"/>
 *     &lt;enumeration value="sms"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelecommunicationCapability")
@XmlEnum
public enum TelecommunicationCapability {

    @XmlEnumValue("voice")
    VOICE("voice"),
    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("data")
    DATA("data"),
    @XmlEnumValue("tty")
    TTY("tty"),
    @XmlEnumValue("sms")
    SMS("sms");
    private final String value;

    TelecommunicationCapability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelecommunicationCapability fromValue(String v) {
        for (TelecommunicationCapability c: TelecommunicationCapability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
