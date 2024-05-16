package myfirsttests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MyFirstTests {

	static WebDriver driver;
	@BeforeClass
	public static void setUp() {
		
	}
	
	@AfterClass
	public static void tearDown() {
		
	}
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
	}
	@After
	public void after() {
		driver.close();
		//driver.quit();
	}
	@Test
	public void register() throws InterruptedException {
		driver.get("https://demoqa.com/text-box");
		//driver.navigate().to("https://demoqa.com/elements");
		Thread.sleep(2000);
		
		//add username
		WebElement usernameInput = driver.findElement(By.xpath("//input[@id=\"userName\"]"));
		usernameInput.click();
		usernameInput.sendKeys("batMan");
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
		email.click();
		email.sendKeys("stanciusergiu90@gmail.com");
		Thread.sleep(4000);
	}

}
