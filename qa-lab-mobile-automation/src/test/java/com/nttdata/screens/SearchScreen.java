package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SearchScreen extends PageObject {

    @AndroidFindBy(id = "com.airbnb.android:id/start_button")
    private WebElement formSearch;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=Search destinations]")
    private WebElement searchInput;


    @AndroidFindBy(id = "//android.widget.ScrollView/android.view.View[3]/android.widget.Buton")
    private WebElement closeBtn;

    @AndroidFindBy(id = "2131431007")
    private WebElement resultText;

    public void clickSearchInput(){
        try{
            Thread.sleep(5000);

        } catch (Exception ex){
            System.out.println("error: "+ex.getMessage());
        }

        try{
            closeBtn.click();
            System.out.println("Se cerrará una  ventana");

        } catch (Exception ex){
            System.out.println("error: "+ex.getMessage());
        }
        formSearch.click();

        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(closeBtn));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        searchInput.click();
    }


    public String getResultText(){
        return resultText.getText();
    }
}
