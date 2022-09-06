package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.EndPlanPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.LogWorkoutPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansTaskPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PlansTaskPageBase.class)
public class PlansTaskPage extends PlansTaskPageBase {

    @FindBy(xpath = "(//android.widget.TextView[@text='Plans'])[1]")
    private ExtendedWebElement plansPageTitle;

    @FindBy(id = "com.myfitnesspal.android.plans:id/welcomeActionBtn")
    private ExtendedWebElement letsDoThisPopUpButton;

    @FindBy(id = "com.myfitnesspal.android.plans:id/action_show_plans_hub")
    private ExtendedWebElement addPlanButton;

    @FindBy(id = "com.myfitnesspal.android.plans:id/task_day_more_menu")
    private ExtendedWebElement planMoreOptionButton;

    @FindBy(xpath = "//android.widget.TextView[@text='End Plan']")
    private ExtendedWebElement endPlanOption;

    @FindBy(id = "com.myfitnesspal.android.plans:id/endPlan")
    private ExtendedWebElement endPlanButton;

    @FindBy(xpath = "//*[contains(@text, '%s')]")
    private ExtendedWebElement elementWithText;

    @FindBy(id = "com.myfitnesspal.android.plans:id/logWorkout")
    private ExtendedWebElement logWorkoutButton;


    public PlansTaskPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickAddPlanButton() {
        addPlanButton.click(3);
    }

    @Override
    public void clickClosePopUpButton() {
        letsDoThisPopUpButton.click(3);
    }

    @Override
    public void endPlanIfPresent() {
        planMoreOptionButton.clickIfPresent(3);
        endPlanOption.clickIfPresent(3);
        endPlanButton.clickIfPresent(3);
    }

    @Override
    public EndPlanPageBase openEndPlanPage() {
        PlansTaskPageBase plansTaskPage = initPage(getDriver(), PlansTaskPageBase.class);
        plansTaskPage.clickClosePopUpButton();
        planMoreOptionButton.click(3);
        endPlanOption.click(3);
        return initPage(getDriver(), EndPlanPageBase.class);
    }

    @Override
    public LogWorkoutPageBase clickLogWorkoutButton() {
        logWorkoutButton.click(3);
        return initPage(getDriver(), LogWorkoutPageBase.class);
    }

}
