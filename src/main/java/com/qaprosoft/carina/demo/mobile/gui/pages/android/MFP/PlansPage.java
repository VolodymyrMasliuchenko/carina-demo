package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.PlanFilterButton;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.PlanFilteredCards;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlanDetailsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PlansPageBase.class)
public class PlansPage extends PlansPageBase {
    @FindBy(xpath = "(//android.widget.TextView[@text='Plans'])[1]")
    private ExtendedWebElement plansPageTitle;

    @FindBy(id = "com.myfitnesspal.android.plans:id/welcomeActionBtn")
    private ExtendedWebElement confirmPopUpButton;

    @FindBy(id = "com.myfitnesspal.android.plans:id/action_show_plans_hub")
    private ExtendedWebElement addPlanButton;

    @FindBy(xpath = "//android.widget.RadioButton[@text='%s']")
    private ExtendedWebElement planRadioButton;

    @FindBy(id = "com.myfitnesspal.android.plans:id/task_day_more_menu")
    private ExtendedWebElement planMoreOptionButton;

    @FindBy(xpath = "//android.widget.TextView[@text='End Plan']")
    private ExtendedWebElement moreOptionEndPlanButton;

    @FindBy(id = "com.myfitnesspal.android.plans:id/endPlan")
    private ExtendedWebElement endPlanButton;

    @FindBy(xpath = "//*[contains(@text, '%s')]")
    private ExtendedWebElement elementWithText;

    public PlansPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPlanRadioButtonPresent(PlanFilterButton item) {
        return planRadioButton.format(item.getButtonName()).isElementPresent(3);
    }

    @Override
    public boolean isPlanFilteredCardPresent(PlanFilteredCards item) {
        swipe(elementWithText.format(item.getText()), Direction.VERTICAL, 5, 500);
        return elementWithText.format(item.getText()).isElementPresent(3);
    }

    @Override
    public boolean isActivePlanCardPresent(PlanFilteredCards item) {
        return elementWithText.format(item.getText()).isElementPresent(3);
    }

    @Override
    public void clickPlanRadioButton(PlanFilterButton item) {
        planRadioButton.format(item.getButtonName()).click(3);
    }

    @Override
    public PlanDetailsPageBase clickPlanCard(PlanFilteredCards item) {
        swipe(elementWithText.format(item.getText()), Direction.VERTICAL, 30, 500);
        elementWithText.format(item.getText()).click(3);
        return initPage(getDriver(), PlanDetailsPageBase.class);
    }

    @Override
    public void addPlan() {
        addPlanButton.click(3);
    }

    @Override
    public void closePopUp() {
        confirmPopUpButton.click(3);
    }

    @Override
    public void cancelPlanIfPresent() {
        planMoreOptionButton.clickIfPresent(3);
        moreOptionEndPlanButton.clickIfPresent(3);
        endPlanButton.clickIfPresent(3);
    }

    @Override
    public boolean isItemByTextPresent(String text) {
        swipe(elementWithText.format(text), Direction.VERTICAL, 22,500);
        return  elementWithText.format(text).isElementPresent(3);
    }

    public boolean isPageOpened() {
        return plansPageTitle.isElementPresent(3);
    }

}
