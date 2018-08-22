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
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
	}
	public void goToPage() {
		webDriver.get("http://beta1.matchi.se/");
	}
	public void logInAddUserAndPass(String username, String password) {
		WebElement element = webDriver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul[2]/li[2]/a"));
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
	public String getTextByXpath(String xpath) {
		WebElement element = webDriver.findElement(By.xpath(xpath));
		return element.getText();
	}
	public void login() {
		logInAddUserAndPass("mjukvarutestare@mailinator.com","mjukvarutestare");
		clickByClassName("btn-success");
	}
}
