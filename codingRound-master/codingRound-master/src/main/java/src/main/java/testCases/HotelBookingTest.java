package src.main.java.testCases;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import src.main.java.generics.BaseClass;

public class HotelBookingTest extends BaseClass{

    @FindBy(linkText = "Hotels")
    static WebElement hotelLink;

    @FindBy(id = "Tags")
    static WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    static WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    static WebElement travellerSelection;

    @Test
    public void shouldBeAbleToSearchForHotels() {
    	PageFactory.initElements(driver, HotelBookingTest.class);
        hotelLink.click();
        localityTextBox.sendKeys("Indiranagar, Bangalore");
        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
        searchButton.click();
    }

}
