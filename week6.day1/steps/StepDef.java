package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BaseClass{
	
	@Given("Go to Lead button")
	public void Go_to_Lead_button()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@And("Click create lead")
	public void Click_create_lead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("Enter Company Name as {string}")
	public void enter_company_name_as(String Cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
	}
	
	@Given("Enter First Name as {string}")
	public void enter_first_name_as(String fname) 
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	
	@Given("Enter Last Name as {string}")
	public void enter_last_name_as(String lname) 
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);

	}
	
	@And("First Name is {string}")
	public void First_Name_is(String fname)
	{
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fname);
	}
	
	@When("Click Create Lead button")
	public void Click_Create_Lead_Button()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	
	@And("Click Find lead")
	public void Click_find_lead()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("Click Find Lead button")
	public void click_find_button()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@And("Click on Phone")
	public void click_on_phone()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@And("Enter Phome Number as {string}")
	public void enter_phone_number(String num)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(num);
	}
	
	@Then("Exit browser")
	public void Exit_browser()
	{
		driver.close();
	}
	
}
