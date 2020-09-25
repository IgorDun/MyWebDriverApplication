package ru.dexsys;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    WebDriver webDriver;
    @Before
    public void initConditions() {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.guru99.com/live-testing-project.html");
    }
    @Test
    public void checkTitleChanging() {

        String firstTitle = webDriver.getTitle();
            System.out.println("The title is ->" + firstTitle);
        WebElement searchForm = webDriver.findElement(By.cssSelector("input[name=email]"));
        searchForm.sendKeys("Automation");
        webDriver.findElement(By.xpath("//input[@name='submit']")).click();


        String lastTitle = webDriver.getTitle();
        System.out.println("now this title ->" + webDriver.getTitle());
        Assert.assertNotEquals("Title must by that same", firstTitle, lastTitle);


    }
    @After
    public void closePage() {
        webDriver.close();
    }
}
