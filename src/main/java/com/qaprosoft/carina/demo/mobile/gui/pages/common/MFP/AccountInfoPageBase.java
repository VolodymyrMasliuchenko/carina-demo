package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AccountInfoPageBase extends AbstractPage {
    public AccountInfoPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getAccountUsername();

}
