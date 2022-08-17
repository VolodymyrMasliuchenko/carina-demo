package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CustomSummaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CustomSummaryPageBase.class)
public class CustomSummaryPage extends CustomSummaryPageBase {

    @ExtendedFindBy(accessibilityId = "Done")
    private ExtendedWebElement doneButton;

    public CustomSummaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase submitSettings() {
        doneButton.click(3);
        return initPage(getDriver(), DiaryPageBase.class);
    }


}
