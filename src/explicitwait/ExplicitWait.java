package explicitwait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kunal\\Desktop\\Testing\\Automation testing\\Browser\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://touch.facebook.com/?_rdr");
		driver.manage().window().maximize();
		driver.findElement(By.id("m_login_email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.id("m_login_password")).sendKeys("kunalshah");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));
		driver.findElement(By.name("login")).click();
		
	}

}
