package com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage {

    public abstract CatalogPageBase loginUser();

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }
}
