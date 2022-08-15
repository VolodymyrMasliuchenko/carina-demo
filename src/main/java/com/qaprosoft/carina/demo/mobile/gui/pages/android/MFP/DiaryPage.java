package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DiaryPageBase.class)
public class DiaryPage extends DiaryPageBase {

    @FindBy(xpath = "(//android.widget.TextView[@text='Diary'])[1]")
    private ExtendedWebElement diaryPageTitle;

    public DiaryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return diaryPageTitle.isElementPresent();
    }
}
