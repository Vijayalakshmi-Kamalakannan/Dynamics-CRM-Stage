package testcases.Member;

import java.awt.AWTException;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.DataInputProvider;

public class TestCase_5476 {
	
	@Test
	public void createMemberTP(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException, AWTException {
		new LoginPage()
		.typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
  	    .typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName)) 
		.clickSignIn()
		.clickWorkplace()
		.selectAccounts()		
		.chooseActiveMember(DataInputProvider.getCellData_ColName(iRowNumber, "CrmNumber", sDataSheetName))     		
		.captureStatusDisplayedModify(DataInputProvider.getCellData_ColName(iRowNumber, "RecordStatusPublished", sDataSheetName))		
		.typeAccountModify(DataInputProvider.getCellData_ColName(iRowNumber, "AccountName", sDataSheetName))
		.clickSave();	
	}

}