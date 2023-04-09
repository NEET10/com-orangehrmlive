package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //Set up Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open the URL
       driver.get(baseUrl);
        //Print the title of the page
       System.out.println(driver.getTitle());
        //print the current URL
        System.out.println("Current URL: "+driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source: "+ driver.getPageSource());
        //Find the Email field Elements
       driver.findElement(By.name("username")).sendKeys("boss@gmail.com");
        //Find the password field Element
      //  driver.findElement(By.name("password")).sendKeys("Boss123");
        //Close the browser
        //driver.close();



    }
}
