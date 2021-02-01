package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal{
	protected static WebDriver driver;
		public void getChromeBrowser() {
		WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
	}
	public void getFirefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
driver=new FirefoxDriver();
	}
	public void getUrl(String url) {
		driver.get(url);
	}
	public void javaClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].click()", element);
	}
	public void sendkey(WebElement element, String string) {
				element.sendKeys(string);
	}
	public void screenShot() throws IOException {
		TakesScreenshot tss=(TakesScreenshot)driver;
		File srcFile=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\DEEPESH\\eclipse-workspace\\LiveDemo\\Screenshots\\Screenshot3.jpg");
		FileUtils.copyFile(srcFile, destination);

	}
	
		
	}




