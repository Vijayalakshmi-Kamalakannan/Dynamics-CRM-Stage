package testcases.Member;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.DataInputProvider;

//TFS ID_629090:Test case 10931:  Verify whether BK Active is defaulted to No.

public class TestCase_629090 {


	@Test
	public void verifyDefaultBKActiveNo(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException  {

		//1. Login to CRM using member supervisor / member credentials 
		new LoginPage()
		.typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
		.typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))  
		.clickSignIn()

		//2. Go to Workplace > Accounts > +New 
		.clickWorkplace()
		.selectAccounts()
		.clickNewOnAccountsPage()
		.chooseMemberFormwithFrame1()

		//4. Street 1 = Any
		.typeStreet1(DataInputProvider.getCellData_ColName(iRowNumber, "Street1", sDataSheetName))

//		//City = NY
//		.typeCity(DataInputProvider.getCellData_ColName(iRowNumber, "City", sDataSheetName))
//
//		//Country =USA
//		.typeCountry(DataInputProvider.getCellData_ColName(iRowNumber, "Country", sDataSheetName))
//
//		//Country = USA
//		.typeCounty(DataInputProvider.getCellData_ColName(iRowNumber, "County", sDataSheetName))
		
		//Zip Code
		.typeZipCode(DataInputProvider.getCellData_ColName(iRowNumber, "ZipCode", sDataSheetName))

		//Click on Save 
		//.clickSave() 


		//3. Account  Type = Member
		.selectAccountType(DataInputProvider.getCellData_ColName(iRowNumber, "AccountType", sDataSheetName))

		//Account name = Any
		.typeAccountName(DataInputProvider.getCellData_ColName(iRowNumber, "AccountName", sDataSheetName))

		//Premier Start date = Today's Date
		//	.pickPremierStartDate(DataInputProvider.getCellData_ColName(iRowNumber, "PremierStartDate", sDataSheetName))

		//Class of Trade =Any
		.selectClassOfTrade(DataInputProvider.getCellData_ColName(iRowNumber, "ClassOfTrade", sDataSheetName))

		//			//Business Classification = Auto populated
		//			.businessClassificationIsVerified()

		//Account Status = Auto Populated to Active
		.defaultAccountStatus()	

		//Application Start Date = Today's Date
		.chooseApplicationDate(DataInputProvider.getCellData_ColName(iRowNumber, "ApplicationDate", sDataSheetName))

		//Participation Type = Standard
		.selectParticipationType(DataInputProvider.getCellData_ColName(iRowNumber, "ParticipationType", sDataSheetName))

		//16. BK Active
		.verifyBKActive("No")

		//Direct Parent Entity Code = 673415
		.selectDirectParent(DataInputProvider.getCellData_ColName(iRowNumber, "DirectParent", sDataSheetName))

		//Direct Parent Relation = Managed
		.selectDirectParentRelationManaged(DataInputProvider.getCellData_ColName(iRowNumber, "DirectParentRelation", sDataSheetName)) 

		//Direct Parent Relation date = Today's Date
		.selectDirectParentRelationDate(DataInputProvider.getCellData_ColName(iRowNumber, "DirectParentRelationDate", sDataSheetName))

		//Top Parent Relation =  OLM
		.selectTopParentRelation(DataInputProvider.getCellData_ColName(iRowNumber, "TopParentRelation", sDataSheetName))

		//Top Parent Relation Date = Today's Date
		.selectTopParentRelationDate( DataInputProvider.getCellData_ColName(iRowNumber, "TopParentRelationDate", sDataSheetName))

		// Click on Save 
		.clickSave() 




		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~MultiGPO Update~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
		//Add Membership provider
		.clickAddNewPremierMembershipWithFrame1()

		// Choose Membership type
		.selectMembershipProviderType1(DataInputProvider.getCellData_ColName(iRowNumber, "MembershipProviderType", sDataSheetName))
		.typeInAddNewMembershipProvider(DataInputProvider.getCellData_ColName(iRowNumber, "MembershipProvider", sDataSheetName))

