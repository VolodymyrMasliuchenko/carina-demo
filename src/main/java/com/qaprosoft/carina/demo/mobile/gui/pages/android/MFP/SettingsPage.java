package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.SettingOptions;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.MoreMenuPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.SettingsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SettingsPageBase.class)
public class SettingsPage extends SettingsPageBase {

    @FindBy(xpath = "(//android.widget.TextView[@text='Settings'])[1]")
    private ExtendedWebElement settingsPageTitle;

    @FindBy(id = "com.myfitnesspal.android:id/%s")
    private ExtendedWebElement settingsOption;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/android.widget.ImageButton")
    private ExtendedWebElement backButton;

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return settingsPageTitle.isElementPresent(3);
    }

    @Override
    public AbstractPage clickSettingsOption(SettingOptions option) {
        swipe(settingsOption.format(option.getId()), Direction.VERTICAL, 10,500);
        settingsOption.format(option.getId()).click(3);
        return initPage(getDriver(), option.getPage());
    }

    @Override
    public MoreMenuPageBase clickBackButton() {
        backButton.click(3);
        return initPage(getDriver(), MoreMenuPageBase.class);
    }

}
