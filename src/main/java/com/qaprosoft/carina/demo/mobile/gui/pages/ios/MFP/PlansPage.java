package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.PlanFilterButton;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.PlanFilteredCards;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlanDetailsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PlansPageBase.class)
public class PlansPage extends PlansPageBase {
    public PlansPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPlanRadioButtonPresent(PlanFilterButton item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isPlanFilteredCardPresent(PlanFilteredCards item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isActivePlanCardPresent(PlanFilteredCards item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void clickPlanRadioButton(PlanFilterButton item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public PlanDetailsPageBase clickPlanCard(PlanFilteredCards item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void addPlan() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void closePopUp() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void cancelPlanIfPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isItemByTextPresent(String text) {
        throw new NotImplementedException("Not implemented");
    }

}
