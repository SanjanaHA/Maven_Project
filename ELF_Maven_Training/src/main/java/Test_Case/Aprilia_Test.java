package Test_Case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Aprilia_Test {
@Test
public void app() {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://apriliaindia.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.close();
		
	
}
}
