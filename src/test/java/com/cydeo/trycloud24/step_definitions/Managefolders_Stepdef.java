package com.cydeo.trycloud24.step_definitions;

import com.cydeo.trycloud24.pages.BasePage;
import com.cydeo.trycloud24.pages.FilesPage;
import com.cydeo.trycloud24.pages.LoginPage;
import com.cydeo.trycloud24.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Managefolders_Stepdef {

    FilesPage filesPage = new FilesPage();

    String newFolderName = "my new folder";

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginToPage("User24", "Userpass123" );

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String moduleToClick) {

        BasePage.chooseTheMenu(moduleToClick);

    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {

        filesPage.addButton.click();

    }

    @And("user click {string}")
    public void userClick(String optionToClick) {

        for(WebElement each : filesPage.dropdownMenu){
           if(each.getText().equalsIgnoreCase(optionToClick)){
               each.click();
            }
        }
    }
    @When("user write a folder name")
    public void user_write_a_folder_name() {

        filesPage.inputNewFolderName.sendKeys(newFolderName);

    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        filesPage.submitButton.click();
        BrowserUtils.waitFor(2);
    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {

        boolean isNameMatch = false;

        for(WebElement each: filesPage.filesListInfo){
            System.out.println(each.getAttribute("data-file"));
            if(each.getAttribute("data-file").equalsIgnoreCase(newFolderName)){
                isNameMatch = true;

            }
        }
        Assert.assertTrue(isNameMatch);
    }

}
