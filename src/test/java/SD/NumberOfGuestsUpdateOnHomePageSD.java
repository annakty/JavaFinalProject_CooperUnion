package SD;
import Pages.HotelsHomePagePOM;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class NumberOfGuestsUpdateOnHomePageSD {

    HotelsHomePagePOM hotelsHomePagePOM = new HotelsHomePagePOM();

    @Given("I am on Hotels Homepage")
    public void launchHotels() {
        hotelsHomePagePOM.launchHotels();
    }

    @When("I click on Guests button on Homepage")
    public void clickOnGuestsOnHomePage() {
        hotelsHomePagePOM.clickOnGuestsOnHomePage();
    }

    @And("I add '(.+)' Adults")
    public void selectNumberOfAdults(String number) {
        hotelsHomePagePOM.selectNumberOfAdults(number);
    }

    @And("I add '(.+)' Children")
    public void selectNumberOfChildren(String number) {
        hotelsHomePagePOM.selectNumberOfChildren(number);
    }

    @And("I select age for child number '(.+)' is '(.+)'")
    public void selectAgeForChild(String numberOfChild, String ageOfChild) {
        hotelsHomePagePOM.selectAgeForChild(numberOfChild, ageOfChild);
    }

    @Then("I verify that number of adults and children same as selected")
    public void verifyNumberOfAdultsAndChildren() {
        Assert.assertTrue(hotelsHomePagePOM.isNumberOfAdultsInRoomOptionsSameAsInterred(),
                "Number of Adults in bottom left corner of Room options is not matching selected number");
        Assert.assertTrue(hotelsHomePagePOM.isNumberOfChildrenInRoomOptionsSameAsInterred(),
                "Number of Children in bottom left corner of Room options is not matching selected number");
    }

    @When("I click on Apply on Room options")
    public void clickOnApply() {
        hotelsHomePagePOM.clickOnApplyOnRoomOptions();
    }

    @Then("I verify that total amount of guests is the same as selected in Guest rooms")
    public void verifyTotalNumberOfGuests() {
        Assert.assertEquals(hotelsHomePagePOM.getTotalAmountOfGuests(),
                hotelsHomePagePOM.getNSelectedAdults() + hotelsHomePagePOM.getNSelectedChildren(),
                "Total guests is not as selected");
    }
}