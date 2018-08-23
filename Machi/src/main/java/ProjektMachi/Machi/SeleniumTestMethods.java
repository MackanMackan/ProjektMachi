package ProjektMachi.Machi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	public void goToPage(String url) {
		webDriver.get(url);
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
		logInAddUserAndPass("mjukvarutestare4@mailinator.com","mjukvarutestare");
		clickByClassName("btn-success");
	}

	public void clickByXPath(String xpath) {
		WebElement element = webDriver.findElement(By.xpath(xpath));
		element.click();
	}
	public void clickByCss(String cssSelector) {
		WebElement element = webDriver.findElement(By.cssSelector(cssSelector));
		element.click();
	}
	
	public void enterSearchTextXpath(String text, String xpath) {
		clickByXPath(xpath);
		WebElement element =webDriver.findElement(By.xpath(xpath));
		element.clear();
		element.sendKeys(text);
		element.sendKeys(Keys.ENTER);
		
	}
	
	public void enterSearchTextCss(String text, String css) {
		clickByCss(css);
		WebElement element =webDriver.findElement(By.cssSelector(css));
		element.clear();
		element.sendKeys(text);
		element.sendKeys(Keys.ENTER);
		
	}
	
	
	public void selectDate() {


	}
}
