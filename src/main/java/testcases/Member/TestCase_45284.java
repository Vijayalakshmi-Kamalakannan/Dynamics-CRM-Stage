package testcases.Member;

import org.testng.annotations.Test;

import pages.LoginPage;
import utils.DataInputProvider;
//TFS ID_45285:Verify whether the TPR is getting saved properly when DP change to different hierarchy

public class TestCase_45284 {


	@Test
	public void verifyDPChangeMessage(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException  {

		//1. Login to CRM using member supervisor / member credentials 
		new LoginPage()
		.typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
		.typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))  
		.clickSignIn()

		//2.Go to Workplace > Accounts and search for EIN 673415 
		.clickWorkplace()
		.selectAccounts()
		
		  .searchOnAccountsPage(DataInputProvider.getCellData_ColName(iRowNumber,
		  "CrmNumber", sDataSheetName))
		  
		  //3.Double click on the account and go to Sub accounts entity by clicking >on the top 
		  .selectAccountFromSearchResults() 
		 .selectSubaccount()
		 .navigatetoSubAccount()
		 .verifySubAccountView()
		 .verifySubAccountviewHeader()
		;
	}
}
