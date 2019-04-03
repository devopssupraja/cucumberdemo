package stepdefinitions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	private WebDriver driver;
	String f = "https://www.guru99.com/";
	@Test
	@Given ("^I want to write a step with precondition$")
	public void s() {
		//WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.chrome.driver", "E:\\Supraja\\chromedriver_win32(1)\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Givencompleted");
		driver.manage().window().maximize();
		driver.get(f);
	}
	
    @When ("^I complete action$")
public void s1() {
    	System.out.println("when Started");
    					
		//String actualTitle = driver.getTitle();
		//String expectedTitle = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
		//assertEquals(expectedTitle,actualTitle);
		
		System.out.println("wheencompleted");
	}
	
    @Then ("^I validate the outcomes$")
public void s2() {
		System.out.println("Then done");
	}

}

