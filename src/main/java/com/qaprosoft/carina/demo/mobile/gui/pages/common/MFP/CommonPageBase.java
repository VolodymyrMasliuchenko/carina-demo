package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.BottomMenu;
import org.openqa.selenium.WebDriver;

public abstract class CommonPageBase extends AbstractPage {
    public CommonPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isUserLoggedIn();

    public abstract AbstractPage openBottomMenuItem(BottomMenu menu);

    public abstract boolean isElementBottomMenuPresent(BottomMenu menu);

}
