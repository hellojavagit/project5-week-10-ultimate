package BrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;
//program to lauch https://courses.ultimateqa.com/users/sign_in in chosen browsers from user
public class MultiBrowserTestingultimateqa {

    static WebDriver driver;
    static String browser;
    static String baseUrl;

    public static void main(String[] args){

        System.out.println("Enter your Browser");
        Scanner sc = new Scanner(System.in);
        browser = sc.nextLine();
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {

            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Please choose one of the following browsers: Chrome,Edge,Firefox ");
        }
        baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("multibrowserultimateqa@gmail.com");

        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("ultiqa1234");

        //closing the driver
        driver.close();
    }
}