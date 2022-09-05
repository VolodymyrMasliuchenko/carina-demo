package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.SharingAndPrivacyOptions;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PrivacyCenterPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.SharingAndPrivacyPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SharingAndPrivacyPageBase.class)
public class SharingAndPrivacyPage extends SharingAndPrivacyPageBase {

    @FindBy(xpath = "(//android.widget.TextView[@text='Sharing and Privacy Settings'])[1]")
    private ExtendedWebElement sharingAndPrivacyPageTitle;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement sharingAndPrivacyOption;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/android.widget.ImageButton")
    private ExtendedWebElement backButton;

    public SharingAndPrivacyPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return sharingAndPrivacyPageTitle.isElementPresent(3);
    }

    @Override
    public AbstractPage clickSharingAndPrivacyOption(SharingAndPrivacyOptions option) {
        sharingAndPrivacyOption.format(option.getText()).click(3);
        return initPage(getDriver(), option.getPage());
    }

    @Override
    public PrivacyCenterPageBase clickBackButton() {
        backButton.click(3);
        return initPage(getDriver(), PrivacyCenterPageBase.class);
    }

}
