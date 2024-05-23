package eswarinterviewquestions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) {   
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Navigate to a website
	            driver.get("https://www.example.com");

	            // Take screenshot
	            File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            
	            // Specify the location where the screenshot will be saved
	           // File destinationFile = new File("C:\\Users\\Rakshitha\\Documents\\Shortcut to Documents (OneDrive - Personal).lnk");

	            
				// Save the screenshot to the specified location
	           // FileHandler.copy(screenshot, destinationFile);
               FileUtils.copyFile(f1, new File("D:\\error.png"));
	          //  System.out.println("Screenshot taken and saved as: " + destinationFile.getAbsolutePath());
	        } catch (IOException e) {
	            System.err.println("Error while taking screenshot: " + e.getMessage());
	        } finally {
	            // Clean up and close the browser
	            driver.quit();
	        }
	}

}
