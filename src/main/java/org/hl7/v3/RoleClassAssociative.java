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
 * <p>RoleClassAssociative的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassAssociative">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AFFL"/>
 *     &lt;enumeration value="AGNT"/>
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="COMPAR"/>
 *     &lt;enumeration value="SGNOFF"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="ECON"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="GUARD"/>
 *     &lt;enumeration value="CIT"/>
 *     &lt;enumeration value="COVPTY"/>
 *     &lt;enumeration value="CLAIM"/>
 *     &lt;enumeration value="NAMED"/>
 *     &lt;enumeration value="DEPEN"/>
 *     &lt;enumeration value="INDIV"/>
 *     &lt;enumeration value="SUBSCR"/>
 *     &lt;enumeration value="PROG"/>
 *     &lt;enumeration value="CRINV"/>
 *     &lt;enumeration value="CRSPNSR"/>
 *     &lt;enumeration value="EMP"/>
 *     &lt;enumeration value="MIL"/>
 *     &lt;enumeration value="GUAR"/>
 *     &lt;enumeration value="INVSBJ"/>
 *     &lt;enumeration value="CASEBJ"/>
 *     &lt;enumeration value="RESBJ"/>
 *     &lt;enumeration value="LIC"/>
 *     &lt;enumeration value="NOT"/>
 *     &lt;enumeration value="PROV"/>
 *     &lt;enumeration value="PAT"/>
 *     &lt;enumeration value="PAYEE"/>
 *     &lt;enumeration value="PAYOR"/>
 *     &lt;enumeration value="POLHOLD"/>
 *     &lt;enumeration value="QUAL"/>
 *     &lt;enumeration value="SPNSR"/>
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="UNDWRT"/>
 *     &lt;enumeration value="CAREGIVER"/>
 *     &lt;enumeration value="PRS"/>
 *     &lt;enumeration value="ACCESS"/>
 *     &lt;enumeration value="ADJY"/>
 *     &lt;enumeration value="CONC"/>
 *     &lt;enumeration value="BOND"/>
 *     &lt;enumeration value="CONY"/>
 *     &lt;enumeration value="ADMM"/>
 *     &lt;enumeration value="BIRTHPL"/>
 *     &lt;enumeration value="DEATHPLC"/>
 *     &lt;enumeration value="DST"/>
 *     &lt;enumeration value="RET"/>
 *     &lt;enumeration value="EXPR"/>
 *     &lt;enumeration value="HLD"/>
 *     &lt;enumeration value="HLTHCHRT"/>
 *     &lt;enumeration value="IDENT"/>
 *     &lt;enumeration value="MANU"/>
 *     &lt;enumeration value="THER"/>
 *     &lt;enumeration value="MNT"/>
 *     &lt;enumeration value="OWN"/>
 *     &lt;enumeration value="RGPR"/>
 *     &lt;enumeration value="SDLOC"/>
 *     &lt;enumeration value="DSDLOC"/>
 *     &lt;enumeration value="ISDLOC"/>
 *     &lt;enumeration value="TERR"/>
 *     &lt;enumeration value="USED"/>
 *     &lt;enumeration value="WRTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassAssociative")
@XmlEnum
public enum RoleClassAssociative {

    AFFL,
    AGNT,
    ASSIGNED,
    COMPAR,
    SGNOFF,
    CON,
    ECON,
    NOK,
    GUARD,
    CIT,
    COVPTY,
    CLAIM,
    NAMED,
    DEPEN,
    INDIV,
    SUBSCR,
    PROG,
    CRINV,
    CRSPNSR,
    EMP,
    MIL,
    GUAR,
    INVSBJ,
    CASEBJ,
    RESBJ,
    LIC,
    NOT,
    PROV,
    PAT,
    PAYEE,
    PAYOR,
    POLHOLD,
    QUAL,
    SPNSR,
    STD,
    UNDWRT,
    CAREGIVER,
    PRS,
    ACCESS,
    ADJY,
    CONC,
    BOND,
    CONY,
    ADMM,
    BIRTHPL,
    DEATHPLC,
    DST,
    RET,
    EXPR,
    HLD,
    HLTHCHRT,
    IDENT,
    MANU,
    THER,
    MNT,
    OWN,
    RGPR,
    SDLOC,
    DSDLOC,
    ISDLOC,
    TERR,
    USED,
    WRTE;

    public String value() {
        return name();
    }

    public static RoleClassAssociative fromValue(String v) {
        return valueOf(v);
    }

}
