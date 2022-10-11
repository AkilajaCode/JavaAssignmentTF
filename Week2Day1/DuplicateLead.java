package selenium;


	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.edge.EdgeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class DuplicateLead {
	
		
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
			driver.findElement(By.className("smallSubmit")).click();
			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.linkText("Duplicate Lead")).click();
			WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
			companyName.clear();
			companyName.sendKeys("testleaf");
			WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
			firstName.clear();
			firstName.sendKeys("akila");
			driver.findElement(By.className("smallSubmit")).click();
			String t = driver.getTitle();
			System.out.println(t);
			 String title1 = driver.getTitle();
			System.out.println("the tittle is " +driver.getTitle());
			}


}
