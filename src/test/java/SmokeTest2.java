import baseEntity.BaseTest;
import org.testng.annotations.Test;

public class SmokeTest2 extends BaseTest {
    @Test
    public void login() {
        logger.error("Login method started working!");

        LoginStep loginStep = new LoginStep(browsersService);
        loginStep.login2("atrostyanko+master@gmail.com", "QqtRK9elseEfAk6ilYcJ");
    }
}
