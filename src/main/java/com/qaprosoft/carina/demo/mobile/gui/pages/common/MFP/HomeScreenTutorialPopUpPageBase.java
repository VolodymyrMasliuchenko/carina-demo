package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomeScreenTutorialPopUpPageBase extends AbstractPage {
    public HomeScreenTutorialPopUpPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isClosePopUpButtonPresent();

    public abstract boolean isLaunchQuickTipsButtonPresent();

    public abstract DashboardPageBase clickClosePopUpButton();

}
