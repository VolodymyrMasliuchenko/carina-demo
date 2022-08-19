package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CustomDashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.CustomDashboardItems;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CustomDashboardPageBase.class)
public class CustomDashboardPage extends CustomDashboardPageBase {

    @FindBy(xpath = "//android.widget.TextView[@text='Custom Dashboard']")
    private ExtendedWebElement customDashboardPageTitle;

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.myfitnesspal.android:id/" + "%s']/android.widget.RadioButton")
    private ExtendedWebElement dashboardItem;

    @FindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text='Going Low Carb?']")
    private ExtendedWebElement popUp;

    @FindBy(id = "com.myfitnesspal.android:id/close_btn")
    private ExtendedWebElement closePopUpButton;

    public CustomDashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return customDashboardPageTitle.isElementPresent();
    }

    @Override
    public AbstractPage chooseDashboardItem(CustomDashboardItems item) {
        dashboardItem.format(item.getAndroidId()).click(1);
        return initPage(getDriver(), item.getPage());
    }

    @Override
    public void closePopUp() {
        closePopUpButton.clickIfPresent(3);
    }


}
