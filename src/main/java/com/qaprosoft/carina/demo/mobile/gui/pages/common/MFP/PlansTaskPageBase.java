package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PlansTaskPageBase extends AbstractPage {
    public PlansTaskPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickAddPlanButton();

    public abstract void clickClosePopUpButton();

    public abstract void endPlanIfPresent();

    public abstract EndPlanPageBase openEndPlanPage();

    public abstract LogWorkoutPageBase clickLogWorkoutButton();

}
