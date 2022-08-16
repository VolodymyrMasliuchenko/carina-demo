package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class QuickAddPageBase extends AbstractPage {
    public QuickAddPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract DiaryPageBase addQuickFood(String fat, String carbs, String protein);

}
