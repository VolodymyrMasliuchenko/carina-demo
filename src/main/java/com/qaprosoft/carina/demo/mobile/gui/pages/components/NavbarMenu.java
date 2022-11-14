package com.qaprosoft.carina.demo.mobile.gui.pages.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.Enums.NavbarItems;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class NavbarMenu extends AbstractUIObject {

    @ExtendedFindBy(accessibilityId = "%s")
    private ExtendedWebElement navbarMenuItem;

    public NavbarMenu(WebDriver driver) {
        super(driver);
    }

    public NavbarMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void openBottomMenuItem(NavbarItems item) {
        navbarMenuItem.format(item.getOptionTitle()).click(3);
    }
}
