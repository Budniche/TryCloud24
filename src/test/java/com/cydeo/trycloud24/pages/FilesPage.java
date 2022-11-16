package com.cydeo.trycloud24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage extends BasePage{

    @FindBy (xpath = "//span[@class='icon icon-add']")
    public WebElement addButton;

    @FindBy(xpath = "//a[@class='menuitem']/span[2]")
    public List<WebElement> dropdownMenu;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement inputNewFolderName;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public  WebElement submitButton;

    @FindBy(xpath = "//tbody[@id='fileList']/tr")
    public List<WebElement> filesListInfo;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addButtonFile;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadFileLink;
}
