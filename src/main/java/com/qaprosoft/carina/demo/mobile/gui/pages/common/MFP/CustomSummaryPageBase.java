package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CustomSummaryPageBase extends AbstractPage {
    public CustomSummaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract DiaryPageBase submitSettings();

}
