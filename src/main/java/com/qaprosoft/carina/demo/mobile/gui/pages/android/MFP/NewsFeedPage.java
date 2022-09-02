package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CommentsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.NewsFeedPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NewsFeedPageBase.class)
public class NewsFeedPage extends NewsFeedPageBase {

    @FindBy(xpath = "(//android.widget.TextView[@text='Newsfeed'])[1]")
    private ExtendedWebElement newsFeedPageTitle;

    @FindBy(id = "com.myfitnesspal.android:id/buttonLike")
    private ExtendedWebElement likePostButton;

    @FindBy(id = "com.myfitnesspal.android:id/textNumberOfLikes")
    private ExtendedWebElement countOfLikes;

    @FindBy(id = "com.myfitnesspal.android:id/layoutCommentButton")
    private ExtendedWebElement leaveCommentButton;

    public NewsFeedPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return newsFeedPageTitle.isElementPresent();
    }

    @Override
    public void likePostIfPresent() {
        swipe(likePostButton, Direction.VERTICAL, 20,500);
        likePostButton.clickIfPresent(3);
    }

    @Override
    public void unlikePostIfPresent() {
        swipe(likePostButton, Direction.VERTICAL, 20,500);
        likePostButton.clickIfPresent(3);
    }

    @Override
    public boolean isLikeCountPresent() {
        return countOfLikes.isElementPresent(3);
    }

    @Override
    public CommentsPageBase openPostCommentsPage() {
        swipe(leaveCommentButton, Direction.VERTICAL, 20,500);
        leaveCommentButton.click(3);
        return initPage(getDriver(), CommentsPageBase.class);
    }

}
