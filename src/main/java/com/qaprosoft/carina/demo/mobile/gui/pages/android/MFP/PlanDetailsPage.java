package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Intefaces.IConstants;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlanDetailsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PlanDetailsPageBase.class)
public class PlanDetailsPage extends PlanDetailsPageBase {

    @FindBy(xpath = "//android.widget.TextView[@text='Plan Details']")
    private ExtendedWebElement planDetailsPageTitle;

    @FindBy(id = "com.myfitnesspal.android.plans:id/btnStartPlan")
    private ExtendedWebElement startPlanButton;

    @FindBy(id = "com.myfitnesspal.android:id/positiveBtn")
    private ExtendedWebElement continueAddPlanButton;

    @FindBy(xpath = "//*[contains(@text, '%s')]")
    private ExtendedWebElement elementWithText;

    public PlanDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return planDetailsPageTitle.isElementPresent(3);
    }

    @Override
    public PlansPageBase clickStartPlanButton() {
        startPlanButton.click(3);
        continueAddPlanButton.clickIfPresent(3);
        return initPage(getDriver(), PlansPageBase.class);
    }

}
