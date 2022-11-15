package com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.Enums.MenuItemsList;
import org.openqa.selenium.WebDriver;

public abstract class MenuPageBase extends AbstractPage {

    public MenuPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage openMenuListItem(MenuItemsList item);

    public abstract boolean isLogoutPopUpMessagePresent();

    public abstract void clickLogOutButton();

    public abstract boolean isUserLoggedOut();
}
