package Pages;

import Generic.WebCommands;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class HotelsHomePagePOM extends WebCommands {
    WebDriverWait wait;
    private int nSelectedAdults = 2;
    private int nSelectedChildren;
    int indPickedMonth = 0;

    By guestsButton = By.xpath("//span[text()='Guests']");
    By addAdults = By.xpath("//label[text()='Adults:']/following::button[2]");
    By applyButtonInRoomOptions = By.xpath("//button[@aria-label='Apply']");
    By roomOptionsCornerText = By.xpath("//footer[@class='modal-ft']/div");
    By totalAmountOfGuests = By.xpath("//span[text()='Guests']/following-sibling::span");
    By addChildren = By.xpath("//label[text()='Children:']/following::button[2]");
    By childrenAgeDropdownsList = By.xpath("//select[contains(@name,'age')]");
    By listOfChildren = By.xpath("//label[contains(text(),'child')]");





    public void launchHotels() {
        WebCommands.openHotels();
    }
    public void clickOnGuestsOnHomePage() {
        wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(guestsButton));
        clickThis(guestsButton);
    }

    public void selectNumberOfChildren(String number) {
        int n = Integer.parseInt(number);
        nSelectedChildren += n;
        for (int i = 0; i < n; i++) {
            clickThis(addChildren);
            sleep(2000);
        }
    }

    public void selectAgeForChild(String numberOfChild, String ageOfChild) {
        List<WebElement> dropdowns = getElements(childrenAgeDropdownsList);
        List<WebElement> children = getElements(listOfChildren);
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).getText().contains(numberOfChild)) {
                Select select = new Select(dropdowns.get(i));
                sleep(2000);
                select.selectByValue(ageOfChild);
                sleep(2000);
            }
        }
    }


    public void selectNumberOfAdults(String number) {
        int n = Integer.parseInt(number);
        nSelectedAdults += n;
        for (int i = 0; i < n; i++) {
            clickThis(addAdults);
            sleep(2000);
        }
    }

    public boolean isNumberOfAdultsInRoomOptionsSameAsInterred() {
        return nSelectedAdults == getNumberOfAdultsInRoomOptionsWindowCorner();
    }

    public void clickOnApplyOnRoomOptions() {
        sleep(2000);
        clickThis(applyButtonInRoomOptions);
    }

    public int getNumberOfAdultsInRoomOptionsWindowCorner() {
        String cornerText = getElementText(roomOptionsCornerText);
        int indOfA = cornerText.indexOf("A");
        return Integer.parseInt(cornerText.substring(indOfA - 2, indOfA - 1));
    }

    public int getNumberOfChildrenInRoomOptionsWindowCorner() {
        String cornerText = getElementText(roomOptionsCornerText);
        int indOfC = cornerText.indexOf("C");
        return Integer.parseInt(cornerText.substring(indOfC - 2, indOfC - 1));
    }

    public boolean isNumberOfChildrenInRoomOptionsSameAsInterred() {
        return nSelectedChildren == getNumberOfChildrenInRoomOptionsWindowCorner();
    }



    public int getTotalAmountOfGuests() {
        int indOfG = getElementText(totalAmountOfGuests).toLowerCase().indexOf("g");
        String number = getElementText(totalAmountOfGuests).substring(indOfG - 2, indOfG - 1);
        return Integer.parseInt(number);
    }


    public int getNSelectedAdults() {
        return nSelectedAdults;
    }



    public int getNSelectedChildren() {
        return nSelectedChildren;
    }




























}
