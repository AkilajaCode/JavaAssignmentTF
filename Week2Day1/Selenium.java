package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Akila testing");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Akila");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("karthikeyan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aki");
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("SoftwareTesting");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Quality product");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aki@gmail.com");
		driver.findElement(By.name("submitButton")).sendKeys("Create Lead");
		 String title = driver.getTitle();
		System.out.println("the tittle is " +driver.getTitle());
		}

}
