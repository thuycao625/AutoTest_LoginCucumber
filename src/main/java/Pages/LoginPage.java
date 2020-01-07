package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//form/div[3]/button")
    WebElement btnSubmit;

    public void userAccount (String uname, String pword){
        this.username.clear();
        this.username.sendKeys(uname);
        this.password.clear();
        this.password.sendKeys(pword);
    }


    public void clickSubmit() {
        btnSubmit.click();
        System.out.println("helooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

    }

}
