package SmokeTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class chkTitleJunit {

	@Test
	void testTitle() {
		
WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");
		
		
		String expectedTitle="Registration"; // as per CR10887 , Sign up changed to Registration
		String actualTitle = driver.getTitle();
		
		boolean match= actualTitle.contains(expectedTitle);
		
		System.out.println(match);
		
		driver.close();
		
		org.junit.Assert.assertEquals(true, match);
		
		
	}

}
