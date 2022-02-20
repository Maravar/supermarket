package com.web365.supermarket.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SupermarketBasePage {

	protected WebDriver driver;
	
	public SupermarketBasePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	
	}
}


