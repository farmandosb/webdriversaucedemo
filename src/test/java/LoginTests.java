import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{

    @Test
    public void Login_LoginWithValidUser_HomeLoads() throws InterruptedException {
        this.driver.navigate().to("https://www.saucedemo.com/");
        WebElement TxtUsername = this.driver.findElement(By.id("user-name"));
        WebElement TxtPassword = this.driver.findElement(By.id("password"));
        WebElement BtnLogin = this.driver.findElement(By.id("login-button"));
        String username = "standard_user";
        String password = "secret_sauce";
        TxtUsername.sendKeys(username);
        TxtPassword.sendKeys(password);
        BtnLogin.click();
        Thread.sleep(5000);
    }
}
