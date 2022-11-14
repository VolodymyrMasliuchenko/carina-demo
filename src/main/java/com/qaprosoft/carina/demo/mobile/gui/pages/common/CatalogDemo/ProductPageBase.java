package com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ProductPageBase extends AbstractPage {

    public abstract void clickAddToCartButton();
    public ProductPageBase(WebDriver driver) {
        super(driver);
    }
}
