package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.QuickAddPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = QuickAddPageBase.class)
public class QuickAddPage extends QuickAddPageBase {
    public QuickAddPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public int getQuickAddCalories() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public DiaryPageBase submitNutrient() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void quickAddNutrient(int fatInt, int carbsInt, int proteinInt) {
        throw new NotImplementedException("Not implemented");
    }
}
