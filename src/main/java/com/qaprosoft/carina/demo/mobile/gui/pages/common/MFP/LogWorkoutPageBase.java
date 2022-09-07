package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LogWorkoutPageBase extends AbstractPage {
    public LogWorkoutPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract PlansTaskPageBase clickCheckmarkIcon();

    public abstract boolean isWorkoutLoggedMessagePresent();
}
