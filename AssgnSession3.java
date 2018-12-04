package com.ibm.seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssgnSession3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		WebElement roundtripEle = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
		roundtripEle.click();
		WebElement fromEle = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		fromEle.click();
		WebElement currentcityEle = driver.findElement(By.xpath("//a[@value='MAA']"));
		currentcityEle.click();
		WebElement destinationcityEle = driver.findElement(By.xpath("(//a[@value='BLR'])[2]"));
		// WebElement
		// toEle=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		destinationcityEle.click();
		WebElement depEle = driver
				.findElement(By.xpath("(//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[4])[1]"));
		depEle.click();
		Thread.sleep(3000);

		WebElement returndateEle = driver
				.findElement(By.xpath("(//input[@id='ctl00_mainContent_view_date2']/following::button)[1]"));
		returndateEle.click();
		WebElement retEle = driver
				.findElement(By.xpath("(//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[6])[1]"));
		retEle.click();
		Thread.sleep(2000);
		WebElement passengersEle = driver.findElement(By.xpath("//div[@class='paxinfo']"));
		passengersEle.click();
		Thread.sleep(2000);
		WebElement addAdultEle = driver.findElement(By.xpath("(//div[@class='ad-row-right']/span[3])[1]"));
		addAdultEle.click();
		WebElement currencyEle = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select s = new Select(currencyEle);
		s.selectByValue("USD");
		WebElement flightSearchEle = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']"));
		flightSearchEle.click();
		WebElement roundTripEle = driver.findElement(By.xpath("//span[text()=' Chennai  to  Bengaluru ']"));
		String roundtrip = roundTripEle.getText();
		System.out.println(roundtrip);
		WebElement departdateEle = driver.findElement(By.xpath("//span[text()='5 Dec, Wed']"));
		String departdate = departdateEle.getText();
		System.out.println(departdate);
		WebElement returndteEle = driver.findElement(By.xpath("//span[text()='7 Dec, Fri']"));
		String returndate = returndteEle.getText();
		System.out.println(returndate);
		WebElement passengerschck = driver.findElement(By.xpath("//span[text()='2 Adult']"));
		String noOfpassengers = passengerschck.getText();
		System.out.println(noOfpassengers);
		WebElement currencycheck = driver.findElement(By.xpath("//span[text()='USD']"));
		String currency = currencycheck.getText();
		System.out.println(currency);
		if (roundtrip.equalsIgnoreCase("Chennai to Bengaluru") && departdate.equalsIgnoreCase("5 Dec, Wed")
				&& returndate.equalsIgnoreCase("7 Dec, Fri") && noOfpassengers.equalsIgnoreCase("2 Adult")
				&& currency.equalsIgnoreCase("USD")) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}
	}
}
