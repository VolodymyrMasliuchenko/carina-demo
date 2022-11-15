package com.qaprosoft.carina.demo.mobile.gui.pages.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.CartPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.CatalogPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.MenuPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.ios.CatalogDemo.CartPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.ios.CatalogDemo.CatalogPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.ios.CatalogDemo.MenuPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class NavbarMenu extends AbstractUIObject {

    @ExtendedFindBy(accessibilityId = "%s")
    private ExtendedWebElement navbarMenuItem;

    @ExtendedFindBy(accessibilityId = "tab bar option cart")
    ExtendedWebElement cartIcon;

    @ExtendedFindBy(accessibilityId = "tab bar option catalog")
    ExtendedWebElement catalogIcon;

    @ExtendedFindBy(accessibilityId = "tab bar option menu")
    ExtendedWebElement menuIcon;

    public NavbarMenu(WebDriver driver) {
        super(driver);
    }

    public NavbarMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public CartPageBase getCartPage() {
        cartIcon.click(3);
        return new CartPage(getDriver());
    }

    public CatalogPageBase getCatalogPage() {
        catalogIcon.click(3);
        return new CatalogPage(getDriver());
    }
    public MenuPageBase getMenuPage() {
        menuIcon.click(3);
        return new MenuPage(getDriver());
    }
}
