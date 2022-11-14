package com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CartPageBase extends AbstractPage {

    public abstract boolean isNoItemsInCartTitlePresent();

    public abstract void clickRemoveProductFromCart();

    public abstract double calculateItemsPrice();

    public abstract double getTotalPrice();
    public CartPageBase(WebDriver driver) {
        super(driver);
    }
}
