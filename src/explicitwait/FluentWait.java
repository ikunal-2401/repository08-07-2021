package explicitwait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kunal\\Desktop\\Testing\\Automation testing\\Browser\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpratice.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
	}

}
