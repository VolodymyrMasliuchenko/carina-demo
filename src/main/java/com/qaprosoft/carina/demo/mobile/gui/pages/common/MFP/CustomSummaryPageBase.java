package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.CustomSummaryPageItems;
import org.openqa.selenium.WebDriver;

public abstract class CustomSummaryPageBase extends AbstractPage implements IMobileUtils {
    public CustomSummaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract DiaryPageBase submitSettings();

    public abstract boolean isNutrientByNameChecked(CustomSummaryPageItems customSummaryPageItems);

    public abstract void checkNutrient(CustomSummaryPageItems customSummaryPageItems);

}
