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
 * <p>EntityClassRoot的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClassRoot">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ENT"/>
 *     &lt;enumeration value="HCE"/>
 *     &lt;enumeration value="LIV"/>
 *     &lt;enumeration value="NLIV"/>
 *     &lt;enumeration value="ANM"/>
 *     &lt;enumeration value="MIC"/>
 *     &lt;enumeration value="PLNT"/>
 *     &lt;enumeration value="PSN"/>
 *     &lt;enumeration value="MAT"/>
 *     &lt;enumeration value="CHEM"/>
 *     &lt;enumeration value="FOOD"/>
 *     &lt;enumeration value="MMAT"/>
 *     &lt;enumeration value="CONT"/>
 *     &lt;enumeration value="HOLD"/>
 *     &lt;enumeration value="DEV"/>
 *     &lt;enumeration value="CER"/>
 *     &lt;enumeration value="MODDV"/>
 *     &lt;enumeration value="ORG"/>
 *     &lt;enumeration value="PUB"/>
 *     &lt;enumeration value="STATE"/>
 *     &lt;enumeration value="NAT"/>
 *     &lt;enumeration value="PLC"/>
 *     &lt;enumeration value="CITY"/>
 *     &lt;enumeration value="COUNTRY"/>
 *     &lt;enumeration value="COUNTY"/>
 *     &lt;enumeration value="PROVINCE"/>
 *     &lt;enumeration value="RGRP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityClassRoot")
@XmlEnum
public enum EntityClassRoot {

    ENT,
    HCE,
    LIV,
    NLIV,
    ANM,
    MIC,
    PLNT,
    PSN,
    MAT,
    CHEM,
    FOOD,
    MMAT,
    CONT,
    HOLD,
    DEV,
    CER,
    MODDV,
    ORG,
    PUB,
    STATE,
    NAT,
    PLC,
    CITY,
    COUNTRY,
    COUNTY,
    PROVINCE,
    RGRP;

    public String value() {
        return name();
    }

    public static EntityClassRoot fromValue(String v) {
        return valueOf(v);
    }

}
