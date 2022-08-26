package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PlanDetailsPageBase extends AbstractPage {
    public PlanDetailsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract PlansPageBase startPlan();
}
