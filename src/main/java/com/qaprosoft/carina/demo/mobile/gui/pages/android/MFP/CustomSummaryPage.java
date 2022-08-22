package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CustomSummaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.CustomSummaryPageItems;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CustomSummaryPageBase.class)
public class CustomSummaryPage extends CustomSummaryPageBase {

    @ExtendedFindBy(accessibilityId = "Done")
    private ExtendedWebElement doneButton;

    @FindBy(xpath = "//*[contains(@resource-id, 'com.myfitnesspal.android:id/%s')]")
    private ExtendedWebElement nutrientItem;

    public CustomSummaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase submitSettings() {
        doneButton.click(3);
        return initPage(getDriver(), DiaryPageBase.class);
    }

    @Override
    public boolean isNutrientByNameChecked(CustomSummaryPageItems customSummaryPageItems) {
        swipe(nutrientItem.format(customSummaryPageItems.getId()), Direction.VERTICAL, 3,1000);
        return nutrientItem.format(customSummaryPageItems.getId()).isChecked();
    }

    @Override
    public void checkNutrient(CustomSummaryPageItems customSummaryPageItems) {
        swipe(nutrientItem.format(customSummaryPageItems.getId()), Direction.VERTICAL, 3,1000);
        nutrientItem.format(customSummaryPageItems.getId()).check();
    }

    @Override
    public void uncheckNutrient(CustomSummaryPageItems customSummaryPageItems) {
        swipe(nutrientItem.format(customSummaryPageItems.getId()), Direction.VERTICAL, 3,1000);
        nutrientItem.format(customSummaryPageItems.getId()).uncheck();
    }

    @Override
    public boolean isDoneButtonActive() {
        return Boolean.parseBoolean(doneButton.getAttribute("enabled"));
    }

    @Override
    public boolean swipe(ExtendedWebElement element,Direction direction, int count, int duration) {
        return super.swipe(element, direction, count, duration);
    }
}
