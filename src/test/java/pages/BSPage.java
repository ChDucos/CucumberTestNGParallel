package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BSPage extends BasePage {


    public BSPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[text()='Get started free']")
    private WebElement btnGetStartedHere;




    public WebElement getBtnGetStartedHere(){
        return  btnGetStartedHere;
    }
}
