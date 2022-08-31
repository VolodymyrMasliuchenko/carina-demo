package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.EndPlanPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.EndPlanCheckBoxItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = EndPlanPageBase.class)
public class EndPlanPage extends EndPlanPageBase {

    @FindBy(xpath = "//android.widget.TextView[@text='End Plan']")
    private ExtendedWebElement endPlanPageTitle;

    @FindBy(xpath = "//*[contains(@text, '%s')]")
    private ExtendedWebElement checkboxItem;

    @FindBy(id = "com.myfitnesspal.android.plans:id/endPlan")
    private ExtendedWebElement endPlanButton;

    public EndPlanPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void checkOption(EndPlanCheckBoxItems item) {
        checkboxItem.format(item.getText()).check();
    }

    @Override
    public void uncheckOption(EndPlanCheckBoxItems item) {
        checkboxItem.format(item.getText()).uncheck();
    }

    @Override
    public boolean isOptionChecked(EndPlanCheckBoxItems item) {
        return checkboxItem.format(item.getText()).isChecked();
    }

    @Override
    public boolean isOptionUnchecked(EndPlanCheckBoxItems item) {
        return checkboxItem.format(item.getText()).isChecked();
    }

    @Override
    public PlansPageBase endPlanAndReturnPlansPage() {
        endPlanButton.click(3);
        return initPage(getDriver(), PlansPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return endPlanPageTitle.isElementPresent();
    }
}
