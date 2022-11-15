package com.qaprosoft.carina.demo.mobile.gui.pages.ios.CatalogDemo;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.Enums.MenuItemsList;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.MenuPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MenuPageBase.class)
public class MenuPage extends MenuPageBase {

    @ExtendedFindBy(accessibilityId = "%s")
    private ExtendedWebElement menuItem;

    @ExtendedFindBy(iosPredicate = "label == 'Log Out' AND name == 'Log Out' AND value == 'Log Out'")
    private ExtendedWebElement logoutPopUpTitle;

    @ExtendedFindBy(iosPredicate = "label == 'Log Out' AND name == 'Log Out' AND type == 'XCUIElementTypeButton'")
    private ExtendedWebElement logoutButton;

    @ExtendedFindBy(iosPredicate = "label == 'You are successfully logged out.' AND name == 'You are successfully logged out.' AND value == 'You are successfully logged out.'")
    private ExtendedWebElement successMessage;

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoutPopUpMessagePresent() {
        return logoutPopUpTitle.isElementPresent();
    }

    public void clickLogOutButton() {
        logoutButton.click(3);
    };

    public boolean isUserLoggedOut(){
        return successMessage.isElementPresent(3);
    };
    @Override
    public AbstractPage openMenuListItem(MenuItemsList item) {
        menuItem.format(item.getOptionTitle()).click(3);
        return initPage(getDriver(), item.getPage());
    }

}
