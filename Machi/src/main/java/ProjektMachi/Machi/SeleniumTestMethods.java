package ProjektMachi.Machi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		logInAddUserAndPass("mjukvarutestare2@mailinator.com","mjukvarutestare");
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
	
	public void clickLink() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(webDriver,30);
		
		WebElement element = wait.until(ExpectedConditions.
		elementToBeClickable(By.xpath("//*[@id=\"facilities-result\"]/div/div[1]/div/div[1]/div[1]/div/div[2]/h3/a")));
		element.click();
	}
	
	
	public void closeWebDriver() {

		webDriver.close();
	}
	public void quitWebDriver() {
		webDriver.quit();
	}
}