		//Provide any start date and click on save
		.selectMembershipProviderStartDateInAddNewMembershipProvider(DataInputProvider.getCellData_ColName(iRowNumber, "MembershipProviderStartDate", sDataSheetName))
		.clickAddNewMembershipProviderSave()
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		//5.  Click the + icon on the Line of Business Grid
		.clickLineOfBusinessWithFrame1()

		// Line of Business =General GPO
		.selectLineOfBusinessGeneralGPO(DataInputProvider.getCellData_ColName(iRowNumber, "LineOfBusinessGeneralGPO", sDataSheetName))

		// Classification Type = General GPO
		.selectLineOfClassificationGeneralGPO(DataInputProvider.getCellData_ColName(iRowNumber, "LineOfClassificationGeneralGPO", sDataSheetName))

		// Start Date =Today's date
		.selectLineOfBusinessStartDate(DataInputProvider.getCellData_ColName(iRowNumber, "LineOfBusinessStartDate", sDataSheetName))

		// Click on LOB Save 
		.clickLineOfBusinessSave()

		//Click on Save 
		.clickSave() 

		//6. Record Status = Published
		.chooseRecordStatusPublishedWithFrame1(DataInputProvider.getCellData_ColName(iRowNumber, "RecordStatusPublished", sDataSheetName))

		//Click on Save 
		.clickSave() 

		//7. Verify Entity code is generated 
		.entityCodeIsDisplayedWithFrame1()

		//Verify Premier start date is auto populated
		.verifyPremierStartDateIsAutoPopulated()

		//		.verifyAffiliateGroupIsNotNull()
		//		.verifyAgEffectiveDateIsNotNull()
		//		
		//		//8. Verify "IS Corporate account" field
		//		.verifyIsCorporateAccount(DataInputProvider.getCellData_ColName(iRowNumber, "VerifyIsCorporateAccount", sDataSheetName))
		//		
		//		
		//		//9. Verify Corporate parent name in the form
		//		.verifyCorporateParentName(DataInputProvider.getCellData_ColName(iRowNumber, "VerifyCorporateParentName", sDataSheetName))
		//		
		//		//10. Verify "Is Food Service parent" field 
		//		.verifyIsFoodServiceParent(DataInputProvider.getCellData_ColName(iRowNumber, "VerifyIsFoodServiceParent", sDataSheetName))
		//		
		//		//11 Verify Food Service parent name in the form 
		//		.VerifyFoodServiceParentName(DataInputProvider.getCellData_ColName(iRowNumber, "VerifyFoodServiceParentName", sDataSheetName))
		//		
		//		//12 Verify Sponsor field 
		//		.verifySponsor(DataInputProvider.getCellData_ColName(iRowNumber, "VerifySponsor", sDataSheetName))
		//		
		//		//13 Verify "Is Sponsor" field 
		//		.verifyIsSponsor(DataInputProvider.getCellData_ColName(iRowNumber, "VerifyIsSponsor", sDataSheetName))
		//		
		//		//FBO details verification
		//		//Verify "Is FBO" field 
		//		.verifyIsFBO(DataInputProvider.getCellData_ColName(iRowNumber, "isFBO", sDataSheetName))
		//		
		//		//FBO
		//		.VerifyFBO(DataInputProvider.getCellData_ColName(iRowNumber, "VerifyCorporateParentName", sDataSheetName))
		//				
		//		//FBORD
		//		.VerifyFBORD(DataInputProvider.getCellData_ColName(iRowNumber, "verifyFBORD", sDataSheetName))
		//			
		//		
		//		//15  Go to > and click on Membership entity and double click on the Top parent membership entity
		//		.selectMembershipEntity()
		//		.doubleClickOnNationalMembership()
		//		
		////		//16 Click on > and go to Audit history 
		////		.selectTPAuditHistory()
		////		
		////		//17 Verify "Is Member Add mail sent" flag turned from No to Yes 
		////		.verifyIsMemberAddMailSentwithFrame0()
		////		
		////		//18 Verify the time-stamp on which the flag gets updated 
		////		.verifyTimeStampInTPMembershipAuditHistory()
		;
	}
}
