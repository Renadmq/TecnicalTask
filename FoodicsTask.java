package foodics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 

public class FoodicsTask {
	public static void main(String[] args) {
		 
        WebDriver driver = new FirefoxDriver();
        String appUrl = "https://google.com";
        driver.get(appUrl);

        driver.manage().window().maximize();
        String expectedTitle = "Google";

        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle))
        {
               System.out.println("Verification Successful - The correct title is displayed on the web page.");
        }
        else
        {
               System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
        }

  
        boolean submitbuttonPresence=driver.findElement(By.id("gbqfba")).isDisplayed();
        System.out.println(submitbuttonPresence);

      
        WebElement searchTextBox = driver.findElement(By.id("gbqfq"));
        searchTextBox.clear();
        searchTextBox.sendKeys("Selenium");

   
        boolean searchIconPresence = driver.findElement(By.id("gbqfb")).isDisplayed();
        boolean searchIconEnabled = driver.findElement(By.id("gbqfb")).isEnabled();

        if (searchIconPresence==true && searchIconEnabled==true)
        {


driver.findElement(By.id("gbqfq")sendKeys("Selenium");

int count = driver.findElements(By.VisibilityConditions("https://google.com")).size();

Assert.assertTrue(count>=1);
System.out.println("Count is greater than or equal to 1. Count is: "+count);

        driver.close();
        System.out.println("Test script executed successfully.");
         System.exit(0);
 }

}
