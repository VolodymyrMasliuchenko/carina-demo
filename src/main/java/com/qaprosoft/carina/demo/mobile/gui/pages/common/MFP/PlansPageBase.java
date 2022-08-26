package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.PlanFilterButton;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.PlanFilteredCards;
import org.openqa.selenium.WebDriver;

public abstract class PlansPageBase extends AbstractPage implements IMobileUtils {
    public PlansPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPlanRadioButtonPresent(PlanFilterButton item);

    public abstract boolean isPlanFilteredCardPresent(PlanFilteredCards item);

    public abstract boolean isActivePlanCardPresent(PlanFilteredCards item);

    public abstract void clickPlanRadioButton(PlanFilterButton item);

    public abstract PlanDetailsPageBase openPlanCard(PlanFilteredCards item);

    public abstract void clickAddPlanButton();

    public abstract void clickClosePopUpButton();

    public abstract void endPlanIfPresent();

    public abstract boolean isItemByTextPresent(String text);

}
