package DropDown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
 

public class FBDropdownMenu {
	@Test
	public void LaunchFB() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\DXC Selenium Automation Testing\\DropDownBoxesInFB\\SeleniumBrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/reg/");
		
		WebElement month_Dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_Dropdown);
		
		List<WebElement> month_List = month_dd.getOptions();
		int total_Month = month_List.size();
		System.out.println("Total Months is List Box:" + total_Month);
		
	}
	

}
