package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.google.com");*/
//        WebDriverManager.edgedriver().setup();
        System.setProperty("webdriver.edge.driver","/Users/meera496/Desktop/MShaik/Project_Software/Selenium_Drivers/msedgedriver");
        WebDriver driver1= new EdgeDriver();
        driver1.get("http://www.google.com");
        driver1.quit();
        // Hi man this is my branch so use this to do some useful things

    }
}