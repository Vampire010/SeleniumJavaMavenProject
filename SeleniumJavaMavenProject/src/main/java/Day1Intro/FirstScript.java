package Day1Intro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		//WebDriver driver = new WebDriver(); //Error Case
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();

	}

}
