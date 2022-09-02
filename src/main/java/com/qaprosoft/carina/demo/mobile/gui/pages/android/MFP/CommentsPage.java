package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CommentsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CommentsPageBase.class)
public class CommentsPage extends CommentsPageBase {

    @FindBy(xpath = "//android.widget.TextView[@text='Comments']")
    private ExtendedWebElement commentsPageTitle;

    @FindBy(id = "com.myfitnesspal.android:id/inputComment")
    private ExtendedWebElement inputCommentField;

    @FindBy(id = "com.myfitnesspal.android:id/textStatusText")
    private ExtendedWebElement commentText;

    @FindBy(id = "com.myfitnesspal.android:id/text")
    private ExtendedWebElement deleteCommentOption;

    @ExtendedFindBy(accessibilityId = "Post")
    private ExtendedWebElement confirmButton;

    @FindBy(id = "com.myfitnesspal.android:id/layoutCommentContainer")
    private ExtendedWebElement commentContainer;

    public CommentsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return commentsPageTitle.isElementPresent(3);
    }

    @Override
    public void addCommentPost(String comment) {
        inputCommentField.type(comment);
        confirmButton.click(3);
    }

    @Override
    public void deleteCommentPost() {
        longTap(commentContainer);
        deleteCommentOption.click(3);
    }

    @Override
    public String getCommentText() {
        return commentText.getText();
    }
}
