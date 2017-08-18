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
 * <p>RoleClassRoot的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassRoot">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ROL"/>
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
 *     &lt;enumeration value="EQUIV"/>
 *     &lt;enumeration value="SAME"/>
 *     &lt;enumeration value="SUBY"/>
 *     &lt;enumeration value="GEN"/>
 *     &lt;enumeration value="GRIC"/>
 *     &lt;enumeration value="INST"/>
 *     &lt;enumeration value="SUBS"/>
 *     &lt;enumeration value="CONT"/>
 *     &lt;enumeration value="EXPAGTCAR"/>
 *     &lt;enumeration value="EXPVECTOR"/>
 *     &lt;enumeration value="FOMITE"/>
 *     &lt;enumeration value="INGR"/>
 *     &lt;enumeration value="ACTI"/>
 *     &lt;enumeration value="ACTIB"/>
 *     &lt;enumeration value="ACTIM"/>
 *     &lt;enumeration value="ACTIR"/>
 *     &lt;enumeration value="ADJV"/>
 *     &lt;enumeration value="ADTV"/>
 *     &lt;enumeration value="BASE"/>
 *     &lt;enumeration value="IACT"/>
 *     &lt;enumeration value="COLR"/>
 *     &lt;enumeration value="FLVR"/>
 *     &lt;enumeration value="PRSV"/>
 *     &lt;enumeration value="STBL"/>
 *     &lt;enumeration value="MECH"/>
 *     &lt;enumeration value="LOCE"/>
 *     &lt;enumeration value="STOR"/>
 *     &lt;enumeration value="MBR"/>
 *     &lt;enumeration value="PART"/>
 *     &lt;enumeration value="ACTM"/>
 *     &lt;enumeration value="SPEC"/>
 *     &lt;enumeration value="ALQT"/>
 *     &lt;enumeration value="ISLT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassRoot")
@XmlEnum
public enum RoleClassRoot {

    ROL,
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
    WRTE,
    EQUIV,
    SAME,
    SUBY,
    GEN,
    GRIC,
    INST,
    SUBS,
    CONT,
    EXPAGTCAR,
    EXPVECTOR,
    FOMITE,
    INGR,
    ACTI,
    ACTIB,
    ACTIM,
    ACTIR,
    ADJV,
    ADTV,
    BASE,
    IACT,
    COLR,
    FLVR,
    PRSV,
    STBL,
    MECH,
    LOCE,
    STOR,
    MBR,
    PART,
    ACTM,
    SPEC,
    ALQT,
    ISLT;

    public String value() {
        return name();
    }

    public static RoleClassRoot fromValue(String v) {
        return valueOf(v);
    }

}
