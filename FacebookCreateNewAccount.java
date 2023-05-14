package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateNewAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Deepak");
		driver.findElement(By.name("lastname")).sendKeys("Kannan");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567891");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Testp@swd");
		
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select dayOption = new Select(dayDropDown);
		dayOption.selectByIndex(18);
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthOption = new Select(monthDropDown);
		monthOption.selectByValue("5");		
		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearOption = new Select(yearDropDown);
		yearOption.selectByVisibleText("1990");		
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.name("websubmit")).click();
				
	}

}
