package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.EndPlanCheckBoxItems;
import org.openqa.selenium.WebDriver;

public abstract class EndPlanPageBase extends AbstractPage {
    public EndPlanPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void checkOption(EndPlanCheckBoxItems item);

    public abstract void uncheckOption(EndPlanCheckBoxItems item);

    public abstract boolean isOptionChecked(EndPlanCheckBoxItems item);

    public abstract boolean isOptionUnchecked(EndPlanCheckBoxItems item);

    public abstract PlansPageBase endPlanAndReturnPlansPage();

}
