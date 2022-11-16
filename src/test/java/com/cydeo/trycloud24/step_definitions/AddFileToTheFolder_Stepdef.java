package com.cydeo.trycloud24.step_definitions;

import com.cydeo.trycloud24.pages.FilesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AddFileToTheFolder_Stepdef {

    FilesPage filesPage = new FilesPage();
    String fileName = "screen.png";


    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {
    for(WebElement each : filesPage.filesListInfo){
    if(each.getAttribute("data-type").equalsIgnoreCase("dir")){
        each.click();
    }
    }
    }
    @When("user clicks the add icon on the top page")
    public void user_clicks_the_add_icon_on_the_top_page() {
        filesPage.addButtonFile.click();

    }
    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {

        filesPage.uploadFileLink.sendKeys("/Users/Shared/Desktop/" + fileName);


    }
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {

        boolean isNameMatch = false;

        for(WebElement each: filesPage.filesListInfo){
            System.out.println(each.getAttribute("data-file"));
            if(each.getAttribute("data-file").equalsIgnoreCase(fileName)){
                isNameMatch = true;

            }
        }
        Assert.assertTrue(isNameMatch);

    }

}
