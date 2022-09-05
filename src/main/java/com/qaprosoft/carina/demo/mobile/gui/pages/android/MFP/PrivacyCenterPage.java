package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.PrivacyCenterOptions;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PrivacyCenterPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.SettingsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PrivacyCenterPageBase.class)
public class PrivacyCenterPage extends PrivacyCenterPageBase {

    @FindBy(xpath = "(//android.widget.TextView[@text='Privacy Center'])[1]")
    private ExtendedWebElement privacyCenterPageTitle;

    @FindBy(id = "com.myfitnesspal.android:id/%s")
    private ExtendedWebElement privacyCenterOptions;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/android.widget.ImageButton")
    private ExtendedWebElement backButton;

    public PrivacyCenterPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return privacyCenterPageTitle.isElementPresent(3);
    }

    @Override
    public AbstractPage clickPrivacyCenterOption(PrivacyCenterOptions option) {
        privacyCenterOptions.format(option.getId()).click(3);
        return initPage(getDriver(), option.getPage());
    }

    @Override
    public SettingsPageBase clickBackButton() {
        backButton.click(3);
        return initPage(getDriver(), SettingsPageBase.class);
    }

}
