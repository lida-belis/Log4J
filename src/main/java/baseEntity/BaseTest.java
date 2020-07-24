package baseEntity;

import core.BrowsersService;
import core.ReadProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public Logger logger = LogManager.getLogger();

    public BrowsersService browsersService;
    public ReadProperties properties;

    @BeforeMethod
    public void openPage() {
        browsersService = new BrowsersService();
        properties = new ReadProperties();
        browsersService.getDriver().get(properties.getURL());
    }

    @AfterMethod
    public void closePage() {
        browsersService.getDriver().quit();
        browsersService = null;
    }
}
