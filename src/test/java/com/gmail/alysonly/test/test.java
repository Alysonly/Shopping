package com.gmail.alysonly.test;

import com.gmail.alysonly.SearchPage.SearchPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test {

    public static WebDriver driver;
    public static SearchPage searchPage;

    @BeforeClass
    public static void setup()
    {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        searchPage = new SearchPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mvideo.ru/");
    }

    @Test
    public void test()
    {
        searchPage.inputProduct("galaxy S7");
        searchPage.clickButton();
        searchPage.clickAdd();
    }

    @AfterClass
    public static void quit() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        driver.quit();
    }

}
