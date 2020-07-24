import baseEntity.BaseTest;
import models.User;
import org.testng.annotations.Test;

public class SmokeTest1 extends BaseTest {

    @Test
    public void login_1() {
        logger.info("Login method started working!");

        User user = new User.Builder()
                .withUsername("atrostyanko+master@gmail.com")
                .withPassword("QqtRK9elseEfAk6ilYcJ")
                .build();
        LoginStep loginStep = new LoginStep(browsersService);
        loginStep.login1(user);
    }

    @Test
    public void login_2() {
        logger.error("Login method started working!");

        LoginStep loginStep = new LoginStep(browsersService);
        loginStep.login2("atrostyanko+master@gmail.com", "QqtRK9elseEfAk6ilYcJ");
    }
}
