package SmokeTests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chkTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");
		
		
		String expectedTitle="Registration"; // as per CR10887 , Sign up changed to Registration
		String actualTitle = driver.getTitle();
		
		boolean match= actualTitle.contains(expectedTitle);
		
		System.out.println(match);
		
		driver.close();
		
		//org.junit.Assert.assertEquals(true, match);
		
	}

}
