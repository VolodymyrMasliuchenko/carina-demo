package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.EndPlanPageBase;
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
    public PlanDetailsPageBase openPlanCard(PlanFilteredCards item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void clickAddPlanButton() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void clickClosePopUpButton() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void endPlanIfPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public EndPlanPageBase openEndPlanPage() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isItemByTextPresent(String text) {
        throw new NotImplementedException("Not implemented");
    }

}
