package BrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//program to open courses.ultimateqa.com in chrome browser
public class ChromeBrowserTestingUltimateqa {
    public static void main(String[] args) {

        String BaseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //setting up the chrome browser
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 2. Launch the URL in browser
        driver.get(BaseUrl);
        //maximize the window
        driver.manage().window().maximize();

        // 3.To Print  the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is : " + title);

        //4.Prints the current URL in Console
        System.out.println("Current URL is = " + driver.getCurrentUrl());
        System.out.println();
        //5.Prints the page source
        String ps = driver.getPageSource();
        System.out.println("Page Source is: " + ps);
        //6.Enter the email to email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("ultimatechrome@gmail.com");
        //7.Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("ulti1234");

        //8.Close the browser
         driver.close();
    }
}