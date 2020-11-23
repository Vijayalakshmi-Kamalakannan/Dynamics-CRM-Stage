package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.PreAndPost;
import hooks.TestNgHooks;

public class DashboardPage extends TestNgHooks {


	public DashboardPage clickWorkplace() throws InterruptedException {	
		Thread.sleep(3000);
		click(getDriver().findElement(By.id("TabWorkplace")));
		return this;
	}

	public AccountsPage selectAccounts() throws InterruptedException {	
		click(getDriver().findElement(By.xpath("//span[text()='Accounts']")));
		Thread.sleep(3000);
		return new AccountsPage();
		}
	
	
	public ContactsPage selectContacts() {	
		click(getDriver().findElement(By.xpath("//span[text()='Contacts']")));
		return new ContactsPage();
		}


	public DashboardPage clickUserIcon() {
		click(getDriver().findElement(By.className("navTabButtonUserInfoProfileImage")));
		click(getDriver().findElement(By.id("navTabButtonUserInfoDropDownId")));
		verifyPartialText(getDriver().findElement(By.id("navTabButtonUserInfoDropDownId")), "Test");
		return this;
	}
	
}
