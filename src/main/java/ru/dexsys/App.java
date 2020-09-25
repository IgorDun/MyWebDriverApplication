package ru.dexsys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.guru99.com/live-testing-project.html");
        MainPage page = new MainPage(driver);
        page.clickToHomeTitle();
    }
}
