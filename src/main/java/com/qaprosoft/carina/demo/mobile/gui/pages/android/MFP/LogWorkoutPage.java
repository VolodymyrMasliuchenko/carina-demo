package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.LogWorkoutPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansTaskPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LogWorkoutPageBase.class)
public class LogWorkoutPage extends LogWorkoutPageBase {

    @FindBy(xpath = "//android.widget.TextView[@text='Log Workout']")
    private ExtendedWebElement logWorkoutPageTitle;

    @ExtendedFindBy(accessibilityId = "Done")
    private ExtendedWebElement checkmarkIcon;

    @FindBy(id = "com.myfitnesspal.android:id/snackbar_text")
    private ExtendedWebElement workoutLoggedMessage;

    @FindBy(id = "com.myfitnesspal.android:id/snackbar_action")
    private ExtendedWebElement viewLinkOnMessage;
    public LogWorkoutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public PlansTaskPageBase clickCheckmarkIcon() {
        checkmarkIcon.click(3);
        return initPage(getDriver(), PlansTaskPageBase.class);
    }

    @Override
    public boolean isWorkoutLoggedMessagePresent() {
        return workoutLoggedMessage.isElementPresent(1);
    }

    @Override
    public DiaryPageBase clickViewLinkOnPopUpMessage() {
        viewLinkOnMessage.click(3);
        return initPage(getDriver(), DiaryPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return logWorkoutPageTitle.isElementPresent(3);
    }
}
