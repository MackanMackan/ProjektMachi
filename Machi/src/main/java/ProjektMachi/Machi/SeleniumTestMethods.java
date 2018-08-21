package ProjektMachi.Machi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestMethods {
	
	private WebDriver webDriver;
	
	public SeleniumTestMethods() {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void goToPage() {
		webDriver.get("www.youtube.com");
	}
	public void LogInAddUserandPass(String username, String password) {
		WebElement element = webDriver.findElement(By.name("Logga in"));
		element.click();
		element =  webDriver.findElement(By.id("username"));
		element.clear();
		element.sendKeys(username);
		element =  webDriver.findElement(By.id("password"));
		element.clear();
		element.sendKeys(password);
	}
	public void clickByClassName(String className) {
		WebElement element = webDriver.findElement(By.className(className));
		element.click();
	}
}
