package com.web365.supermarket.page.FoodCourt;


import static com.web365.supermarket.page.FoodCourt.SupermarketFoodCourtPageConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.supermarket.page.home.SupermarketHomePage;

public class SupermarketFoodCourtPage extends SupermarketHomePage {

	public SupermarketFoodCourtPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
     

	
	@FindBy(xpath=FOOD_IMG_XPATH)
	public WebElement foodimg; 
}

