//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.10 时间 10:45:02 AM CST 
//


package org.hl7.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.hl7.v3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _COCTMT150000UV02OrganizationContainsPartOrganization_QNAME = new QName("urn:hl7-org:v3", "partOrganization");
    private final static QName _PRPMIN303011UV01MFMIMT700721UV01Subject2HealthCareProvider_QNAME = new QName("urn:hl7-org:v3", "healthCareProvider");
    private final static QName _PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME = new QName("urn:hl7-org:v3", "assignedEntity");
    private final static QName _COCTMT070000UV01LocatedEntityLocation_QNAME = new QName("urn:hl7-org:v3", "location");
    private final static QName _MFMIMT700701UV01AuthorOrPerformerAssignedDevice_QNAME = new QName("urn:hl7-org:v3", "assignedDevice");
    private final static QName _MFMIMT700701UV01AuthorOrPerformerAssignedPerson_QNAME = new QName("urn:hl7-org:v3", "assignedPerson");
    private final static QName _PRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity_QNAME = new QName("urn:hl7-org:v3", "qualifiedEntity");
    private final static QName _COCTMT530000UVManufacturedProductManufacturerOrganization_QNAME = new QName("urn:hl7-org:v3", "manufacturerOrganization");
    private final static QName _COCTMT530000UVManufacturedProductManufacturedLabeledDrug_QNAME = new QName("urn:hl7-org:v3", "manufacturedLabeledDrug");
    private final static QName _COCTMT530000UVManufacturedProductManufacturedMaterial_QNAME = new QName("urn:hl7-org:v3", "manufacturedMaterial");
    private final static QName _PRPAMT201304UV02PatientPatientNonPersonLivingSubject_QNAME = new QName("urn:hl7-org:v3", "patientNonPersonLivingSubject");
    private final static QName _PRPAMT201304UV02PatientProviderOrganization_QNAME = new QName("urn:hl7-org:v3", "providerOrganization");
    private final static QName _PRPAMT201304UV02PatientPatientPerson_QNAME = new QName("urn:hl7-org:v3", "patientPerson");
    private final static QName _COCTMT030202UV07BirthPlaceBirthplace_QNAME = new QName("urn:hl7-org:v3", "birthplace");
    private final static QName _PRPAIN201309UV02QUQIMT021001UV01ControlActProcessQueryByParameter_QNAME = new QName("urn:hl7-org:v3", "queryByParameter");
    private final static QName _COCTMT290000UV06AssignedEntityAssignedProviderPerson_QNAME = new QName("urn:hl7-org:v3", "assignedProviderPerson");
    private final static QName _COCTMT290000UV06AssignedEntityAssignedNonPersonLivingSubject_QNAME = new QName("urn:hl7-org:v3", "assignedNonPersonLivingSubject");
    private final static QName _PRPAMT201304UV02StudentSchoolOrganization_QNAME = new QName("urn:hl7-org:v3", "schoolOrganization");
    private final static QName _COCTMT510000UV06PayorUnderwritingOrganization_QNAME = new QName("urn:hl7-org:v3", "underwritingOrganization");
    private final static QName _COCTMT510000UV06PayorInvoicePayorOrganization_QNAME = new QName("urn:hl7-org:v3", "invoicePayorOrganization");
    private final static QName _COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME = new QName("urn:hl7-org:v3", "representedOrganization");
    private final static QName _PRPMMT306110UV01QualifiedEntityQualifiedPrincipalPerson_QNAME = new QName("urn:hl7-org:v3", "qualifiedPrincipalPerson");
    private final static QName _PRPMMT306110UV01QualifiedEntityQualificationGrantingOrganization_QNAME = new QName("urn:hl7-org:v3", "qualificationGrantingOrganization");
    private final static QName _PRPMIN306010UV01QUQIMT021001UV01ControlActProcessQueryByParameterPayload_QNAME = new QName("urn:hl7-org:v3", "queryByParameterPayload");
    private final static QName _PRPAMT201303UV02PersonalRelationshipRelationshipHolder2_QNAME = new QName("urn:hl7-org:v3", "relationshipHolder2");
    private final static QName _PRPAMT201303UV02PersonalRelationshipRelationshipHolder1_QNAME = new QName("urn:hl7-org:v3", "relationshipHolder1");
    private final static QName _COCTMT710000UV07PlaceLocatedEntity_QNAME = new QName("urn:hl7-org:v3", "locatedEntity");
    private final static QName _COCTMT510000UV06BeneficiaryMemberOrganization1_QNAME = new QName("urn:hl7-org:v3", "memberOrganization1");
    private final static QName _COCTMT510000UV06BeneficiaryMemberPerson_QNAME = new QName("urn:hl7-org:v3", "memberPerson");
    private final static QName _COCTMT510000UV06BeneficiaryMemberNonPersonLivingSubject_QNAME = new QName("urn:hl7-org:v3", "memberNonPersonLivingSubject");
    private final static QName _COCTMT510000UV06BeneficiaryGroupOrganization_QNAME = new QName("urn:hl7-org:v3", "groupOrganization");
    private final static QName _COCTMT510000UV06Limitation2FinancialParticipationCharge_QNAME = new QName("urn:hl7-org:v3", "financialParticipationCharge");
    private final static QName _COCTMT510000UV06Limitation2CoverageCharge_QNAME = new QName("urn:hl7-org:v3", "coverageCharge");
    private final static QName _MCCIMT000200UV01DeviceAsAgent_QNAME = new QName("urn:hl7-org:v3", "asAgent");
    private final static QName _PRPMMT309000UV01HealthCareProviderIssuingOrganization_QNAME = new QName("urn:hl7-org:v3", "issuingOrganization");
    private final static QName _PRPMMT309000UV01HealthCareProviderHealthCarePrincipalPerson_QNAME = new QName("urn:hl7-org:v3", "healthCarePrincipalPerson");
    private final static QName _PRPMMT309000UV01TerritorialAuthorityTerritory_QNAME = new QName("urn:hl7-org:v3", "territory");
    private final static QName _COCTMT510000UV06Beneficiary2Patient_QNAME = new QName("urn:hl7-org:v3", "patient");
    private final static QName _COCTMT510000UV06Beneficiary2Beneficiary_QNAME = new QName("urn:hl7-org:v3", "beneficiary");
    private final static QName _COCTMT290000UV06ServiceRequestAuthor_QNAME = new QName("urn:hl7-org:v3", "author");
    private final static QName _COCTMT080000UV09Subject2SpecimenCollectionProcess_QNAME = new QName("urn:hl7-org:v3", "specimenCollectionProcess");
    private final static QName _COCTMT080000UV09Subject2SpecimenProcessStep_QNAME = new QName("urn:hl7-org:v3", "specimenProcessStep");
    private final static QName _COCTMT080000UV09Subject2ObservationEvent_QNAME = new QName("urn:hl7-org:v3", "observationEvent");
    private final static QName _PRPMMT401010UV01AffiliateScoper1_QNAME = new QName("urn:hl7-org:v3", "scoper1");
    private final static QName _PRPMMT401010UV01AffiliateScoper2_QNAME = new QName("urn:hl7-org:v3", "scoper2");
    private final static QName _COCTMT230100UVTerritorialAuthorityGoverningCountry_QNAME = new QName("urn:hl7-org:v3", "governingCountry");
    private final static QName _COCTMT030007UVContactPartyContactPerson_QNAME = new QName("urn:hl7-org:v3", "contactPerson");
    private final static QName _COCTMT030007UVContactPartyContactOrganization_QNAME = new QName("urn:hl7-org:v3", "contactOrganization");
    private final static QName _COCTMT080000UV09SpecimenCollectionProcessDefinition_QNAME = new QName("urn:hl7-org:v3", "definition");
    private final static QName _COCTMT080000UV09SpecimenCollectionProcessSubjectOf2_QNAME = new QName("urn:hl7-org:v3", "subjectOf2");
    private final static QName _COCTMT230100UVApprovalHolder_QNAME = new QName("urn:hl7-org:v3", "holder");
    private final static QName _PRPMMT306110UV01InformRequestSubject_QNAME = new QName("urn:hl7-org:v3", "subject");
    private final static QName _COCTMT510000UV06SponsorSponsorOrganization_QNAME = new QName("urn:hl7-org:v3", "sponsorOrganization");
    private final static QName _ENPart_QNAME = new QName("urn:hl7-org:v3", "part");
    private final static QName _COCTMT080000UV09AdditiveAdditiveContainer_QNAME = new QName("urn:hl7-org:v3", "additiveContainer");
    private final static QName _COCTMT080000UV09AdditiveAdditiveMaterial_QNAME = new QName("urn:hl7-org:v3", "additiveMaterial");
    private final static QName _COCTMT080000UV09AdditiveAdditiveHolder_QNAME = new QName("urn:hl7-org:v3", "additiveHolder");
    private final static QName _PRPMMT306910UV01AssignedEntityAssignedPrincipalPerson_QNAME = new QName("urn:hl7-org:v3", "assignedPrincipalPerson");
    private final static QName _COCTMT430000UV09LabTestKitManufacturedTestKit_QNAME = new QName("urn:hl7-org:v3", "manufacturedTestKit");
    private final static QName _COCTMT600000UV06HealthCareProviderHealthCareProviderPerson_QNAME = new QName("urn:hl7-org:v3", "healthCareProviderPerson");
    private final static QName _COCTMT530000UVRelatedEntityRelatedPerson_QNAME = new QName("urn:hl7-org:v3", "relatedPerson");
    private final static QName _COCTMT530000UVRelatedEntityRelatedEntity_QNAME = new QName("urn:hl7-org:v3", "relatedEntity");
    private final static QName _COCTMT530000UVRelatedEntityRelatedAnimal_QNAME = new QName("urn:hl7-org:v3", "relatedAnimal");
    private final static QName _COCTMT530000UVRelatedEntityScopingAnimal_QNAME = new QName("urn:hl7-org:v3", "scopingAnimal");
    private final static QName _COCTMT530000UVRelatedEntityScopingEntity_QNAME = new QName("urn:hl7-org:v3", "scopingEntity");
    private final static QName _COCTMT530000UVRelatedEntityScopingPerson_QNAME = new QName("urn:hl7-org:v3", "scopingPerson");
    private final static QName _PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME = new QName("urn:hl7-org:v3", "subjectOf3");
    private final static QName _PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME = new QName("urn:hl7-org:v3", "birthPlace");
    private final static QName _MCCIMT000300UV01OrganizationNotificationParty_QNAME = new QName("urn:hl7-org:v3", "notificationParty");
    private final static QName _PRPMMT303010UV01AffiliateAffiliatedPrincipalPerson_QNAME = new QName("urn:hl7-org:v3", "affiliatedPrincipalPerson");
    private final static QName _PRPMMT303010UV01AffiliateAffiliatedPrincipalOrganization_QNAME = new QName("urn:hl7-org:v3", "affiliatedPrincipalOrganization");
    private final static QName _COCTMT260003UVManufacturedProductManufacturedMaterialKind_QNAME = new QName("urn:hl7-org:v3", "manufacturedMaterialKind");
    private final static QName _PRPMMT401010UV01QualifiedEntityQualifiedPrincipalOrganization_QNAME = new QName("urn:hl7-org:v3", "qualifiedPrincipalOrganization");
    private final static QName _COCTMT090000UV01PersonAsLocatedEntity_QNAME = new QName("urn:hl7-org:v3", "asLocatedEntity");
    private final static QName _COCTMT530000UVSubstanceAdministrationSubjectOf_QNAME = new QName("urn:hl7-org:v3", "subjectOf");
    private final static QName _COCTMT530000UVSubstanceAdministrationDataEnterer_QNAME = new QName("urn:hl7-org:v3", "dataEnterer");
    private final static QName _COCTMT530000UVSubstanceAdministrationConsumable_QNAME = new QName("urn:hl7-org:v3", "consumable");
    private final static QName _COCTMT530000UVSubstanceAdministrationRecordTarget_QNAME = new QName("urn:hl7-org:v3", "recordTarget");
    private final static QName _COCTMT230100UVSpecializedKindGeneralizedMedicineClass_QNAME = new QName("urn:hl7-org:v3", "generalizedMedicineClass");
    private final static QName _COCTMT090000UV01RoleOtherScopingOrganization_QNAME = new QName("urn:hl7-org:v3", "scopingOrganization");
    private final static QName _COCTMT530000UVSubject2Specimen_QNAME = new QName("urn:hl7-org:v3", "specimen");
    private final static QName _COCTMT530000UVSubject2Patient1_QNAME = new QName("urn:hl7-org:v3", "patient1");
    private final static QName _COCTMT530000UVSubject2RelatedEntity1_QNAME = new QName("urn:hl7-org:v3", "relatedEntity1");
    private final static QName _COCTMT530000UVSubject2DerivedSpecimen_QNAME = new QName("urn:hl7-org:v3", "derivedSpecimen");
    private final static QName _COCTMT080000UV09EntityInEntityContainerHolder_QNAME = new QName("urn:hl7-org:v3", "containerHolder");
    private final static QName _COCTMT080000UV09EntityInEntityContainerAdditiveMaterial_QNAME = new QName("urn:hl7-org:v3", "containerAdditiveMaterial");
    private final static QName _COCTMT080000UV09EntityInEntityContainer_QNAME = new QName("urn:hl7-org:v3", "container");
    private final static QName _COCTMT080000UV09Subject1Additive_QNAME = new QName("urn:hl7-org:v3", "additive");
    private final static QName _COCTMT080000UV09Subject1SpecimenInContainer_QNAME = new QName("urn:hl7-org:v3", "specimenInContainer");
    private final static QName _PRPAMT201303UV02GuardianGuardianPerson_QNAME = new QName("urn:hl7-org:v3", "guardianPerson");
    private final static QName _PRPAMT201303UV02GuardianGuardianOrganization_QNAME = new QName("urn:hl7-org:v3", "guardianOrganization");
    private final static QName _COCTMT300000UV04SubstitutionPerformer_QNAME = new QName("urn:hl7-org:v3", "performer");
    private final static QName _COCTMT530000UVControlActEventResponsibleParty_QNAME = new QName("urn:hl7-org:v3", "responsibleParty");
    private final static QName _COCTMT080000UV09ContainerAsEntityInEntity_QNAME = new QName("urn:hl7-org:v3", "asEntityInEntity");
    private final static QName _COCTMT510000UV06CoveredPartyIndirectAuthority2_QNAME = new QName("urn:hl7-org:v3", "indirectAuthority2");
    private final static QName _COCTMT510000UV06CoveredPartyCoveredPerson_QNAME = new QName("urn:hl7-org:v3", "coveredPerson");
    private final static QName _COCTMT510000UV06CoveredPartyCoveredOrganization1_QNAME = new QName("urn:hl7-org:v3", "coveredOrganization1");
    private final static QName _COCTMT510000UV06CoveredPartyCoveredNonPersonLivingSubject_QNAME = new QName("urn:hl7-org:v3", "coveredNonPersonLivingSubject");
    private final static QName _COCTMT030007UVEmploymentEmployerOrganization_QNAME = new QName("urn:hl7-org:v3", "employerOrganization");
    private final static QName _PRPMMT406010UV01QueryByParameterPayloadRoleEffectiveDate_QNAME = new QName("urn:hl7-org:v3", "roleEffectiveDate");
    private final static QName _PRPMMT406010UV01QueryByParameterPayloadHistory_QNAME = new QName("urn:hl7-org:v3", "history");
    private final static QName _PRPMMT406010UV01QueryByParameterPayloadConfidence_QNAME = new QName("urn:hl7-org:v3", "confidence");
    private final static QName _PRPMMT406010UV01QueryByParameterPayloadJurisdiction_QNAME = new QName("urn:hl7-org:v3", "jurisdiction");
    private final static QName _COCTMT510000UV06PolicyOrProgramReplacementOf_QNAME = new QName("urn:hl7-org:v3", "replacementOf");
    private final static QName _StrucDocTRowTh_QNAME = new QName("urn:hl7-org:v3", "th");
    private final static QName _StrucDocTRowTd_QNAME = new QName("urn:hl7-org:v3", "td");
    private final static QName _COCTMT230100UVPackagedMedicineSubContent_QNAME = new QName("urn:hl7-org:v3", "subContent");
    private final static QName _COCTMT230100UVPackagedMedicineAsSuperContent_QNAME = new QName("urn:hl7-org:v3", "asSuperContent");
    private final static QName _PRPMMT403010UV01OrganizationPartofWholeOrganization_QNAME = new QName("urn:hl7-org:v3", "wholeOrganization");
    private final static QName _PRPMIN403010UV01MFMIMT700721UV01Subject2RoleOther_QNAME = new QName("urn:hl7-org:v3", "roleOther");
    private final static QName _PRPMIN403010UV01MFMIMT700721UV01Subject2Member_QNAME = new QName("urn:hl7-org:v3", "member");
    private final static QName _PRPMIN403010UV01MFMIMT700721UV01Subject2LicensedEntity_QNAME = new QName("urn:hl7-org:v3", "licensedEntity");
    private final static QName _COCTMT510000UV06DefinitionOralHealthService1_QNAME = new QName("urn:hl7-org:v3", "oralHealthService1");
    private final static QName _COCTMT510000UV06DefinitionServiceDefinition_QNAME = new QName("urn:hl7-org:v3", "serviceDefinition");
    private final static QName _COCTMT510000UV06DefinitionAccomodationSupplied1_QNAME = new QName("urn:hl7-org:v3", "accomodationSupplied1");
    private final static QName _COCTMT510000UV06DefinitionSubstanceAdministration_QNAME = new QName("urn:hl7-org:v3", "substanceAdministration");
    private final static QName _COCTMT510000UV06DefinitionOrganizer_QNAME = new QName("urn:hl7-org:v3", "organizer");
    private final static QName _COCTMT510000UV06DefinitionCrossReference1_QNAME = new QName("urn:hl7-org:v3", "crossReference1");
    private final static QName _COCTMT510000UV06DefinitionAct_QNAME = new QName("urn:hl7-org:v3", "act");
    private final static QName _COCTMT510000UV06DefinitionBillableClinicalProduct1_QNAME = new QName("urn:hl7-org:v3", "billableClinicalProduct1");
    private final static QName _COCTMT510000UV06DefinitionTransportation_QNAME = new QName("urn:hl7-org:v3", "transportation");
    private final static QName _COCTMT510000UV06DefinitionSupply_QNAME = new QName("urn:hl7-org:v3", "supply");
    private final static QName _COCTMT510000UV06DefinitionActReference_QNAME = new QName("urn:hl7-org:v3", "actReference");
    private final static QName _COCTMT510000UV06DefinitionProcedure_QNAME = new QName("urn:hl7-org:v3", "procedure");
    private final static QName _COCTMT510000UV06DefinitionEncounter_QNAME = new QName("urn:hl7-org:v3", "encounter");
    private final static QName _COCTMT510000UV06DefinitionObservation_QNAME = new QName("urn:hl7-org:v3", "observation");
    private final static QName _COCTMT510000UV06DefinitionSupplyEvent2_QNAME = new QName("urn:hl7-org:v3", "supplyEvent2");
    private final static QName _COCTMT510000UV06DefinitionSupplyEvent1_QNAME = new QName("urn:hl7-org:v3", "supplyEvent1");
    private final static QName _COCTMT510000UV06DefinitionBillableClinicalService1_QNAME = new QName("urn:hl7-org:v3", "billableClinicalService1");
    private final static QName _StrucDocContentSup_QNAME = new QName("urn:hl7-org:v3", "sup");
    private final static QName _StrucDocContentContent_QNAME = new QName("urn:hl7-org:v3", "content");
    private final static QName _StrucDocContentLinkHtml_QNAME = new QName("urn:hl7-org:v3", "linkHtml");
    private final static QName _StrucDocContentFootnote_QNAME = new QName("urn:hl7-org:v3", "footnote");
    private final static QName _StrucDocContentFootnoteRef_QNAME = new QName("urn:hl7-org:v3", "footnoteRef");
    private final static QName _StrucDocContentRenderMultiMedia_QNAME = new QName("urn:hl7-org:v3", "renderMultiMedia");
    private final static QName _StrucDocContentSub_QNAME = new QName("urn:hl7-org:v3", "sub");
    private final static QName _StrucDocContentBr_QNAME = new QName("urn:hl7-org:v3", "br");
    private final static QName _COCTMT300000UV04SupplyEventDestination_QNAME = new QName("urn:hl7-org:v3", "destination");
    private final static QName _COCTMT300000UV04SupplyEventOrigin_QNAME = new QName("urn:hl7-org:v3", "origin");
    private final static QName _COCTMT230100UVSubIngredientIngredientSubstance_QNAME = new QName("urn:hl7-org:v3", "ingredientSubstance");
    private final static QName _COCTMT230100UVMedicineAsContent_QNAME = new QName("urn:hl7-org:v3", "asContent");
    private final static QName _COCTMT510000UV06UnderwriterScoperOrganization_QNAME = new QName("urn:hl7-org:v3", "scoperOrganization");
    private final static QName _COCTMT310000UV04AccommodationRequestorRoleAccommodationRequestor_QNAME = new QName("urn:hl7-org:v3", "accommodationRequestor");
    private final static QName _COCTMT090000UV01AssignedEntityAssignedOrganization_QNAME = new QName("urn:hl7-org:v3", "assignedOrganization");
    private final static QName _PRPMMT406110UV01AssignedEntityAssignedPrincipalOrganization_QNAME = new QName("urn:hl7-org:v3", "assignedPrincipalOrganization");
    private final static QName _COCTMT740000UV04OralHealthServiceReferencedBy_QNAME = new QName("urn:hl7-org:v3", "referencedBy");
    private final static QName _PRPMMT306110UV01AlsoKnownasSamePrincipalPerson_QNAME = new QName("urn:hl7-org:v3", "samePrincipalPerson");
    private final static QName _COCTMT290000UV06BillableClinicalServiceReusableDevice_QNAME = new QName("urn:hl7-org:v3", "reusableDevice");
    private final static QName _COCTMT290000UV06BillableClinicalServiceComponent_QNAME = new QName("urn:hl7-org:v3", "component");
    private final static QName _MFMIMT700711UV01PriorRegistrationSubject2_QNAME = new QName("urn:hl7-org:v3", "subject2");
    private final static QName _MFMIMT700711UV01PriorRegistrationSubject1_QNAME = new QName("urn:hl7-org:v3", "subject1");
    private final static QName _PRPMMT306010UV01QueryByParameterPayloadRoleClass_QNAME = new QName("urn:hl7-org:v3", "roleClass");
    private final static QName _PRPMMT306010UV01QueryByParameterPayloadDOB_QNAME = new QName("urn:hl7-org:v3", "dOB");
    private final static QName _PRPMMT306010UV01QueryByParameterPayloadAdministrativeGender_QNAME = new QName("urn:hl7-org:v3", "administrativeGender");
    private final static QName _COCTMT300000UV04SubstanceAdministrationIntentPertinentInformation_QNAME = new QName("urn:hl7-org:v3", "pertinentInformation");
    private final static QName _COCTMT600000UV06ManufacturedProductManufacturedVisionProduct_QNAME = new QName("urn:hl7-org:v3", "manufacturedVisionProduct");
    private final static QName _COCTMT060000UV01RoleTransportPlayingEntity_QNAME = new QName("urn:hl7-org:v3", "playingEntity");
    private final static QName _StrucDocCaptionedCaption_QNAME = new QName("urn:hl7-org:v3", "caption");
    private final static QName _COCTMT510000UV06PolicyHolderPolicyHolderOrganization_QNAME = new QName("urn:hl7-org:v3", "policyHolderOrganization");
    private final static QName _COCTMT510000UV06PolicyHolderPolicyHolderPerson_QNAME = new QName("urn:hl7-org:v3", "policyHolderPerson");
    private final static QName _COCTMT240003UV02ServiceDeliveryLocationServiceProviderOrganization_QNAME = new QName("urn:hl7-org:v3", "serviceProviderOrganization");
    private final static QName _COCTMT510000UV06ResponsiblePartyAgentPerson_QNAME = new QName("urn:hl7-org:v3", "agentPerson");
    private final static QName _COCTMT510000UV06ResponsiblePartyRepresentedPerson_QNAME = new QName("urn:hl7-org:v3", "representedPerson");
    private final static QName _COCTMT490000UV04ContentPackagedProductContainedManufacturedMaterial_QNAME = new QName("urn:hl7-org:v3", "containedManufacturedMaterial");
    private final static QName _COCTMT080000UV09ConsumableLabTestKit_QNAME = new QName("urn:hl7-org:v3", "labTestKit");
    private final static QName _COCTMT080000UV09ConsumableReagent_QNAME = new QName("urn:hl7-org:v3", "reagent");
    private final static QName _COCTMT080000UV09SpecimenStubRelated_QNAME = new QName("urn:hl7-org:v3", "related");
    private final static QName _COCTMT080000UV09SpecimenSourceNatural_QNAME = new QName("urn:hl7-org:v3", "sourceNatural");
    private final static QName _COCTMT080000UV09SpecimenSourceManufacturedMaterial_QNAME = new QName("urn:hl7-org:v3", "sourceManufacturedMaterial");
    private final static QName _COCTMT080000UV09SpecimenProductOf_QNAME = new QName("urn:hl7-org:v3", "productOf");
    private final static QName _COCTMT080000UV09SpecimenSpecimenNatural_QNAME = new QName("urn:hl7-org:v3", "specimenNatural");
    private final static QName _COCTMT080000UV09SpecimenSpecimenManufacturedMaterial_QNAME = new QName("urn:hl7-org:v3", "specimenManufacturedMaterial");
    private final static QName _StrucDocFootnoteTable_QNAME = new QName("urn:hl7-org:v3", "table");
    private final static QName _StrucDocFootnoteList_QNAME = new QName("urn:hl7-org:v3", "list");
    private final static QName _StrucDocFootnoteParagraph_QNAME = new QName("urn:hl7-org:v3", "paragraph");
    private final static QName _COCTMT670000UV04GuarantorRoleGuarantorOrganization_QNAME = new QName("urn:hl7-org:v3", "guarantorOrganization");
    private final static QName _COCTMT670000UV04GuarantorRoleGuarantorPerson_QNAME = new QName("urn:hl7-org:v3", "guarantorPerson");
    private final static QName _COCTMT740000UV04ReferralReferrer_QNAME = new QName("urn:hl7-org:v3", "referrer");
    private final static QName _COCTMT960000UV05PositionComponent2_QNAME = new QName("urn:hl7-org:v3", "component2");
    private final static QName _COCTMT290000UV06ManufacturedProductManufacturerManufacturedProductOrganization_QNAME = new QName("urn:hl7-org:v3", "manufacturerManufacturedProductOrganization");
    private final static QName _COCTMT300000UV04SubstanceAdministrationOrderReason_QNAME = new QName("urn:hl7-org:v3", "reason");
    private final static QName _COCTMT260003UVSubject2OtherMedication_QNAME = new QName("urn:hl7-org:v3", "otherMedication");
    private final static QName _COCTMT260003UVSubject2OtherSupply_QNAME = new QName("urn:hl7-org:v3", "otherSupply");
    private final static QName _COCTMT290000UV06InjuryLocationLocatedInjuryPlace_QNAME = new QName("urn:hl7-org:v3", "locatedInjuryPlace");
    private final static QName _COCTMT310000UV04AccomodationSuppliedPertinentInformation1_QNAME = new QName("urn:hl7-org:v3", "pertinentInformation1");
    private final static QName _COCTMT080000UV09ControlVariableDillution_QNAME = new QName("urn:hl7-org:v3", "dillution");
    private final static QName _COCTMT080000UV09ControlVariableReflexPermission_QNAME = new QName("urn:hl7-org:v3", "reflexPermission");
    private final static QName _COCTMT080000UV09ControlVariableAutoRepeatPermission_QNAME = new QName("urn:hl7-org:v3", "autoRepeatPermission");
    private final static QName _COCTMT080000UV09ControlVariableEndogenousContent_QNAME = new QName("urn:hl7-org:v3", "endogenousContent");
    private final static QName _COCTMT510000UV06PersonalRelationshipPersonalRelationshipWith_QNAME = new QName("urn:hl7-org:v3", "personalRelationshipWith");
    private final static QName _COCTMT510000UV06PersonalRelationshipRelationshipHolder_QNAME = new QName("urn:hl7-org:v3", "relationshipHolder");
    private final static QName _COCTMT490000UV04BillableClinicalProductConsultant_QNAME = new QName("urn:hl7-org:v3", "consultant");
    private final static QName _COCTMT230100UVRelatedManufacturerRepresentedManufacturer_QNAME = new QName("urn:hl7-org:v3", "representedManufacturer");
    private final static QName _COCTMT080000UV09Subject3Annotation_QNAME = new QName("urn:hl7-org:v3", "annotation");
    private final static QName _PRPAMT201306UV02QueryByParameterMatchCriterionList_QNAME = new QName("urn:hl7-org:v3", "matchCriterionList");
    private final static QName _COCTMT040008UVResponsibleAgentDevice_QNAME = new QName("urn:hl7-org:v3", "agentDevice");
    private final static QName _COCTMT040008UVResponsibleAgentOrganization_QNAME = new QName("urn:hl7-org:v3", "agentOrganization");
    private final static QName _COCTMT490000UV04WarrantorWarrantingWarrantorOrganization_QNAME = new QName("urn:hl7-org:v3", "warrantingWarrantorOrganization");
    private final static QName _COCTMT230100UVMedicationSubjectOf5_QNAME = new QName("urn:hl7-org:v3", "subjectOf5");
    private final static QName _COCTMT230100UVSubContentContainedPackagedMedicine_QNAME = new QName("urn:hl7-org:v3", "containedPackagedMedicine");
    private final static QName _COCTMT530000UVConsumableAdministerableMaterial_QNAME = new QName("urn:hl7-org:v3", "administerableMaterial");
    private final static QName _COCTMT530000UVConsumableMedication_QNAME = new QName("urn:hl7-org:v3", "medication");
    private final static QName _PRPAMT201306UV02MatchCriterionListMatchAlgorithm_QNAME = new QName("urn:hl7-org:v3", "matchAlgorithm");
    private final static QName _PRPAMT201306UV02MatchCriterionListMatchWeight_QNAME = new QName("urn:hl7-org:v3", "matchWeight");
    private final static QName _PRPAMT201306UV02MatchCriterionListMinimumDegreeMatch_QNAME = new QName("urn:hl7-org:v3", "minimumDegreeMatch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.hl7.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link COLLAD2 }
     * 
     */
    public COLLAD2 createCOLLAD2() {
        return new COLLAD2();
    }

    /**
     * Create an instance of {@link PRPAIN201309UV02 }
     * 
     */
    public PRPAIN201309UV02 createPRPAIN201309UV02() {
        return new PRPAIN201309UV02();
    }

    /**
     * Create an instance of {@link PRPAIN201309UV02MCCIMT000100UV01Message }
     * 
     */
    public PRPAIN201309UV02MCCIMT000100UV01Message createPRPAIN201309UV02MCCIMT000100UV01Message() {
        return new PRPAIN201309UV02MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link DSETCS }
     * 
     */
    public DSETCS createDSETCS() {
        return new DSETCS();
    }

    /**
     * Create an instance of {@link II }
     * 
     */
    public II createII() {
        return new II();
    }

    /**
     * Create an instance of {@link LISTII }
     * 
     */
    public LISTII createLISTII() {
        return new LISTII();
    }

    /**
     * Create an instance of {@link TS }
     * 
     */
    public TS createTS() {
        return new TS();
    }

    /**
     * Create an instance of {@link ST }
     * 
     */
    public ST createST() {
        return new ST();
    }

    /**
     * Create an instance of {@link CS }
     * 
     */
    public CS createCS() {
        return new CS();
    }

    /**
     * Create an instance of {@link DSETII }
     * 
     */
    public DSETII createDSETII() {
        return new DSETII();
    }

    /**
     * Create an instance of {@link INT }
     * 
     */
    public INT createINT() {
        return new INT();
    }

    /**
     * Create an instance of {@link DSETED }
     * 
     */
    public DSETED createDSETED() {
        return new DSETED();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01Receiver }
     * 
     */
    public MCCIMT000100UV01Receiver createMCCIMT000100UV01Receiver() {
        return new MCCIMT000100UV01Receiver();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01RespondTo }
     * 
     */
    public MCCIMT000100UV01RespondTo createMCCIMT000100UV01RespondTo() {
        return new MCCIMT000100UV01RespondTo();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01Sender }
     * 
     */
    public MCCIMT000100UV01Sender createMCCIMT000100UV01Sender() {
        return new MCCIMT000100UV01Sender();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01AttentionLine }
     * 
     */
    public MCCIMT000100UV01AttentionLine createMCCIMT000100UV01AttentionLine() {
        return new MCCIMT000100UV01AttentionLine();
    }

    /**
     * Create an instance of {@link PRPAIN201309UV02QUQIMT021001UV01ControlActProcess }
     * 
     */
    public PRPAIN201309UV02QUQIMT021001UV01ControlActProcess createPRPAIN201309UV02QUQIMT021001UV01ControlActProcess() {
        return new PRPAIN201309UV02QUQIMT021001UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMIN406010UV01 }
     * 
     */
    public PRPMIN406010UV01 createPRPMIN406010UV01() {
        return new PRPMIN406010UV01();
    }

    /**
     * Create an instance of {@link PRPMIN406010UV01MCCIMT000100UV01Message }
     * 
     */
    public PRPMIN406010UV01MCCIMT000100UV01Message createPRPMIN406010UV01MCCIMT000100UV01Message() {
        return new PRPMIN406010UV01MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN406010UV01QUQIMT021001UV01ControlActProcess }
     * 
     */
    public PRPMIN406010UV01QUQIMT021001UV01ControlActProcess createPRPMIN406010UV01QUQIMT021001UV01ControlActProcess() {
        return new PRPMIN406010UV01QUQIMT021001UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMIN403010UV01 }
     * 
     */
    public PRPMIN403010UV01 createPRPMIN403010UV01() {
        return new PRPMIN403010UV01();
    }

    /**
     * Create an instance of {@link PRPMIN403010UV01MCCIMT000100UV01Message }
     * 
     */
    public PRPMIN403010UV01MCCIMT000100UV01Message createPRPMIN403010UV01MCCIMT000100UV01Message() {
        return new PRPMIN403010UV01MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN403010UV01MFMIMT700721UV01ControlActProcess }
     * 
     */
    public PRPMIN403010UV01MFMIMT700721UV01ControlActProcess createPRPMIN403010UV01MFMIMT700721UV01ControlActProcess() {
        return new PRPMIN403010UV01MFMIMT700721UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPAIN201312UV02 }
     * 
     */
    public PRPAIN201312UV02 createPRPAIN201312UV02() {
        return new PRPAIN201312UV02();
    }

    /**
     * Create an instance of {@link PRPAIN201312UV02MCCIMT000300UV01Message }
     * 
     */
    public PRPAIN201312UV02MCCIMT000300UV01Message createPRPAIN201312UV02MCCIMT000300UV01Message() {
        return new PRPAIN201312UV02MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Receiver }
     * 
     */
    public MCCIMT000300UV01Receiver createMCCIMT000300UV01Receiver() {
        return new MCCIMT000300UV01Receiver();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01RespondTo }
     * 
     */
    public MCCIMT000300UV01RespondTo createMCCIMT000300UV01RespondTo() {
        return new MCCIMT000300UV01RespondTo();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Sender }
     * 
     */
    public MCCIMT000300UV01Sender createMCCIMT000300UV01Sender() {
        return new MCCIMT000300UV01Sender();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01AttentionLine }
     * 
     */
    public MCCIMT000300UV01AttentionLine createMCCIMT000300UV01AttentionLine() {
        return new MCCIMT000300UV01AttentionLine();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Acknowledgement }
     * 
     */
    public MCCIMT000300UV01Acknowledgement createMCCIMT000300UV01Acknowledgement() {
        return new MCCIMT000300UV01Acknowledgement();
    }

    /**
     * Create an instance of {@link PRPAIN201312UV02MFMIMT700701UV01ControlActProcess }
     * 
     */
    public PRPAIN201312UV02MFMIMT700701UV01ControlActProcess createPRPAIN201312UV02MFMIMT700701UV01ControlActProcess() {
        return new PRPAIN201312UV02MFMIMT700701UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPAIN201313UV02 }
     * 
     */
    public PRPAIN201313UV02 createPRPAIN201313UV02() {
        return new PRPAIN201313UV02();
    }

    /**
     * Create an instance of {@link PRPAIN201313UV02MCCIMT000300UV01Message }
     * 
     */
    public PRPAIN201313UV02MCCIMT000300UV01Message createPRPAIN201313UV02MCCIMT000300UV01Message() {
        return new PRPAIN201313UV02MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link PRPAIN201313UV02MFMIMT700721UV01ControlActProcess }
     * 
     */
    public PRPAIN201313UV02MFMIMT700721UV01ControlActProcess createPRPAIN201313UV02MFMIMT700721UV01ControlActProcess() {
        return new PRPAIN201313UV02MFMIMT700721UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMIN403011UV01 }
     * 
     */
    public PRPMIN403011UV01 createPRPMIN403011UV01() {
        return new PRPMIN403011UV01();
    }

    /**
     * Create an instance of {@link PRPMIN403011UV01MCCIMT000300UV01Message }
     * 
     */
    public PRPMIN403011UV01MCCIMT000300UV01Message createPRPMIN403011UV01MCCIMT000300UV01Message() {
        return new PRPMIN403011UV01MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN403011UV01MFMIMT700721UV01ControlActProcess }
     * 
     */
    public PRPMIN403011UV01MFMIMT700721UV01ControlActProcess createPRPMIN403011UV01MFMIMT700721UV01ControlActProcess() {
        return new PRPMIN403011UV01MFMIMT700721UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMIN306051UV01 }
     * 
     */
    public PRPMIN306051UV01 createPRPMIN306051UV01() {
        return new PRPMIN306051UV01();
    }

    /**
     * Create an instance of {@link PRPMIN306051UV01MCCIMT000300UV01Message }
     * 
     */
    public PRPMIN306051UV01MCCIMT000300UV01Message createPRPMIN306051UV01MCCIMT000300UV01Message() {
        return new PRPMIN306051UV01MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN306051UV01MFMIMT700711UV01ControlActProcess }
     * 
     */
    public PRPMIN306051UV01MFMIMT700711UV01ControlActProcess createPRPMIN306051UV01MFMIMT700711UV01ControlActProcess() {
        return new PRPMIN306051UV01MFMIMT700711UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPAIN201304UV02 }
     * 
     */
    public PRPAIN201304UV02 createPRPAIN201304UV02() {
        return new PRPAIN201304UV02();
    }

    /**
     * Create an instance of {@link PRPAIN201304UV02MCCIMT000100UV01Message }
     * 
     */
    public PRPAIN201304UV02MCCIMT000100UV01Message createPRPAIN201304UV02MCCIMT000100UV01Message() {
        return new PRPAIN201304UV02MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPAIN201304UV02MFMIMT700701UV01ControlActProcess }
     * 
     */
    public PRPAIN201304UV02MFMIMT700701UV01ControlActProcess createPRPAIN201304UV02MFMIMT700701UV01ControlActProcess() {
        return new PRPAIN201304UV02MFMIMT700701UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMIN306050UV01 }
     * 
     */
    public PRPMIN306050UV01 createPRPMIN306050UV01() {
        return new PRPMIN306050UV01();
    }

    /**
     * Create an instance of {@link PRPMIN306050UV01MCCIMT000100UV01Message }
     * 
     */
    public PRPMIN306050UV01MCCIMT000100UV01Message createPRPMIN306050UV01MCCIMT000100UV01Message() {
        return new PRPMIN306050UV01MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN306050UV01QUQIMT021001UV01ControlActProcess }
     * 
     */
    public PRPMIN306050UV01QUQIMT021001UV01ControlActProcess createPRPMIN306050UV01QUQIMT021001UV01ControlActProcess() {
        return new PRPMIN306050UV01QUQIMT021001UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPAIN201316UV02 }
     * 
     */
    public PRPAIN201316UV02 createPRPAIN201316UV02() {
        return new PRPAIN201316UV02();
    }

    /**
     * Create an instance of {@link PRPAIN201316UV02MCCIMT000300UV01Message }
     * 
     */
    public PRPAIN201316UV02MCCIMT000300UV01Message createPRPAIN201316UV02MCCIMT000300UV01Message() {
        return new PRPAIN201316UV02MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link PRPAIN201316UV02MFMIMT700721UV01ControlActProcess }
     * 
     */
    public PRPAIN201316UV02MFMIMT700721UV01ControlActProcess createPRPAIN201316UV02MFMIMT700721UV01ControlActProcess() {
        return new PRPAIN201316UV02MFMIMT700721UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMIN301010UV01 }
     * 
     */
    public PRPMIN301010UV01 createPRPMIN301010UV01() {
        return new PRPMIN301010UV01();
    }

    /**
     * Create an instance of {@link PRPMIN301010UV01MCCIMT000100UV01Message }
     * 
     */
    public PRPMIN301010UV01MCCIMT000100UV01Message createPRPMIN301010UV01MCCIMT000100UV01Message() {
        return new PRPMIN301010UV01MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN301010UV01MFMIMT700721UV01ControlActProcess }
     * 
     */
    public PRPMIN301010UV01MFMIMT700721UV01ControlActProcess createPRPMIN301010UV01MFMIMT700721UV01ControlActProcess() {
        return new PRPMIN301010UV01MFMIMT700721UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMIN303010UV01 }
     * 
     */
    public PRPMIN303010UV01 createPRPMIN303010UV01() {
        return new PRPMIN303010UV01();
    }

    /**
     * Create an instance of {@link PRPMIN303010UV01MCCIMT000100UV01Message }
     * 
     */
    public PRPMIN303010UV01MCCIMT000100UV01Message createPRPMIN303010UV01MCCIMT000100UV01Message() {
        return new PRPMIN303010UV01MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN303010UV01MFMIMT700721UV01ControlActProcess }
     * 
     */
    public PRPMIN303010UV01MFMIMT700721UV01ControlActProcess createPRPMIN303010UV01MFMIMT700721UV01ControlActProcess() {
        return new PRPMIN303010UV01MFMIMT700721UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPAIN201308UV02 }
     * 
     */
    public PRPAIN201308UV02 createPRPAIN201308UV02() {
        return new PRPAIN201308UV02();
    }

    /**
     * Create an instance of {@link PRPAIN201308UV02MCCIMT000300UV01Message }
     * 
     */
    public PRPAIN201308UV02MCCIMT000300UV01Message createPRPAIN201308UV02MCCIMT000300UV01Message() {
        return new PRPAIN201308UV02MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link PRPAIN201308UV02MFMIMT700711UV01ControlActProcess }
     * 
     */
    public PRPAIN201308UV02MFMIMT700711UV01ControlActProcess createPRPAIN201308UV02MFMIMT700711UV01ControlActProcess() {
        return new PRPAIN201308UV02MFMIMT700711UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPAIN201311UV02 }
     * 
     */
    public PRPAIN201311UV02 createPRPAIN201311UV02() {
        return new PRPAIN201311UV02();
    }

    /**
     * Create an instance of {@link PRPAIN201311UV02MCCIMT000100UV01Message }
     * 
     */
    public PRPAIN201311UV02MCCIMT000100UV01Message createPRPAIN201311UV02MCCIMT000100UV01Message() {
        return new PRPAIN201311UV02MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPAIN201311UV02MFMIMT700721UV01ControlActProcess }
     * 
     */
    public PRPAIN201311UV02MFMIMT700721UV01ControlActProcess createPRPAIN201311UV02MFMIMT700721UV01ControlActProcess() {
        return new PRPAIN201311UV02MFMIMT700721UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link MCCIIN000002UV01 }
     * 
     */
    public MCCIIN000002UV01 createMCCIIN000002UV01() {
        return new MCCIIN000002UV01();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Message }
     * 
     */
    public MCCIMT000200UV01Message createMCCIMT000200UV01Message() {
        return new MCCIMT000200UV01Message();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Receiver }
     * 
     */
    public MCCIMT000200UV01Receiver createMCCIMT000200UV01Receiver() {
        return new MCCIMT000200UV01Receiver();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01RespondTo }
     * 
     */
    public MCCIMT000200UV01RespondTo createMCCIMT000200UV01RespondTo() {
        return new MCCIMT000200UV01RespondTo();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Sender }
     * 
     */
    public MCCIMT000200UV01Sender createMCCIMT000200UV01Sender() {
        return new MCCIMT000200UV01Sender();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01AttentionLine }
     * 
     */
    public MCCIMT000200UV01AttentionLine createMCCIMT000200UV01AttentionLine() {
        return new MCCIMT000200UV01AttentionLine();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Acknowledgement }
     * 
     */
    public MCCIMT000200UV01Acknowledgement createMCCIMT000200UV01Acknowledgement() {
        return new MCCIMT000200UV01Acknowledgement();
    }

    /**
     * Create an instance of {@link PRPMIN406110UV01 }
     * 
     */
    public PRPMIN406110UV01 createPRPMIN406110UV01() {
        return new PRPMIN406110UV01();
    }

    /**
     * Create an instance of {@link PRPMIN406110UV01MCCIMT000300UV01Message }
     * 
     */
    public PRPMIN406110UV01MCCIMT000300UV01Message createPRPMIN406110UV01MCCIMT000300UV01Message() {
        return new PRPMIN406110UV01MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN406110UV01MFMIMT700711UV01ControlActProcess }
     * 
     */
    public PRPMIN406110UV01MFMIMT700711UV01ControlActProcess createPRPMIN406110UV01MFMIMT700711UV01ControlActProcess() {
        return new PRPMIN406110UV01MFMIMT700711UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPAIN201307UV02 }
     * 
     */
    public PRPAIN201307UV02 createPRPAIN201307UV02() {
        return new PRPAIN201307UV02();
    }

    /**
     * Create an instance of {@link PRPAIN201307UV02MCCIMT000100UV01Message }
     * 
     */
    public PRPAIN201307UV02MCCIMT000100UV01Message createPRPAIN201307UV02MCCIMT000100UV01Message() {
        return new PRPAIN201307UV02MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPAIN201307UV02QUQIMT021001UV01ControlActProcess }
     * 
     */
    public PRPAIN201307UV02QUQIMT021001UV01ControlActProcess createPRPAIN201307UV02QUQIMT021001UV01ControlActProcess() {
        return new PRPAIN201307UV02QUQIMT021001UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMIN306011UV01 }
     * 
     */
    public PRPMIN306011UV01 createPRPMIN306011UV01() {
        return new PRPMIN306011UV01();
    }

    /**
     * Create an instance of {@link PRPMIN306011UV01MCCIMT000300UV01Message }
     * 
     */
    public PRPMIN306011UV01MCCIMT000300UV01Message createPRPMIN306011UV01MCCIMT000300UV01Message() {
        return new PRPMIN306011UV01MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN306011UV01MFMIMT700711UV01ControlActProcess }
     * 
     */
    public PRPMIN306011UV01MFMIMT700711UV01ControlActProcess createPRPMIN306011UV01MFMIMT700711UV01ControlActProcess() {
        return new PRPMIN306011UV01MFMIMT700711UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMIN401030UV01 }
     * 
     */
    public PRPMIN401030UV01 createPRPMIN401030UV01() {
        return new PRPMIN401030UV01();
    }

    /**
     * Create an instance of {@link PRPMIN401030UV01MCCIMT000100UV01Message }
     * 
     */
    public PRPMIN401030UV01MCCIMT000100UV01Message createPRPMIN401030UV01MCCIMT000100UV01Message() {
        return new PRPMIN401030UV01MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN401030UV01MFMIMT700721UV01ControlActProcess }
     * 
     */
    public PRPMIN401030UV01MFMIMT700721UV01ControlActProcess createPRPMIN401030UV01MFMIMT700721UV01ControlActProcess() {
        return new PRPMIN401030UV01MFMIMT700721UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMIN301011UV01 }
     * 
     */
    public PRPMIN301011UV01 createPRPMIN301011UV01() {
        return new PRPMIN301011UV01();
    }

    /**
     * Create an instance of {@link PRPMIN301011UV01MCCIMT000300UV01Message }
     * 
     */
    public PRPMIN301011UV01MCCIMT000300UV01Message createPRPMIN301011UV01MCCIMT000300UV01Message() {
        return new PRPMIN301011UV01MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN301011UV01MFMIMT700721UV01ControlActProcess }
     * 
     */
    public PRPMIN301011UV01MFMIMT700721UV01ControlActProcess createPRPMIN301011UV01MFMIMT700721UV01ControlActProcess() {
        return new PRPMIN301011UV01MFMIMT700721UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPAIN201310UV02 }
     * 
     */
    public PRPAIN201310UV02 createPRPAIN201310UV02() {
        return new PRPAIN201310UV02();
    }

    /**
     * Create an instance of {@link PRPAIN201310UV02MCCIMT000300UV01Message }
     * 
     */
    public PRPAIN201310UV02MCCIMT000300UV01Message createPRPAIN201310UV02MCCIMT000300UV01Message() {
        return new PRPAIN201310UV02MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link PRPAIN201310UV02MFMIMT700711UV01ControlActProcess }
     * 
     */
    public PRPAIN201310UV02MFMIMT700711UV01ControlActProcess createPRPAIN201310UV02MFMIMT700711UV01ControlActProcess() {
        return new PRPAIN201310UV02MFMIMT700711UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMIN303011UV01 }
     * 
     */
    public PRPMIN303011UV01 createPRPMIN303011UV01() {
        return new PRPMIN303011UV01();
    }

    /**
     * Create an instance of {@link PRPMIN303011UV01MCCIMT000300UV01Message }
     * 
     */
    public PRPMIN303011UV01MCCIMT000300UV01Message createPRPMIN303011UV01MCCIMT000300UV01Message() {
        return new PRPMIN303011UV01MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN303011UV01MFMIMT700721UV01ControlActProcess }
     * 
     */
    public PRPMIN303011UV01MFMIMT700721UV01ControlActProcess createPRPMIN303011UV01MFMIMT700721UV01ControlActProcess() {
        return new PRPMIN303011UV01MFMIMT700721UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPAIN201315UV02 }
     * 
     */
    public PRPAIN201315UV02 createPRPAIN201315UV02() {
        return new PRPAIN201315UV02();
    }

    /**
     * Create an instance of {@link PRPAIN201315UV02MCCIMT000300UV01Message }
     * 
     */
    public PRPAIN201315UV02MCCIMT000300UV01Message createPRPAIN201315UV02MCCIMT000300UV01Message() {
        return new PRPAIN201315UV02MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link PRPAIN201315UV02MFMIMT700701UV01ControlActProcess }
     * 
     */
    public PRPAIN201315UV02MFMIMT700701UV01ControlActProcess createPRPAIN201315UV02MFMIMT700701UV01ControlActProcess() {
        return new PRPAIN201315UV02MFMIMT700701UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPAIN201306UV02 }
     * 
     */
    public PRPAIN201306UV02 createPRPAIN201306UV02() {
        return new PRPAIN201306UV02();
    }

    /**
     * Create an instance of {@link PRPAIN201306UV02MCCIMT000300UV01Message }
     * 
     */
    public PRPAIN201306UV02MCCIMT000300UV01Message createPRPAIN201306UV02MCCIMT000300UV01Message() {
        return new PRPAIN201306UV02MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link PRPAIN201306UV02MFMIMT700711UV01ControlActProcess }
     * 
     */
    public PRPAIN201306UV02MFMIMT700711UV01ControlActProcess createPRPAIN201306UV02MFMIMT700711UV01ControlActProcess() {
        return new PRPAIN201306UV02MFMIMT700711UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMIN306010UV01 }
     * 
     */
    public PRPMIN306010UV01 createPRPMIN306010UV01() {
        return new PRPMIN306010UV01();
    }

    /**
     * Create an instance of {@link PRPMIN306010UV01MCCIMT000100UV01Message }
     * 
     */
    public PRPMIN306010UV01MCCIMT000100UV01Message createPRPMIN306010UV01MCCIMT000100UV01Message() {
        return new PRPMIN306010UV01MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN306010UV01QUQIMT021001UV01ControlActProcess }
     * 
     */
    public PRPMIN306010UV01QUQIMT021001UV01ControlActProcess createPRPMIN306010UV01QUQIMT021001UV01ControlActProcess() {
        return new PRPMIN306010UV01QUQIMT021001UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMIN401031UV01 }
     * 
     */
    public PRPMIN401031UV01 createPRPMIN401031UV01() {
        return new PRPMIN401031UV01();
    }

    /**
     * Create an instance of {@link PRPMIN401031UV01MCCIMT000300UV01Message }
     * 
     */
    public PRPMIN401031UV01MCCIMT000300UV01Message createPRPMIN401031UV01MCCIMT000300UV01Message() {
        return new PRPMIN401031UV01MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link PRPMIN401031UV01MFMIMT700721UV01ControlActProcess }
     * 
     */
    public PRPMIN401031UV01MFMIMT700721UV01ControlActProcess createPRPMIN401031UV01MFMIMT700721UV01ControlActProcess() {
        return new PRPMIN401031UV01MFMIMT700721UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPAIN201314UV02 }
     * 
     */
    public PRPAIN201314UV02 createPRPAIN201314UV02() {
        return new PRPAIN201314UV02();
    }

    /**
     * Create an instance of {@link PRPAIN201314UV02MCCIMT000100UV01Message }
     * 
     */
    public PRPAIN201314UV02MCCIMT000100UV01Message createPRPAIN201314UV02MCCIMT000100UV01Message() {
        return new PRPAIN201314UV02MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPAIN201314UV02MFMIMT700721UV01ControlActProcess }
     * 
     */
    public PRPAIN201314UV02MFMIMT700721UV01ControlActProcess createPRPAIN201314UV02MFMIMT700721UV01ControlActProcess() {
        return new PRPAIN201314UV02MFMIMT700721UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPAIN201305UV02 }
     * 
     */
    public PRPAIN201305UV02 createPRPAIN201305UV02() {
        return new PRPAIN201305UV02();
    }

    /**
     * Create an instance of {@link PRPAIN201305UV02MCCIMT000100UV01Message }
     * 
     */
    public PRPAIN201305UV02MCCIMT000100UV01Message createPRPAIN201305UV02MCCIMT000100UV01Message() {
        return new PRPAIN201305UV02MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPAIN201305UV02QUQIMT021001UV01ControlActProcess }
     * 
     */
    public PRPAIN201305UV02QUQIMT021001UV01ControlActProcess createPRPAIN201305UV02QUQIMT021001UV01ControlActProcess() {
        return new PRPAIN201305UV02QUQIMT021001UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01TerritorialAuthority }
     * 
     */
    public PRPMMT309000UV01TerritorialAuthority createPRPMMT309000UV01TerritorialAuthority() {
        return new PRPMMT309000UV01TerritorialAuthority();
    }

    /**
     * Create an instance of {@link PRPMIN306051UV01MFMIMT700711UV01Subject1 }
     * 
     */
    public PRPMIN306051UV01MFMIMT700711UV01Subject1 createPRPMIN306051UV01MFMIMT700711UV01Subject1() {
        return new PRPMIN306051UV01MFMIMT700711UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPMIN306051UV01MFMIMT700711UV01Subject2 }
     * 
     */
    public PRPMIN306051UV01MFMIMT700711UV01Subject2 createPRPMIN306051UV01MFMIMT700711UV01Subject2() {
        return new PRPMIN306051UV01MFMIMT700711UV01Subject2();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01RegistrationRequest }
     * 
     */
    public MFMIMT700701UV01RegistrationRequest createMFMIMT700701UV01RegistrationRequest() {
        return new MFMIMT700701UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link BAGED }
     * 
     */
    public BAGED createBAGED() {
        return new BAGED();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01QueryAck }
     * 
     */
    public MFMIMT700711UV01QueryAck createMFMIMT700711UV01QueryAck() {
        return new MFMIMT700711UV01QueryAck();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Subject8 }
     * 
     */
    public PRPMMT303010UV01Subject8 createPRPMMT303010UV01Subject8() {
        return new PRPMMT303010UV01Subject8();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Subject9 }
     * 
     */
    public PRPMMT303010UV01Subject9 createPRPMMT303010UV01Subject9() {
        return new PRPMMT303010UV01Subject9();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Subject6 }
     * 
     */
    public PRPMMT303010UV01Subject6 createPRPMMT303010UV01Subject6() {
        return new PRPMMT303010UV01Subject6();
    }

    /**
     * Create an instance of {@link COCTMT810000UVInformationProvision }
     * 
     */
    public COCTMT810000UVInformationProvision createCOCTMT810000UVInformationProvision() {
        return new COCTMT810000UVInformationProvision();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Subject7 }
     * 
     */
    public PRPMMT303010UV01Subject7 createPRPMMT303010UV01Subject7() {
        return new PRPMMT303010UV01Subject7();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Subject4 }
     * 
     */
    public PRPMMT303010UV01Subject4 createPRPMMT303010UV01Subject4() {
        return new PRPMMT303010UV01Subject4();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Subject5 }
     * 
     */
    public PRPMMT303010UV01Subject5 createPRPMMT303010UV01Subject5() {
        return new PRPMMT303010UV01Subject5();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Subject2 }
     * 
     */
    public PRPMMT303010UV01Subject2 createPRPMMT303010UV01Subject2() {
        return new PRPMMT303010UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Subject3 }
     * 
     */
    public PRPMMT303010UV01Subject3 createPRPMMT303010UV01Subject3() {
        return new PRPMMT303010UV01Subject3();
    }

    /**
     * Create an instance of {@link PRPAMT201307UV02QueryByParameter }
     * 
     */
    public PRPAMT201307UV02QueryByParameter createPRPAMT201307UV02QueryByParameter() {
        return new PRPAMT201307UV02QueryByParameter();
    }

    /**
     * Create an instance of {@link COCTMT230100UVCountry }
     * 
     */
    public COCTMT230100UVCountry createCOCTMT230100UVCountry() {
        return new COCTMT230100UVCountry();
    }

    /**
     * Create an instance of {@link UVPRTO }
     * 
     */
    public UVPRTO createUVPRTO() {
        return new UVPRTO();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubstanceManufacturer }
     * 
     */
    public COCTMT230100UVSubstanceManufacturer createCOCTMT230100UVSubstanceManufacturer() {
        return new COCTMT230100UVSubstanceManufacturer();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01ActDefinitionOrEvent }
     * 
     */
    public PRPMMT401010UV01ActDefinitionOrEvent createPRPMMT401010UV01ActDefinitionOrEvent() {
        return new PRPMMT401010UV01ActDefinitionOrEvent();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04AccommodationRequestorRole }
     * 
     */
    public COCTMT310000UV04AccommodationRequestorRole createCOCTMT310000UV04AccommodationRequestorRole() {
        return new COCTMT310000UV04AccommodationRequestorRole();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02CoveredParty }
     * 
     */
    public PRPAMT201301UV02CoveredParty createPRPAMT201301UV02CoveredParty() {
        return new PRPAMT201301UV02CoveredParty();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01ServiceDeliveryLocation }
     * 
     */
    public PRPMMT303010UV01ServiceDeliveryLocation createPRPMMT303010UV01ServiceDeliveryLocation() {
        return new PRPMMT303010UV01ServiceDeliveryLocation();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01ContactPerson }
     * 
     */
    public PRPMMT403010UV01ContactPerson createPRPMMT403010UV01ContactPerson() {
        return new PRPMMT403010UV01ContactPerson();
    }

    /**
     * Create an instance of {@link BAGEN }
     * 
     */
    public BAGEN createBAGEN() {
        return new BAGEN();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Student }
     * 
     */
    public PRPAMT201310UV02Student createPRPAMT201310UV02Student() {
        return new PRPAMT201310UV02Student();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01Audit }
     * 
     */
    public PRPMMT306010UV01Audit createPRPMMT306010UV01Audit() {
        return new PRPMMT306010UV01Audit();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01TerritorialAuthority }
     * 
     */
    public PRPMMT406110UV01TerritorialAuthority createPRPMMT406110UV01TerritorialAuthority() {
        return new PRPMMT406110UV01TerritorialAuthority();
    }

    /**
     * Create an instance of {@link BAGCD }
     * 
     */
    public BAGCD createBAGCD() {
        return new BAGCD();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02PersonalRelationship }
     * 
     */
    public PRPAMT201301UV02PersonalRelationship createPRPAMT201301UV02PersonalRelationship() {
        return new PRPAMT201301UV02PersonalRelationship();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectDeceasedTime }
     * 
     */
    public PRPAMT201306UV02LivingSubjectDeceasedTime createPRPAMT201306UV02LivingSubjectDeceasedTime() {
        return new PRPAMT201306UV02LivingSubjectDeceasedTime();
    }

    /**
     * Create an instance of {@link BAGBL }
     * 
     */
    public BAGBL createBAGBL() {
        return new BAGBL();
    }

    /**
     * Create an instance of {@link COCTMT820000UVPerson }
     * 
     */
    public COCTMT820000UVPerson createCOCTMT820000UVPerson() {
        return new COCTMT820000UVPerson();
    }

    /**
     * Create an instance of {@link COCTMT090003UV01AssignedEntity }
     * 
     */
    public COCTMT090003UV01AssignedEntity createCOCTMT090003UV01AssignedEntity() {
        return new COCTMT090003UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06ResponsibleParty2 }
     * 
     */
    public COCTMT510000UV06ResponsibleParty2 createCOCTMT510000UV06ResponsibleParty2() {
        return new COCTMT510000UV06ResponsibleParty2();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01PrivilegeCategorization }
     * 
     */
    public PRPMMT409000UV01PrivilegeCategorization createPRPMMT409000UV01PrivilegeCategorization() {
        return new PRPMMT409000UV01PrivilegeCategorization();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01Group }
     * 
     */
    public COCTMT090000UV01Group createCOCTMT090000UV01Group() {
        return new COCTMT090000UV01Group();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Custodian }
     * 
     */
    public PRPMMT303010UV01Custodian createPRPMMT303010UV01Custodian() {
        return new PRPMMT303010UV01Custodian();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02PatientOfOtherProvider }
     * 
     */
    public PRPAMT201303UV02PatientOfOtherProvider createPRPAMT201303UV02PatientOfOtherProvider() {
        return new PRPAMT201303UV02PatientOfOtherProvider();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Patient }
     * 
     */
    public PRPAMT201302UV02Patient createPRPAMT201302UV02Patient() {
        return new PRPAMT201302UV02Patient();
    }

    /**
     * Create an instance of {@link COCTMT530000UVMaterialKind }
     * 
     */
    public COCTMT530000UVMaterialKind createCOCTMT530000UVMaterialKind() {
        return new COCTMT530000UVMaterialKind();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01ReplacementOf }
     * 
     */
    public MFMIMT700721UV01ReplacementOf createMFMIMT700721UV01ReplacementOf() {
        return new MFMIMT700721UV01ReplacementOf();
    }

    /**
     * Create an instance of {@link BAGCS }
     * 
     */
    public BAGCS createBAGCS() {
        return new BAGCS();
    }

    /**
     * Create an instance of {@link BAGCO }
     * 
     */
    public BAGCO createBAGCO() {
        return new BAGCO();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Location }
     * 
     */
    public COCTMT600000UV06Location createCOCTMT600000UV06Location() {
        return new COCTMT600000UV06Location();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSpecializedKind }
     * 
     */
    public COCTMT230100UVSpecializedKind createCOCTMT230100UVSpecializedKind() {
        return new COCTMT230100UVSpecializedKind();
    }

    /**
     * Create an instance of {@link COCTMT040203UV09NotificationParty }
     * 
     */
    public COCTMT040203UV09NotificationParty createCOCTMT040203UV09NotificationParty() {
        return new COCTMT040203UV09NotificationParty();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Patient }
     * 
     */
    public PRPAMT201304UV02Patient createPRPAMT201304UV02Patient() {
        return new PRPAMT201304UV02Patient();
    }

    /**
     * Create an instance of {@link COCTMT230100UVMedication }
     * 
     */
    public COCTMT230100UVMedication createCOCTMT230100UVMedication() {
        return new COCTMT230100UVMedication();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Jurisdiction }
     * 
     */
    public PRPMMT306110UV01Jurisdiction createPRPMMT306110UV01Jurisdiction() {
        return new PRPMMT306110UV01Jurisdiction();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Location1 }
     * 
     */
    public COCTMT290000UV06Location1 createCOCTMT290000UV06Location1() {
        return new COCTMT290000UV06Location1();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Organization }
     * 
     */
    public MCCIMT000300UV01Organization createMCCIMT000300UV01Organization() {
        return new MCCIMT000300UV01Organization();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01PrivilegeCategorization }
     * 
     */
    public PRPMMT306110UV01PrivilegeCategorization createPRPMMT306110UV01PrivilegeCategorization() {
        return new PRPMMT306110UV01PrivilegeCategorization();
    }

    /**
     * Create an instance of {@link BAGII }
     * 
     */
    public BAGII createBAGII() {
        return new BAGII();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01PrincipalOrganization }
     * 
     */
    public PRPMMT409000UV01PrincipalOrganization createPRPMMT409000UV01PrincipalOrganization() {
        return new PRPMMT409000UV01PrincipalOrganization();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Employee }
     * 
     */
    public PRPAMT201304UV02Employee createPRPAMT201304UV02Employee() {
        return new PRPAMT201304UV02Employee();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Additive }
     * 
     */
    public COCTMT080000UV09Additive createCOCTMT080000UV09Additive() {
        return new COCTMT080000UV09Additive();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectBirthTime }
     * 
     */
    public PRPAMT201306UV02LivingSubjectBirthTime createPRPAMT201306UV02LivingSubjectBirthTime() {
        return new PRPAMT201306UV02LivingSubjectBirthTime();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01HealthCareProvider }
     * 
     */
    public PRPMMT301010UV01HealthCareProvider createPRPMMT301010UV01HealthCareProvider() {
        return new PRPMMT301010UV01HealthCareProvider();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Person }
     * 
     */
    public PRPAMT201302UV02Person createPRPAMT201302UV02Person() {
        return new PRPAMT201302UV02Person();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Referrer }
     * 
     */
    public COCTMT490000UV04Referrer createCOCTMT490000UV04Referrer() {
        return new COCTMT490000UV04Referrer();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02MothersMaidenName }
     * 
     */
    public PRPAMT201306UV02MothersMaidenName createPRPAMT201306UV02MothersMaidenName() {
        return new PRPAMT201306UV02MothersMaidenName();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Subject7 }
     * 
     */
    public PRPMMT309000UV01Subject7 createPRPMMT309000UV01Subject7() {
        return new PRPMMT309000UV01Subject7();
    }

    /**
     * Create an instance of {@link BAGINT }
     * 
     */
    public BAGINT createBAGINT() {
        return new BAGINT();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Subject9 }
     * 
     */
    public PRPMMT309000UV01Subject9 createPRPMMT309000UV01Subject9() {
        return new PRPMMT309000UV01Subject9();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Subject4 }
     * 
     */
    public PRPMMT309000UV01Subject4 createPRPMMT309000UV01Subject4() {
        return new PRPMMT309000UV01Subject4();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Subject3 }
     * 
     */
    public PRPMMT309000UV01Subject3 createPRPMMT309000UV01Subject3() {
        return new PRPMMT309000UV01Subject3();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01AlsoKnownas }
     * 
     */
    public PRPMMT306110UV01AlsoKnownas createPRPMMT306110UV01AlsoKnownas() {
        return new PRPMMT306110UV01AlsoKnownas();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Subject6 }
     * 
     */
    public PRPMMT309000UV01Subject6 createPRPMMT309000UV01Subject6() {
        return new PRPMMT309000UV01Subject6();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06IndirectAuthorithyOver2 }
     * 
     */
    public COCTMT510000UV06IndirectAuthorithyOver2 createCOCTMT510000UV06IndirectAuthorithyOver2() {
        return new COCTMT510000UV06IndirectAuthorithyOver2();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Subject2 }
     * 
     */
    public PRPMMT309000UV01Subject2 createPRPMMT309000UV01Subject2() {
        return new PRPMMT309000UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01InformDefinition }
     * 
     */
    public PRPMMT406110UV01InformDefinition createPRPMMT406110UV01InformDefinition() {
        return new PRPMMT406110UV01InformDefinition();
    }

    /**
     * Create an instance of {@link COCTMT530000UVInformant }
     * 
     */
    public COCTMT530000UVInformant createCOCTMT530000UVInformant() {
        return new COCTMT530000UVInformant();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01ActDefinition }
     * 
     */
    public MFMIMT700721UV01ActDefinition createMFMIMT700721UV01ActDefinition() {
        return new MFMIMT700721UV01ActDefinition();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02NonPersonLivingSubject }
     * 
     */
    public PRPAMT201303UV02NonPersonLivingSubject createPRPAMT201303UV02NonPersonLivingSubject() {
        return new PRPAMT201303UV02NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link PRPMIN401030UV01MFMIMT700721UV01Subject1 }
     * 
     */
    public PRPMIN401030UV01MFMIMT700721UV01Subject1 createPRPMIN401030UV01MFMIMT700721UV01Subject1() {
        return new PRPMIN401030UV01MFMIMT700721UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPMIN401030UV01MFMIMT700721UV01Subject2 }
     * 
     */
    public PRPMIN401030UV01MFMIMT700721UV01Subject2 createPRPMIN401030UV01MFMIMT700721UV01Subject2() {
        return new PRPMIN401030UV01MFMIMT700721UV01Subject2();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01LocatedEntity }
     * 
     */
    public MCCIMT000300UV01LocatedEntity createMCCIMT000300UV01LocatedEntity() {
        return new MCCIMT000300UV01LocatedEntity();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Member }
     * 
     */
    public PRPAMT201304UV02Member createPRPAMT201304UV02Member() {
        return new PRPAMT201304UV02Member();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Author2 }
     * 
     */
    public COCTMT510000UV06Author2 createCOCTMT510000UV06Author2() {
        return new COCTMT510000UV06Author2();
    }

    /**
     * Create an instance of {@link COCTMT090002UV01Device }
     * 
     */
    public COCTMT090002UV01Device createCOCTMT090002UV01Device() {
        return new COCTMT090002UV01Device();
    }

    /**
     * Create an instance of {@link DSETRTO }
     * 
     */
    public DSETRTO createDSETRTO() {
        return new DSETRTO();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01DataEnterer }
     * 
     */
    public PRPMMT306110UV01DataEnterer createPRPMMT306110UV01DataEnterer() {
        return new PRPMMT306110UV01DataEnterer();
    }

    /**
     * Create an instance of {@link COCTMT230100UVObservationGoal }
     * 
     */
    public COCTMT230100UVObservationGoal createCOCTMT230100UVObservationGoal() {
        return new COCTMT230100UVObservationGoal();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Author }
     * 
     */
    public COCTMT290000UV06Author createCOCTMT290000UV06Author() {
        return new COCTMT290000UV06Author();
    }

    /**
     * Create an instance of {@link COCTMT030203UV07LanguageCommunication }
     * 
     */
    public COCTMT030203UV07LanguageCommunication createCOCTMT030203UV07LanguageCommunication() {
        return new COCTMT030203UV07LanguageCommunication();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01LocatedEntity }
     * 
     */
    public MCCIMT000100UV01LocatedEntity createMCCIMT000100UV01LocatedEntity() {
        return new MCCIMT000100UV01LocatedEntity();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Employee }
     * 
     */
    public PRPAMT201302UV02Employee createPRPAMT201302UV02Employee() {
        return new PRPAMT201302UV02Employee();
    }

    /**
     * Create an instance of {@link COCTMT230100UVApproval }
     * 
     */
    public COCTMT230100UVApproval createCOCTMT230100UVApproval() {
        return new COCTMT230100UVApproval();
    }

    /**
     * Create an instance of {@link BAGMO }
     * 
     */
    public BAGMO createBAGMO() {
        return new BAGMO();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01RoleEffectiveDate }
     * 
     */
    public PRPMMT406010UV01RoleEffectiveDate createPRPMMT406010UV01RoleEffectiveDate() {
        return new PRPMMT406010UV01RoleEffectiveDate();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06SupplyEvent }
     * 
     */
    public COCTMT600000UV06SupplyEvent createCOCTMT600000UV06SupplyEvent() {
        return new COCTMT600000UV06SupplyEvent();
    }

    /**
     * Create an instance of {@link COCTMT810000UVSupport }
     * 
     */
    public COCTMT810000UVSupport createCOCTMT810000UVSupport() {
        return new COCTMT810000UVSupport();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01InformRequest }
     * 
     */
    public PRPMMT401010UV01InformRequest createPRPMMT401010UV01InformRequest() {
        return new PRPMMT401010UV01InformRequest();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01ActDefinition }
     * 
     */
    public MFMIMT700711UV01ActDefinition createMFMIMT700711UV01ActDefinition() {
        return new MFMIMT700711UV01ActDefinition();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01ObservationEvent }
     * 
     */
    public PRPMMT401010UV01ObservationEvent createPRPMMT401010UV01ObservationEvent() {
        return new PRPMMT401010UV01ObservationEvent();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Place }
     * 
     */
    public PRPMMT406110UV01Place createPRPMMT406110UV01Place() {
        return new PRPMMT406110UV01Place();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01ObservationEvent }
     * 
     */
    public PRPMMT309000UV01ObservationEvent createPRPMMT309000UV01ObservationEvent() {
        return new PRPMMT309000UV01ObservationEvent();
    }

    /**
     * Create an instance of {@link PRPAIN201313UV02MFMIMT700721UV01RegistrationRequest }
     * 
     */
    public PRPAIN201313UV02MFMIMT700721UV01RegistrationRequest createPRPAIN201313UV02MFMIMT700721UV01RegistrationRequest() {
        return new PRPAIN201313UV02MFMIMT700721UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link COCTMT030207UV07LanguageCommunication }
     * 
     */
    public COCTMT030207UV07LanguageCommunication createCOCTMT030207UV07LanguageCommunication() {
        return new COCTMT030207UV07LanguageCommunication();
    }

    /**
     * Create an instance of {@link COCTMT530000UVOrganization }
     * 
     */
    public COCTMT530000UVOrganization createCOCTMT530000UVOrganization() {
        return new COCTMT530000UVOrganization();
    }

    /**
     * Create an instance of {@link PRPAIN201312UV02MFMIMT700701UV01Subject1 }
     * 
     */
    public PRPAIN201312UV02MFMIMT700701UV01Subject1 createPRPAIN201312UV02MFMIMT700701UV01Subject1() {
        return new PRPAIN201312UV02MFMIMT700701UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPAIN201312UV02MFMIMT700701UV01Subject2 }
     * 
     */
    public PRPAIN201312UV02MFMIMT700701UV01Subject2 createPRPAIN201312UV02MFMIMT700701UV01Subject2() {
        return new PRPAIN201312UV02MFMIMT700701UV01Subject2();
    }

    /**
     * Create an instance of {@link COCTMT530000UVHealthCareFacility }
     * 
     */
    public COCTMT530000UVHealthCareFacility createCOCTMT530000UVHealthCareFacility() {
        return new COCTMT530000UVHealthCareFacility();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Reason2 }
     * 
     */
    public COCTMT300000UV04Reason2 createCOCTMT300000UV04Reason2() {
        return new COCTMT300000UV04Reason2();
    }

    /**
     * Create an instance of {@link PRPAIN201310UV02MFMIMT700711UV01RegistrationEvent }
     * 
     */
    public PRPAIN201310UV02MFMIMT700711UV01RegistrationEvent createPRPAIN201310UV02MFMIMT700711UV01RegistrationEvent() {
        return new PRPAIN201310UV02MFMIMT700711UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link COCTMT150007UVOrganization }
     * 
     */
    public COCTMT150007UVOrganization createCOCTMT150007UVOrganization() {
        return new COCTMT150007UVOrganization();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Definition3 }
     * 
     */
    public COCTMT510000UV06Definition3 createCOCTMT510000UV06Definition3() {
        return new COCTMT510000UV06Definition3();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01Jurisdiction }
     * 
     */
    public PRPMMT306010UV01Jurisdiction createPRPMMT306010UV01Jurisdiction() {
        return new PRPMMT306010UV01Jurisdiction();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01AssignedEntity2 }
     * 
     */
    public PRPMMT306110UV01AssignedEntity2 createPRPMMT306110UV01AssignedEntity2() {
        return new PRPMMT306110UV01AssignedEntity2();
    }

    /**
     * Create an instance of {@link COCTMT030007UVGuardian }
     * 
     */
    public COCTMT030007UVGuardian createCOCTMT030007UVGuardian() {
        return new COCTMT030007UVGuardian();
    }

    /**
     * Create an instance of {@link COCTMT150000UV02OrganizationPartOf }
     * 
     */
    public COCTMT150000UV02OrganizationPartOf createCOCTMT150000UV02OrganizationPartOf() {
        return new COCTMT150000UV02OrganizationPartOf();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01PrincipalPerson }
     * 
     */
    public PRPMMT301010UV01PrincipalPerson createPRPMMT301010UV01PrincipalPerson() {
        return new PRPMMT301010UV01PrincipalPerson();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Reason4 }
     * 
     */
    public COCTMT290000UV06Reason4 createCOCTMT290000UV06Reason4() {
        return new COCTMT290000UV06Reason4();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Reason3 }
     * 
     */
    public COCTMT290000UV06Reason3 createCOCTMT290000UV06Reason3() {
        return new COCTMT290000UV06Reason3();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01ControlActEvent }
     * 
     */
    public PRPMMT401010UV01ControlActEvent createPRPMMT401010UV01ControlActEvent() {
        return new PRPMMT401010UV01ControlActEvent();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Reason5 }
     * 
     */
    public COCTMT290000UV06Reason5 createCOCTMT290000UV06Reason5() {
        return new COCTMT290000UV06Reason5();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01ResponsibleParty }
     * 
     */
    public PRPMMT306110UV01ResponsibleParty createPRPMMT306110UV01ResponsibleParty() {
        return new PRPMMT306110UV01ResponsibleParty();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01ReplacementOf }
     * 
     */
    public MFMIMT700711UV01ReplacementOf createMFMIMT700711UV01ReplacementOf() {
        return new MFMIMT700711UV01ReplacementOf();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01DisciplinaryAction }
     * 
     */
    public PRPMMT409000UV01DisciplinaryAction createPRPMMT409000UV01DisciplinaryAction() {
        return new PRPMMT409000UV01DisciplinaryAction();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04Account }
     * 
     */
    public COCTMT670000UV04Account createCOCTMT670000UV04Account() {
        return new COCTMT670000UV04Account();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01ControlActEvent }
     * 
     */
    public PRPMMT301010UV01ControlActEvent createPRPMMT301010UV01ControlActEvent() {
        return new PRPMMT301010UV01ControlActEvent();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04Reference }
     * 
     */
    public COCTMT740000UV04Reference createCOCTMT740000UV04Reference() {
        return new COCTMT740000UV04Reference();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Device }
     * 
     */
    public COCTMT080000UV09Device createCOCTMT080000UV09Device() {
        return new COCTMT080000UV09Device();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Reason1 }
     * 
     */
    public COCTMT290000UV06Reason1 createCOCTMT290000UV06Reason1() {
        return new COCTMT290000UV06Reason1();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01QueryByParameterPayload }
     * 
     */
    public PRPMMT306010UV01QueryByParameterPayload createPRPMMT306010UV01QueryByParameterPayload() {
        return new PRPMMT306010UV01QueryByParameterPayload();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09ActDefinition }
     * 
     */
    public COCTMT080000UV09ActDefinition createCOCTMT080000UV09ActDefinition() {
        return new COCTMT080000UV09ActDefinition();
    }

    /**
     * Create an instance of {@link COCTMT090003UV01Device }
     * 
     */
    public COCTMT090003UV01Device createCOCTMT090003UV01Device() {
        return new COCTMT090003UV01Device();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01DataEnterer }
     * 
     */
    public PRPMMT303010UV01DataEnterer createPRPMMT303010UV01DataEnterer() {
        return new PRPMMT303010UV01DataEnterer();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Student }
     * 
     */
    public PRPAMT201303UV02Student createPRPAMT201303UV02Student() {
        return new PRPAMT201303UV02Student();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01PatientOfOtherProvider }
     * 
     */
    public COCTMT050000UV01PatientOfOtherProvider createCOCTMT050000UV01PatientOfOtherProvider() {
        return new COCTMT050000UV01PatientOfOtherProvider();
    }

    /**
     * Create an instance of {@link COCTMT090002UV01AssignedEntity }
     * 
     */
    public COCTMT090002UV01AssignedEntity createCOCTMT090002UV01AssignedEntity() {
        return new COCTMT090002UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01ActDefinitionOrEvent }
     * 
     */
    public PRPMMT406110UV01ActDefinitionOrEvent createPRPMMT406110UV01ActDefinitionOrEvent() {
        return new PRPMMT406110UV01ActDefinitionOrEvent();
    }

    /**
     * Create an instance of {@link COCTMT440001UV09ValuedItem }
     * 
     */
    public COCTMT440001UV09ValuedItem createCOCTMT440001UV09ValuedItem() {
        return new COCTMT440001UV09ValuedItem();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04PrescriberPerson }
     * 
     */
    public COCTMT300000UV04PrescriberPerson createCOCTMT300000UV04PrescriberPerson() {
        return new COCTMT300000UV04PrescriberPerson();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02AdministrativeObservation }
     * 
     */
    public PRPAMT201302UV02AdministrativeObservation createPRPAMT201302UV02AdministrativeObservation() {
        return new PRPAMT201302UV02AdministrativeObservation();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Precondition }
     * 
     */
    public COCTMT080000UV09Precondition createCOCTMT080000UV09Precondition() {
        return new COCTMT080000UV09Precondition();
    }

    /**
     * Create an instance of {@link PRPAIN201314UV02MFMIMT700721UV01Subject1 }
     * 
     */
    public PRPAIN201314UV02MFMIMT700721UV01Subject1 createPRPAIN201314UV02MFMIMT700721UV01Subject1() {
        return new PRPAIN201314UV02MFMIMT700721UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPAIN201314UV02MFMIMT700721UV01Subject2 }
     * 
     */
    public PRPAIN201314UV02MFMIMT700721UV01Subject2 createPRPAIN201314UV02MFMIMT700721UV01Subject2() {
        return new PRPAIN201314UV02MFMIMT700721UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01Part }
     * 
     */
    public PRPMMT409000UV01Part createPRPMMT409000UV01Part() {
        return new PRPMMT409000UV01Part();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01PrincipalOrganization }
     * 
     */
    public PRPMMT406110UV01PrincipalOrganization createPRPMMT406110UV01PrincipalOrganization() {
        return new PRPMMT406110UV01PrincipalOrganization();
    }

    /**
     * Create an instance of {@link REAL }
     * 
     */
    public REAL createREAL() {
        return new REAL();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05Position }
     * 
     */
    public COCTMT960000UV05Position createCOCTMT960000UV05Position() {
        return new COCTMT960000UV05Position();
    }

    /**
     * Create an instance of {@link NPPDINT }
     * 
     */
    public NPPDINT createNPPDINT() {
        return new NPPDINT();
    }

    /**
     * Create an instance of {@link COCTMT030007UVContactParty }
     * 
     */
    public COCTMT030007UVContactParty createCOCTMT030007UVContactParty() {
        return new COCTMT030007UVContactParty();
    }

    /**
     * Create an instance of {@link StrucDocItem }
     * 
     */
    public StrucDocItem createStrucDocItem() {
        return new StrucDocItem();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06SecondaryPerformer }
     * 
     */
    public COCTMT290000UV06SecondaryPerformer createCOCTMT290000UV06SecondaryPerformer() {
        return new COCTMT290000UV06SecondaryPerformer();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01Patient }
     * 
     */
    public COCTMT050000UV01Patient createCOCTMT050000UV01Patient() {
        return new COCTMT050000UV01Patient();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01Requires }
     * 
     */
    public MCAIMT900001UV01Requires createMCAIMT900001UV01Requires() {
        return new MCAIMT900001UV01Requires();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Reason }
     * 
     */
    public MFMIMT700701UV01Reason createMFMIMT700701UV01Reason() {
        return new MFMIMT700701UV01Reason();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ResponsibleParty }
     * 
     */
    public COCTMT290000UV06ResponsibleParty createCOCTMT290000UV06ResponsibleParty() {
        return new COCTMT290000UV06ResponsibleParty();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Part }
     * 
     */
    public PRPMMT309000UV01Part createPRPMMT309000UV01Part() {
        return new PRPMMT309000UV01Part();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01NonPersonLivingSubject }
     * 
     */
    public COCTMT050000UV01NonPersonLivingSubject createCOCTMT050000UV01NonPersonLivingSubject() {
        return new COCTMT050000UV01NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link COCTMT530000UVEntity }
     * 
     */
    public COCTMT530000UVEntity createCOCTMT530000UVEntity() {
        return new COCTMT530000UVEntity();
    }

    /**
     * Create an instance of {@link PRPAIN201316UV02MFMIMT700721UV01Subject1 }
     * 
     */
    public PRPAIN201316UV02MFMIMT700721UV01Subject1 createPRPAIN201316UV02MFMIMT700721UV01Subject1() {
        return new PRPAIN201316UV02MFMIMT700721UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPAIN201316UV02MFMIMT700721UV01Subject2 }
     * 
     */
    public PRPAIN201316UV02MFMIMT700721UV01Subject2 createPRPAIN201316UV02MFMIMT700721UV01Subject2() {
        return new PRPAIN201316UV02MFMIMT700721UV01Subject2();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09ActReference }
     * 
     */
    public COCTMT080000UV09ActReference createCOCTMT080000UV09ActReference() {
        return new COCTMT080000UV09ActReference();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01LanguageCommunication }
     * 
     */
    public COCTMT050000UV01LanguageCommunication createCOCTMT050000UV01LanguageCommunication() {
        return new COCTMT050000UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01ProviderID }
     * 
     */
    public PRPMMT306010UV01ProviderID createPRPMMT306010UV01ProviderID() {
        return new PRPMMT306010UV01ProviderID();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01LanguageCommunication }
     * 
     */
    public PRPMMT406110UV01LanguageCommunication createPRPMMT406110UV01LanguageCommunication() {
        return new PRPMMT406110UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link COCTMT150000UV02Person }
     * 
     */
    public COCTMT150000UV02Person createCOCTMT150000UV02Person() {
        return new COCTMT150000UV02Person();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01ServiceDeliveryLocation }
     * 
     */
    public PRPMMT301010UV01ServiceDeliveryLocation createPRPMMT301010UV01ServiceDeliveryLocation() {
        return new PRPMMT301010UV01ServiceDeliveryLocation();
    }

    /**
     * Create an instance of {@link BAGPQ }
     * 
     */
    public BAGPQ createBAGPQ() {
        return new BAGPQ();
    }

    /**
     * Create an instance of {@link COCTMT230100UVAuthor }
     * 
     */
    public COCTMT230100UVAuthor createCOCTMT230100UVAuthor() {
        return new COCTMT230100UVAuthor();
    }

    /**
     * Create an instance of {@link COCTMT030007UVCitizen }
     * 
     */
    public COCTMT030007UVCitizen createCOCTMT030007UVCitizen() {
        return new COCTMT030007UVCitizen();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01Jurisdiction }
     * 
     */
    public PRPMMT406010UV01Jurisdiction createPRPMMT406010UV01Jurisdiction() {
        return new PRPMMT406010UV01Jurisdiction();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubstance }
     * 
     */
    public COCTMT230100UVSubstance createCOCTMT230100UVSubstance() {
        return new COCTMT230100UVSubstance();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01Group }
     * 
     */
    public COCTMT050000UV01Group createCOCTMT050000UV01Group() {
        return new COCTMT050000UV01Group();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSupply }
     * 
     */
    public COCTMT530000UVSupply createCOCTMT530000UVSupply() {
        return new COCTMT530000UVSupply();
    }

    /**
     * Create an instance of {@link COCTMT530000UVLocation }
     * 
     */
    public COCTMT530000UVLocation createCOCTMT530000UVLocation() {
        return new COCTMT530000UVLocation();
    }

    /**
     * Create an instance of {@link LISTCD }
     * 
     */
    public LISTCD createLISTCD() {
        return new LISTCD();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01EntityRsp }
     * 
     */
    public MCCIMT000100UV01EntityRsp createMCCIMT000100UV01EntityRsp() {
        return new MCCIMT000100UV01EntityRsp();
    }

    /**
     * Create an instance of {@link LISTCO }
     * 
     */
    public LISTCO createLISTCO() {
        return new LISTCO();
    }

    /**
     * Create an instance of {@link DSETSC }
     * 
     */
    public DSETSC createDSETSC() {
        return new DSETSC();
    }

    /**
     * Create an instance of {@link PRPMIN401030UV01MFMIMT700721UV01RegistrationRequest }
     * 
     */
    public PRPMIN401030UV01MFMIMT700721UV01RegistrationRequest createPRPMIN401030UV01MFMIMT700721UV01RegistrationRequest() {
        return new PRPMIN401030UV01MFMIMT700721UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Guardian }
     * 
     */
    public PRPAMT201303UV02Guardian createPRPAMT201303UV02Guardian() {
        return new PRPAMT201303UV02Guardian();
    }

    /**
     * Create an instance of {@link LISTCS }
     * 
     */
    public LISTCS createLISTCS() {
        return new LISTCS();
    }

    /**
     * Create an instance of {@link PRPMIN306051UV01MFMIMT700711UV01RegistrationEvent }
     * 
     */
    public PRPMIN306051UV01MFMIMT700711UV01RegistrationEvent createPRPMIN306051UV01MFMIMT700711UV01RegistrationEvent() {
        return new PRPMIN306051UV01MFMIMT700711UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02ContactParty }
     * 
     */
    public PRPAMT201310UV02ContactParty createPRPAMT201310UV02ContactParty() {
        return new PRPAMT201310UV02ContactParty();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01Person }
     * 
     */
    public COCTMT090000UV01Person createCOCTMT090000UV01Person() {
        return new COCTMT090000UV01Person();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Place }
     * 
     */
    public MCCIMT000200UV01Place createMCCIMT000200UV01Place() {
        return new MCCIMT000200UV01Place();
    }

    /**
     * Create an instance of {@link COCTMT150007UVPerson }
     * 
     */
    public COCTMT150007UVPerson createCOCTMT150007UVPerson() {
        return new COCTMT150007UVPerson();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04PertinentInformation3 }
     * 
     */
    public COCTMT310000UV04PertinentInformation3 createCOCTMT310000UV04PertinentInformation3() {
        return new COCTMT310000UV04PertinentInformation3();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Employee }
     * 
     */
    public PRPAMT201310UV02Employee createPRPAMT201310UV02Employee() {
        return new PRPAMT201310UV02Employee();
    }

    /**
     * Create an instance of {@link COCTMT260003UVAuthor }
     * 
     */
    public COCTMT260003UVAuthor createCOCTMT260003UVAuthor() {
        return new COCTMT260003UVAuthor();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Location }
     * 
     */
    public PRPMMT309000UV01Location createPRPMMT309000UV01Location() {
        return new PRPMMT309000UV01Location();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04PertinentInformation1 }
     * 
     */
    public COCTMT310000UV04PertinentInformation1 createCOCTMT310000UV04PertinentInformation1() {
        return new COCTMT310000UV04PertinentInformation1();
    }

    /**
     * Create an instance of {@link LISTBL }
     * 
     */
    public LISTBL createLISTBL() {
        return new LISTBL();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04PertinentInformation2 }
     * 
     */
    public COCTMT310000UV04PertinentInformation2 createCOCTMT310000UV04PertinentInformation2() {
        return new COCTMT310000UV04PertinentInformation2();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01ActDefinition }
     * 
     */
    public MFMIMT700701UV01ActDefinition createMFMIMT700701UV01ActDefinition() {
        return new MFMIMT700701UV01ActDefinition();
    }

    /**
     * Create an instance of {@link LISTTEL }
     * 
     */
    public LISTTEL createLISTTEL() {
        return new LISTTEL();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Consumable }
     * 
     */
    public COCTMT080000UV09Consumable createCOCTMT080000UV09Consumable() {
        return new COCTMT080000UV09Consumable();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Container }
     * 
     */
    public COCTMT080000UV09Container createCOCTMT080000UV09Container() {
        return new COCTMT080000UV09Container();
    }

    /**
     * Create an instance of {@link LISTED }
     * 
     */
    public LISTED createLISTED() {
        return new LISTED();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01QualifiedEntity }
     * 
     */
    public PRPMMT403010UV01QualifiedEntity createPRPMMT403010UV01QualifiedEntity() {
        return new PRPMMT403010UV01QualifiedEntity();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Subject4 }
     * 
     */
    public PRPAMT201310UV02Subject4 createPRPAMT201310UV02Subject4() {
        return new PRPAMT201310UV02Subject4();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04SubstitutionRole }
     * 
     */
    public COCTMT300000UV04SubstitutionRole createCOCTMT300000UV04SubstitutionRole() {
        return new COCTMT300000UV04SubstitutionRole();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Subject3 }
     * 
     */
    public PRPAMT201310UV02Subject3 createPRPAMT201310UV02Subject3() {
        return new PRPAMT201310UV02Subject3();
    }

    /**
     * Create an instance of {@link BAGST }
     * 
     */
    public BAGST createBAGST() {
        return new BAGST();
    }

    /**
     * Create an instance of {@link LISTEN }
     * 
     */
    public LISTEN createLISTEN() {
        return new LISTEN();
    }

    /**
     * Create an instance of {@link BAGSC }
     * 
     */
    public BAGSC createBAGSC() {
        return new BAGSC();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Specimen }
     * 
     */
    public COCTMT080000UV09Specimen createCOCTMT080000UV09Specimen() {
        return new COCTMT080000UV09Specimen();
    }

    /**
     * Create an instance of {@link PRPAMT201307UV02DataSource }
     * 
     */
    public PRPAMT201307UV02DataSource createPRPAMT201307UV02DataSource() {
        return new PRPAMT201307UV02DataSource();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Destination }
     * 
     */
    public COCTMT600000UV06Destination createCOCTMT600000UV06Destination() {
        return new COCTMT600000UV06Destination();
    }

    /**
     * Create an instance of {@link DSETTS }
     * 
     */
    public DSETTS createDSETTS() {
        return new DSETTS();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06VisionPrescriptionObservationEvent }
     * 
     */
    public COCTMT600000UV06VisionPrescriptionObservationEvent createCOCTMT600000UV06VisionPrescriptionObservationEvent() {
        return new COCTMT600000UV06VisionPrescriptionObservationEvent();
    }

    /**
     * Create an instance of {@link BAGTS }
     * 
     */
    public BAGTS createBAGTS() {
        return new BAGTS();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Author2 }
     * 
     */
    public MFMIMT700711UV01Author2 createMFMIMT700711UV01Author2() {
        return new MFMIMT700711UV01Author2();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06PolicyOrProgramFinancialLimit }
     * 
     */
    public COCTMT510000UV06PolicyOrProgramFinancialLimit createCOCTMT510000UV06PolicyOrProgramFinancialLimit() {
        return new COCTMT510000UV06PolicyOrProgramFinancialLimit();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Author1 }
     * 
     */
    public MFMIMT700711UV01Author1 createMFMIMT700711UV01Author1() {
        return new MFMIMT700711UV01Author1();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06InFulfillmentOf }
     * 
     */
    public COCTMT600000UV06InFulfillmentOf createCOCTMT600000UV06InFulfillmentOf() {
        return new COCTMT600000UV06InFulfillmentOf();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Subject2 }
     * 
     */
    public PRPAMT201310UV02Subject2 createPRPAMT201310UV02Subject2() {
        return new PRPAMT201310UV02Subject2();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectId }
     * 
     */
    public PRPAMT201306UV02LivingSubjectId createPRPAMT201306UV02LivingSubjectId() {
        return new PRPAMT201306UV02LivingSubjectId();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01ReplacementOf }
     * 
     */
    public MFMIMT700701UV01ReplacementOf createMFMIMT700701UV01ReplacementOf() {
        return new MFMIMT700701UV01ReplacementOf();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Organization }
     * 
     */
    public MCCIMT000200UV01Organization createMCCIMT000200UV01Organization() {
        return new MCCIMT000200UV01Organization();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06PatientCareProvisionRequest }
     * 
     */
    public COCTMT290000UV06PatientCareProvisionRequest createCOCTMT290000UV06PatientCareProvisionRequest() {
        return new COCTMT290000UV06PatientCareProvisionRequest();
    }

    /**
     * Create an instance of {@link DSETST }
     * 
     */
    public DSETST createDSETST() {
        return new DSETST();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Receiver }
     * 
     */
    public PRPMMT306110UV01Receiver createPRPMMT306110UV01Receiver() {
        return new PRPMMT306110UV01Receiver();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01RoleOther }
     * 
     */
    public PRPMMT403010UV01RoleOther createPRPMMT403010UV01RoleOther() {
        return new PRPMMT403010UV01RoleOther();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01PriorRegisteredAct }
     * 
     */
    public MFMIMT700711UV01PriorRegisteredAct createMFMIMT700711UV01PriorRegisteredAct() {
        return new MFMIMT700711UV01PriorRegisteredAct();
    }

    /**
     * Create an instance of {@link COCTMT260003UVAssignedEntity }
     * 
     */
    public COCTMT260003UVAssignedEntity createCOCTMT260003UVAssignedEntity() {
        return new COCTMT260003UVAssignedEntity();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Guardian }
     * 
     */
    public PRPAMT201301UV02Guardian createPRPAMT201301UV02Guardian() {
        return new PRPAMT201301UV02Guardian();
    }

    /**
     * Create an instance of {@link COCTMT820000UVPerformer }
     * 
     */
    public COCTMT820000UVPerformer createCOCTMT820000UVPerformer() {
        return new COCTMT820000UVPerformer();
    }

    /**
     * Create an instance of {@link PRPMIN403010UV01MFMIMT700721UV01RegistrationRequest }
     * 
     */
    public PRPMIN403010UV01MFMIMT700721UV01RegistrationRequest createPRPMIN403010UV01MFMIMT700721UV01RegistrationRequest() {
        return new PRPMIN403010UV01MFMIMT700721UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link StrucDocParagraph }
     * 
     */
    public StrucDocParagraph createStrucDocParagraph() {
        return new StrucDocParagraph();
    }

    /**
     * Create an instance of {@link UVPINT }
     * 
     */
    public UVPINT createUVPINT() {
        return new UVPINT();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06VisionProduct }
     * 
     */
    public COCTMT600000UV06VisionProduct createCOCTMT600000UV06VisionProduct() {
        return new COCTMT600000UV06VisionProduct();
    }

    /**
     * Create an instance of {@link IVLCO }
     * 
     */
    public IVLCO createIVLCO() {
        return new IVLCO();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09SpecimenStub }
     * 
     */
    public COCTMT080000UV09SpecimenStub createCOCTMT080000UV09SpecimenStub() {
        return new COCTMT080000UV09SpecimenStub();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06DirectAuthorityOver2 }
     * 
     */
    public COCTMT510000UV06DirectAuthorityOver2 createCOCTMT510000UV06DirectAuthorityOver2() {
        return new COCTMT510000UV06DirectAuthorityOver2();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06DirectAuthorityOver3 }
     * 
     */
    public COCTMT510000UV06DirectAuthorityOver3 createCOCTMT510000UV06DirectAuthorityOver3() {
        return new COCTMT510000UV06DirectAuthorityOver3();
    }

    /**
     * Create an instance of {@link COCTMT030007UVMember }
     * 
     */
    public COCTMT030007UVMember createCOCTMT030007UVMember() {
        return new COCTMT030007UVMember();
    }

    /**
     * Create an instance of {@link PRPAIN201316UV02MFMIMT700721UV01RegistrationRequest }
     * 
     */
    public PRPAIN201316UV02MFMIMT700721UV01RegistrationRequest createPRPAIN201316UV02MFMIMT700721UV01RegistrationRequest() {
        return new PRPAIN201316UV02MFMIMT700721UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06DirectAuthorityOver4 }
     * 
     */
    public COCTMT510000UV06DirectAuthorityOver4 createCOCTMT510000UV06DirectAuthorityOver4() {
        return new COCTMT510000UV06DirectAuthorityOver4();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01PrimaryPerformer3 }
     * 
     */
    public PRPMMT306110UV01PrimaryPerformer3 createPRPMMT306110UV01PrimaryPerformer3() {
        return new PRPMMT306110UV01PrimaryPerformer3();
    }

    /**
     * Create an instance of {@link DSETMO }
     * 
     */
    public DSETMO createDSETMO() {
        return new DSETMO();
    }

    /**
     * Create an instance of {@link LISTAD }
     * 
     */
    public LISTAD createLISTAD() {
        return new LISTAD();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01DisciplinaryAction }
     * 
     */
    public PRPMMT401010UV01DisciplinaryAction createPRPMMT401010UV01DisciplinaryAction() {
        return new PRPMMT401010UV01DisciplinaryAction();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04Encounter }
     * 
     */
    public COCTMT310000UV04Encounter createCOCTMT310000UV04Encounter() {
        return new COCTMT310000UV04Encounter();
    }

    /**
     * Create an instance of {@link COCTMT710007UV07LocatedEntity }
     * 
     */
    public COCTMT710007UV07LocatedEntity createCOCTMT710007UV07LocatedEntity() {
        return new COCTMT710007UV07LocatedEntity();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Birthplace }
     * 
     */
    public PRPMMT309000UV01Birthplace createPRPMMT309000UV01Birthplace() {
        return new PRPMMT309000UV01Birthplace();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Product2 }
     * 
     */
    public COCTMT600000UV06Product2 createCOCTMT600000UV06Product2() {
        return new COCTMT600000UV06Product2();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01RegistrationRequest }
     * 
     */
    public MFMIMT700711UV01RegistrationRequest createMFMIMT700711UV01RegistrationRequest() {
        return new MFMIMT700711UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01OrganizationID }
     * 
     */
    public PRPMMT406010UV01OrganizationID createPRPMMT406010UV01OrganizationID() {
        return new PRPMMT406010UV01OrganizationID();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01AuthorOrPerformer }
     * 
     */
    public MFMIMT700711UV01AuthorOrPerformer createMFMIMT700711UV01AuthorOrPerformer() {
        return new MFMIMT700711UV01AuthorOrPerformer();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01Role }
     * 
     */
    public MCAIMT900001UV01Role createMCAIMT900001UV01Role() {
        return new MCAIMT900001UV01Role();
    }

    /**
     * Create an instance of {@link DSETPQ }
     * 
     */
    public DSETPQ createDSETPQ() {
        return new DSETPQ();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01Confidence }
     * 
     */
    public PRPMMT306010UV01Confidence createPRPMMT306010UV01Confidence() {
        return new PRPMMT306010UV01Confidence();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Part }
     * 
     */
    public COCTMT510000UV06Part createCOCTMT510000UV06Part() {
        return new COCTMT510000UV06Part();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Warrantor }
     * 
     */
    public COCTMT490000UV04Warrantor createCOCTMT490000UV04Warrantor() {
        return new COCTMT490000UV04Warrantor();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01RoleActivation }
     * 
     */
    public PRPMMT401010UV01RoleActivation createPRPMMT401010UV01RoleActivation() {
        return new PRPMMT401010UV01RoleActivation();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubContent }
     * 
     */
    public COCTMT230100UVSubContent createCOCTMT230100UVSubContent() {
        return new COCTMT230100UVSubContent();
    }

    /**
     * Create an instance of {@link COCTMT230100UVMedicineClass }
     * 
     */
    public COCTMT230100UVMedicineClass createCOCTMT230100UVMedicineClass() {
        return new COCTMT230100UVMedicineClass();
    }

    /**
     * Create an instance of {@link COCTMT530000UVEncounter }
     * 
     */
    public COCTMT530000UVEncounter createCOCTMT530000UVEncounter() {
        return new COCTMT530000UVEncounter();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Component }
     * 
     */
    public COCTMT510000UV06Component createCOCTMT510000UV06Component() {
        return new COCTMT510000UV06Component();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09SpecimenInContainer }
     * 
     */
    public COCTMT080000UV09SpecimenInContainer createCOCTMT080000UV09SpecimenInContainer() {
        return new COCTMT080000UV09SpecimenInContainer();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectName }
     * 
     */
    public PRPAMT201306UV02LivingSubjectName createPRPAMT201306UV02LivingSubjectName() {
        return new PRPAMT201306UV02LivingSubjectName();
    }

    /**
     * Create an instance of {@link COCTMT530000UVMaterial }
     * 
     */
    public COCTMT530000UVMaterial createCOCTMT530000UVMaterial() {
        return new COCTMT530000UVMaterial();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01RoutedDocType }
     * 
     */
    public PRPMMT406010UV01RoutedDocType createPRPMMT406010UV01RoutedDocType() {
        return new PRPMMT406010UV01RoutedDocType();
    }

    /**
     * Create an instance of {@link SLISTREAL }
     * 
     */
    public SLISTREAL createSLISTREAL() {
        return new SLISTREAL();
    }

    /**
     * Create an instance of {@link SLISTINT }
     * 
     */
    public SLISTINT createSLISTINT() {
        return new SLISTINT();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Citizen }
     * 
     */
    public PRPAMT201302UV02Citizen createPRPAMT201302UV02Citizen() {
        return new PRPAMT201302UV02Citizen();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Subject }
     * 
     */
    public COCTMT510000UV06Subject createCOCTMT510000UV06Subject() {
        return new COCTMT510000UV06Subject();
    }

    /**
     * Create an instance of {@link PIVLTS }
     * 
     */
    public PIVLTS createPIVLTS() {
        return new PIVLTS();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01AssignedEntity }
     * 
     */
    public PRPMMT409000UV01AssignedEntity createPRPMMT409000UV01AssignedEntity() {
        return new PRPMMT409000UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01ActDefinitionOrEvent }
     * 
     */
    public PRPMMT303010UV01ActDefinitionOrEvent createPRPMMT303010UV01ActDefinitionOrEvent() {
        return new PRPMMT303010UV01ActDefinitionOrEvent();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Criterion }
     * 
     */
    public COCTMT080000UV09Criterion createCOCTMT080000UV09Criterion() {
        return new COCTMT080000UV09Criterion();
    }

    /**
     * Create an instance of {@link COCTMT040008UVResponsible }
     * 
     */
    public COCTMT040008UVResponsible createCOCTMT040008UVResponsible() {
        return new COCTMT040008UVResponsible();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02PersonalRelationship }
     * 
     */
    public PRPAMT201303UV02PersonalRelationship createPRPAMT201303UV02PersonalRelationship() {
        return new PRPAMT201303UV02PersonalRelationship();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02PatientPatientNonPersonLivingSubject }
     * 
     */
    public PRPAMT201302UV02PatientPatientNonPersonLivingSubject createPRPAMT201302UV02PatientPatientNonPersonLivingSubject() {
        return new PRPAMT201302UV02PatientPatientNonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01RoleOther }
     * 
     */
    public COCTMT090100UV01RoleOther createCOCTMT090100UV01RoleOther() {
        return new COCTMT090100UV01RoleOther();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01DetectedIssueManagement }
     * 
     */
    public MCAIMT900001UV01DetectedIssueManagement createMCAIMT900001UV01DetectedIssueManagement() {
        return new MCAIMT900001UV01DetectedIssueManagement();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04SupplyEvent }
     * 
     */
    public COCTMT300000UV04SupplyEvent createCOCTMT300000UV04SupplyEvent() {
        return new COCTMT300000UV04SupplyEvent();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ServiceRequest }
     * 
     */
    public COCTMT290000UV06ServiceRequest createCOCTMT290000UV06ServiceRequest() {
        return new COCTMT290000UV06ServiceRequest();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Organization }
     * 
     */
    public PRPMMT309000UV01Organization createPRPMMT309000UV01Organization() {
        return new PRPMMT309000UV01Organization();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01ContactParty }
     * 
     */
    public PRPMMT403010UV01ContactParty createPRPMMT403010UV01ContactParty() {
        return new PRPMMT403010UV01ContactParty();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01AssignedEntity }
     * 
     */
    public PRPMMT406110UV01AssignedEntity createPRPMMT406110UV01AssignedEntity() {
        return new PRPMMT406110UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01ProviderName }
     * 
     */
    public PRPMMT306010UV01ProviderName createPRPMMT306010UV01ProviderName() {
        return new PRPMMT306010UV01ProviderName();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01ControlActEvent }
     * 
     */
    public PRPMMT306110UV01ControlActEvent createPRPMMT306110UV01ControlActEvent() {
        return new PRPMMT306110UV01ControlActEvent();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09OtherIDs }
     * 
     */
    public COCTMT080000UV09OtherIDs createCOCTMT080000UV09OtherIDs() {
        return new COCTMT080000UV09OtherIDs();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01PrincipalPerson }
     * 
     */
    public PRPMMT401010UV01PrincipalPerson createPRPMMT401010UV01PrincipalPerson() {
        return new PRPMMT401010UV01PrincipalPerson();
    }

    /**
     * Create an instance of {@link COCTMT530000UVManufacturedProduct }
     * 
     */
    public COCTMT530000UVManufacturedProduct createCOCTMT530000UVManufacturedProduct() {
        return new COCTMT530000UVManufacturedProduct();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02NonPersonLivingSubject }
     * 
     */
    public PRPAMT201301UV02NonPersonLivingSubject createPRPAMT201301UV02NonPersonLivingSubject() {
        return new PRPAMT201301UV02NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Component1 }
     * 
     */
    public COCTMT290000UV06Component1 createCOCTMT290000UV06Component1() {
        return new COCTMT290000UV06Component1();
    }

    /**
     * Create an instance of {@link COCTMT260003UVManufacturedProduct }
     * 
     */
    public COCTMT260003UVManufacturedProduct createCOCTMT260003UVManufacturedProduct() {
        return new COCTMT260003UVManufacturedProduct();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01PriorRegistration }
     * 
     */
    public MFMIMT700701UV01PriorRegistration createMFMIMT700701UV01PriorRegistration() {
        return new MFMIMT700701UV01PriorRegistration();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Component2 }
     * 
     */
    public COCTMT290000UV06Component2 createCOCTMT290000UV06Component2() {
        return new COCTMT290000UV06Component2();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Affiliate }
     * 
     */
    public PRPMMT403010UV01Affiliate createPRPMMT403010UV01Affiliate() {
        return new PRPMMT403010UV01Affiliate();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Subject }
     * 
     */
    public COCTMT290000UV06Subject createCOCTMT290000UV06Subject() {
        return new COCTMT290000UV06Subject();
    }

    /**
     * Create an instance of {@link PRPMIN303011UV01MFMIMT700721UV01RegistrationRequest }
     * 
     */
    public PRPMIN303011UV01MFMIMT700721UV01RegistrationRequest createPRPMIN303011UV01MFMIMT700721UV01RegistrationRequest() {
        return new PRPMIN303011UV01MFMIMT700721UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Substitution }
     * 
     */
    public COCTMT290000UV06Substitution createCOCTMT290000UV06Substitution() {
        return new COCTMT290000UV06Substitution();
    }

    /**
     * Create an instance of {@link PRPAIN201304UV02MFMIMT700701UV01Subject1 }
     * 
     */
    public PRPAIN201304UV02MFMIMT700701UV01Subject1 createPRPAIN201304UV02MFMIMT700701UV01Subject1() {
        return new PRPAIN201304UV02MFMIMT700701UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPMIN301010UV01MFMIMT700721UV01Subject1 }
     * 
     */
    public PRPMIN301010UV01MFMIMT700721UV01Subject1 createPRPMIN301010UV01MFMIMT700721UV01Subject1() {
        return new PRPMIN301010UV01MFMIMT700721UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPMIN301010UV01MFMIMT700721UV01Subject2 }
     * 
     */
    public PRPMIN301010UV01MFMIMT700721UV01Subject2 createPRPMIN301010UV01MFMIMT700721UV01Subject2() {
        return new PRPMIN301010UV01MFMIMT700721UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPAIN201304UV02MFMIMT700701UV01Subject2 }
     * 
     */
    public PRPAIN201304UV02MFMIMT700701UV01Subject2 createPRPAIN201304UV02MFMIMT700701UV01Subject2() {
        return new PRPAIN201304UV02MFMIMT700701UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Receiver }
     * 
     */
    public PRPMMT301010UV01Receiver createPRPMMT301010UV01Receiver() {
        return new PRPMMT301010UV01Receiver();
    }

    /**
     * Create an instance of {@link COCTMT210000UV02ReflexPermission }
     * 
     */
    public COCTMT210000UV02ReflexPermission createCOCTMT210000UV02ReflexPermission() {
        return new COCTMT210000UV02ReflexPermission();
    }

    /**
     * Create an instance of {@link COCTMT260003UVSubject2 }
     * 
     */
    public COCTMT260003UVSubject2 createCOCTMT260003UVSubject2() {
        return new COCTMT260003UVSubject2();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubIngredient }
     * 
     */
    public COCTMT230100UVSubIngredient createCOCTMT230100UVSubIngredient() {
        return new COCTMT230100UVSubIngredient();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01ControlActEvent }
     * 
     */
    public PRPMMT409000UV01ControlActEvent createPRPMMT409000UV01ControlActEvent() {
        return new PRPMMT409000UV01ControlActEvent();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Natural }
     * 
     */
    public COCTMT080000UV09Natural createCOCTMT080000UV09Natural() {
        return new COCTMT080000UV09Natural();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06ResponsibleParty }
     * 
     */
    public COCTMT510000UV06ResponsibleParty createCOCTMT510000UV06ResponsibleParty() {
        return new COCTMT510000UV06ResponsibleParty();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Group }
     * 
     */
    public PRPMMT403010UV01Group createPRPMMT403010UV01Group() {
        return new PRPMMT403010UV01Group();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06SupplyObservationEvent }
     * 
     */
    public COCTMT600000UV06SupplyObservationEvent createCOCTMT600000UV06SupplyObservationEvent() {
        return new COCTMT600000UV06SupplyObservationEvent();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01TerritorialAuthority }
     * 
     */
    public PRPMMT409000UV01TerritorialAuthority createPRPMMT409000UV01TerritorialAuthority() {
        return new PRPMMT409000UV01TerritorialAuthority();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01Audit }
     * 
     */
    public PRPMMT406010UV01Audit createPRPMMT406010UV01Audit() {
        return new PRPMMT406010UV01Audit();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Transcriber }
     * 
     */
    public COCTMT080000UV09Transcriber createCOCTMT080000UV09Transcriber() {
        return new COCTMT080000UV09Transcriber();
    }

    /**
     * Create an instance of {@link COCTMT710000UV07LocatedEntityPartOf }
     * 
     */
    public COCTMT710000UV07LocatedEntityPartOf createCOCTMT710000UV07LocatedEntityPartOf() {
        return new COCTMT710000UV07LocatedEntityPartOf();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Note }
     * 
     */
    public PRPMMT306110UV01Note createPRPMMT306110UV01Note() {
        return new PRPMMT306110UV01Note();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09ObservationEvent }
     * 
     */
    public COCTMT080000UV09ObservationEvent createCOCTMT080000UV09ObservationEvent() {
        return new COCTMT080000UV09ObservationEvent();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Custodian }
     * 
     */
    public PRPMMT401010UV01Custodian createPRPMMT401010UV01Custodian() {
        return new PRPMMT401010UV01Custodian();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01RoleActivation }
     * 
     */
    public PRPMMT403010UV01RoleActivation createPRPMMT403010UV01RoleActivation() {
        return new PRPMMT403010UV01RoleActivation();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02LanguageCommunication }
     * 
     */
    public PRPAMT201310UV02LanguageCommunication createPRPAMT201310UV02LanguageCommunication() {
        return new PRPAMT201310UV02LanguageCommunication();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01InformDefinition }
     * 
     */
    public PRPMMT401010UV01InformDefinition createPRPMMT401010UV01InformDefinition() {
        return new PRPMMT401010UV01InformDefinition();
    }

    /**
     * Create an instance of {@link IVLQTY }
     * 
     */
    public IVLQTY createIVLQTY() {
        return new IVLQTY();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Part }
     * 
     */
    public PRPMMT406110UV01Part createPRPMMT406110UV01Part() {
        return new PRPMMT406110UV01Part();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01ActDefinitionOrEvent }
     * 
     */
    public PRPMMT309000UV01ActDefinitionOrEvent createPRPMMT309000UV01ActDefinitionOrEvent() {
        return new PRPMMT309000UV01ActDefinitionOrEvent();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06PresentingIndication }
     * 
     */
    public COCTMT290000UV06PresentingIndication createCOCTMT290000UV06PresentingIndication() {
        return new COCTMT290000UV06PresentingIndication();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Birthplace }
     * 
     */
    public PRPMMT306110UV01Birthplace createPRPMMT306110UV01Birthplace() {
        return new PRPMMT306110UV01Birthplace();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05Component1 }
     * 
     */
    public COCTMT960000UV05Component1 createCOCTMT960000UV05Component1() {
        return new COCTMT960000UV05Component1();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05Component2 }
     * 
     */
    public COCTMT960000UV05Component2 createCOCTMT960000UV05Component2() {
        return new COCTMT960000UV05Component2();
    }

    /**
     * Create an instance of {@link QSCTS }
     * 
     */
    public QSCTS createQSCTS() {
        return new QSCTS();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Beneficiary }
     * 
     */
    public COCTMT510000UV06Beneficiary createCOCTMT510000UV06Beneficiary() {
        return new COCTMT510000UV06Beneficiary();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01Reason }
     * 
     */
    public MFMIMT700721UV01Reason createMFMIMT700721UV01Reason() {
        return new MFMIMT700721UV01Reason();
    }

    /**
     * Create an instance of {@link TEL }
     * 
     */
    public TEL createTEL() {
        return new TEL();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Origin }
     * 
     */
    public COCTMT600000UV06Origin createCOCTMT600000UV06Origin() {
        return new COCTMT600000UV06Origin();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01HealthCareProvider }
     * 
     */
    public PRPMMT309000UV01HealthCareProvider createPRPMMT309000UV01HealthCareProvider() {
        return new PRPMMT309000UV01HealthCareProvider();
    }

    /**
     * Create an instance of {@link COCTMT230100UVManufacturedProduct }
     * 
     */
    public COCTMT230100UVManufacturedProduct createCOCTMT230100UVManufacturedProduct() {
        return new COCTMT230100UVManufacturedProduct();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Subject7 }
     * 
     */
    public PRPMMT403010UV01Subject7 createPRPMMT403010UV01Subject7() {
        return new PRPMMT403010UV01Subject7();
    }

    /**
     * Create an instance of {@link QUQIMT021001UV01InformationRecipient }
     * 
     */
    public QUQIMT021001UV01InformationRecipient createQUQIMT021001UV01InformationRecipient() {
        return new QUQIMT021001UV01InformationRecipient();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Subject8 }
     * 
     */
    public PRPMMT403010UV01Subject8 createPRPMMT403010UV01Subject8() {
        return new PRPMMT403010UV01Subject8();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Subject9 }
     * 
     */
    public PRPMMT403010UV01Subject9 createPRPMMT403010UV01Subject9() {
        return new PRPMMT403010UV01Subject9();
    }

    /**
     * Create an instance of {@link DSETBL }
     * 
     */
    public DSETBL createDSETBL() {
        return new DSETBL();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01Entity }
     * 
     */
    public COCTMT060000UV01Entity createCOCTMT060000UV01Entity() {
        return new COCTMT060000UV01Entity();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Part }
     * 
     */
    public PRPMMT303010UV01Part createPRPMMT303010UV01Part() {
        return new PRPMMT303010UV01Part();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Subject2 }
     * 
     */
    public PRPMMT403010UV01Subject2 createPRPMMT403010UV01Subject2() {
        return new PRPMMT403010UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Subject3 }
     * 
     */
    public PRPMMT403010UV01Subject3 createPRPMMT403010UV01Subject3() {
        return new PRPMMT403010UV01Subject3();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Subject4 }
     * 
     */
    public PRPMMT403010UV01Subject4 createPRPMMT403010UV01Subject4() {
        return new PRPMMT403010UV01Subject4();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Subject5 }
     * 
     */
    public PRPMMT403010UV01Subject5 createPRPMMT403010UV01Subject5() {
        return new PRPMMT403010UV01Subject5();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Subject6 }
     * 
     */
    public PRPMMT403010UV01Subject6 createPRPMMT403010UV01Subject6() {
        return new PRPMMT403010UV01Subject6();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09ManufacturedMaterial }
     * 
     */
    public COCTMT080000UV09ManufacturedMaterial createCOCTMT080000UV09ManufacturedMaterial() {
        return new COCTMT080000UV09ManufacturedMaterial();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01Subject4 }
     * 
     */
    public MFMIMT700721UV01Subject4 createMFMIMT700721UV01Subject4() {
        return new MFMIMT700721UV01Subject4();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01Employee }
     * 
     */
    public COCTMT050000UV01Employee createCOCTMT050000UV01Employee() {
        return new COCTMT050000UV01Employee();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01OrganizationAddress }
     * 
     */
    public PRPMMT406010UV01OrganizationAddress createPRPMMT406010UV01OrganizationAddress() {
        return new PRPMMT406010UV01OrganizationAddress();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01Subject3 }
     * 
     */
    public MFMIMT700721UV01Subject3 createMFMIMT700721UV01Subject3() {
        return new MFMIMT700721UV01Subject3();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01SourceOf }
     * 
     */
    public MCAIMT900001UV01SourceOf createMCAIMT900001UV01SourceOf() {
        return new MCAIMT900001UV01SourceOf();
    }

    /**
     * Create an instance of {@link StrucDocTableItem }
     * 
     */
    public StrucDocTableItem createStrucDocTableItem() {
        return new StrucDocTableItem();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06BillableModifier }
     * 
     */
    public COCTMT290000UV06BillableModifier createCOCTMT290000UV06BillableModifier() {
        return new COCTMT290000UV06BillableModifier();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Underwriter }
     * 
     */
    public COCTMT510000UV06Underwriter createCOCTMT510000UV06Underwriter() {
        return new COCTMT510000UV06Underwriter();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01InformRequest }
     * 
     */
    public PRPMMT303010UV01InformRequest createPRPMMT303010UV01InformRequest() {
        return new PRPMMT303010UV01InformRequest();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01AssignedEntity2 }
     * 
     */
    public PRPMMT301010UV01AssignedEntity2 createPRPMMT301010UV01AssignedEntity2() {
        return new PRPMMT301010UV01AssignedEntity2();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06PertinentInformation1 }
     * 
     */
    public COCTMT600000UV06PertinentInformation1 createCOCTMT600000UV06PertinentInformation1() {
        return new COCTMT600000UV06PertinentInformation1();
    }

    /**
     * Create an instance of {@link DSETAD }
     * 
     */
    public DSETAD createDSETAD() {
        return new DSETAD();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06PertinentInformation2 }
     * 
     */
    public COCTMT600000UV06PertinentInformation2 createCOCTMT600000UV06PertinentInformation2() {
        return new COCTMT600000UV06PertinentInformation2();
    }

    /**
     * Create an instance of {@link COCTMT590000UVAuthor }
     * 
     */
    public COCTMT590000UVAuthor createCOCTMT590000UVAuthor() {
        return new COCTMT590000UVAuthor();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01OtherIDs }
     * 
     */
    public COCTMT050000UV01OtherIDs createCOCTMT050000UV01OtherIDs() {
        return new COCTMT050000UV01OtherIDs();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Performer }
     * 
     */
    public COCTMT080000UV09Performer createCOCTMT080000UV09Performer() {
        return new COCTMT080000UV09Performer();
    }

    /**
     * Create an instance of {@link StrucDocContent }
     * 
     */
    public StrucDocContent createStrucDocContent() {
        return new StrucDocContent();
    }

    /**
     * Create an instance of {@link PRPMMT306810UV01ProviderID }
     * 
     */
    public PRPMMT306810UV01ProviderID createPRPMMT306810UV01ProviderID() {
        return new PRPMMT306810UV01ProviderID();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01CoveredParty }
     * 
     */
    public COCTMT050000UV01CoveredParty createCOCTMT050000UV01CoveredParty() {
        return new COCTMT050000UV01CoveredParty();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04GuarantorRole }
     * 
     */
    public COCTMT670000UV04GuarantorRole createCOCTMT670000UV04GuarantorRole() {
        return new COCTMT670000UV04GuarantorRole();
    }

    /**
     * Create an instance of {@link PRPAIN201315UV02MFMIMT700701UV01RegistrationEvent }
     * 
     */
    public PRPAIN201315UV02MFMIMT700701UV01RegistrationEvent createPRPAIN201315UV02MFMIMT700701UV01RegistrationEvent() {
        return new PRPAIN201315UV02MFMIMT700701UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link IVLMO }
     * 
     */
    public IVLMO createIVLMO() {
        return new IVLMO();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06InFulfillmentOf }
     * 
     */
    public COCTMT290000UV06InFulfillmentOf createCOCTMT290000UV06InFulfillmentOf() {
        return new COCTMT290000UV06InFulfillmentOf();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06EligibilityStatusObservation }
     * 
     */
    public COCTMT510000UV06EligibilityStatusObservation createCOCTMT510000UV06EligibilityStatusObservation() {
        return new COCTMT510000UV06EligibilityStatusObservation();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Organization }
     * 
     */
    public PRPMMT303010UV01Organization createPRPMMT303010UV01Organization() {
        return new PRPMMT303010UV01Organization();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04InFulfillmentOf }
     * 
     */
    public COCTMT310000UV04InFulfillmentOf createCOCTMT310000UV04InFulfillmentOf() {
        return new COCTMT310000UV04InFulfillmentOf();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Jurisdiction }
     * 
     */
    public PRPMMT401010UV01Jurisdiction createPRPMMT401010UV01Jurisdiction() {
        return new PRPMMT401010UV01Jurisdiction();
    }

    /**
     * Create an instance of {@link COCTMT090003UV01Organization }
     * 
     */
    public COCTMT090003UV01Organization createCOCTMT090003UV01Organization() {
        return new COCTMT090003UV01Organization();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04GuarantorPerson }
     * 
     */
    public COCTMT670000UV04GuarantorPerson createCOCTMT670000UV04GuarantorPerson() {
        return new COCTMT670000UV04GuarantorPerson();
    }

    /**
     * Create an instance of {@link DSETCO }
     * 
     */
    public DSETCO createDSETCO() {
        return new DSETCO();
    }

    /**
     * Create an instance of {@link NPPDMO }
     * 
     */
    public NPPDMO createNPPDMO() {
        return new NPPDMO();
    }

    /**
     * Create an instance of {@link DSETCD }
     * 
     */
    public DSETCD createDSETCD() {
        return new DSETCD();
    }

    /**
     * Create an instance of {@link PRPAIN201308UV02MFMIMT700711UV01RegistrationEvent }
     * 
     */
    public PRPAIN201308UV02MFMIMT700711UV01RegistrationEvent createPRPAIN201308UV02MFMIMT700711UV01RegistrationEvent() {
        return new PRPAIN201308UV02MFMIMT700711UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link COCTMT530000UVObservation }
     * 
     */
    public COCTMT530000UVObservation createCOCTMT530000UVObservation() {
        return new COCTMT530000UVObservation();
    }

    /**
     * Create an instance of {@link IVLTS }
     * 
     */
    public IVLTS createIVLTS() {
        return new IVLTS();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04PersonalRelationship }
     * 
     */
    public COCTMT670000UV04PersonalRelationship createCOCTMT670000UV04PersonalRelationship() {
        return new COCTMT670000UV04PersonalRelationship();
    }

    /**
     * Create an instance of {@link COCTMT260003UVManagement }
     * 
     */
    public COCTMT260003UVManagement createCOCTMT260003UVManagement() {
        return new COCTMT260003UVManagement();
    }

    /**
     * Create an instance of {@link NPPDPQ }
     * 
     */
    public NPPDPQ createNPPDPQ() {
        return new NPPDPQ();
    }

    /**
     * Create an instance of {@link COCTMT710007UV07Place }
     * 
     */
    public COCTMT710007UV07Place createCOCTMT710007UV07Place() {
        return new COCTMT710007UV07Place();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01RoleOther }
     * 
     */
    public COCTMT090300UV01RoleOther createCOCTMT090300UV01RoleOther() {
        return new COCTMT090300UV01RoleOther();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01PrimaryPerformer3 }
     * 
     */
    public PRPMMT403010UV01PrimaryPerformer3 createPRPMMT403010UV01PrimaryPerformer3() {
        return new PRPMMT403010UV01PrimaryPerformer3();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01InformationRecipient }
     * 
     */
    public MFMIMT700721UV01InformationRecipient createMFMIMT700721UV01InformationRecipient() {
        return new MFMIMT700721UV01InformationRecipient();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSourceOf1 }
     * 
     */
    public COCTMT530000UVSourceOf1 createCOCTMT530000UVSourceOf1() {
        return new COCTMT530000UVSourceOf1();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSourceOf2 }
     * 
     */
    public COCTMT530000UVSourceOf2 createCOCTMT530000UVSourceOf2() {
        return new COCTMT530000UVSourceOf2();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSourceOf3 }
     * 
     */
    public COCTMT530000UVSourceOf3 createCOCTMT530000UVSourceOf3() {
        return new COCTMT530000UVSourceOf3();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject16 }
     * 
     */
    public COCTMT230100UVSubject16 createCOCTMT230100UVSubject16() {
        return new COCTMT230100UVSubject16();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject15 }
     * 
     */
    public COCTMT230100UVSubject15 createCOCTMT230100UVSubject15() {
        return new COCTMT230100UVSubject15();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject14 }
     * 
     */
    public COCTMT230100UVSubject14 createCOCTMT230100UVSubject14() {
        return new COCTMT230100UVSubject14();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject11 }
     * 
     */
    public COCTMT230100UVSubject11 createCOCTMT230100UVSubject11() {
        return new COCTMT230100UVSubject11();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01LanguageCommunication }
     * 
     */
    public PRPMMT401010UV01LanguageCommunication createPRPMMT401010UV01LanguageCommunication() {
        return new PRPMMT401010UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01EntityRsp }
     * 
     */
    public MCCIMT000200UV01EntityRsp createMCCIMT000200UV01EntityRsp() {
        return new MCCIMT000200UV01EntityRsp();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04WarrantorOrganization }
     * 
     */
    public COCTMT490000UV04WarrantorOrganization createCOCTMT490000UV04WarrantorOrganization() {
        return new COCTMT490000UV04WarrantorOrganization();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01Organization }
     * 
     */
    public PRPMMT409000UV01Organization createPRPMMT409000UV01Organization() {
        return new PRPMMT409000UV01Organization();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01InformRequest }
     * 
     */
    public PRPMMT406110UV01InformRequest createPRPMMT406110UV01InformRequest() {
        return new PRPMMT406110UV01InformRequest();
    }

    /**
     * Create an instance of {@link COCTMT230100UVMedicine }
     * 
     */
    public COCTMT230100UVMedicine createCOCTMT230100UVMedicine() {
        return new COCTMT230100UVMedicine();
    }

    /**
     * Create an instance of {@link NPPDSC }
     * 
     */
    public NPPDSC createNPPDSC() {
        return new NPPDSC();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01Confidence }
     * 
     */
    public PRPMMT406010UV01Confidence createPRPMMT406010UV01Confidence() {
        return new PRPMMT406010UV01Confidence();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject25 }
     * 
     */
    public COCTMT230100UVSubject25 createCOCTMT230100UVSubject25() {
        return new COCTMT230100UVSubject25();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject22 }
     * 
     */
    public COCTMT230100UVSubject22 createCOCTMT230100UVSubject22() {
        return new COCTMT230100UVSubject22();
    }

    /**
     * Create an instance of {@link PRPMMT306810UV01ProviderAddress }
     * 
     */
    public PRPMMT306810UV01ProviderAddress createPRPMMT306810UV01ProviderAddress() {
        return new PRPMMT306810UV01ProviderAddress();
    }

    /**
     * Create an instance of {@link COCTMT230100UVManufacturer }
     * 
     */
    public COCTMT230100UVManufacturer createCOCTMT230100UVManufacturer() {
        return new COCTMT230100UVManufacturer();
    }

    /**
     * Create an instance of {@link IVLPQ }
     * 
     */
    public IVLPQ createIVLPQ() {
        return new IVLPQ();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01DataEnterer }
     * 
     */
    public MFMIMT700711UV01DataEnterer createMFMIMT700711UV01DataEnterer() {
        return new MFMIMT700711UV01DataEnterer();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04Holder }
     * 
     */
    public COCTMT670000UV04Holder createCOCTMT670000UV04Holder() {
        return new COCTMT670000UV04Holder();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02QueryByParameter }
     * 
     */
    public PRPAMT201306UV02QueryByParameter createPRPAMT201306UV02QueryByParameter() {
        return new PRPAMT201306UV02QueryByParameter();
    }

    /**
     * Create an instance of {@link COCTMT810000UVPrimaryPerformer }
     * 
     */
    public COCTMT810000UVPrimaryPerformer createCOCTMT810000UVPrimaryPerformer() {
        return new COCTMT810000UVPrimaryPerformer();
    }

    /**
     * Create an instance of {@link StrucDocBr }
     * 
     */
    public StrucDocBr createStrucDocBr() {
        return new StrucDocBr();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06ServiceDefinition }
     * 
     */
    public COCTMT510000UV06ServiceDefinition createCOCTMT510000UV06ServiceDefinition() {
        return new COCTMT510000UV06ServiceDefinition();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Reference }
     * 
     */
    public COCTMT510000UV06Reference createCOCTMT510000UV06Reference() {
        return new COCTMT510000UV06Reference();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01Agent }
     * 
     */
    public MCCIMT000100UV01Agent createMCCIMT000100UV01Agent() {
        return new MCCIMT000100UV01Agent();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01DataEnterer }
     * 
     */
    public PRPMMT301010UV01DataEnterer createPRPMMT301010UV01DataEnterer() {
        return new PRPMMT301010UV01DataEnterer();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Group }
     * 
     */
    public PRPAMT201310UV02Group createPRPAMT201310UV02Group() {
        return new PRPAMT201310UV02Group();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Organization }
     * 
     */
    public PRPMMT403010UV01Organization createPRPMMT403010UV01Organization() {
        return new PRPMMT403010UV01Organization();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01RoleActivation }
     * 
     */
    public PRPMMT309000UV01RoleActivation createPRPMMT309000UV01RoleActivation() {
        return new PRPMMT309000UV01RoleActivation();
    }

    /**
     * Create an instance of {@link NPPDCO }
     * 
     */
    public NPPDCO createNPPDCO() {
        return new NPPDCO();
    }

    /**
     * Create an instance of {@link COCTMT230100UVRelatedManufacturer }
     * 
     */
    public COCTMT230100UVRelatedManufacturer createCOCTMT230100UVRelatedManufacturer() {
        return new COCTMT230100UVRelatedManufacturer();
    }

    /**
     * Create an instance of {@link NPPDCS }
     * 
     */
    public NPPDCS createNPPDCS() {
        return new NPPDCS();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Citizen }
     * 
     */
    public PRPAMT201304UV02Citizen createPRPAMT201304UV02Citizen() {
        return new PRPAMT201304UV02Citizen();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02MinimumDegreeMatch }
     * 
     */
    public PRPAMT201306UV02MinimumDegreeMatch createPRPAMT201306UV02MinimumDegreeMatch() {
        return new PRPAMT201306UV02MinimumDegreeMatch();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01RelatedTo }
     * 
     */
    public PRPMMT309000UV01RelatedTo createPRPMMT309000UV01RelatedTo() {
        return new PRPMMT309000UV01RelatedTo();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01AdministrativeObservation }
     * 
     */
    public COCTMT050000UV01AdministrativeObservation createCOCTMT050000UV01AdministrativeObservation() {
        return new COCTMT050000UV01AdministrativeObservation();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05PositionCoordinate }
     * 
     */
    public COCTMT960000UV05PositionCoordinate createCOCTMT960000UV05PositionCoordinate() {
        return new COCTMT960000UV05PositionCoordinate();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01SdlcAddress }
     * 
     */
    public PRPMMT306010UV01SdlcAddress createPRPMMT306010UV01SdlcAddress() {
        return new PRPMMT306010UV01SdlcAddress();
    }

    /**
     * Create an instance of {@link QSUTS }
     * 
     */
    public QSUTS createQSUTS() {
        return new QSUTS();
    }

    /**
     * Create an instance of {@link PRPMMT306910UV01Organization }
     * 
     */
    public PRPMMT306910UV01Organization createPRPMMT306910UV01Organization() {
        return new PRPMMT306910UV01Organization();
    }

    /**
     * Create an instance of {@link NPPDCD }
     * 
     */
    public NPPDCD createNPPDCD() {
        return new NPPDCD();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06PolicyOrProgram }
     * 
     */
    public COCTMT510000UV06PolicyOrProgram createCOCTMT510000UV06PolicyOrProgram() {
        return new COCTMT510000UV06PolicyOrProgram();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject3 }
     * 
     */
    public COCTMT230100UVSubject3 createCOCTMT230100UVSubject3() {
        return new COCTMT230100UVSubject3();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject2 }
     * 
     */
    public COCTMT230100UVSubject2 createCOCTMT230100UVSubject2() {
        return new COCTMT230100UVSubject2();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject4 }
     * 
     */
    public COCTMT230100UVSubject4 createCOCTMT230100UVSubject4() {
        return new COCTMT230100UVSubject4();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject7 }
     * 
     */
    public COCTMT230100UVSubject7 createCOCTMT230100UVSubject7() {
        return new COCTMT230100UVSubject7();
    }

    /**
     * Create an instance of {@link DSETTEL }
     * 
     */
    public DSETTEL createDSETTEL() {
        return new DSETTEL();
    }

    /**
     * Create an instance of {@link HISTREAL }
     * 
     */
    public HISTREAL createHISTREAL() {
        return new HISTREAL();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01QualifiedEntity }
     * 
     */
    public PRPMMT301010UV01QualifiedEntity createPRPMMT301010UV01QualifiedEntity() {
        return new PRPMMT301010UV01QualifiedEntity();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject1 }
     * 
     */
    public COCTMT230100UVSubject1 createCOCTMT230100UVSubject1() {
        return new COCTMT230100UVSubject1();
    }

    /**
     * Create an instance of {@link COCTMT210000UV02AutoRepeatPermission }
     * 
     */
    public COCTMT210000UV02AutoRepeatPermission createCOCTMT210000UV02AutoRepeatPermission() {
        return new COCTMT210000UV02AutoRepeatPermission();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Subject2 }
     * 
     */
    public PRPAMT201302UV02Subject2 createPRPAMT201302UV02Subject2() {
        return new PRPAMT201302UV02Subject2();
    }

    /**
     * Create an instance of {@link COCTMT530000UVAuthor }
     * 
     */
    public COCTMT530000UVAuthor createCOCTMT530000UVAuthor() {
        return new COCTMT530000UVAuthor();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Subject3 }
     * 
     */
    public PRPAMT201302UV02Subject3 createPRPAMT201302UV02Subject3() {
        return new PRPAMT201302UV02Subject3();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Subject4 }
     * 
     */
    public PRPAMT201302UV02Subject4 createPRPAMT201302UV02Subject4() {
        return new PRPAMT201302UV02Subject4();
    }

    /**
     * Create an instance of {@link COCTMT030203UV07Person }
     * 
     */
    public COCTMT030203UV07Person createCOCTMT030203UV07Person() {
        return new COCTMT030203UV07Person();
    }

    /**
     * Create an instance of {@link COCTMT530000UVReferenceRange }
     * 
     */
    public COCTMT530000UVReferenceRange createCOCTMT530000UVReferenceRange() {
        return new COCTMT530000UVReferenceRange();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09AuthorOrPerformer }
     * 
     */
    public COCTMT080000UV09AuthorOrPerformer createCOCTMT080000UV09AuthorOrPerformer() {
        return new COCTMT080000UV09AuthorOrPerformer();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04GuarantorLanguage }
     * 
     */
    public COCTMT670000UV04GuarantorLanguage createCOCTMT670000UV04GuarantorLanguage() {
        return new COCTMT670000UV04GuarantorLanguage();
    }

    /**
     * Create an instance of {@link NPPDEN }
     * 
     */
    public NPPDEN createNPPDEN() {
        return new NPPDEN();
    }

    /**
     * Create an instance of {@link COCTMT030007UVNonPersonLivingSubject }
     * 
     */
    public COCTMT030007UVNonPersonLivingSubject createCOCTMT030007UVNonPersonLivingSubject() {
        return new COCTMT030007UVNonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link COCTMT530000UVRole }
     * 
     */
    public COCTMT530000UVRole createCOCTMT530000UVRole() {
        return new COCTMT530000UVRole();
    }

    /**
     * Create an instance of {@link PRPMIN303010UV01MFMIMT700721UV01Subject2 }
     * 
     */
    public PRPMIN303010UV01MFMIMT700721UV01Subject2 createPRPMIN303010UV01MFMIMT700721UV01Subject2() {
        return new PRPMIN303010UV01MFMIMT700721UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01AssignedEntity2 }
     * 
     */
    public PRPMMT406110UV01AssignedEntity2 createPRPMMT406110UV01AssignedEntity2() {
        return new PRPMMT406110UV01AssignedEntity2();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01ResponseObject }
     * 
     */
    public PRPMMT306010UV01ResponseObject createPRPMMT306010UV01ResponseObject() {
        return new PRPMMT306010UV01ResponseObject();
    }

    /**
     * Create an instance of {@link NPPDED }
     * 
     */
    public NPPDED createNPPDED() {
        return new NPPDED();
    }

    /**
     * Create an instance of {@link PRPMIN303010UV01MFMIMT700721UV01Subject1 }
     * 
     */
    public PRPMIN303010UV01MFMIMT700721UV01Subject1 createPRPMIN303010UV01MFMIMT700721UV01Subject1() {
        return new PRPMIN303010UV01MFMIMT700721UV01Subject1();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04SubstanceAdministrationOrder }
     * 
     */
    public COCTMT300000UV04SubstanceAdministrationOrder createCOCTMT300000UV04SubstanceAdministrationOrder() {
        return new COCTMT300000UV04SubstanceAdministrationOrder();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSubject1 }
     * 
     */
    public COCTMT530000UVSubject1 createCOCTMT530000UVSubject1() {
        return new COCTMT530000UVSubject1();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Part }
     * 
     */
    public PRPMMT401010UV01Part createPRPMMT401010UV01Part() {
        return new PRPMMT401010UV01Part();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSubject2 }
     * 
     */
    public COCTMT530000UVSubject2 createCOCTMT530000UVSubject2() {
        return new COCTMT530000UVSubject2();
    }

    /**
     * Create an instance of {@link PRPMIN401031UV01MFMIMT700721UV01RegistrationRequest }
     * 
     */
    public PRPMIN401031UV01MFMIMT700721UV01RegistrationRequest createPRPMIN401031UV01MFMIMT700721UV01RegistrationRequest() {
        return new PRPMIN401031UV01MFMIMT700721UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Member }
     * 
     */
    public PRPAMT201303UV02Member createPRPAMT201303UV02Member() {
        return new PRPAMT201303UV02Member();
    }

    /**
     * Create an instance of {@link COCTMT530000UVConsumable }
     * 
     */
    public COCTMT530000UVConsumable createCOCTMT530000UVConsumable() {
        return new COCTMT530000UVConsumable();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01SequelTo }
     * 
     */
    public PRPMMT406110UV01SequelTo createPRPMMT406110UV01SequelTo() {
        return new PRPMMT406110UV01SequelTo();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Subject3 }
     * 
     */
    public PRPAMT201301UV02Subject3 createPRPAMT201301UV02Subject3() {
        return new PRPAMT201301UV02Subject3();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Subject4 }
     * 
     */
    public PRPAMT201301UV02Subject4 createPRPAMT201301UV02Subject4() {
        return new PRPAMT201301UV02Subject4();
    }

    /**
     * Create an instance of {@link NPPDREAL }
     * 
     */
    public NPPDREAL createNPPDREAL() {
        return new NPPDREAL();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Subject2 }
     * 
     */
    public PRPAMT201301UV02Subject2 createPRPAMT201301UV02Subject2() {
        return new PRPAMT201301UV02Subject2();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Subject }
     * 
     */
    public PRPAMT201310UV02Subject createPRPAMT201310UV02Subject() {
        return new PRPAMT201310UV02Subject();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01RoleEffectiveDate }
     * 
     */
    public PRPMMT306010UV01RoleEffectiveDate createPRPMMT306010UV01RoleEffectiveDate() {
        return new PRPMMT306010UV01RoleEffectiveDate();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Overseer }
     * 
     */
    public COCTMT080000UV09Overseer createCOCTMT080000UV09Overseer() {
        return new COCTMT080000UV09Overseer();
    }

    /**
     * Create an instance of {@link COCTMT430000UV09LabTestKit }
     * 
     */
    public COCTMT430000UV09LabTestKit createCOCTMT430000UV09LabTestKit() {
        return new COCTMT430000UV09LabTestKit();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02PatientAddress }
     * 
     */
    public PRPAMT201306UV02PatientAddress createPRPAMT201306UV02PatientAddress() {
        return new PRPAMT201306UV02PatientAddress();
    }

    /**
     * Create an instance of {@link SLISTTS }
     * 
     */
    public SLISTTS createSLISTTS() {
        return new SLISTTS();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01LicensedEntity }
     * 
     */
    public COCTMT090100UV01LicensedEntity createCOCTMT090100UV01LicensedEntity() {
        return new COCTMT090100UV01LicensedEntity();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04InFulfillmentOf }
     * 
     */
    public COCTMT300000UV04InFulfillmentOf createCOCTMT300000UV04InFulfillmentOf() {
        return new COCTMT300000UV04InFulfillmentOf();
    }

    /**
     * Create an instance of {@link DSETEN }
     * 
     */
    public DSETEN createDSETEN() {
        return new DSETEN();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06ManufacturedProduct }
     * 
     */
    public COCTMT600000UV06ManufacturedProduct createCOCTMT600000UV06ManufacturedProduct() {
        return new COCTMT600000UV06ManufacturedProduct();
    }

    /**
     * Create an instance of {@link COCTMT820000UVRoleOther }
     * 
     */
    public COCTMT820000UVRoleOther createCOCTMT820000UVRoleOther() {
        return new COCTMT820000UVRoleOther();
    }

    /**
     * Create an instance of {@link COCTMT260003UVOtherMedication }
     * 
     */
    public COCTMT260003UVOtherMedication createCOCTMT260003UVOtherMedication() {
        return new COCTMT260003UVOtherMedication();
    }

    /**
     * Create an instance of {@link COCTMT530000UVProduct1 }
     * 
     */
    public COCTMT530000UVProduct1 createCOCTMT530000UVProduct1() {
        return new COCTMT530000UVProduct1();
    }

    /**
     * Create an instance of {@link COCTMT530000UVProduct2 }
     * 
     */
    public COCTMT530000UVProduct2 createCOCTMT530000UVProduct2() {
        return new COCTMT530000UVProduct2();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06HealthCareProvider }
     * 
     */
    public COCTMT600000UV06HealthCareProvider createCOCTMT600000UV06HealthCareProvider() {
        return new COCTMT600000UV06HealthCareProvider();
    }

    /**
     * Create an instance of {@link QSUPQ }
     * 
     */
    public QSUPQ createQSUPQ() {
        return new QSUPQ();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01AssignedEntity }
     * 
     */
    public PRPMMT401010UV01AssignedEntity createPRPMMT401010UV01AssignedEntity() {
        return new PRPMMT401010UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Person }
     * 
     */
    public PRPAMT201301UV02Person createPRPAMT201301UV02Person() {
        return new PRPAMT201301UV02Person();
    }

    /**
     * Create an instance of {@link COCTMT530000UVAct }
     * 
     */
    public COCTMT530000UVAct createCOCTMT530000UVAct() {
        return new COCTMT530000UVAct();
    }

    /**
     * Create an instance of {@link COCTMT030007UVStudent }
     * 
     */
    public COCTMT030007UVStudent createCOCTMT030007UVStudent() {
        return new COCTMT030007UVStudent();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09DataEnterer }
     * 
     */
    public COCTMT080000UV09DataEnterer createCOCTMT080000UV09DataEnterer() {
        return new COCTMT080000UV09DataEnterer();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Nation }
     * 
     */
    public PRPAMT201301UV02Nation createPRPAMT201301UV02Nation() {
        return new PRPAMT201301UV02Nation();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04Performer }
     * 
     */
    public COCTMT740000UV04Performer createCOCTMT740000UV04Performer() {
        return new COCTMT740000UV04Performer();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01PriorRegisteredAct }
     * 
     */
    public MFMIMT700701UV01PriorRegisteredAct createMFMIMT700701UV01PriorRegisteredAct() {
        return new MFMIMT700701UV01PriorRegisteredAct();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01Escort }
     * 
     */
    public COCTMT060000UV01Escort createCOCTMT060000UV01Escort() {
        return new COCTMT060000UV01Escort();
    }

    /**
     * Create an instance of {@link COCTMT230100UVCharacteristic }
     * 
     */
    public COCTMT230100UVCharacteristic createCOCTMT230100UVCharacteristic() {
        return new COCTMT230100UVCharacteristic();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01AuthorOrPerformer }
     * 
     */
    public MFMIMT700721UV01AuthorOrPerformer createMFMIMT700721UV01AuthorOrPerformer() {
        return new MFMIMT700721UV01AuthorOrPerformer();
    }

    /**
     * Create an instance of {@link NPPDII }
     * 
     */
    public NPPDII createNPPDII() {
        return new NPPDII();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02OtherIDsScopingOrganization }
     * 
     */
    public PRPAMT201306UV02OtherIDsScopingOrganization createPRPAMT201306UV02OtherIDsScopingOrganization() {
        return new PRPAMT201306UV02OtherIDsScopingOrganization();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01LanguageCommunication }
     * 
     */
    public COCTMT090000UV01LanguageCommunication createCOCTMT090000UV01LanguageCommunication() {
        return new COCTMT090000UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link PRPAMT201307UV02ParameterList }
     * 
     */
    public PRPAMT201307UV02ParameterList createPRPAMT201307UV02ParameterList() {
        return new PRPAMT201307UV02ParameterList();
    }

    /**
     * Create an instance of {@link COCTMT530000UVLabeledDrug }
     * 
     */
    public COCTMT530000UVLabeledDrug createCOCTMT530000UVLabeledDrug() {
        return new COCTMT530000UVLabeledDrug();
    }

    /**
     * Create an instance of {@link COCTMT140007UVDevice }
     * 
     */
    public COCTMT140007UVDevice createCOCTMT140007UVDevice() {
        return new COCTMT140007UVDevice();
    }

    /**
     * Create an instance of {@link COCTMT530000UVDevice }
     * 
     */
    public COCTMT530000UVDevice createCOCTMT530000UVDevice() {
        return new COCTMT530000UVDevice();
    }

    /**
     * Create an instance of {@link SLISTPQ }
     * 
     */
    public SLISTPQ createSLISTPQ() {
        return new SLISTPQ();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Substitution }
     * 
     */
    public COCTMT300000UV04Substitution createCOCTMT300000UV04Substitution() {
        return new COCTMT300000UV04Substitution();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01Privilege }
     * 
     */
    public PRPMMT409000UV01Privilege createPRPMMT409000UV01Privilege() {
        return new PRPMMT409000UV01Privilege();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02ParameterList }
     * 
     */
    public PRPAMT201306UV02ParameterList createPRPAMT201306UV02ParameterList() {
        return new PRPAMT201306UV02ParameterList();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01RelatedTo }
     * 
     */
    public PRPMMT409000UV01RelatedTo createPRPMMT409000UV01RelatedTo() {
        return new PRPMMT409000UV01RelatedTo();
    }

    /**
     * Create an instance of {@link HISTTEL }
     * 
     */
    public HISTTEL createHISTTEL() {
        return new HISTTEL();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02OtherIDs }
     * 
     */
    public PRPAMT201310UV02OtherIDs createPRPAMT201310UV02OtherIDs() {
        return new PRPAMT201310UV02OtherIDs();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06AdministrativeDiagnosisReference }
     * 
     */
    public COCTMT290000UV06AdministrativeDiagnosisReference createCOCTMT290000UV06AdministrativeDiagnosisReference() {
        return new COCTMT290000UV06AdministrativeDiagnosisReference();
    }

    /**
     * Create an instance of {@link COCTMT090102UV02Person }
     * 
     */
    public COCTMT090102UV02Person createCOCTMT090102UV02Person() {
        return new COCTMT090102UV02Person();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04ManufacturedProductOrganization }
     * 
     */
    public COCTMT490000UV04ManufacturedProductOrganization createCOCTMT490000UV04ManufacturedProductOrganization() {
        return new COCTMT490000UV04ManufacturedProductOrganization();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01ControlActEvent }
     * 
     */
    public PRPMMT309000UV01ControlActEvent createPRPMMT309000UV01ControlActEvent() {
        return new PRPMMT309000UV01ControlActEvent();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06DirectAuthorityOver }
     * 
     */
    public COCTMT510000UV06DirectAuthorityOver createCOCTMT510000UV06DirectAuthorityOver() {
        return new COCTMT510000UV06DirectAuthorityOver();
    }

    /**
     * Create an instance of {@link ADXP }
     * 
     */
    public ADXP createADXP() {
        return new ADXP();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Location }
     * 
     */
    public COCTMT300000UV04Location createCOCTMT300000UV04Location() {
        return new COCTMT300000UV04Location();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01ActDefinitionOrEvent }
     * 
     */
    public PRPMMT403010UV01ActDefinitionOrEvent createPRPMMT403010UV01ActDefinitionOrEvent() {
        return new PRPMMT403010UV01ActDefinitionOrEvent();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04HealthCareProvider }
     * 
     */
    public COCTMT740000UV04HealthCareProvider createCOCTMT740000UV04HealthCareProvider() {
        return new COCTMT740000UV04HealthCareProvider();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01OrganizationName }
     * 
     */
    public PRPMMT406010UV01OrganizationName createPRPMMT406010UV01OrganizationName() {
        return new PRPMMT406010UV01OrganizationName();
    }

    /**
     * Create an instance of {@link COCTMT210000UV02Dillution }
     * 
     */
    public COCTMT210000UV02Dillution createCOCTMT210000UV02Dillution() {
        return new COCTMT210000UV02Dillution();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Reference2 }
     * 
     */
    public COCTMT510000UV06Reference2 createCOCTMT510000UV06Reference2() {
        return new COCTMT510000UV06Reference2();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01QualifiedEntity }
     * 
     */
    public PRPMMT406110UV01QualifiedEntity createPRPMMT406110UV01QualifiedEntity() {
        return new PRPMMT406110UV01QualifiedEntity();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01Member }
     * 
     */
    public COCTMT090000UV01Member createCOCTMT090000UV01Member() {
        return new COCTMT090000UV01Member();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01ObservationEvent }
     * 
     */
    public PRPMMT406110UV01ObservationEvent createPRPMMT406110UV01ObservationEvent() {
        return new PRPMMT406110UV01ObservationEvent();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Custodian }
     * 
     */
    public PRPMMT403010UV01Custodian createPRPMMT403010UV01Custodian() {
        return new PRPMMT403010UV01Custodian();
    }

    /**
     * Create an instance of {@link PQR }
     * 
     */
    public PQR createPQR() {
        return new PQR();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Receiver }
     * 
     */
    public PRPMMT303010UV01Receiver createPRPMMT303010UV01Receiver() {
        return new PRPMMT303010UV01Receiver();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01RoleActivation }
     * 
     */
    public PRPMMT409000UV01RoleActivation createPRPMMT409000UV01RoleActivation() {
        return new PRPMMT409000UV01RoleActivation();
    }

    /**
     * Create an instance of {@link COCTMT260003UVDefinition }
     * 
     */
    public COCTMT260003UVDefinition createCOCTMT260003UVDefinition() {
        return new COCTMT260003UVDefinition();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoverageDefinition }
     * 
     */
    public COCTMT510000UV06CoverageDefinition createCOCTMT510000UV06CoverageDefinition() {
        return new COCTMT510000UV06CoverageDefinition();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06NonPersonLivingSubject }
     * 
     */
    public COCTMT290000UV06NonPersonLivingSubject createCOCTMT290000UV06NonPersonLivingSubject() {
        return new COCTMT290000UV06NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04Author }
     * 
     */
    public COCTMT310000UV04Author createCOCTMT310000UV04Author() {
        return new COCTMT310000UV04Author();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01PrincipalOrganization }
     * 
     */
    public PRPMMT401010UV01PrincipalOrganization createPRPMMT401010UV01PrincipalOrganization() {
        return new PRPMMT401010UV01PrincipalOrganization();
    }

    /**
     * Create an instance of {@link IVLREAL }
     * 
     */
    public IVLREAL createIVLREAL() {
        return new IVLREAL();
    }

    /**
     * Create an instance of {@link StrucDocCaption }
     * 
     */
    public StrucDocCaption createStrucDocCaption() {
        return new StrucDocCaption();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01PriorRegistration }
     * 
     */
    public MFMIMT700711UV01PriorRegistration createMFMIMT700711UV01PriorRegistration() {
        return new MFMIMT700711UV01PriorRegistration();
    }

    /**
     * Create an instance of {@link COCTMT530000UVObservationRange }
     * 
     */
    public COCTMT530000UVObservationRange createCOCTMT530000UVObservationRange() {
        return new COCTMT530000UVObservationRange();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Destination }
     * 
     */
    public COCTMT300000UV04Destination createCOCTMT300000UV04Destination() {
        return new COCTMT300000UV04Destination();
    }

    /**
     * Create an instance of {@link COCTMT070000UV01LocatedEntity }
     * 
     */
    public COCTMT070000UV01LocatedEntity createCOCTMT070000UV01LocatedEntity() {
        return new COCTMT070000UV01LocatedEntity();
    }

    /**
     * Create an instance of {@link COCTMT820000UVAssignedProvider }
     * 
     */
    public COCTMT820000UVAssignedProvider createCOCTMT820000UVAssignedProvider() {
        return new COCTMT820000UVAssignedProvider();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Place }
     * 
     */
    public PRPMMT403010UV01Place createPRPMMT403010UV01Place() {
        return new PRPMMT403010UV01Place();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01HealthCareProvider }
     * 
     */
    public PRPMMT303010UV01HealthCareProvider createPRPMMT303010UV01HealthCareProvider() {
        return new PRPMMT303010UV01HealthCareProvider();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01LanguageCommunication }
     * 
     */
    public PRPMMT303010UV01LanguageCommunication createPRPMMT303010UV01LanguageCommunication() {
        return new PRPMMT303010UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link COCTMT030007UVPerson }
     * 
     */
    public COCTMT030007UVPerson createCOCTMT030007UVPerson() {
        return new COCTMT030007UVPerson();
    }

    /**
     * Create an instance of {@link NPPDBL }
     * 
     */
    public NPPDBL createNPPDBL() {
        return new NPPDBL();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09SpecimenProcessStep }
     * 
     */
    public COCTMT080000UV09SpecimenProcessStep createCOCTMT080000UV09SpecimenProcessStep() {
        return new COCTMT080000UV09SpecimenProcessStep();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Receiver }
     * 
     */
    public PRPMMT403010UV01Receiver createPRPMMT403010UV01Receiver() {
        return new PRPMMT403010UV01Receiver();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01LanguageCommunication }
     * 
     */
    public PRPMMT309000UV01LanguageCommunication createPRPMMT309000UV01LanguageCommunication() {
        return new PRPMMT309000UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01ResponsibleParty }
     * 
     */
    public PRPMMT309000UV01ResponsibleParty createPRPMMT309000UV01ResponsibleParty() {
        return new PRPMMT309000UV01ResponsibleParty();
    }

    /**
     * Create an instance of {@link COCTMT530000UVActDefinition }
     * 
     */
    public COCTMT530000UVActDefinition createCOCTMT530000UVActDefinition() {
        return new COCTMT530000UVActDefinition();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Holder }
     * 
     */
    public COCTMT510000UV06Holder createCOCTMT510000UV06Holder() {
        return new COCTMT510000UV06Holder();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Author }
     * 
     */
    public COCTMT300000UV04Author createCOCTMT300000UV04Author() {
        return new COCTMT300000UV04Author();
    }

    /**
     * Create an instance of {@link COCTMT530000UVPrecondition2 }
     * 
     */
    public COCTMT530000UVPrecondition2 createCOCTMT530000UVPrecondition2() {
        return new COCTMT530000UVPrecondition2();
    }

    /**
     * Create an instance of {@link COCTMT530000UVPlace }
     * 
     */
    public COCTMT530000UVPlace createCOCTMT530000UVPlace() {
        return new COCTMT530000UVPlace();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Group }
     * 
     */
    public PRPAMT201304UV02Group createPRPAMT201304UV02Group() {
        return new PRPAMT201304UV02Group();
    }

    /**
     * Create an instance of {@link COCTMT530000UVPrecondition1 }
     * 
     */
    public COCTMT530000UVPrecondition1 createCOCTMT530000UVPrecondition1() {
        return new COCTMT530000UVPrecondition1();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02AdministrativeObservation }
     * 
     */
    public PRPAMT201303UV02AdministrativeObservation createPRPAMT201303UV02AdministrativeObservation() {
        return new PRPAMT201303UV02AdministrativeObservation();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Subject5 }
     * 
     */
    public PRPMMT401010UV01Subject5 createPRPMMT401010UV01Subject5() {
        return new PRPMMT401010UV01Subject5();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Subject6 }
     * 
     */
    public PRPMMT401010UV01Subject6 createPRPMMT401010UV01Subject6() {
        return new PRPMMT401010UV01Subject6();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Subject7 }
     * 
     */
    public PRPMMT401010UV01Subject7 createPRPMMT401010UV01Subject7() {
        return new PRPMMT401010UV01Subject7();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Subject8 }
     * 
     */
    public PRPMMT401010UV01Subject8 createPRPMMT401010UV01Subject8() {
        return new PRPMMT401010UV01Subject8();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Subject2 }
     * 
     */
    public PRPMMT401010UV01Subject2 createPRPMMT401010UV01Subject2() {
        return new PRPMMT401010UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Subject3 }
     * 
     */
    public PRPMMT401010UV01Subject3 createPRPMMT401010UV01Subject3() {
        return new PRPMMT401010UV01Subject3();
    }

    /**
     * Create an instance of {@link COCTMT710000UV07LocatedEntity }
     * 
     */
    public COCTMT710000UV07LocatedEntity createCOCTMT710000UV07LocatedEntity() {
        return new COCTMT710000UV07LocatedEntity();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Subject4 }
     * 
     */
    public PRPMMT401010UV01Subject4 createPRPMMT401010UV01Subject4() {
        return new PRPMMT401010UV01Subject4();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01DetectedIssueEvent }
     * 
     */
    public MCAIMT900001UV01DetectedIssueEvent createMCAIMT900001UV01DetectedIssueEvent() {
        return new MCAIMT900001UV01DetectedIssueEvent();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Subject9 }
     * 
     */
    public PRPMMT401010UV01Subject9 createPRPMMT401010UV01Subject9() {
        return new PRPMMT401010UV01Subject9();
    }

    /**
     * Create an instance of {@link COCTMT260003UVOtherSupply }
     * 
     */
    public COCTMT260003UVOtherSupply createCOCTMT260003UVOtherSupply() {
        return new COCTMT260003UVOtherSupply();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01AssignedEntity }
     * 
     */
    public PRPMMT301010UV01AssignedEntity createPRPMMT301010UV01AssignedEntity() {
        return new PRPMMT301010UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link StrucDocRenderMultiMedia }
     * 
     */
    public StrucDocRenderMultiMedia createStrucDocRenderMultiMedia() {
        return new StrucDocRenderMultiMedia();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06IndirectAuthorithyOver }
     * 
     */
    public COCTMT290000UV06IndirectAuthorithyOver createCOCTMT290000UV06IndirectAuthorithyOver() {
        return new COCTMT290000UV06IndirectAuthorithyOver();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01Member }
     * 
     */
    public COCTMT090300UV01Member createCOCTMT090300UV01Member() {
        return new COCTMT090300UV01Member();
    }

    /**
     * Create an instance of {@link NPPDAD }
     * 
     */
    public NPPDAD createNPPDAD() {
        return new NPPDAD();
    }

    /**
     * Create an instance of {@link COCTMT090102UV02AssignedPerson }
     * 
     */
    public COCTMT090102UV02AssignedPerson createCOCTMT090102UV02AssignedPerson() {
        return new COCTMT090102UV02AssignedPerson();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01SdlcType }
     * 
     */
    public PRPMMT306010UV01SdlcType createPRPMMT306010UV01SdlcType() {
        return new PRPMMT306010UV01SdlcType();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02CareGiver }
     * 
     */
    public PRPAMT201302UV02CareGiver createPRPAMT201302UV02CareGiver() {
        return new PRPAMT201302UV02CareGiver();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Group }
     * 
     */
    public PRPAMT201302UV02Group createPRPAMT201302UV02Group() {
        return new PRPAMT201302UV02Group();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01SdlcType }
     * 
     */
    public PRPMMT406010UV01SdlcType createPRPMMT406010UV01SdlcType() {
        return new PRPMMT406010UV01SdlcType();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Holder }
     * 
     */
    public COCTMT080000UV09Holder createCOCTMT080000UV09Holder() {
        return new COCTMT080000UV09Holder();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01Jurisdiction }
     * 
     */
    public PRPMMT409000UV01Jurisdiction createPRPMMT409000UV01Jurisdiction() {
        return new PRPMMT409000UV01Jurisdiction();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ReusableDevice }
     * 
     */
    public COCTMT290000UV06ReusableDevice createCOCTMT290000UV06ReusableDevice() {
        return new COCTMT290000UV06ReusableDevice();
    }

    /**
     * Create an instance of {@link PRPMIN403011UV01MFMIMT700721UV01Subject1 }
     * 
     */
    public PRPMIN403011UV01MFMIMT700721UV01Subject1 createPRPMIN403011UV01MFMIMT700721UV01Subject1() {
        return new PRPMIN403011UV01MFMIMT700721UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Citizen }
     * 
     */
    public PRPAMT201301UV02Citizen createPRPAMT201301UV02Citizen() {
        return new PRPAMT201301UV02Citizen();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09SourceOf }
     * 
     */
    public COCTMT080000UV09SourceOf createCOCTMT080000UV09SourceOf() {
        return new COCTMT080000UV09SourceOf();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01ControlActEvent }
     * 
     */
    public PRPMMT303010UV01ControlActEvent createPRPMMT303010UV01ControlActEvent() {
        return new PRPMMT303010UV01ControlActEvent();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01Member }
     * 
     */
    public COCTMT050000UV01Member createCOCTMT050000UV01Member() {
        return new COCTMT050000UV01Member();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01Guardian }
     * 
     */
    public COCTMT050000UV01Guardian createCOCTMT050000UV01Guardian() {
        return new COCTMT050000UV01Guardian();
    }

    /**
     * Create an instance of {@link NPPDRTO }
     * 
     */
    public NPPDRTO createNPPDRTO() {
        return new NPPDRTO();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02MatchCriterionList }
     * 
     */
    public PRPAMT201306UV02MatchCriterionList createPRPAMT201306UV02MatchCriterionList() {
        return new PRPAMT201306UV02MatchCriterionList();
    }

    /**
     * Create an instance of {@link PRPMIN403011UV01MFMIMT700721UV01Subject2 }
     * 
     */
    public PRPMIN403011UV01MFMIMT700721UV01Subject2 createPRPMIN403011UV01MFMIMT700721UV01Subject2() {
        return new PRPMIN403011UV01MFMIMT700721UV01Subject2();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06InjuryLocation }
     * 
     */
    public COCTMT290000UV06InjuryLocation createCOCTMT290000UV06InjuryLocation() {
        return new COCTMT290000UV06InjuryLocation();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04PertinentInformation2 }
     * 
     */
    public COCTMT300000UV04PertinentInformation2 createCOCTMT300000UV04PertinentInformation2() {
        return new COCTMT300000UV04PertinentInformation2();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02CoveredParty }
     * 
     */
    public PRPAMT201303UV02CoveredParty createPRPAMT201303UV02CoveredParty() {
        return new PRPAMT201303UV02CoveredParty();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01PrincipalOrganization }
     * 
     */
    public PRPMMT303010UV01PrincipalOrganization createPRPMMT303010UV01PrincipalOrganization() {
        return new PRPMMT303010UV01PrincipalOrganization();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01History }
     * 
     */
    public PRPMMT406010UV01History createPRPMMT406010UV01History() {
        return new PRPMMT406010UV01History();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Subject4 }
     * 
     */
    public PRPMMT301010UV01Subject4 createPRPMMT301010UV01Subject4() {
        return new PRPMMT301010UV01Subject4();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Subject5 }
     * 
     */
    public PRPMMT301010UV01Subject5 createPRPMMT301010UV01Subject5() {
        return new PRPMMT301010UV01Subject5();
    }

    /**
     * Create an instance of {@link PRPMMT306810UV01Confidence }
     * 
     */
    public PRPMMT306810UV01Confidence createPRPMMT306810UV01Confidence() {
        return new PRPMMT306810UV01Confidence();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Subject2 }
     * 
     */
    public PRPMMT301010UV01Subject2 createPRPMMT301010UV01Subject2() {
        return new PRPMMT301010UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Subject3 }
     * 
     */
    public PRPMMT301010UV01Subject3 createPRPMMT301010UV01Subject3() {
        return new PRPMMT301010UV01Subject3();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04MinimumAvailableAccommodation }
     * 
     */
    public COCTMT310000UV04MinimumAvailableAccommodation createCOCTMT310000UV04MinimumAvailableAccommodation() {
        return new COCTMT310000UV04MinimumAvailableAccommodation();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Subject8 }
     * 
     */
    public PRPMMT301010UV01Subject8 createPRPMMT301010UV01Subject8() {
        return new PRPMMT301010UV01Subject8();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Subject9 }
     * 
     */
    public PRPMMT301010UV01Subject9 createPRPMMT301010UV01Subject9() {
        return new PRPMMT301010UV01Subject9();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Subject }
     * 
     */
    public COCTMT300000UV04Subject createCOCTMT300000UV04Subject() {
        return new COCTMT300000UV04Subject();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Subject6 }
     * 
     */
    public PRPMMT301010UV01Subject6 createPRPMMT301010UV01Subject6() {
        return new PRPMMT301010UV01Subject6();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Subject7 }
     * 
     */
    public PRPMMT301010UV01Subject7 createPRPMMT301010UV01Subject7() {
        return new PRPMMT301010UV01Subject7();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01LicensedEntity }
     * 
     */
    public COCTMT090300UV01LicensedEntity createCOCTMT090300UV01LicensedEntity() {
        return new COCTMT090300UV01LicensedEntity();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02OtherIDs }
     * 
     */
    public PRPAMT201303UV02OtherIDs createPRPAMT201303UV02OtherIDs() {
        return new PRPAMT201303UV02OtherIDs();
    }

    /**
     * Create an instance of {@link StrucDocTCell }
     * 
     */
    public StrucDocTCell createStrucDocTCell() {
        return new StrucDocTCell();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02AdministrativeObservation }
     * 
     */
    public PRPAMT201310UV02AdministrativeObservation createPRPAMT201310UV02AdministrativeObservation() {
        return new PRPAMT201310UV02AdministrativeObservation();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01EntityRsp }
     * 
     */
    public MCCIMT000300UV01EntityRsp createMCCIMT000300UV01EntityRsp() {
        return new MCCIMT000300UV01EntityRsp();
    }

    /**
     * Create an instance of {@link PRPMMT306810UV01SortControl }
     * 
     */
    public PRPMMT306810UV01SortControl createPRPMMT306810UV01SortControl() {
        return new PRPMMT306810UV01SortControl();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01Citizen }
     * 
     */
    public COCTMT050000UV01Citizen createCOCTMT050000UV01Citizen() {
        return new COCTMT050000UV01Citizen();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06HealthCareProvider }
     * 
     */
    public COCTMT290000UV06HealthCareProvider createCOCTMT290000UV06HealthCareProvider() {
        return new COCTMT290000UV06HealthCareProvider();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Member }
     * 
     */
    public PRPAMT201310UV02Member createPRPAMT201310UV02Member() {
        return new PRPAMT201310UV02Member();
    }

    /**
     * Create an instance of {@link BAGAD }
     * 
     */
    public BAGAD createBAGAD() {
        return new BAGAD();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Jurisdiction }
     * 
     */
    public PRPMMT303010UV01Jurisdiction createPRPMMT303010UV01Jurisdiction() {
        return new PRPMMT303010UV01Jurisdiction();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01PrimaryPerformer3 }
     * 
     */
    public PRPMMT409000UV01PrimaryPerformer3 createPRPMMT409000UV01PrimaryPerformer3() {
        return new PRPMMT409000UV01PrimaryPerformer3();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04HealthCareProvider }
     * 
     */
    public COCTMT490000UV04HealthCareProvider createCOCTMT490000UV04HealthCareProvider() {
        return new COCTMT490000UV04HealthCareProvider();
    }

    /**
     * Create an instance of {@link COCTMT530000UVPerson }
     * 
     */
    public COCTMT530000UVPerson createCOCTMT530000UVPerson() {
        return new COCTMT530000UVPerson();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01Subject2 }
     * 
     */
    public PRPMMT409000UV01Subject2 createPRPMMT409000UV01Subject2() {
        return new PRPMMT409000UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01Subject3 }
     * 
     */
    public PRPMMT409000UV01Subject3 createPRPMMT409000UV01Subject3() {
        return new PRPMMT409000UV01Subject3();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01Subject4 }
     * 
     */
    public PRPMMT409000UV01Subject4 createPRPMMT409000UV01Subject4() {
        return new PRPMMT409000UV01Subject4();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01Subject6 }
     * 
     */
    public PRPMMT409000UV01Subject6 createPRPMMT409000UV01Subject6() {
        return new PRPMMT409000UV01Subject6();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01Subject7 }
     * 
     */
    public PRPMMT409000UV01Subject7 createPRPMMT409000UV01Subject7() {
        return new PRPMMT409000UV01Subject7();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01Device }
     * 
     */
    public MCCIMT000100UV01Device createMCCIMT000100UV01Device() {
        return new MCCIMT000100UV01Device();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01Subject9 }
     * 
     */
    public PRPMMT409000UV01Subject9 createPRPMMT409000UV01Subject9() {
        return new PRPMMT409000UV01Subject9();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01Person }
     * 
     */
    public COCTMT090100UV01Person createCOCTMT090100UV01Person() {
        return new COCTMT090100UV01Person();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Part }
     * 
     */
    public PRPMMT306110UV01Part createPRPMMT306110UV01Part() {
        return new PRPMMT306110UV01Part();
    }

    /**
     * Create an instance of {@link PRPMMT306810UV01RoleClass }
     * 
     */
    public PRPMMT306810UV01RoleClass createPRPMMT306810UV01RoleClass() {
        return new PRPMMT306810UV01RoleClass();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02PatientOfOtherProvider }
     * 
     */
    public PRPAMT201301UV02PatientOfOtherProvider createPRPAMT201301UV02PatientOfOtherProvider() {
        return new PRPAMT201301UV02PatientOfOtherProvider();
    }

    /**
     * Create an instance of {@link PRPAIN201306UV02MFMIMT700711UV01Subject2 }
     * 
     */
    public PRPAIN201306UV02MFMIMT700711UV01Subject2 createPRPAIN201306UV02MFMIMT700711UV01Subject2() {
        return new PRPAIN201306UV02MFMIMT700711UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01SdlcAddress }
     * 
     */
    public PRPMMT406010UV01SdlcAddress createPRPMMT406010UV01SdlcAddress() {
        return new PRPMMT406010UV01SdlcAddress();
    }

    /**
     * Create an instance of {@link PRPAIN201306UV02MFMIMT700711UV01Subject1 }
     * 
     */
    public PRPAIN201306UV02MFMIMT700711UV01Subject1 createPRPAIN201306UV02MFMIMT700711UV01Subject1() {
        return new PRPAIN201306UV02MFMIMT700711UV01Subject1();
    }

    /**
     * Create an instance of {@link COCTMT260003UVDetectedMedicationIssue }
     * 
     */
    public COCTMT260003UVDetectedMedicationIssue createCOCTMT260003UVDetectedMedicationIssue() {
        return new COCTMT260003UVDetectedMedicationIssue();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Product }
     * 
     */
    public COCTMT600000UV06Product createCOCTMT600000UV06Product() {
        return new COCTMT600000UV06Product();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01ObservationEvent }
     * 
     */
    public PRPMMT403010UV01ObservationEvent createPRPMMT403010UV01ObservationEvent() {
        return new PRPMMT403010UV01ObservationEvent();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04OralHealthSubstanceAdministration }
     * 
     */
    public COCTMT740000UV04OralHealthSubstanceAdministration createCOCTMT740000UV04OralHealthSubstanceAdministration() {
        return new COCTMT740000UV04OralHealthSubstanceAdministration();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Origin }
     * 
     */
    public COCTMT490000UV04Origin createCOCTMT490000UV04Origin() {
        return new COCTMT490000UV04Origin();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Place }
     * 
     */
    public PRPMMT303010UV01Place createPRPMMT303010UV01Place() {
        return new PRPMMT303010UV01Place();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Note }
     * 
     */
    public PRPMMT406110UV01Note createPRPMMT406110UV01Note() {
        return new PRPMMT406110UV01Note();
    }

    /**
     * Create an instance of {@link COCTMT090303UV01AssignedDevice }
     * 
     */
    public COCTMT090303UV01AssignedDevice createCOCTMT090303UV01AssignedDevice() {
        return new COCTMT090303UV01AssignedDevice();
    }

    /**
     * Create an instance of {@link PRPAIN201308UV02MFMIMT700711UV01Subject1 }
     * 
     */
    public PRPAIN201308UV02MFMIMT700711UV01Subject1 createPRPAIN201308UV02MFMIMT700711UV01Subject1() {
        return new PRPAIN201308UV02MFMIMT700711UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPAIN201308UV02MFMIMT700711UV01Subject2 }
     * 
     */
    public PRPAIN201308UV02MFMIMT700711UV01Subject2 createPRPAIN201308UV02MFMIMT700711UV01Subject2() {
        return new PRPAIN201308UV02MFMIMT700711UV01Subject2();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Product }
     * 
     */
    public COCTMT490000UV04Product createCOCTMT490000UV04Product() {
        return new COCTMT490000UV04Product();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02LanguageCommunication }
     * 
     */
    public PRPAMT201302UV02LanguageCommunication createPRPAMT201302UV02LanguageCommunication() {
        return new PRPAMT201302UV02LanguageCommunication();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04AccommodationRequested }
     * 
     */
    public COCTMT310000UV04AccommodationRequested createCOCTMT310000UV04AccommodationRequested() {
        return new COCTMT310000UV04AccommodationRequested();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02PrincipalCareProvisionId }
     * 
     */
    public PRPAMT201306UV02PrincipalCareProvisionId createPRPAMT201306UV02PrincipalCareProvisionId() {
        return new PRPAMT201306UV02PrincipalCareProvisionId();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Jurisdiction }
     * 
     */
    public PRPMMT309000UV01Jurisdiction createPRPMMT309000UV01Jurisdiction() {
        return new PRPMMT309000UV01Jurisdiction();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Payor }
     * 
     */
    public COCTMT510000UV06Payor createCOCTMT510000UV06Payor() {
        return new COCTMT510000UV06Payor();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01PriorRegisteredRole }
     * 
     */
    public MFMIMT700721UV01PriorRegisteredRole createMFMIMT700721UV01PriorRegisteredRole() {
        return new MFMIMT700721UV01PriorRegisteredRole();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Nation }
     * 
     */
    public PRPAMT201302UV02Nation createPRPAMT201302UV02Nation() {
        return new PRPAMT201302UV02Nation();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01AssignedEntity2 }
     * 
     */
    public PRPMMT409000UV01AssignedEntity2 createPRPMMT409000UV01AssignedEntity2() {
        return new PRPMMT409000UV01AssignedEntity2();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Affiliate }
     * 
     */
    public PRPMMT401010UV01Affiliate createPRPMMT401010UV01Affiliate() {
        return new PRPMMT401010UV01Affiliate();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04ManufacturedMaterial }
     * 
     */
    public COCTMT490000UV04ManufacturedMaterial createCOCTMT490000UV04ManufacturedMaterial() {
        return new COCTMT490000UV04ManufacturedMaterial();
    }

    /**
     * Create an instance of {@link COCTMT030007UVEmployment }
     * 
     */
    public COCTMT030007UVEmployment createCOCTMT030007UVEmployment() {
        return new COCTMT030007UVEmployment();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01AcknowledgementDetail }
     * 
     */
    public MCCIMT000300UV01AcknowledgementDetail createMCCIMT000300UV01AcknowledgementDetail() {
        return new MCCIMT000300UV01AcknowledgementDetail();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Note }
     * 
     */
    public PRPMMT303010UV01Note createPRPMMT303010UV01Note() {
        return new PRPMMT303010UV01Note();
    }

    /**
     * Create an instance of {@link COCTMT240003UV02ServiceDeliveryLocation }
     * 
     */
    public COCTMT240003UV02ServiceDeliveryLocation createCOCTMT240003UV02ServiceDeliveryLocation() {
        return new COCTMT240003UV02ServiceDeliveryLocation();
    }

    /**
     * Create an instance of {@link COCTMT260003UVMitigates }
     * 
     */
    public COCTMT260003UVMitigates createCOCTMT260003UVMitigates() {
        return new COCTMT260003UVMitigates();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Consultant }
     * 
     */
    public COCTMT490000UV04Consultant createCOCTMT490000UV04Consultant() {
        return new COCTMT490000UV04Consultant();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Note }
     * 
     */
    public PRPMMT301010UV01Note createPRPMMT301010UV01Note() {
        return new PRPMMT301010UV01Note();
    }

    /**
     * Create an instance of {@link AD }
     * 
     */
    public AD createAD() {
        return new AD();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02PatientPatientPerson }
     * 
     */
    public PRPAMT201302UV02PatientPatientPerson createPRPAMT201302UV02PatientPatientPerson() {
        return new PRPAMT201302UV02PatientPatientPerson();
    }

    /**
     * Create an instance of {@link StrucDocCol }
     * 
     */
    public StrucDocCol createStrucDocCol() {
        return new StrucDocCol();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Beneficiary2 }
     * 
     */
    public COCTMT510000UV06Beneficiary2 createCOCTMT510000UV06Beneficiary2() {
        return new COCTMT510000UV06Beneficiary2();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02PatientOfOtherProvider }
     * 
     */
    public PRPAMT201310UV02PatientOfOtherProvider createPRPAMT201310UV02PatientOfOtherProvider() {
        return new PRPAMT201310UV02PatientOfOtherProvider();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01ServiceDeliveryLocation }
     * 
     */
    public PRPMMT401010UV01ServiceDeliveryLocation createPRPMMT401010UV01ServiceDeliveryLocation() {
        return new PRPMMT401010UV01ServiceDeliveryLocation();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01Qualification }
     * 
     */
    public PRPMMT306010UV01Qualification createPRPMMT306010UV01Qualification() {
        return new PRPMMT306010UV01Qualification();
    }

    /**
     * Create an instance of {@link PRPMMT306810UV01Name }
     * 
     */
    public PRPMMT306810UV01Name createPRPMMT306810UV01Name() {
        return new PRPMMT306810UV01Name();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoveragePolicy }
     * 
     */
    public COCTMT510000UV06CoveragePolicy createCOCTMT510000UV06CoveragePolicy() {
        return new COCTMT510000UV06CoveragePolicy();
    }

    /**
     * Create an instance of {@link QSIPQ }
     * 
     */
    public QSIPQ createQSIPQ() {
        return new QSIPQ();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Custodian }
     * 
     */
    public MFMIMT700701UV01Custodian createMFMIMT700701UV01Custodian() {
        return new MFMIMT700701UV01Custodian();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09ControlActEvent }
     * 
     */
    public COCTMT080000UV09ControlActEvent createCOCTMT080000UV09ControlActEvent() {
        return new COCTMT080000UV09ControlActEvent();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01QueryByParameterPayload }
     * 
     */
    public PRPMMT406010UV01QueryByParameterPayload createPRPMMT406010UV01QueryByParameterPayload() {
        return new PRPMMT406010UV01QueryByParameterPayload();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Definition }
     * 
     */
    public COCTMT510000UV06Definition createCOCTMT510000UV06Definition() {
        return new COCTMT510000UV06Definition();
    }

    /**
     * Create an instance of {@link COCTMT260003UVDetectedMedicationIssueDefinition }
     * 
     */
    public COCTMT260003UVDetectedMedicationIssueDefinition createCOCTMT260003UVDetectedMedicationIssueDefinition() {
        return new COCTMT260003UVDetectedMedicationIssueDefinition();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Location }
     * 
     */
    public PRPMMT301010UV01Location createPRPMMT301010UV01Location() {
        return new PRPMMT301010UV01Location();
    }

    /**
     * Create an instance of {@link PRPAIN201306UV02MFMIMT700711UV01RegistrationEvent }
     * 
     */
    public PRPAIN201306UV02MFMIMT700711UV01RegistrationEvent createPRPAIN201306UV02MFMIMT700711UV01RegistrationEvent() {
        return new PRPAIN201306UV02MFMIMT700711UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01Subject3 }
     * 
     */
    public COCTMT050000UV01Subject3 createCOCTMT050000UV01Subject3() {
        return new COCTMT050000UV01Subject3();
    }

    /**
     * Create an instance of {@link BL }
     * 
     */
    public BL createBL() {
        return new BL();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01Subject4 }
     * 
     */
    public COCTMT050000UV01Subject4 createCOCTMT050000UV01Subject4() {
        return new COCTMT050000UV01Subject4();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01ObservationEvent }
     * 
     */
    public PRPMMT301010UV01ObservationEvent createPRPMMT301010UV01ObservationEvent() {
        return new PRPMMT301010UV01ObservationEvent();
    }

    /**
     * Create an instance of {@link PRPAIN201315UV02MFMIMT700701UV01Subject1 }
     * 
     */
    public PRPAIN201315UV02MFMIMT700701UV01Subject1 createPRPAIN201315UV02MFMIMT700701UV01Subject1() {
        return new PRPAIN201315UV02MFMIMT700701UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPAIN201315UV02MFMIMT700701UV01Subject2 }
     * 
     */
    public PRPAIN201315UV02MFMIMT700701UV01Subject2 createPRPAIN201315UV02MFMIMT700701UV01Subject2() {
        return new PRPAIN201315UV02MFMIMT700701UV01Subject2();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Product2 }
     * 
     */
    public COCTMT290000UV06Product2 createCOCTMT290000UV06Product2() {
        return new COCTMT290000UV06Product2();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Product1 }
     * 
     */
    public COCTMT290000UV06Product1 createCOCTMT290000UV06Product1() {
        return new COCTMT290000UV06Product1();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01InformDefinition }
     * 
     */
    public PRPMMT306110UV01InformDefinition createPRPMMT306110UV01InformDefinition() {
        return new PRPMMT306110UV01InformDefinition();
    }

    /**
     * Create an instance of {@link COCTMT090108UVAssignedPerson }
     * 
     */
    public COCTMT090108UVAssignedPerson createCOCTMT090108UVAssignedPerson() {
        return new COCTMT090108UVAssignedPerson();
    }

    /**
     * Create an instance of {@link XReference }
     * 
     */
    public XReference createXReference() {
        return new XReference();
    }

    /**
     * Create an instance of {@link CD }
     * 
     */
    public CD createCD() {
        return new CD();
    }

    /**
     * Create an instance of {@link PRPAIN201304UV02MFMIMT700701UV01RegistrationEvent }
     * 
     */
    public PRPAIN201304UV02MFMIMT700701UV01RegistrationEvent createPRPAIN201304UV02MFMIMT700701UV01RegistrationEvent() {
        return new PRPAIN201304UV02MFMIMT700701UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02PatientStatusCode }
     * 
     */
    public PRPAMT201306UV02PatientStatusCode createPRPAMT201306UV02PatientStatusCode() {
        return new PRPAMT201306UV02PatientStatusCode();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01Group }
     * 
     */
    public COCTMT090100UV01Group createCOCTMT090100UV01Group() {
        return new COCTMT090100UV01Group();
    }

    /**
     * Create an instance of {@link HISTAD }
     * 
     */
    public HISTAD createHISTAD() {
        return new HISTAD();
    }

    /**
     * Create an instance of {@link CO }
     * 
     */
    public CO createCO() {
        return new CO();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09PertinentInformation }
     * 
     */
    public COCTMT080000UV09PertinentInformation createCOCTMT080000UV09PertinentInformation() {
        return new COCTMT080000UV09PertinentInformation();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Patient }
     * 
     */
    public PRPAMT201303UV02Patient createPRPAMT201303UV02Patient() {
        return new PRPAMT201303UV02Patient();
    }

    /**
     * Create an instance of {@link UVPII }
     * 
     */
    public UVPII createUVPII() {
        return new UVPII();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01Group }
     * 
     */
    public COCTMT090300UV01Group createCOCTMT090300UV01Group() {
        return new COCTMT090300UV01Group();
    }

    /**
     * Create an instance of {@link COCTMT530000UVProcedure }
     * 
     */
    public COCTMT530000UVProcedure createCOCTMT530000UVProcedure() {
        return new COCTMT530000UVProcedure();
    }

    /**
     * Create an instance of {@link HISTBL }
     * 
     */
    public HISTBL createHISTBL() {
        return new HISTBL();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Student }
     * 
     */
    public PRPAMT201302UV02Student createPRPAMT201302UV02Student() {
        return new PRPAMT201302UV02Student();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02ContactParty }
     * 
     */
    public PRPAMT201301UV02ContactParty createPRPAMT201301UV02ContactParty() {
        return new PRPAMT201301UV02ContactParty();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Privilege }
     * 
     */
    public PRPMMT309000UV01Privilege createPRPMMT309000UV01Privilege() {
        return new PRPMMT309000UV01Privilege();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Patient }
     * 
     */
    public PRPAMT201301UV02Patient createPRPAMT201301UV02Patient() {
        return new PRPAMT201301UV02Patient();
    }

    /**
     * Create an instance of {@link HISTCD }
     * 
     */
    public HISTCD createHISTCD() {
        return new HISTCD();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Student }
     * 
     */
    public PRPAMT201304UV02Student createPRPAMT201304UV02Student() {
        return new PRPAMT201304UV02Student();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01SequelTo }
     * 
     */
    public PRPMMT301010UV01SequelTo createPRPMMT301010UV01SequelTo() {
        return new PRPMMT301010UV01SequelTo();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Privilege }
     * 
     */
    public PRPMMT306110UV01Privilege createPRPMMT306110UV01Privilege() {
        return new PRPMMT306110UV01Privilege();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01DOB }
     * 
     */
    public PRPMMT306010UV01DOB createPRPMMT306010UV01DOB() {
        return new PRPMMT306010UV01DOB();
    }

    /**
     * Create an instance of {@link ED }
     * 
     */
    public ED createED() {
        return new ED();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01TerritorialAuthority }
     * 
     */
    public PRPMMT403010UV01TerritorialAuthority createPRPMMT403010UV01TerritorialAuthority() {
        return new PRPMMT403010UV01TerritorialAuthority();
    }

    /**
     * Create an instance of {@link HISTCO }
     * 
     */
    public HISTCO createHISTCO() {
        return new HISTCO();
    }

    /**
     * Create an instance of {@link PRPMIN401031UV01MFMIMT700721UV01Subject1 }
     * 
     */
    public PRPMIN401031UV01MFMIMT700721UV01Subject1 createPRPMIN401031UV01MFMIMT700721UV01Subject1() {
        return new PRPMIN401031UV01MFMIMT700721UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPMIN306011UV01MFMIMT700711UV01Subject2 }
     * 
     */
    public PRPMIN306011UV01MFMIMT700711UV01Subject2 createPRPMIN306011UV01MFMIMT700711UV01Subject2() {
        return new PRPMIN306011UV01MFMIMT700711UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMIN306011UV01MFMIMT700711UV01Subject1 }
     * 
     */
    public PRPMIN306011UV01MFMIMT700711UV01Subject1 createPRPMIN306011UV01MFMIMT700711UV01Subject1() {
        return new PRPMIN306011UV01MFMIMT700711UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01PrincipalPerson }
     * 
     */
    public PRPMMT403010UV01PrincipalPerson createPRPMMT403010UV01PrincipalPerson() {
        return new PRPMMT403010UV01PrincipalPerson();
    }

    /**
     * Create an instance of {@link HISTCS }
     * 
     */
    public HISTCS createHISTCS() {
        return new HISTCS();
    }

    /**
     * Create an instance of {@link EN }
     * 
     */
    public EN createEN() {
        return new EN();
    }

    /**
     * Create an instance of {@link StrucDocColItem }
     * 
     */
    public StrucDocColItem createStrucDocColItem() {
        return new StrucDocColItem();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04ManufacturedProduct }
     * 
     */
    public COCTMT300000UV04ManufacturedProduct createCOCTMT300000UV04ManufacturedProduct() {
        return new COCTMT300000UV04ManufacturedProduct();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Privilege }
     * 
     */
    public PRPMMT301010UV01Privilege createPRPMMT301010UV01Privilege() {
        return new PRPMMT301010UV01Privilege();
    }

    /**
     * Create an instance of {@link COCTMT810000UVVerificationRequest }
     * 
     */
    public COCTMT810000UVVerificationRequest createCOCTMT810000UVVerificationRequest() {
        return new COCTMT810000UVVerificationRequest();
    }

    /**
     * Create an instance of {@link PRPMIN401031UV01MFMIMT700721UV01Subject2 }
     * 
     */
    public PRPMIN401031UV01MFMIMT700721UV01Subject2 createPRPMIN401031UV01MFMIMT700721UV01Subject2() {
        return new PRPMIN401031UV01MFMIMT700721UV01Subject2();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04OralHealthService }
     * 
     */
    public COCTMT740000UV04OralHealthService createCOCTMT740000UV04OralHealthService() {
        return new COCTMT740000UV04OralHealthService();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Reason }
     * 
     */
    public MFMIMT700711UV01Reason createMFMIMT700711UV01Reason() {
        return new MFMIMT700711UV01Reason();
    }

    /**
     * Create an instance of {@link HISTED }
     * 
     */
    public HISTED createHISTED() {
        return new HISTED();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Location }
     * 
     */
    public COCTMT490000UV04Location createCOCTMT490000UV04Location() {
        return new COCTMT490000UV04Location();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Privilege }
     * 
     */
    public PRPMMT406110UV01Privilege createPRPMMT406110UV01Privilege() {
        return new PRPMMT406110UV01Privilege();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01Location }
     * 
     */
    public COCTMT060000UV01Location createCOCTMT060000UV01Location() {
        return new COCTMT060000UV01Location();
    }

    /**
     * Create an instance of {@link UVPED }
     * 
     */
    public UVPED createUVPED() {
        return new UVPED();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02OtherIDs }
     * 
     */
    public PRPAMT201304UV02OtherIDs createPRPAMT201304UV02OtherIDs() {
        return new PRPAMT201304UV02OtherIDs();
    }

    /**
     * Create an instance of {@link HISTEN }
     * 
     */
    public HISTEN createHISTEN() {
        return new HISTEN();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05PositionAccuracy }
     * 
     */
    public COCTMT960000UV05PositionAccuracy createCOCTMT960000UV05PositionAccuracy() {
        return new COCTMT960000UV05PositionAccuracy();
    }

    /**
     * Create an instance of {@link UVPEN }
     * 
     */
    public UVPEN createUVPEN() {
        return new UVPEN();
    }

    /**
     * Create an instance of {@link COCTMT260003UVManufacturedMaterialKind }
     * 
     */
    public COCTMT260003UVManufacturedMaterialKind createCOCTMT260003UVManufacturedMaterialKind() {
        return new COCTMT260003UVManufacturedMaterialKind();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01LocatedEntity }
     * 
     */
    public MCCIMT000200UV01LocatedEntity createMCCIMT000200UV01LocatedEntity() {
        return new MCCIMT000200UV01LocatedEntity();
    }

    /**
     * Create an instance of {@link UVPCS }
     * 
     */
    public UVPCS createUVPCS() {
        return new UVPCS();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Organization }
     * 
     */
    public PRPMMT401010UV01Organization createPRPMMT401010UV01Organization() {
        return new PRPMMT401010UV01Organization();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ManufacturedProductOrganization }
     * 
     */
    public COCTMT290000UV06ManufacturedProductOrganization createCOCTMT290000UV06ManufacturedProductOrganization() {
        return new COCTMT290000UV06ManufacturedProductOrganization();
    }

    /**
     * Create an instance of {@link StrucDocLinkHtml }
     * 
     */
    public StrucDocLinkHtml createStrucDocLinkHtml() {
        return new StrucDocLinkHtml();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Overseer }
     * 
     */
    public MFMIMT700701UV01Overseer createMFMIMT700701UV01Overseer() {
        return new MFMIMT700701UV01Overseer();
    }

    /**
     * Create an instance of {@link UVPCO }
     * 
     */
    public UVPCO createUVPCO() {
        return new UVPCO();
    }

    /**
     * Create an instance of {@link COCTMT260003UVSubject }
     * 
     */
    public COCTMT260003UVSubject createCOCTMT260003UVSubject() {
        return new COCTMT260003UVSubject();
    }

    /**
     * Create an instance of {@link PRPAIN201312UV02MFMIMT700701UV01RegistrationEvent }
     * 
     */
    public PRPAIN201312UV02MFMIMT700701UV01RegistrationEvent createPRPAIN201312UV02MFMIMT700701UV01RegistrationEvent() {
        return new PRPAIN201312UV02MFMIMT700701UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01PrivilegeCategorization }
     * 
     */
    public PRPMMT406110UV01PrivilegeCategorization createPRPMMT406110UV01PrivilegeCategorization() {
        return new PRPMMT406110UV01PrivilegeCategorization();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01DataEnterer }
     * 
     */
    public PRPMMT401010UV01DataEnterer createPRPMMT401010UV01DataEnterer() {
        return new PRPMMT401010UV01DataEnterer();
    }

    /**
     * Create an instance of {@link UVPCD }
     * 
     */
    public UVPCD createUVPCD() {
        return new UVPCD();
    }

    /**
     * Create an instance of {@link COCTMT030202UV07BirthPlace }
     * 
     */
    public COCTMT030202UV07BirthPlace createCOCTMT030202UV07BirthPlace() {
        return new COCTMT030202UV07BirthPlace();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSuperContent }
     * 
     */
    public COCTMT230100UVSuperContent createCOCTMT230100UVSuperContent() {
        return new COCTMT230100UVSuperContent();
    }

    /**
     * Create an instance of {@link DSETREAL }
     * 
     */
    public DSETREAL createDSETREAL() {
        return new DSETREAL();
    }

    /**
     * Create an instance of {@link PRPMMT306810UV01Jurisdiction }
     * 
     */
    public PRPMMT306810UV01Jurisdiction createPRPMMT306810UV01Jurisdiction() {
        return new PRPMMT306810UV01Jurisdiction();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Employee }
     * 
     */
    public PRPAMT201303UV02Employee createPRPAMT201303UV02Employee() {
        return new PRPAMT201303UV02Employee();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Author }
     * 
     */
    public COCTMT600000UV06Author createCOCTMT600000UV06Author() {
        return new COCTMT600000UV06Author();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01PriorRegisteredRole }
     * 
     */
    public MFMIMT700711UV01PriorRegisteredRole createMFMIMT700711UV01PriorRegisteredRole() {
        return new MFMIMT700711UV01PriorRegisteredRole();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ProviderPerson }
     * 
     */
    public COCTMT290000UV06ProviderPerson createCOCTMT290000UV06ProviderPerson() {
        return new COCTMT290000UV06ProviderPerson();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Employee }
     * 
     */
    public PRPAMT201301UV02Employee createPRPAMT201301UV02Employee() {
        return new PRPAMT201301UV02Employee();
    }

    /**
     * Create an instance of {@link HISTII }
     * 
     */
    public HISTII createHISTII() {
        return new HISTII();
    }

    /**
     * Create an instance of {@link UVPBL }
     * 
     */
    public UVPBL createUVPBL() {
        return new UVPBL();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01AssignedEntity2 }
     * 
     */
    public PRPMMT309000UV01AssignedEntity2 createPRPMMT309000UV01AssignedEntity2() {
        return new PRPMMT309000UV01AssignedEntity2();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01IndirectTarget }
     * 
     */
    public PRPMMT401010UV01IndirectTarget createPRPMMT401010UV01IndirectTarget() {
        return new PRPMMT401010UV01IndirectTarget();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01Telecom }
     * 
     */
    public PRPMMT306010UV01Telecom createPRPMMT306010UV01Telecom() {
        return new PRPMMT306010UV01Telecom();
    }

    /**
     * Create an instance of {@link COCTMT530000UVPerformer }
     * 
     */
    public COCTMT530000UVPerformer createCOCTMT530000UVPerformer() {
        return new COCTMT530000UVPerformer();
    }

    /**
     * Create an instance of {@link COCTMT250000UV03TestReagent }
     * 
     */
    public COCTMT250000UV03TestReagent createCOCTMT250000UV03TestReagent() {
        return new COCTMT250000UV03TestReagent();
    }

    /**
     * Create an instance of {@link COCTMT090002UV01Person }
     * 
     */
    public COCTMT090002UV01Person createCOCTMT090002UV01Person() {
        return new COCTMT090002UV01Person();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02PatientTelecom }
     * 
     */
    public PRPAMT201306UV02PatientTelecom createPRPAMT201306UV02PatientTelecom() {
        return new PRPAMT201306UV02PatientTelecom();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09SpecimenCollectionProcess }
     * 
     */
    public COCTMT080000UV09SpecimenCollectionProcess createCOCTMT080000UV09SpecimenCollectionProcess() {
        return new COCTMT080000UV09SpecimenCollectionProcess();
    }

    /**
     * Create an instance of {@link UVPAD }
     * 
     */
    public UVPAD createUVPAD() {
        return new UVPAD();
    }

    /**
     * Create an instance of {@link BAGTEL }
     * 
     */
    public BAGTEL createBAGTEL() {
        return new BAGTEL();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Note }
     * 
     */
    public PRPMMT401010UV01Note createPRPMMT401010UV01Note() {
        return new PRPMMT401010UV01Note();
    }

    /**
     * Create an instance of {@link NPPDTEL }
     * 
     */
    public NPPDTEL createNPPDTEL() {
        return new NPPDTEL();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Overseer }
     * 
     */
    public MFMIMT700711UV01Overseer createMFMIMT700711UV01Overseer() {
        return new MFMIMT700711UV01Overseer();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Subject5 }
     * 
     */
    public COCTMT080000UV09Subject5 createCOCTMT080000UV09Subject5() {
        return new COCTMT080000UV09Subject5();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Subject2 }
     * 
     */
    public COCTMT080000UV09Subject2 createCOCTMT080000UV09Subject2() {
        return new COCTMT080000UV09Subject2();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Subject1 }
     * 
     */
    public COCTMT080000UV09Subject1 createCOCTMT080000UV09Subject1() {
        return new COCTMT080000UV09Subject1();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Subject4 }
     * 
     */
    public COCTMT080000UV09Subject4 createCOCTMT080000UV09Subject4() {
        return new COCTMT080000UV09Subject4();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Subject3 }
     * 
     */
    public COCTMT080000UV09Subject3 createCOCTMT080000UV09Subject3() {
        return new COCTMT080000UV09Subject3();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01SequelTo }
     * 
     */
    public PRPMMT306110UV01SequelTo createPRPMMT306110UV01SequelTo() {
        return new PRPMMT306110UV01SequelTo();
    }

    /**
     * Create an instance of {@link PRPMIN406110UV01MFMIMT700711UV01Subject1 }
     * 
     */
    public PRPMIN406110UV01MFMIMT700711UV01Subject1 createPRPMIN406110UV01MFMIMT700711UV01Subject1() {
        return new PRPMIN406110UV01MFMIMT700711UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPMIN406110UV01MFMIMT700711UV01Subject2 }
     * 
     */
    public PRPMIN406110UV01MFMIMT700711UV01Subject2 createPRPMIN406110UV01MFMIMT700711UV01Subject2() {
        return new PRPMIN406110UV01MFMIMT700711UV01Subject2();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06PertinentInformation }
     * 
     */
    public COCTMT600000UV06PertinentInformation createCOCTMT600000UV06PertinentInformation() {
        return new COCTMT600000UV06PertinentInformation();
    }

    /**
     * Create an instance of {@link MO }
     * 
     */
    public MO createMO() {
        return new MO();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01InformRequest }
     * 
     */
    public PRPMMT306110UV01InformRequest createPRPMMT306110UV01InformRequest() {
        return new PRPMMT306110UV01InformRequest();
    }

    /**
     * Create an instance of {@link COCTMT260003UVSeverityObservation }
     * 
     */
    public COCTMT260003UVSeverityObservation createCOCTMT260003UVSeverityObservation() {
        return new COCTMT260003UVSeverityObservation();
    }

    /**
     * Create an instance of {@link QSITS }
     * 
     */
    public QSITS createQSITS() {
        return new QSITS();
    }

    /**
     * Create an instance of {@link LISTRTO }
     * 
     */
    public LISTRTO createLISTRTO() {
        return new LISTRTO();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06PersonalRelationship }
     * 
     */
    public COCTMT510000UV06PersonalRelationship createCOCTMT510000UV06PersonalRelationship() {
        return new COCTMT510000UV06PersonalRelationship();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01InformDefinition }
     * 
     */
    public PRPMMT301010UV01InformDefinition createPRPMMT301010UV01InformDefinition() {
        return new PRPMMT301010UV01InformDefinition();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01PrincipalOrganization }
     * 
     */
    public PRPMMT306110UV01PrincipalOrganization createPRPMMT306110UV01PrincipalOrganization() {
        return new PRPMMT306110UV01PrincipalOrganization();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02NonPersonLivingSubject }
     * 
     */
    public PRPAMT201310UV02NonPersonLivingSubject createPRPAMT201310UV02NonPersonLivingSubject() {
        return new PRPAMT201310UV02NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06PrescriptionOrder }
     * 
     */
    public COCTMT600000UV06PrescriptionOrder createCOCTMT600000UV06PrescriptionOrder() {
        return new COCTMT600000UV06PrescriptionOrder();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Person }
     * 
     */
    public COCTMT510000UV06Person createCOCTMT510000UV06Person() {
        return new COCTMT510000UV06Person();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01LanguageCommunication }
     * 
     */
    public PRPMMT306110UV01LanguageCommunication createPRPMMT306110UV01LanguageCommunication() {
        return new PRPMMT306110UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04ManufacturedProduct }
     * 
     */
    public COCTMT490000UV04ManufacturedProduct createCOCTMT490000UV04ManufacturedProduct() {
        return new COCTMT490000UV04ManufacturedProduct();
    }

    /**
     * Create an instance of {@link COCTMT530000UVMaterialPart }
     * 
     */
    public COCTMT530000UVMaterialPart createCOCTMT530000UVMaterialPart() {
        return new COCTMT530000UVMaterialPart();
    }

    /**
     * Create an instance of {@link HISTMO }
     * 
     */
    public HISTMO createHISTMO() {
        return new HISTMO();
    }

    /**
     * Create an instance of {@link COCTMT260003UVConsumable }
     * 
     */
    public COCTMT260003UVConsumable createCOCTMT260003UVConsumable() {
        return new COCTMT260003UVConsumable();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04Location }
     * 
     */
    public COCTMT310000UV04Location createCOCTMT310000UV04Location() {
        return new COCTMT310000UV04Location();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Injury }
     * 
     */
    public COCTMT290000UV06Injury createCOCTMT290000UV06Injury() {
        return new COCTMT290000UV06Injury();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01SequelTo }
     * 
     */
    public PRPMMT403010UV01SequelTo createPRPMMT403010UV01SequelTo() {
        return new PRPMMT403010UV01SequelTo();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01ObservationEvent }
     * 
     */
    public PRPMMT303010UV01ObservationEvent createPRPMMT303010UV01ObservationEvent() {
        return new PRPMMT303010UV01ObservationEvent();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01Author2 }
     * 
     */
    public MFMIMT700721UV01Author2 createMFMIMT700721UV01Author2() {
        return new MFMIMT700721UV01Author2();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Reason }
     * 
     */
    public COCTMT300000UV04Reason createCOCTMT300000UV04Reason() {
        return new COCTMT300000UV04Reason();
    }

    /**
     * Create an instance of {@link COCTMT210000UV02EndogenousContent }
     * 
     */
    public COCTMT210000UV02EndogenousContent createCOCTMT210000UV02EndogenousContent() {
        return new COCTMT210000UV02EndogenousContent();
    }

    /**
     * Create an instance of {@link PQ }
     * 
     */
    public PQ createPQ() {
        return new PQ();
    }

    /**
     * Create an instance of {@link PRPMMT306910UV01Jurisdiction }
     * 
     */
    public PRPMMT306910UV01Jurisdiction createPRPMMT306910UV01Jurisdiction() {
        return new PRPMMT306910UV01Jurisdiction();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Organization }
     * 
     */
    public PRPMMT301010UV01Organization createPRPMMT301010UV01Organization() {
        return new PRPMMT301010UV01Organization();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoveredParty }
     * 
     */
    public COCTMT510000UV06CoveredParty createCOCTMT510000UV06CoveredParty() {
        return new COCTMT510000UV06CoveredParty();
    }

    /**
     * Create an instance of {@link PRPAMT201307UV02PatientIdentifier }
     * 
     */
    public PRPAMT201307UV02PatientIdentifier createPRPAMT201307UV02PatientIdentifier() {
        return new PRPAMT201307UV02PatientIdentifier();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01Overseer }
     * 
     */
    public MFMIMT700721UV01Overseer createMFMIMT700721UV01Overseer() {
        return new MFMIMT700721UV01Overseer();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01PrimaryPerformer3 }
     * 
     */
    public PRPMMT303010UV01PrimaryPerformer3 createPRPMMT303010UV01PrimaryPerformer3() {
        return new PRPMMT303010UV01PrimaryPerformer3();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01PrimaryPerformer3 }
     * 
     */
    public PRPMMT401010UV01PrimaryPerformer3 createPRPMMT401010UV01PrimaryPerformer3() {
        return new PRPMMT401010UV01PrimaryPerformer3();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01SortControl }
     * 
     */
    public PRPMMT306010UV01SortControl createPRPMMT306010UV01SortControl() {
        return new PRPMMT306010UV01SortControl();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Privilege }
     * 
     */
    public PRPMMT401010UV01Privilege createPRPMMT401010UV01Privilege() {
        return new PRPMMT401010UV01Privilege();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Product }
     * 
     */
    public COCTMT300000UV04Product createCOCTMT300000UV04Product() {
        return new COCTMT300000UV04Product();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Place }
     * 
     */
    public MCCIMT000300UV01Place createMCCIMT000300UV01Place() {
        return new MCCIMT000300UV01Place();
    }

    /**
     * Create an instance of {@link COCTMT150000UV02Organization }
     * 
     */
    public COCTMT150000UV02Organization createCOCTMT150000UV02Organization() {
        return new COCTMT150000UV02Organization();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04MedicalService }
     * 
     */
    public COCTMT310000UV04MedicalService createCOCTMT310000UV04MedicalService() {
        return new COCTMT310000UV04MedicalService();
    }

    /**
     * Create an instance of {@link LISTINT }
     * 
     */
    public LISTINT createLISTINT() {
        return new LISTINT();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01Status }
     * 
     */
    public PRPMMT306010UV01Status createPRPMMT306010UV01Status() {
        return new PRPMMT306010UV01Status();
    }

    /**
     * Create an instance of {@link PRPAIN201313UV02MFMIMT700721UV01Subject1 }
     * 
     */
    public PRPAIN201313UV02MFMIMT700721UV01Subject1 createPRPAIN201313UV02MFMIMT700721UV01Subject1() {
        return new PRPAIN201313UV02MFMIMT700721UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01DisciplinaryAction }
     * 
     */
    public PRPMMT309000UV01DisciplinaryAction createPRPMMT309000UV01DisciplinaryAction() {
        return new PRPMMT309000UV01DisciplinaryAction();
    }

    /**
     * Create an instance of {@link PRPAIN201313UV02MFMIMT700721UV01Subject2 }
     * 
     */
    public PRPAIN201313UV02MFMIMT700721UV01Subject2 createPRPAIN201313UV02MFMIMT700721UV01Subject2() {
        return new PRPAIN201313UV02MFMIMT700721UV01Subject2();
    }

    /**
     * Create an instance of {@link UVPTEL }
     * 
     */
    public UVPTEL createUVPTEL() {
        return new UVPTEL();
    }

    /**
     * Create an instance of {@link COCTMT090303UV01Device }
     * 
     */
    public COCTMT090303UV01Device createCOCTMT090303UV01Device() {
        return new COCTMT090303UV01Device();
    }

    /**
     * Create an instance of {@link COCTMT710000UV07LocatedEntityHasParts }
     * 
     */
    public COCTMT710000UV07LocatedEntityHasParts createCOCTMT710000UV07LocatedEntityHasParts() {
        return new COCTMT710000UV07LocatedEntityHasParts();
    }

    /**
     * Create an instance of {@link SC }
     * 
     */
    public SC createSC() {
        return new SC();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Jurisdiction }
     * 
     */
    public PRPMMT403010UV01Jurisdiction createPRPMMT403010UV01Jurisdiction() {
        return new PRPMMT403010UV01Jurisdiction();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01AssignedEntity }
     * 
     */
    public PRPMMT306110UV01AssignedEntity createPRPMMT306110UV01AssignedEntity() {
        return new PRPMMT306110UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04AccomodationSupplied }
     * 
     */
    public COCTMT310000UV04AccomodationSupplied createCOCTMT310000UV04AccomodationSupplied() {
        return new COCTMT310000UV04AccomodationSupplied();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01RoleTransport }
     * 
     */
    public COCTMT060000UV01RoleTransport createCOCTMT060000UV01RoleTransport() {
        return new COCTMT060000UV01RoleTransport();
    }

    /**
     * Create an instance of {@link PRPAIN201311UV02MFMIMT700721UV01Subject1 }
     * 
     */
    public PRPAIN201311UV02MFMIMT700721UV01Subject1 createPRPAIN201311UV02MFMIMT700721UV01Subject1() {
        return new PRPAIN201311UV02MFMIMT700721UV01Subject1();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Performer }
     * 
     */
    public COCTMT600000UV06Performer createCOCTMT600000UV06Performer() {
        return new COCTMT600000UV06Performer();
    }

    /**
     * Create an instance of {@link PRPAIN201311UV02MFMIMT700721UV01Subject2 }
     * 
     */
    public PRPAIN201311UV02MFMIMT700721UV01Subject2 createPRPAIN201311UV02MFMIMT700721UV01Subject2() {
        return new PRPAIN201311UV02MFMIMT700721UV01Subject2();
    }

    /**
     * Create an instance of {@link COCTMT530000UVConditions }
     * 
     */
    public COCTMT530000UVConditions createCOCTMT530000UVConditions() {
        return new COCTMT530000UVConditions();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01AssignedEntity2 }
     * 
     */
    public PRPMMT303010UV01AssignedEntity2 createPRPMMT303010UV01AssignedEntity2() {
        return new PRPMMT303010UV01AssignedEntity2();
    }

    /**
     * Create an instance of {@link LISTREAL }
     * 
     */
    public LISTREAL createLISTREAL() {
        return new LISTREAL();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01AssignedEntity }
     * 
     */
    public PRPMMT309000UV01AssignedEntity createPRPMMT309000UV01AssignedEntity() {
        return new PRPMMT309000UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01DisciplinaryAction }
     * 
     */
    public PRPMMT306110UV01DisciplinaryAction createPRPMMT306110UV01DisciplinaryAction() {
        return new PRPMMT306110UV01DisciplinaryAction();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Benefit }
     * 
     */
    public COCTMT510000UV06Benefit createCOCTMT510000UV06Benefit() {
        return new COCTMT510000UV06Benefit();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01Device }
     * 
     */
    public COCTMT090000UV01Device createCOCTMT090000UV01Device() {
        return new COCTMT090000UV01Device();
    }

    /**
     * Create an instance of {@link PRPMIN301011UV01MFMIMT700721UV01RegistrationRequest }
     * 
     */
    public PRPMIN301011UV01MFMIMT700721UV01RegistrationRequest createPRPMIN301011UV01MFMIMT700721UV01RegistrationRequest() {
        return new PRPMIN301011UV01MFMIMT700721UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link COCTMT530000UVControlActEvent }
     * 
     */
    public COCTMT530000UVControlActEvent createCOCTMT530000UVControlActEvent() {
        return new COCTMT530000UVControlActEvent();
    }

    /**
     * Create an instance of {@link COCTMT150003UV03Organization }
     * 
     */
    public COCTMT150003UV03Organization createCOCTMT150003UV03Organization() {
        return new COCTMT150003UV03Organization();
    }

    /**
     * Create an instance of {@link QUQIMT021001UV01DataEnterer }
     * 
     */
    public QUQIMT021001UV01DataEnterer createQUQIMT021001UV01DataEnterer() {
        return new QUQIMT021001UV01DataEnterer();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01RoleClass }
     * 
     */
    public PRPMMT306010UV01RoleClass createPRPMMT306010UV01RoleClass() {
        return new PRPMMT306010UV01RoleClass();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01Subject }
     * 
     */
    public COCTMT060000UV01Subject createCOCTMT060000UV01Subject() {
        return new COCTMT060000UV01Subject();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01LicensedEntity }
     * 
     */
    public COCTMT090000UV01LicensedEntity createCOCTMT090000UV01LicensedEntity() {
        return new COCTMT090000UV01LicensedEntity();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02CareGiver }
     * 
     */
    public PRPAMT201303UV02CareGiver createPRPAMT201303UV02CareGiver() {
        return new PRPAMT201303UV02CareGiver();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01ResponsibleParty }
     * 
     */
    public PRPMMT401010UV01ResponsibleParty createPRPMMT401010UV01ResponsibleParty() {
        return new PRPMMT401010UV01ResponsibleParty();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02NonPersonLivingSubject }
     * 
     */
    public PRPAMT201302UV02NonPersonLivingSubject createPRPAMT201302UV02NonPersonLivingSubject() {
        return new PRPAMT201302UV02NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Organization }
     * 
     */
    public PRPMMT306110UV01Organization createPRPMMT306110UV01Organization() {
        return new PRPMMT306110UV01Organization();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Destination }
     * 
     */
    public COCTMT490000UV04Destination createCOCTMT490000UV04Destination() {
        return new COCTMT490000UV04Destination();
    }

    /**
     * Create an instance of {@link PRPAIN201314UV02MFMIMT700721UV01RegistrationRequest }
     * 
     */
    public PRPAIN201314UV02MFMIMT700721UV01RegistrationRequest createPRPAIN201314UV02MFMIMT700721UV01RegistrationRequest() {
        return new PRPAIN201314UV02MFMIMT700721UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02MatchWeight }
     * 
     */
    public PRPAMT201306UV02MatchWeight createPRPAMT201306UV02MatchWeight() {
        return new PRPAMT201306UV02MatchWeight();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Diagnosis }
     * 
     */
    public COCTMT490000UV04Diagnosis createCOCTMT490000UV04Diagnosis() {
        return new COCTMT490000UV04Diagnosis();
    }

    /**
     * Create an instance of {@link COCTMT230100UVRole }
     * 
     */
    public COCTMT230100UVRole createCOCTMT230100UVRole() {
        return new COCTMT230100UVRole();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Subject3 }
     * 
     */
    public COCTMT290000UV06Subject3 createCOCTMT290000UV06Subject3() {
        return new COCTMT290000UV06Subject3();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Subject2 }
     * 
     */
    public COCTMT290000UV06Subject2 createCOCTMT290000UV06Subject2() {
        return new COCTMT290000UV06Subject2();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01PrimaryPerformer3 }
     * 
     */
    public PRPMMT406110UV01PrimaryPerformer3 createPRPMMT406110UV01PrimaryPerformer3() {
        return new PRPMMT406110UV01PrimaryPerformer3();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02NonPersonLivingSubject }
     * 
     */
    public PRPAMT201304UV02NonPersonLivingSubject createPRPAMT201304UV02NonPersonLivingSubject() {
        return new PRPAMT201304UV02NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link COCTMT530000UVVerifier }
     * 
     */
    public COCTMT530000UVVerifier createCOCTMT530000UVVerifier() {
        return new COCTMT530000UVVerifier();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01Telecom }
     * 
     */
    public PRPMMT406010UV01Telecom createPRPMMT406010UV01Telecom() {
        return new PRPMMT406010UV01Telecom();
    }

    /**
     * Create an instance of {@link COCTMT530000UVMaterialKind2 }
     * 
     */
    public COCTMT530000UVMaterialKind2 createCOCTMT530000UVMaterialKind2() {
        return new COCTMT530000UVMaterialKind2();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06PolicyHolder }
     * 
     */
    public COCTMT510000UV06PolicyHolder createCOCTMT510000UV06PolicyHolder() {
        return new COCTMT510000UV06PolicyHolder();
    }

    /**
     * Create an instance of {@link XP }
     * 
     */
    public XP createXP() {
        return new XP();
    }

    /**
     * Create an instance of {@link UVPTS }
     * 
     */
    public UVPTS createUVPTS() {
        return new UVPTS();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Organization }
     * 
     */
    public COCTMT510000UV06Organization createCOCTMT510000UV06Organization() {
        return new COCTMT510000UV06Organization();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02AdministrativeObservation }
     * 
     */
    public PRPAMT201301UV02AdministrativeObservation createPRPAMT201301UV02AdministrativeObservation() {
        return new PRPAMT201301UV02AdministrativeObservation();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06AdministrativeDiagnosis }
     * 
     */
    public COCTMT290000UV06AdministrativeDiagnosis createCOCTMT290000UV06AdministrativeDiagnosis() {
        return new COCTMT290000UV06AdministrativeDiagnosis();
    }

    /**
     * Create an instance of {@link COCTMT090003UV01Person }
     * 
     */
    public COCTMT090003UV01Person createCOCTMT090003UV01Person() {
        return new COCTMT090003UV01Person();
    }

    /**
     * Create an instance of {@link UVPREAL }
     * 
     */
    public UVPREAL createUVPREAL() {
        return new UVPREAL();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01DataEnterer }
     * 
     */
    public PRPMMT406110UV01DataEnterer createPRPMMT406110UV01DataEnterer() {
        return new PRPMMT406110UV01DataEnterer();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09InformationRecipient }
     * 
     */
    public COCTMT080000UV09InformationRecipient createCOCTMT080000UV09InformationRecipient() {
        return new COCTMT080000UV09InformationRecipient();
    }

    /**
     * Create an instance of {@link NPPDTS }
     * 
     */
    public NPPDTS createNPPDTS() {
        return new NPPDTS();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Agent }
     * 
     */
    public MCCIMT000300UV01Agent createMCCIMT000300UV01Agent() {
        return new MCCIMT000300UV01Agent();
    }

    /**
     * Create an instance of {@link QSPTS }
     * 
     */
    public QSPTS createQSPTS() {
        return new QSPTS();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01RelatedTo }
     * 
     */
    public PRPMMT301010UV01RelatedTo createPRPMMT301010UV01RelatedTo() {
        return new PRPMMT301010UV01RelatedTo();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01RoleType }
     * 
     */
    public PRPMMT406010UV01RoleType createPRPMMT406010UV01RoleType() {
        return new PRPMMT406010UV01RoleType();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02ContactParty }
     * 
     */
    public PRPAMT201302UV02ContactParty createPRPAMT201302UV02ContactParty() {
        return new PRPAMT201302UV02ContactParty();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Location }
     * 
     */
    public PRPMMT406110UV01Location createPRPMMT406110UV01Location() {
        return new PRPMMT406110UV01Location();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04GuarantorOrganization }
     * 
     */
    public COCTMT670000UV04GuarantorOrganization createCOCTMT670000UV04GuarantorOrganization() {
        return new COCTMT670000UV04GuarantorOrganization();
    }

    /**
     * Create an instance of {@link COCTMT810000UVPerformer }
     * 
     */
    public COCTMT810000UVPerformer createCOCTMT810000UVPerformer() {
        return new COCTMT810000UVPerformer();
    }

    /**
     * Create an instance of {@link StrucDocList }
     * 
     */
    public StrucDocList createStrucDocList() {
        return new StrucDocList();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01InformDefinition }
     * 
     */
    public PRPMMT303010UV01InformDefinition createPRPMMT303010UV01InformDefinition() {
        return new PRPMMT303010UV01InformDefinition();
    }

    /**
     * Create an instance of {@link UVPSC }
     * 
     */
    public UVPSC createUVPSC() {
        return new UVPSC();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01Status }
     * 
     */
    public PRPMMT406010UV01Status createPRPMMT406010UV01Status() {
        return new PRPMMT406010UV01Status();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01PrincipalPerson }
     * 
     */
    public PRPMMT303010UV01PrincipalPerson createPRPMMT303010UV01PrincipalPerson() {
        return new PRPMMT303010UV01PrincipalPerson();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Guardian }
     * 
     */
    public PRPAMT201310UV02Guardian createPRPAMT201310UV02Guardian() {
        return new PRPAMT201310UV02Guardian();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Diagnosis }
     * 
     */
    public COCTMT600000UV06Diagnosis createCOCTMT600000UV06Diagnosis() {
        return new COCTMT600000UV06Diagnosis();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Reason }
     * 
     */
    public COCTMT290000UV06Reason createCOCTMT290000UV06Reason() {
        return new COCTMT290000UV06Reason();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09EntityInEntity }
     * 
     */
    public COCTMT080000UV09EntityInEntity createCOCTMT080000UV09EntityInEntity() {
        return new COCTMT080000UV09EntityInEntity();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Subject5 }
     * 
     */
    public COCTMT290000UV06Subject5 createCOCTMT290000UV06Subject5() {
        return new COCTMT290000UV06Subject5();
    }

    /**
     * Create an instance of {@link NPPDST }
     * 
     */
    public NPPDST createNPPDST() {
        return new NPPDST();
    }

    /**
     * Create an instance of {@link UVPST }
     * 
     */
    public UVPST createUVPST() {
        return new UVPST();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Location }
     * 
     */
    public PRPMMT306110UV01Location createPRPMMT306110UV01Location() {
        return new PRPMMT306110UV01Location();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01RoleType }
     * 
     */
    public PRPMMT306010UV01RoleType createPRPMMT306010UV01RoleType() {
        return new PRPMMT306010UV01RoleType();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01AssignedEntity2 }
     * 
     */
    public PRPMMT401010UV01AssignedEntity2 createPRPMMT401010UV01AssignedEntity2() {
        return new PRPMMT401010UV01AssignedEntity2();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01LanguageCommunication }
     * 
     */
    public COCTMT090100UV01LanguageCommunication createCOCTMT090100UV01LanguageCommunication() {
        return new COCTMT090100UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link PRPMIN301011UV01MFMIMT700721UV01Subject2 }
     * 
     */
    public PRPMIN301011UV01MFMIMT700721UV01Subject2 createPRPMIN301011UV01MFMIMT700721UV01Subject2() {
        return new PRPMIN301011UV01MFMIMT700721UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMIN301011UV01MFMIMT700721UV01Subject1 }
     * 
     */
    public PRPMIN301011UV01MFMIMT700721UV01Subject1 createPRPMIN301011UV01MFMIMT700721UV01Subject1() {
        return new PRPMIN301011UV01MFMIMT700721UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01ResponsibleParty }
     * 
     */
    public PRPMMT406110UV01ResponsibleParty createPRPMMT406110UV01ResponsibleParty() {
        return new PRPMMT406110UV01ResponsibleParty();
    }

    /**
     * Create an instance of {@link PRPMMT306910UV01AssignedEntity }
     * 
     */
    public PRPMMT306910UV01AssignedEntity createPRPMMT306910UV01AssignedEntity() {
        return new PRPMMT306910UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01QualifiedEntity }
     * 
     */
    public PRPMMT306110UV01QualifiedEntity createPRPMMT306110UV01QualifiedEntity() {
        return new PRPMMT306110UV01QualifiedEntity();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01CareGiver }
     * 
     */
    public COCTMT050000UV01CareGiver createCOCTMT050000UV01CareGiver() {
        return new COCTMT050000UV01CareGiver();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04PertinentInformation1 }
     * 
     */
    public COCTMT740000UV04PertinentInformation1 createCOCTMT740000UV04PertinentInformation1() {
        return new COCTMT740000UV04PertinentInformation1();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04PertinentInformation2 }
     * 
     */
    public COCTMT740000UV04PertinentInformation2 createCOCTMT740000UV04PertinentInformation2() {
        return new COCTMT740000UV04PertinentInformation2();
    }

    /**
     * Create an instance of {@link PRPMMT306810UV01DOB }
     * 
     */
    public PRPMMT306810UV01DOB createPRPMMT306810UV01DOB() {
        return new PRPMMT306810UV01DOB();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02CareGiver }
     * 
     */
    public PRPAMT201301UV02CareGiver createPRPAMT201301UV02CareGiver() {
        return new PRPAMT201301UV02CareGiver();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01ServiceDeliveryLocation }
     * 
     */
    public PRPMMT403010UV01ServiceDeliveryLocation createPRPMMT403010UV01ServiceDeliveryLocation() {
        return new PRPMMT403010UV01ServiceDeliveryLocation();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01ObservationEvent }
     * 
     */
    public PRPMMT306110UV01ObservationEvent createPRPMMT306110UV01ObservationEvent() {
        return new PRPMMT306110UV01ObservationEvent();
    }

    /**
     * Create an instance of {@link COCTMT530000UVOrganizer }
     * 
     */
    public COCTMT530000UVOrganizer createCOCTMT530000UVOrganizer() {
        return new COCTMT530000UVOrganizer();
    }

    /**
     * Create an instance of {@link GLISTREAL }
     * 
     */
    public GLISTREAL createGLISTREAL() {
        return new GLISTREAL();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06BillableClinicalService }
     * 
     */
    public COCTMT290000UV06BillableClinicalService createCOCTMT290000UV06BillableClinicalService() {
        return new COCTMT290000UV06BillableClinicalService();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01PriorRegisteredAct }
     * 
     */
    public MFMIMT700721UV01PriorRegisteredAct createMFMIMT700721UV01PriorRegisteredAct() {
        return new MFMIMT700721UV01PriorRegisteredAct();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Precondition }
     * 
     */
    public COCTMT510000UV06Precondition createCOCTMT510000UV06Precondition() {
        return new COCTMT510000UV06Precondition();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06ReplacementOf }
     * 
     */
    public COCTMT510000UV06ReplacementOf createCOCTMT510000UV06ReplacementOf() {
        return new COCTMT510000UV06ReplacementOf();
    }

    /**
     * Create an instance of {@link UVPPQ }
     * 
     */
    public UVPPQ createUVPPQ() {
        return new UVPPQ();
    }

    /**
     * Create an instance of {@link QSPPQ }
     * 
     */
    public QSPPQ createQSPPQ() {
        return new QSPPQ();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Receiver }
     * 
     */
    public PRPMMT406110UV01Receiver createPRPMMT406110UV01Receiver() {
        return new PRPMMT406110UV01Receiver();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Custodian }
     * 
     */
    public PRPMMT309000UV01Custodian createPRPMMT309000UV01Custodian() {
        return new PRPMMT309000UV01Custodian();
    }

    /**
     * Create an instance of {@link COCTMT150007UVContactParty }
     * 
     */
    public COCTMT150007UVContactParty createCOCTMT150007UVContactParty() {
        return new COCTMT150007UVContactParty();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01PrivilegeCategorization }
     * 
     */
    public PRPMMT309000UV01PrivilegeCategorization createPRPMMT309000UV01PrivilegeCategorization() {
        return new PRPMMT309000UV01PrivilegeCategorization();
    }

    /**
     * Create an instance of {@link COCTMT230100UVMedicineManufacturer }
     * 
     */
    public COCTMT230100UVMedicineManufacturer createCOCTMT230100UVMedicineManufacturer() {
        return new COCTMT230100UVMedicineManufacturer();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01ControlActEvent }
     * 
     */
    public PRPMMT403010UV01ControlActEvent createPRPMMT403010UV01ControlActEvent() {
        return new PRPMMT403010UV01ControlActEvent();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Origin }
     * 
     */
    public COCTMT290000UV06Origin createCOCTMT290000UV06Origin() {
        return new COCTMT290000UV06Origin();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01ResponseObject }
     * 
     */
    public PRPMMT406010UV01ResponseObject createPRPMMT406010UV01ResponseObject() {
        return new PRPMMT406010UV01ResponseObject();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06SpecimenCollectionEvent }
     * 
     */
    public COCTMT290000UV06SpecimenCollectionEvent createCOCTMT290000UV06SpecimenCollectionEvent() {
        return new COCTMT290000UV06SpecimenCollectionEvent();
    }

    /**
     * Create an instance of {@link PRPMIN406110UV01MFMIMT700711UV01RegistrationEvent }
     * 
     */
    public PRPMIN406110UV01MFMIMT700711UV01RegistrationEvent createPRPMIN406110UV01MFMIMT700711UV01RegistrationEvent() {
        return new PRPMIN406110UV01MFMIMT700711UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01TargetMessage }
     * 
     */
    public MCCIMT000200UV01TargetMessage createMCCIMT000200UV01TargetMessage() {
        return new MCCIMT000200UV01TargetMessage();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Note }
     * 
     */
    public PRPMMT403010UV01Note createPRPMMT403010UV01Note() {
        return new PRPMMT403010UV01Note();
    }

    /**
     * Create an instance of {@link PRPMMT306910UV01PrincipalPerson }
     * 
     */
    public PRPMMT306910UV01PrincipalPerson createPRPMMT306910UV01PrincipalPerson() {
        return new PRPMMT306910UV01PrincipalPerson();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01Location }
     * 
     */
    public PRPMMT409000UV01Location createPRPMMT409000UV01Location() {
        return new PRPMMT409000UV01Location();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Custodian }
     * 
     */
    public PRPMMT406110UV01Custodian createPRPMMT406110UV01Custodian() {
        return new PRPMMT406110UV01Custodian();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01ObservationEvent }
     * 
     */
    public PRPMMT409000UV01ObservationEvent createPRPMMT409000UV01ObservationEvent() {
        return new PRPMMT409000UV01ObservationEvent();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04PertinentInformation }
     * 
     */
    public COCTMT300000UV04PertinentInformation createCOCTMT300000UV04PertinentInformation() {
        return new COCTMT300000UV04PertinentInformation();
    }

    /**
     * Create an instance of {@link COCTMT530000UVAdministerableMaterial }
     * 
     */
    public COCTMT530000UVAdministerableMaterial createCOCTMT530000UVAdministerableMaterial() {
        return new COCTMT530000UVAdministerableMaterial();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01RoleActivation }
     * 
     */
    public PRPMMT301010UV01RoleActivation createPRPMMT301010UV01RoleActivation() {
        return new PRPMMT301010UV01RoleActivation();
    }

    /**
     * Create an instance of {@link QUQIMT021001UV01AuthorOrPerformer }
     * 
     */
    public QUQIMT021001UV01AuthorOrPerformer createQUQIMT021001UV01AuthorOrPerformer() {
        return new QUQIMT021001UV01AuthorOrPerformer();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02OtherIDs }
     * 
     */
    public PRPAMT201302UV02OtherIDs createPRPAMT201302UV02OtherIDs() {
        return new PRPAMT201302UV02OtherIDs();
    }

    /**
     * Create an instance of {@link COCTMT590000UVAnnotation }
     * 
     */
    public COCTMT590000UVAnnotation createCOCTMT590000UVAnnotation() {
        return new COCTMT590000UVAnnotation();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01HealthCareProvider }
     * 
     */
    public PRPMMT306110UV01HealthCareProvider createPRPMMT306110UV01HealthCareProvider() {
        return new PRPMMT306110UV01HealthCareProvider();
    }

    /**
     * Create an instance of {@link COCTMT230100UVIngredient }
     * 
     */
    public COCTMT230100UVIngredient createCOCTMT230100UVIngredient() {
        return new COCTMT230100UVIngredient();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02CoveredParty }
     * 
     */
    public PRPAMT201310UV02CoveredParty createPRPAMT201310UV02CoveredParty() {
        return new PRPAMT201310UV02CoveredParty();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Subject3 }
     * 
     */
    public COCTMT510000UV06Subject3 createCOCTMT510000UV06Subject3() {
        return new COCTMT510000UV06Subject3();
    }

    /**
     * Create an instance of {@link SDTEXT }
     * 
     */
    public SDTEXT createSDTEXT() {
        return new SDTEXT();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06IndirectAuthorithyOver }
     * 
     */
    public COCTMT510000UV06IndirectAuthorithyOver createCOCTMT510000UV06IndirectAuthorithyOver() {
        return new COCTMT510000UV06IndirectAuthorithyOver();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Jurisdiction }
     * 
     */
    public PRPMMT301010UV01Jurisdiction createPRPMMT301010UV01Jurisdiction() {
        return new PRPMMT301010UV01Jurisdiction();
    }

    /**
     * Create an instance of {@link UVPMO }
     * 
     */
    public UVPMO createUVPMO() {
        return new UVPMO();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01InformRequest }
     * 
     */
    public PRPMMT301010UV01InformRequest createPRPMMT301010UV01InformRequest() {
        return new PRPMMT301010UV01InformRequest();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01LicensedEntity }
     * 
     */
    public PRPMMT403010UV01LicensedEntity createPRPMMT403010UV01LicensedEntity() {
        return new PRPMMT403010UV01LicensedEntity();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02LanguageCommunication }
     * 
     */
    public PRPAMT201303UV02LanguageCommunication createPRPAMT201303UV02LanguageCommunication() {
        return new PRPAMT201303UV02LanguageCommunication();
    }

    /**
     * Create an instance of {@link LISTST }
     * 
     */
    public LISTST createLISTST() {
        return new LISTST();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Device }
     * 
     */
    public MCCIMT000300UV01Device createMCCIMT000300UV01Device() {
        return new MCCIMT000300UV01Device();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04PertinentInformation }
     * 
     */
    public COCTMT490000UV04PertinentInformation createCOCTMT490000UV04PertinentInformation() {
        return new COCTMT490000UV04PertinentInformation();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05Author }
     * 
     */
    public COCTMT960000UV05Author createCOCTMT960000UV05Author() {
        return new COCTMT960000UV05Author();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04ResponsibleParty }
     * 
     */
    public COCTMT740000UV04ResponsibleParty createCOCTMT740000UV04ResponsibleParty() {
        return new COCTMT740000UV04ResponsibleParty();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01AssignedEntity }
     * 
     */
    public COCTMT090000UV01AssignedEntity createCOCTMT090000UV01AssignedEntity() {
        return new COCTMT090000UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Definition }
     * 
     */
    public MFMIMT700701UV01Definition createMFMIMT700701UV01Definition() {
        return new MFMIMT700701UV01Definition();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Part }
     * 
     */
    public PRPMMT301010UV01Part createPRPMMT301010UV01Part() {
        return new PRPMMT301010UV01Part();
    }

    /**
     * Create an instance of {@link COCTMT820000UVHealthCareProvider }
     * 
     */
    public COCTMT820000UVHealthCareProvider createCOCTMT820000UVHealthCareProvider() {
        return new COCTMT820000UVHealthCareProvider();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Performer }
     * 
     */
    public COCTMT290000UV06Performer createCOCTMT290000UV06Performer() {
        return new COCTMT290000UV06Performer();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Custodian }
     * 
     */
    public MFMIMT700711UV01Custodian createMFMIMT700711UV01Custodian() {
        return new MFMIMT700711UV01Custodian();
    }

    /**
     * Create an instance of {@link LISTSC }
     * 
     */
    public LISTSC createLISTSC() {
        return new LISTSC();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectBirthPlaceName }
     * 
     */
    public PRPAMT201306UV02LivingSubjectBirthPlaceName createPRPAMT201306UV02LivingSubjectBirthPlaceName() {
        return new PRPAMT201306UV02LivingSubjectBirthPlaceName();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01RelatedTo }
     * 
     */
    public PRPMMT306110UV01RelatedTo createPRPMMT306110UV01RelatedTo() {
        return new PRPMMT306110UV01RelatedTo();
    }

    /**
     * Create an instance of {@link COCTMT530000UVDataEnterer }
     * 
     */
    public COCTMT530000UVDataEnterer createCOCTMT530000UVDataEnterer() {
        return new COCTMT530000UVDataEnterer();
    }

    /**
     * Create an instance of {@link COCTMT530000UVCriterion }
     * 
     */
    public COCTMT530000UVCriterion createCOCTMT530000UVCriterion() {
        return new COCTMT530000UVCriterion();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoverageCharge }
     * 
     */
    public COCTMT510000UV06CoverageCharge createCOCTMT510000UV06CoverageCharge() {
        return new COCTMT510000UV06CoverageCharge();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Subject3 }
     * 
     */
    public MFMIMT700711UV01Subject3 createMFMIMT700711UV01Subject3() {
        return new MFMIMT700711UV01Subject3();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Subject4 }
     * 
     */
    public MFMIMT700711UV01Subject4 createMFMIMT700711UV01Subject4() {
        return new MFMIMT700711UV01Subject4();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01TerritorialAuthority }
     * 
     */
    public PRPMMT303010UV01TerritorialAuthority createPRPMMT303010UV01TerritorialAuthority() {
        return new PRPMMT303010UV01TerritorialAuthority();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01ContactParty }
     * 
     */
    public COCTMT050000UV01ContactParty createCOCTMT050000UV01ContactParty() {
        return new COCTMT050000UV01ContactParty();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ManufacturedProduct }
     * 
     */
    public COCTMT290000UV06ManufacturedProduct createCOCTMT290000UV06ManufacturedProduct() {
        return new COCTMT290000UV06ManufacturedProduct();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01PrincipalPerson }
     * 
     */
    public PRPMMT309000UV01PrincipalPerson createPRPMMT309000UV01PrincipalPerson() {
        return new PRPMMT309000UV01PrincipalPerson();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01Transportation }
     * 
     */
    public COCTMT060000UV01Transportation createCOCTMT060000UV01Transportation() {
        return new COCTMT060000UV01Transportation();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01TargetMessage }
     * 
     */
    public MCCIMT000300UV01TargetMessage createMCCIMT000300UV01TargetMessage() {
        return new MCCIMT000300UV01TargetMessage();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01InformationRecipient }
     * 
     */
    public MFMIMT700711UV01InformationRecipient createMFMIMT700711UV01InformationRecipient() {
        return new MFMIMT700711UV01InformationRecipient();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Subject7 }
     * 
     */
    public PRPMMT306110UV01Subject7 createPRPMMT306110UV01Subject7() {
        return new PRPMMT306110UV01Subject7();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Subject6 }
     * 
     */
    public PRPMMT306110UV01Subject6 createPRPMMT306110UV01Subject6() {
        return new PRPMMT306110UV01Subject6();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Subject9 }
     * 
     */
    public PRPMMT306110UV01Subject9 createPRPMMT306110UV01Subject9() {
        return new PRPMMT306110UV01Subject9();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Subject8 }
     * 
     */
    public PRPMMT306110UV01Subject8 createPRPMMT306110UV01Subject8() {
        return new PRPMMT306110UV01Subject8();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Subject3 }
     * 
     */
    public PRPMMT306110UV01Subject3 createPRPMMT306110UV01Subject3() {
        return new PRPMMT306110UV01Subject3();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Subject2 }
     * 
     */
    public PRPMMT306110UV01Subject2 createPRPMMT306110UV01Subject2() {
        return new PRPMMT306110UV01Subject2();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01Organization }
     * 
     */
    public COCTMT090000UV01Organization createCOCTMT090000UV01Organization() {
        return new COCTMT090000UV01Organization();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Subject5 }
     * 
     */
    public PRPMMT306110UV01Subject5 createPRPMMT306110UV01Subject5() {
        return new PRPMMT306110UV01Subject5();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Subject4 }
     * 
     */
    public PRPMMT306110UV01Subject4 createPRPMMT306110UV01Subject4() {
        return new PRPMMT306110UV01Subject4();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01ProviderAddress }
     * 
     */
    public PRPMMT306010UV01ProviderAddress createPRPMMT306010UV01ProviderAddress() {
        return new PRPMMT306010UV01ProviderAddress();
    }

    /**
     * Create an instance of {@link LISTTS }
     * 
     */
    public LISTTS createLISTTS() {
        return new LISTTS();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Affiliate }
     * 
     */
    public PRPMMT303010UV01Affiliate createPRPMMT303010UV01Affiliate() {
        return new PRPMMT303010UV01Affiliate();
    }

    /**
     * Create an instance of {@link COCTMT530000UVComponent }
     * 
     */
    public COCTMT530000UVComponent createCOCTMT530000UVComponent() {
        return new COCTMT530000UVComponent();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01RoutedDocType }
     * 
     */
    public PRPMMT306010UV01RoutedDocType createPRPMMT306010UV01RoutedDocType() {
        return new PRPMMT306010UV01RoutedDocType();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Member }
     * 
     */
    public PRPMMT403010UV01Member createPRPMMT403010UV01Member() {
        return new PRPMMT403010UV01Member();
    }

    /**
     * Create an instance of {@link COCTMT260003UVLocation }
     * 
     */
    public COCTMT260003UVLocation createCOCTMT260003UVLocation() {
        return new COCTMT260003UVLocation();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01PrincipalOrganization }
     * 
     */
    public PRPMMT403010UV01PrincipalOrganization createPRPMMT403010UV01PrincipalOrganization() {
        return new PRPMMT403010UV01PrincipalOrganization();
    }

    /**
     * Create an instance of {@link QUQIMT021001UV01Overseer }
     * 
     */
    public QUQIMT021001UV01Overseer createQUQIMT021001UV01Overseer() {
        return new QUQIMT021001UV01Overseer();
    }

    /**
     * Create an instance of {@link QSSPQ }
     * 
     */
    public QSSPQ createQSSPQ() {
        return new QSSPQ();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01QualifiedEntity }
     * 
     */
    public PRPMMT401010UV01QualifiedEntity createPRPMMT401010UV01QualifiedEntity() {
        return new PRPMMT401010UV01QualifiedEntity();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01SequelTo }
     * 
     */
    public PRPMMT401010UV01SequelTo createPRPMMT401010UV01SequelTo() {
        return new PRPMMT401010UV01SequelTo();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01PrimaryPerformer3 }
     * 
     */
    public PRPMMT301010UV01PrimaryPerformer3 createPRPMMT301010UV01PrimaryPerformer3() {
        return new PRPMMT301010UV01PrimaryPerformer3();
    }

    /**
     * Create an instance of {@link IVLINT }
     * 
     */
    public IVLINT createIVLINT() {
        return new IVLINT();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06PrimaryPerformer }
     * 
     */
    public COCTMT510000UV06PrimaryPerformer createCOCTMT510000UV06PrimaryPerformer() {
        return new COCTMT510000UV06PrimaryPerformer();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01PrivilegeCategorization }
     * 
     */
    public PRPMMT403010UV01PrivilegeCategorization createPRPMMT403010UV01PrivilegeCategorization() {
        return new PRPMMT403010UV01PrivilegeCategorization();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01DataEnterer }
     * 
     */
    public PRPMMT403010UV01DataEnterer createPRPMMT403010UV01DataEnterer() {
        return new PRPMMT403010UV01DataEnterer();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Nation }
     * 
     */
    public PRPAMT201304UV02Nation createPRPAMT201304UV02Nation() {
        return new PRPAMT201304UV02Nation();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Place }
     * 
     */
    public PRPMMT306110UV01Place createPRPMMT306110UV01Place() {
        return new PRPMMT306110UV01Place();
    }

    /**
     * Create an instance of {@link StrucDocTable }
     * 
     */
    public StrucDocTable createStrucDocTable() {
        return new StrucDocTable();
    }

    /**
     * Create an instance of {@link PRPMMT306810UV01QueryByParameterPayload }
     * 
     */
    public PRPMMT306810UV01QueryByParameterPayload createPRPMMT306810UV01QueryByParameterPayload() {
        return new PRPMMT306810UV01QueryByParameterPayload();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01TerritorialAuthority }
     * 
     */
    public PRPMMT306110UV01TerritorialAuthority createPRPMMT306110UV01TerritorialAuthority() {
        return new PRPMMT306110UV01TerritorialAuthority();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoverageRecord }
     * 
     */
    public COCTMT510000UV06CoverageRecord createCOCTMT510000UV06CoverageRecord() {
        return new COCTMT510000UV06CoverageRecord();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01InFulfillmentOf }
     * 
     */
    public MFMIMT700701UV01InFulfillmentOf createMFMIMT700701UV01InFulfillmentOf() {
        return new MFMIMT700701UV01InFulfillmentOf();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01RoleActivation }
     * 
     */
    public PRPMMT303010UV01RoleActivation createPRPMMT303010UV01RoleActivation() {
        return new PRPMMT303010UV01RoleActivation();
    }

    /**
     * Create an instance of {@link COCTMT030007UVGuarantor }
     * 
     */
    public COCTMT030007UVGuarantor createCOCTMT030007UVGuarantor() {
        return new COCTMT030007UVGuarantor();
    }

    /**
     * Create an instance of {@link COCTMT030007UVBirthPlace }
     * 
     */
    public COCTMT030007UVBirthPlace createCOCTMT030007UVBirthPlace() {
        return new COCTMT030007UVBirthPlace();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Device }
     * 
     */
    public MCCIMT000200UV01Device createMCCIMT000200UV01Device() {
        return new MCCIMT000200UV01Device();
    }

    /**
     * Create an instance of {@link COCTMT230100UVPolicy }
     * 
     */
    public COCTMT230100UVPolicy createCOCTMT230100UVPolicy() {
        return new COCTMT230100UVPolicy();
    }

    /**
     * Create an instance of {@link COCTMT590000UVDataEnterer }
     * 
     */
    public COCTMT590000UVDataEnterer createCOCTMT590000UVDataEnterer() {
        return new COCTMT590000UVDataEnterer();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01ResponsibleParty }
     * 
     */
    public PRPMMT403010UV01ResponsibleParty createPRPMMT403010UV01ResponsibleParty() {
        return new PRPMMT403010UV01ResponsibleParty();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06PrescriptionIntent }
     * 
     */
    public COCTMT600000UV06PrescriptionIntent createCOCTMT600000UV06PrescriptionIntent() {
        return new COCTMT600000UV06PrescriptionIntent();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04PrescriberRole }
     * 
     */
    public COCTMT300000UV04PrescriberRole createCOCTMT300000UV04PrescriberRole() {
        return new COCTMT300000UV04PrescriberRole();
    }

    /**
     * Create an instance of {@link HISTRTO }
     * 
     */
    public HISTRTO createHISTRTO() {
        return new HISTRTO();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02BirthPlace }
     * 
     */
    public PRPAMT201310UV02BirthPlace createPRPAMT201310UV02BirthPlace() {
        return new PRPAMT201310UV02BirthPlace();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01RoleOther }
     * 
     */
    public COCTMT090000UV01RoleOther createCOCTMT090000UV01RoleOther() {
        return new COCTMT090000UV01RoleOther();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02SortControl }
     * 
     */
    public PRPAMT201306UV02SortControl createPRPAMT201306UV02SortControl() {
        return new PRPAMT201306UV02SortControl();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Location }
     * 
     */
    public PRPMMT401010UV01Location createPRPMMT401010UV01Location() {
        return new PRPMMT401010UV01Location();
    }

    /**
     * Create an instance of {@link LISTPQ }
     * 
     */
    public LISTPQ createLISTPQ() {
        return new LISTPQ();
    }

    /**
     * Create an instance of {@link COCTMT030007UVOtherIDs }
     * 
     */
    public COCTMT030007UVOtherIDs createCOCTMT030007UVOtherIDs() {
        return new COCTMT030007UVOtherIDs();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Member }
     * 
     */
    public PRPAMT201302UV02Member createPRPAMT201302UV02Member() {
        return new PRPAMT201302UV02Member();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01ResponsibleParty }
     * 
     */
    public PRPMMT303010UV01ResponsibleParty createPRPMMT303010UV01ResponsibleParty() {
        return new PRPMMT303010UV01ResponsibleParty();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01DataEnterer }
     * 
     */
    public PRPMMT309000UV01DataEnterer createPRPMMT309000UV01DataEnterer() {
        return new PRPMMT309000UV01DataEnterer();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01Nation }
     * 
     */
    public COCTMT050000UV01Nation createCOCTMT050000UV01Nation() {
        return new COCTMT050000UV01Nation();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01ActDefinitionOrEvent }
     * 
     */
    public PRPMMT306110UV01ActDefinitionOrEvent createPRPMMT306110UV01ActDefinitionOrEvent() {
        return new PRPMMT306110UV01ActDefinitionOrEvent();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01RelatedTo }
     * 
     */
    public PRPMMT403010UV01RelatedTo createPRPMMT403010UV01RelatedTo() {
        return new PRPMMT403010UV01RelatedTo();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Person }
     * 
     */
    public PRPAMT201304UV02Person createPRPAMT201304UV02Person() {
        return new PRPAMT201304UV02Person();
    }

    /**
     * Create an instance of {@link COCTMT030202UV07Person }
     * 
     */
    public COCTMT030202UV07Person createCOCTMT030202UV07Person() {
        return new COCTMT030202UV07Person();
    }

    /**
     * Create an instance of {@link PRPMIN303011UV01MFMIMT700721UV01Subject1 }
     * 
     */
    public PRPMIN303011UV01MFMIMT700721UV01Subject1 createPRPMIN303011UV01MFMIMT700721UV01Subject1() {
        return new PRPMIN303011UV01MFMIMT700721UV01Subject1();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Specimen }
     * 
     */
    public COCTMT290000UV06Specimen createCOCTMT290000UV06Specimen() {
        return new COCTMT290000UV06Specimen();
    }

    /**
     * Create an instance of {@link PRPMIN303011UV01MFMIMT700721UV01Subject2 }
     * 
     */
    public PRPMIN303011UV01MFMIMT700721UV01Subject2 createPRPMIN303011UV01MFMIMT700721UV01Subject2() {
        return new PRPMIN303011UV01MFMIMT700721UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMIN301010UV01MFMIMT700721UV01RegistrationRequest }
     * 
     */
    public PRPMIN301010UV01MFMIMT700721UV01RegistrationRequest createPRPMIN301010UV01MFMIMT700721UV01RegistrationRequest() {
        return new PRPMIN301010UV01MFMIMT700721UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01AssignedEntity2 }
     * 
     */
    public PRPMMT403010UV01AssignedEntity2 createPRPMMT403010UV01AssignedEntity2() {
        return new PRPMMT403010UV01AssignedEntity2();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01DisciplinaryAction }
     * 
     */
    public PRPMMT301010UV01DisciplinaryAction createPRPMMT301010UV01DisciplinaryAction() {
        return new PRPMMT301010UV01DisciplinaryAction();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Agent }
     * 
     */
    public MCCIMT000200UV01Agent createMCCIMT000200UV01Agent() {
        return new MCCIMT000200UV01Agent();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04AcommodationRequestor }
     * 
     */
    public COCTMT310000UV04AcommodationRequestor createCOCTMT310000UV04AcommodationRequestor() {
        return new COCTMT310000UV04AcommodationRequestor();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Limitation2 }
     * 
     */
    public COCTMT510000UV06Limitation2 createCOCTMT510000UV06Limitation2() {
        return new COCTMT510000UV06Limitation2();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Limitation3 }
     * 
     */
    public COCTMT510000UV06Limitation3 createCOCTMT510000UV06Limitation3() {
        return new COCTMT510000UV06Limitation3();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Sponsor }
     * 
     */
    public COCTMT510000UV06Sponsor createCOCTMT510000UV06Sponsor() {
        return new COCTMT510000UV06Sponsor();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoverageChargePolicy }
     * 
     */
    public COCTMT510000UV06CoverageChargePolicy createCOCTMT510000UV06CoverageChargePolicy() {
        return new COCTMT510000UV06CoverageChargePolicy();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Citizen }
     * 
     */
    public PRPAMT201303UV02Citizen createPRPAMT201303UV02Citizen() {
        return new PRPAMT201303UV02Citizen();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02PrincipalCareProviderId }
     * 
     */
    public PRPAMT201306UV02PrincipalCareProviderId createPRPAMT201306UV02PrincipalCareProviderId() {
        return new PRPAMT201306UV02PrincipalCareProviderId();
    }

    /**
     * Create an instance of {@link StrucDocFootnote }
     * 
     */
    public StrucDocFootnote createStrucDocFootnote() {
        return new StrucDocFootnote();
    }

    /**
     * Create an instance of {@link COLLTEL }
     * 
     */
    public COLLTEL createCOLLTEL() {
        return new COLLTEL();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06ProviderPerson }
     * 
     */
    public COCTMT600000UV06ProviderPerson createCOCTMT600000UV06ProviderPerson() {
        return new COCTMT600000UV06ProviderPerson();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01PrivilegeCategorization }
     * 
     */
    public PRPMMT401010UV01PrivilegeCategorization createPRPMMT401010UV01PrivilegeCategorization() {
        return new PRPMMT401010UV01PrivilegeCategorization();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01AssignedPerson }
     * 
     */
    public COCTMT090100UV01AssignedPerson createCOCTMT090100UV01AssignedPerson() {
        return new COCTMT090100UV01AssignedPerson();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Person }
     * 
     */
    public PRPAMT201310UV02Person createPRPAMT201310UV02Person() {
        return new PRPAMT201310UV02Person();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09IdentifiedEntity }
     * 
     */
    public COCTMT080000UV09IdentifiedEntity createCOCTMT080000UV09IdentifiedEntity() {
        return new COCTMT080000UV09IdentifiedEntity();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01RelatedTo }
     * 
     */
    public PRPMMT406110UV01RelatedTo createPRPMMT406110UV01RelatedTo() {
        return new PRPMMT406110UV01RelatedTo();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01AcknowledgementDetail }
     * 
     */
    public MCCIMT000200UV01AcknowledgementDetail createMCCIMT000200UV01AcknowledgementDetail() {
        return new MCCIMT000200UV01AcknowledgementDetail();
    }

    /**
     * Create an instance of {@link COCTMT230100UVPackagedMedicine }
     * 
     */
    public COCTMT230100UVPackagedMedicine createCOCTMT230100UVPackagedMedicine() {
        return new COCTMT230100UVPackagedMedicine();
    }

    /**
     * Create an instance of {@link ENXP }
     * 
     */
    public ENXP createENXP() {
        return new ENXP();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Subject }
     * 
     */
    public PRPAMT201304UV02Subject createPRPAMT201304UV02Subject() {
        return new PRPAMT201304UV02Subject();
    }

    /**
     * Create an instance of {@link LISTMO }
     * 
     */
    public LISTMO createLISTMO() {
        return new LISTMO();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01InformationRecipient }
     * 
     */
    public MFMIMT700701UV01InformationRecipient createMFMIMT700701UV01InformationRecipient() {
        return new MFMIMT700701UV01InformationRecipient();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Performer2 }
     * 
     */
    public COCTMT300000UV04Performer2 createCOCTMT300000UV04Performer2() {
        return new COCTMT300000UV04Performer2();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Performer1 }
     * 
     */
    public COCTMT300000UV04Performer1 createCOCTMT300000UV04Performer1() {
        return new COCTMT300000UV04Performer1();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01Person }
     * 
     */
    public COCTMT050000UV01Person createCOCTMT050000UV01Person() {
        return new COCTMT050000UV01Person();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01LanguageCommunication }
     * 
     */
    public PRPMMT301010UV01LanguageCommunication createPRPMMT301010UV01LanguageCommunication() {
        return new PRPMMT301010UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link COCTMT530000UVActReference }
     * 
     */
    public COCTMT530000UVActReference createCOCTMT530000UVActReference() {
        return new COCTMT530000UVActReference();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01Device }
     * 
     */
    public COCTMT090300UV01Device createCOCTMT090300UV01Device() {
        return new COCTMT090300UV01Device();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01OrganizationPartof }
     * 
     */
    public PRPMMT403010UV01OrganizationPartof createPRPMMT403010UV01OrganizationPartof() {
        return new PRPMMT403010UV01OrganizationPartof();
    }

    /**
     * Create an instance of {@link StrucDocFootnoteRef }
     * 
     */
    public StrucDocFootnoteRef createStrucDocFootnoteRef() {
        return new StrucDocFootnoteRef();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02ContactParty }
     * 
     */
    public PRPAMT201303UV02ContactParty createPRPAMT201303UV02ContactParty() {
        return new PRPAMT201303UV02ContactParty();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Subject4 }
     * 
     */
    public MFMIMT700701UV01Subject4 createMFMIMT700701UV01Subject4() {
        return new MFMIMT700701UV01Subject4();
    }

    /**
     * Create an instance of {@link StrucDocSub }
     * 
     */
    public StrucDocSub createStrucDocSub() {
        return new StrucDocSub();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Subject3 }
     * 
     */
    public MFMIMT700701UV01Subject3 createMFMIMT700701UV01Subject3() {
        return new MFMIMT700701UV01Subject3();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01Qualification }
     * 
     */
    public PRPMMT406010UV01Qualification createPRPMMT406010UV01Qualification() {
        return new PRPMMT406010UV01Qualification();
    }

    /**
     * Create an instance of {@link DSETINT }
     * 
     */
    public DSETINT createDSETINT() {
        return new DSETINT();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Origin }
     * 
     */
    public COCTMT300000UV04Origin createCOCTMT300000UV04Origin() {
        return new COCTMT300000UV04Origin();
    }

    /**
     * Create an instance of {@link StrucDocSup }
     * 
     */
    public StrucDocSup createStrucDocSup() {
        return new StrucDocSup();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01Organization }
     * 
     */
    public MCCIMT000100UV01Organization createMCCIMT000100UV01Organization() {
        return new MCCIMT000100UV01Organization();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01DisciplinaryAction }
     * 
     */
    public PRPMMT406110UV01DisciplinaryAction createPRPMMT406110UV01DisciplinaryAction() {
        return new PRPMMT406110UV01DisciplinaryAction();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Custodian }
     * 
     */
    public PRPMMT301010UV01Custodian createPRPMMT301010UV01Custodian() {
        return new PRPMMT301010UV01Custodian();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01DataEnterer }
     * 
     */
    public MFMIMT700701UV01DataEnterer createMFMIMT700701UV01DataEnterer() {
        return new MFMIMT700701UV01DataEnterer();
    }

    /**
     * Create an instance of {@link COCTMT710000UV07Place }
     * 
     */
    public COCTMT710000UV07Place createCOCTMT710000UV07Place() {
        return new COCTMT710000UV07Place();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Definition }
     * 
     */
    public COCTMT080000UV09Definition createCOCTMT080000UV09Definition() {
        return new COCTMT080000UV09Definition();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Privilege }
     * 
     */
    public PRPMMT303010UV01Privilege createPRPMMT303010UV01Privilege() {
        return new PRPMMT303010UV01Privilege();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Citizen }
     * 
     */
    public PRPAMT201310UV02Citizen createPRPAMT201310UV02Citizen() {
        return new PRPAMT201310UV02Citizen();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Organization }
     * 
     */
    public PRPMMT406110UV01Organization createPRPMMT406110UV01Organization() {
        return new PRPMMT406110UV01Organization();
    }

    /**
     * Create an instance of {@link QUQIMT021001UV01Reason }
     * 
     */
    public QUQIMT021001UV01Reason createQUQIMT021001UV01Reason() {
        return new QUQIMT021001UV01Reason();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Custodian }
     * 
     */
    public PRPMMT306110UV01Custodian createPRPMMT306110UV01Custodian() {
        return new PRPMMT306110UV01Custodian();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01PriorRegistration }
     * 
     */
    public MFMIMT700721UV01PriorRegistration createMFMIMT700721UV01PriorRegistration() {
        return new MFMIMT700721UV01PriorRegistration();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01Note }
     * 
     */
    public PRPMMT409000UV01Note createPRPMMT409000UV01Note() {
        return new PRPMMT409000UV01Note();
    }

    /**
     * Create an instance of {@link COCTMT230100UVHolder }
     * 
     */
    public COCTMT230100UVHolder createCOCTMT230100UVHolder() {
        return new COCTMT230100UVHolder();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01ServiceDeliveryLocation }
     * 
     */
    public PRPMMT309000UV01ServiceDeliveryLocation createPRPMMT309000UV01ServiceDeliveryLocation() {
        return new PRPMMT309000UV01ServiceDeliveryLocation();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01RoleActivation }
     * 
     */
    public PRPMMT306110UV01RoleActivation createPRPMMT306110UV01RoleActivation() {
        return new PRPMMT306110UV01RoleActivation();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01InformDefinition }
     * 
     */
    public PRPMMT403010UV01InformDefinition createPRPMMT403010UV01InformDefinition() {
        return new PRPMMT403010UV01InformDefinition();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01SdlcId }
     * 
     */
    public PRPMMT406010UV01SdlcId createPRPMMT406010UV01SdlcId() {
        return new PRPMMT406010UV01SdlcId();
    }

    /**
     * Create an instance of {@link ANY }
     * 
     */
    public ANY createANY() {
        return new ANY();
    }

    /**
     * Create an instance of {@link StrucDocColGroup }
     * 
     */
    public StrucDocColGroup createStrucDocColGroup() {
        return new StrucDocColGroup();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Nation }
     * 
     */
    public PRPAMT201310UV02Nation createPRPAMT201310UV02Nation() {
        return new PRPAMT201310UV02Nation();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01Note }
     * 
     */
    public PRPMMT309000UV01Note createPRPMMT309000UV01Note() {
        return new PRPMMT309000UV01Note();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01History }
     * 
     */
    public PRPMMT306010UV01History createPRPMMT306010UV01History() {
        return new PRPMMT306010UV01History();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01Custodian }
     * 
     */
    public PRPMMT409000UV01Custodian createPRPMMT409000UV01Custodian() {
        return new PRPMMT409000UV01Custodian();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04BillableClinicalProduct }
     * 
     */
    public COCTMT490000UV04BillableClinicalProduct createCOCTMT490000UV04BillableClinicalProduct() {
        return new COCTMT490000UV04BillableClinicalProduct();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02CoveredParty }
     * 
     */
    public PRPAMT201302UV02CoveredParty createPRPAMT201302UV02CoveredParty() {
        return new PRPAMT201302UV02CoveredParty();
    }

    /**
     * Create an instance of {@link COCTMT810000UVVerification }
     * 
     */
    public COCTMT810000UVVerification createCOCTMT810000UVVerification() {
        return new COCTMT810000UVVerification();
    }

    /**
     * Create an instance of {@link COCTMT430000UV09TestKit }
     * 
     */
    public COCTMT430000UV09TestKit createCOCTMT430000UV09TestKit() {
        return new COCTMT430000UV09TestKit();
    }

    /**
     * Create an instance of {@link COCTMT150003UV03Person }
     * 
     */
    public COCTMT150003UV03Person createCOCTMT150003UV03Person() {
        return new COCTMT150003UV03Person();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04ProviderPerson }
     * 
     */
    public COCTMT490000UV04ProviderPerson createCOCTMT490000UV04ProviderPerson() {
        return new COCTMT490000UV04ProviderPerson();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01Subject }
     * 
     */
    public MCAIMT900001UV01Subject createMCAIMT900001UV01Subject() {
        return new MCAIMT900001UV01Subject();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01OrganizationContains }
     * 
     */
    public PRPMMT403010UV01OrganizationContains createPRPMMT403010UV01OrganizationContains() {
        return new PRPMMT403010UV01OrganizationContains();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01TerritorialAuthority }
     * 
     */
    public PRPMMT301010UV01TerritorialAuthority createPRPMMT301010UV01TerritorialAuthority() {
        return new PRPMMT301010UV01TerritorialAuthority();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01AssignedDevice }
     * 
     */
    public COCTMT090300UV01AssignedDevice createCOCTMT090300UV01AssignedDevice() {
        return new COCTMT090300UV01AssignedDevice();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02LanguageCommunication }
     * 
     */
    public PRPAMT201301UV02LanguageCommunication createPRPAMT201301UV02LanguageCommunication() {
        return new PRPAMT201301UV02LanguageCommunication();
    }

    /**
     * Create an instance of {@link COCTMT530000UVRecordTarget }
     * 
     */
    public COCTMT530000UVRecordTarget createCOCTMT530000UVRecordTarget() {
        return new COCTMT530000UVRecordTarget();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06AssignedEntity }
     * 
     */
    public COCTMT290000UV06AssignedEntity createCOCTMT290000UV06AssignedEntity() {
        return new COCTMT290000UV06AssignedEntity();
    }

    /**
     * Create an instance of {@link EIVLTS }
     * 
     */
    public EIVLTS createEIVLTS() {
        return new EIVLTS();
    }

    /**
     * Create an instance of {@link QSSTS }
     * 
     */
    public QSSTS createQSSTS() {
        return new QSSTS();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01Member }
     * 
     */
    public COCTMT090100UV01Member createCOCTMT090100UV01Member() {
        return new COCTMT090100UV01Member();
    }

    /**
     * Create an instance of {@link COCTMT530000UVDefinition }
     * 
     */
    public COCTMT530000UVDefinition createCOCTMT530000UVDefinition() {
        return new COCTMT530000UVDefinition();
    }

    /**
     * Create an instance of {@link COCTMT530000UVRelatedEntity }
     * 
     */
    public COCTMT530000UVRelatedEntity createCOCTMT530000UVRelatedEntity() {
        return new COCTMT530000UVRelatedEntity();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01ActDefinitionOrEvent }
     * 
     */
    public PRPMMT409000UV01ActDefinitionOrEvent createPRPMMT409000UV01ActDefinitionOrEvent() {
        return new PRPMMT409000UV01ActDefinitionOrEvent();
    }

    /**
     * Create an instance of {@link GLISTPQ }
     * 
     */
    public GLISTPQ createGLISTPQ() {
        return new GLISTPQ();
    }

    /**
     * Create an instance of {@link PRPMMT406010UV01SortControl }
     * 
     */
    public PRPMMT406010UV01SortControl createPRPMMT406010UV01SortControl() {
        return new PRPMMT406010UV01SortControl();
    }

    /**
     * Create an instance of {@link COCTMT230100UVTerritorialAuthority }
     * 
     */
    public COCTMT230100UVTerritorialAuthority createCOCTMT230100UVTerritorialAuthority() {
        return new COCTMT230100UVTerritorialAuthority();
    }

    /**
     * Create an instance of {@link COCTMT710007UV07Subject7 }
     * 
     */
    public COCTMT710007UV07Subject7 createCOCTMT710007UV07Subject7() {
        return new COCTMT710007UV07Subject7();
    }

    /**
     * Create an instance of {@link QSDPQ }
     * 
     */
    public QSDPQ createQSDPQ() {
        return new QSDPQ();
    }

    /**
     * Create an instance of {@link StrucDocTitleFootnote }
     * 
     */
    public StrucDocTitleFootnote createStrucDocTitleFootnote() {
        return new StrucDocTitleFootnote();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01ControlActEvent }
     * 
     */
    public PRPMMT406110UV01ControlActEvent createPRPMMT406110UV01ControlActEvent() {
        return new PRPMMT406110UV01ControlActEvent();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02BirthPlace }
     * 
     */
    public PRPAMT201301UV02BirthPlace createPRPAMT201301UV02BirthPlace() {
        return new PRPAMT201301UV02BirthPlace();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Birthplace }
     * 
     */
    public PRPMMT303010UV01Birthplace createPRPMMT303010UV01Birthplace() {
        return new PRPMMT303010UV01Birthplace();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09ManufacturedProduct }
     * 
     */
    public COCTMT080000UV09ManufacturedProduct createCOCTMT080000UV09ManufacturedProduct() {
        return new COCTMT080000UV09ManufacturedProduct();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Birthplace }
     * 
     */
    public PRPMMT301010UV01Birthplace createPRPMMT301010UV01Birthplace() {
        return new PRPMMT301010UV01Birthplace();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Coverage2 }
     * 
     */
    public COCTMT510000UV06Coverage2 createCOCTMT510000UV06Coverage2() {
        return new COCTMT510000UV06Coverage2();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01SequelTo }
     * 
     */
    public PRPMMT303010UV01SequelTo createPRPMMT303010UV01SequelTo() {
        return new PRPMMT303010UV01SequelTo();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01Place }
     * 
     */
    public PRPMMT401010UV01Place createPRPMMT401010UV01Place() {
        return new PRPMMT401010UV01Place();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01Place }
     * 
     */
    public MCCIMT000100UV01Place createMCCIMT000100UV01Place() {
        return new MCCIMT000100UV01Place();
    }

    /**
     * Create an instance of {@link SDTITLE }
     * 
     */
    public SDTITLE createSDTITLE() {
        return new SDTITLE();
    }

    /**
     * Create an instance of {@link COCTMT260003UVPharmacy }
     * 
     */
    public COCTMT260003UVPharmacy createCOCTMT260003UVPharmacy() {
        return new COCTMT260003UVPharmacy();
    }

    /**
     * Create an instance of {@link HISTPQ }
     * 
     */
    public HISTPQ createHISTPQ() {
        return new HISTPQ();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01AdministrativeGender }
     * 
     */
    public PRPMMT306010UV01AdministrativeGender createPRPMMT306010UV01AdministrativeGender() {
        return new PRPMMT306010UV01AdministrativeGender();
    }

    /**
     * Create an instance of {@link PRPAIN201311UV02MFMIMT700721UV01RegistrationRequest }
     * 
     */
    public PRPAIN201311UV02MFMIMT700721UV01RegistrationRequest createPRPAIN201311UV02MFMIMT700721UV01RegistrationRequest() {
        return new PRPAIN201311UV02MFMIMT700721UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01ResponsibleParty }
     * 
     */
    public PRPMMT301010UV01ResponsibleParty createPRPMMT301010UV01ResponsibleParty() {
        return new PRPMMT301010UV01ResponsibleParty();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02QueryMatchObservation }
     * 
     */
    public PRPAMT201310UV02QueryMatchObservation createPRPAMT201310UV02QueryMatchObservation() {
        return new PRPAMT201310UV02QueryMatchObservation();
    }

    /**
     * Create an instance of {@link RTO }
     * 
     */
    public RTO createRTO() {
        return new RTO();
    }

    /**
     * Create an instance of {@link PRPAIN201310UV02MFMIMT700711UV01Subject2 }
     * 
     */
    public PRPAIN201310UV02MFMIMT700711UV01Subject2 createPRPAIN201310UV02MFMIMT700711UV01Subject2() {
        return new PRPAIN201310UV02MFMIMT700711UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPAIN201310UV02MFMIMT700711UV01Subject1 }
     * 
     */
    public PRPAIN201310UV02MFMIMT700711UV01Subject1 createPRPAIN201310UV02MFMIMT700711UV01Subject1() {
        return new PRPAIN201310UV02MFMIMT700711UV01Subject1();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04Diagnosis }
     * 
     */
    public COCTMT740000UV04Diagnosis createCOCTMT740000UV04Diagnosis() {
        return new COCTMT740000UV04Diagnosis();
    }

    /**
     * Create an instance of {@link COCTMT530000UVAnimal }
     * 
     */
    public COCTMT530000UVAnimal createCOCTMT530000UVAnimal() {
        return new COCTMT530000UVAnimal();
    }

    /**
     * Create an instance of {@link HISTINT }
     * 
     */
    public HISTINT createHISTINT() {
        return new HISTINT();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09DerivedSpecimen }
     * 
     */
    public COCTMT080000UV09DerivedSpecimen createCOCTMT080000UV09DerivedSpecimen() {
        return new COCTMT080000UV09DerivedSpecimen();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02PatientOfOtherProvider }
     * 
     */
    public PRPAMT201302UV02PatientOfOtherProvider createPRPAMT201302UV02PatientOfOtherProvider() {
        return new PRPAMT201302UV02PatientOfOtherProvider();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Guardian }
     * 
     */
    public PRPAMT201302UV02Guardian createPRPAMT201302UV02Guardian() {
        return new PRPAMT201302UV02Guardian();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01RelatedTo }
     * 
     */
    public PRPMMT401010UV01RelatedTo createPRPMMT401010UV01RelatedTo() {
        return new PRPMMT401010UV01RelatedTo();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectAdministrativeGender }
     * 
     */
    public PRPAMT201306UV02LivingSubjectAdministrativeGender createPRPAMT201306UV02LivingSubjectAdministrativeGender() {
        return new PRPAMT201306UV02LivingSubjectAdministrativeGender();
    }

    /**
     * Create an instance of {@link COCTMT810000UVInFulfillmentOf }
     * 
     */
    public COCTMT810000UVInFulfillmentOf createCOCTMT810000UVInFulfillmentOf() {
        return new COCTMT810000UVInFulfillmentOf();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04SubstanceAdministrationIntent }
     * 
     */
    public COCTMT300000UV04SubstanceAdministrationIntent createCOCTMT300000UV04SubstanceAdministrationIntent() {
        return new COCTMT300000UV04SubstanceAdministrationIntent();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01ServiceDeliveryLocation }
     * 
     */
    public PRPMMT409000UV01ServiceDeliveryLocation createPRPMMT409000UV01ServiceDeliveryLocation() {
        return new PRPMMT409000UV01ServiceDeliveryLocation();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01DisciplinaryAction }
     * 
     */
    public PRPMMT303010UV01DisciplinaryAction createPRPMMT303010UV01DisciplinaryAction() {
        return new PRPMMT303010UV01DisciplinaryAction();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Limitation }
     * 
     */
    public COCTMT510000UV06Limitation createCOCTMT510000UV06Limitation() {
        return new COCTMT510000UV06Limitation();
    }

    /**
     * Create an instance of {@link GLISTTS }
     * 
     */
    public GLISTTS createGLISTTS() {
        return new GLISTTS();
    }

    /**
     * Create an instance of {@link HISTSC }
     * 
     */
    public HISTSC createHISTSC() {
        return new HISTSC();
    }

    /**
     * Create an instance of {@link COCTMT240000UV01ServiceDeliveryLocation }
     * 
     */
    public COCTMT240000UV01ServiceDeliveryLocation createCOCTMT240000UV01ServiceDeliveryLocation() {
        return new COCTMT240000UV01ServiceDeliveryLocation();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04ProviderPerson }
     * 
     */
    public COCTMT740000UV04ProviderPerson createCOCTMT740000UV04ProviderPerson() {
        return new COCTMT740000UV04ProviderPerson();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02PersonalRelationship }
     * 
     */
    public PRPAMT201310UV02PersonalRelationship createPRPAMT201310UV02PersonalRelationship() {
        return new PRPAMT201310UV02PersonalRelationship();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ManufacturedMaterial }
     * 
     */
    public COCTMT290000UV06ManufacturedMaterial createCOCTMT290000UV06ManufacturedMaterial() {
        return new COCTMT290000UV06ManufacturedMaterial();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04ManufacturedMaterialKind }
     * 
     */
    public COCTMT300000UV04ManufacturedMaterialKind createCOCTMT300000UV04ManufacturedMaterialKind() {
        return new COCTMT300000UV04ManufacturedMaterialKind();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01Location }
     * 
     */
    public PRPMMT303010UV01Location createPRPMMT303010UV01Location() {
        return new PRPMMT303010UV01Location();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01RoleActivation }
     * 
     */
    public PRPMMT406110UV01RoleActivation createPRPMMT406110UV01RoleActivation() {
        return new PRPMMT406110UV01RoleActivation();
    }

    /**
     * Create an instance of {@link HISTST }
     * 
     */
    public HISTST createHISTST() {
        return new HISTST();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01LanguageCommunication }
     * 
     */
    public PRPMMT409000UV01LanguageCommunication createPRPMMT409000UV01LanguageCommunication() {
        return new PRPMMT409000UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link BAGREAL }
     * 
     */
    public BAGREAL createBAGREAL() {
        return new BAGREAL();
    }

    /**
     * Create an instance of {@link COCTMT030207UV07Person }
     * 
     */
    public COCTMT030207UV07Person createCOCTMT030207UV07Person() {
        return new COCTMT030207UV07Person();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Verifier }
     * 
     */
    public COCTMT080000UV09Verifier createCOCTMT080000UV09Verifier() {
        return new COCTMT080000UV09Verifier();
    }

    /**
     * Create an instance of {@link PRPMMT306810UV01AdministrativeGender }
     * 
     */
    public PRPMMT306810UV01AdministrativeGender createPRPMMT306810UV01AdministrativeGender() {
        return new PRPMMT306810UV01AdministrativeGender();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02BirthPlace }
     * 
     */
    public PRPAMT201302UV02BirthPlace createPRPAMT201302UV02BirthPlace() {
        return new PRPAMT201302UV02BirthPlace();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01LanguageCommunication }
     * 
     */
    public PRPMMT403010UV01LanguageCommunication createPRPMMT403010UV01LanguageCommunication() {
        return new PRPMMT403010UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Consultant }
     * 
     */
    public COCTMT290000UV06Consultant createCOCTMT290000UV06Consultant() {
        return new COCTMT290000UV06Consultant();
    }

    /**
     * Create an instance of {@link StrucDocTRowGroup }
     * 
     */
    public StrucDocTRowGroup createStrucDocTRowGroup() {
        return new StrucDocTRowGroup();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02BirthPlace }
     * 
     */
    public PRPAMT201303UV02BirthPlace createPRPAMT201303UV02BirthPlace() {
        return new PRPAMT201303UV02BirthPlace();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01ServiceDeliveryLocation }
     * 
     */
    public PRPMMT406110UV01ServiceDeliveryLocation createPRPMMT406110UV01ServiceDeliveryLocation() {
        return new PRPMMT406110UV01ServiceDeliveryLocation();
    }

    /**
     * Create an instance of {@link HISTTS }
     * 
     */
    public HISTTS createHISTTS() {
        return new HISTTS();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02PersonalRelationship }
     * 
     */
    public PRPAMT201302UV02PersonalRelationship createPRPAMT201302UV02PersonalRelationship() {
        return new PRPAMT201302UV02PersonalRelationship();
    }

    /**
     * Create an instance of {@link COCTMT250000UV03Reagent }
     * 
     */
    public COCTMT250000UV03Reagent createCOCTMT250000UV03Reagent() {
        return new COCTMT250000UV03Reagent();
    }

    /**
     * Create an instance of {@link COCTMT150000UV02OrganizationContains }
     * 
     */
    public COCTMT150000UV02OrganizationContains createCOCTMT150000UV02OrganizationContains() {
        return new COCTMT150000UV02OrganizationContains();
    }

    /**
     * Create an instance of {@link PRPMMT401010UV01TerritorialAuthority }
     * 
     */
    public PRPMMT401010UV01TerritorialAuthority createPRPMMT401010UV01TerritorialAuthority() {
        return new PRPMMT401010UV01TerritorialAuthority();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06InjuryPlace }
     * 
     */
    public COCTMT290000UV06InjuryPlace createCOCTMT290000UV06InjuryPlace() {
        return new COCTMT290000UV06InjuryPlace();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Location }
     * 
     */
    public COCTMT290000UV06Location createCOCTMT290000UV06Location() {
        return new COCTMT290000UV06Location();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01PrincipalOrganization }
     * 
     */
    public PRPMMT301010UV01PrincipalOrganization createPRPMMT301010UV01PrincipalOrganization() {
        return new PRPMMT301010UV01PrincipalOrganization();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01BirthPlace }
     * 
     */
    public COCTMT050000UV01BirthPlace createCOCTMT050000UV01BirthPlace() {
        return new COCTMT050000UV01BirthPlace();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02MatchAlgorithm }
     * 
     */
    public PRPAMT201306UV02MatchAlgorithm createPRPAMT201306UV02MatchAlgorithm() {
        return new PRPAMT201306UV02MatchAlgorithm();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Product }
     * 
     */
    public COCTMT080000UV09Product createCOCTMT080000UV09Product() {
        return new COCTMT080000UV09Product();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04SupplyOrder }
     * 
     */
    public COCTMT300000UV04SupplyOrder createCOCTMT300000UV04SupplyOrder() {
        return new COCTMT300000UV04SupplyOrder();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Place }
     * 
     */
    public PRPMMT301010UV01Place createPRPMMT301010UV01Place() {
        return new PRPMMT301010UV01Place();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01ResponsibleParty }
     * 
     */
    public PRPMMT409000UV01ResponsibleParty createPRPMMT409000UV01ResponsibleParty() {
        return new PRPMMT409000UV01ResponsibleParty();
    }

    /**
     * Create an instance of {@link COCTMT820000UVCareProvision }
     * 
     */
    public COCTMT820000UVCareProvision createCOCTMT820000UVCareProvision() {
        return new COCTMT820000UVCareProvision();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01AssignedEntity }
     * 
     */
    public PRPMMT403010UV01AssignedEntity createPRPMMT403010UV01AssignedEntity() {
        return new PRPMMT403010UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Author2 }
     * 
     */
    public MFMIMT700701UV01Author2 createMFMIMT700701UV01Author2() {
        return new MFMIMT700701UV01Author2();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Author1 }
     * 
     */
    public MFMIMT700701UV01Author1 createMFMIMT700701UV01Author1() {
        return new MFMIMT700701UV01Author1();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectBirthPlaceAddress }
     * 
     */
    public PRPAMT201306UV02LivingSubjectBirthPlaceAddress createPRPAMT201306UV02LivingSubjectBirthPlaceAddress() {
        return new PRPAMT201306UV02LivingSubjectBirthPlaceAddress();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Definition }
     * 
     */
    public MFMIMT700711UV01Definition createMFMIMT700711UV01Definition() {
        return new MFMIMT700711UV01Definition();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06PatientEncounter }
     * 
     */
    public COCTMT290000UV06PatientEncounter createCOCTMT290000UV06PatientEncounter() {
        return new COCTMT290000UV06PatientEncounter();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoverageLimitObservation }
     * 
     */
    public COCTMT510000UV06CoverageLimitObservation createCOCTMT510000UV06CoverageLimitObservation() {
        return new COCTMT510000UV06CoverageLimitObservation();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01RelatedTo }
     * 
     */
    public PRPMMT303010UV01RelatedTo createPRPMMT303010UV01RelatedTo() {
        return new PRPMMT303010UV01RelatedTo();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09ControlVariable }
     * 
     */
    public COCTMT080000UV09ControlVariable createCOCTMT080000UV09ControlVariable() {
        return new COCTMT080000UV09ControlVariable();
    }

    /**
     * Create an instance of {@link COCTMT150003UV03ContactParty }
     * 
     */
    public COCTMT150003UV03ContactParty createCOCTMT150003UV03ContactParty() {
        return new COCTMT150003UV03ContactParty();
    }

    /**
     * Create an instance of {@link COCTMT030007UVLanguageCommunication }
     * 
     */
    public COCTMT030007UVLanguageCommunication createCOCTMT030007UVLanguageCommunication() {
        return new COCTMT030007UVLanguageCommunication();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Subject2 }
     * 
     */
    public PRPAMT201303UV02Subject2 createPRPAMT201303UV02Subject2() {
        return new PRPAMT201303UV02Subject2();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01InformRequest }
     * 
     */
    public PRPMMT403010UV01InformRequest createPRPMMT403010UV01InformRequest() {
        return new PRPMMT403010UV01InformRequest();
    }

    /**
     * Create an instance of {@link PRPMIN403011UV01MFMIMT700721UV01RegistrationRequest }
     * 
     */
    public PRPMIN403011UV01MFMIMT700721UV01RegistrationRequest createPRPMIN403011UV01MFMIMT700721UV01RegistrationRequest() {
        return new PRPMIN403011UV01MFMIMT700721UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link COCTMT030007UVEntity }
     * 
     */
    public COCTMT030007UVEntity createCOCTMT030007UVEntity() {
        return new COCTMT030007UVEntity();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Subject4 }
     * 
     */
    public PRPAMT201303UV02Subject4 createPRPAMT201303UV02Subject4() {
        return new PRPAMT201303UV02Subject4();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSubstanceAdministration }
     * 
     */
    public COCTMT530000UVSubstanceAdministration createCOCTMT530000UVSubstanceAdministration() {
        return new COCTMT530000UVSubstanceAdministration();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Subject3 }
     * 
     */
    public PRPAMT201303UV02Subject3 createPRPAMT201303UV02Subject3() {
        return new PRPAMT201303UV02Subject3();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoveredParty2 }
     * 
     */
    public COCTMT510000UV06CoveredParty2 createCOCTMT510000UV06CoveredParty2() {
        return new COCTMT510000UV06CoveredParty2();
    }

    /**
     * Create an instance of {@link PRPMIN306011UV01MFMIMT700711UV01RegistrationEvent }
     * 
     */
    public PRPMIN306011UV01MFMIMT700711UV01RegistrationEvent createPRPMIN306011UV01MFMIMT700711UV01RegistrationEvent() {
        return new PRPMIN306011UV01MFMIMT700711UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06PreviousPolicyOrProgram }
     * 
     */
    public COCTMT510000UV06PreviousPolicyOrProgram createCOCTMT510000UV06PreviousPolicyOrProgram() {
        return new COCTMT510000UV06PreviousPolicyOrProgram();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01AuthorOrPerformer }
     * 
     */
    public MFMIMT700701UV01AuthorOrPerformer createMFMIMT700701UV01AuthorOrPerformer() {
        return new MFMIMT700701UV01AuthorOrPerformer();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Group }
     * 
     */
    public PRPAMT201301UV02Group createPRPAMT201301UV02Group() {
        return new PRPAMT201301UV02Group();
    }

    /**
     * Create an instance of {@link BAGRTO }
     * 
     */
    public BAGRTO createBAGRTO() {
        return new BAGRTO();
    }

    /**
     * Create an instance of {@link PRPMMT306910UV01TerritorialAuthority }
     * 
     */
    public PRPMMT306910UV01TerritorialAuthority createPRPMMT306910UV01TerritorialAuthority() {
        return new PRPMMT306910UV01TerritorialAuthority();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01DisciplinaryAction }
     * 
     */
    public PRPMMT403010UV01DisciplinaryAction createPRPMMT403010UV01DisciplinaryAction() {
        return new PRPMMT403010UV01DisciplinaryAction();
    }

    /**
     * Create an instance of {@link StrucDocCaptioned }
     * 
     */
    public StrucDocCaptioned createStrucDocCaptioned() {
        return new StrucDocCaptioned();
    }

    /**
     * Create an instance of {@link COCTMT090002UV01Organization }
     * 
     */
    public COCTMT090002UV01Organization createCOCTMT090002UV01Organization() {
        return new COCTMT090002UV01Organization();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02PatientOfOtherProvider }
     * 
     */
    public PRPAMT201304UV02PatientOfOtherProvider createPRPAMT201304UV02PatientOfOtherProvider() {
        return new PRPAMT201304UV02PatientOfOtherProvider();
    }

    /**
     * Create an instance of {@link PRPMMT306810UV01RoleType }
     * 
     */
    public PRPMMT306810UV01RoleType createPRPMMT306810UV01RoleType() {
        return new PRPMMT306810UV01RoleType();
    }

    /**
     * Create an instance of {@link COCTMT230100UVAgency }
     * 
     */
    public COCTMT230100UVAgency createCOCTMT230100UVAgency() {
        return new COCTMT230100UVAgency();
    }

    /**
     * Create an instance of {@link PRPMMT306910UV01Part }
     * 
     */
    public PRPMMT306910UV01Part createPRPMMT306910UV01Part() {
        return new PRPMMT306910UV01Part();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02CoveredParty }
     * 
     */
    public PRPAMT201304UV02CoveredParty createPRPAMT201304UV02CoveredParty() {
        return new PRPAMT201304UV02CoveredParty();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01Performer }
     * 
     */
    public COCTMT060000UV01Performer createCOCTMT060000UV01Performer() {
        return new COCTMT060000UV01Performer();
    }

    /**
     * Create an instance of {@link COCTMT530000UVBirthplace }
     * 
     */
    public COCTMT530000UVBirthplace createCOCTMT530000UVBirthplace() {
        return new COCTMT530000UVBirthplace();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01Student }
     * 
     */
    public COCTMT050000UV01Student createCOCTMT050000UV01Student() {
        return new COCTMT050000UV01Student();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01PrincipalPerson }
     * 
     */
    public PRPMMT306110UV01PrincipalPerson createPRPMMT306110UV01PrincipalPerson() {
        return new PRPMMT306110UV01PrincipalPerson();
    }

    /**
     * Create an instance of {@link StrucDocTRow }
     * 
     */
    public StrucDocTRow createStrucDocTRow() {
        return new StrucDocTRow();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04HealthCareProvider }
     * 
     */
    public COCTMT300000UV04HealthCareProvider createCOCTMT300000UV04HealthCareProvider() {
        return new COCTMT300000UV04HealthCareProvider();
    }

    /**
     * Create an instance of {@link COCTMT230100UVPart }
     * 
     */
    public COCTMT230100UVPart createCOCTMT230100UVPart() {
        return new COCTMT230100UVPart();
    }

    /**
     * Create an instance of {@link PRPMIN403010UV01MFMIMT700721UV01Subject1 }
     * 
     */
    public PRPMIN403010UV01MFMIMT700721UV01Subject1 createPRPMIN403010UV01MFMIMT700721UV01Subject1() {
        return new PRPMIN403010UV01MFMIMT700721UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPMIN403010UV01MFMIMT700721UV01Subject2 }
     * 
     */
    public PRPMIN403010UV01MFMIMT700721UV01Subject2 createPRPMIN403010UV01MFMIMT700721UV01Subject2() {
        return new PRPMIN403010UV01MFMIMT700721UV01Subject2();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01PersonalRelationship }
     * 
     */
    public COCTMT050000UV01PersonalRelationship createCOCTMT050000UV01PersonalRelationship() {
        return new COCTMT050000UV01PersonalRelationship();
    }

    /**
     * Create an instance of {@link COCTMT230100UVContent }
     * 
     */
    public COCTMT230100UVContent createCOCTMT230100UVContent() {
        return new COCTMT230100UVContent();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09AdditiveMaterial }
     * 
     */
    public COCTMT080000UV09AdditiveMaterial createCOCTMT080000UV09AdditiveMaterial() {
        return new COCTMT080000UV09AdditiveMaterial();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02OtherIDs }
     * 
     */
    public PRPAMT201301UV02OtherIDs createPRPAMT201301UV02OtherIDs() {
        return new PRPAMT201301UV02OtherIDs();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Group }
     * 
     */
    public PRPAMT201303UV02Group createPRPAMT201303UV02Group() {
        return new PRPAMT201303UV02Group();
    }

    /**
     * Create an instance of {@link PRPMMT309000UV01PrimaryPerformer3 }
     * 
     */
    public PRPMMT309000UV01PrimaryPerformer3 createPRPMMT309000UV01PrimaryPerformer3() {
        return new PRPMMT309000UV01PrimaryPerformer3();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01ServiceDeliveryLocation }
     * 
     */
    public PRPMMT306110UV01ServiceDeliveryLocation createPRPMMT306110UV01ServiceDeliveryLocation() {
        return new PRPMMT306110UV01ServiceDeliveryLocation();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04Referral }
     * 
     */
    public COCTMT740000UV04Referral createCOCTMT740000UV04Referral() {
        return new COCTMT740000UV04Referral();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01QualifiedEntity }
     * 
     */
    public PRPMMT303010UV01QualifiedEntity createPRPMMT303010UV01QualifiedEntity() {
        return new PRPMMT303010UV01QualifiedEntity();
    }

    /**
     * Create an instance of {@link StrucDocCMTitle }
     * 
     */
    public StrucDocCMTitle createStrucDocCMTitle() {
        return new StrucDocCMTitle();
    }

    /**
     * Create an instance of {@link COCTMT090108UVPerson }
     * 
     */
    public COCTMT090108UVPerson createCOCTMT090108UVPerson() {
        return new COCTMT090108UVPerson();
    }

    /**
     * Create an instance of {@link PRPMMT306010UV01SdlcId }
     * 
     */
    public PRPMMT306010UV01SdlcId createPRPMMT306010UV01SdlcId() {
        return new PRPMMT306010UV01SdlcId();
    }

    /**
     * Create an instance of {@link PRPMIN303010UV01MFMIMT700721UV01RegistrationRequest }
     * 
     */
    public PRPMIN303010UV01MFMIMT700721UV01RegistrationRequest createPRPMIN303010UV01MFMIMT700721UV01RegistrationRequest() {
        return new PRPMIN303010UV01MFMIMT700721UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06FinancialParticipationCharge }
     * 
     */
    public COCTMT510000UV06FinancialParticipationCharge createCOCTMT510000UV06FinancialParticipationCharge() {
        return new COCTMT510000UV06FinancialParticipationCharge();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Part }
     * 
     */
    public PRPMMT403010UV01Part createPRPMMT403010UV01Part() {
        return new PRPMMT403010UV01Part();
    }

    /**
     * Create an instance of {@link COCTMT150002UV01Organization }
     * 
     */
    public COCTMT150002UV01Organization createCOCTMT150002UV01Organization() {
        return new COCTMT150002UV01Organization();
    }

    /**
     * Create an instance of {@link COCTMT230100UVDistributedProduct }
     * 
     */
    public COCTMT230100UVDistributedProduct createCOCTMT230100UVDistributedProduct() {
        return new COCTMT230100UVDistributedProduct();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Student }
     * 
     */
    public PRPAMT201301UV02Student createPRPAMT201301UV02Student() {
        return new PRPAMT201301UV02Student();
    }

    /**
     * Create an instance of {@link COCTMT080000UV09Author }
     * 
     */
    public COCTMT080000UV09Author createCOCTMT080000UV09Author() {
        return new COCTMT080000UV09Author();
    }

    /**
     * Create an instance of {@link PRPMMT409000UV01DataEnterer }
     * 
     */
    public PRPMMT409000UV01DataEnterer createPRPMMT409000UV01DataEnterer() {
        return new PRPMMT409000UV01DataEnterer();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01AssignedEntity }
     * 
     */
    public PRPMMT303010UV01AssignedEntity createPRPMMT303010UV01AssignedEntity() {
        return new PRPMMT303010UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01PriorRegisteredRole }
     * 
     */
    public MFMIMT700701UV01PriorRegisteredRole createMFMIMT700701UV01PriorRegisteredRole() {
        return new MFMIMT700701UV01PriorRegisteredRole();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01ActDefinitionOrEvent }
     * 
     */
    public PRPMMT301010UV01ActDefinitionOrEvent createPRPMMT301010UV01ActDefinitionOrEvent() {
        return new PRPMMT301010UV01ActDefinitionOrEvent();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01DataEnterer }
     * 
     */
    public MFMIMT700721UV01DataEnterer createMFMIMT700721UV01DataEnterer() {
        return new MFMIMT700721UV01DataEnterer();
    }

    /**
     * Create an instance of {@link QSDTS }
     * 
     */
    public QSDTS createQSDTS() {
        return new QSDTS();
    }

    /**
     * Create an instance of {@link PRPMMT303010UV01PrivilegeCategorization }
     * 
     */
    public PRPMMT303010UV01PrivilegeCategorization createPRPMMT303010UV01PrivilegeCategorization() {
        return new PRPMMT303010UV01PrivilegeCategorization();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02CareGiver }
     * 
     */
    public PRPAMT201310UV02CareGiver createPRPAMT201310UV02CareGiver() {
        return new PRPAMT201310UV02CareGiver();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01InFulfillmentOf }
     * 
     */
    public MFMIMT700711UV01InFulfillmentOf createMFMIMT700711UV01InFulfillmentOf() {
        return new MFMIMT700711UV01InFulfillmentOf();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Subject5 }
     * 
     */
    public PRPMMT406110UV01Subject5 createPRPMMT406110UV01Subject5() {
        return new PRPMMT406110UV01Subject5();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Subject6 }
     * 
     */
    public PRPMMT406110UV01Subject6 createPRPMMT406110UV01Subject6() {
        return new PRPMMT406110UV01Subject6();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Subject7 }
     * 
     */
    public PRPMMT406110UV01Subject7 createPRPMMT406110UV01Subject7() {
        return new PRPMMT406110UV01Subject7();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Subject8 }
     * 
     */
    public PRPMMT406110UV01Subject8 createPRPMMT406110UV01Subject8() {
        return new PRPMMT406110UV01Subject8();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Subject9 }
     * 
     */
    public PRPMMT406110UV01Subject9 createPRPMMT406110UV01Subject9() {
        return new PRPMMT406110UV01Subject9();
    }

    /**
     * Create an instance of {@link COCTMT710000UV07Subject7 }
     * 
     */
    public COCTMT710000UV07Subject7 createCOCTMT710000UV07Subject7() {
        return new COCTMT710000UV07Subject7();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05Device1 }
     * 
     */
    public COCTMT960000UV05Device1 createCOCTMT960000UV05Device1() {
        return new COCTMT960000UV05Device1();
    }

    /**
     * Create an instance of {@link MFMIMT700721UV01Definition }
     * 
     */
    public MFMIMT700721UV01Definition createMFMIMT700721UV01Definition() {
        return new MFMIMT700721UV01Definition();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05Device2 }
     * 
     */
    public COCTMT960000UV05Device2 createCOCTMT960000UV05Device2() {
        return new COCTMT960000UV05Device2();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Subject2 }
     * 
     */
    public PRPMMT406110UV01Subject2 createPRPMMT406110UV01Subject2() {
        return new PRPMMT406110UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Subject3 }
     * 
     */
    public PRPMMT406110UV01Subject3 createPRPMMT406110UV01Subject3() {
        return new PRPMMT406110UV01Subject3();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Subject4 }
     * 
     */
    public PRPMMT406110UV01Subject4 createPRPMMT406110UV01Subject4() {
        return new PRPMMT406110UV01Subject4();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Device2 }
     * 
     */
    public COCTMT290000UV06Device2 createCOCTMT290000UV06Device2() {
        return new COCTMT290000UV06Device2();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Location }
     * 
     */
    public PRPMMT403010UV01Location createPRPMMT403010UV01Location() {
        return new PRPMMT403010UV01Location();
    }

    /**
     * Create an instance of {@link COCTMT280000UV04CrossReference }
     * 
     */
    public COCTMT280000UV04CrossReference createCOCTMT280000UV04CrossReference() {
        return new COCTMT280000UV04CrossReference();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Nation }
     * 
     */
    public PRPAMT201303UV02Nation createPRPAMT201303UV02Nation() {
        return new PRPAMT201303UV02Nation();
    }

    /**
     * Create an instance of {@link COCTMT150000UV02ContactParty }
     * 
     */
    public COCTMT150000UV02ContactParty createCOCTMT150000UV02ContactParty() {
        return new COCTMT150000UV02ContactParty();
    }

    /**
     * Create an instance of {@link COCTMT530000UVResponsibleParty1 }
     * 
     */
    public COCTMT530000UVResponsibleParty1 createCOCTMT530000UVResponsibleParty1() {
        return new COCTMT530000UVResponsibleParty1();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Author2 }
     * 
     */
    public COCTMT290000UV06Author2 createCOCTMT290000UV06Author2() {
        return new COCTMT290000UV06Author2();
    }

    /**
     * Create an instance of {@link COCTMT530000UVResponsibleParty2 }
     * 
     */
    public COCTMT530000UVResponsibleParty2 createCOCTMT530000UVResponsibleParty2() {
        return new COCTMT530000UVResponsibleParty2();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01Affiliate }
     * 
     */
    public PRPMMT301010UV01Affiliate createPRPMMT301010UV01Affiliate() {
        return new PRPMMT301010UV01Affiliate();
    }

    /**
     * Create an instance of {@link PRPMMT306110UV01Affiliate }
     * 
     */
    public PRPMMT306110UV01Affiliate createPRPMMT306110UV01Affiliate() {
        return new PRPMMT306110UV01Affiliate();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Patient }
     * 
     */
    public PRPAMT201310UV02Patient createPRPAMT201310UV02Patient() {
        return new PRPAMT201310UV02Patient();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04Location }
     * 
     */
    public COCTMT740000UV04Location createCOCTMT740000UV04Location() {
        return new COCTMT740000UV04Location();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Author1 }
     * 
     */
    public COCTMT290000UV06Author1 createCOCTMT290000UV06Author1() {
        return new COCTMT290000UV06Author1();
    }

    /**
     * Create an instance of {@link PRPMMT403010UV01Privilege }
     * 
     */
    public PRPMMT403010UV01Privilege createPRPMMT403010UV01Privilege() {
        return new PRPMMT403010UV01Privilege();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Person }
     * 
     */
    public PRPAMT201303UV02Person createPRPAMT201303UV02Person() {
        return new PRPAMT201303UV02Person();
    }

    /**
     * Create an instance of {@link PRPMMT301010UV01PrivilegeCategorization }
     * 
     */
    public PRPMMT301010UV01PrivilegeCategorization createPRPMMT301010UV01PrivilegeCategorization() {
        return new PRPMMT301010UV01PrivilegeCategorization();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04Referrer }
     * 
     */
    public COCTMT740000UV04Referrer createCOCTMT740000UV04Referrer() {
        return new COCTMT740000UV04Referrer();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Member }
     * 
     */
    public PRPAMT201301UV02Member createPRPAMT201301UV02Member() {
        return new PRPAMT201301UV02Member();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01LanguageCommunication }
     * 
     */
    public COCTMT090300UV01LanguageCommunication createCOCTMT090300UV01LanguageCommunication() {
        return new COCTMT090300UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01ActOrderRequired }
     * 
     */
    public MCAIMT900001UV01ActOrderRequired createMCAIMT900001UV01ActOrderRequired() {
        return new MCAIMT900001UV01ActOrderRequired();
    }

    /**
     * Create an instance of {@link PRPMMT406110UV01Jurisdiction }
     * 
     */
    public PRPMMT406110UV01Jurisdiction createPRPMMT406110UV01Jurisdiction() {
        return new PRPMMT406110UV01Jurisdiction();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04ContentPackagedProduct }
     * 
     */
    public COCTMT490000UV04ContentPackagedProduct createCOCTMT490000UV04ContentPackagedProduct() {
        return new COCTMT490000UV04ContentPackagedProduct();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Device }
     * 
     */
    public COCTMT290000UV06Device createCOCTMT290000UV06Device() {
        return new COCTMT290000UV06Device();
    }

    /**
     * Create an instance of {@link COLLAD2 .StreetAddressLine }
     * 
     */
    public COLLAD2 .StreetAddressLine createCOLLAD2StreetAddressLine() {
        return new COLLAD2 .StreetAddressLine();
    }

    /**
     * Create an instance of {@link COLLAD2 .State }
     * 
     */
    public COLLAD2 .State createCOLLAD2State() {
        return new COLLAD2 .State();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "partOrganization", scope = COCTMT150000UV02OrganizationContains.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT150000UV02OrganizationContainsPartOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT150000UV02OrganizationContainsPartOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT150000UV02OrganizationContains.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT309000UV01HealthCareProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProvider", scope = PRPMIN303011UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT309000UV01HealthCareProvider> createPRPMIN303011UV01MFMIMT700721UV01Subject2HealthCareProvider(PRPMMT309000UV01HealthCareProvider value) {
        return new JAXBElement<PRPMMT309000UV01HealthCareProvider>(_PRPMIN303011UV01MFMIMT700721UV01Subject2HealthCareProvider_QNAME, PRPMMT309000UV01HealthCareProvider.class, PRPMIN303011UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT309000UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMIN303011UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT309000UV01AssignedEntity> createPRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity(PRPMMT309000UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT309000UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT309000UV01AssignedEntity.class, PRPMIN303011UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710000UV07Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = COCTMT070000UV01LocatedEntity.class)
    public JAXBElement<COCTMT710000UV07Place> createCOCTMT070000UV01LocatedEntityLocation(COCTMT710000UV07Place value) {
        return new JAXBElement<COCTMT710000UV07Place>(_COCTMT070000UV01LocatedEntityLocation_QNAME, COCTMT710000UV07Place.class, COCTMT070000UV01LocatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090300UV01AssignedDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = MFMIMT700701UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090300UV01AssignedDevice> createMFMIMT700701UV01AuthorOrPerformerAssignedDevice(COCTMT090300UV01AssignedDevice value) {
        return new JAXBElement<COCTMT090300UV01AssignedDevice>(_MFMIMT700701UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090300UV01AssignedDevice.class, MFMIMT700701UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090100UV01AssignedPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = MFMIMT700701UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090100UV01AssignedPerson> createMFMIMT700701UV01AuthorOrPerformerAssignedPerson(COCTMT090100UV01AssignedPerson value) {
        return new JAXBElement<COCTMT090100UV01AssignedPerson>(_MFMIMT700701UV01AuthorOrPerformerAssignedPerson_QNAME, COCTMT090100UV01AssignedPerson.class, MFMIMT700701UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01HealthCareProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProvider", scope = PRPMIN301010UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT301010UV01HealthCareProvider> createPRPMIN301010UV01MFMIMT700721UV01Subject2HealthCareProvider(PRPMMT301010UV01HealthCareProvider value) {
        return new JAXBElement<PRPMMT301010UV01HealthCareProvider>(_PRPMIN303011UV01MFMIMT700721UV01Subject2HealthCareProvider_QNAME, PRPMMT301010UV01HealthCareProvider.class, PRPMIN301010UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMIN301010UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT301010UV01AssignedEntity> createPRPMIN301010UV01MFMIMT700721UV01Subject2AssignedEntity(PRPMMT301010UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT301010UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT301010UV01AssignedEntity.class, PRPMIN301010UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01QualifiedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedEntity", scope = PRPMIN301010UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT301010UV01QualifiedEntity> createPRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity(PRPMMT301010UV01QualifiedEntity value) {
        return new JAXBElement<PRPMMT301010UV01QualifiedEntity>(_PRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity_QNAME, PRPMMT301010UV01QualifiedEntity.class, PRPMIN301010UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturerOrganization", scope = COCTMT530000UVManufacturedProduct.class)
    public JAXBElement<COCTMT530000UVOrganization> createCOCTMT530000UVManufacturedProductManufacturerOrganization(COCTMT530000UVOrganization value) {
        return new JAXBElement<COCTMT530000UVOrganization>(_COCTMT530000UVManufacturedProductManufacturerOrganization_QNAME, COCTMT530000UVOrganization.class, COCTMT530000UVManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVLabeledDrug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturedLabeledDrug", scope = COCTMT530000UVManufacturedProduct.class)
    public JAXBElement<COCTMT530000UVLabeledDrug> createCOCTMT530000UVManufacturedProductManufacturedLabeledDrug(COCTMT530000UVLabeledDrug value) {
        return new JAXBElement<COCTMT530000UVLabeledDrug>(_COCTMT530000UVManufacturedProductManufacturedLabeledDrug_QNAME, COCTMT530000UVLabeledDrug.class, COCTMT530000UVManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturedMaterial", scope = COCTMT530000UVManufacturedProduct.class)
    public JAXBElement<COCTMT530000UVMaterial> createCOCTMT530000UVManufacturedProductManufacturedMaterial(COCTMT530000UVMaterial value) {
        return new JAXBElement<COCTMT530000UVMaterial>(_COCTMT530000UVManufacturedProductManufacturedMaterial_QNAME, COCTMT530000UVMaterial.class, COCTMT530000UVManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201304UV02NonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientNonPersonLivingSubject", scope = PRPAMT201304UV02Patient.class)
    public JAXBElement<PRPAMT201304UV02NonPersonLivingSubject> createPRPAMT201304UV02PatientPatientNonPersonLivingSubject(PRPAMT201304UV02NonPersonLivingSubject value) {
        return new JAXBElement<PRPAMT201304UV02NonPersonLivingSubject>(_PRPAMT201304UV02PatientPatientNonPersonLivingSubject_QNAME, PRPAMT201304UV02NonPersonLivingSubject.class, PRPAMT201304UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "providerOrganization", scope = PRPAMT201304UV02Patient.class)
    public JAXBElement<COCTMT150003UV03Organization> createPRPAMT201304UV02PatientProviderOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_PRPAMT201304UV02PatientProviderOrganization_QNAME, COCTMT150003UV03Organization.class, PRPAMT201304UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201304UV02Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientPerson", scope = PRPAMT201304UV02Patient.class)
    public JAXBElement<PRPAMT201304UV02Person> createPRPAMT201304UV02PatientPatientPerson(PRPAMT201304UV02Person value) {
        return new JAXBElement<PRPAMT201304UV02Person>(_PRPAMT201304UV02PatientPatientPerson_QNAME, PRPAMT201304UV02Person.class, PRPAMT201304UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710000UV07Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = COCTMT030202UV07BirthPlace.class)
    public JAXBElement<COCTMT710000UV07Place> createCOCTMT030202UV07BirthPlaceBirthplace(COCTMT710000UV07Place value) {
        return new JAXBElement<COCTMT710000UV07Place>(_COCTMT030202UV07BirthPlaceBirthplace_QNAME, COCTMT710000UV07Place.class, COCTMT030202UV07BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201307UV02QueryByParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameter", scope = PRPAIN201309UV02QUQIMT021001UV01ControlActProcess.class)
    public JAXBElement<PRPAMT201307UV02QueryByParameter> createPRPAIN201309UV02QUQIMT021001UV01ControlActProcessQueryByParameter(PRPAMT201307UV02QueryByParameter value) {
        return new JAXBElement<PRPAMT201307UV02QueryByParameter>(_PRPAIN201309UV02QUQIMT021001UV01ControlActProcessQueryByParameter_QNAME, PRPAMT201307UV02QueryByParameter.class, PRPAIN201309UV02QUQIMT021001UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Device2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = COCTMT290000UV06AssignedEntity.class)
    public JAXBElement<COCTMT290000UV06Device2> createCOCTMT290000UV06AssignedEntityAssignedDevice(COCTMT290000UV06Device2 value) {
        return new JAXBElement<COCTMT290000UV06Device2>(_MFMIMT700701UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT290000UV06Device2 .class, COCTMT290000UV06AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06ProviderPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedProviderPerson", scope = COCTMT290000UV06AssignedEntity.class)
    public JAXBElement<COCTMT290000UV06ProviderPerson> createCOCTMT290000UV06AssignedEntityAssignedProviderPerson(COCTMT290000UV06ProviderPerson value) {
        return new JAXBElement<COCTMT290000UV06ProviderPerson>(_COCTMT290000UV06AssignedEntityAssignedProviderPerson_QNAME, COCTMT290000UV06ProviderPerson.class, COCTMT290000UV06AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06NonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedNonPersonLivingSubject", scope = COCTMT290000UV06AssignedEntity.class)
    public JAXBElement<COCTMT290000UV06NonPersonLivingSubject> createCOCTMT290000UV06AssignedEntityAssignedNonPersonLivingSubject(COCTMT290000UV06NonPersonLivingSubject value) {
        return new JAXBElement<COCTMT290000UV06NonPersonLivingSubject>(_COCTMT290000UV06AssignedEntityAssignedNonPersonLivingSubject_QNAME, COCTMT290000UV06NonPersonLivingSubject.class, COCTMT290000UV06AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = PRPAMT201304UV02Student.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201304UV02StudentSchoolOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201304UV02StudentSchoolOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201304UV02Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201310UV02NonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientNonPersonLivingSubject", scope = PRPAMT201310UV02Patient.class)
    public JAXBElement<PRPAMT201310UV02NonPersonLivingSubject> createPRPAMT201310UV02PatientPatientNonPersonLivingSubject(PRPAMT201310UV02NonPersonLivingSubject value) {
        return new JAXBElement<PRPAMT201310UV02NonPersonLivingSubject>(_PRPAMT201304UV02PatientPatientNonPersonLivingSubject_QNAME, PRPAMT201310UV02NonPersonLivingSubject.class, PRPAMT201310UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "providerOrganization", scope = PRPAMT201310UV02Patient.class)
    public JAXBElement<COCTMT150003UV03Organization> createPRPAMT201310UV02PatientProviderOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_PRPAMT201304UV02PatientProviderOrganization_QNAME, COCTMT150003UV03Organization.class, PRPAMT201310UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201310UV02Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientPerson", scope = PRPAMT201310UV02Patient.class)
    public JAXBElement<PRPAMT201310UV02Person> createPRPAMT201310UV02PatientPatientPerson(PRPAMT201310UV02Person value) {
        return new JAXBElement<PRPAMT201310UV02Person>(_PRPAMT201304UV02PatientPatientPerson_QNAME, PRPAMT201310UV02Person.class, PRPAMT201310UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "underwritingOrganization", scope = COCTMT510000UV06Payor.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06PayorUnderwritingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06PayorUnderwritingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Payor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "invoicePayorOrganization", scope = COCTMT510000UV06Payor.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06PayorInvoicePayorOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06PayorInvoicePayorOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Payor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090303UV01Device }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = COCTMT090303UV01AssignedDevice.class)
    public JAXBElement<COCTMT090303UV01Device> createCOCTMT090303UV01AssignedDeviceAssignedDevice(COCTMT090303UV01Device value) {
        return new JAXBElement<COCTMT090303UV01Device>(_MFMIMT700701UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090303UV01Device.class, COCTMT090303UV01AssignedDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090303UV01AssignedDevice.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT090303UV01AssignedDeviceRepresentedOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT090303UV01AssignedDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedPrincipalPerson", scope = PRPMMT306110UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT306110UV01PrincipalPerson> createPRPMMT306110UV01QualifiedEntityQualifiedPrincipalPerson(PRPMMT306110UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT306110UV01PrincipalPerson>(_PRPMMT306110UV01QualifiedEntityQualifiedPrincipalPerson_QNAME, PRPMMT306110UV01PrincipalPerson.class, PRPMMT306110UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualificationGrantingOrganization", scope = PRPMMT306110UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT306110UV01Organization> createPRPMMT306110UV01QualifiedEntityQualificationGrantingOrganization(PRPMMT306110UV01Organization value) {
        return new JAXBElement<PRPMMT306110UV01Organization>(_PRPMMT306110UV01QualifiedEntityQualificationGrantingOrganization_QNAME, PRPMMT306110UV01Organization.class, PRPMMT306110UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = COCTMT050000UV01Student.class)
    public JAXBElement<COCTMT150007UVOrganization> createCOCTMT050000UV01StudentSchoolOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201304UV02StudentSchoolOrganization_QNAME, COCTMT150007UVOrganization.class, COCTMT050000UV01Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306010UV01QueryByParameterPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameterPayload", scope = PRPMIN306010UV01QUQIMT021001UV01ControlActProcess.class)
    public JAXBElement<PRPMMT306010UV01QueryByParameterPayload> createPRPMIN306010UV01QUQIMT021001UV01ControlActProcessQueryByParameterPayload(PRPMMT306010UV01QueryByParameterPayload value) {
        return new JAXBElement<PRPMMT306010UV01QueryByParameterPayload>(_PRPMIN306010UV01QUQIMT021001UV01ControlActProcessQueryByParameterPayload_QNAME, PRPMMT306010UV01QueryByParameterPayload.class, PRPMIN306010UV01QUQIMT021001UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder2", scope = PRPAMT201303UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> createPRPAMT201303UV02PersonalRelationshipRelationshipHolder2(COCTMT030007UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030007UVNonPersonLivingSubject>(_PRPAMT201303UV02PersonalRelationshipRelationshipHolder2_QNAME, COCTMT030007UVNonPersonLivingSubject.class, PRPAMT201303UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder1", scope = PRPAMT201303UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVPerson> createPRPAMT201303UV02PersonalRelationshipRelationshipHolder1(COCTMT030007UVPerson value) {
        return new JAXBElement<COCTMT030007UVPerson>(_PRPAMT201303UV02PersonalRelationshipRelationshipHolder1_QNAME, COCTMT030007UVPerson.class, PRPAMT201303UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710000UV07LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "locatedEntity", scope = COCTMT710000UV07Place.class)
    public JAXBElement<COCTMT710000UV07LocatedEntity> createCOCTMT710000UV07PlaceLocatedEntity(COCTMT710000UV07LocatedEntity value) {
        return new JAXBElement<COCTMT710000UV07LocatedEntity>(_COCTMT710000UV07PlaceLocatedEntity_QNAME, COCTMT710000UV07LocatedEntity.class, COCTMT710000UV07Place.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "memberOrganization1", scope = COCTMT510000UV06Beneficiary.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06BeneficiaryMemberOrganization1(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06BeneficiaryMemberOrganization1_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Beneficiary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "memberPerson", scope = COCTMT510000UV06Beneficiary.class)
    public JAXBElement<COCTMT030007UVPerson> createCOCTMT510000UV06BeneficiaryMemberPerson(COCTMT030007UVPerson value) {
        return new JAXBElement<COCTMT030007UVPerson>(_COCTMT510000UV06BeneficiaryMemberPerson_QNAME, COCTMT030007UVPerson.class, COCTMT510000UV06Beneficiary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "memberNonPersonLivingSubject", scope = COCTMT510000UV06Beneficiary.class)
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> createCOCTMT510000UV06BeneficiaryMemberNonPersonLivingSubject(COCTMT030007UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030007UVNonPersonLivingSubject>(_COCTMT510000UV06BeneficiaryMemberNonPersonLivingSubject_QNAME, COCTMT030007UVNonPersonLivingSubject.class, COCTMT510000UV06Beneficiary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "groupOrganization", scope = COCTMT510000UV06Beneficiary.class)
    public JAXBElement<COCTMT510000UV06Organization> createCOCTMT510000UV06BeneficiaryGroupOrganization(COCTMT510000UV06Organization value) {
        return new JAXBElement<COCTMT510000UV06Organization>(_COCTMT510000UV06BeneficiaryGroupOrganization_QNAME, COCTMT510000UV06Organization.class, COCTMT510000UV06Beneficiary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06FinancialParticipationCharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "financialParticipationCharge", scope = COCTMT510000UV06Limitation2 .class)
    public JAXBElement<COCTMT510000UV06FinancialParticipationCharge> createCOCTMT510000UV06Limitation2FinancialParticipationCharge(COCTMT510000UV06FinancialParticipationCharge value) {
        return new JAXBElement<COCTMT510000UV06FinancialParticipationCharge>(_COCTMT510000UV06Limitation2FinancialParticipationCharge_QNAME, COCTMT510000UV06FinancialParticipationCharge.class, COCTMT510000UV06Limitation2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06CoverageCharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "coverageCharge", scope = COCTMT510000UV06Limitation2 .class)
    public JAXBElement<COCTMT510000UV06CoverageCharge> createCOCTMT510000UV06Limitation2CoverageCharge(COCTMT510000UV06CoverageCharge value) {
        return new JAXBElement<COCTMT510000UV06CoverageCharge>(_COCTMT510000UV06Limitation2CoverageCharge_QNAME, COCTMT510000UV06CoverageCharge.class, COCTMT510000UV06Limitation2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT260003UVLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = COCTMT260003UVOtherSupply.class)
    public JAXBElement<COCTMT260003UVLocation> createCOCTMT260003UVOtherSupplyLocation(COCTMT260003UVLocation value) {
        return new JAXBElement<COCTMT260003UVLocation>(_COCTMT070000UV01LocatedEntityLocation_QNAME, COCTMT260003UVLocation.class, COCTMT260003UVOtherSupply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000200UV01Agent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asAgent", scope = MCCIMT000200UV01Device.class)
    public JAXBElement<MCCIMT000200UV01Agent> createMCCIMT000200UV01DeviceAsAgent(MCCIMT000200UV01Agent value) {
        return new JAXBElement<MCCIMT000200UV01Agent>(_MCCIMT000200UV01DeviceAsAgent_QNAME, MCCIMT000200UV01Agent.class, MCCIMT000200UV01Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201301UV02NonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientNonPersonLivingSubject", scope = PRPAMT201301UV02Patient.class)
    public JAXBElement<PRPAMT201301UV02NonPersonLivingSubject> createPRPAMT201301UV02PatientPatientNonPersonLivingSubject(PRPAMT201301UV02NonPersonLivingSubject value) {
        return new JAXBElement<PRPAMT201301UV02NonPersonLivingSubject>(_PRPAMT201304UV02PatientPatientNonPersonLivingSubject_QNAME, PRPAMT201301UV02NonPersonLivingSubject.class, PRPAMT201301UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201301UV02Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientPerson", scope = PRPAMT201301UV02Patient.class)
    public JAXBElement<PRPAMT201301UV02Person> createPRPAMT201301UV02PatientPatientPerson(PRPAMT201301UV02Person value) {
        return new JAXBElement<PRPAMT201301UV02Person>(_PRPAMT201304UV02PatientPatientPerson_QNAME, PRPAMT201301UV02Person.class, PRPAMT201301UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT309000UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "issuingOrganization", scope = PRPMMT309000UV01HealthCareProvider.class)
    public JAXBElement<PRPMMT309000UV01Organization> createPRPMMT309000UV01HealthCareProviderIssuingOrganization(PRPMMT309000UV01Organization value) {
        return new JAXBElement<PRPMMT309000UV01Organization>(_PRPMMT309000UV01HealthCareProviderIssuingOrganization_QNAME, PRPMMT309000UV01Organization.class, PRPMMT309000UV01HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT309000UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCarePrincipalPerson", scope = PRPMMT309000UV01HealthCareProvider.class)
    public JAXBElement<PRPMMT309000UV01PrincipalPerson> createPRPMMT309000UV01HealthCareProviderHealthCarePrincipalPerson(PRPMMT309000UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT309000UV01PrincipalPerson>(_PRPMMT309000UV01HealthCareProviderHealthCarePrincipalPerson_QNAME, PRPMMT309000UV01PrincipalPerson.class, PRPMMT309000UV01HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT309000UV01Jurisdiction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "territory", scope = PRPMMT309000UV01TerritorialAuthority.class)
    public JAXBElement<PRPMMT309000UV01Jurisdiction> createPRPMMT309000UV01TerritorialAuthorityTerritory(PRPMMT309000UV01Jurisdiction value) {
        return new JAXBElement<PRPMMT309000UV01Jurisdiction>(_PRPMMT309000UV01TerritorialAuthorityTerritory_QNAME, PRPMMT309000UV01Jurisdiction.class, PRPMMT309000UV01TerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "issuingOrganization", scope = COCTMT090000UV01LicensedEntity.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT090000UV01LicensedEntityIssuingOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_PRPMMT309000UV01HealthCareProviderIssuingOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT090000UV01LicensedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patient", scope = COCTMT510000UV06Beneficiary2 .class)
    public JAXBElement<COCTMT050000UV01Patient> createCOCTMT510000UV06Beneficiary2Patient(COCTMT050000UV01Patient value) {
        return new JAXBElement<COCTMT050000UV01Patient>(_COCTMT510000UV06Beneficiary2Patient_QNAME, COCTMT050000UV01Patient.class, COCTMT510000UV06Beneficiary2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Beneficiary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "beneficiary", scope = COCTMT510000UV06Beneficiary2 .class)
    public JAXBElement<COCTMT510000UV06Beneficiary> createCOCTMT510000UV06Beneficiary2Beneficiary(COCTMT510000UV06Beneficiary value) {
        return new JAXBElement<COCTMT510000UV06Beneficiary>(_COCTMT510000UV06Beneficiary2Beneficiary_QNAME, COCTMT510000UV06Beneficiary.class, COCTMT510000UV06Beneficiary2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT820000UVAssignedProvider.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT820000UVAssignedProviderRepresentedOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT820000UVAssignedProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT820000UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT820000UVAssignedProvider.class)
    public JAXBElement<COCTMT820000UVPerson> createCOCTMT820000UVAssignedProviderAssignedPerson(COCTMT820000UVPerson value) {
        return new JAXBElement<COCTMT820000UVPerson>(_MFMIMT700701UV01AuthorOrPerformerAssignedPerson_QNAME, COCTMT820000UVPerson.class, COCTMT820000UVAssignedProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Author1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = COCTMT290000UV06ServiceRequest.class)
    public JAXBElement<COCTMT290000UV06Author1> createCOCTMT290000UV06ServiceRequestAuthor(COCTMT290000UV06Author1 value) {
        return new JAXBElement<COCTMT290000UV06Author1>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, COCTMT290000UV06Author1 .class, COCTMT290000UV06ServiceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09SpecimenCollectionProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "specimenCollectionProcess", scope = COCTMT080000UV09Subject2 .class)
    public JAXBElement<COCTMT080000UV09SpecimenCollectionProcess> createCOCTMT080000UV09Subject2SpecimenCollectionProcess(COCTMT080000UV09SpecimenCollectionProcess value) {
        return new JAXBElement<COCTMT080000UV09SpecimenCollectionProcess>(_COCTMT080000UV09Subject2SpecimenCollectionProcess_QNAME, COCTMT080000UV09SpecimenCollectionProcess.class, COCTMT080000UV09Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09SpecimenProcessStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "specimenProcessStep", scope = COCTMT080000UV09Subject2 .class)
    public JAXBElement<COCTMT080000UV09SpecimenProcessStep> createCOCTMT080000UV09Subject2SpecimenProcessStep(COCTMT080000UV09SpecimenProcessStep value) {
        return new JAXBElement<COCTMT080000UV09SpecimenProcessStep>(_COCTMT080000UV09Subject2SpecimenProcessStep_QNAME, COCTMT080000UV09SpecimenProcessStep.class, COCTMT080000UV09Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09ObservationEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "observationEvent", scope = COCTMT080000UV09Subject2 .class)
    public JAXBElement<COCTMT080000UV09ObservationEvent> createCOCTMT080000UV09Subject2ObservationEvent(COCTMT080000UV09ObservationEvent value) {
        return new JAXBElement<COCTMT080000UV09ObservationEvent>(_COCTMT080000UV09Subject2ObservationEvent_QNAME, COCTMT080000UV09ObservationEvent.class, COCTMT080000UV09Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scoper1", scope = PRPMMT401010UV01Affiliate.class)
    public JAXBElement<PRPMMT401010UV01PrincipalPerson> createPRPMMT401010UV01AffiliateScoper1(PRPMMT401010UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT401010UV01PrincipalPerson>(_PRPMMT401010UV01AffiliateScoper1_QNAME, PRPMMT401010UV01PrincipalPerson.class, PRPMMT401010UV01Affiliate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01PrincipalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scoper2", scope = PRPMMT401010UV01Affiliate.class)
    public JAXBElement<PRPMMT401010UV01PrincipalOrganization> createPRPMMT401010UV01AffiliateScoper2(PRPMMT401010UV01PrincipalOrganization value) {
        return new JAXBElement<PRPMMT401010UV01PrincipalOrganization>(_PRPMMT401010UV01AffiliateScoper2_QNAME, PRPMMT401010UV01PrincipalOrganization.class, PRPMMT401010UV01Affiliate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder2", scope = PRPAMT201310UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> createPRPAMT201310UV02PersonalRelationshipRelationshipHolder2(COCTMT030007UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030007UVNonPersonLivingSubject>(_PRPAMT201303UV02PersonalRelationshipRelationshipHolder2_QNAME, COCTMT030007UVNonPersonLivingSubject.class, PRPAMT201310UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder1", scope = PRPAMT201310UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVPerson> createPRPAMT201310UV02PersonalRelationshipRelationshipHolder1(COCTMT030007UVPerson value) {
        return new JAXBElement<COCTMT030007UVPerson>(_PRPAMT201303UV02PersonalRelationshipRelationshipHolder1_QNAME, COCTMT030007UVPerson.class, PRPAMT201310UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPMIN406110UV01MFMIMT700711UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700711UV01Author2> createPRPMIN406110UV01MFMIMT700711UV01RegistrationEventAuthor(MFMIMT700711UV01Author2 value) {
        return new JAXBElement<MFMIMT700711UV01Author2>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, MFMIMT700711UV01Author2 .class, PRPMIN406110UV01MFMIMT700711UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVAgency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "territory", scope = COCTMT230100UVTerritorialAuthority.class)
    public JAXBElement<COCTMT230100UVAgency> createCOCTMT230100UVTerritorialAuthorityTerritory(COCTMT230100UVAgency value) {
        return new JAXBElement<COCTMT230100UVAgency>(_PRPMMT309000UV01TerritorialAuthorityTerritory_QNAME, COCTMT230100UVAgency.class, COCTMT230100UVTerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "governingCountry", scope = COCTMT230100UVTerritorialAuthority.class)
    public JAXBElement<COCTMT230100UVCountry> createCOCTMT230100UVTerritorialAuthorityGoverningCountry(COCTMT230100UVCountry value) {
        return new JAXBElement<COCTMT230100UVCountry>(_COCTMT230100UVTerritorialAuthorityGoverningCountry_QNAME, COCTMT230100UVCountry.class, COCTMT230100UVTerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030202UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = COCTMT030007UVContactParty.class)
    public JAXBElement<COCTMT030202UV07Person> createCOCTMT030007UVContactPartyContactPerson(COCTMT030202UV07Person value) {
        return new JAXBElement<COCTMT030202UV07Person>(_COCTMT030007UVContactPartyContactPerson_QNAME, COCTMT030202UV07Person.class, COCTMT030007UVContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150002UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = COCTMT030007UVContactParty.class)
    public JAXBElement<COCTMT150002UV01Organization> createCOCTMT030007UVContactPartyContactOrganization(COCTMT150002UV01Organization value) {
        return new JAXBElement<COCTMT150002UV01Organization>(_COCTMT030007UVContactPartyContactOrganization_QNAME, COCTMT150002UV01Organization.class, COCTMT030007UVContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Definition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT080000UV09SpecimenCollectionProcess.class)
    public JAXBElement<COCTMT080000UV09Definition> createCOCTMT080000UV09SpecimenCollectionProcessDefinition(COCTMT080000UV09Definition value) {
        return new JAXBElement<COCTMT080000UV09Definition>(_COCTMT080000UV09SpecimenCollectionProcessDefinition_QNAME, COCTMT080000UV09Definition.class, COCTMT080000UV09SpecimenCollectionProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Subject5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf2", scope = COCTMT080000UV09SpecimenCollectionProcess.class)
    public JAXBElement<COCTMT080000UV09Subject5> createCOCTMT080000UV09SpecimenCollectionProcessSubjectOf2(COCTMT080000UV09Subject5 value) {
        return new JAXBElement<COCTMT080000UV09Subject5>(_COCTMT080000UV09SpecimenCollectionProcessSubjectOf2_QNAME, COCTMT080000UV09Subject5 .class, COCTMT080000UV09SpecimenCollectionProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVHolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "holder", scope = COCTMT230100UVApproval.class)
    public JAXBElement<COCTMT230100UVHolder> createCOCTMT230100UVApprovalHolder(COCTMT230100UVHolder value) {
        return new JAXBElement<COCTMT230100UVHolder>(_COCTMT230100UVApprovalHolder_QNAME, COCTMT230100UVHolder.class, COCTMT230100UVApproval.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01Subject5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject", scope = PRPMMT306110UV01InformRequest.class)
    public JAXBElement<PRPMMT306110UV01Subject5> createPRPMMT306110UV01InformRequestSubject(PRPMMT306110UV01Subject5 value) {
        return new JAXBElement<PRPMMT306110UV01Subject5>(_PRPMMT306110UV01InformRequestSubject_QNAME, PRPMMT306110UV01Subject5 .class, PRPMMT306110UV01InformRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sponsorOrganization", scope = COCTMT510000UV06Sponsor.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06SponsorSponsorOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06SponsorSponsorOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Sponsor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "underwritingOrganization", scope = COCTMT510000UV06Sponsor.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06SponsorUnderwritingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06PayorUnderwritingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Sponsor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ENXP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "part", scope = EN.class)
    public JAXBElement<ENXP> createENPart(ENXP value) {
        return new JAXBElement<ENXP>(_ENPart_QNAME, ENXP.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Container }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "additiveContainer", scope = COCTMT080000UV09Additive.class)
    public JAXBElement<COCTMT080000UV09Container> createCOCTMT080000UV09AdditiveAdditiveContainer(COCTMT080000UV09Container value) {
        return new JAXBElement<COCTMT080000UV09Container>(_COCTMT080000UV09AdditiveAdditiveContainer_QNAME, COCTMT080000UV09Container.class, COCTMT080000UV09Additive.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09AdditiveMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "additiveMaterial", scope = COCTMT080000UV09Additive.class)
    public JAXBElement<COCTMT080000UV09AdditiveMaterial> createCOCTMT080000UV09AdditiveAdditiveMaterial(COCTMT080000UV09AdditiveMaterial value) {
        return new JAXBElement<COCTMT080000UV09AdditiveMaterial>(_COCTMT080000UV09AdditiveAdditiveMaterial_QNAME, COCTMT080000UV09AdditiveMaterial.class, COCTMT080000UV09Additive.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Holder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "additiveHolder", scope = COCTMT080000UV09Additive.class)
    public JAXBElement<COCTMT080000UV09Holder> createCOCTMT080000UV09AdditiveAdditiveHolder(COCTMT080000UV09Holder value) {
        return new JAXBElement<COCTMT080000UV09Holder>(_COCTMT080000UV09AdditiveAdditiveHolder_QNAME, COCTMT080000UV09Holder.class, COCTMT080000UV09Additive.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306910UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = PRPMMT306910UV01AssignedEntity.class)
    public JAXBElement<PRPMMT306910UV01Organization> createPRPMMT306910UV01AssignedEntityRepresentedOrganization(PRPMMT306910UV01Organization value) {
        return new JAXBElement<PRPMMT306910UV01Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, PRPMMT306910UV01Organization.class, PRPMMT306910UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306910UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPrincipalPerson", scope = PRPMMT306910UV01AssignedEntity.class)
    public JAXBElement<PRPMMT306910UV01PrincipalPerson> createPRPMMT306910UV01AssignedEntityAssignedPrincipalPerson(PRPMMT306910UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT306910UV01PrincipalPerson>(_PRPMMT306910UV01AssignedEntityAssignedPrincipalPerson_QNAME, PRPMMT306910UV01PrincipalPerson.class, PRPMMT306910UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturerOrganization", scope = COCTMT430000UV09LabTestKit.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT430000UV09LabTestKitManufacturerOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT530000UVManufacturedProductManufacturerOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT430000UV09LabTestKit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT430000UV09TestKit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturedTestKit", scope = COCTMT430000UV09LabTestKit.class)
    public JAXBElement<COCTMT430000UV09TestKit> createCOCTMT430000UV09LabTestKitManufacturedTestKit(COCTMT430000UV09TestKit value) {
        return new JAXBElement<COCTMT430000UV09TestKit>(_COCTMT430000UV09LabTestKitManufacturedTestKit_QNAME, COCTMT430000UV09TestKit.class, COCTMT430000UV09LabTestKit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06ProviderPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProviderPerson", scope = COCTMT600000UV06HealthCareProvider.class)
    public JAXBElement<COCTMT600000UV06ProviderPerson> createCOCTMT600000UV06HealthCareProviderHealthCareProviderPerson(COCTMT600000UV06ProviderPerson value) {
        return new JAXBElement<COCTMT600000UV06ProviderPerson>(_COCTMT600000UV06HealthCareProviderHealthCareProviderPerson_QNAME, COCTMT600000UV06ProviderPerson.class, COCTMT600000UV06HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = COCTMT600000UV06PrescriptionOrder.class)
    public JAXBElement<COCTMT600000UV06Author> createCOCTMT600000UV06PrescriptionOrderAuthor(COCTMT600000UV06Author value) {
        return new JAXBElement<COCTMT600000UV06Author>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, COCTMT600000UV06Author.class, COCTMT600000UV06PrescriptionOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedPerson", scope = COCTMT530000UVRelatedEntity.class)
    public JAXBElement<COCTMT530000UVPerson> createCOCTMT530000UVRelatedEntityRelatedPerson(COCTMT530000UVPerson value) {
        return new JAXBElement<COCTMT530000UVPerson>(_COCTMT530000UVRelatedEntityRelatedPerson_QNAME, COCTMT530000UVPerson.class, COCTMT530000UVRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedEntity", scope = COCTMT530000UVRelatedEntity.class)
    public JAXBElement<COCTMT530000UVEntity> createCOCTMT530000UVRelatedEntityRelatedEntity(COCTMT530000UVEntity value) {
        return new JAXBElement<COCTMT530000UVEntity>(_COCTMT530000UVRelatedEntityRelatedEntity_QNAME, COCTMT530000UVEntity.class, COCTMT530000UVRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAnimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedAnimal", scope = COCTMT530000UVRelatedEntity.class)
    public JAXBElement<COCTMT530000UVAnimal> createCOCTMT530000UVRelatedEntityRelatedAnimal(COCTMT530000UVAnimal value) {
        return new JAXBElement<COCTMT530000UVAnimal>(_COCTMT530000UVRelatedEntityRelatedAnimal_QNAME, COCTMT530000UVAnimal.class, COCTMT530000UVRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAnimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingAnimal", scope = COCTMT530000UVRelatedEntity.class)
    public JAXBElement<COCTMT530000UVAnimal> createCOCTMT530000UVRelatedEntityScopingAnimal(COCTMT530000UVAnimal value) {
        return new JAXBElement<COCTMT530000UVAnimal>(_COCTMT530000UVRelatedEntityScopingAnimal_QNAME, COCTMT530000UVAnimal.class, COCTMT530000UVRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingEntity", scope = COCTMT530000UVRelatedEntity.class)
    public JAXBElement<COCTMT530000UVEntity> createCOCTMT530000UVRelatedEntityScopingEntity(COCTMT530000UVEntity value) {
        return new JAXBElement<COCTMT530000UVEntity>(_COCTMT530000UVRelatedEntityScopingEntity_QNAME, COCTMT530000UVEntity.class, COCTMT530000UVRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingPerson", scope = COCTMT530000UVRelatedEntity.class)
    public JAXBElement<COCTMT530000UVPerson> createCOCTMT530000UVRelatedEntityScopingPerson(COCTMT530000UVPerson value) {
        return new JAXBElement<COCTMT530000UVPerson>(_COCTMT530000UVRelatedEntityScopingPerson_QNAME, COCTMT530000UVPerson.class, COCTMT530000UVRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Subject8 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf3", scope = PRPMMT301010UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT301010UV01Subject8> createPRPMMT301010UV01QualifiedEntitySubjectOf3(PRPMMT301010UV01Subject8 value) {
        return new JAXBElement<PRPMMT301010UV01Subject8>(_PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME, PRPMMT301010UV01Subject8 .class, PRPMMT301010UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedPrincipalPerson", scope = PRPMMT301010UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT301010UV01PrincipalPerson> createPRPMMT301010UV01QualifiedEntityQualifiedPrincipalPerson(PRPMMT301010UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT301010UV01PrincipalPerson>(_PRPMMT306110UV01QualifiedEntityQualifiedPrincipalPerson_QNAME, PRPMMT301010UV01PrincipalPerson.class, PRPMMT301010UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualificationGrantingOrganization", scope = PRPMMT301010UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT301010UV01Organization> createPRPMMT301010UV01QualifiedEntityQualificationGrantingOrganization(PRPMMT301010UV01Organization value) {
        return new JAXBElement<PRPMMT301010UV01Organization>(_PRPMMT306110UV01QualifiedEntityQualificationGrantingOrganization_QNAME, PRPMMT301010UV01Organization.class, PRPMMT301010UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201303UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201303UV02NonPersonLivingSubject.class)
    public JAXBElement<PRPAMT201303UV02BirthPlace> createPRPAMT201303UV02NonPersonLivingSubjectBirthPlace(PRPAMT201303UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201303UV02BirthPlace>(_PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME, PRPAMT201303UV02BirthPlace.class, PRPAMT201303UV02NonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Jurisdiction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "territory", scope = PRPMMT301010UV01TerritorialAuthority.class)
    public JAXBElement<PRPMMT301010UV01Jurisdiction> createPRPMMT301010UV01TerritorialAuthorityTerritory(PRPMMT301010UV01Jurisdiction value) {
        return new JAXBElement<PRPMMT301010UV01Jurisdiction>(_PRPMMT309000UV01TerritorialAuthorityTerritory_QNAME, PRPMMT301010UV01Jurisdiction.class, PRPMMT301010UV01TerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT040203UV09NotificationParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "notificationParty", scope = MCCIMT000300UV01Organization.class)
    public JAXBElement<COCTMT040203UV09NotificationParty> createMCCIMT000300UV01OrganizationNotificationParty(COCTMT040203UV09NotificationParty value) {
        return new JAXBElement<COCTMT040203UV09NotificationParty>(_MCCIMT000300UV01OrganizationNotificationParty_QNAME, COCTMT040203UV09NotificationParty.class, MCCIMT000300UV01Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = COCTMT290000UV06PatientCareProvisionRequest.class)
    public JAXBElement<COCTMT290000UV06Author2> createCOCTMT290000UV06PatientCareProvisionRequestAuthor(COCTMT290000UV06Author2 value) {
        return new JAXBElement<COCTMT290000UV06Author2>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, COCTMT290000UV06Author2 .class, COCTMT290000UV06PatientCareProvisionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPMIN306051UV01MFMIMT700711UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700711UV01Author2> createPRPMIN306051UV01MFMIMT700711UV01RegistrationEventAuthor(MFMIMT700711UV01Author2 value) {
        return new JAXBElement<MFMIMT700711UV01Author2>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, MFMIMT700711UV01Author2 .class, PRPMIN306051UV01MFMIMT700711UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Beneficiary2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "beneficiary", scope = COCTMT510000UV06CoverageRecord.class)
    public JAXBElement<COCTMT510000UV06Beneficiary2> createCOCTMT510000UV06CoverageRecordBeneficiary(COCTMT510000UV06Beneficiary2 value) {
        return new JAXBElement<COCTMT510000UV06Beneficiary2>(_COCTMT510000UV06Beneficiary2Beneficiary_QNAME, COCTMT510000UV06Beneficiary2 .class, COCTMT510000UV06CoverageRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "affiliatedPrincipalPerson", scope = PRPMMT303010UV01Affiliate.class)
    public JAXBElement<PRPMMT303010UV01PrincipalPerson> createPRPMMT303010UV01AffiliateAffiliatedPrincipalPerson(PRPMMT303010UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT303010UV01PrincipalPerson>(_PRPMMT303010UV01AffiliateAffiliatedPrincipalPerson_QNAME, PRPMMT303010UV01PrincipalPerson.class, PRPMMT303010UV01Affiliate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01PrincipalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "affiliatedPrincipalOrganization", scope = PRPMMT303010UV01Affiliate.class)
    public JAXBElement<PRPMMT303010UV01PrincipalOrganization> createPRPMMT303010UV01AffiliateAffiliatedPrincipalOrganization(PRPMMT303010UV01PrincipalOrganization value) {
        return new JAXBElement<PRPMMT303010UV01PrincipalOrganization>(_PRPMMT303010UV01AffiliateAffiliatedPrincipalOrganization_QNAME, PRPMMT303010UV01PrincipalOrganization.class, PRPMMT303010UV01Affiliate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT260003UVManufacturedMaterialKind }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturedMaterialKind", scope = COCTMT260003UVManufacturedProduct.class)
    public JAXBElement<COCTMT260003UVManufacturedMaterialKind> createCOCTMT260003UVManufacturedProductManufacturedMaterialKind(COCTMT260003UVManufacturedMaterialKind value) {
        return new JAXBElement<COCTMT260003UVManufacturedMaterialKind>(_COCTMT260003UVManufacturedProductManufacturedMaterialKind_QNAME, COCTMT260003UVManufacturedMaterialKind.class, COCTMT260003UVManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder2", scope = COCTMT050000UV01PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> createCOCTMT050000UV01PersonalRelationshipRelationshipHolder2(COCTMT030007UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030007UVNonPersonLivingSubject>(_PRPAMT201303UV02PersonalRelationshipRelationshipHolder2_QNAME, COCTMT030007UVNonPersonLivingSubject.class, COCTMT050000UV01PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder1", scope = COCTMT050000UV01PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVPerson> createCOCTMT050000UV01PersonalRelationshipRelationshipHolder1(COCTMT030007UVPerson value) {
        return new JAXBElement<COCTMT030007UVPerson>(_PRPAMT201303UV02PersonalRelationshipRelationshipHolder1_QNAME, COCTMT030007UVPerson.class, COCTMT050000UV01PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01Subject8 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf3", scope = PRPMMT401010UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT401010UV01Subject8> createPRPMMT401010UV01QualifiedEntitySubjectOf3(PRPMMT401010UV01Subject8 value) {
        return new JAXBElement<PRPMMT401010UV01Subject8>(_PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME, PRPMMT401010UV01Subject8 .class, PRPMMT401010UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01PrincipalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedPrincipalOrganization", scope = PRPMMT401010UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT401010UV01PrincipalOrganization> createPRPMMT401010UV01QualifiedEntityQualifiedPrincipalOrganization(PRPMMT401010UV01PrincipalOrganization value) {
        return new JAXBElement<PRPMMT401010UV01PrincipalOrganization>(_PRPMMT401010UV01QualifiedEntityQualifiedPrincipalOrganization_QNAME, PRPMMT401010UV01PrincipalOrganization.class, PRPMMT401010UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedPrincipalPerson", scope = PRPMMT401010UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT401010UV01PrincipalPerson> createPRPMMT401010UV01QualifiedEntityQualifiedPrincipalPerson(PRPMMT401010UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT401010UV01PrincipalPerson>(_PRPMMT306110UV01QualifiedEntityQualifiedPrincipalPerson_QNAME, PRPMMT401010UV01PrincipalPerson.class, PRPMMT401010UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualificationGrantingOrganization", scope = PRPMMT401010UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT401010UV01Organization> createPRPMMT401010UV01QualifiedEntityQualificationGrantingOrganization(PRPMMT401010UV01Organization value) {
        return new JAXBElement<PRPMMT401010UV01Organization>(_PRPMMT306110UV01QualifiedEntityQualificationGrantingOrganization_QNAME, PRPMMT401010UV01Organization.class, PRPMMT401010UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT090000UV01Person.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT090000UV01PersonAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090000UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT090000UV01Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406010UV01QueryByParameterPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameterPayload", scope = PRPMIN406010UV01QUQIMT021001UV01ControlActProcess.class)
    public JAXBElement<PRPMMT406010UV01QueryByParameterPayload> createPRPMIN406010UV01QUQIMT021001UV01ControlActProcessQueryByParameterPayload(PRPMMT406010UV01QueryByParameterPayload value) {
        return new JAXBElement<PRPMMT406010UV01QueryByParameterPayload>(_PRPMIN306010UV01QUQIMT021001UV01ControlActProcessQueryByParameterPayload_QNAME, PRPMMT406010UV01QueryByParameterPayload.class, PRPMIN406010UV01QUQIMT021001UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVSubstanceAdministration.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVSubstanceAdministrationDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT080000UV09SpecimenCollectionProcessDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVSubstanceAdministration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVSubstanceAdministration.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVSubstanceAdministrationSubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_COCTMT530000UVSubstanceAdministrationSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVSubstanceAdministration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVSubstanceAdministration.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVSubstanceAdministrationDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVSubstanceAdministrationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVSubstanceAdministration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVConsumable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "consumable", scope = COCTMT530000UVSubstanceAdministration.class)
    public JAXBElement<COCTMT530000UVConsumable> createCOCTMT530000UVSubstanceAdministrationConsumable(COCTMT530000UVConsumable value) {
        return new JAXBElement<COCTMT530000UVConsumable>(_COCTMT530000UVSubstanceAdministrationConsumable_QNAME, COCTMT530000UVConsumable.class, COCTMT530000UVSubstanceAdministration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVSubstanceAdministration.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVSubstanceAdministrationRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVSubstanceAdministrationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVSubstanceAdministration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090100UV01AssignedPerson.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT090100UV01AssignedPersonRepresentedOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT090100UV01AssignedPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090100UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT090100UV01AssignedPerson.class)
    public JAXBElement<COCTMT090100UV01Person> createCOCTMT090100UV01AssignedPersonAssignedPerson(COCTMT090100UV01Person value) {
        return new JAXBElement<COCTMT090100UV01Person>(_MFMIMT700701UV01AuthorOrPerformerAssignedPerson_QNAME, COCTMT090100UV01Person.class, COCTMT090100UV01AssignedPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = PRPMMT403010UV01ServiceDeliveryLocation.class)
    public JAXBElement<PRPMMT403010UV01Place> createPRPMMT403010UV01ServiceDeliveryLocationLocation(PRPMMT403010UV01Place value) {
        return new JAXBElement<PRPMMT403010UV01Place>(_COCTMT070000UV01LocatedEntityLocation_QNAME, PRPMMT403010UV01Place.class, PRPMMT403010UV01ServiceDeliveryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVMedicineClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "generalizedMedicineClass", scope = COCTMT230100UVSpecializedKind.class)
    public JAXBElement<COCTMT230100UVMedicineClass> createCOCTMT230100UVSpecializedKindGeneralizedMedicineClass(COCTMT230100UVMedicineClass value) {
        return new JAXBElement<COCTMT230100UVMedicineClass>(_COCTMT230100UVSpecializedKindGeneralizedMedicineClass_QNAME, COCTMT230100UVMedicineClass.class, COCTMT230100UVSpecializedKind.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT090000UV01Organization.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT090000UV01OrganizationAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090000UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT090000UV01Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201306UV02QueryByParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameter", scope = PRPAIN201305UV02QUQIMT021001UV01ControlActProcess.class)
    public JAXBElement<PRPAMT201306UV02QueryByParameter> createPRPAIN201305UV02QUQIMT021001UV01ControlActProcessQueryByParameter(PRPAMT201306UV02QueryByParameter value) {
        return new JAXBElement<PRPAMT201306UV02QueryByParameter>(_PRPAIN201309UV02QUQIMT021001UV01ControlActProcessQueryByParameter_QNAME, PRPAMT201306UV02QueryByParameter.class, PRPAIN201305UV02QUQIMT021001UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT090000UV01RoleOther.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT090000UV01RoleOtherScopingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT090000UV01RoleOther.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201310UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201310UV02NonPersonLivingSubject.class)
    public JAXBElement<PRPAMT201310UV02BirthPlace> createPRPAMT201310UV02NonPersonLivingSubjectBirthPlace(PRPAMT201310UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201310UV02BirthPlace>(_PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME, PRPAMT201310UV02BirthPlace.class, PRPAMT201310UV02NonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT309000UV01HealthCareProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProvider", scope = PRPMMT309000UV01RelatedTo.class)
    public JAXBElement<PRPMMT309000UV01HealthCareProvider> createPRPMMT309000UV01RelatedToHealthCareProvider(PRPMMT309000UV01HealthCareProvider value) {
        return new JAXBElement<PRPMMT309000UV01HealthCareProvider>(_PRPMIN303011UV01MFMIMT700721UV01Subject2HealthCareProvider_QNAME, PRPMMT309000UV01HealthCareProvider.class, PRPMMT309000UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT309000UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMMT309000UV01RelatedTo.class)
    public JAXBElement<PRPMMT309000UV01AssignedEntity> createPRPMMT309000UV01RelatedToAssignedEntity(PRPMMT309000UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT309000UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT309000UV01AssignedEntity.class, PRPMMT309000UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406110UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMIN406110UV01MFMIMT700711UV01Subject2 .class)
    public JAXBElement<PRPMMT406110UV01AssignedEntity> createPRPMIN406110UV01MFMIMT700711UV01Subject2AssignedEntity(PRPMMT406110UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT406110UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT406110UV01AssignedEntity.class, PRPMIN406110UV01MFMIMT700711UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406110UV01QualifiedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedEntity", scope = PRPMIN406110UV01MFMIMT700711UV01Subject2 .class)
    public JAXBElement<PRPMMT406110UV01QualifiedEntity> createPRPMIN406110UV01MFMIMT700711UV01Subject2QualifiedEntity(PRPMMT406110UV01QualifiedEntity value) {
        return new JAXBElement<PRPMMT406110UV01QualifiedEntity>(_PRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity_QNAME, PRPMMT406110UV01QualifiedEntity.class, PRPMIN406110UV01MFMIMT700711UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = PRPMMT401010UV01ServiceDeliveryLocation.class)
    public JAXBElement<PRPMMT401010UV01Place> createPRPMMT401010UV01ServiceDeliveryLocationLocation(PRPMMT401010UV01Place value) {
        return new JAXBElement<PRPMMT401010UV01Place>(_COCTMT070000UV01LocatedEntityLocation_QNAME, PRPMMT401010UV01Place.class, PRPMMT401010UV01ServiceDeliveryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "issuingOrganization", scope = COCTMT090100UV01LicensedEntity.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT090100UV01LicensedEntityIssuingOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_PRPMMT309000UV01HealthCareProviderIssuingOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT090100UV01LicensedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Definition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT080000UV09ObservationEvent.class)
    public JAXBElement<COCTMT080000UV09Definition> createCOCTMT080000UV09ObservationEventDefinition(COCTMT080000UV09Definition value) {
        return new JAXBElement<COCTMT080000UV09Definition>(_COCTMT080000UV09SpecimenCollectionProcessDefinition_QNAME, COCTMT080000UV09Definition.class, COCTMT080000UV09ObservationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Subject5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf2", scope = COCTMT080000UV09ObservationEvent.class)
    public JAXBElement<COCTMT080000UV09Subject5> createCOCTMT080000UV09ObservationEventSubjectOf2(COCTMT080000UV09Subject5 value) {
        return new JAXBElement<COCTMT080000UV09Subject5>(_COCTMT080000UV09SpecimenCollectionProcessSubjectOf2_QNAME, COCTMT080000UV09Subject5 .class, COCTMT080000UV09ObservationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "issuingOrganization", scope = PRPMMT306110UV01HealthCareProvider.class)
    public JAXBElement<PRPMMT306110UV01Organization> createPRPMMT306110UV01HealthCareProviderIssuingOrganization(PRPMMT306110UV01Organization value) {
        return new JAXBElement<PRPMMT306110UV01Organization>(_PRPMMT309000UV01HealthCareProviderIssuingOrganization_QNAME, PRPMMT306110UV01Organization.class, PRPMMT306110UV01HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCarePrincipalPerson", scope = PRPMMT306110UV01HealthCareProvider.class)
    public JAXBElement<PRPMMT306110UV01PrincipalPerson> createPRPMMT306110UV01HealthCareProviderHealthCarePrincipalPerson(PRPMMT306110UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT306110UV01PrincipalPerson>(_PRPMMT309000UV01HealthCareProviderHealthCarePrincipalPerson_QNAME, PRPMMT306110UV01PrincipalPerson.class, PRPMMT306110UV01HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder2", scope = PRPAMT201302UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> createPRPAMT201302UV02PersonalRelationshipRelationshipHolder2(COCTMT030007UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030007UVNonPersonLivingSubject>(_PRPAMT201303UV02PersonalRelationshipRelationshipHolder2_QNAME, COCTMT030007UVNonPersonLivingSubject.class, PRPAMT201302UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder1", scope = PRPAMT201302UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVPerson> createPRPAMT201302UV02PersonalRelationshipRelationshipHolder1(COCTMT030007UVPerson value) {
        return new JAXBElement<COCTMT030007UVPerson>(_PRPAMT201303UV02PersonalRelationshipRelationshipHolder1_QNAME, COCTMT030007UVPerson.class, PRPAMT201302UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Specimen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "specimen", scope = COCTMT530000UVSubject2 .class)
    public JAXBElement<COCTMT080000UV09Specimen> createCOCTMT530000UVSubject2Specimen(COCTMT080000UV09Specimen value) {
        return new JAXBElement<COCTMT080000UV09Specimen>(_COCTMT530000UVSubject2Specimen_QNAME, COCTMT080000UV09Specimen.class, COCTMT530000UVSubject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patient1", scope = COCTMT530000UVSubject2 .class)
    public JAXBElement<COCTMT050000UV01Patient> createCOCTMT530000UVSubject2Patient1(COCTMT050000UV01Patient value) {
        return new JAXBElement<COCTMT050000UV01Patient>(_COCTMT530000UVSubject2Patient1_QNAME, COCTMT050000UV01Patient.class, COCTMT530000UVSubject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRelatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedEntity1", scope = COCTMT530000UVSubject2 .class)
    public JAXBElement<COCTMT530000UVRelatedEntity> createCOCTMT530000UVSubject2RelatedEntity1(COCTMT530000UVRelatedEntity value) {
        return new JAXBElement<COCTMT530000UVRelatedEntity>(_COCTMT530000UVSubject2RelatedEntity1_QNAME, COCTMT530000UVRelatedEntity.class, COCTMT530000UVSubject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09DerivedSpecimen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "derivedSpecimen", scope = COCTMT530000UVSubject2 .class)
    public JAXBElement<COCTMT080000UV09DerivedSpecimen> createCOCTMT530000UVSubject2DerivedSpecimen(COCTMT080000UV09DerivedSpecimen value) {
        return new JAXBElement<COCTMT080000UV09DerivedSpecimen>(_COCTMT530000UVSubject2DerivedSpecimen_QNAME, COCTMT080000UV09DerivedSpecimen.class, COCTMT530000UVSubject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01Jurisdiction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "territory", scope = PRPMMT303010UV01TerritorialAuthority.class)
    public JAXBElement<PRPMMT303010UV01Jurisdiction> createPRPMMT303010UV01TerritorialAuthorityTerritory(PRPMMT303010UV01Jurisdiction value) {
        return new JAXBElement<PRPMMT303010UV01Jurisdiction>(_PRPMMT309000UV01TerritorialAuthorityTerritory_QNAME, PRPMMT303010UV01Jurisdiction.class, PRPMMT303010UV01TerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710000UV07Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = COCTMT050000UV01BirthPlace.class)
    public JAXBElement<COCTMT710000UV07Place> createCOCTMT050000UV01BirthPlaceBirthplace(COCTMT710000UV07Place value) {
        return new JAXBElement<COCTMT710000UV07Place>(_COCTMT030202UV07BirthPlaceBirthplace_QNAME, COCTMT710000UV07Place.class, COCTMT050000UV01BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Holder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "containerHolder", scope = COCTMT080000UV09EntityInEntity.class)
    public JAXBElement<COCTMT080000UV09Holder> createCOCTMT080000UV09EntityInEntityContainerHolder(COCTMT080000UV09Holder value) {
        return new JAXBElement<COCTMT080000UV09Holder>(_COCTMT080000UV09EntityInEntityContainerHolder_QNAME, COCTMT080000UV09Holder.class, COCTMT080000UV09EntityInEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09AdditiveMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "containerAdditiveMaterial", scope = COCTMT080000UV09EntityInEntity.class)
    public JAXBElement<COCTMT080000UV09AdditiveMaterial> createCOCTMT080000UV09EntityInEntityContainerAdditiveMaterial(COCTMT080000UV09AdditiveMaterial value) {
        return new JAXBElement<COCTMT080000UV09AdditiveMaterial>(_COCTMT080000UV09EntityInEntityContainerAdditiveMaterial_QNAME, COCTMT080000UV09AdditiveMaterial.class, COCTMT080000UV09EntityInEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Container }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "container", scope = COCTMT080000UV09EntityInEntity.class)
    public JAXBElement<COCTMT080000UV09Container> createCOCTMT080000UV09EntityInEntityContainer(COCTMT080000UV09Container value) {
        return new JAXBElement<COCTMT080000UV09Container>(_COCTMT080000UV09EntityInEntityContainer_QNAME, COCTMT080000UV09Container.class, COCTMT080000UV09EntityInEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201303UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201303UV02Person.class)
    public JAXBElement<PRPAMT201303UV02BirthPlace> createPRPAMT201303UV02PersonBirthPlace(PRPAMT201303UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201303UV02BirthPlace>(_PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME, PRPAMT201303UV02BirthPlace.class, PRPAMT201303UV02Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Additive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "additive", scope = COCTMT080000UV09Subject1 .class)
    public JAXBElement<COCTMT080000UV09Additive> createCOCTMT080000UV09Subject1Additive(COCTMT080000UV09Additive value) {
        return new JAXBElement<COCTMT080000UV09Additive>(_COCTMT080000UV09Subject1Additive_QNAME, COCTMT080000UV09Additive.class, COCTMT080000UV09Subject1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09SpecimenInContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "specimenInContainer", scope = COCTMT080000UV09Subject1 .class)
    public JAXBElement<COCTMT080000UV09SpecimenInContainer> createCOCTMT080000UV09Subject1SpecimenInContainer(COCTMT080000UV09SpecimenInContainer value) {
        return new JAXBElement<COCTMT080000UV09SpecimenInContainer>(_COCTMT080000UV09Subject1SpecimenInContainer_QNAME, COCTMT080000UV09SpecimenInContainer.class, COCTMT080000UV09Subject1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianPerson", scope = PRPAMT201303UV02Guardian.class)
    public JAXBElement<COCTMT030207UV07Person> createPRPAMT201303UV02GuardianGuardianPerson(COCTMT030207UV07Person value) {
        return new JAXBElement<COCTMT030207UV07Person>(_PRPAMT201303UV02GuardianGuardianPerson_QNAME, COCTMT030207UV07Person.class, PRPAMT201303UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianOrganization", scope = PRPAMT201303UV02Guardian.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201303UV02GuardianGuardianOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201303UV02GuardianGuardianOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201303UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306810UV01QueryByParameterPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameterPayload", scope = PRPMIN306051UV01MFMIMT700711UV01ControlActProcess.class)
    public JAXBElement<PRPMMT306810UV01QueryByParameterPayload> createPRPMIN306051UV01MFMIMT700711UV01ControlActProcessQueryByParameterPayload(PRPMMT306810UV01QueryByParameterPayload value) {
        return new JAXBElement<PRPMMT306810UV01QueryByParameterPayload>(_PRPMIN306010UV01QUQIMT021001UV01ControlActProcessQueryByParameterPayload_QNAME, PRPMMT306810UV01QueryByParameterPayload.class, PRPMIN306051UV01MFMIMT700711UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04Performer2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "performer", scope = COCTMT300000UV04Substitution.class)
    public JAXBElement<COCTMT300000UV04Performer2> createCOCTMT300000UV04SubstitutionPerformer(COCTMT300000UV04Performer2 value) {
        return new JAXBElement<COCTMT300000UV04Performer2>(_COCTMT300000UV04SubstitutionPerformer_QNAME, COCTMT300000UV04Performer2 .class, COCTMT300000UV04Substitution.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090300UV01AssignedDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = COCTMT080000UV09AuthorOrPerformer.class)
    public JAXBElement<COCTMT090300UV01AssignedDevice> createCOCTMT080000UV09AuthorOrPerformerAssignedDevice(COCTMT090300UV01AssignedDevice value) {
        return new JAXBElement<COCTMT090300UV01AssignedDevice>(_MFMIMT700701UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090300UV01AssignedDevice.class, COCTMT080000UV09AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090100UV01AssignedPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT080000UV09AuthorOrPerformer.class)
    public JAXBElement<COCTMT090100UV01AssignedPerson> createCOCTMT080000UV09AuthorOrPerformerAssignedPerson(COCTMT090100UV01AssignedPerson value) {
        return new JAXBElement<COCTMT090100UV01AssignedPerson>(_MFMIMT700701UV01AuthorOrPerformerAssignedPerson_QNAME, COCTMT090100UV01AssignedPerson.class, COCTMT080000UV09AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVResponsibleParty1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "responsibleParty", scope = COCTMT530000UVControlActEvent.class)
    public JAXBElement<COCTMT530000UVResponsibleParty1> createCOCTMT530000UVControlActEventResponsibleParty(COCTMT530000UVResponsibleParty1 value) {
        return new JAXBElement<COCTMT530000UVResponsibleParty1>(_COCTMT530000UVControlActEventResponsibleParty_QNAME, COCTMT530000UVResponsibleParty1 .class, COCTMT530000UVControlActEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Definition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT080000UV09SpecimenProcessStep.class)
    public JAXBElement<COCTMT080000UV09Definition> createCOCTMT080000UV09SpecimenProcessStepDefinition(COCTMT080000UV09Definition value) {
        return new JAXBElement<COCTMT080000UV09Definition>(_COCTMT080000UV09SpecimenCollectionProcessDefinition_QNAME, COCTMT080000UV09Definition.class, COCTMT080000UV09SpecimenProcessStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Subject5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf2", scope = COCTMT080000UV09SpecimenProcessStep.class)
    public JAXBElement<COCTMT080000UV09Subject5> createCOCTMT080000UV09SpecimenProcessStepSubjectOf2(COCTMT080000UV09Subject5 value) {
        return new JAXBElement<COCTMT080000UV09Subject5>(_COCTMT080000UV09SpecimenCollectionProcessSubjectOf2_QNAME, COCTMT080000UV09Subject5 .class, COCTMT080000UV09SpecimenProcessStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406110UV01PrincipalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedPrincipalOrganization", scope = PRPMMT406110UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT406110UV01PrincipalOrganization> createPRPMMT406110UV01QualifiedEntityQualifiedPrincipalOrganization(PRPMMT406110UV01PrincipalOrganization value) {
        return new JAXBElement<PRPMMT406110UV01PrincipalOrganization>(_PRPMMT401010UV01QualifiedEntityQualifiedPrincipalOrganization_QNAME, PRPMMT406110UV01PrincipalOrganization.class, PRPMMT406110UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406110UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualificationGrantingOrganization", scope = PRPMMT406110UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT406110UV01Organization> createPRPMMT406110UV01QualifiedEntityQualificationGrantingOrganization(PRPMMT406110UV01Organization value) {
        return new JAXBElement<PRPMMT406110UV01Organization>(_PRPMMT306110UV01QualifiedEntityQualificationGrantingOrganization_QNAME, PRPMMT406110UV01Organization.class, PRPMMT406110UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "issuingOrganization", scope = COCTMT820000UVHealthCareProvider.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT820000UVHealthCareProviderIssuingOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_PRPMMT309000UV01HealthCareProviderIssuingOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT820000UVHealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000300UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = MCCIMT000300UV01Agent.class)
    public JAXBElement<MCCIMT000300UV01Organization> createMCCIMT000300UV01AgentRepresentedOrganization(MCCIMT000300UV01Organization value) {
        return new JAXBElement<MCCIMT000300UV01Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, MCCIMT000300UV01Organization.class, MCCIMT000300UV01Agent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700701UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPAIN201315UV02MFMIMT700701UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700701UV01Author2> createPRPAIN201315UV02MFMIMT700701UV01RegistrationEventAuthor(MFMIMT700701UV01Author2 value) {
        return new JAXBElement<MFMIMT700701UV01Author2>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, MFMIMT700701UV01Author2 .class, PRPAIN201315UV02MFMIMT700701UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09EntityInEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asEntityInEntity", scope = COCTMT080000UV09Container.class)
    public JAXBElement<COCTMT080000UV09EntityInEntity> createCOCTMT080000UV09ContainerAsEntityInEntity(COCTMT080000UV09EntityInEntity value) {
        return new JAXBElement<COCTMT080000UV09EntityInEntity>(_COCTMT080000UV09ContainerAsEntityInEntity_QNAME, COCTMT080000UV09EntityInEntity.class, COCTMT080000UV09Container.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT080000UV09Container.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT080000UV09ContainerAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090000UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT080000UV09Container.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406110UV01Jurisdiction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "territory", scope = PRPMMT406110UV01TerritorialAuthority.class)
    public JAXBElement<PRPMMT406110UV01Jurisdiction> createPRPMMT406110UV01TerritorialAuthorityTerritory(PRPMMT406110UV01Jurisdiction value) {
        return new JAXBElement<PRPMMT406110UV01Jurisdiction>(_PRPMMT309000UV01TerritorialAuthorityTerritory_QNAME, PRPMMT406110UV01Jurisdiction.class, PRPMMT406110UV01TerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06IndirectAuthorithyOver2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "indirectAuthority2", scope = COCTMT510000UV06CoveredParty.class)
    public JAXBElement<COCTMT510000UV06IndirectAuthorithyOver2> createCOCTMT510000UV06CoveredPartyIndirectAuthority2(COCTMT510000UV06IndirectAuthorithyOver2 value) {
        return new JAXBElement<COCTMT510000UV06IndirectAuthorithyOver2>(_COCTMT510000UV06CoveredPartyIndirectAuthority2_QNAME, COCTMT510000UV06IndirectAuthorithyOver2 .class, COCTMT510000UV06CoveredParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "underwritingOrganization", scope = COCTMT510000UV06CoveredParty.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06CoveredPartyUnderwritingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06PayorUnderwritingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06CoveredParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "coveredPerson", scope = COCTMT510000UV06CoveredParty.class)
    public JAXBElement<COCTMT030007UVPerson> createCOCTMT510000UV06CoveredPartyCoveredPerson(COCTMT030007UVPerson value) {
        return new JAXBElement<COCTMT030007UVPerson>(_COCTMT510000UV06CoveredPartyCoveredPerson_QNAME, COCTMT030007UVPerson.class, COCTMT510000UV06CoveredParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "coveredOrganization1", scope = COCTMT510000UV06CoveredParty.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06CoveredPartyCoveredOrganization1(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06CoveredPartyCoveredOrganization1_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06CoveredParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "coveredNonPersonLivingSubject", scope = COCTMT510000UV06CoveredParty.class)
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> createCOCTMT510000UV06CoveredPartyCoveredNonPersonLivingSubject(COCTMT030007UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030007UVNonPersonLivingSubject>(_COCTMT510000UV06CoveredPartyCoveredNonPersonLivingSubject_QNAME, COCTMT030007UVNonPersonLivingSubject.class, COCTMT510000UV06CoveredParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201310UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201310UV02Person.class)
    public JAXBElement<PRPAMT201310UV02BirthPlace> createPRPAMT201310UV02PersonBirthPlace(PRPAMT201310UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201310UV02BirthPlace>(_PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME, PRPAMT201310UV02BirthPlace.class, PRPAMT201310UV02Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "employerOrganization", scope = COCTMT030007UVEmployment.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT030007UVEmploymentEmployerOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT030007UVEmploymentEmployerOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT030007UVEmployment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406010UV01RoleEffectiveDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "roleEffectiveDate", scope = PRPMMT406010UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT406010UV01RoleEffectiveDate> createPRPMMT406010UV01QueryByParameterPayloadRoleEffectiveDate(PRPMMT406010UV01RoleEffectiveDate value) {
        return new JAXBElement<PRPMMT406010UV01RoleEffectiveDate>(_PRPMMT406010UV01QueryByParameterPayloadRoleEffectiveDate_QNAME, PRPMMT406010UV01RoleEffectiveDate.class, PRPMMT406010UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406010UV01History }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "history", scope = PRPMMT406010UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT406010UV01History> createPRPMMT406010UV01QueryByParameterPayloadHistory(PRPMMT406010UV01History value) {
        return new JAXBElement<PRPMMT406010UV01History>(_PRPMMT406010UV01QueryByParameterPayloadHistory_QNAME, PRPMMT406010UV01History.class, PRPMMT406010UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406010UV01Confidence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "confidence", scope = PRPMMT406010UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT406010UV01Confidence> createPRPMMT406010UV01QueryByParameterPayloadConfidence(PRPMMT406010UV01Confidence value) {
        return new JAXBElement<PRPMMT406010UV01Confidence>(_PRPMMT406010UV01QueryByParameterPayloadConfidence_QNAME, PRPMMT406010UV01Confidence.class, PRPMMT406010UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406010UV01Jurisdiction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "jurisdiction", scope = PRPMMT406010UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT406010UV01Jurisdiction> createPRPMMT406010UV01QueryByParameterPayloadJurisdiction(PRPMMT406010UV01Jurisdiction value) {
        return new JAXBElement<PRPMMT406010UV01Jurisdiction>(_PRPMMT406010UV01QueryByParameterPayloadJurisdiction_QNAME, PRPMMT406010UV01Jurisdiction.class, PRPMMT406010UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT409000UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMIN401031UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT409000UV01AssignedEntity> createPRPMIN401031UV01MFMIMT700721UV01Subject2AssignedEntity(PRPMMT409000UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT409000UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT409000UV01AssignedEntity.class, PRPMIN401031UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = PRPAMT201310UV02ContactParty.class)
    public JAXBElement<COCTMT030207UV07Person> createPRPAMT201310UV02ContactPartyContactPerson(COCTMT030207UV07Person value) {
        return new JAXBElement<COCTMT030207UV07Person>(_COCTMT030007UVContactPartyContactPerson_QNAME, COCTMT030207UV07Person.class, PRPAMT201310UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = PRPAMT201310UV02ContactParty.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201310UV02ContactPartyContactOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_COCTMT030007UVContactPartyContactOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201310UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06ReplacementOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "replacementOf", scope = COCTMT510000UV06PolicyOrProgram.class)
    public JAXBElement<COCTMT510000UV06ReplacementOf> createCOCTMT510000UV06PolicyOrProgramReplacementOf(COCTMT510000UV06ReplacementOf value) {
        return new JAXBElement<COCTMT510000UV06ReplacementOf>(_COCTMT510000UV06PolicyOrProgramReplacementOf_QNAME, COCTMT510000UV06ReplacementOf.class, COCTMT510000UV06PolicyOrProgram.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Holder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "holder", scope = COCTMT510000UV06PolicyOrProgram.class)
    public JAXBElement<COCTMT510000UV06Holder> createCOCTMT510000UV06PolicyOrProgramHolder(COCTMT510000UV06Holder value) {
        return new JAXBElement<COCTMT510000UV06Holder>(_COCTMT230100UVApprovalHolder_QNAME, COCTMT510000UV06Holder.class, COCTMT510000UV06PolicyOrProgram.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Definition3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT510000UV06PolicyOrProgram.class)
    public JAXBElement<COCTMT510000UV06Definition3> createCOCTMT510000UV06PolicyOrProgramDefinition(COCTMT510000UV06Definition3 value) {
        return new JAXBElement<COCTMT510000UV06Definition3>(_COCTMT080000UV09SpecimenCollectionProcessDefinition_QNAME, COCTMT510000UV06Definition3 .class, COCTMT510000UV06PolicyOrProgram.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06ResponsibleParty2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "responsibleParty", scope = COCTMT510000UV06PolicyOrProgram.class)
    public JAXBElement<COCTMT510000UV06ResponsibleParty2> createCOCTMT510000UV06PolicyOrProgramResponsibleParty(COCTMT510000UV06ResponsibleParty2 value) {
        return new JAXBElement<COCTMT510000UV06ResponsibleParty2>(_COCTMT530000UVControlActEventResponsibleParty_QNAME, COCTMT510000UV06ResponsibleParty2 .class, COCTMT510000UV06PolicyOrProgram.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "issuingOrganization", scope = PRPMMT301010UV01HealthCareProvider.class)
    public JAXBElement<PRPMMT301010UV01Organization> createPRPMMT301010UV01HealthCareProviderIssuingOrganization(PRPMMT301010UV01Organization value) {
        return new JAXBElement<PRPMMT301010UV01Organization>(_PRPMMT309000UV01HealthCareProviderIssuingOrganization_QNAME, PRPMMT301010UV01Organization.class, PRPMMT301010UV01HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Subject8 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf3", scope = PRPMMT301010UV01HealthCareProvider.class)
    public JAXBElement<PRPMMT301010UV01Subject8> createPRPMMT301010UV01HealthCareProviderSubjectOf3(PRPMMT301010UV01Subject8 value) {
        return new JAXBElement<PRPMMT301010UV01Subject8>(_PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME, PRPMMT301010UV01Subject8 .class, PRPMMT301010UV01HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCarePrincipalPerson", scope = PRPMMT301010UV01HealthCareProvider.class)
    public JAXBElement<PRPMMT301010UV01PrincipalPerson> createPRPMMT301010UV01HealthCareProviderHealthCarePrincipalPerson(PRPMMT301010UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT301010UV01PrincipalPerson>(_PRPMMT309000UV01HealthCareProviderHealthCarePrincipalPerson_QNAME, PRPMMT301010UV01PrincipalPerson.class, PRPMMT301010UV01HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTCell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "th", scope = StrucDocTRow.class)
    public JAXBElement<StrucDocTCell> createStrucDocTRowTh(StrucDocTCell value) {
        return new JAXBElement<StrucDocTCell>(_StrucDocTRowTh_QNAME, StrucDocTCell.class, StrucDocTRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTCell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "td", scope = StrucDocTRow.class)
    public JAXBElement<StrucDocTCell> createStrucDocTRowTd(StrucDocTCell value) {
        return new JAXBElement<StrucDocTCell>(_StrucDocTRowTd_QNAME, StrucDocTCell.class, StrucDocTRow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01Subject5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject", scope = PRPMMT401010UV01InformRequest.class)
    public JAXBElement<PRPMMT401010UV01Subject5> createPRPMMT401010UV01InformRequestSubject(PRPMMT401010UV01Subject5 value) {
        return new JAXBElement<PRPMMT401010UV01Subject5>(_PRPMMT306110UV01InformRequestSubject_QNAME, PRPMMT401010UV01Subject5 .class, PRPMMT401010UV01InformRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subContent", scope = COCTMT230100UVPackagedMedicine.class)
    public JAXBElement<COCTMT230100UVSubContent> createCOCTMT230100UVPackagedMedicineSubContent(COCTMT230100UVSubContent value) {
        return new JAXBElement<COCTMT230100UVSubContent>(_COCTMT230100UVPackagedMedicineSubContent_QNAME, COCTMT230100UVSubContent.class, COCTMT230100UVPackagedMedicine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSuperContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asSuperContent", scope = COCTMT230100UVPackagedMedicine.class)
    public JAXBElement<COCTMT230100UVSuperContent> createCOCTMT230100UVPackagedMedicineAsSuperContent(COCTMT230100UVSuperContent value) {
        return new JAXBElement<COCTMT230100UVSuperContent>(_COCTMT230100UVPackagedMedicineAsSuperContent_QNAME, COCTMT230100UVSuperContent.class, COCTMT230100UVPackagedMedicine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT090100UV01Person.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT090100UV01PersonAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090000UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT090100UV01Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "wholeOrganization", scope = PRPMMT403010UV01OrganizationPartof.class)
    public JAXBElement<PRPMMT403010UV01Organization> createPRPMMT403010UV01OrganizationPartofWholeOrganization(PRPMMT403010UV01Organization value) {
        return new JAXBElement<PRPMMT403010UV01Organization>(_PRPMMT403010UV01OrganizationPartofWholeOrganization_QNAME, PRPMMT403010UV01Organization.class, PRPMMT403010UV01OrganizationPartof.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09SpecimenCollectionProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "specimenCollectionProcess", scope = COCTMT080000UV09Product.class)
    public JAXBElement<COCTMT080000UV09SpecimenCollectionProcess> createCOCTMT080000UV09ProductSpecimenCollectionProcess(COCTMT080000UV09SpecimenCollectionProcess value) {
        return new JAXBElement<COCTMT080000UV09SpecimenCollectionProcess>(_COCTMT080000UV09Subject2SpecimenCollectionProcess_QNAME, COCTMT080000UV09SpecimenCollectionProcess.class, COCTMT080000UV09Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09SpecimenProcessStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "specimenProcessStep", scope = COCTMT080000UV09Product.class)
    public JAXBElement<COCTMT080000UV09SpecimenProcessStep> createCOCTMT080000UV09ProductSpecimenProcessStep(COCTMT080000UV09SpecimenProcessStep value) {
        return new JAXBElement<COCTMT080000UV09SpecimenProcessStep>(_COCTMT080000UV09Subject2SpecimenProcessStep_QNAME, COCTMT080000UV09SpecimenProcessStep.class, COCTMT080000UV09Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306910UV01Jurisdiction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "territory", scope = PRPMMT306910UV01TerritorialAuthority.class)
    public JAXBElement<PRPMMT306910UV01Jurisdiction> createPRPMMT306910UV01TerritorialAuthorityTerritory(PRPMMT306910UV01Jurisdiction value) {
        return new JAXBElement<PRPMMT306910UV01Jurisdiction>(_PRPMMT309000UV01TerritorialAuthorityTerritory_QNAME, PRPMMT306910UV01Jurisdiction.class, PRPMMT306910UV01TerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Subject8 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf3", scope = PRPMMT403010UV01RoleOther.class)
    public JAXBElement<PRPMMT403010UV01Subject8> createPRPMMT403010UV01RoleOtherSubjectOf3(PRPMMT403010UV01Subject8 value) {
        return new JAXBElement<PRPMMT403010UV01Subject8>(_PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME, PRPMMT403010UV01Subject8 .class, PRPMMT403010UV01RoleOther.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = PRPMMT403010UV01RoleOther.class)
    public JAXBElement<PRPMMT403010UV01Organization> createPRPMMT403010UV01RoleOtherScopingOrganization(PRPMMT403010UV01Organization value) {
        return new JAXBElement<PRPMMT403010UV01Organization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, PRPMMT403010UV01Organization.class, PRPMMT403010UV01RoleOther.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01HealthCareProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProvider", scope = PRPMMT303010UV01RelatedTo.class)
    public JAXBElement<PRPMMT303010UV01HealthCareProvider> createPRPMMT303010UV01RelatedToHealthCareProvider(PRPMMT303010UV01HealthCareProvider value) {
        return new JAXBElement<PRPMMT303010UV01HealthCareProvider>(_PRPMIN303011UV01MFMIMT700721UV01Subject2HealthCareProvider_QNAME, PRPMMT303010UV01HealthCareProvider.class, PRPMMT303010UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMMT303010UV01RelatedTo.class)
    public JAXBElement<PRPMMT303010UV01AssignedEntity> createPRPMMT303010UV01RelatedToAssignedEntity(PRPMMT303010UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT303010UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT303010UV01AssignedEntity.class, PRPMMT303010UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01QualifiedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedEntity", scope = PRPMMT303010UV01RelatedTo.class)
    public JAXBElement<PRPMMT303010UV01QualifiedEntity> createPRPMMT303010UV01RelatedToQualifiedEntity(PRPMMT303010UV01QualifiedEntity value) {
        return new JAXBElement<PRPMMT303010UV01QualifiedEntity>(_PRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity_QNAME, PRPMMT303010UV01QualifiedEntity.class, PRPMMT303010UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201302UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201302UV02NonPersonLivingSubject.class)
    public JAXBElement<PRPAMT201302UV02BirthPlace> createPRPAMT201302UV02NonPersonLivingSubjectBirthPlace(PRPAMT201302UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201302UV02BirthPlace>(_PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME, PRPAMT201302UV02BirthPlace.class, PRPAMT201302UV02NonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT040203UV09NotificationParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "notificationParty", scope = MCCIMT000200UV01Organization.class)
    public JAXBElement<COCTMT040203UV09NotificationParty> createMCCIMT000200UV01OrganizationNotificationParty(COCTMT040203UV09NotificationParty value) {
        return new JAXBElement<COCTMT040203UV09NotificationParty>(_MCCIMT000300UV01OrganizationNotificationParty_QNAME, COCTMT040203UV09NotificationParty.class, MCCIMT000200UV01Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01RoleOther }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "roleOther", scope = PRPMIN403010UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT403010UV01RoleOther> createPRPMIN403010UV01MFMIMT700721UV01Subject2RoleOther(PRPMMT403010UV01RoleOther value) {
        return new JAXBElement<PRPMMT403010UV01RoleOther>(_PRPMIN403010UV01MFMIMT700721UV01Subject2RoleOther_QNAME, PRPMMT403010UV01RoleOther.class, PRPMIN403010UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMIN403010UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT403010UV01AssignedEntity> createPRPMIN403010UV01MFMIMT700721UV01Subject2AssignedEntity(PRPMMT403010UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT403010UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT403010UV01AssignedEntity.class, PRPMIN403010UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Member }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "member", scope = PRPMIN403010UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT403010UV01Member> createPRPMIN403010UV01MFMIMT700721UV01Subject2Member(PRPMMT403010UV01Member value) {
        return new JAXBElement<PRPMMT403010UV01Member>(_PRPMIN403010UV01MFMIMT700721UV01Subject2Member_QNAME, PRPMMT403010UV01Member.class, PRPMIN403010UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01LicensedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "licensedEntity", scope = PRPMIN403010UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT403010UV01LicensedEntity> createPRPMIN403010UV01MFMIMT700721UV01Subject2LicensedEntity(PRPMMT403010UV01LicensedEntity value) {
        return new JAXBElement<PRPMMT403010UV01LicensedEntity>(_PRPMIN403010UV01MFMIMT700721UV01Subject2LicensedEntity_QNAME, PRPMMT403010UV01LicensedEntity.class, PRPMIN403010UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01QualifiedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedEntity", scope = PRPMIN403010UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT403010UV01QualifiedEntity> createPRPMIN403010UV01MFMIMT700721UV01Subject2QualifiedEntity(PRPMMT403010UV01QualifiedEntity value) {
        return new JAXBElement<PRPMMT403010UV01QualifiedEntity>(_PRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity_QNAME, PRPMMT403010UV01QualifiedEntity.class, PRPMIN403010UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = COCTMT150003UV03ContactParty.class)
    public JAXBElement<COCTMT150003UV03Person> createCOCTMT150003UV03ContactPartyContactPerson(COCTMT150003UV03Person value) {
        return new JAXBElement<COCTMT150003UV03Person>(_COCTMT030007UVContactPartyContactPerson_QNAME, COCTMT150003UV03Person.class, COCTMT150003UV03ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09EntityInEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asEntityInEntity", scope = COCTMT080000UV09AdditiveMaterial.class)
    public JAXBElement<COCTMT080000UV09EntityInEntity> createCOCTMT080000UV09AdditiveMaterialAsEntityInEntity(COCTMT080000UV09EntityInEntity value) {
        return new JAXBElement<COCTMT080000UV09EntityInEntity>(_COCTMT080000UV09ContainerAsEntityInEntity_QNAME, COCTMT080000UV09EntityInEntity.class, COCTMT080000UV09AdditiveMaterial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT080000UV09AdditiveMaterial.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT080000UV09AdditiveMaterialAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090000UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT080000UV09AdditiveMaterial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090300UV01AssignedDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = MFMIMT700711UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090300UV01AssignedDevice> createMFMIMT700711UV01AuthorOrPerformerAssignedDevice(COCTMT090300UV01AssignedDevice value) {
        return new JAXBElement<COCTMT090300UV01AssignedDevice>(_MFMIMT700701UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090300UV01AssignedDevice.class, MFMIMT700711UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090100UV01AssignedPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = MFMIMT700711UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090100UV01AssignedPerson> createMFMIMT700711UV01AuthorOrPerformerAssignedPerson(COCTMT090100UV01AssignedPerson value) {
        return new JAXBElement<COCTMT090100UV01AssignedPerson>(_MFMIMT700701UV01AuthorOrPerformerAssignedPerson_QNAME, COCTMT090100UV01AssignedPerson.class, MFMIMT700711UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVSupply.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVSupplyDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT080000UV09SpecimenCollectionProcessDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVSupply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVSupply.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVSupplySubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_COCTMT530000UVSubstanceAdministrationSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVSupply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVSupply.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVSupplyDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVSubstanceAdministrationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVSupply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVSupply.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVSupplyRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVSubstanceAdministrationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVSupply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090108UVAssignedPerson.class)
    public JAXBElement<COCTMT150007UVOrganization> createCOCTMT090108UVAssignedPersonRepresentedOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, COCTMT150007UVOrganization.class, COCTMT090108UVAssignedPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090108UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT090108UVAssignedPerson.class)
    public JAXBElement<COCTMT090108UVPerson> createCOCTMT090108UVAssignedPersonAssignedPerson(COCTMT090108UVPerson value) {
        return new JAXBElement<COCTMT090108UVPerson>(_MFMIMT700701UV01AuthorOrPerformerAssignedPerson_QNAME, COCTMT090108UVPerson.class, COCTMT090108UVAssignedPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = PRPAMT201302UV02Student.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201302UV02StudentSchoolOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201304UV02StudentSchoolOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201302UV02Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT740000UV04OralHealthService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "oralHealthService1", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT740000UV04OralHealthService> createCOCTMT510000UV06DefinitionOralHealthService1(COCTMT740000UV04OralHealthService value) {
        return new JAXBElement<COCTMT740000UV04OralHealthService>(_COCTMT510000UV06DefinitionOralHealthService1_QNAME, COCTMT740000UV04OralHealthService.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06ServiceDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "serviceDefinition", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT510000UV06ServiceDefinition> createCOCTMT510000UV06DefinitionServiceDefinition(COCTMT510000UV06ServiceDefinition value) {
        return new JAXBElement<COCTMT510000UV06ServiceDefinition>(_COCTMT510000UV06DefinitionServiceDefinition_QNAME, COCTMT510000UV06ServiceDefinition.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT310000UV04AccomodationSupplied }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "accomodationSupplied1", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT310000UV04AccomodationSupplied> createCOCTMT510000UV06DefinitionAccomodationSupplied1(COCTMT310000UV04AccomodationSupplied value) {
        return new JAXBElement<COCTMT310000UV04AccomodationSupplied>(_COCTMT510000UV06DefinitionAccomodationSupplied1_QNAME, COCTMT310000UV04AccomodationSupplied.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "substanceAdministration", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVSubstanceAdministration> createCOCTMT510000UV06DefinitionSubstanceAdministration(COCTMT530000UVSubstanceAdministration value) {
        return new JAXBElement<COCTMT530000UVSubstanceAdministration>(_COCTMT510000UV06DefinitionSubstanceAdministration_QNAME, COCTMT530000UVSubstanceAdministration.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "organizer", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVOrganizer> createCOCTMT510000UV06DefinitionOrganizer(COCTMT530000UVOrganizer value) {
        return new JAXBElement<COCTMT530000UVOrganizer>(_COCTMT510000UV06DefinitionOrganizer_QNAME, COCTMT530000UVOrganizer.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT280000UV04CrossReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "crossReference1", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT280000UV04CrossReference> createCOCTMT510000UV06DefinitionCrossReference1(COCTMT280000UV04CrossReference value) {
        return new JAXBElement<COCTMT280000UV04CrossReference>(_COCTMT510000UV06DefinitionCrossReference1_QNAME, COCTMT280000UV04CrossReference.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "act", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVAct> createCOCTMT510000UV06DefinitionAct(COCTMT530000UVAct value) {
        return new JAXBElement<COCTMT530000UVAct>(_COCTMT510000UV06DefinitionAct_QNAME, COCTMT530000UVAct.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04BillableClinicalProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "billableClinicalProduct1", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT490000UV04BillableClinicalProduct> createCOCTMT510000UV06DefinitionBillableClinicalProduct1(COCTMT490000UV04BillableClinicalProduct value) {
        return new JAXBElement<COCTMT490000UV04BillableClinicalProduct>(_COCTMT510000UV06DefinitionBillableClinicalProduct1_QNAME, COCTMT490000UV04BillableClinicalProduct.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT060000UV01Transportation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "transportation", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT060000UV01Transportation> createCOCTMT510000UV06DefinitionTransportation(COCTMT060000UV01Transportation value) {
        return new JAXBElement<COCTMT060000UV01Transportation>(_COCTMT510000UV06DefinitionTransportation_QNAME, COCTMT060000UV01Transportation.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supply", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVSupply> createCOCTMT510000UV06DefinitionSupply(COCTMT530000UVSupply value) {
        return new JAXBElement<COCTMT530000UVSupply>(_COCTMT510000UV06DefinitionSupply_QNAME, COCTMT530000UVSupply.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVActReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "actReference", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVActReference> createCOCTMT510000UV06DefinitionActReference(COCTMT530000UVActReference value) {
        return new JAXBElement<COCTMT530000UVActReference>(_COCTMT510000UV06DefinitionActReference_QNAME, COCTMT530000UVActReference.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "procedure", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVProcedure> createCOCTMT510000UV06DefinitionProcedure(COCTMT530000UVProcedure value) {
        return new JAXBElement<COCTMT530000UVProcedure>(_COCTMT510000UV06DefinitionProcedure_QNAME, COCTMT530000UVProcedure.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "encounter", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVEncounter> createCOCTMT510000UV06DefinitionEncounter(COCTMT530000UVEncounter value) {
        return new JAXBElement<COCTMT530000UVEncounter>(_COCTMT510000UV06DefinitionEncounter_QNAME, COCTMT530000UVEncounter.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "observation", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVObservation> createCOCTMT510000UV06DefinitionObservation(COCTMT530000UVObservation value) {
        return new JAXBElement<COCTMT530000UVObservation>(_COCTMT510000UV06DefinitionObservation_QNAME, COCTMT530000UVObservation.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06SupplyEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supplyEvent2", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT600000UV06SupplyEvent> createCOCTMT510000UV06DefinitionSupplyEvent2(COCTMT600000UV06SupplyEvent value) {
        return new JAXBElement<COCTMT600000UV06SupplyEvent>(_COCTMT510000UV06DefinitionSupplyEvent2_QNAME, COCTMT600000UV06SupplyEvent.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04SupplyEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supplyEvent1", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT300000UV04SupplyEvent> createCOCTMT510000UV06DefinitionSupplyEvent1(COCTMT300000UV04SupplyEvent value) {
        return new JAXBElement<COCTMT300000UV04SupplyEvent>(_COCTMT510000UV06DefinitionSupplyEvent1_QNAME, COCTMT300000UV04SupplyEvent.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06BillableClinicalService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "billableClinicalService1", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT290000UV06BillableClinicalService> createCOCTMT510000UV06DefinitionBillableClinicalService1(COCTMT290000UV06BillableClinicalService value) {
        return new JAXBElement<COCTMT290000UV06BillableClinicalService>(_COCTMT510000UV06DefinitionBillableClinicalService1_QNAME, COCTMT290000UV06BillableClinicalService.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = COCTMT030007UVStudent.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT030007UVStudentSchoolOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_PRPAMT201304UV02StudentSchoolOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT030007UVStudent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocContent.class)
    public JAXBElement<StrucDocSup> createStrucDocContentSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocContentSup_QNAME, StrucDocSup.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocContent.class)
    public JAXBElement<StrucDocContent> createStrucDocContentContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocContentContent_QNAME, StrucDocContent.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocContent.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocContentLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocContentLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocContent.class)
    public JAXBElement<StrucDocFootnote> createStrucDocContentFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocContentFootnote_QNAME, StrucDocFootnote.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocContent.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocContentFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocContentFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocContent.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocContentRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocContentRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocContent.class)
    public JAXBElement<StrucDocSub> createStrucDocContentSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocContentSub_QNAME, StrucDocSub.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocContent.class)
    public JAXBElement<StrucDocBr> createStrucDocContentBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocContentBr_QNAME, StrucDocBr.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "destination", scope = COCTMT300000UV04SupplyEvent.class)
    public JAXBElement<COCTMT300000UV04Destination> createCOCTMT300000UV04SupplyEventDestination(COCTMT300000UV04Destination value) {
        return new JAXBElement<COCTMT300000UV04Destination>(_COCTMT300000UV04SupplyEventDestination_QNAME, COCTMT300000UV04Destination.class, COCTMT300000UV04SupplyEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04Origin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "origin", scope = COCTMT300000UV04SupplyEvent.class)
    public JAXBElement<COCTMT300000UV04Origin> createCOCTMT300000UV04SupplyEventOrigin(COCTMT300000UV04Origin value) {
        return new JAXBElement<COCTMT300000UV04Origin>(_COCTMT300000UV04SupplyEventOrigin_QNAME, COCTMT300000UV04Origin.class, COCTMT300000UV04SupplyEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04Performer1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "performer", scope = COCTMT300000UV04SupplyEvent.class)
    public JAXBElement<COCTMT300000UV04Performer1> createCOCTMT300000UV04SupplyEventPerformer(COCTMT300000UV04Performer1 value) {
        return new JAXBElement<COCTMT300000UV04Performer1>(_COCTMT300000UV04SubstitutionPerformer_QNAME, COCTMT300000UV04Performer1 .class, COCTMT300000UV04SupplyEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = PRPMMT306110UV01ServiceDeliveryLocation.class)
    public JAXBElement<PRPMMT306110UV01Place> createPRPMMT306110UV01ServiceDeliveryLocationLocation(PRPMMT306110UV01Place value) {
        return new JAXBElement<PRPMMT306110UV01Place>(_COCTMT070000UV01LocatedEntityLocation_QNAME, PRPMMT306110UV01Place.class, PRPMMT306110UV01ServiceDeliveryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder2", scope = PRPAMT201301UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> createPRPAMT201301UV02PersonalRelationshipRelationshipHolder2(COCTMT030007UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030007UVNonPersonLivingSubject>(_PRPAMT201303UV02PersonalRelationshipRelationshipHolder2_QNAME, COCTMT030007UVNonPersonLivingSubject.class, PRPAMT201301UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder1", scope = PRPAMT201301UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVPerson> createPRPAMT201301UV02PersonalRelationshipRelationshipHolder1(COCTMT030007UVPerson value) {
        return new JAXBElement<COCTMT030007UVPerson>(_PRPAMT201303UV02PersonalRelationshipRelationshipHolder1_QNAME, COCTMT030007UVPerson.class, PRPAMT201301UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306010UV01QueryByParameterPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameterPayload", scope = PRPMIN306011UV01MFMIMT700711UV01ControlActProcess.class)
    public JAXBElement<PRPMMT306010UV01QueryByParameterPayload> createPRPMIN306011UV01MFMIMT700711UV01ControlActProcessQueryByParameterPayload(PRPMMT306010UV01QueryByParameterPayload value) {
        return new JAXBElement<PRPMMT306010UV01QueryByParameterPayload>(_PRPMIN306010UV01QUQIMT021001UV01ControlActProcessQueryByParameterPayload_QNAME, PRPMMT306010UV01QueryByParameterPayload.class, PRPMIN306011UV01MFMIMT700711UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPAIN201306UV02MFMIMT700711UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700711UV01Author2> createPRPAIN201306UV02MFMIMT700711UV01RegistrationEventAuthor(MFMIMT700711UV01Author2 value) {
        return new JAXBElement<MFMIMT700711UV01Author2>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, MFMIMT700711UV01Author2 .class, PRPAIN201306UV02MFMIMT700711UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "ingredientSubstance", scope = COCTMT230100UVSubIngredient.class)
    public JAXBElement<COCTMT230100UVSubstance> createCOCTMT230100UVSubIngredientIngredientSubstance(COCTMT230100UVSubstance value) {
        return new JAXBElement<COCTMT230100UVSubstance>(_COCTMT230100UVSubIngredientIngredientSubstance_QNAME, COCTMT230100UVSubstance.class, COCTMT230100UVSubIngredient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710007UV07LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "locatedEntity", scope = COCTMT710007UV07Place.class)
    public JAXBElement<COCTMT710007UV07LocatedEntity> createCOCTMT710007UV07PlaceLocatedEntity(COCTMT710007UV07LocatedEntity value) {
        return new JAXBElement<COCTMT710007UV07LocatedEntity>(_COCTMT710000UV07PlaceLocatedEntity_QNAME, COCTMT710007UV07LocatedEntity.class, COCTMT710007UV07Place.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMIN401030UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT401010UV01AssignedEntity> createPRPMIN401030UV01MFMIMT700721UV01Subject2AssignedEntity(PRPMMT401010UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT401010UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT401010UV01AssignedEntity.class, PRPMIN401030UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01QualifiedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedEntity", scope = PRPMIN401030UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT401010UV01QualifiedEntity> createPRPMIN401030UV01MFMIMT700721UV01Subject2QualifiedEntity(PRPMMT401010UV01QualifiedEntity value) {
        return new JAXBElement<PRPMMT401010UV01QualifiedEntity>(_PRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity_QNAME, PRPMMT401010UV01QualifiedEntity.class, PRPMIN401030UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asContent", scope = COCTMT230100UVMedicine.class)
    public JAXBElement<COCTMT230100UVContent> createCOCTMT230100UVMedicineAsContent(COCTMT230100UVContent value) {
        return new JAXBElement<COCTMT230100UVContent>(_COCTMT230100UVMedicineAsContent_QNAME, COCTMT230100UVContent.class, COCTMT230100UVMedicine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150002UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090102UV02AssignedPerson.class)
    public JAXBElement<COCTMT150002UV01Organization> createCOCTMT090102UV02AssignedPersonRepresentedOrganization(COCTMT150002UV01Organization value) {
        return new JAXBElement<COCTMT150002UV01Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, COCTMT150002UV01Organization.class, COCTMT090102UV02AssignedPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090102UV02Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT090102UV02AssignedPerson.class)
    public JAXBElement<COCTMT090102UV02Person> createCOCTMT090102UV02AssignedPersonAssignedPerson(COCTMT090102UV02Person value) {
        return new JAXBElement<COCTMT090102UV02Person>(_MFMIMT700701UV01AuthorOrPerformerAssignedPerson_QNAME, COCTMT090102UV02Person.class, COCTMT090102UV02AssignedPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "underwritingOrganization", scope = COCTMT510000UV06Underwriter.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06UnderwriterUnderwritingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06PayorUnderwritingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Underwriter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scoperOrganization", scope = COCTMT510000UV06Underwriter.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06UnderwriterScoperOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06UnderwriterScoperOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Underwriter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPAIN201310UV02MFMIMT700711UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700711UV01Author2> createPRPAIN201310UV02MFMIMT700711UV01RegistrationEventAuthor(MFMIMT700711UV01Author2 value) {
        return new JAXBElement<MFMIMT700711UV01Author2>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, MFMIMT700711UV01Author2 .class, PRPAIN201310UV02MFMIMT700711UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supply", scope = COCTMT080000UV09PertinentInformation.class)
    public JAXBElement<COCTMT530000UVSupply> createCOCTMT080000UV09PertinentInformationSupply(COCTMT530000UVSupply value) {
        return new JAXBElement<COCTMT530000UVSupply>(_COCTMT510000UV06DefinitionSupply_QNAME, COCTMT530000UVSupply.class, COCTMT080000UV09PertinentInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVActReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "actReference", scope = COCTMT080000UV09PertinentInformation.class)
    public JAXBElement<COCTMT530000UVActReference> createCOCTMT080000UV09PertinentInformationActReference(COCTMT530000UVActReference value) {
        return new JAXBElement<COCTMT530000UVActReference>(_COCTMT510000UV06DefinitionActReference_QNAME, COCTMT530000UVActReference.class, COCTMT080000UV09PertinentInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "procedure", scope = COCTMT080000UV09PertinentInformation.class)
    public JAXBElement<COCTMT530000UVProcedure> createCOCTMT080000UV09PertinentInformationProcedure(COCTMT530000UVProcedure value) {
        return new JAXBElement<COCTMT530000UVProcedure>(_COCTMT510000UV06DefinitionProcedure_QNAME, COCTMT530000UVProcedure.class, COCTMT080000UV09PertinentInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "encounter", scope = COCTMT080000UV09PertinentInformation.class)
    public JAXBElement<COCTMT530000UVEncounter> createCOCTMT080000UV09PertinentInformationEncounter(COCTMT530000UVEncounter value) {
        return new JAXBElement<COCTMT530000UVEncounter>(_COCTMT510000UV06DefinitionEncounter_QNAME, COCTMT530000UVEncounter.class, COCTMT080000UV09PertinentInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "observation", scope = COCTMT080000UV09PertinentInformation.class)
    public JAXBElement<COCTMT530000UVObservation> createCOCTMT080000UV09PertinentInformationObservation(COCTMT530000UVObservation value) {
        return new JAXBElement<COCTMT530000UVObservation>(_COCTMT510000UV06DefinitionObservation_QNAME, COCTMT530000UVObservation.class, COCTMT080000UV09PertinentInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "substanceAdministration", scope = COCTMT080000UV09PertinentInformation.class)
    public JAXBElement<COCTMT530000UVSubstanceAdministration> createCOCTMT080000UV09PertinentInformationSubstanceAdministration(COCTMT530000UVSubstanceAdministration value) {
        return new JAXBElement<COCTMT530000UVSubstanceAdministration>(_COCTMT510000UV06DefinitionSubstanceAdministration_QNAME, COCTMT530000UVSubstanceAdministration.class, COCTMT080000UV09PertinentInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "organizer", scope = COCTMT080000UV09PertinentInformation.class)
    public JAXBElement<COCTMT530000UVOrganizer> createCOCTMT080000UV09PertinentInformationOrganizer(COCTMT530000UVOrganizer value) {
        return new JAXBElement<COCTMT530000UVOrganizer>(_COCTMT510000UV06DefinitionOrganizer_QNAME, COCTMT530000UVOrganizer.class, COCTMT080000UV09PertinentInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "act", scope = COCTMT080000UV09PertinentInformation.class)
    public JAXBElement<COCTMT530000UVAct> createCOCTMT080000UV09PertinentInformationAct(COCTMT530000UVAct value) {
        return new JAXBElement<COCTMT530000UVAct>(_COCTMT510000UV06DefinitionAct_QNAME, COCTMT530000UVAct.class, COCTMT080000UV09PertinentInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT310000UV04AcommodationRequestor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "accommodationRequestor", scope = COCTMT310000UV04AccommodationRequestorRole.class)
    public JAXBElement<COCTMT310000UV04AcommodationRequestor> createCOCTMT310000UV04AccommodationRequestorRoleAccommodationRequestor(COCTMT310000UV04AcommodationRequestor value) {
        return new JAXBElement<COCTMT310000UV04AcommodationRequestor>(_COCTMT310000UV04AccommodationRequestorRoleAccommodationRequestor_QNAME, COCTMT310000UV04AcommodationRequestor.class, COCTMT310000UV04AccommodationRequestorRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201303UV02Subject2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = PRPAMT201303UV02BirthPlace.class)
    public JAXBElement<PRPAMT201303UV02Subject2> createPRPAMT201303UV02BirthPlaceSubjectOf(PRPAMT201303UV02Subject2 value) {
        return new JAXBElement<PRPAMT201303UV02Subject2>(_COCTMT530000UVSubstanceAdministrationSubjectOf_QNAME, PRPAMT201303UV02Subject2 .class, PRPAMT201303UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710007UV07Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = PRPAMT201303UV02BirthPlace.class)
    public JAXBElement<COCTMT710007UV07Place> createPRPAMT201303UV02BirthPlaceBirthplace(COCTMT710007UV07Place value) {
        return new JAXBElement<COCTMT710007UV07Place>(_COCTMT030202UV07BirthPlaceBirthplace_QNAME, COCTMT710007UV07Place.class, PRPAMT201303UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090000UV01Device }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = COCTMT090000UV01AssignedEntity.class)
    public JAXBElement<COCTMT090000UV01Device> createCOCTMT090000UV01AssignedEntityAssignedDevice(COCTMT090000UV01Device value) {
        return new JAXBElement<COCTMT090000UV01Device>(_MFMIMT700701UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090000UV01Device.class, COCTMT090000UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090000UV01AssignedEntity.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT090000UV01AssignedEntityRepresentedOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT090000UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090000UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedOrganization", scope = COCTMT090000UV01AssignedEntity.class)
    public JAXBElement<COCTMT090000UV01Organization> createCOCTMT090000UV01AssignedEntityAssignedOrganization(COCTMT090000UV01Organization value) {
        return new JAXBElement<COCTMT090000UV01Organization>(_COCTMT090000UV01AssignedEntityAssignedOrganization_QNAME, COCTMT090000UV01Organization.class, COCTMT090000UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090000UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT090000UV01AssignedEntity.class)
    public JAXBElement<COCTMT090000UV01Person> createCOCTMT090000UV01AssignedEntityAssignedPerson(COCTMT090000UV01Person value) {
        return new JAXBElement<COCTMT090000UV01Person>(_MFMIMT700701UV01AuthorOrPerformerAssignedPerson_QNAME, COCTMT090000UV01Person.class, COCTMT090000UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianPerson", scope = PRPAMT201301UV02Guardian.class)
    public JAXBElement<COCTMT030207UV07Person> createPRPAMT201301UV02GuardianGuardianPerson(COCTMT030207UV07Person value) {
        return new JAXBElement<COCTMT030207UV07Person>(_PRPAMT201303UV02GuardianGuardianPerson_QNAME, COCTMT030207UV07Person.class, PRPAMT201301UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianOrganization", scope = PRPAMT201301UV02Guardian.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201301UV02GuardianGuardianOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201303UV02GuardianGuardianOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201301UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = COCTMT150007UVContactParty.class)
    public JAXBElement<COCTMT150007UVPerson> createCOCTMT150007UVContactPartyContactPerson(COCTMT150007UVPerson value) {
        return new JAXBElement<COCTMT150007UVPerson>(_COCTMT030007UVContactPartyContactPerson_QNAME, COCTMT150007UVPerson.class, COCTMT150007UVContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406110UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = PRPMMT406110UV01AssignedEntity.class)
    public JAXBElement<PRPMMT406110UV01Organization> createPRPMMT406110UV01AssignedEntityRepresentedOrganization(PRPMMT406110UV01Organization value) {
        return new JAXBElement<PRPMMT406110UV01Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, PRPMMT406110UV01Organization.class, PRPMMT406110UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406110UV01PrincipalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPrincipalOrganization", scope = PRPMMT406110UV01AssignedEntity.class)
    public JAXBElement<PRPMMT406110UV01PrincipalOrganization> createPRPMMT406110UV01AssignedEntityAssignedPrincipalOrganization(PRPMMT406110UV01PrincipalOrganization value) {
        return new JAXBElement<PRPMMT406110UV01PrincipalOrganization>(_PRPMMT406110UV01AssignedEntityAssignedPrincipalOrganization_QNAME, PRPMMT406110UV01PrincipalOrganization.class, PRPMMT406110UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT090300UV01Device.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT090300UV01DeviceAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090000UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT090300UV01Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVEncounter.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVEncounterDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT080000UV09SpecimenCollectionProcessDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVEncounter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVEncounter.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVEncounterSubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_COCTMT530000UVSubstanceAdministrationSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVEncounter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVEncounter.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVEncounterDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVSubstanceAdministrationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVEncounter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVEncounter.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVEncounterRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVSubstanceAdministrationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVEncounter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = PRPMMT303010UV01AssignedEntity.class)
    public JAXBElement<PRPMMT303010UV01Organization> createPRPMMT303010UV01AssignedEntityRepresentedOrganization(PRPMMT303010UV01Organization value) {
        return new JAXBElement<PRPMMT303010UV01Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, PRPMMT303010UV01Organization.class, PRPMMT303010UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01Subject8 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf3", scope = PRPMMT303010UV01AssignedEntity.class)
    public JAXBElement<PRPMMT303010UV01Subject8> createPRPMMT303010UV01AssignedEntitySubjectOf3(PRPMMT303010UV01Subject8 value) {
        return new JAXBElement<PRPMMT303010UV01Subject8>(_PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME, PRPMMT303010UV01Subject8 .class, PRPMMT303010UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPrincipalPerson", scope = PRPMMT303010UV01AssignedEntity.class)
    public JAXBElement<PRPMMT303010UV01PrincipalPerson> createPRPMMT303010UV01AssignedEntityAssignedPrincipalPerson(PRPMMT303010UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT303010UV01PrincipalPerson>(_PRPMMT306910UV01AssignedEntityAssignedPrincipalPerson_QNAME, PRPMMT303010UV01PrincipalPerson.class, PRPMMT303010UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT590000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT590000UVAnnotation.class)
    public JAXBElement<COCTMT590000UVDataEnterer> createCOCTMT590000UVAnnotationDataEnterer(COCTMT590000UVDataEnterer value) {
        return new JAXBElement<COCTMT590000UVDataEnterer>(_COCTMT530000UVSubstanceAdministrationDataEnterer_QNAME, COCTMT590000UVDataEnterer.class, COCTMT590000UVAnnotation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT740000UV04Reference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "referencedBy", scope = COCTMT740000UV04OralHealthService.class)
    public JAXBElement<COCTMT740000UV04Reference> createCOCTMT740000UV04OralHealthServiceReferencedBy(COCTMT740000UV04Reference value) {
        return new JAXBElement<COCTMT740000UV04Reference>(_COCTMT740000UV04OralHealthServiceReferencedBy_QNAME, COCTMT740000UV04Reference.class, COCTMT740000UV04OralHealthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT740000UV04ResponsibleParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "responsibleParty", scope = COCTMT740000UV04OralHealthService.class)
    public JAXBElement<COCTMT740000UV04ResponsibleParty> createCOCTMT740000UV04OralHealthServiceResponsibleParty(COCTMT740000UV04ResponsibleParty value) {
        return new JAXBElement<COCTMT740000UV04ResponsibleParty>(_COCTMT530000UVControlActEventResponsibleParty_QNAME, COCTMT740000UV04ResponsibleParty.class, COCTMT740000UV04OralHealthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT740000UV04Performer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "performer", scope = COCTMT740000UV04OralHealthService.class)
    public JAXBElement<COCTMT740000UV04Performer> createCOCTMT740000UV04OralHealthServicePerformer(COCTMT740000UV04Performer value) {
        return new JAXBElement<COCTMT740000UV04Performer>(_COCTMT300000UV04SubstitutionPerformer_QNAME, COCTMT740000UV04Performer.class, COCTMT740000UV04OralHealthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianPerson", scope = COCTMT050000UV01Guardian.class)
    public JAXBElement<COCTMT030207UV07Person> createCOCTMT050000UV01GuardianGuardianPerson(COCTMT030207UV07Person value) {
        return new JAXBElement<COCTMT030207UV07Person>(_PRPAMT201303UV02GuardianGuardianPerson_QNAME, COCTMT030207UV07Person.class, COCTMT050000UV01Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianOrganization", scope = COCTMT050000UV01Guardian.class)
    public JAXBElement<COCTMT150007UVOrganization> createCOCTMT050000UV01GuardianGuardianOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201303UV02GuardianGuardianOrganization_QNAME, COCTMT150007UVOrganization.class, COCTMT050000UV01Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201301UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201301UV02Person.class)
    public JAXBElement<PRPAMT201301UV02BirthPlace> createPRPAMT201301UV02PersonBirthPlace(PRPAMT201301UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201301UV02BirthPlace>(_PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME, PRPAMT201301UV02BirthPlace.class, PRPAMT201301UV02Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT409000UV01Jurisdiction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "territory", scope = PRPMMT409000UV01TerritorialAuthority.class)
    public JAXBElement<PRPMMT409000UV01Jurisdiction> createPRPMMT409000UV01TerritorialAuthorityTerritory(PRPMMT409000UV01Jurisdiction value) {
        return new JAXBElement<PRPMMT409000UV01Jurisdiction>(_PRPMMT309000UV01TerritorialAuthorityTerritory_QNAME, PRPMMT409000UV01Jurisdiction.class, PRPMMT409000UV01TerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "samePrincipalPerson", scope = PRPMMT306110UV01AlsoKnownas.class)
    public JAXBElement<PRPMMT306110UV01PrincipalPerson> createPRPMMT306110UV01AlsoKnownasSamePrincipalPerson(PRPMMT306110UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT306110UV01PrincipalPerson>(_PRPMMT306110UV01AlsoKnownasSamePrincipalPerson_QNAME, PRPMMT306110UV01PrincipalPerson.class, PRPMMT306110UV01AlsoKnownas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = COCTMT150000UV02ContactParty.class)
    public JAXBElement<COCTMT150000UV02Person> createCOCTMT150000UV02ContactPartyContactPerson(COCTMT150000UV02Person value) {
        return new JAXBElement<COCTMT150000UV02Person>(_COCTMT030007UVContactPartyContactPerson_QNAME, COCTMT150000UV02Person.class, COCTMT150000UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030203UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = COCTMT040203UV09NotificationParty.class)
    public JAXBElement<COCTMT030203UV07Person> createCOCTMT040203UV09NotificationPartyContactPerson(COCTMT030203UV07Person value) {
        return new JAXBElement<COCTMT030203UV07Person>(_COCTMT030007UVContactPartyContactPerson_QNAME, COCTMT030203UV07Person.class, COCTMT040203UV09NotificationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = COCTMT040203UV09NotificationParty.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT040203UV09NotificationPartyContactOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_COCTMT030007UVContactPartyContactOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT040203UV09NotificationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06ReusableDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "reusableDevice", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06ReusableDevice> createCOCTMT290000UV06BillableClinicalServiceReusableDevice(COCTMT290000UV06ReusableDevice value) {
        return new JAXBElement<COCTMT290000UV06ReusableDevice>(_COCTMT290000UV06BillableClinicalServiceReusableDevice_QNAME, COCTMT290000UV06ReusableDevice.class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06Location> createCOCTMT290000UV06BillableClinicalServiceLocation(COCTMT290000UV06Location value) {
        return new JAXBElement<COCTMT290000UV06Location>(_COCTMT070000UV01LocatedEntityLocation_QNAME, COCTMT290000UV06Location.class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06ResponsibleParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "responsibleParty", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06ResponsibleParty> createCOCTMT290000UV06BillableClinicalServiceResponsibleParty(COCTMT290000UV06ResponsibleParty value) {
        return new JAXBElement<COCTMT290000UV06ResponsibleParty>(_COCTMT530000UVControlActEventResponsibleParty_QNAME, COCTMT290000UV06ResponsibleParty.class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06Author> createCOCTMT290000UV06BillableClinicalServiceAuthor(COCTMT290000UV06Author value) {
        return new JAXBElement<COCTMT290000UV06Author>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, COCTMT290000UV06Author.class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Performer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "performer", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06Performer> createCOCTMT290000UV06BillableClinicalServicePerformer(COCTMT290000UV06Performer value) {
        return new JAXBElement<COCTMT290000UV06Performer>(_COCTMT300000UV04SubstitutionPerformer_QNAME, COCTMT290000UV06Performer.class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Component2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "component", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06Component2> createCOCTMT290000UV06BillableClinicalServiceComponent(COCTMT290000UV06Component2 value) {
        return new JAXBElement<COCTMT290000UV06Component2>(_COCTMT290000UV06BillableClinicalServiceComponent_QNAME, COCTMT290000UV06Component2 .class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Subject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf2", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06Subject> createCOCTMT290000UV06BillableClinicalServiceSubjectOf2(COCTMT290000UV06Subject value) {
        return new JAXBElement<COCTMT290000UV06Subject>(_COCTMT080000UV09SpecimenCollectionProcessSubjectOf2_QNAME, COCTMT290000UV06Subject.class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "issuingOrganization", scope = PRPMMT303010UV01HealthCareProvider.class)
    public JAXBElement<PRPMMT303010UV01Organization> createPRPMMT303010UV01HealthCareProviderIssuingOrganization(PRPMMT303010UV01Organization value) {
        return new JAXBElement<PRPMMT303010UV01Organization>(_PRPMMT309000UV01HealthCareProviderIssuingOrganization_QNAME, PRPMMT303010UV01Organization.class, PRPMMT303010UV01HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01Subject8 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf3", scope = PRPMMT303010UV01HealthCareProvider.class)
    public JAXBElement<PRPMMT303010UV01Subject8> createPRPMMT303010UV01HealthCareProviderSubjectOf3(PRPMMT303010UV01Subject8 value) {
        return new JAXBElement<PRPMMT303010UV01Subject8>(_PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME, PRPMMT303010UV01Subject8 .class, PRPMMT303010UV01HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCarePrincipalPerson", scope = PRPMMT303010UV01HealthCareProvider.class)
    public JAXBElement<PRPMMT303010UV01PrincipalPerson> createPRPMMT303010UV01HealthCareProviderHealthCarePrincipalPerson(PRPMMT303010UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT303010UV01PrincipalPerson>(_PRPMMT309000UV01HealthCareProviderHealthCarePrincipalPerson_QNAME, PRPMMT303010UV01PrincipalPerson.class, PRPMMT303010UV01HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Subject4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject2", scope = MFMIMT700711UV01PriorRegistration.class)
    public JAXBElement<MFMIMT700711UV01Subject4> createMFMIMT700711UV01PriorRegistrationSubject2(MFMIMT700711UV01Subject4 value) {
        return new JAXBElement<MFMIMT700711UV01Subject4>(_MFMIMT700711UV01PriorRegistrationSubject2_QNAME, MFMIMT700711UV01Subject4 .class, MFMIMT700711UV01PriorRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Subject3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject1", scope = MFMIMT700711UV01PriorRegistration.class)
    public JAXBElement<MFMIMT700711UV01Subject3> createMFMIMT700711UV01PriorRegistrationSubject1(MFMIMT700711UV01Subject3 value) {
        return new JAXBElement<MFMIMT700711UV01Subject3>(_MFMIMT700711UV01PriorRegistrationSubject1_QNAME, MFMIMT700711UV01Subject3 .class, MFMIMT700711UV01PriorRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01Birthplace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = PRPMMT303010UV01PrincipalPerson.class)
    public JAXBElement<PRPMMT303010UV01Birthplace> createPRPMMT303010UV01PrincipalPersonBirthplace(PRPMMT303010UV01Birthplace value) {
        return new JAXBElement<PRPMMT303010UV01Birthplace>(_COCTMT030202UV07BirthPlaceBirthplace_QNAME, PRPMMT303010UV01Birthplace.class, PRPMMT303010UV01PrincipalPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVAct.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVActDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT080000UV09SpecimenCollectionProcessDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVAct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVAct.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVActSubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_COCTMT530000UVSubstanceAdministrationSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVAct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVAct.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVActDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVSubstanceAdministrationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVAct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVAct.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVActRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVSubstanceAdministrationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVAct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000200UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = MCCIMT000200UV01LocatedEntity.class)
    public JAXBElement<MCCIMT000200UV01Place> createMCCIMT000200UV01LocatedEntityLocation(MCCIMT000200UV01Place value) {
        return new JAXBElement<MCCIMT000200UV01Place>(_COCTMT070000UV01LocatedEntityLocation_QNAME, MCCIMT000200UV01Place.class, MCCIMT000200UV01LocatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306010UV01RoleEffectiveDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "roleEffectiveDate", scope = PRPMMT306010UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT306010UV01RoleEffectiveDate> createPRPMMT306010UV01QueryByParameterPayloadRoleEffectiveDate(PRPMMT306010UV01RoleEffectiveDate value) {
        return new JAXBElement<PRPMMT306010UV01RoleEffectiveDate>(_PRPMMT406010UV01QueryByParameterPayloadRoleEffectiveDate_QNAME, PRPMMT306010UV01RoleEffectiveDate.class, PRPMMT306010UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306010UV01History }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "history", scope = PRPMMT306010UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT306010UV01History> createPRPMMT306010UV01QueryByParameterPayloadHistory(PRPMMT306010UV01History value) {
        return new JAXBElement<PRPMMT306010UV01History>(_PRPMMT406010UV01QueryByParameterPayloadHistory_QNAME, PRPMMT306010UV01History.class, PRPMMT306010UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306010UV01RoleClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "roleClass", scope = PRPMMT306010UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT306010UV01RoleClass> createPRPMMT306010UV01QueryByParameterPayloadRoleClass(PRPMMT306010UV01RoleClass value) {
        return new JAXBElement<PRPMMT306010UV01RoleClass>(_PRPMMT306010UV01QueryByParameterPayloadRoleClass_QNAME, PRPMMT306010UV01RoleClass.class, PRPMMT306010UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306010UV01Confidence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "confidence", scope = PRPMMT306010UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT306010UV01Confidence> createPRPMMT306010UV01QueryByParameterPayloadConfidence(PRPMMT306010UV01Confidence value) {
        return new JAXBElement<PRPMMT306010UV01Confidence>(_PRPMMT406010UV01QueryByParameterPayloadConfidence_QNAME, PRPMMT306010UV01Confidence.class, PRPMMT306010UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306010UV01Jurisdiction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "jurisdiction", scope = PRPMMT306010UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT306010UV01Jurisdiction> createPRPMMT306010UV01QueryByParameterPayloadJurisdiction(PRPMMT306010UV01Jurisdiction value) {
        return new JAXBElement<PRPMMT306010UV01Jurisdiction>(_PRPMMT406010UV01QueryByParameterPayloadJurisdiction_QNAME, PRPMMT306010UV01Jurisdiction.class, PRPMMT306010UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306010UV01DOB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dOB", scope = PRPMMT306010UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT306010UV01DOB> createPRPMMT306010UV01QueryByParameterPayloadDOB(PRPMMT306010UV01DOB value) {
        return new JAXBElement<PRPMMT306010UV01DOB>(_PRPMMT306010UV01QueryByParameterPayloadDOB_QNAME, PRPMMT306010UV01DOB.class, PRPMMT306010UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306010UV01AdministrativeGender }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "administrativeGender", scope = PRPMMT306010UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT306010UV01AdministrativeGender> createPRPMMT306010UV01QueryByParameterPayloadAdministrativeGender(PRPMMT306010UV01AdministrativeGender value) {
        return new JAXBElement<PRPMMT306010UV01AdministrativeGender>(_PRPMMT306010UV01QueryByParameterPayloadAdministrativeGender_QNAME, PRPMMT306010UV01AdministrativeGender.class, PRPMMT306010UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianPerson", scope = PRPAMT201302UV02Guardian.class)
    public JAXBElement<COCTMT030207UV07Person> createPRPAMT201302UV02GuardianGuardianPerson(COCTMT030207UV07Person value) {
        return new JAXBElement<COCTMT030207UV07Person>(_PRPAMT201303UV02GuardianGuardianPerson_QNAME, COCTMT030207UV07Person.class, PRPAMT201302UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianOrganization", scope = PRPAMT201302UV02Guardian.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201302UV02GuardianGuardianOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201303UV02GuardianGuardianOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201302UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supply", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVSupply> createCOCTMT510000UV06PreconditionSupply(COCTMT530000UVSupply value) {
        return new JAXBElement<COCTMT530000UVSupply>(_COCTMT510000UV06DefinitionSupply_QNAME, COCTMT530000UVSupply.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVActReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "actReference", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVActReference> createCOCTMT510000UV06PreconditionActReference(COCTMT530000UVActReference value) {
        return new JAXBElement<COCTMT530000UVActReference>(_COCTMT510000UV06DefinitionActReference_QNAME, COCTMT530000UVActReference.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "procedure", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVProcedure> createCOCTMT510000UV06PreconditionProcedure(COCTMT530000UVProcedure value) {
        return new JAXBElement<COCTMT530000UVProcedure>(_COCTMT510000UV06DefinitionProcedure_QNAME, COCTMT530000UVProcedure.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "encounter", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVEncounter> createCOCTMT510000UV06PreconditionEncounter(COCTMT530000UVEncounter value) {
        return new JAXBElement<COCTMT530000UVEncounter>(_COCTMT510000UV06DefinitionEncounter_QNAME, COCTMT530000UVEncounter.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "observation", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVObservation> createCOCTMT510000UV06PreconditionObservation(COCTMT530000UVObservation value) {
        return new JAXBElement<COCTMT530000UVObservation>(_COCTMT510000UV06DefinitionObservation_QNAME, COCTMT530000UVObservation.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "substanceAdministration", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVSubstanceAdministration> createCOCTMT510000UV06PreconditionSubstanceAdministration(COCTMT530000UVSubstanceAdministration value) {
        return new JAXBElement<COCTMT530000UVSubstanceAdministration>(_COCTMT510000UV06DefinitionSubstanceAdministration_QNAME, COCTMT530000UVSubstanceAdministration.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "organizer", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVOrganizer> createCOCTMT510000UV06PreconditionOrganizer(COCTMT530000UVOrganizer value) {
        return new JAXBElement<COCTMT530000UVOrganizer>(_COCTMT510000UV06DefinitionOrganizer_QNAME, COCTMT530000UVOrganizer.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "act", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVAct> createCOCTMT510000UV06PreconditionAct(COCTMT530000UVAct value) {
        return new JAXBElement<COCTMT530000UVAct>(_COCTMT510000UV06DefinitionAct_QNAME, COCTMT530000UVAct.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04PertinentInformation2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "pertinentInformation", scope = COCTMT300000UV04SubstanceAdministrationIntent.class)
    public JAXBElement<COCTMT300000UV04PertinentInformation2> createCOCTMT300000UV04SubstanceAdministrationIntentPertinentInformation(COCTMT300000UV04PertinentInformation2 value) {
        return new JAXBElement<COCTMT300000UV04PertinentInformation2>(_COCTMT300000UV04SubstanceAdministrationIntentPertinentInformation_QNAME, COCTMT300000UV04PertinentInformation2 .class, COCTMT300000UV04SubstanceAdministrationIntent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06VisionProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturedVisionProduct", scope = COCTMT600000UV06ManufacturedProduct.class)
    public JAXBElement<COCTMT600000UV06VisionProduct> createCOCTMT600000UV06ManufacturedProductManufacturedVisionProduct(COCTMT600000UV06VisionProduct value) {
        return new JAXBElement<COCTMT600000UV06VisionProduct>(_COCTMT600000UV06ManufacturedProductManufacturedVisionProduct_QNAME, COCTMT600000UV06VisionProduct.class, COCTMT600000UV06ManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201301UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201301UV02NonPersonLivingSubject.class)
    public JAXBElement<PRPAMT201301UV02BirthPlace> createPRPAMT201301UV02NonPersonLivingSubjectBirthPlace(PRPAMT201301UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201301UV02BirthPlace>(_PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME, PRPAMT201301UV02BirthPlace.class, PRPAMT201301UV02NonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = SDTITLE.class)
    public JAXBElement<StrucDocSup> createSDTITLESup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocContentSup_QNAME, StrucDocSup.class, SDTITLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocCMTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = SDTITLE.class)
    public JAXBElement<StrucDocCMTitle> createSDTITLEContent(StrucDocCMTitle value) {
        return new JAXBElement<StrucDocCMTitle>(_StrucDocContentContent_QNAME, StrucDocCMTitle.class, SDTITLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = SDTITLE.class)
    public JAXBElement<StrucDocLinkHtml> createSDTITLELinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocContentLinkHtml_QNAME, StrucDocLinkHtml.class, SDTITLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTitleFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = SDTITLE.class)
    public JAXBElement<StrucDocTitleFootnote> createSDTITLEFootnote(StrucDocTitleFootnote value) {
        return new JAXBElement<StrucDocTitleFootnote>(_StrucDocContentFootnote_QNAME, StrucDocTitleFootnote.class, SDTITLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = SDTITLE.class)
    public JAXBElement<StrucDocFootnoteRef> createSDTITLEFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocContentFootnoteRef_QNAME, StrucDocFootnoteRef.class, SDTITLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = SDTITLE.class)
    public JAXBElement<StrucDocSub> createSDTITLESub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocContentSub_QNAME, StrucDocSub.class, SDTITLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = SDTITLE.class)
    public JAXBElement<StrucDocBr> createSDTITLEBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocContentBr_QNAME, StrucDocBr.class, SDTITLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVBirthplace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = COCTMT530000UVPerson.class)
    public JAXBElement<COCTMT530000UVBirthplace> createCOCTMT530000UVPersonBirthplace(COCTMT530000UVBirthplace value) {
        return new JAXBElement<COCTMT530000UVBirthplace>(_COCTMT030202UV07BirthPlaceBirthplace_QNAME, COCTMT530000UVBirthplace.class, COCTMT530000UVPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "affiliatedPrincipalPerson", scope = PRPMMT403010UV01Affiliate.class)
    public JAXBElement<PRPMMT403010UV01PrincipalPerson> createPRPMMT403010UV01AffiliateAffiliatedPrincipalPerson(PRPMMT403010UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT403010UV01PrincipalPerson>(_PRPMMT303010UV01AffiliateAffiliatedPrincipalPerson_QNAME, PRPMMT403010UV01PrincipalPerson.class, PRPMMT403010UV01Affiliate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01PrincipalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "affiliatedPrincipalOrganization", scope = PRPMMT403010UV01Affiliate.class)
    public JAXBElement<PRPMMT403010UV01PrincipalOrganization> createPRPMMT403010UV01AffiliateAffiliatedPrincipalOrganization(PRPMMT403010UV01PrincipalOrganization value) {
        return new JAXBElement<PRPMMT403010UV01PrincipalOrganization>(_PRPMMT303010UV01AffiliateAffiliatedPrincipalOrganization_QNAME, PRPMMT403010UV01PrincipalOrganization.class, PRPMMT403010UV01Affiliate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT060000UV01Entity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "playingEntity", scope = COCTMT060000UV01RoleTransport.class)
    public JAXBElement<COCTMT060000UV01Entity> createCOCTMT060000UV01RoleTransportPlayingEntity(COCTMT060000UV01Entity value) {
        return new JAXBElement<COCTMT060000UV01Entity>(_COCTMT060000UV01RoleTransportPlayingEntity_QNAME, COCTMT060000UV01Entity.class, COCTMT060000UV01RoleTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306810UV01RoleClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "roleClass", scope = PRPMMT306810UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT306810UV01RoleClass> createPRPMMT306810UV01QueryByParameterPayloadRoleClass(PRPMMT306810UV01RoleClass value) {
        return new JAXBElement<PRPMMT306810UV01RoleClass>(_PRPMMT306010UV01QueryByParameterPayloadRoleClass_QNAME, PRPMMT306810UV01RoleClass.class, PRPMMT306810UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306810UV01Confidence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "confidence", scope = PRPMMT306810UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT306810UV01Confidence> createPRPMMT306810UV01QueryByParameterPayloadConfidence(PRPMMT306810UV01Confidence value) {
        return new JAXBElement<PRPMMT306810UV01Confidence>(_PRPMMT406010UV01QueryByParameterPayloadConfidence_QNAME, PRPMMT306810UV01Confidence.class, PRPMMT306810UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306810UV01Jurisdiction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "jurisdiction", scope = PRPMMT306810UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT306810UV01Jurisdiction> createPRPMMT306810UV01QueryByParameterPayloadJurisdiction(PRPMMT306810UV01Jurisdiction value) {
        return new JAXBElement<PRPMMT306810UV01Jurisdiction>(_PRPMMT406010UV01QueryByParameterPayloadJurisdiction_QNAME, PRPMMT306810UV01Jurisdiction.class, PRPMMT306810UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306810UV01DOB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dOB", scope = PRPMMT306810UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT306810UV01DOB> createPRPMMT306810UV01QueryByParameterPayloadDOB(PRPMMT306810UV01DOB value) {
        return new JAXBElement<PRPMMT306810UV01DOB>(_PRPMMT306010UV01QueryByParameterPayloadDOB_QNAME, PRPMMT306810UV01DOB.class, PRPMMT306810UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306810UV01AdministrativeGender }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "administrativeGender", scope = PRPMMT306810UV01QueryByParameterPayload.class)
    public JAXBElement<PRPMMT306810UV01AdministrativeGender> createPRPMMT306810UV01QueryByParameterPayloadAdministrativeGender(PRPMMT306810UV01AdministrativeGender value) {
        return new JAXBElement<PRPMMT306810UV01AdministrativeGender>(_PRPMMT306010UV01QueryByParameterPayloadAdministrativeGender_QNAME, PRPMMT306810UV01AdministrativeGender.class, PRPMMT306810UV01QueryByParameterPayload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090000UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = COCTMT080000UV09Performer.class)
    public JAXBElement<COCTMT090000UV01AssignedEntity> createCOCTMT080000UV09PerformerAssignedEntity(COCTMT090000UV01AssignedEntity value) {
        return new JAXBElement<COCTMT090000UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, COCTMT090000UV01AssignedEntity.class, COCTMT080000UV09Performer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patient", scope = COCTMT080000UV09Performer.class)
    public JAXBElement<COCTMT050000UV01Patient> createCOCTMT080000UV09PerformerPatient(COCTMT050000UV01Patient value) {
        return new JAXBElement<COCTMT050000UV01Patient>(_COCTMT510000UV06Beneficiary2Patient_QNAME, COCTMT050000UV01Patient.class, COCTMT080000UV09Performer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT409000UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = PRPMMT409000UV01AssignedEntity.class)
    public JAXBElement<PRPMMT409000UV01Organization> createPRPMMT409000UV01AssignedEntityRepresentedOrganization(PRPMMT409000UV01Organization value) {
        return new JAXBElement<PRPMMT409000UV01Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, PRPMMT409000UV01Organization.class, PRPMMT409000UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT409000UV01PrincipalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPrincipalOrganization", scope = PRPMMT409000UV01AssignedEntity.class)
    public JAXBElement<PRPMMT409000UV01PrincipalOrganization> createPRPMMT409000UV01AssignedEntityAssignedPrincipalOrganization(PRPMMT409000UV01PrincipalOrganization value) {
        return new JAXBElement<PRPMMT409000UV01PrincipalOrganization>(_PRPMMT406110UV01AssignedEntityAssignedPrincipalOrganization_QNAME, PRPMMT409000UV01PrincipalOrganization.class, PRPMMT409000UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090300UV01Device }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = COCTMT090300UV01AssignedDevice.class)
    public JAXBElement<COCTMT090300UV01Device> createCOCTMT090300UV01AssignedDeviceAssignedDevice(COCTMT090300UV01Device value) {
        return new JAXBElement<COCTMT090300UV01Device>(_MFMIMT700701UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090300UV01Device.class, COCTMT090300UV01AssignedDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090300UV01AssignedDevice.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT090300UV01AssignedDeviceRepresentedOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT090300UV01AssignedDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090300UV01AssignedDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = MFMIMT700721UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090300UV01AssignedDevice> createMFMIMT700721UV01AuthorOrPerformerAssignedDevice(COCTMT090300UV01AssignedDevice value) {
        return new JAXBElement<COCTMT090300UV01AssignedDevice>(_MFMIMT700701UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090300UV01AssignedDevice.class, MFMIMT700721UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090100UV01AssignedPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = MFMIMT700721UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090100UV01AssignedPerson> createMFMIMT700721UV01AuthorOrPerformerAssignedPerson(COCTMT090100UV01AssignedPerson value) {
        return new JAXBElement<COCTMT090100UV01AssignedPerson>(_MFMIMT700701UV01AuthorOrPerformerAssignedPerson_QNAME, COCTMT090100UV01AssignedPerson.class, MFMIMT700721UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supply", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVSupply> createCOCTMT530000UVComponentSupply(COCTMT530000UVSupply value) {
        return new JAXBElement<COCTMT530000UVSupply>(_COCTMT510000UV06DefinitionSupply_QNAME, COCTMT530000UVSupply.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVActReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "actReference", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVActReference> createCOCTMT530000UVComponentActReference(COCTMT530000UVActReference value) {
        return new JAXBElement<COCTMT530000UVActReference>(_COCTMT510000UV06DefinitionActReference_QNAME, COCTMT530000UVActReference.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "procedure", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVProcedure> createCOCTMT530000UVComponentProcedure(COCTMT530000UVProcedure value) {
        return new JAXBElement<COCTMT530000UVProcedure>(_COCTMT510000UV06DefinitionProcedure_QNAME, COCTMT530000UVProcedure.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "encounter", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVEncounter> createCOCTMT530000UVComponentEncounter(COCTMT530000UVEncounter value) {
        return new JAXBElement<COCTMT530000UVEncounter>(_COCTMT510000UV06DefinitionEncounter_QNAME, COCTMT530000UVEncounter.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "observation", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVObservation> createCOCTMT530000UVComponentObservation(COCTMT530000UVObservation value) {
        return new JAXBElement<COCTMT530000UVObservation>(_COCTMT510000UV06DefinitionObservation_QNAME, COCTMT530000UVObservation.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "substanceAdministration", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVSubstanceAdministration> createCOCTMT530000UVComponentSubstanceAdministration(COCTMT530000UVSubstanceAdministration value) {
        return new JAXBElement<COCTMT530000UVSubstanceAdministration>(_COCTMT510000UV06DefinitionSubstanceAdministration_QNAME, COCTMT530000UVSubstanceAdministration.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "organizer", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVOrganizer> createCOCTMT530000UVComponentOrganizer(COCTMT530000UVOrganizer value) {
        return new JAXBElement<COCTMT530000UVOrganizer>(_COCTMT510000UV06DefinitionOrganizer_QNAME, COCTMT530000UVOrganizer.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "act", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVAct> createCOCTMT530000UVComponentAct(COCTMT530000UVAct value) {
        return new JAXBElement<COCTMT530000UVAct>(_COCTMT510000UV06DefinitionAct_QNAME, COCTMT530000UVAct.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01RoleOther }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "roleOther", scope = PRPMMT403010UV01RelatedTo.class)
    public JAXBElement<PRPMMT403010UV01RoleOther> createPRPMMT403010UV01RelatedToRoleOther(PRPMMT403010UV01RoleOther value) {
        return new JAXBElement<PRPMMT403010UV01RoleOther>(_PRPMIN403010UV01MFMIMT700721UV01Subject2RoleOther_QNAME, PRPMMT403010UV01RoleOther.class, PRPMMT403010UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMMT403010UV01RelatedTo.class)
    public JAXBElement<PRPMMT403010UV01AssignedEntity> createPRPMMT403010UV01RelatedToAssignedEntity(PRPMMT403010UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT403010UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT403010UV01AssignedEntity.class, PRPMMT403010UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Member }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "member", scope = PRPMMT403010UV01RelatedTo.class)
    public JAXBElement<PRPMMT403010UV01Member> createPRPMMT403010UV01RelatedToMember(PRPMMT403010UV01Member value) {
        return new JAXBElement<PRPMMT403010UV01Member>(_PRPMIN403010UV01MFMIMT700721UV01Subject2Member_QNAME, PRPMMT403010UV01Member.class, PRPMMT403010UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01LicensedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "licensedEntity", scope = PRPMMT403010UV01RelatedTo.class)
    public JAXBElement<PRPMMT403010UV01LicensedEntity> createPRPMMT403010UV01RelatedToLicensedEntity(PRPMMT403010UV01LicensedEntity value) {
        return new JAXBElement<PRPMMT403010UV01LicensedEntity>(_PRPMIN403010UV01MFMIMT700721UV01Subject2LicensedEntity_QNAME, PRPMMT403010UV01LicensedEntity.class, PRPMMT403010UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01QualifiedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedEntity", scope = PRPMMT403010UV01RelatedTo.class)
    public JAXBElement<PRPMMT403010UV01QualifiedEntity> createPRPMMT403010UV01RelatedToQualifiedEntity(PRPMMT403010UV01QualifiedEntity value) {
        return new JAXBElement<PRPMMT403010UV01QualifiedEntity>(_PRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity_QNAME, PRPMMT403010UV01QualifiedEntity.class, PRPMMT403010UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = PRPMMT301010UV01AssignedEntity.class)
    public JAXBElement<PRPMMT301010UV01Organization> createPRPMMT301010UV01AssignedEntityRepresentedOrganization(PRPMMT301010UV01Organization value) {
        return new JAXBElement<PRPMMT301010UV01Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, PRPMMT301010UV01Organization.class, PRPMMT301010UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Subject8 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf3", scope = PRPMMT301010UV01AssignedEntity.class)
    public JAXBElement<PRPMMT301010UV01Subject8> createPRPMMT301010UV01AssignedEntitySubjectOf3(PRPMMT301010UV01Subject8 value) {
        return new JAXBElement<PRPMMT301010UV01Subject8>(_PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME, PRPMMT301010UV01Subject8 .class, PRPMMT301010UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPrincipalPerson", scope = PRPMMT301010UV01AssignedEntity.class)
    public JAXBElement<PRPMMT301010UV01PrincipalPerson> createPRPMMT301010UV01AssignedEntityAssignedPrincipalPerson(PRPMMT301010UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT301010UV01PrincipalPerson>(_PRPMMT306910UV01AssignedEntityAssignedPrincipalPerson_QNAME, PRPMMT301010UV01PrincipalPerson.class, PRPMMT301010UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT080000UV09OtherIDs.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT080000UV09OtherIDsScopingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT080000UV09OtherIDs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocCaption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "caption", scope = StrucDocCaptioned.class)
    public JAXBElement<StrucDocCaption> createStrucDocCaptionedCaption(StrucDocCaption value) {
        return new JAXBElement<StrucDocCaption>(_StrucDocCaptionedCaption_QNAME, StrucDocCaption.class, StrucDocCaptioned.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocLinkHtml.class)
    public JAXBElement<StrucDocFootnote> createStrucDocLinkHtmlFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocContentFootnote_QNAME, StrucDocFootnote.class, StrucDocLinkHtml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocLinkHtml.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocLinkHtmlFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocContentFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocLinkHtml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocSup> createStrucDocCaptionSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocContentSup_QNAME, StrucDocSup.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocCaptionLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocContentLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocFootnote> createStrucDocCaptionFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocContentFootnote_QNAME, StrucDocFootnote.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocCaptionFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocContentFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocSub> createStrucDocCaptionSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocContentSub_QNAME, StrucDocSub.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "affiliatedPrincipalPerson", scope = PRPMMT301010UV01Affiliate.class)
    public JAXBElement<PRPMMT301010UV01PrincipalPerson> createPRPMMT301010UV01AffiliateAffiliatedPrincipalPerson(PRPMMT301010UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT301010UV01PrincipalPerson>(_PRPMMT303010UV01AffiliateAffiliatedPrincipalPerson_QNAME, PRPMMT301010UV01PrincipalPerson.class, PRPMMT301010UV01Affiliate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01PrincipalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "affiliatedPrincipalOrganization", scope = PRPMMT301010UV01Affiliate.class)
    public JAXBElement<PRPMMT301010UV01PrincipalOrganization> createPRPMMT301010UV01AffiliateAffiliatedPrincipalOrganization(PRPMMT301010UV01PrincipalOrganization value) {
        return new JAXBElement<PRPMMT301010UV01PrincipalOrganization>(_PRPMMT303010UV01AffiliateAffiliatedPrincipalOrganization_QNAME, PRPMMT301010UV01PrincipalOrganization.class, PRPMMT301010UV01Affiliate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000100UV01Agent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asAgent", scope = MCCIMT000100UV01Device.class)
    public JAXBElement<MCCIMT000100UV01Agent> createMCCIMT000100UV01DeviceAsAgent(MCCIMT000100UV01Agent value) {
        return new JAXBElement<MCCIMT000100UV01Agent>(_MCCIMT000200UV01DeviceAsAgent_QNAME, MCCIMT000100UV01Agent.class, MCCIMT000100UV01Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "policyHolderOrganization", scope = COCTMT510000UV06PolicyHolder.class)
    public JAXBElement<COCTMT510000UV06Organization> createCOCTMT510000UV06PolicyHolderPolicyHolderOrganization(COCTMT510000UV06Organization value) {
        return new JAXBElement<COCTMT510000UV06Organization>(_COCTMT510000UV06PolicyHolderPolicyHolderOrganization_QNAME, COCTMT510000UV06Organization.class, COCTMT510000UV06PolicyHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "underwritingOrganization", scope = COCTMT510000UV06PolicyHolder.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06PolicyHolderUnderwritingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06PayorUnderwritingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06PolicyHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "policyHolderPerson", scope = COCTMT510000UV06PolicyHolder.class)
    public JAXBElement<COCTMT510000UV06Person> createCOCTMT510000UV06PolicyHolderPolicyHolderPerson(COCTMT510000UV06Person value) {
        return new JAXBElement<COCTMT510000UV06Person>(_COCTMT510000UV06PolicyHolderPolicyHolderPerson_QNAME, COCTMT510000UV06Person.class, COCTMT510000UV06PolicyHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVBirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = COCTMT030007UVNonPersonLivingSubject.class)
    public JAXBElement<COCTMT030007UVBirthPlace> createCOCTMT030007UVNonPersonLivingSubjectBirthPlace(COCTMT030007UVBirthPlace value) {
        return new JAXBElement<COCTMT030007UVBirthPlace>(_PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME, COCTMT030007UVBirthPlace.class, COCTMT030007UVNonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710000UV07Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = COCTMT240003UV02ServiceDeliveryLocation.class)
    public JAXBElement<COCTMT710000UV07Place> createCOCTMT240003UV02ServiceDeliveryLocationLocation(COCTMT710000UV07Place value) {
        return new JAXBElement<COCTMT710000UV07Place>(_COCTMT070000UV01LocatedEntityLocation_QNAME, COCTMT710000UV07Place.class, COCTMT240003UV02ServiceDeliveryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "serviceProviderOrganization", scope = COCTMT240003UV02ServiceDeliveryLocation.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT240003UV02ServiceDeliveryLocationServiceProviderOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_COCTMT240003UV02ServiceDeliveryLocationServiceProviderOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT240003UV02ServiceDeliveryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT040203UV09NotificationParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "notificationParty", scope = MCCIMT000100UV01Organization.class)
    public JAXBElement<COCTMT040203UV09NotificationParty> createMCCIMT000100UV01OrganizationNotificationParty(COCTMT040203UV09NotificationParty value) {
        return new JAXBElement<COCTMT040203UV09NotificationParty>(_MCCIMT000300UV01OrganizationNotificationParty_QNAME, COCTMT040203UV09NotificationParty.class, MCCIMT000100UV01Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT510000UV06ResponsibleParty.class)
    public JAXBElement<COCTMT510000UV06Organization> createCOCTMT510000UV06ResponsiblePartyRepresentedOrganization(COCTMT510000UV06Organization value) {
        return new JAXBElement<COCTMT510000UV06Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, COCTMT510000UV06Organization.class, COCTMT510000UV06ResponsibleParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "agentPerson", scope = COCTMT510000UV06ResponsibleParty.class)
    public JAXBElement<COCTMT510000UV06Person> createCOCTMT510000UV06ResponsiblePartyAgentPerson(COCTMT510000UV06Person value) {
        return new JAXBElement<COCTMT510000UV06Person>(_COCTMT510000UV06ResponsiblePartyAgentPerson_QNAME, COCTMT510000UV06Person.class, COCTMT510000UV06ResponsibleParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedPerson", scope = COCTMT510000UV06ResponsibleParty.class)
    public JAXBElement<COCTMT510000UV06Person> createCOCTMT510000UV06ResponsiblePartyRepresentedPerson(COCTMT510000UV06Person value) {
        return new JAXBElement<COCTMT510000UV06Person>(_COCTMT510000UV06ResponsiblePartyRepresentedPerson_QNAME, COCTMT510000UV06Person.class, COCTMT510000UV06ResponsibleParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201301UV02Subject2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = PRPAMT201301UV02BirthPlace.class)
    public JAXBElement<PRPAMT201301UV02Subject2> createPRPAMT201301UV02BirthPlaceSubjectOf(PRPAMT201301UV02Subject2 value) {
        return new JAXBElement<PRPAMT201301UV02Subject2>(_COCTMT530000UVSubstanceAdministrationSubjectOf_QNAME, PRPAMT201301UV02Subject2 .class, PRPAMT201301UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710007UV07Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = PRPAMT201301UV02BirthPlace.class)
    public JAXBElement<COCTMT710007UV07Place> createPRPAMT201301UV02BirthPlaceBirthplace(COCTMT710007UV07Place value) {
        return new JAXBElement<COCTMT710007UV07Place>(_COCTMT030202UV07BirthPlaceBirthplace_QNAME, COCTMT710007UV07Place.class, PRPAMT201301UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01Jurisdiction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "territory", scope = PRPMMT306110UV01TerritorialAuthority.class)
    public JAXBElement<PRPMMT306110UV01Jurisdiction> createPRPMMT306110UV01TerritorialAuthorityTerritory(PRPMMT306110UV01Jurisdiction value) {
        return new JAXBElement<PRPMMT306110UV01Jurisdiction>(_PRPMMT309000UV01TerritorialAuthorityTerritory_QNAME, PRPMMT306110UV01Jurisdiction.class, PRPMMT306110UV01TerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04ManufacturedMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "containedManufacturedMaterial", scope = COCTMT490000UV04ContentPackagedProduct.class)
    public JAXBElement<COCTMT490000UV04ManufacturedMaterial> createCOCTMT490000UV04ContentPackagedProductContainedManufacturedMaterial(COCTMT490000UV04ManufacturedMaterial value) {
        return new JAXBElement<COCTMT490000UV04ManufacturedMaterial>(_COCTMT490000UV04ContentPackagedProductContainedManufacturedMaterial_QNAME, COCTMT490000UV04ManufacturedMaterial.class, COCTMT490000UV04ContentPackagedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090000UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = COCTMT530000UVInformant.class)
    public JAXBElement<COCTMT090000UV01AssignedEntity> createCOCTMT530000UVInformantAssignedEntity(COCTMT090000UV01AssignedEntity value) {
        return new JAXBElement<COCTMT090000UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, COCTMT090000UV01AssignedEntity.class, COCTMT530000UVInformant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRelatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedEntity", scope = COCTMT530000UVInformant.class)
    public JAXBElement<COCTMT530000UVRelatedEntity> createCOCTMT530000UVInformantRelatedEntity(COCTMT530000UVRelatedEntity value) {
        return new JAXBElement<COCTMT530000UVRelatedEntity>(_COCTMT530000UVRelatedEntityRelatedEntity_QNAME, COCTMT530000UVRelatedEntity.class, COCTMT530000UVInformant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patient", scope = COCTMT530000UVInformant.class)
    public JAXBElement<COCTMT050000UV01Patient> createCOCTMT530000UVInformantPatient(COCTMT050000UV01Patient value) {
        return new JAXBElement<COCTMT050000UV01Patient>(_COCTMT510000UV06Beneficiary2Patient_QNAME, COCTMT050000UV01Patient.class, COCTMT530000UVInformant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supply", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVSupply> createCOCTMT530000UVSourceOf3Supply(COCTMT530000UVSupply value) {
        return new JAXBElement<COCTMT530000UVSupply>(_COCTMT510000UV06DefinitionSupply_QNAME, COCTMT530000UVSupply.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "procedure", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVProcedure> createCOCTMT530000UVSourceOf3Procedure(COCTMT530000UVProcedure value) {
        return new JAXBElement<COCTMT530000UVProcedure>(_COCTMT510000UV06DefinitionProcedure_QNAME, COCTMT530000UVProcedure.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "encounter", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVEncounter> createCOCTMT530000UVSourceOf3Encounter(COCTMT530000UVEncounter value) {
        return new JAXBElement<COCTMT530000UVEncounter>(_COCTMT510000UV06DefinitionEncounter_QNAME, COCTMT530000UVEncounter.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "observation", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVObservation> createCOCTMT530000UVSourceOf3Observation(COCTMT530000UVObservation value) {
        return new JAXBElement<COCTMT530000UVObservation>(_COCTMT510000UV06DefinitionObservation_QNAME, COCTMT530000UVObservation.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "substanceAdministration", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVSubstanceAdministration> createCOCTMT530000UVSourceOf3SubstanceAdministration(COCTMT530000UVSubstanceAdministration value) {
        return new JAXBElement<COCTMT530000UVSubstanceAdministration>(_COCTMT510000UV06DefinitionSubstanceAdministration_QNAME, COCTMT530000UVSubstanceAdministration.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "organizer", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVOrganizer> createCOCTMT530000UVSourceOf3Organizer(COCTMT530000UVOrganizer value) {
        return new JAXBElement<COCTMT530000UVOrganizer>(_COCTMT510000UV06DefinitionOrganizer_QNAME, COCTMT530000UVOrganizer.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "act", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVAct> createCOCTMT530000UVSourceOf3Act(COCTMT530000UVAct value) {
        return new JAXBElement<COCTMT530000UVAct>(_COCTMT510000UV06DefinitionAct_QNAME, COCTMT530000UVAct.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Holder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "containerHolder", scope = COCTMT080000UV09SpecimenInContainer.class)
    public JAXBElement<COCTMT080000UV09Holder> createCOCTMT080000UV09SpecimenInContainerContainerHolder(COCTMT080000UV09Holder value) {
        return new JAXBElement<COCTMT080000UV09Holder>(_COCTMT080000UV09EntityInEntityContainerHolder_QNAME, COCTMT080000UV09Holder.class, COCTMT080000UV09SpecimenInContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09AdditiveMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "containerAdditiveMaterial", scope = COCTMT080000UV09SpecimenInContainer.class)
    public JAXBElement<COCTMT080000UV09AdditiveMaterial> createCOCTMT080000UV09SpecimenInContainerContainerAdditiveMaterial(COCTMT080000UV09AdditiveMaterial value) {
        return new JAXBElement<COCTMT080000UV09AdditiveMaterial>(_COCTMT080000UV09EntityInEntityContainerAdditiveMaterial_QNAME, COCTMT080000UV09AdditiveMaterial.class, COCTMT080000UV09SpecimenInContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Container }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "container", scope = COCTMT080000UV09SpecimenInContainer.class)
    public JAXBElement<COCTMT080000UV09Container> createCOCTMT080000UV09SpecimenInContainerContainer(COCTMT080000UV09Container value) {
        return new JAXBElement<COCTMT080000UV09Container>(_COCTMT080000UV09EntityInEntityContainer_QNAME, COCTMT080000UV09Container.class, COCTMT080000UV09SpecimenInContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocCMTitle.class)
    public JAXBElement<StrucDocSup> createStrucDocCMTitleSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocContentSup_QNAME, StrucDocSup.class, StrucDocCMTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocCMTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocCMTitle.class)
    public JAXBElement<StrucDocCMTitle> createStrucDocCMTitleContent(StrucDocCMTitle value) {
        return new JAXBElement<StrucDocCMTitle>(_StrucDocContentContent_QNAME, StrucDocCMTitle.class, StrucDocCMTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocCMTitle.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocCMTitleLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocContentLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocCMTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTitleFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocCMTitle.class)
    public JAXBElement<StrucDocTitleFootnote> createStrucDocCMTitleFootnote(StrucDocTitleFootnote value) {
        return new JAXBElement<StrucDocTitleFootnote>(_StrucDocContentFootnote_QNAME, StrucDocTitleFootnote.class, StrucDocCMTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocCMTitle.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocCMTitleFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocContentFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocCMTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocCMTitle.class)
    public JAXBElement<StrucDocSub> createStrucDocCMTitleSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocContentSub_QNAME, StrucDocSub.class, StrucDocCMTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocCMTitle.class)
    public JAXBElement<StrucDocBr> createStrucDocCMTitleBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocContentBr_QNAME, StrucDocBr.class, StrucDocCMTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306810UV01QueryByParameterPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameterPayload", scope = PRPMIN306050UV01QUQIMT021001UV01ControlActProcess.class)
    public JAXBElement<PRPMMT306810UV01QueryByParameterPayload> createPRPMIN306050UV01QUQIMT021001UV01ControlActProcessQueryByParameterPayload(PRPMMT306810UV01QueryByParameterPayload value) {
        return new JAXBElement<PRPMMT306810UV01QueryByParameterPayload>(_PRPMIN306010UV01QUQIMT021001UV01ControlActProcessQueryByParameterPayload_QNAME, PRPMMT306810UV01QueryByParameterPayload.class, PRPMIN306050UV01QUQIMT021001UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201307UV02QueryByParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameter", scope = PRPAIN201310UV02MFMIMT700711UV01ControlActProcess.class)
    public JAXBElement<PRPAMT201307UV02QueryByParameter> createPRPAIN201310UV02MFMIMT700711UV01ControlActProcessQueryByParameter(PRPAMT201307UV02QueryByParameter value) {
        return new JAXBElement<PRPAMT201307UV02QueryByParameter>(_PRPAIN201309UV02QUQIMT021001UV01ControlActProcessQueryByParameter_QNAME, PRPAMT201307UV02QueryByParameter.class, PRPAIN201310UV02MFMIMT700711UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000300UV01Agent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asAgent", scope = MCCIMT000300UV01Device.class)
    public JAXBElement<MCCIMT000300UV01Agent> createMCCIMT000300UV01DeviceAsAgent(MCCIMT000300UV01Agent value) {
        return new JAXBElement<MCCIMT000300UV01Agent>(_MCCIMT000200UV01DeviceAsAgent_QNAME, MCCIMT000300UV01Agent.class, MCCIMT000300UV01Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406110UV01Subject5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject", scope = PRPMMT406110UV01InformRequest.class)
    public JAXBElement<PRPMMT406110UV01Subject5> createPRPMMT406110UV01InformRequestSubject(PRPMMT406110UV01Subject5 value) {
        return new JAXBElement<PRPMMT406110UV01Subject5>(_PRPMMT306110UV01InformRequestSubject_QNAME, PRPMMT406110UV01Subject5 .class, PRPMMT406110UV01InformRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201306UV02QueryByParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameter", scope = PRPAIN201306UV02MFMIMT700711UV01ControlActProcess.class)
    public JAXBElement<PRPAMT201306UV02QueryByParameter> createPRPAIN201306UV02MFMIMT700711UV01ControlActProcessQueryByParameter(PRPAMT201306UV02QueryByParameter value) {
        return new JAXBElement<PRPAMT201306UV02QueryByParameter>(_PRPAIN201309UV02QUQIMT021001UV01ControlActProcessQueryByParameter_QNAME, PRPAMT201306UV02QueryByParameter.class, PRPAIN201306UV02MFMIMT700711UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT430000UV09LabTestKit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "labTestKit", scope = COCTMT080000UV09Consumable.class)
    public JAXBElement<COCTMT430000UV09LabTestKit> createCOCTMT080000UV09ConsumableLabTestKit(COCTMT430000UV09LabTestKit value) {
        return new JAXBElement<COCTMT430000UV09LabTestKit>(_COCTMT080000UV09ConsumableLabTestKit_QNAME, COCTMT430000UV09LabTestKit.class, COCTMT080000UV09Consumable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT250000UV03Reagent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "reagent", scope = COCTMT080000UV09Consumable.class)
    public JAXBElement<COCTMT250000UV03Reagent> createCOCTMT080000UV09ConsumableReagent(COCTMT250000UV03Reagent value) {
        return new JAXBElement<COCTMT250000UV03Reagent>(_COCTMT080000UV09ConsumableReagent_QNAME, COCTMT250000UV03Reagent.class, COCTMT080000UV09Consumable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT090100UV01RoleOther.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT090100UV01RoleOtherScopingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT090100UV01RoleOther.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09SourceOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "related", scope = COCTMT080000UV09SpecimenStub.class)
    public JAXBElement<COCTMT080000UV09SourceOf> createCOCTMT080000UV09SpecimenStubRelated(COCTMT080000UV09SourceOf value) {
        return new JAXBElement<COCTMT080000UV09SourceOf>(_COCTMT080000UV09SpecimenStubRelated_QNAME, COCTMT080000UV09SourceOf.class, COCTMT080000UV09SpecimenStub.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Natural }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sourceNatural", scope = COCTMT080000UV09Specimen.class)
    public JAXBElement<COCTMT080000UV09Natural> createCOCTMT080000UV09SpecimenSourceNatural(COCTMT080000UV09Natural value) {
        return new JAXBElement<COCTMT080000UV09Natural>(_COCTMT080000UV09SpecimenSourceNatural_QNAME, COCTMT080000UV09Natural.class, COCTMT080000UV09Specimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09ManufacturedMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sourceManufacturedMaterial", scope = COCTMT080000UV09Specimen.class)
    public JAXBElement<COCTMT080000UV09ManufacturedMaterial> createCOCTMT080000UV09SpecimenSourceManufacturedMaterial(COCTMT080000UV09ManufacturedMaterial value) {
        return new JAXBElement<COCTMT080000UV09ManufacturedMaterial>(_COCTMT080000UV09SpecimenSourceManufacturedMaterial_QNAME, COCTMT080000UV09ManufacturedMaterial.class, COCTMT080000UV09Specimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "productOf", scope = COCTMT080000UV09Specimen.class)
    public JAXBElement<COCTMT080000UV09Product> createCOCTMT080000UV09SpecimenProductOf(COCTMT080000UV09Product value) {
        return new JAXBElement<COCTMT080000UV09Product>(_COCTMT080000UV09SpecimenProductOf_QNAME, COCTMT080000UV09Product.class, COCTMT080000UV09Specimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Natural }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "specimenNatural", scope = COCTMT080000UV09Specimen.class)
    public JAXBElement<COCTMT080000UV09Natural> createCOCTMT080000UV09SpecimenSpecimenNatural(COCTMT080000UV09Natural value) {
        return new JAXBElement<COCTMT080000UV09Natural>(_COCTMT080000UV09SpecimenSpecimenNatural_QNAME, COCTMT080000UV09Natural.class, COCTMT080000UV09Specimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09ManufacturedMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "specimenManufacturedMaterial", scope = COCTMT080000UV09Specimen.class)
    public JAXBElement<COCTMT080000UV09ManufacturedMaterial> createCOCTMT080000UV09SpecimenSpecimenManufacturedMaterial(COCTMT080000UV09ManufacturedMaterial value) {
        return new JAXBElement<COCTMT080000UV09ManufacturedMaterial>(_COCTMT080000UV09SpecimenSpecimenManufacturedMaterial_QNAME, COCTMT080000UV09ManufacturedMaterial.class, COCTMT080000UV09Specimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09SourceOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "related", scope = COCTMT080000UV09Specimen.class)
    public JAXBElement<COCTMT080000UV09SourceOf> createCOCTMT080000UV09SpecimenRelated(COCTMT080000UV09SourceOf value) {
        return new JAXBElement<COCTMT080000UV09SourceOf>(_COCTMT080000UV09SpecimenStubRelated_QNAME, COCTMT080000UV09SourceOf.class, COCTMT080000UV09Specimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocSup> createStrucDocFootnoteSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocContentSup_QNAME, StrucDocSup.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocContent> createStrucDocFootnoteContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocContentContent_QNAME, StrucDocContent.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "table", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocTable> createStrucDocFootnoteTable(StrucDocTable value) {
        return new JAXBElement<StrucDocTable>(_StrucDocFootnoteTable_QNAME, StrucDocTable.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocFootnoteLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocContentLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "list", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocList> createStrucDocFootnoteList(StrucDocList value) {
        return new JAXBElement<StrucDocList>(_StrucDocFootnoteList_QNAME, StrucDocList.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocFootnote> createStrucDocFootnoteFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocContentFootnote_QNAME, StrucDocFootnote.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocFootnoteFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocContentFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocFootnoteRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocContentRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocSub> createStrucDocFootnoteSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocContentSub_QNAME, StrucDocSub.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocParagraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "paragraph", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocParagraph> createStrucDocFootnoteParagraph(StrucDocParagraph value) {
        return new JAXBElement<StrucDocParagraph>(_StrucDocFootnoteParagraph_QNAME, StrucDocParagraph.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocBr> createStrucDocFootnoteBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocContentBr_QNAME, StrucDocBr.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09EntityInEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asEntityInEntity", scope = COCTMT080000UV09Holder.class)
    public JAXBElement<COCTMT080000UV09EntityInEntity> createCOCTMT080000UV09HolderAsEntityInEntity(COCTMT080000UV09EntityInEntity value) {
        return new JAXBElement<COCTMT080000UV09EntityInEntity>(_COCTMT080000UV09ContainerAsEntityInEntity_QNAME, COCTMT080000UV09EntityInEntity.class, COCTMT080000UV09Holder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT080000UV09Holder.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT080000UV09HolderAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090000UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT080000UV09Holder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Birthplace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = PRPMMT301010UV01PrincipalPerson.class)
    public JAXBElement<PRPMMT301010UV01Birthplace> createPRPMMT301010UV01PrincipalPersonBirthplace(PRPMMT301010UV01Birthplace value) {
        return new JAXBElement<PRPMMT301010UV01Birthplace>(_COCTMT030202UV07BirthPlaceBirthplace_QNAME, PRPMMT301010UV01Birthplace.class, PRPMMT301010UV01PrincipalPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "partOrganization", scope = PRPMMT403010UV01OrganizationContains.class)
    public JAXBElement<PRPMMT403010UV01Organization> createPRPMMT403010UV01OrganizationContainsPartOrganization(PRPMMT403010UV01Organization value) {
        return new JAXBElement<PRPMMT403010UV01Organization>(_COCTMT150000UV02OrganizationContainsPartOrganization_QNAME, PRPMMT403010UV01Organization.class, PRPMMT403010UV01OrganizationContains.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = PRPMMT301010UV01ServiceDeliveryLocation.class)
    public JAXBElement<PRPMMT301010UV01Place> createPRPMMT301010UV01ServiceDeliveryLocationLocation(PRPMMT301010UV01Place value) {
        return new JAXBElement<PRPMMT301010UV01Place>(_COCTMT070000UV01LocatedEntityLocation_QNAME, PRPMMT301010UV01Place.class, PRPMMT301010UV01ServiceDeliveryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306910UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMIN306051UV01MFMIMT700711UV01Subject2 .class)
    public JAXBElement<PRPMMT306910UV01AssignedEntity> createPRPMIN306051UV01MFMIMT700711UV01Subject2AssignedEntity(PRPMMT306910UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT306910UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT306910UV01AssignedEntity.class, PRPMIN306051UV01MFMIMT700711UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = PRPAMT201302UV02ContactParty.class)
    public JAXBElement<COCTMT030207UV07Person> createPRPAMT201302UV02ContactPartyContactPerson(COCTMT030207UV07Person value) {
        return new JAXBElement<COCTMT030207UV07Person>(_COCTMT030007UVContactPartyContactPerson_QNAME, COCTMT030207UV07Person.class, PRPAMT201302UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = PRPAMT201302UV02ContactParty.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201302UV02ContactPartyContactOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_COCTMT030007UVContactPartyContactOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201302UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT670000UV04GuarantorOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guarantorOrganization", scope = COCTMT670000UV04GuarantorRole.class)
    public JAXBElement<COCTMT670000UV04GuarantorOrganization> createCOCTMT670000UV04GuarantorRoleGuarantorOrganization(COCTMT670000UV04GuarantorOrganization value) {
        return new JAXBElement<COCTMT670000UV04GuarantorOrganization>(_COCTMT670000UV04GuarantorRoleGuarantorOrganization_QNAME, COCTMT670000UV04GuarantorOrganization.class, COCTMT670000UV04GuarantorRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT670000UV04GuarantorPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guarantorPerson", scope = COCTMT670000UV04GuarantorRole.class)
    public JAXBElement<COCTMT670000UV04GuarantorPerson> createCOCTMT670000UV04GuarantorRoleGuarantorPerson(COCTMT670000UV04GuarantorPerson value) {
        return new JAXBElement<COCTMT670000UV04GuarantorPerson>(_COCTMT670000UV04GuarantorRoleGuarantorPerson_QNAME, COCTMT670000UV04GuarantorPerson.class, COCTMT670000UV04GuarantorRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT740000UV04Referrer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "referrer", scope = COCTMT740000UV04Referral.class)
    public JAXBElement<COCTMT740000UV04Referrer> createCOCTMT740000UV04ReferralReferrer(COCTMT740000UV04Referrer value) {
        return new JAXBElement<COCTMT740000UV04Referrer>(_COCTMT740000UV04ReferralReferrer_QNAME, COCTMT740000UV04Referrer.class, COCTMT740000UV04Referral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT960000UV05Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = COCTMT960000UV05Position.class)
    public JAXBElement<COCTMT960000UV05Author> createCOCTMT960000UV05PositionAuthor(COCTMT960000UV05Author value) {
        return new JAXBElement<COCTMT960000UV05Author>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, COCTMT960000UV05Author.class, COCTMT960000UV05Position.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT960000UV05Component2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "component2", scope = COCTMT960000UV05Position.class)
    public JAXBElement<COCTMT960000UV05Component2> createCOCTMT960000UV05PositionComponent2(COCTMT960000UV05Component2 value) {
        return new JAXBElement<COCTMT960000UV05Component2>(_COCTMT960000UV05PositionComponent2_QNAME, COCTMT960000UV05Component2 .class, COCTMT960000UV05Position.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201310UV02Subject2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = PRPAMT201310UV02BirthPlace.class)
    public JAXBElement<PRPAMT201310UV02Subject2> createPRPAMT201310UV02BirthPlaceSubjectOf(PRPAMT201310UV02Subject2 value) {
        return new JAXBElement<PRPAMT201310UV02Subject2>(_COCTMT530000UVSubstanceAdministrationSubjectOf_QNAME, PRPAMT201310UV02Subject2 .class, PRPAMT201310UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710007UV07Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = PRPAMT201310UV02BirthPlace.class)
    public JAXBElement<COCTMT710007UV07Place> createPRPAMT201310UV02BirthPlaceBirthplace(COCTMT710007UV07Place value) {
        return new JAXBElement<COCTMT710007UV07Place>(_COCTMT030202UV07BirthPlaceBirthplace_QNAME, COCTMT710007UV07Place.class, PRPAMT201310UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06ManufacturedProductOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturerManufacturedProductOrganization", scope = COCTMT290000UV06ManufacturedProduct.class)
    public JAXBElement<COCTMT290000UV06ManufacturedProductOrganization> createCOCTMT290000UV06ManufacturedProductManufacturerManufacturedProductOrganization(COCTMT290000UV06ManufacturedProductOrganization value) {
        return new JAXBElement<COCTMT290000UV06ManufacturedProductOrganization>(_COCTMT290000UV06ManufacturedProductManufacturerManufacturedProductOrganization_QNAME, COCTMT290000UV06ManufacturedProductOrganization.class, COCTMT290000UV06ManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06ManufacturedMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturedMaterial", scope = COCTMT290000UV06ManufacturedProduct.class)
    public JAXBElement<COCTMT290000UV06ManufacturedMaterial> createCOCTMT290000UV06ManufacturedProductManufacturedMaterial(COCTMT290000UV06ManufacturedMaterial value) {
        return new JAXBElement<COCTMT290000UV06ManufacturedMaterial>(_COCTMT530000UVManufacturedProductManufacturedMaterial_QNAME, COCTMT290000UV06ManufacturedMaterial.class, COCTMT290000UV06ManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000300UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = MCCIMT000300UV01LocatedEntity.class)
    public JAXBElement<MCCIMT000300UV01Place> createMCCIMT000300UV01LocatedEntityLocation(MCCIMT000300UV01Place value) {
        return new JAXBElement<MCCIMT000300UV01Place>(_COCTMT070000UV01LocatedEntityLocation_QNAME, MCCIMT000300UV01Place.class, MCCIMT000300UV01LocatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPMIN306011UV01MFMIMT700711UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700711UV01Author2> createPRPMIN306011UV01MFMIMT700711UV01RegistrationEventAuthor(MFMIMT700711UV01Author2 value) {
        return new JAXBElement<MFMIMT700711UV01Author2>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, MFMIMT700711UV01Author2 .class, PRPMIN306011UV01MFMIMT700711UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04ManufacturedProductOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturerManufacturedProductOrganization", scope = COCTMT490000UV04ManufacturedProduct.class)
    public JAXBElement<COCTMT490000UV04ManufacturedProductOrganization> createCOCTMT490000UV04ManufacturedProductManufacturerManufacturedProductOrganization(COCTMT490000UV04ManufacturedProductOrganization value) {
        return new JAXBElement<COCTMT490000UV04ManufacturedProductOrganization>(_COCTMT290000UV06ManufacturedProductManufacturerManufacturedProductOrganization_QNAME, COCTMT490000UV04ManufacturedProductOrganization.class, COCTMT490000UV04ManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710000UV07Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = COCTMT240000UV01ServiceDeliveryLocation.class)
    public JAXBElement<COCTMT710000UV07Place> createCOCTMT240000UV01ServiceDeliveryLocationLocation(COCTMT710000UV07Place value) {
        return new JAXBElement<COCTMT710000UV07Place>(_COCTMT070000UV01LocatedEntityLocation_QNAME, COCTMT710000UV07Place.class, COCTMT240000UV01ServiceDeliveryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "serviceProviderOrganization", scope = COCTMT240000UV01ServiceDeliveryLocation.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT240000UV01ServiceDeliveryLocationServiceProviderOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT240003UV02ServiceDeliveryLocationServiceProviderOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT240000UV01ServiceDeliveryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090300UV01AssignedDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = QUQIMT021001UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090300UV01AssignedDevice> createQUQIMT021001UV01AuthorOrPerformerAssignedDevice(COCTMT090300UV01AssignedDevice value) {
        return new JAXBElement<COCTMT090300UV01AssignedDevice>(_MFMIMT700701UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090300UV01AssignedDevice.class, QUQIMT021001UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090100UV01AssignedPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = QUQIMT021001UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090100UV01AssignedPerson> createQUQIMT021001UV01AuthorOrPerformerAssignedPerson(COCTMT090100UV01AssignedPerson value) {
        return new JAXBElement<COCTMT090100UV01AssignedPerson>(_MFMIMT700701UV01AuthorOrPerformerAssignedPerson_QNAME, COCTMT090100UV01AssignedPerson.class, QUQIMT021001UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01HealthCareProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProvider", scope = PRPMMT301010UV01RelatedTo.class)
    public JAXBElement<PRPMMT301010UV01HealthCareProvider> createPRPMMT301010UV01RelatedToHealthCareProvider(PRPMMT301010UV01HealthCareProvider value) {
        return new JAXBElement<PRPMMT301010UV01HealthCareProvider>(_PRPMIN303011UV01MFMIMT700721UV01Subject2HealthCareProvider_QNAME, PRPMMT301010UV01HealthCareProvider.class, PRPMMT301010UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMMT301010UV01RelatedTo.class)
    public JAXBElement<PRPMMT301010UV01AssignedEntity> createPRPMMT301010UV01RelatedToAssignedEntity(PRPMMT301010UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT301010UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT301010UV01AssignedEntity.class, PRPMMT301010UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01QualifiedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedEntity", scope = PRPMMT301010UV01RelatedTo.class)
    public JAXBElement<PRPMMT301010UV01QualifiedEntity> createPRPMMT301010UV01RelatedToQualifiedEntity(PRPMMT301010UV01QualifiedEntity value) {
        return new JAXBElement<PRPMMT301010UV01QualifiedEntity>(_PRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity_QNAME, PRPMMT301010UV01QualifiedEntity.class, PRPMMT301010UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04Reason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "reason", scope = COCTMT300000UV04SubstanceAdministrationOrder.class)
    public JAXBElement<COCTMT300000UV04Reason> createCOCTMT300000UV04SubstanceAdministrationOrderReason(COCTMT300000UV04Reason value) {
        return new JAXBElement<COCTMT300000UV04Reason>(_COCTMT300000UV04SubstanceAdministrationOrderReason_QNAME, COCTMT300000UV04Reason.class, COCTMT300000UV04SubstanceAdministrationOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04PertinentInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "pertinentInformation", scope = COCTMT300000UV04SubstanceAdministrationOrder.class)
    public JAXBElement<COCTMT300000UV04PertinentInformation> createCOCTMT300000UV04SubstanceAdministrationOrderPertinentInformation(COCTMT300000UV04PertinentInformation value) {
        return new JAXBElement<COCTMT300000UV04PertinentInformation>(_COCTMT300000UV04SubstanceAdministrationIntentPertinentInformation_QNAME, COCTMT300000UV04PertinentInformation.class, COCTMT300000UV04SubstanceAdministrationOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = COCTMT050000UV01ContactParty.class)
    public JAXBElement<COCTMT030207UV07Person> createCOCTMT050000UV01ContactPartyContactPerson(COCTMT030207UV07Person value) {
        return new JAXBElement<COCTMT030207UV07Person>(_COCTMT030007UVContactPartyContactPerson_QNAME, COCTMT030207UV07Person.class, COCTMT050000UV01ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = COCTMT050000UV01ContactParty.class)
    public JAXBElement<COCTMT150007UVOrganization> createCOCTMT050000UV01ContactPartyContactOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_COCTMT030007UVContactPartyContactOrganization_QNAME, COCTMT150007UVOrganization.class, COCTMT050000UV01ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01Subject5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject", scope = PRPMMT303010UV01InformRequest.class)
    public JAXBElement<PRPMMT303010UV01Subject5> createPRPMMT303010UV01InformRequestSubject(PRPMMT303010UV01Subject5 value) {
        return new JAXBElement<PRPMMT303010UV01Subject5>(_PRPMMT306110UV01InformRequestSubject_QNAME, PRPMMT303010UV01Subject5 .class, PRPMMT303010UV01InformRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "destination", scope = COCTMT600000UV06SupplyEvent.class)
    public JAXBElement<COCTMT600000UV06Destination> createCOCTMT600000UV06SupplyEventDestination(COCTMT600000UV06Destination value) {
        return new JAXBElement<COCTMT600000UV06Destination>(_COCTMT300000UV04SupplyEventDestination_QNAME, COCTMT600000UV06Destination.class, COCTMT600000UV06SupplyEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06Origin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "origin", scope = COCTMT600000UV06SupplyEvent.class)
    public JAXBElement<COCTMT600000UV06Origin> createCOCTMT600000UV06SupplyEventOrigin(COCTMT600000UV06Origin value) {
        return new JAXBElement<COCTMT600000UV06Origin>(_COCTMT300000UV04SupplyEventOrigin_QNAME, COCTMT600000UV06Origin.class, COCTMT600000UV06SupplyEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06Performer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "performer", scope = COCTMT600000UV06SupplyEvent.class)
    public JAXBElement<COCTMT600000UV06Performer> createCOCTMT600000UV06SupplyEventPerformer(COCTMT600000UV06Performer value) {
        return new JAXBElement<COCTMT600000UV06Performer>(_COCTMT300000UV04SubstitutionPerformer_QNAME, COCTMT600000UV06Performer.class, COCTMT600000UV06SupplyEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT260003UVOtherMedication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "otherMedication", scope = COCTMT260003UVSubject2 .class)
    public JAXBElement<COCTMT260003UVOtherMedication> createCOCTMT260003UVSubject2OtherMedication(COCTMT260003UVOtherMedication value) {
        return new JAXBElement<COCTMT260003UVOtherMedication>(_COCTMT260003UVSubject2OtherMedication_QNAME, COCTMT260003UVOtherMedication.class, COCTMT260003UVSubject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT260003UVOtherSupply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "otherSupply", scope = COCTMT260003UVSubject2 .class)
    public JAXBElement<COCTMT260003UVOtherSupply> createCOCTMT260003UVSubject2OtherSupply(COCTMT260003UVOtherSupply value) {
        return new JAXBElement<COCTMT260003UVOtherSupply>(_COCTMT260003UVSubject2OtherSupply_QNAME, COCTMT260003UVOtherSupply.class, COCTMT260003UVSubject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "issuingOrganization", scope = COCTMT090300UV01LicensedEntity.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT090300UV01LicensedEntityIssuingOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_PRPMMT309000UV01HealthCareProviderIssuingOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT090300UV01LicensedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406010UV01QueryByParameterPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameterPayload", scope = PRPMIN406110UV01MFMIMT700711UV01ControlActProcess.class)
    public JAXBElement<PRPMMT406010UV01QueryByParameterPayload> createPRPMIN406110UV01MFMIMT700711UV01ControlActProcessQueryByParameterPayload(PRPMMT406010UV01QueryByParameterPayload value) {
        return new JAXBElement<PRPMMT406010UV01QueryByParameterPayload>(_PRPMIN306010UV01QUQIMT021001UV01ControlActProcessQueryByParameterPayload_QNAME, PRPMMT406010UV01QueryByParameterPayload.class, PRPMIN406110UV01MFMIMT700711UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVOrganizer.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVOrganizerDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT080000UV09SpecimenCollectionProcessDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVOrganizer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVOrganizer.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVOrganizerSubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_COCTMT530000UVSubstanceAdministrationSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVOrganizer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVOrganizer.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVOrganizerDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVSubstanceAdministrationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVOrganizer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVOrganizer.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVOrganizerRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVSubstanceAdministrationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVOrganizer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "productOf", scope = COCTMT080000UV09DerivedSpecimen.class)
    public JAXBElement<COCTMT080000UV09Product> createCOCTMT080000UV09DerivedSpecimenProductOf(COCTMT080000UV09Product value) {
        return new JAXBElement<COCTMT080000UV09Product>(_COCTMT080000UV09SpecimenProductOf_QNAME, COCTMT080000UV09Product.class, COCTMT080000UV09DerivedSpecimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Natural }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "specimenNatural", scope = COCTMT080000UV09DerivedSpecimen.class)
    public JAXBElement<COCTMT080000UV09Natural> createCOCTMT080000UV09DerivedSpecimenSpecimenNatural(COCTMT080000UV09Natural value) {
        return new JAXBElement<COCTMT080000UV09Natural>(_COCTMT080000UV09SpecimenSpecimenNatural_QNAME, COCTMT080000UV09Natural.class, COCTMT080000UV09DerivedSpecimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09ManufacturedMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "specimenManufacturedMaterial", scope = COCTMT080000UV09DerivedSpecimen.class)
    public JAXBElement<COCTMT080000UV09ManufacturedMaterial> createCOCTMT080000UV09DerivedSpecimenSpecimenManufacturedMaterial(COCTMT080000UV09ManufacturedMaterial value) {
        return new JAXBElement<COCTMT080000UV09ManufacturedMaterial>(_COCTMT080000UV09SpecimenSpecimenManufacturedMaterial_QNAME, COCTMT080000UV09ManufacturedMaterial.class, COCTMT080000UV09DerivedSpecimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09SourceOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "related", scope = COCTMT080000UV09DerivedSpecimen.class)
    public JAXBElement<COCTMT080000UV09SourceOf> createCOCTMT080000UV09DerivedSpecimenRelated(COCTMT080000UV09SourceOf value) {
        return new JAXBElement<COCTMT080000UV09SourceOf>(_COCTMT080000UV09SpecimenStubRelated_QNAME, COCTMT080000UV09SourceOf.class, COCTMT080000UV09DerivedSpecimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturerOrganization", scope = COCTMT250000UV03Reagent.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT250000UV03ReagentManufacturerOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT530000UVManufacturedProductManufacturerOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT250000UV03Reagent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090003UV01Device }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = COCTMT090003UV01AssignedEntity.class)
    public JAXBElement<COCTMT090003UV01Device> createCOCTMT090003UV01AssignedEntityAssignedDevice(COCTMT090003UV01Device value) {
        return new JAXBElement<COCTMT090003UV01Device>(_MFMIMT700701UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090003UV01Device.class, COCTMT090003UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090003UV01AssignedEntity.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT090003UV01AssignedEntityRepresentedOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT090003UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090003UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedOrganization", scope = COCTMT090003UV01AssignedEntity.class)
    public JAXBElement<COCTMT090003UV01Organization> createCOCTMT090003UV01AssignedEntityAssignedOrganization(COCTMT090003UV01Organization value) {
        return new JAXBElement<COCTMT090003UV01Organization>(_COCTMT090000UV01AssignedEntityAssignedOrganization_QNAME, COCTMT090003UV01Organization.class, COCTMT090003UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090003UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT090003UV01AssignedEntity.class)
    public JAXBElement<COCTMT090003UV01Person> createCOCTMT090003UV01AssignedEntityAssignedPerson(COCTMT090003UV01Person value) {
        return new JAXBElement<COCTMT090003UV01Person>(_MFMIMT700701UV01AuthorOrPerformerAssignedPerson_QNAME, COCTMT090003UV01Person.class, COCTMT090003UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "wholeOrganization", scope = COCTMT150000UV02OrganizationPartOf.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT150000UV02OrganizationPartOfWholeOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_PRPMMT403010UV01OrganizationPartofWholeOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT150000UV02OrganizationPartOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = PRPMMT401010UV01AssignedEntity.class)
    public JAXBElement<PRPMMT401010UV01Organization> createPRPMMT401010UV01AssignedEntityRepresentedOrganization(PRPMMT401010UV01Organization value) {
        return new JAXBElement<PRPMMT401010UV01Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, PRPMMT401010UV01Organization.class, PRPMMT401010UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01Subject8 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf3", scope = PRPMMT401010UV01AssignedEntity.class)
    public JAXBElement<PRPMMT401010UV01Subject8> createPRPMMT401010UV01AssignedEntitySubjectOf3(PRPMMT401010UV01Subject8 value) {
        return new JAXBElement<PRPMMT401010UV01Subject8>(_PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME, PRPMMT401010UV01Subject8 .class, PRPMMT401010UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01PrincipalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPrincipalOrganization", scope = PRPMMT401010UV01AssignedEntity.class)
    public JAXBElement<PRPMMT401010UV01PrincipalOrganization> createPRPMMT401010UV01AssignedEntityAssignedPrincipalOrganization(PRPMMT401010UV01PrincipalOrganization value) {
        return new JAXBElement<PRPMMT401010UV01PrincipalOrganization>(_PRPMMT406110UV01AssignedEntityAssignedPrincipalOrganization_QNAME, PRPMMT401010UV01PrincipalOrganization.class, PRPMMT401010UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPrincipalPerson", scope = PRPMMT401010UV01AssignedEntity.class)
    public JAXBElement<PRPMMT401010UV01PrincipalPerson> createPRPMMT401010UV01AssignedEntityAssignedPrincipalPerson(PRPMMT401010UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT401010UV01PrincipalPerson>(_PRPMMT306910UV01AssignedEntityAssignedPrincipalPerson_QNAME, PRPMMT401010UV01PrincipalPerson.class, PRPMMT401010UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT409000UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMMT409000UV01RelatedTo.class)
    public JAXBElement<PRPMMT409000UV01AssignedEntity> createPRPMMT409000UV01RelatedToAssignedEntity(PRPMMT409000UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT409000UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT409000UV01AssignedEntity.class, PRPMMT409000UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201302UV02PatientPatientNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientNonPersonLivingSubject", scope = PRPAMT201302UV02Patient.class)
    public JAXBElement<PRPAMT201302UV02PatientPatientNonPersonLivingSubject> createPRPAMT201302UV02PatientPatientNonPersonLivingSubject(PRPAMT201302UV02PatientPatientNonPersonLivingSubject value) {
        return new JAXBElement<PRPAMT201302UV02PatientPatientNonPersonLivingSubject>(_PRPAMT201304UV02PatientPatientNonPersonLivingSubject_QNAME, PRPAMT201302UV02PatientPatientNonPersonLivingSubject.class, PRPAMT201302UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "providerOrganization", scope = PRPAMT201302UV02Patient.class)
    public JAXBElement<COCTMT150003UV03Organization> createPRPAMT201302UV02PatientProviderOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_PRPAMT201304UV02PatientProviderOrganization_QNAME, COCTMT150003UV03Organization.class, PRPAMT201302UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201302UV02PatientPatientPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientPerson", scope = PRPAMT201302UV02Patient.class)
    public JAXBElement<PRPAMT201302UV02PatientPatientPerson> createPRPAMT201302UV02PatientPatientPerson(PRPAMT201302UV02PatientPatientPerson value) {
        return new JAXBElement<PRPAMT201302UV02PatientPatientPerson>(_PRPAMT201304UV02PatientPatientPerson_QNAME, PRPAMT201302UV02PatientPatientPerson.class, PRPAMT201302UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06InjuryPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "locatedInjuryPlace", scope = COCTMT290000UV06InjuryLocation.class)
    public JAXBElement<COCTMT290000UV06InjuryPlace> createCOCTMT290000UV06InjuryLocationLocatedInjuryPlace(COCTMT290000UV06InjuryPlace value) {
        return new JAXBElement<COCTMT290000UV06InjuryPlace>(_COCTMT290000UV06InjuryLocationLocatedInjuryPlace_QNAME, COCTMT290000UV06InjuryPlace.class, COCTMT290000UV06InjuryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT310000UV04PertinentInformation1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "pertinentInformation1", scope = COCTMT310000UV04AccomodationSupplied.class)
    public JAXBElement<COCTMT310000UV04PertinentInformation1> createCOCTMT310000UV04AccomodationSuppliedPertinentInformation1(COCTMT310000UV04PertinentInformation1 value) {
        return new JAXBElement<COCTMT310000UV04PertinentInformation1>(_COCTMT310000UV04AccomodationSuppliedPertinentInformation1_QNAME, COCTMT310000UV04PertinentInformation1 .class, COCTMT310000UV04AccomodationSupplied.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT090000UV01Device.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT090000UV01DeviceAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090000UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT090000UV01Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = COCTMT050000UV01NonPersonLivingSubject.class)
    public JAXBElement<COCTMT050000UV01BirthPlace> createCOCTMT050000UV01NonPersonLivingSubjectBirthPlace(COCTMT050000UV01BirthPlace value) {
        return new JAXBElement<COCTMT050000UV01BirthPlace>(_PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME, COCTMT050000UV01BirthPlace.class, COCTMT050000UV01NonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030202UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianPerson", scope = COCTMT030007UVGuardian.class)
    public JAXBElement<COCTMT030202UV07Person> createCOCTMT030007UVGuardianGuardianPerson(COCTMT030202UV07Person value) {
        return new JAXBElement<COCTMT030202UV07Person>(_PRPAMT201303UV02GuardianGuardianPerson_QNAME, COCTMT030202UV07Person.class, COCTMT030007UVGuardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150002UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianOrganization", scope = COCTMT030007UVGuardian.class)
    public JAXBElement<COCTMT150002UV01Organization> createCOCTMT030007UVGuardianGuardianOrganization(COCTMT150002UV01Organization value) {
        return new JAXBElement<COCTMT150002UV01Organization>(_PRPAMT201303UV02GuardianGuardianOrganization_QNAME, COCTMT150002UV01Organization.class, COCTMT030007UVGuardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "ingredientSubstance", scope = COCTMT230100UVIngredient.class)
    public JAXBElement<COCTMT230100UVSubstance> createCOCTMT230100UVIngredientIngredientSubstance(COCTMT230100UVSubstance value) {
        return new JAXBElement<COCTMT230100UVSubstance>(_COCTMT230100UVSubIngredientIngredientSubstance_QNAME, COCTMT230100UVSubstance.class, COCTMT230100UVIngredient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09Specimen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "specimen", scope = COCTMT530000UVProduct2 .class)
    public JAXBElement<COCTMT080000UV09Specimen> createCOCTMT530000UVProduct2Specimen(COCTMT080000UV09Specimen value) {
        return new JAXBElement<COCTMT080000UV09Specimen>(_COCTMT530000UVSubject2Specimen_QNAME, COCTMT080000UV09Specimen.class, COCTMT530000UVProduct2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09DerivedSpecimen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "derivedSpecimen", scope = COCTMT530000UVProduct2 .class)
    public JAXBElement<COCTMT080000UV09DerivedSpecimen> createCOCTMT530000UVProduct2DerivedSpecimen(COCTMT080000UV09DerivedSpecimen value) {
        return new JAXBElement<COCTMT080000UV09DerivedSpecimen>(_COCTMT530000UVSubject2DerivedSpecimen_QNAME, COCTMT080000UV09DerivedSpecimen.class, COCTMT530000UVProduct2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocSup> createStrucDocTitleFootnoteSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocContentSup_QNAME, StrucDocSup.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocCMTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocCMTitle> createStrucDocTitleFootnoteContent(StrucDocCMTitle value) {
        return new JAXBElement<StrucDocCMTitle>(_StrucDocContentContent_QNAME, StrucDocCMTitle.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocTitleFootnoteLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocContentLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTitleFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocTitleFootnote> createStrucDocTitleFootnoteFootnote(StrucDocTitleFootnote value) {
        return new JAXBElement<StrucDocTitleFootnote>(_StrucDocContentFootnote_QNAME, StrucDocTitleFootnote.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocTitleFootnoteFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocContentFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocSub> createStrucDocTitleFootnoteSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocContentSub_QNAME, StrucDocSub.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocBr> createStrucDocTitleFootnoteBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocContentBr_QNAME, StrucDocBr.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090000UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = COCTMT530000UVAuthor.class)
    public JAXBElement<COCTMT090000UV01AssignedEntity> createCOCTMT530000UVAuthorAssignedEntity(COCTMT090000UV01AssignedEntity value) {
        return new JAXBElement<COCTMT090000UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, COCTMT090000UV01AssignedEntity.class, COCTMT530000UVAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRelatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedEntity", scope = COCTMT530000UVAuthor.class)
    public JAXBElement<COCTMT530000UVRelatedEntity> createCOCTMT530000UVAuthorRelatedEntity(COCTMT530000UVRelatedEntity value) {
        return new JAXBElement<COCTMT530000UVRelatedEntity>(_COCTMT530000UVRelatedEntityRelatedEntity_QNAME, COCTMT530000UVRelatedEntity.class, COCTMT530000UVAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patient", scope = COCTMT530000UVAuthor.class)
    public JAXBElement<COCTMT050000UV01Patient> createCOCTMT530000UVAuthorPatient(COCTMT050000UV01Patient value) {
        return new JAXBElement<COCTMT050000UV01Patient>(_COCTMT510000UV06Beneficiary2Patient_QNAME, COCTMT050000UV01Patient.class, COCTMT530000UVAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01Subject8 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf3", scope = PRPMMT303010UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT303010UV01Subject8> createPRPMMT303010UV01QualifiedEntitySubjectOf3(PRPMMT303010UV01Subject8 value) {
        return new JAXBElement<PRPMMT303010UV01Subject8>(_PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME, PRPMMT303010UV01Subject8 .class, PRPMMT303010UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedPrincipalPerson", scope = PRPMMT303010UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT303010UV01PrincipalPerson> createPRPMMT303010UV01QualifiedEntityQualifiedPrincipalPerson(PRPMMT303010UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT303010UV01PrincipalPerson>(_PRPMMT306110UV01QualifiedEntityQualifiedPrincipalPerson_QNAME, PRPMMT303010UV01PrincipalPerson.class, PRPMMT303010UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualificationGrantingOrganization", scope = PRPMMT303010UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT303010UV01Organization> createPRPMMT303010UV01QualifiedEntityQualificationGrantingOrganization(PRPMMT303010UV01Organization value) {
        return new JAXBElement<PRPMMT303010UV01Organization>(_PRPMMT306110UV01QualifiedEntityQualificationGrantingOrganization_QNAME, PRPMMT303010UV01Organization.class, PRPMMT303010UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT210000UV02Dillution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dillution", scope = COCTMT080000UV09ControlVariable.class)
    public JAXBElement<COCTMT210000UV02Dillution> createCOCTMT080000UV09ControlVariableDillution(COCTMT210000UV02Dillution value) {
        return new JAXBElement<COCTMT210000UV02Dillution>(_COCTMT080000UV09ControlVariableDillution_QNAME, COCTMT210000UV02Dillution.class, COCTMT080000UV09ControlVariable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT210000UV02ReflexPermission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "reflexPermission", scope = COCTMT080000UV09ControlVariable.class)
    public JAXBElement<COCTMT210000UV02ReflexPermission> createCOCTMT080000UV09ControlVariableReflexPermission(COCTMT210000UV02ReflexPermission value) {
        return new JAXBElement<COCTMT210000UV02ReflexPermission>(_COCTMT080000UV09ControlVariableReflexPermission_QNAME, COCTMT210000UV02ReflexPermission.class, COCTMT080000UV09ControlVariable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT210000UV02AutoRepeatPermission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "autoRepeatPermission", scope = COCTMT080000UV09ControlVariable.class)
    public JAXBElement<COCTMT210000UV02AutoRepeatPermission> createCOCTMT080000UV09ControlVariableAutoRepeatPermission(COCTMT210000UV02AutoRepeatPermission value) {
        return new JAXBElement<COCTMT210000UV02AutoRepeatPermission>(_COCTMT080000UV09ControlVariableAutoRepeatPermission_QNAME, COCTMT210000UV02AutoRepeatPermission.class, COCTMT080000UV09ControlVariable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT210000UV02EndogenousContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "endogenousContent", scope = COCTMT080000UV09ControlVariable.class)
    public JAXBElement<COCTMT210000UV02EndogenousContent> createCOCTMT080000UV09ControlVariableEndogenousContent(COCTMT210000UV02EndogenousContent value) {
        return new JAXBElement<COCTMT210000UV02EndogenousContent>(_COCTMT080000UV09ControlVariableEndogenousContent_QNAME, COCTMT210000UV02EndogenousContent.class, COCTMT080000UV09ControlVariable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMMT401010UV01RelatedTo.class)
    public JAXBElement<PRPMMT401010UV01AssignedEntity> createPRPMMT401010UV01RelatedToAssignedEntity(PRPMMT401010UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT401010UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT401010UV01AssignedEntity.class, PRPMMT401010UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01QualifiedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedEntity", scope = PRPMMT401010UV01RelatedTo.class)
    public JAXBElement<PRPMMT401010UV01QualifiedEntity> createPRPMMT401010UV01RelatedToQualifiedEntity(PRPMMT401010UV01QualifiedEntity value) {
        return new JAXBElement<PRPMMT401010UV01QualifiedEntity>(_PRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity_QNAME, PRPMMT401010UV01QualifiedEntity.class, PRPMMT401010UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianPerson", scope = PRPAMT201310UV02Guardian.class)
    public JAXBElement<COCTMT030207UV07Person> createPRPAMT201310UV02GuardianGuardianPerson(COCTMT030207UV07Person value) {
        return new JAXBElement<COCTMT030207UV07Person>(_PRPAMT201303UV02GuardianGuardianPerson_QNAME, COCTMT030207UV07Person.class, PRPAMT201310UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianOrganization", scope = PRPAMT201310UV02Guardian.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201310UV02GuardianGuardianOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201303UV02GuardianGuardianOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201310UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "personalRelationshipWith", scope = COCTMT510000UV06PersonalRelationship.class)
    public JAXBElement<COCTMT510000UV06Person> createCOCTMT510000UV06PersonalRelationshipPersonalRelationshipWith(COCTMT510000UV06Person value) {
        return new JAXBElement<COCTMT510000UV06Person>(_COCTMT510000UV06PersonalRelationshipPersonalRelationshipWith_QNAME, COCTMT510000UV06Person.class, COCTMT510000UV06PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder", scope = COCTMT510000UV06PersonalRelationship.class)
    public JAXBElement<COCTMT510000UV06Person> createCOCTMT510000UV06PersonalRelationshipRelationshipHolder(COCTMT510000UV06Person value) {
        return new JAXBElement<COCTMT510000UV06Person>(_COCTMT510000UV06PersonalRelationshipRelationshipHolder_QNAME, COCTMT510000UV06Person.class, COCTMT510000UV06PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090000UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = COCTMT530000UVPerformer.class)
    public JAXBElement<COCTMT090000UV01AssignedEntity> createCOCTMT530000UVPerformerAssignedEntity(COCTMT090000UV01AssignedEntity value) {
        return new JAXBElement<COCTMT090000UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, COCTMT090000UV01AssignedEntity.class, COCTMT530000UVPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRelatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedEntity", scope = COCTMT530000UVPerformer.class)
    public JAXBElement<COCTMT530000UVRelatedEntity> createCOCTMT530000UVPerformerRelatedEntity(COCTMT530000UVRelatedEntity value) {
        return new JAXBElement<COCTMT530000UVRelatedEntity>(_COCTMT530000UVRelatedEntityRelatedEntity_QNAME, COCTMT530000UVRelatedEntity.class, COCTMT530000UVPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patient", scope = COCTMT530000UVPerformer.class)
    public JAXBElement<COCTMT050000UV01Patient> createCOCTMT530000UVPerformerPatient(COCTMT050000UV01Patient value) {
        return new JAXBElement<COCTMT050000UV01Patient>(_COCTMT510000UV06Beneficiary2Patient_QNAME, COCTMT050000UV01Patient.class, COCTMT530000UVPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406110UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMMT406110UV01RelatedTo.class)
    public JAXBElement<PRPMMT406110UV01AssignedEntity> createPRPMMT406110UV01RelatedToAssignedEntity(PRPMMT406110UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT406110UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT406110UV01AssignedEntity.class, PRPMMT406110UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406110UV01QualifiedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedEntity", scope = PRPMMT406110UV01RelatedTo.class)
    public JAXBElement<PRPMMT406110UV01QualifiedEntity> createPRPMMT406110UV01RelatedToQualifiedEntity(PRPMMT406110UV01QualifiedEntity value) {
        return new JAXBElement<PRPMMT406110UV01QualifiedEntity>(_PRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity_QNAME, PRPMMT406110UV01QualifiedEntity.class, PRPMMT406110UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPAIN201308UV02MFMIMT700711UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700711UV01Author2> createPRPAIN201308UV02MFMIMT700711UV01RegistrationEventAuthor(MFMIMT700711UV01Author2 value) {
        return new JAXBElement<MFMIMT700711UV01Author2>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, MFMIMT700711UV01Author2 .class, PRPAIN201308UV02MFMIMT700711UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = PRPAMT201303UV02Student.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201303UV02StudentSchoolOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201304UV02StudentSchoolOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201303UV02Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201307UV02QueryByParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameter", scope = PRPAIN201308UV02MFMIMT700711UV01ControlActProcess.class)
    public JAXBElement<PRPAMT201307UV02QueryByParameter> createPRPAIN201308UV02MFMIMT700711UV01ControlActProcessQueryByParameter(PRPAMT201307UV02QueryByParameter value) {
        return new JAXBElement<PRPAMT201307UV02QueryByParameter>(_PRPAIN201309UV02QUQIMT021001UV01ControlActProcessQueryByParameter_QNAME, PRPAMT201307UV02QueryByParameter.class, PRPAIN201308UV02MFMIMT700711UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = PRPMMT403010UV01ContactPerson.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createPRPMMT403010UV01ContactPersonAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090000UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, PRPMMT403010UV01ContactPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "destination", scope = COCTMT490000UV04BillableClinicalProduct.class)
    public JAXBElement<COCTMT490000UV04Destination> createCOCTMT490000UV04BillableClinicalProductDestination(COCTMT490000UV04Destination value) {
        return new JAXBElement<COCTMT490000UV04Destination>(_COCTMT300000UV04SupplyEventDestination_QNAME, COCTMT490000UV04Destination.class, COCTMT490000UV04BillableClinicalProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04Origin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "origin", scope = COCTMT490000UV04BillableClinicalProduct.class)
    public JAXBElement<COCTMT490000UV04Origin> createCOCTMT490000UV04BillableClinicalProductOrigin(COCTMT490000UV04Origin value) {
        return new JAXBElement<COCTMT490000UV04Origin>(_COCTMT300000UV04SupplyEventOrigin_QNAME, COCTMT490000UV04Origin.class, COCTMT490000UV04BillableClinicalProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04Consultant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "consultant", scope = COCTMT490000UV04BillableClinicalProduct.class)
    public JAXBElement<COCTMT490000UV04Consultant> createCOCTMT490000UV04BillableClinicalProductConsultant(COCTMT490000UV04Consultant value) {
        return new JAXBElement<COCTMT490000UV04Consultant>(_COCTMT490000UV04BillableClinicalProductConsultant_QNAME, COCTMT490000UV04Consultant.class, COCTMT490000UV04BillableClinicalProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04Referrer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "referrer", scope = COCTMT490000UV04BillableClinicalProduct.class)
    public JAXBElement<COCTMT490000UV04Referrer> createCOCTMT490000UV04BillableClinicalProductReferrer(COCTMT490000UV04Referrer value) {
        return new JAXBElement<COCTMT490000UV04Referrer>(_COCTMT740000UV04ReferralReferrer_QNAME, COCTMT490000UV04Referrer.class, COCTMT490000UV04BillableClinicalProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVBirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = COCTMT030007UVPerson.class)
    public JAXBElement<COCTMT030007UVBirthPlace> createCOCTMT030007UVPersonBirthPlace(COCTMT030007UVBirthPlace value) {
        return new JAXBElement<COCTMT030007UVBirthPlace>(_PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME, COCTMT030007UVBirthPlace.class, COCTMT030007UVPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000100UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = MCCIMT000100UV01Agent.class)
    public JAXBElement<MCCIMT000100UV01Organization> createMCCIMT000100UV01AgentRepresentedOrganization(MCCIMT000100UV01Organization value) {
        return new JAXBElement<MCCIMT000100UV01Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, MCCIMT000100UV01Organization.class, MCCIMT000100UV01Agent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201302UV02Subject2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = PRPAMT201302UV02BirthPlace.class)
    public JAXBElement<PRPAMT201302UV02Subject2> createPRPAMT201302UV02BirthPlaceSubjectOf(PRPAMT201302UV02Subject2 value) {
        return new JAXBElement<PRPAMT201302UV02Subject2>(_COCTMT530000UVSubstanceAdministrationSubjectOf_QNAME, PRPAMT201302UV02Subject2 .class, PRPAMT201302UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710007UV07Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = PRPAMT201302UV02BirthPlace.class)
    public JAXBElement<COCTMT710007UV07Place> createPRPAMT201302UV02BirthPlaceBirthplace(COCTMT710007UV07Place value) {
        return new JAXBElement<COCTMT710007UV07Place>(_COCTMT030202UV07BirthPlaceBirthplace_QNAME, COCTMT710007UV07Place.class, PRPAMT201302UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06ProviderPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProviderPerson", scope = COCTMT290000UV06HealthCareProvider.class)
    public JAXBElement<COCTMT290000UV06ProviderPerson> createCOCTMT290000UV06HealthCareProviderHealthCareProviderPerson(COCTMT290000UV06ProviderPerson value) {
        return new JAXBElement<COCTMT290000UV06ProviderPerson>(_COCTMT600000UV06HealthCareProviderHealthCareProviderPerson_QNAME, COCTMT290000UV06ProviderPerson.class, COCTMT290000UV06HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Jurisdiction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "territory", scope = PRPMMT403010UV01TerritorialAuthority.class)
    public JAXBElement<PRPMMT403010UV01Jurisdiction> createPRPMMT403010UV01TerritorialAuthorityTerritory(PRPMMT403010UV01Jurisdiction value) {
        return new JAXBElement<PRPMMT403010UV01Jurisdiction>(_PRPMMT309000UV01TerritorialAuthorityTerritory_QNAME, PRPMMT403010UV01Jurisdiction.class, PRPMMT403010UV01TerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01HealthCareProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProvider", scope = PRPMIN303010UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT303010UV01HealthCareProvider> createPRPMIN303010UV01MFMIMT700721UV01Subject2HealthCareProvider(PRPMMT303010UV01HealthCareProvider value) {
        return new JAXBElement<PRPMMT303010UV01HealthCareProvider>(_PRPMIN303011UV01MFMIMT700721UV01Subject2HealthCareProvider_QNAME, PRPMMT303010UV01HealthCareProvider.class, PRPMIN303010UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMIN303010UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT303010UV01AssignedEntity> createPRPMIN303010UV01MFMIMT700721UV01Subject2AssignedEntity(PRPMMT303010UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT303010UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT303010UV01AssignedEntity.class, PRPMIN303010UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01QualifiedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedEntity", scope = PRPMIN303010UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT303010UV01QualifiedEntity> createPRPMIN303010UV01MFMIMT700721UV01Subject2QualifiedEntity(PRPMMT303010UV01QualifiedEntity value) {
        return new JAXBElement<PRPMMT303010UV01QualifiedEntity>(_PRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity_QNAME, PRPMMT303010UV01QualifiedEntity.class, PRPMIN303010UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVManufacturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedManufacturer", scope = COCTMT230100UVRelatedManufacturer.class)
    public JAXBElement<COCTMT230100UVManufacturer> createCOCTMT230100UVRelatedManufacturerRepresentedManufacturer(COCTMT230100UVManufacturer value) {
        return new JAXBElement<COCTMT230100UVManufacturer>(_COCTMT230100UVRelatedManufacturerRepresentedManufacturer_QNAME, COCTMT230100UVManufacturer.class, COCTMT230100UVRelatedManufacturer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVBirthplace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = COCTMT530000UVAnimal.class)
    public JAXBElement<COCTMT530000UVBirthplace> createCOCTMT530000UVAnimalBirthplace(COCTMT530000UVBirthplace value) {
        return new JAXBElement<COCTMT530000UVBirthplace>(_COCTMT030202UV07BirthPlaceBirthplace_QNAME, COCTMT530000UVBirthplace.class, COCTMT530000UVAnimal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT740000UV04ProviderPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProviderPerson", scope = COCTMT740000UV04HealthCareProvider.class)
    public JAXBElement<COCTMT740000UV04ProviderPerson> createCOCTMT740000UV04HealthCareProviderHealthCareProviderPerson(COCTMT740000UV04ProviderPerson value) {
        return new JAXBElement<COCTMT740000UV04ProviderPerson>(_COCTMT600000UV06HealthCareProviderHealthCareProviderPerson_QNAME, COCTMT740000UV04ProviderPerson.class, COCTMT740000UV04HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "affiliatedPrincipalPerson", scope = PRPMMT306110UV01Affiliate.class)
    public JAXBElement<PRPMMT306110UV01PrincipalPerson> createPRPMMT306110UV01AffiliateAffiliatedPrincipalPerson(PRPMMT306110UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT306110UV01PrincipalPerson>(_PRPMMT303010UV01AffiliateAffiliatedPrincipalPerson_QNAME, PRPMMT306110UV01PrincipalPerson.class, PRPMMT306110UV01Affiliate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01PrincipalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "affiliatedPrincipalOrganization", scope = PRPMMT306110UV01Affiliate.class)
    public JAXBElement<PRPMMT306110UV01PrincipalOrganization> createPRPMMT306110UV01AffiliateAffiliatedPrincipalOrganization(PRPMMT306110UV01PrincipalOrganization value) {
        return new JAXBElement<PRPMMT306110UV01PrincipalOrganization>(_PRPMMT303010UV01AffiliateAffiliatedPrincipalOrganization_QNAME, PRPMMT306110UV01PrincipalOrganization.class, PRPMMT306110UV01Affiliate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01NonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientNonPersonLivingSubject", scope = COCTMT050000UV01Patient.class)
    public JAXBElement<COCTMT050000UV01NonPersonLivingSubject> createCOCTMT050000UV01PatientPatientNonPersonLivingSubject(COCTMT050000UV01NonPersonLivingSubject value) {
        return new JAXBElement<COCTMT050000UV01NonPersonLivingSubject>(_PRPAMT201304UV02PatientPatientNonPersonLivingSubject_QNAME, COCTMT050000UV01NonPersonLivingSubject.class, COCTMT050000UV01Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "providerOrganization", scope = COCTMT050000UV01Patient.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT050000UV01PatientProviderOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_PRPAMT201304UV02PatientProviderOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT050000UV01Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientPerson", scope = COCTMT050000UV01Patient.class)
    public JAXBElement<COCTMT050000UV01Person> createCOCTMT050000UV01PatientPatientPerson(COCTMT050000UV01Person value) {
        return new JAXBElement<COCTMT050000UV01Person>(_PRPAMT201304UV02PatientPatientPerson_QNAME, COCTMT050000UV01Person.class, COCTMT050000UV01Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UV09ActReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "actReference", scope = COCTMT080000UV09Subject3 .class)
    public JAXBElement<COCTMT080000UV09ActReference> createCOCTMT080000UV09Subject3ActReference(COCTMT080000UV09ActReference value) {
        return new JAXBElement<COCTMT080000UV09ActReference>(_COCTMT510000UV06DefinitionActReference_QNAME, COCTMT080000UV09ActReference.class, COCTMT080000UV09Subject3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT590000UVAnnotation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "annotation", scope = COCTMT080000UV09Subject3 .class)
    public JAXBElement<COCTMT590000UVAnnotation> createCOCTMT080000UV09Subject3Annotation(COCTMT590000UVAnnotation value) {
        return new JAXBElement<COCTMT590000UVAnnotation>(_COCTMT080000UV09Subject3Annotation_QNAME, COCTMT590000UVAnnotation.class, COCTMT080000UV09Subject3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT401010UV01Jurisdiction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "territory", scope = PRPMMT401010UV01TerritorialAuthority.class)
    public JAXBElement<PRPMMT401010UV01Jurisdiction> createPRPMMT401010UV01TerritorialAuthorityTerritory(PRPMMT401010UV01Jurisdiction value) {
        return new JAXBElement<PRPMMT401010UV01Jurisdiction>(_PRPMMT309000UV01TerritorialAuthorityTerritory_QNAME, PRPMMT401010UV01Jurisdiction.class, PRPMMT401010UV01TerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201306UV02MatchCriterionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "matchCriterionList", scope = PRPAMT201306UV02QueryByParameter.class)
    public JAXBElement<PRPAMT201306UV02MatchCriterionList> createPRPAMT201306UV02QueryByParameterMatchCriterionList(PRPAMT201306UV02MatchCriterionList value) {
        return new JAXBElement<PRPAMT201306UV02MatchCriterionList>(_PRPAMT201306UV02QueryByParameterMatchCriterionList_QNAME, PRPAMT201306UV02MatchCriterionList.class, PRPAMT201306UV02QueryByParameter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT406110UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = PRPMMT406110UV01ServiceDeliveryLocation.class)
    public JAXBElement<PRPMMT406110UV01Place> createPRPMMT406110UV01ServiceDeliveryLocationLocation(PRPMMT406110UV01Place value) {
        return new JAXBElement<PRPMMT406110UV01Place>(_COCTMT070000UV01LocatedEntityLocation_QNAME, PRPMMT406110UV01Place.class, PRPMMT406110UV01ServiceDeliveryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201303UV02NonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientNonPersonLivingSubject", scope = PRPAMT201303UV02Patient.class)
    public JAXBElement<PRPAMT201303UV02NonPersonLivingSubject> createPRPAMT201303UV02PatientPatientNonPersonLivingSubject(PRPAMT201303UV02NonPersonLivingSubject value) {
        return new JAXBElement<PRPAMT201303UV02NonPersonLivingSubject>(_PRPAMT201304UV02PatientPatientNonPersonLivingSubject_QNAME, PRPAMT201303UV02NonPersonLivingSubject.class, PRPAMT201303UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "providerOrganization", scope = PRPAMT201303UV02Patient.class)
    public JAXBElement<COCTMT150003UV03Organization> createPRPAMT201303UV02PatientProviderOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_PRPAMT201304UV02PatientProviderOrganization_QNAME, COCTMT150003UV03Organization.class, PRPAMT201303UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201303UV02Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientPerson", scope = PRPAMT201303UV02Patient.class)
    public JAXBElement<PRPAMT201303UV02Person> createPRPAMT201303UV02PatientPatientPerson(PRPAMT201303UV02Person value) {
        return new JAXBElement<PRPAMT201303UV02Person>(_PRPAMT201304UV02PatientPatientPerson_QNAME, PRPAMT201303UV02Person.class, PRPAMT201303UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT260003UVAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = COCTMT260003UVManagement.class)
    public JAXBElement<COCTMT260003UVAuthor> createCOCTMT260003UVManagementAuthor(COCTMT260003UVAuthor value) {
        return new JAXBElement<COCTMT260003UVAuthor>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, COCTMT260003UVAuthor.class, COCTMT260003UVManagement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = SDTEXT.class)
    public JAXBElement<StrucDocSup> createSDTEXTSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocContentSup_QNAME, StrucDocSup.class, SDTEXT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = SDTEXT.class)
    public JAXBElement<StrucDocContent> createSDTEXTContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocContentContent_QNAME, StrucDocContent.class, SDTEXT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "table", scope = SDTEXT.class)
    public JAXBElement<StrucDocTable> createSDTEXTTable(StrucDocTable value) {
        return new JAXBElement<StrucDocTable>(_StrucDocFootnoteTable_QNAME, StrucDocTable.class, SDTEXT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = SDTEXT.class)
    public JAXBElement<StrucDocLinkHtml> createSDTEXTLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocContentLinkHtml_QNAME, StrucDocLinkHtml.class, SDTEXT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "list", scope = SDTEXT.class)
    public JAXBElement<StrucDocList> createSDTEXTList(StrucDocList value) {
        return new JAXBElement<StrucDocList>(_StrucDocFootnoteList_QNAME, StrucDocList.class, SDTEXT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = SDTEXT.class)
    public JAXBElement<StrucDocFootnote> createSDTEXTFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocContentFootnote_QNAME, StrucDocFootnote.class, SDTEXT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = SDTEXT.class)
    public JAXBElement<StrucDocFootnoteRef> createSDTEXTFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocContentFootnoteRef_QNAME, StrucDocFootnoteRef.class, SDTEXT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = SDTEXT.class)
    public JAXBElement<StrucDocRenderMultiMedia> createSDTEXTRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocContentRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, SDTEXT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = SDTEXT.class)
    public JAXBElement<StrucDocSub> createSDTEXTSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocContentSub_QNAME, StrucDocSub.class, SDTEXT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocParagraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "paragraph", scope = SDTEXT.class)
    public JAXBElement<StrucDocParagraph> createSDTEXTParagraph(StrucDocParagraph value) {
        return new JAXBElement<StrucDocParagraph>(_StrucDocFootnoteParagraph_QNAME, StrucDocParagraph.class, SDTEXT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = SDTEXT.class)
    public JAXBElement<StrucDocBr> createSDTEXTBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocContentBr_QNAME, StrucDocBr.class, SDTEXT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04ProviderPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProviderPerson", scope = COCTMT490000UV04HealthCareProvider.class)
    public JAXBElement<COCTMT490000UV04ProviderPerson> createCOCTMT490000UV04HealthCareProviderHealthCareProviderPerson(COCTMT490000UV04ProviderPerson value) {
        return new JAXBElement<COCTMT490000UV04ProviderPerson>(_COCTMT600000UV06HealthCareProviderHealthCareProviderPerson_QNAME, COCTMT490000UV04ProviderPerson.class, COCTMT490000UV04HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700701UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPAIN201312UV02MFMIMT700701UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700701UV01Author2> createPRPAIN201312UV02MFMIMT700701UV01RegistrationEventAuthor(MFMIMT700701UV01Author2 value) {
        return new JAXBElement<MFMIMT700701UV01Author2>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, MFMIMT700701UV01Author2 .class, PRPAIN201312UV02MFMIMT700701UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = PRPMMT403010UV01AssignedEntity.class)
    public JAXBElement<PRPMMT403010UV01Organization> createPRPMMT403010UV01AssignedEntityRepresentedOrganization(PRPMMT403010UV01Organization value) {
        return new JAXBElement<PRPMMT403010UV01Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, PRPMMT403010UV01Organization.class, PRPMMT403010UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Subject8 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf3", scope = PRPMMT403010UV01AssignedEntity.class)
    public JAXBElement<PRPMMT403010UV01Subject8> createPRPMMT403010UV01AssignedEntitySubjectOf3(PRPMMT403010UV01Subject8 value) {
        return new JAXBElement<PRPMMT403010UV01Subject8>(_PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME, PRPMMT403010UV01Subject8 .class, PRPMMT403010UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01PrincipalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPrincipalOrganization", scope = PRPMMT403010UV01AssignedEntity.class)
    public JAXBElement<PRPMMT403010UV01PrincipalOrganization> createPRPMMT403010UV01AssignedEntityAssignedPrincipalOrganization(PRPMMT403010UV01PrincipalOrganization value) {
        return new JAXBElement<PRPMMT403010UV01PrincipalOrganization>(_PRPMMT406110UV01AssignedEntityAssignedPrincipalOrganization_QNAME, PRPMMT403010UV01PrincipalOrganization.class, PRPMMT403010UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000100UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = MCCIMT000100UV01LocatedEntity.class)
    public JAXBElement<MCCIMT000100UV01Place> createMCCIMT000100UV01LocatedEntityLocation(MCCIMT000100UV01Place value) {
        return new JAXBElement<MCCIMT000100UV01Place>(_COCTMT070000UV01LocatedEntityLocation_QNAME, MCCIMT000100UV01Place.class, MCCIMT000100UV01LocatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "issuingOrganization", scope = PRPMMT403010UV01LicensedEntity.class)
    public JAXBElement<PRPMMT403010UV01Organization> createPRPMMT403010UV01LicensedEntityIssuingOrganization(PRPMMT403010UV01Organization value) {
        return new JAXBElement<PRPMMT403010UV01Organization>(_PRPMMT309000UV01HealthCareProviderIssuingOrganization_QNAME, PRPMMT403010UV01Organization.class, PRPMMT403010UV01LicensedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Subject8 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf3", scope = PRPMMT403010UV01LicensedEntity.class)
    public JAXBElement<PRPMMT403010UV01Subject8> createPRPMMT403010UV01LicensedEntitySubjectOf3(PRPMMT403010UV01Subject8 value) {
        return new JAXBElement<PRPMMT403010UV01Subject8>(_PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME, PRPMMT403010UV01Subject8 .class, PRPMMT403010UV01LicensedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT040008UVResponsible.class)
    public JAXBElement<COCTMT150007UVOrganization> createCOCTMT040008UVResponsibleRepresentedOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, COCTMT150007UVOrganization.class, COCTMT040008UVResponsible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "agentPerson", scope = COCTMT040008UVResponsible.class)
    public JAXBElement<COCTMT030207UV07Person> createCOCTMT040008UVResponsibleAgentPerson(COCTMT030207UV07Person value) {
        return new JAXBElement<COCTMT030207UV07Person>(_COCTMT510000UV06ResponsiblePartyAgentPerson_QNAME, COCTMT030207UV07Person.class, COCTMT040008UVResponsible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT140007UVDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "agentDevice", scope = COCTMT040008UVResponsible.class)
    public JAXBElement<COCTMT140007UVDevice> createCOCTMT040008UVResponsibleAgentDevice(COCTMT140007UVDevice value) {
        return new JAXBElement<COCTMT140007UVDevice>(_COCTMT040008UVResponsibleAgentDevice_QNAME, COCTMT140007UVDevice.class, COCTMT040008UVResponsible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "agentOrganization", scope = COCTMT040008UVResponsible.class)
    public JAXBElement<COCTMT150007UVOrganization> createCOCTMT040008UVResponsibleAgentOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_COCTMT040008UVResponsibleAgentOrganization_QNAME, COCTMT150007UVOrganization.class, COCTMT040008UVResponsible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedPerson", scope = COCTMT040008UVResponsible.class)
    public JAXBElement<COCTMT030207UV07Person> createCOCTMT040008UVResponsibleRepresentedPerson(COCTMT030207UV07Person value) {
        return new JAXBElement<COCTMT030207UV07Person>(_COCTMT510000UV06ResponsiblePartyRepresentedPerson_QNAME, COCTMT030207UV07Person.class, COCTMT040008UVResponsible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supply", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVSupply> createCOCTMT530000UVSourceOf2Supply(COCTMT530000UVSupply value) {
        return new JAXBElement<COCTMT530000UVSupply>(_COCTMT510000UV06DefinitionSupply_QNAME, COCTMT530000UVSupply.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "procedure", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVProcedure> createCOCTMT530000UVSourceOf2Procedure(COCTMT530000UVProcedure value) {
        return new JAXBElement<COCTMT530000UVProcedure>(_COCTMT510000UV06DefinitionProcedure_QNAME, COCTMT530000UVProcedure.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "encounter", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVEncounter> createCOCTMT530000UVSourceOf2Encounter(COCTMT530000UVEncounter value) {
        return new JAXBElement<COCTMT530000UVEncounter>(_COCTMT510000UV06DefinitionEncounter_QNAME, COCTMT530000UVEncounter.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "observation", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVObservation> createCOCTMT530000UVSourceOf2Observation(COCTMT530000UVObservation value) {
        return new JAXBElement<COCTMT530000UVObservation>(_COCTMT510000UV06DefinitionObservation_QNAME, COCTMT530000UVObservation.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "substanceAdministration", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVSubstanceAdministration> createCOCTMT530000UVSourceOf2SubstanceAdministration(COCTMT530000UVSubstanceAdministration value) {
        return new JAXBElement<COCTMT530000UVSubstanceAdministration>(_COCTMT510000UV06DefinitionSubstanceAdministration_QNAME, COCTMT530000UVSubstanceAdministration.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "organizer", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVOrganizer> createCOCTMT530000UVSourceOf2Organizer(COCTMT530000UVOrganizer value) {
        return new JAXBElement<COCTMT530000UVOrganizer>(_COCTMT510000UV06DefinitionOrganizer_QNAME, COCTMT530000UVOrganizer.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "act", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVAct> createCOCTMT530000UVSourceOf2Act(COCTMT530000UVAct value) {
        return new JAXBElement<COCTMT530000UVAct>(_COCTMT510000UV06DefinitionAct_QNAME, COCTMT530000UVAct.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090002UV01Device }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = COCTMT090002UV01AssignedEntity.class)
    public JAXBElement<COCTMT090002UV01Device> createCOCTMT090002UV01AssignedEntityAssignedDevice(COCTMT090002UV01Device value) {
        return new JAXBElement<COCTMT090002UV01Device>(_MFMIMT700701UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090002UV01Device.class, COCTMT090002UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090002UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedOrganization", scope = COCTMT090002UV01AssignedEntity.class)
    public JAXBElement<COCTMT090002UV01Organization> createCOCTMT090002UV01AssignedEntityAssignedOrganization(COCTMT090002UV01Organization value) {
        return new JAXBElement<COCTMT090002UV01Organization>(_COCTMT090000UV01AssignedEntityAssignedOrganization_QNAME, COCTMT090002UV01Organization.class, COCTMT090002UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090002UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT090002UV01AssignedEntity.class)
    public JAXBElement<COCTMT090002UV01Person> createCOCTMT090002UV01AssignedEntityAssignedPerson(COCTMT090002UV01Person value) {
        return new JAXBElement<COCTMT090002UV01Person>(_MFMIMT700701UV01AuthorOrPerformerAssignedPerson_QNAME, COCTMT090002UV01Person.class, COCTMT090002UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201307UV02QueryByParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameter", scope = PRPAIN201307UV02QUQIMT021001UV01ControlActProcess.class)
    public JAXBElement<PRPAMT201307UV02QueryByParameter> createPRPAIN201307UV02QUQIMT021001UV01ControlActProcessQueryByParameter(PRPAMT201307UV02QueryByParameter value) {
        return new JAXBElement<PRPAMT201307UV02QueryByParameter>(_PRPAIN201309UV02QUQIMT021001UV01ControlActProcessQueryByParameter_QNAME, PRPAMT201307UV02QueryByParameter.class, PRPAIN201307UV02QUQIMT021001UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT309000UV01Birthplace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = PRPMMT309000UV01PrincipalPerson.class)
    public JAXBElement<PRPMMT309000UV01Birthplace> createPRPMMT309000UV01PrincipalPersonBirthplace(PRPMMT309000UV01Birthplace value) {
        return new JAXBElement<PRPMMT309000UV01Birthplace>(_COCTMT030202UV07BirthPlaceBirthplace_QNAME, PRPMMT309000UV01Birthplace.class, PRPMMT309000UV01PrincipalPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01ContactPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = PRPMMT403010UV01ContactParty.class)
    public JAXBElement<PRPMMT403010UV01ContactPerson> createPRPMMT403010UV01ContactPartyContactPerson(PRPMMT403010UV01ContactPerson value) {
        return new JAXBElement<PRPMMT403010UV01ContactPerson>(_COCTMT030007UVContactPartyContactPerson_QNAME, PRPMMT403010UV01ContactPerson.class, PRPMMT403010UV01ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700721UV01Subject4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject2", scope = MFMIMT700721UV01PriorRegistration.class)
    public JAXBElement<MFMIMT700721UV01Subject4> createMFMIMT700721UV01PriorRegistrationSubject2(MFMIMT700721UV01Subject4 value) {
        return new JAXBElement<MFMIMT700721UV01Subject4>(_MFMIMT700711UV01PriorRegistrationSubject2_QNAME, MFMIMT700721UV01Subject4 .class, MFMIMT700721UV01PriorRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700721UV01Subject3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject1", scope = MFMIMT700721UV01PriorRegistration.class)
    public JAXBElement<MFMIMT700721UV01Subject3> createMFMIMT700721UV01PriorRegistrationSubject1(MFMIMT700721UV01Subject3 value) {
        return new JAXBElement<MFMIMT700721UV01Subject3>(_MFMIMT700711UV01PriorRegistrationSubject1_QNAME, MFMIMT700721UV01Subject3 .class, MFMIMT700721UV01PriorRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = PRPAMT201303UV02ContactParty.class)
    public JAXBElement<COCTMT030207UV07Person> createPRPAMT201303UV02ContactPartyContactPerson(COCTMT030207UV07Person value) {
        return new JAXBElement<COCTMT030207UV07Person>(_COCTMT030007UVContactPartyContactPerson_QNAME, COCTMT030207UV07Person.class, PRPAMT201303UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = PRPAMT201303UV02ContactParty.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201303UV02ContactPartyContactOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_COCTMT030007UVContactPartyContactOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201303UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Subject5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject", scope = PRPMMT403010UV01InformRequest.class)
    public JAXBElement<PRPMMT403010UV01Subject5> createPRPMMT403010UV01InformRequestSubject(PRPMMT403010UV01Subject5 value) {
        return new JAXBElement<PRPMMT403010UV01Subject5>(_PRPMMT306110UV01InformRequestSubject_QNAME, PRPMMT403010UV01Subject5 .class, PRPMMT403010UV01InformRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150002UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guarantorOrganization", scope = COCTMT030007UVGuarantor.class)
    public JAXBElement<COCTMT150002UV01Organization> createCOCTMT030007UVGuarantorGuarantorOrganization(COCTMT150002UV01Organization value) {
        return new JAXBElement<COCTMT150002UV01Organization>(_COCTMT670000UV04GuarantorRoleGuarantorOrganization_QNAME, COCTMT150002UV01Organization.class, COCTMT030007UVGuarantor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030202UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guarantorPerson", scope = COCTMT030007UVGuarantor.class)
    public JAXBElement<COCTMT030202UV07Person> createCOCTMT030007UVGuarantorGuarantorPerson(COCTMT030202UV07Person value) {
        return new JAXBElement<COCTMT030202UV07Person>(_COCTMT670000UV04GuarantorRoleGuarantorPerson_QNAME, COCTMT030202UV07Person.class, COCTMT030007UVGuarantor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT150000UV02Person.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT150000UV02PersonAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090000UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT150000UV02Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT030007UVOtherIDs.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT030007UVOtherIDsScopingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT030007UVOtherIDs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04WarrantorOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "warrantingWarrantorOrganization", scope = COCTMT490000UV04Warrantor.class)
    public JAXBElement<COCTMT490000UV04WarrantorOrganization> createCOCTMT490000UV04WarrantorWarrantingWarrantorOrganization(COCTMT490000UV04WarrantorOrganization value) {
        return new JAXBElement<COCTMT490000UV04WarrantorOrganization>(_COCTMT490000UV04WarrantorWarrantingWarrantorOrganization_QNAME, COCTMT490000UV04WarrantorOrganization.class, COCTMT490000UV04Warrantor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT409000UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMIN403011UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT409000UV01AssignedEntity> createPRPMIN403011UV01MFMIMT700721UV01Subject2AssignedEntity(PRPMMT409000UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT409000UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT409000UV01AssignedEntity.class, PRPMIN403011UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocTCell.class)
    public JAXBElement<StrucDocSup> createStrucDocTCellSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocContentSup_QNAME, StrucDocSup.class, StrucDocTCell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocTCell.class)
    public JAXBElement<StrucDocContent> createStrucDocTCellContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocContentContent_QNAME, StrucDocContent.class, StrucDocTCell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "table", scope = StrucDocTCell.class)
    public JAXBElement<StrucDocTable> createStrucDocTCellTable(StrucDocTable value) {
        return new JAXBElement<StrucDocTable>(_StrucDocFootnoteTable_QNAME, StrucDocTable.class, StrucDocTCell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocTCell.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocTCellLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocContentLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocTCell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "list", scope = StrucDocTCell.class)
    public JAXBElement<StrucDocList> createStrucDocTCellList(StrucDocList value) {
        return new JAXBElement<StrucDocList>(_StrucDocFootnoteList_QNAME, StrucDocList.class, StrucDocTCell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocTCell.class)
    public JAXBElement<StrucDocFootnote> createStrucDocTCellFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocContentFootnote_QNAME, StrucDocFootnote.class, StrucDocTCell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocTCell.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocTCellFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocContentFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocTCell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocTCell.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocTCellRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocContentRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocTCell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocTCell.class)
    public JAXBElement<StrucDocSub> createStrucDocTCellSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocContentSub_QNAME, StrucDocSub.class, StrucDocTCell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocParagraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "paragraph", scope = StrucDocTCell.class)
    public JAXBElement<StrucDocParagraph> createStrucDocTCellParagraph(StrucDocParagraph value) {
        return new JAXBElement<StrucDocParagraph>(_StrucDocFootnoteParagraph_QNAME, StrucDocParagraph.class, StrucDocTCell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocTCell.class)
    public JAXBElement<StrucDocBr> createStrucDocTCellBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocContentBr_QNAME, StrucDocBr.class, StrucDocTCell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT820000UVRoleOther.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT820000UVRoleOtherScopingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT820000UVRoleOther.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000200UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = MCCIMT000200UV01Agent.class)
    public JAXBElement<MCCIMT000200UV01Organization> createMCCIMT000200UV01AgentRepresentedOrganization(MCCIMT000200UV01Organization value) {
        return new JAXBElement<MCCIMT000200UV01Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, MCCIMT000200UV01Organization.class, MCCIMT000200UV01Agent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT309000UV01HealthCareProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProvider", scope = PRPMIN301011UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT309000UV01HealthCareProvider> createPRPMIN301011UV01MFMIMT700721UV01Subject2HealthCareProvider(PRPMMT309000UV01HealthCareProvider value) {
        return new JAXBElement<PRPMMT309000UV01HealthCareProvider>(_PRPMIN303011UV01MFMIMT700721UV01Subject2HealthCareProvider_QNAME, PRPMMT309000UV01HealthCareProvider.class, PRPMIN301011UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT309000UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMIN301011UV01MFMIMT700721UV01Subject2 .class)
    public JAXBElement<PRPMMT309000UV01AssignedEntity> createPRPMIN301011UV01MFMIMT700721UV01Subject2AssignedEntity(PRPMMT309000UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT309000UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT309000UV01AssignedEntity.class, PRPMIN301011UV01MFMIMT700721UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030202UV07BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = COCTMT030202UV07Person.class)
    public JAXBElement<COCTMT030202UV07BirthPlace> createCOCTMT030202UV07PersonBirthPlace(COCTMT030202UV07BirthPlace value) {
        return new JAXBElement<COCTMT030202UV07BirthPlace>(_PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME, COCTMT030202UV07BirthPlace.class, COCTMT030202UV07Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Subject8 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf3", scope = PRPMMT403010UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT403010UV01Subject8> createPRPMMT403010UV01QualifiedEntitySubjectOf3(PRPMMT403010UV01Subject8 value) {
        return new JAXBElement<PRPMMT403010UV01Subject8>(_PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME, PRPMMT403010UV01Subject8 .class, PRPMMT403010UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01PrincipalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedPrincipalOrganization", scope = PRPMMT403010UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT403010UV01PrincipalOrganization> createPRPMMT403010UV01QualifiedEntityQualifiedPrincipalOrganization(PRPMMT403010UV01PrincipalOrganization value) {
        return new JAXBElement<PRPMMT403010UV01PrincipalOrganization>(_PRPMMT401010UV01QualifiedEntityQualifiedPrincipalOrganization_QNAME, PRPMMT403010UV01PrincipalOrganization.class, PRPMMT403010UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualificationGrantingOrganization", scope = PRPMMT403010UV01QualifiedEntity.class)
    public JAXBElement<PRPMMT403010UV01Organization> createPRPMMT403010UV01QualifiedEntityQualificationGrantingOrganization(PRPMMT403010UV01Organization value) {
        return new JAXBElement<PRPMMT403010UV01Organization>(_PRPMMT306110UV01QualifiedEntityQualificationGrantingOrganization_QNAME, PRPMMT403010UV01Organization.class, PRPMMT403010UV01QualifiedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = PRPAMT201310UV02Student.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201310UV02StudentSchoolOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201304UV02StudentSchoolOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201310UV02Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201302UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201302UV02Person.class)
    public JAXBElement<PRPAMT201302UV02BirthPlace> createPRPAMT201302UV02PersonBirthPlace(PRPAMT201302UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201302UV02BirthPlace>(_PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME, PRPAMT201302UV02BirthPlace.class, PRPAMT201302UV02Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVObservation.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVObservationDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT080000UV09SpecimenCollectionProcessDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVObservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVObservation.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVObservationSubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_COCTMT530000UVSubstanceAdministrationSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVObservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVObservation.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVObservationDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVSubstanceAdministrationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVObservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVObservation.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVObservationRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVSubstanceAdministrationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVObservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = PRPMMT306110UV01AssignedEntity.class)
    public JAXBElement<PRPMMT306110UV01Organization> createPRPMMT306110UV01AssignedEntityRepresentedOrganization(PRPMMT306110UV01Organization value) {
        return new JAXBElement<PRPMMT306110UV01Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, PRPMMT306110UV01Organization.class, PRPMMT306110UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPrincipalPerson", scope = PRPMMT306110UV01AssignedEntity.class)
    public JAXBElement<PRPMMT306110UV01PrincipalPerson> createPRPMMT306110UV01AssignedEntityAssignedPrincipalPerson(PRPMMT306110UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT306110UV01PrincipalPerson>(_PRPMMT306910UV01AssignedEntityAssignedPrincipalPerson_QNAME, PRPMMT306110UV01PrincipalPerson.class, PRPMMT306110UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT090300UV01RoleOther.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT090300UV01RoleOtherScopingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT090300UV01RoleOther.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = COCTMT530000UVHealthCareFacility.class)
    public JAXBElement<COCTMT530000UVPlace> createCOCTMT530000UVHealthCareFacilityLocation(COCTMT530000UVPlace value) {
        return new JAXBElement<COCTMT530000UVPlace>(_COCTMT070000UV01LocatedEntityLocation_QNAME, COCTMT530000UVPlace.class, COCTMT530000UVHealthCareFacility.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "serviceProviderOrganization", scope = COCTMT530000UVHealthCareFacility.class)
    public JAXBElement<COCTMT530000UVOrganization> createCOCTMT530000UVHealthCareFacilityServiceProviderOrganization(COCTMT530000UVOrganization value) {
        return new JAXBElement<COCTMT530000UVOrganization>(_COCTMT240003UV02ServiceDeliveryLocationServiceProviderOrganization_QNAME, COCTMT530000UVOrganization.class, COCTMT530000UVHealthCareFacility.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = PRPAMT201301UV02Student.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201301UV02StudentSchoolOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201304UV02StudentSchoolOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201301UV02Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700701UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPAIN201304UV02MFMIMT700701UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700701UV01Author2> createPRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor(MFMIMT700701UV01Author2 value) {
        return new JAXBElement<MFMIMT700701UV01Author2>(_COCTMT290000UV06ServiceRequestAuthor_QNAME, MFMIMT700701UV01Author2 .class, PRPAIN201304UV02MFMIMT700701UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01HealthCareProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProvider", scope = PRPMMT306110UV01RelatedTo.class)
    public JAXBElement<PRPMMT306110UV01HealthCareProvider> createPRPMMT306110UV01RelatedToHealthCareProvider(PRPMMT306110UV01HealthCareProvider value) {
        return new JAXBElement<PRPMMT306110UV01HealthCareProvider>(_PRPMIN303011UV01MFMIMT700721UV01Subject2HealthCareProvider_QNAME, PRPMMT306110UV01HealthCareProvider.class, PRPMMT306110UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMMT306110UV01RelatedTo.class)
    public JAXBElement<PRPMMT306110UV01AssignedEntity> createPRPMMT306110UV01RelatedToAssignedEntity(PRPMMT306110UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT306110UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT306110UV01AssignedEntity.class, PRPMMT306110UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01QualifiedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedEntity", scope = PRPMMT306110UV01RelatedTo.class)
    public JAXBElement<PRPMMT306110UV01QualifiedEntity> createPRPMMT306110UV01RelatedToQualifiedEntity(PRPMMT306110UV01QualifiedEntity value) {
        return new JAXBElement<PRPMMT306110UV01QualifiedEntity>(_PRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity_QNAME, PRPMMT306110UV01QualifiedEntity.class, PRPMMT306110UV01RelatedTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT309000UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = PRPMMT309000UV01AssignedEntity.class)
    public JAXBElement<PRPMMT309000UV01Organization> createPRPMMT309000UV01AssignedEntityRepresentedOrganization(PRPMMT309000UV01Organization value) {
        return new JAXBElement<PRPMMT309000UV01Organization>(_COCTMT090303UV01AssignedDeviceRepresentedOrganization_QNAME, PRPMMT309000UV01Organization.class, PRPMMT309000UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT309000UV01PrincipalPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPrincipalPerson", scope = PRPMMT309000UV01AssignedEntity.class)
    public JAXBElement<PRPMMT309000UV01PrincipalPerson> createPRPMMT309000UV01AssignedEntityAssignedPrincipalPerson(PRPMMT309000UV01PrincipalPerson value) {
        return new JAXBElement<PRPMMT309000UV01PrincipalPerson>(_PRPMMT306910UV01AssignedEntityAssignedPrincipalPerson_QNAME, PRPMMT309000UV01PrincipalPerson.class, PRPMMT309000UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject7 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf5", scope = COCTMT230100UVMedication.class)
    public JAXBElement<COCTMT230100UVSubject7> createCOCTMT230100UVMedicationSubjectOf5(COCTMT230100UVSubject7 value) {
        return new JAXBElement<COCTMT230100UVSubject7>(_COCTMT230100UVMedicationSubjectOf5_QNAME, COCTMT230100UVSubject7 .class, COCTMT230100UVMedication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700701UV01Subject4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject2", scope = MFMIMT700701UV01PriorRegistration.class)
    public JAXBElement<MFMIMT700701UV01Subject4> createMFMIMT700701UV01PriorRegistrationSubject2(MFMIMT700701UV01Subject4 value) {
        return new JAXBElement<MFMIMT700701UV01Subject4>(_MFMIMT700711UV01PriorRegistrationSubject2_QNAME, MFMIMT700701UV01Subject4 .class, MFMIMT700701UV01PriorRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700701UV01Subject3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject1", scope = MFMIMT700701UV01PriorRegistration.class)
    public JAXBElement<MFMIMT700701UV01Subject3> createMFMIMT700701UV01PriorRegistrationSubject1(MFMIMT700701UV01Subject3 value) {
        return new JAXBElement<MFMIMT700701UV01Subject3>(_MFMIMT700711UV01PriorRegistrationSubject1_QNAME, MFMIMT700701UV01Subject3 .class, MFMIMT700701UV01PriorRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01HealthCareProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProvider", scope = PRPMIN306011UV01MFMIMT700711UV01Subject2 .class)
    public JAXBElement<PRPMMT306110UV01HealthCareProvider> createPRPMIN306011UV01MFMIMT700711UV01Subject2HealthCareProvider(PRPMMT306110UV01HealthCareProvider value) {
        return new JAXBElement<PRPMMT306110UV01HealthCareProvider>(_PRPMIN303011UV01MFMIMT700721UV01Subject2HealthCareProvider_QNAME, PRPMMT306110UV01HealthCareProvider.class, PRPMIN306011UV01MFMIMT700711UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = PRPMIN306011UV01MFMIMT700711UV01Subject2 .class)
    public JAXBElement<PRPMMT306110UV01AssignedEntity> createPRPMIN306011UV01MFMIMT700711UV01Subject2AssignedEntity(PRPMMT306110UV01AssignedEntity value) {
        return new JAXBElement<PRPMMT306110UV01AssignedEntity>(_PRPMIN303011UV01MFMIMT700721UV01Subject2AssignedEntity_QNAME, PRPMMT306110UV01AssignedEntity.class, PRPMIN306011UV01MFMIMT700711UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT306110UV01QualifiedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "qualifiedEntity", scope = PRPMIN306011UV01MFMIMT700711UV01Subject2 .class)
    public JAXBElement<PRPMMT306110UV01QualifiedEntity> createPRPMIN306011UV01MFMIMT700711UV01Subject2QualifiedEntity(PRPMMT306110UV01QualifiedEntity value) {
        return new JAXBElement<PRPMMT306110UV01QualifiedEntity>(_PRPMIN301010UV01MFMIMT700721UV01Subject2QualifiedEntity_QNAME, PRPMMT306110UV01QualifiedEntity.class, PRPMIN306011UV01MFMIMT700711UV01Subject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = COCTMT050000UV01Person.class)
    public JAXBElement<COCTMT050000UV01BirthPlace> createCOCTMT050000UV01PersonBirthPlace(COCTMT050000UV01BirthPlace value) {
        return new JAXBElement<COCTMT050000UV01BirthPlace>(_PRPAMT201303UV02NonPersonLivingSubjectBirthPlace_QNAME, COCTMT050000UV01BirthPlace.class, COCTMT050000UV01Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT403010UV01Subject8 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf3", scope = PRPMMT403010UV01Member.class)
    public JAXBElement<PRPMMT403010UV01Subject8> createPRPMMT403010UV01MemberSubjectOf3(PRPMMT403010UV01Subject8 value) {
        return new JAXBElement<PRPMMT403010UV01Subject8>(_PRPMMT301010UV01QualifiedEntitySubjectOf3_QNAME, PRPMMT403010UV01Subject8 .class, PRPMMT403010UV01Member.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVPackagedMedicine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "containedPackagedMedicine", scope = COCTMT230100UVSubContent.class)
    public JAXBElement<COCTMT230100UVPackagedMedicine> createCOCTMT230100UVSubContentContainedPackagedMedicine(COCTMT230100UVPackagedMedicine value) {
        return new JAXBElement<COCTMT230100UVPackagedMedicine>(_COCTMT230100UVSubContentContainedPackagedMedicine_QNAME, COCTMT230100UVPackagedMedicine.class, COCTMT230100UVSubContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT301010UV01Subject5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject", scope = PRPMMT301010UV01InformRequest.class)
    public JAXBElement<PRPMMT301010UV01Subject5> createPRPMMT301010UV01InformRequestSubject(PRPMMT301010UV01Subject5 value) {
        return new JAXBElement<PRPMMT301010UV01Subject5>(_PRPMMT306110UV01InformRequestSubject_QNAME, PRPMMT301010UV01Subject5 .class, PRPMMT301010UV01InformRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UV07Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = PRPAMT201301UV02ContactParty.class)
    public JAXBElement<COCTMT030207UV07Person> createPRPAMT201301UV02ContactPartyContactPerson(COCTMT030207UV07Person value) {
        return new JAXBElement<COCTMT030207UV07Person>(_COCTMT030007UVContactPartyContactPerson_QNAME, COCTMT030207UV07Person.class, PRPAMT201301UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = PRPAMT201301UV02ContactParty.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201301UV02ContactPartyContactOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_COCTMT030007UVContactPartyContactOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201301UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAdministerableMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "administerableMaterial", scope = COCTMT530000UVConsumable.class)
    public JAXBElement<COCTMT530000UVAdministerableMaterial> createCOCTMT530000UVConsumableAdministerableMaterial(COCTMT530000UVAdministerableMaterial value) {
        return new JAXBElement<COCTMT530000UVAdministerableMaterial>(_COCTMT530000UVConsumableAdministerableMaterial_QNAME, COCTMT530000UVAdministerableMaterial.class, COCTMT530000UVConsumable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVMedication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "medication", scope = COCTMT530000UVConsumable.class)
    public JAXBElement<COCTMT230100UVMedication> createCOCTMT530000UVConsumableMedication(COCTMT230100UVMedication value) {
        return new JAXBElement<COCTMT230100UVMedication>(_COCTMT530000UVConsumableMedication_QNAME, COCTMT230100UVMedication.class, COCTMT530000UVConsumable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT530000UVRole.class)
    public JAXBElement<COCTMT530000UVOrganization> createCOCTMT530000UVRoleScopingOrganization(COCTMT530000UVOrganization value) {
        return new JAXBElement<COCTMT530000UVOrganization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT530000UVOrganization.class, COCTMT530000UVRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201306UV02MatchAlgorithm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "matchAlgorithm", scope = PRPAMT201306UV02MatchCriterionList.class)
    public JAXBElement<PRPAMT201306UV02MatchAlgorithm> createPRPAMT201306UV02MatchCriterionListMatchAlgorithm(PRPAMT201306UV02MatchAlgorithm value) {
        return new JAXBElement<PRPAMT201306UV02MatchAlgorithm>(_PRPAMT201306UV02MatchCriterionListMatchAlgorithm_QNAME, PRPAMT201306UV02MatchAlgorithm.class, PRPAMT201306UV02MatchCriterionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201306UV02MatchWeight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "matchWeight", scope = PRPAMT201306UV02MatchCriterionList.class)
    public JAXBElement<PRPAMT201306UV02MatchWeight> createPRPAMT201306UV02MatchCriterionListMatchWeight(PRPAMT201306UV02MatchWeight value) {
        return new JAXBElement<PRPAMT201306UV02MatchWeight>(_PRPAMT201306UV02MatchCriterionListMatchWeight_QNAME, PRPAMT201306UV02MatchWeight.class, PRPAMT201306UV02MatchCriterionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201306UV02MinimumDegreeMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "minimumDegreeMatch", scope = PRPAMT201306UV02MatchCriterionList.class)
    public JAXBElement<PRPAMT201306UV02MinimumDegreeMatch> createPRPAMT201306UV02MatchCriterionListMinimumDegreeMatch(PRPAMT201306UV02MinimumDegreeMatch value) {
        return new JAXBElement<PRPAMT201306UV02MinimumDegreeMatch>(_PRPAMT201306UV02MatchCriterionListMinimumDegreeMatch_QNAME, PRPAMT201306UV02MinimumDegreeMatch.class, PRPAMT201306UV02MatchCriterionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVProcedure.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVProcedureDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT080000UV09SpecimenCollectionProcessDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVProcedure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVProcedure.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVProcedureSubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_COCTMT530000UVSubstanceAdministrationSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVProcedure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVProcedure.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVProcedureDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVSubstanceAdministrationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVProcedure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVProcedure.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVProcedureRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVSubstanceAdministrationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVProcedure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPMMT303010UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = PRPMMT303010UV01ServiceDeliveryLocation.class)
    public JAXBElement<PRPMMT303010UV01Place> createPRPMMT303010UV01ServiceDeliveryLocationLocation(PRPMMT303010UV01Place value) {
        return new JAXBElement<PRPMMT303010UV01Place>(_COCTMT070000UV01LocatedEntityLocation_QNAME, PRPMMT303010UV01Place.class, PRPMMT303010UV01ServiceDeliveryLocation.class, value);
    }

}
