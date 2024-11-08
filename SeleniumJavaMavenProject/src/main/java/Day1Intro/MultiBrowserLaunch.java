package Day1Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserLaunch 
{
	public static WebDriver driver ;
	public static void launchBrowser(String browserType , String url)
	{
		//launch chrome edge firefox
	    if(browserType.equals("chrome"))
	    {
	    	driver = new ChromeDriver();	 		
	 		driver.get(url);
	 		driver.manage().window().maximize();
	    }
		else if(browserType.equals("firefox"))
		{
			driver = new FirefoxDriver();	 		
	 		driver.get(url);
	 		driver.manage().window().maximize();
		}
	    else if(browserType.equals("edge"))
	    {
	    	driver = new EdgeDriver();	 		
	 		driver.get(url);
	 		driver.manage().window().maximize();
	    	
	    }		
	}
	
	public static void CloseBrowser()
	{
		driver.quit();
	}

	public static void main(String[] args)
	{
		String testURL = "https://www.selenium.dev/selenium/web/web-form.html";
		launchBrowser("chrome",testURL);
		CloseBrowser();
		launchBrowser("edge",testURL);
		CloseBrowser();
		launchBrowser("firefox",testURL);
		CloseBrowser();


	}

}
