package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.MoreMenuItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.MyPremiumToolsItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.MyPremiumToolsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyPremiumToolsPageBase.class)
public class MyPremiumToolsPage extends MyPremiumToolsPageBase {

    @FindBy(id = "com.myfitnesspal.android:id/tv_header_text")
    private ExtendedWebElement myPremiumToolsPageTitle;

    @FindBy(xpath = "//*[contains(@text, '%s')]")
    private ExtendedWebElement elementWithText;

    public MyPremiumToolsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return myPremiumToolsPageTitle.isElementPresent(1);
    }

    @Override
    public boolean isMyPremiumItemNamePresent(MyPremiumToolsItems item) {
        swipe(elementWithText.format(item.getName()), Direction.VERTICAL, 3,1000);
        return elementWithText.format(item.getName()).isElementPresent(3);
    }

    @Override
    public boolean isDescriptionPresent(MyPremiumToolsItems item) {
        swipe(elementWithText.format(item.getDescription()), Direction.VERTICAL, 3,1000);
        return elementWithText.format(item.getDescription()).isElementPresent(3);
    }

}
