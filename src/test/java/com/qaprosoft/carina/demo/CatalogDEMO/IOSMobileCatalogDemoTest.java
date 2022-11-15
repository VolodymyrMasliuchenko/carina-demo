package com.qaprosoft.carina.demo.CatalogDEMO;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.CartPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.CatalogPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.Enums.MenuItemsList;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.Enums.ProductItemsList;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.MenuPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.NavbarMenu;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.agent.core.annotation.TestRailCaseId;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IOSMobileCatalogDemoTest implements IAbstractTest, IMobileUtils {
    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Verify log in user.", value = {"mobile", "regression"})
    @TestRailCaseId("1")
    public void testLoginUser() {
        NavbarMenu navbarMenu = new NavbarMenu(getDriver());
        MenuPageBase menuPage = navbarMenu.getMenuPage();
        LoginPageBase loginPage = (LoginPageBase) menuPage.openMenuListItem(MenuItemsList.LOG_IN);
        loginPage.assertPageOpened();
        CatalogPageBase catalogPage = loginPage.loginUser();
        catalogPage.assertPageOpened();
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Verify log out user.", value = {"mobile", "regression"})
    @TestRailCaseId("2")
    public void testLogoutUser() {
        NavbarMenu navbarMenu = new NavbarMenu(getDriver());
        MenuPageBase menuPage = navbarMenu.getMenuPage();
        menuPage.openMenuListItem(MenuItemsList.LOG_OUT);
        Assert.assertTrue(menuPage.isAlertPresent(), "Logout alert isn't present!");
        menuPage.clickLogOutButton();
        Assert.assertTrue(menuPage.isUserLoggedOut(), "Success message isn't present, user isn't logged out!");
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Verify adding some product to cart.", value = {"mobile", "regression"})
    @TestRailCaseId("3")
    public void testAddProductToCart() {
        NavbarMenu navbarMenu = new NavbarMenu(getDriver());
        CartPageBase cartPage = navbarMenu.getCartPage();
        Assert.assertTrue(cartPage.isNoItemsInCartTitlePresent(), "Message about no items in cart is present, cart is empty!");
        CatalogPageBase catalogPage = navbarMenu.getCatalogPage();
        catalogPage.clickCatalogItem(ProductItemsList.SL_BACKPACK);
        catalogPage.clickAddToCartButton();
        navbarMenu.getCartPage();
        Assert.assertFalse(cartPage.isNoItemsInCartTitlePresent(), "Message about no items in cart isn't present, there are products in cart!");
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Verify removing product from cart.", value = {"mobile", "regression"})
    @TestRailCaseId("4")
    public void testRemoveProductFromCart() {
        NavbarMenu navbarMenu = new NavbarMenu(getDriver());
        CartPageBase cartPage = navbarMenu.getCartPage();
        Assert.assertTrue(cartPage.isNoItemsInCartTitlePresent(), "Message about no items in cart is present, cart is empty!");
        CatalogPageBase catalogPage = navbarMenu.getCatalogPage();
        catalogPage.clickCatalogItem(ProductItemsList.SL_BACKPACK);
        catalogPage.clickAddToCartButton();
        navbarMenu.getCartPage();
        Assert.assertFalse(cartPage.isNoItemsInCartTitlePresent(), "Message about no items in cart isn't present, there are products in cart!");
        cartPage.clickRemoveProductFromCart();
        Assert.assertTrue(cartPage.isNoItemsInCartTitlePresent(), "Message about no items in cart is present, cart is empty!");
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Verify total cost in a cart.", value = {"mobile", "regression"})
    @TestRailCaseId("5")
    public void testVerifyTotalCostInCart() {
        NavbarMenu navbarMenu = new NavbarMenu(getDriver());
        CatalogPageBase catalogPage = navbarMenu.getCatalogPage();
        catalogPage.clickCatalogItem(ProductItemsList.SL_BACKPACK);
        catalogPage.clickAddToCartButton();
        catalogPage.clickNavBackArrowButton();
        catalogPage.clickCatalogItem(ProductItemsList.SL_LIGHT);
        catalogPage.clickAddToCartButton();
        CartPageBase cartPage = navbarMenu.getCartPage();
        Assert.assertFalse(cartPage.isNoItemsInCartTitlePresent(), "Message about no items in cart isn't present, there are products in cart!");
        Assert.assertEquals(cartPage.calculateItemsPrice(), cartPage.getTotalPrice(), "Total price isn't match!");
    }
}
