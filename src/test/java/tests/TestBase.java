package tests;

import com.codeborne.selenide.Selenide;
import config.WebDriverConfig;
import config.ConfigReader;
import config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase {
    private static final WebDriverConfig webConfig = ConfigReader.Instance.read();

    @BeforeAll
    static void setUp() {
        WebDriverProvider webDriverProvider = new  WebDriverProvider(webConfig);
        webDriverProvider.webConfig();
    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }
}
