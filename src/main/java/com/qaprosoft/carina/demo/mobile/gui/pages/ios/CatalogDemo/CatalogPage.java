package com.qaprosoft.carina.demo.mobile.gui.pages.ios.CatalogDemo;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.CatalogPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.Enums.ProductItemsList;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CatalogPageBase.class)
public class CatalogPage extends CatalogPageBase {

    @ExtendedFindBy(iosPredicate = "label == 'Products' AND name == 'Products' AND value == 'Products'")
    private ExtendedWebElement catalogPageTitle;

    @ExtendedFindBy(accessibilityId = "%s")
    private ExtendedWebElement productItem;

    @ExtendedFindBy(accessibilityId = "Add To Cart button")
    private ExtendedWebElement addToCartButton;

    @ExtendedFindBy(accessibilityId = "navigation back button")
    private ExtendedWebElement navBackArrowButton;

    public CatalogPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(catalogPageTitle);
    }

    public void clickCatalogItem(ProductItemsList product) {
        productItem.format(product.getOptionTitle()).click(3);
    }

    public void clickAddToCartButton() {
        addToCartButton.click(3);
    }

    public void clickNavBackArrowButton() {
        navBackArrowButton.click(3);
    }
}
