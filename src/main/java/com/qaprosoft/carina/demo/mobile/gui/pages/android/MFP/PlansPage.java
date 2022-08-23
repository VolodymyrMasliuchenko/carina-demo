package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.PlanPageItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PlansPageBase.class)
public class PlansPage extends PlansPageBase {

    @FindBy(xpath = "(//android.widget.TextView[@text='Plans'])[1]")
    private ExtendedWebElement plansPageTitle;

    @FindBy(xpath = "//android.widget.RadioButton[@text='%s']")
    private ExtendedWebElement planRadioButton;

    @FindBy(xpath = "//*[contains(@text, '%s')]")
    private ExtendedWebElement elementWithText;

    public PlansPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPlanRadioButtonsPresent(PlanPageItems item) {
        swipe(planRadioButton.format(item.getButtonName()), Direction.VERTICAL, 3,1000);
        return planRadioButton.format(item.getButtonName()).isElementPresent(3);
    }

    @Override
    public boolean isItemByTextPresent(String text) {
        swipe(elementWithText.format(text), Direction.VERTICAL, 22,500);
        return  elementWithText.format(text).isElementPresent();
    }

    public boolean isPageOpened() {
        return plansPageTitle.isElementPresent();
    }

}
