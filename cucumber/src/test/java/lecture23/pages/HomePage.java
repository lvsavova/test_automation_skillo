package lecture23.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public static final String URL = "http://training.skillo-bg.com:4200/posts/all";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(URL);
    }
}
