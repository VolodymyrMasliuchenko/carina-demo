package com.qaprosoft.carina.demo.mobile.gui.pages.ios.CatalogDemo;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.CartPageBase;
import org.openqa.selenium.WebDriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public double calculateItemsPrice() {
        double firstDouble = Double.parseDouble(firstElementPrice.getAttribute("value").replace("$",""));
        double secondDouble = Double.parseDouble(secondElementPrice.getAttribute("value").replace("$",""));
        return firstDouble + secondDouble;
    }

    public double getTotalPrice() {
        return Double.parseDouble(totalPrice.getAttribute("value").replace("$",""));
    }

}
