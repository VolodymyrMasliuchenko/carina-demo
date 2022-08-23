package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.MoreMenuItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.MoreMenuPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MoreMenuPageBase.class)
public class MoreMenuPage extends MoreMenuPageBase {

    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement moreMenuItem;

    @FindBy(id = "com.myfitnesspal.android:id/image")
    private ExtendedWebElement userLogo;

    public MoreMenuPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return userLogo.isElementPresent();
    }

    @Override
    public boolean isMenuItemPresent(MoreMenuItems menu) {
        swipe(moreMenuItem.format(menu.getOptionTitle()), Direction.VERTICAL, 3,1000);
        return moreMenuItem.format(menu.getOptionTitle()).isElementPresent(1);
    }

    @Override
    public AbstractPage clickMenuItem(MoreMenuItems menu) {
        swipe(moreMenuItem.format(menu.getOptionTitle()), Direction.VERTICAL, 3,1000);
        moreMenuItem.format(menu.getOptionTitle()).click(1);
        return initPage(getDriver(), menu.getPage());
    }

}
