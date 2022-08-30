package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.AccountPageNavbarItems;
import org.openqa.selenium.WebDriver;

public abstract class AccountPageBase extends AbstractPage {
    public AccountPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getAccountUsername();

    public abstract AbstractPage openNavbarItem(AccountPageNavbarItems item);

}
