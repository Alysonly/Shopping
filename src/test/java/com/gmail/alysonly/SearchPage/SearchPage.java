package com.gmail.alysonly.SearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;


public class SearchPage {

    public WebDriver driver;

    public SearchPage(WebDriver driver){

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Поиск поисковый строки
    @FindBy(name = "Ntt")
    private WebElement SearchLine;

    //ввод в поисковую строку значения
    public void inputProduct(String Product)
    {
        SearchLine.sendKeys(Product);
    }

    //Поиск кнопки "Поиск"
    @FindBy(css = "input[type=\"submit\"]")
    private WebElement searchButton;

    //Нажатие на поиск
    public void clickButton()
    {
        searchButton.click();
    }

    //Поиск кнопки добавление в корзину
    @FindBy (id = "js-form-submit-id")
    private WebElement AddBasket;

    //Добавление в корзину
    public void clickAdd()
    {
        AddBasket.click();
    }

}
