package Sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class WorkingWithSikuli {

	public static void main(String[] args) throws Exception {
		String path;
		WebDriver driver;
		
			path="C:\\Users\\Danda\\Desktop\\chromedriver.exe" ;
			System.setProperty("webdriver.chrome.driver", path);
			driver=new ChromeDriver();
			//driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("https://www.youtube.com/watch?v=z-KIpi_Nc38");
			Thread.sleep(2000);
			
			Screen s=new Screen();
			//SETTINGS
			Pattern settingsimg= new Pattern("settingsbutton.PNG");
			s.wait(settingsimg,2000);
			s.click();
			//PAUSE 
			Pattern pauseimg=new Pattern("pausebutton.PNG");
			s.wait(pauseimg,2000);
			s.click();
			//s.click();
			//PLAY
			Pattern playimg=new Pattern("playbutton.PNG");
			s.wait(playimg,5000);
			s.click();
			
	}

}
