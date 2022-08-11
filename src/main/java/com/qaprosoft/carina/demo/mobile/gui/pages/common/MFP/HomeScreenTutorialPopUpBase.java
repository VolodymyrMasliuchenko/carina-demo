package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomeScreenTutorialPopUpBase extends AbstractPage {
    public HomeScreenTutorialPopUpBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isClosePopUpButtonPresent();

    public abstract boolean isLaunchQuickTipsButtonPresent();

    public abstract HomePageBase clickClosePopUpButton();

}
