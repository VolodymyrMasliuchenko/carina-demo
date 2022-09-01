package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.CustomDashboardItems;
import org.openqa.selenium.WebDriver;

public abstract class CustomDashboardPageBase extends AbstractPage {
    public CustomDashboardPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage chooseDashboardItem(CustomDashboardItems item);

    public abstract void closePopUp();

}