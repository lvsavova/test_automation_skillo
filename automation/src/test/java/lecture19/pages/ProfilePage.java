package lecture19.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProfilePage extends BasePage {

    public static final String URL = "http://training.skillo-bg.com:4200/users/";
    @FindBy(className = "profile-stat-count")
    WebElement postsCount;

    @FindBy(tagName = "app-post")
    List<WebElement> publicPosts;

    public ProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public int getPostsCount() {
        wait.until(ExpectedConditions.visibilityOf(postsCount));
        return Integer.parseInt(postsCount.getText());
    }

    public void openPostByIndex(int index) throws Exception {
        int postsCount = publicPosts.size();
        if (index >= postsCount) {
            throw new Exception("Trying to open post with non-existing index" + index + ".The posts count is " + postsCount);
        }
        clickElement(publicPosts.get(index));
    }

    public void openLastPost() throws Exception {
        openPostByIndex(publicPosts.size() - 1);
    }
}
