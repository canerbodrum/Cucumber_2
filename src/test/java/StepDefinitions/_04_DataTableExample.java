package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _04_DataTableExample {

    @When("Write username {string}")
    public void writeUsername(String username) {
        System.out.println("username = " + username);
        System.out.println();
    }

    @And("Write username and Password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {
        System.out.println("username and password = " + username + " " + password);
        System.out.println();
    }

    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable items) {
        List<String> listItems = items.asList(String.class);

        for (String i : listItems)
            System.out.println("i = " + i);
        System.out.println();
    }

    @And("Write username and Password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable items) {
        List< List<String> > listItems= items.asLists(String.class);

        for (int i = 0; i < listItems.size(); i++) {
            System.out.println("listItems = " + listItems.get(i).get(0)+" "+
                    listItems.get(i).get(1) );
        }
    }
}
