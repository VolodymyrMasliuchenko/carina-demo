package com.qaprosoft.carina.demo.mobile.gui.pages.ios.CatalogDemo;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.CartPageBase;
import org.openqa.selenium.WebDriver;

import java.math.BigDecimal;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CartPageBase.class)
public class CartPage extends CartPageBase {

    @ExtendedFindBy(accessibilityId = "No Items")
    private ExtendedWebElement noItemsInCartTitle;

    @ExtendedFindBy(accessibilityId = "remove item")
    private ExtendedWebElement removeProductButton;

    @ExtendedFindBy(accessibilityId = "total price")
    private  ExtendedWebElement totalPrice;

    @ExtendedFindBy(iosPredicate = "label == '$29.99'")
    private ExtendedWebElement firstElementPrice;

    @ExtendedFindBy(iosPredicate = "label == '$9.99'")
    private ExtendedWebElement secondElementPrice;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isNoItemsInCartTitlePresent() {
        return noItemsInCartTitle.isElementPresent();
    }

    public void clickRemoveProductFromCart() {
        removeProductButton.click(3);
    }

    public BigDecimal calculateItemsPrice() {
        BigDecimal first = new BigDecimal(firstElementPrice.getAttribute("value").replace("$",""));
        BigDecimal second = new BigDecimal(secondElementPrice.getAttribute("value").replace("$",""));
        return first.add(second);
    }

    public BigDecimal getTotalPrice() {
        return new BigDecimal(totalPrice.getAttribute("value").replace("$",""));
    }

}
