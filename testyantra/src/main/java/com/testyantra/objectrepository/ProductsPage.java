package com.testyantra.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {

	@FindBy(xpath="//img[@alt=Create Product...")
	private WebElement createProductImgBtn;
}
