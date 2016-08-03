package com.endava.pageObjects.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by lconstantin on 8/1/2016.
 */
public class JobDetailPage {
    @FindBy(xpath = "//dd[@class=\'job_total_views\']//span[@class=\'field_value\']")
    private WebElement totalViewsField;

    public Integer getTotalView(){
        String totalViewNumber = totalViewsField.getText();
        return Integer.parseInt(totalViewNumber);
    }
}
