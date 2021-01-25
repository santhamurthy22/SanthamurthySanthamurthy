package DataProvidersTestNG.TestNGDataProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
public class DataProviders {

	@Test(dataProvider="Sample data")
	private void login(String santham, String murthy) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(santham);

		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(murthy);

		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
}
	@DataProvider(name = "Sample data")
	public Object[][] data() {
       return new Object[][] { 
			{ "java", "java@123" }, 
			{ "selenium", "selenium@123" },
			{ "python", "python@123" },
			{ "sql", "sql@123" } 
			};
			}
     @Test(dataProvider="Sample")
     private void login1(String murthy, String santham) {

	      WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.facebook.com/");

	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys(santham);

	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys(murthy);

	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
}
      @DataProvider(name = "Sample")
      public Object[][] data1() {
   return new Object[][] { 
		{ "abc", "abc@123" }, 
		{ "efgh", "efghi@123" },
		{ "ijklmn", "rtyhu@123" },
		{ "opqrst", "kioop@123" } 
		};
		}
@Test(dataProvider="Samp")
private void login2(String santham, String murthy) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");

	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys(santham);

	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys(murthy);

	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
}
@DataProvider(name = "Samp")
public Object[][] data2() {
   return new Object[][] { 
		{ "java", "java@123" }, 
		{ "selenium", "selenium@123" },
		{ "python", "python@123" },
		{ "sql", "sql@123" } 
		};
		}
@Test(dataProvider="Sampl")
private void login3(String santham, String murthy) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");

	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys(santham);

	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys(murthy);

	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
}
@DataProvider(name = "Sampl")
public Object[][] data3() {
   return new Object[][] { 
		{ "java", "java@123" }, 
		{ "selenium", "selenium@123" },
		{ "python", "python@123" },
		{ "sql", "sql@123" } 
		};
		}
@Test(dataProvider="data")
private void login4(String santham, String murthy) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");

	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys(santham);

	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys(murthy);

	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
}
@DataProvider(name = "data")
public Object[][] data4() {
   return new Object[][] { 
		{ "java", "java@123" }, 
		{ "selenium", "selenium@123" },
		{ "python", "python@123" },
		{ "sql", "sql@123" } 
		};
		}
@Test(dataProvider="Sdata")
private void login5(String santham, String murthy) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");

	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys(santham);

	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys(murthy);

	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
}
@DataProvider(name = "Sdata")
public Object[][] data5() {
   return new Object[][] { 
		{ "java", "java@123" }, 
		{ "selenium", "selenium@123" },
		{ "python", "python@123" },
		{ "sql", "sql@123" } 
		};
		}
@Test(dataProvider="Samdata")
private void login6(String santham, String murthy) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");

	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys(santham);

	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys(murthy);

	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
}
@DataProvider(name = "Samdata")
public Object[][] data6() {
   return new Object[][] { 
		{ "java", "java@123" }, 
		{ "selenium", "selenium@123" },
		{ "python", "python@123" },
		{ "sql", "sql@123" } 
		};
		}
@Test(dataProvider="le data")
private void login7(String ham, String thy) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");

	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys(ham);

	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys(thy);

	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
}
@DataProvider(name = "ledata")
public Object[][] data7() {
   return new Object[][] { 
		{ "java", "java@123" }, 
		{ "selenium", "selenium@123" },
		{ "python", "python@123" },
		{ "sql", "sql@123" } 
		};
		}
}
