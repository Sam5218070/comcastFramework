package com.testyantra.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
public OrganizationsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//img[@alt='Create Organization...']")
private WebElement organizationlookupButton;
public WebElement getorganizationlookupButton() {
	return organizationlookupButton;
	
}
}
