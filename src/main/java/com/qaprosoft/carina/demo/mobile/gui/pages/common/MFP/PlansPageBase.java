package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.PlanFilterButton;
import org.openqa.selenium.WebDriver;

public abstract class PlansPageBase extends AbstractPage implements IMobileUtils {
    public PlansPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPlanRadioButtonPresent(PlanFilterButton item);
    public abstract boolean isItemByTextPresent(String text);

}
