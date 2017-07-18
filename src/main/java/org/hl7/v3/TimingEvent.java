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
 * <p>TimingEvent的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TimingEvent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HS"/>
 *     &lt;enumeration value="WAKE"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="ACM"/>
 *     &lt;enumeration value="ACD"/>
 *     &lt;enumeration value="ACV"/>
 *     &lt;enumeration value="IC"/>
 *     &lt;enumeration value="ICM"/>
 *     &lt;enumeration value="ICD"/>
 *     &lt;enumeration value="ICV"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="PCM"/>
 *     &lt;enumeration value="PCD"/>
 *     &lt;enumeration value="PCV"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="CV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimingEvent")
@XmlEnum
public enum TimingEvent {

    HS,
    WAKE,
    AC,
    ACM,
    ACD,
    ACV,
    IC,
    ICM,
    ICD,
    ICV,
    PC,
    PCM,
    PCD,
    PCV,
    C,
    CM,
    CD,
    CV;

    public String value() {
        return name();
    }

    public static TimingEvent fromValue(String v) {
        return valueOf(v);
    }

}
