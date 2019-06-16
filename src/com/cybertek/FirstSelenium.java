package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver",
//                "/Users/anar0140/Documents/selenium dependencies/drivers/chromedriver");
//
//        WebDriver  driver= new ChromeDriver();


        System.setProperty("webdriver.gecko.driver",
                "/Users/anar0140/Documents/selenium dependencies/drivers/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.close();




    }
}