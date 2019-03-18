package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataAppObjects {
	
	private WebDriver driver; 
	
	public DataAppObjects (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement comboSelect () {
		return driver.findElement(By.id("switch-version-select"));
	}
	
	public WebElement comboSelectversion () {
		return driver.findElement(By.xpath("*[@id=\"switch-version-select\"]/option[2]"));
	}
	
	public WebElement botaaoAddCustomer () {
		return driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a"));
	}
	
	public WebElement contactFirstName () {
		return driver.findElement(By.id("field-contactFirstName"));
	}
	
	public WebElement customerName () {
		return driver.findElement(By.id("field-customerName"));
	}
	
	public WebElement contactLastName () {
		return driver.findElement(By.id("field-contactLastName"));
	}
	
	public WebElement phone () {
		return driver.findElement(By.id("field-phone"));
	}
	
	public WebElement addressLine1 () {
		return driver.findElement(By.id("field-addressLine1"));
	}
	
	public WebElement addressLine2 () {
		return driver.findElement(By.id("field-addressLine2"));
	}
	
	public WebElement city () {
		return driver.findElement(By.id("field-city"));
	}
	
	public WebElement state () {
		return driver.findElement(By.id("field-state"));
	}
	
	public WebElement postalCode () {
		return driver.findElement(By.id("field-postalCode"));
	}
	
	public WebElement country () {
		return driver.findElement(By.id("field-country"));
	}
	
	public WebElement fixter () {
		return driver.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li[8]"));
	}
	
	public WebElement creditLimit () {
		return driver.findElement(By.id("field-creditLimit"));
	}
	
	public WebElement save () {
		return driver.findElement(By.id("form-button-save"));
	}
	
	public WebElement selectEmployer () {
		return driver.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/a/span"));
	}
}
