package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;

public class NewAccountPage extends TestNgHooks {

	public SupplierFormPage chooseSupplierForm() {
		switchToFrame(getDriver().findElement(By.id("contentIFrame1")));
		click(getDriver().findElement(By.xpath("(//span[@class='ms-crm-FormSelector'])[1]")));
		click(getDriver().findElement(By.xpath("//span[@title='Supplier Form']")));
		//switchToDefaultContent();
		return new SupplierFormPage();
		
	}
		
		public MemberFormPage chooseMemberForm() {
			switchToFrame(getDriver().findElement(By.id("contentIFrame1")));
			click(getDriver().findElement(By.xpath("(//span[@class='ms-crm-FormSelector'])[1]")));
			click(getDriver().findElement(By.xpath("//span[@title='Member Form']")));
			//switchToDefaultContent();
			return new MemberFormPage();
	}
		public AccountsPage chooseActiveMember() {
			switchToFrame(getDriver().findElement(By.id("contentIFrame0")));
			//click(getDriver().findElement(By.xpath("(//span[@class='ms-crm-FormSelector'])[1]")));
			click(getDriver().findElement(By.xpath("//span[@title()='Select a view']")));
			//switchToDefaultContent();
			return new AccountsPage();
	}
}
