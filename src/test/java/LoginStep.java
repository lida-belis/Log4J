import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import models.User;

public class LoginStep extends BaseStep {
    public LoginStep(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void login1(User user) {
        LoginPage loginPage = new LoginPage(browsersService);

        loginPage.emailField.sendKeys(user.getUsername());
        loginPage.passwordField.sendKeys(user.getPassword());
        loginPage.loginButton.click();
    }

    @Step
    public void login2(String username, String password) {
        LoginPage loginPage = new LoginPage(browsersService);

        loginPage.emailField.sendKeys(username);
        loginPage.passwordField.sendKeys(password);
        loginPage.loginButton.click();
    }
}
