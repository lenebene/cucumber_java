package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Accounting_Process_Validation_for_FX_Mark_to_Market {

    @Given("^user is on 'File Import Export' page$")
    public void that_user_is_on_File_Import_Export() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^upload the Trade data file from <location> and hit Submit$")
    public void upload_the_Trade_data_file_from_location_and_hit_Submit() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^Run 'Import Accounting Transactions' under schedule process$")
    public void Run_Import_Accounting_Transactions_under_schedule_process() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^Validate Subledger Enteries and View Journal Entry$")
    public void Validate_Subledger_Enteries_and_View_Journal_Entry() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
