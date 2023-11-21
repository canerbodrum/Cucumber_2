package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _07_JDBCSteps {

    @Then("Send The query the database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorgu) {
        // Databaseden sorgu ile gerekli bilgileri aldık liste attık
        ArrayList<ArrayList<String>> dbList = DBUtility.getListData(sorgu);

        // UI dan gerekli bilgileri aldım Liste haline getirdim
        DialogContent dc = new DialogContent();
        List<WebElement> UIList = dc.nameList;

        for (int i = 0; i < dbList.size(); i++) {
            System.out.println(dbList.get(i).get(1).trim());
            System.out.println(UIList.get(i).getText().trim());

            Assert.assertEquals(dbList.get(i).get(1).trim(),
                    UIList.get(i).getText().trim());
        }
    }
}
