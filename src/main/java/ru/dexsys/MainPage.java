package ru.dexsys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage {
    private final WebDriver webDriver;
    private  final WebDriverWait driverWait;
    private final String URI = "https://www.guru99.com/live-testing-project.html";
    private final int TIMEOUT = 30;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.manage().window().maximize();
        webDriver.get(URI);
        driverWait = new WebDriverWait(webDriver, TIMEOUT);
        PageFactory.initElements(webDriver, this);

    }

   @FindBy(xpath = "//span[text()='Home']")
    private WebElement home;

    public void clickToHomeTitle() {
        home.click();
    }
    public void exit() {
        webDriver.close();
    }

    public void wait(int timeout) {
        try {
            driverWait.wait(timeout);
        } catch (InterruptedException e) {

        }


    }
}

