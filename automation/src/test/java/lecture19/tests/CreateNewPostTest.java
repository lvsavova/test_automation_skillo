package lecture19.tests;

import lecture19.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewPostTest extends BaseTest {

    @Test
    public void createNewPost() throws Exception {
        System.out.println("1. Open homepage");
        HomePage homePage = new HomePage(driver);
        homePage.goTo();

        System.out.println("2. Login with existing user");
        HeaderContainer headerContainer = new HeaderContainer(driver);
        headerContainer.goToLogin();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("automation_user", "auto_pass");

        System.out.println("3. Go to profile page and get current posts count");
        headerContainer.goToProfile();
        ProfilePage profilePage = new ProfilePage(driver);
        int initialPostsCount = profilePage.getPostsCount();

        System.out.println("4. Go to new post");
        headerContainer.goToNewPost();

        System.out.println("5. Upload a new picture");
        NewPostPage newPostPage = new NewPostPage(driver);
        newPostPage.uploadFile(System.getProperty("user.dir") + "\\src\\test\\java\\resources\\upload\\pretty.png");

        System.out.println("6. Verify that the image is visible");
        newPostPage.checkImagePreview();

        System.out.println("7. Verify the image name is correct");
        Assert.assertEquals(newPostPage.getFileName(), "pretty.png");

        System.out.println("8. Populate the post caption");
        newPostPage.populateCaption("Image");

        System.out.println("9. Click create post");
        newPostPage.clickSubmit();

        System.out.println("10. Verify the post number has increased");
        int countAfterPostCreation = profilePage.getPostsCount();
        int expectedCount  = initialPostsCount + 1;
        Assert.assertTrue(countAfterPostCreation == expectedCount,
                "Incorrect post count! Expected count: " + expectedCount +
                "\nActual Count: " + countAfterPostCreation);

        System.out.println("11. Open the latest post");
        profilePage.openLastPost();

        System.out.println("12. Verify that correct username is displayed in post details");
        PostModal postModal = new PostModal(driver);
        Assert.assertEquals(postModal.getPostUser(), "automation_user",
                "Incorrect username!");
    }
}
