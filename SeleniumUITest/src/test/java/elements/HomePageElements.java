package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class HomePageElements {

    public HomePageElements()

    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    
    @FindBy(xpath = "//body/nav[@id='navigation']/div[@class='container-fluid']/div[@id='navbarNavDropdown']/ul[@class='navbar-nav']/li[2]/a[1]")
    public WebElement PlatformButton;





}
