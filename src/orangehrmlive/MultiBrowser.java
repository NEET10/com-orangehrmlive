package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Edge";
    static WebDriver driver;
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver =new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver =new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong Browser name");
        }
        //Open the URL
        driver.get(baseUrl);
        //Get the title of the page
       System.out.println(driver.getTitle());
        //Get the Current URL
      System.out.println("Current URL: "+ driver.getCurrentUrl());
        //Get the page source
      System.out.println("Page source: "+ driver.getPageSource());
        //We give Implicit wait to driver// how to implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(01));
        //Get the Email to Email Field
     driver.findElement(By.name("username")).sendKeys("boss@gmail.com");
        //Get password to password field
       driver.findElement(By.name("password")).sendKeys("Boss123");
        //close the browser
        //driver.close();

    }

}
