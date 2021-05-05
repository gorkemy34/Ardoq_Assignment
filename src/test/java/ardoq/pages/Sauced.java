package ardoq.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauced {
    WebDriver driver;

    public Sauced(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    public WebElement userNameBox;
    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy(id = "login-button")
    public WebElement loginButton;
    @FindBy(tagName = "h3")
    public WebElement errorMessage;
    @FindBy(className = "product_sort_container")
    public WebElement filterDropdown;
    @FindBy(id = "item_5_title_link")
    public WebElement fleeceJacket;
    @FindBy(xpath = "(//div[@class='inventory_item_price'])[1]")
    public WebElement fleeceJacketPrice;
    @FindBy(id = "item_4_title_link")
    public WebElement backpack;
    @FindBy(xpath = "(//div[@class='inventory_item_price'])[2]")
    public WebElement backpackPrice;
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    public WebElement addButtonFleeceJacket;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addButtonBackpack;
    @FindBy(id = "shopping_cart_container")
    public WebElement cartButton;
    @FindBy(xpath = "(//div[@class='inventory_item_name'])[1]")
    public WebElement firstItemInCart;
    @FindBy(xpath = "(//div[@class='inventory_item_name'])[2]")
    public WebElement secondItemInCart;
    @FindBy(xpath = "//button[@id='checkout']")
    public WebElement checkoutButton;
    @FindBy(id = "postal-code")
    public WebElement zipCodeBox;
    @FindBy(id = "first-name")
    public WebElement firstNameBox;
    @FindBy(id = "last-name")
    public WebElement lastNameBox;
    @FindBy(id = "continue")
    public WebElement continueButton;
    @FindBy(xpath = "(//div[@class='summary_value_label'])[2]")
    public WebElement shippingInfoText;
    @FindBy(xpath = "(//div[@class='summary_value_label'])[1]")
    public WebElement paymentInfoText;
    @FindBy(className = "summary_total_label")
    public WebElement totalPrice;
    @FindBy(xpath = "//button[@id='finish']")
    public WebElement finishButton;

}