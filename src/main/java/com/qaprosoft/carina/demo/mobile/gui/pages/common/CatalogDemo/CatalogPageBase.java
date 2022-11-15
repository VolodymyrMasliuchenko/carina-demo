package com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.Enums.ProductItemsList;
import org.openqa.selenium.WebDriver;

public abstract class CatalogPageBase extends AbstractPage {

    public CatalogPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickCatalogItem(ProductItemsList product);

    public abstract void clickAddToCartButton();

    public abstract void clickNavBackArrowButton();

}
