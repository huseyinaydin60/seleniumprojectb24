package com.cybertek.tests.groupsevenassignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        String url ="https://login2.nextbasecrm.com/auth/?login=yes&backurl=%2Fstream%2F";
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk14@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser"+ Keys.ENTER);
        String expectedUrl="https://login2.nextbasecrm.com/stream/";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        if(actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed"); }

         driver.quit();

    }


}
