package com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CatalogPageBase extends AbstractPage {

    public abstract void addProductToCart();

    public abstract void addTwoProductsInCart();

    public CatalogPageBase(WebDriver driver) {
        super(driver);
    }
}
