package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.NewsFeedSharingCheckboxItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.NewsFeedSharingPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.SharingAndPrivacyPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NewsFeedSharingPageBase.class)
public class NewsFeedSharingPage extends NewsFeedSharingPageBase {

    @FindBy(xpath = "(//android.widget.TextView[@text='News Feed Sharing'])[1]")
    private ExtendedWebElement newsFeedSharingPageTitle;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='%s']")
    private ExtendedWebElement checkboxItems;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/android.widget.ImageButton")
    private ExtendedWebElement backButton;

    public NewsFeedSharingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return newsFeedSharingPageTitle.isElementPresent(3);
    }

    @Override
    public void selectCheckboxItem(NewsFeedSharingCheckboxItems item) {
        checkboxItems.format(item.getText()).check();
    }

    @Override
    public void deselectCheckboxItem(NewsFeedSharingCheckboxItems item) {
        checkboxItems.format(item.getText()).uncheck();
    }

    @Override
    public boolean isCheckboxItemSelected(NewsFeedSharingCheckboxItems item) {
        return checkboxItems.format(item.getText()).isChecked();
    }

    @Override
    public SharingAndPrivacyPageBase clickBackButton() {
        backButton.click(3);
        return initPage(getDriver(), SharingAndPrivacyPageBase.class);
    }

}
