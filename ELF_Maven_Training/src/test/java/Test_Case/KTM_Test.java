package Test_Case;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class KTM_Test {
		
		
		
		@Test
		public void ktm() {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.ktm.com/en-in.html");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.close();
			
		}

	}
