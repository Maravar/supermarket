package com.web365.supermarket.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.web365.supermarket.page.FoodCourt.SupermarketFoodCourtPage;
//import com.web365.supermarket.page.FoodCourt.SupermarketFoodCourtPage;
import com.web365.supermarket.page.base.SupermarketBasePage;
import static com.web365.supermarket.page.home.SupermarketHomePageConstants.*;



public class SupermarketHomePage extends SupermarketBasePage {

	public SupermarketHomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	
	@FindBy(xpath=LOGO_XPATH)
	public WebElement Logo;
	
	@FindBy(xpath=SAS_FOOD_COURT_IMG_XPATH)
	public
	WebElement foodcourt;
	
	
	
	
	
	
	public SupermarketHomePage logoClick() throws InterruptedException {
		Actions action = new Actions(driver);
        action.moveToElement(Logo).click();
        Thread.sleep(3000);
		//homelogo.click();
		return new SupermarketHomePage(this.driver);}
	
	
	public SupermarketFoodCourtPage goToFoodCourt() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(foodcourt).click();
		Thread.sleep(3000);
        //homefoodcourt.click();
        return new SupermarketFoodCourtPage(this.driver);
 
		}
}

	
	
	

	
	
	
		
	


	

