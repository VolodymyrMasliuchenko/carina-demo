package com.qaprosoft.carina.demo.mobile.gui.pages.ios.CatalogDemo;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.CatalogPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CatalogPageBase.class)
public class CatalogPage extends CatalogPageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Products\"`]")
    private ExtendedWebElement catalogPageTitle;

    @ExtendedFindBy(accessibilityId = "Sauce Labs Backpack")
    private ExtendedWebElement firstElementCatalog;

    @ExtendedFindBy(accessibilityId = "Sauce Labs Bike Light")
    private ExtendedWebElement secondElementCatalog;

    @ExtendedFindBy(accessibilityId = "Add To Cart button")
    private ExtendedWebElement addToCartButton;

    @ExtendedFindBy(accessibilityId = "navigation back button")
    private ExtendedWebElement arrowBackButton;

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return catalogPageTitle.isElementPresent();
    }

    public void addProductToCart() {
        firstElementCatalog.click(3);
        addToCartButton.click(3);
    }

    public void addTwoProductsInCart() {
        firstElementCatalog.click(3);
        addToCartButton.click(3);
        arrowBackButton.click(3);
        secondElementCatalog.click(3);
        addToCartButton.click(3);
    }
}
