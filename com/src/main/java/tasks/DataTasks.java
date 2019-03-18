package tasks;

import org.openqa.selenium.WebDriver;

import appObjects.DataAppObjects;

public class DataTasks {
	
	private final DataAppObjects vehicledata;	
	
	public DataTasks (WebDriver driver) {
		this.vehicledata = new DataAppObjects(driver); 
	}
	
	public void comboBox2 () {
		vehicledata.comboSelectversion().click();
	}
	
	public void comboBox1 () {
		vehicledata.comboSelect().sendKeys("Bootstrap V4 Theme");
	}
	
	public void addCustomer () {
		vehicledata.botaaoAddCustomer().click();
	}
	
	public void contactFirstName (String contact) {
		vehicledata.contactFirstName().sendKeys(contact);
	}
	
	public void setCustomerName (String name) {
		vehicledata.customerName().sendKeys(name);
	}

	public void setLastName (String lastName) {
		vehicledata.contactLastName().sendKeys(lastName);
	}
	
	public void setPhone (String phone) {
		vehicledata.phone().sendKeys(phone);
	}
	
	public void setAddress (String address) {
		vehicledata.addressLine1().sendKeys(address);
	}
	
	public void setAddress2 (String address2) {
		vehicledata.addressLine2().sendKeys(address2);
	}
	
	public void setCity (String city) {
		vehicledata.city().sendKeys(city);
	}
	
	public void setState (String state) {
		vehicledata.state().sendKeys(state);
	}
	
	public void setPostalCode (String postal) {
		vehicledata.postalCode().sendKeys(postal);
	}
	
	public void setCountry (String country) {
		vehicledata.country().sendKeys(country);
	}
	
	public void setFixter () {
		vehicledata.fixter().click();
	}
	
	public void setCreditLimit (String credit) {
		vehicledata.creditLimit().sendKeys(credit);
	}
	
	public void save () {
		vehicledata.save().click();
	}
	
	public void selectEmployer () {
		vehicledata.selectEmployer().click();
	}
	
}
