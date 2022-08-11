package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DashboardPageBase extends AbstractPage {
    public DashboardPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isUserAvatarPresent();

    public abstract AccountInfoPageBase clickUserAvatar();

}
