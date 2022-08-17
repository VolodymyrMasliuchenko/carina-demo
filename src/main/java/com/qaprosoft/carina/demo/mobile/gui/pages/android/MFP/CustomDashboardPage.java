package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CustomDashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CustomSummaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.CustomDashboardItems;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CustomDashboardPageBase.class)
public class CustomDashboardPage extends CustomDashboardPageBase {

    @FindBy(xpath = "//android.widget.TextView[@text='Custom Dashboard']")
    private ExtendedWebElement customDashboardPageTitle;

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.myfitnesspal.android:id/" + "%s']/android.widget.RadioButton")
    private ExtendedWebElement dashboardItem;

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.myfitnesspal.android:id/rbCustomSummary']")
    private ExtendedWebElement customItem;

    @FindBy(id = "com.myfitnesspal.android:id/close_btn")
    private ExtendedWebElement closePopUpButton;

    public CustomDashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return customDashboardPageTitle.isElementPresent();
    }

    @Override
    public DiaryPageBase chooseDashboardItem(CustomDashboardItems item) {
        dashboardItem.format(item.getAndroidOption()).click();
        return initPage(getDriver(), DiaryPageBase.class);
    }

    @Override
    public CustomSummaryPageBase openCustomItem() {
        customItem.click(3);
        return initPage(getDriver(), CustomSummaryPageBase.class);
    }

    @Override
    public void closePopUp() {
        closePopUpButton.click(1);
    }


}
