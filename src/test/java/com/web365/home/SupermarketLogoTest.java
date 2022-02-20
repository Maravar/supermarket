package com.web365.home;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.web365.base.SupermarketBaseTest;
import com.web365.supermarket.page.FoodCourt.SupermarketFoodCourtPage;
import com.web365.supermarket.page.home.SupermarketHomePage;

public class SupermarketLogoTest extends SupermarketBaseTest {
	
	@Test
	public void supermarketLogoTest() throws InterruptedException {
		System.out.println("Test case ID1");
		System.out.println("verify the Food Court displayed to new home page");
		
		SupermarketHomePage home=new SupermarketHomePage(driver);
		System.out.println("Navigate to SAS.am");
		home=home.logoClick();
		System.out.println("1. click on  Sas supermarket logo");
		Assert.assertTrue(home.foodcourt.isDisplayed());
		
		
	}
		
		
		
		@Test
		public void supermarketFoodCourtTest() throws InterruptedException {
			System.out.println("Test case ID2");
			System.out.println("verify the Food Img is displayed to new FoodCourt page");
			
			SupermarketHomePage home=new SupermarketHomePage(driver);
			System.out.println("Navigate to SAS.am");
			Thread.sleep(3000);
			SupermarketFoodCourtPage foodcourt=home.goToFoodCourt();
			System.out.println("1.click on Food court logo");
			Thread.sleep(3000);
			Assert.assertTrue(foodcourt.foodimg.isDisplayed());
			Thread.sleep(3000);
			}
			
			
		
		}

	



	
		
		

		
		
	
	
	
	
	
	

