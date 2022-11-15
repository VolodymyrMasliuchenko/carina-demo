package com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

import java.math.BigDecimal;

public abstract class CartPageBase extends AbstractPage {
    public CartPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isNoItemsInCartTitlePresent();

    public abstract void clickRemoveProductFromCart();

    public abstract BigDecimal calculateItemsPrice();

    public abstract BigDecimal getTotalPrice();
}
