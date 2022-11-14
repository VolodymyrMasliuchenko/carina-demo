package com.qaprosoft.carina.demo.CatalogDEMO;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.CartPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.CatalogPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.Enums.MenuItemsList;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.Enums.NavbarItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.MenuPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.components.NavbarMenu;
import com.qaprosoft.carina.demo.mobile.gui.pages.ios.CatalogDemo.CartPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.ios.CatalogDemo.CatalogPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.ios.CatalogDemo.MenuPage;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IOSMobileCatalogDemoTest implements IAbstractTest, IMobileUtils {
    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Verify log in user.", value = {"mobile", "regression"})
    public void testLoginUser() {
        NavbarMenu navbarMenu = new NavbarMenu(getDriver());
        navbarMenu.openBottomMenuItem(NavbarItems.MENU);
        MenuPageBase menuPage = new MenuPage(getDriver());
        LoginPageBase loginPage = (LoginPageBase) menuPage.openMenuListItem(MenuItemsList.LOG_IN);
        Assert.assertTrue(loginPage.isPageOpened(), "Login page isn't opened!");
        CatalogPageBase catalogPage = loginPage.loginUser();
        Assert.assertTrue(catalogPage.isPageOpened(), "Catalog page isn't opened!");
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Verify log out user.", value = {"mobile", "regression"})
    public void testLogoutUser() {
        NavbarMenu navbarMenu = new NavbarMenu(getDriver());
        navbarMenu.openBottomMenuItem(NavbarItems.MENU);
        MenuPageBase menuPage = new MenuPage(getDriver());
        menuPage.openMenuListItem(MenuItemsList.LOG_OUT);
        Assert.assertTrue(menuPage.isAlertPresent(), "Logout alert isn't present!");
        menuPage.clickLogOutButton();
        Assert.assertTrue(menuPage.isUserLoggedOut(), "Success message isn't present, user isn't logged out!");
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Verify adding some product to cart.", value = {"mobile", "regression"})
    public void testAddProductToCart() {
        NavbarMenu navbarMenu = new NavbarMenu(getDriver());
        navbarMenu.openBottomMenuItem(NavbarItems.CART);
        CartPageBase cartPage = new CartPage(getDriver());
        Assert.assertTrue(cartPage.isNoItemsInCartTitlePresent(), "Message about no items in cart is present, cart is empty!");
        navbarMenu.openBottomMenuItem(NavbarItems.CATALOG);
        CatalogPageBase catalogPage = new CatalogPage(getDriver());
        catalogPage.addProductToCart();
        navbarMenu.openBottomMenuItem(NavbarItems.CART);
        Assert.assertFalse(cartPage.isNoItemsInCartTitlePresent(), "Message about no items in cart isn't present, there are products in cart!");
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Verify removing product from cart.", value = {"mobile", "regression"})
    public void testRemoveProductFromCart() {
        NavbarMenu navbarMenu = new NavbarMenu(getDriver());
        navbarMenu.openBottomMenuItem(NavbarItems.CART);
        CartPageBase cartPage = new CartPage(getDriver());
        Assert.assertTrue(cartPage.isNoItemsInCartTitlePresent(), "Message about no items in cart is present, cart is empty!");
        navbarMenu.openBottomMenuItem(NavbarItems.CATALOG);
        CatalogPageBase catalogPage = new CatalogPage(getDriver());
        catalogPage.addProductToCart();
        navbarMenu.openBottomMenuItem(NavbarItems.CART);
        Assert.assertFalse(cartPage.isNoItemsInCartTitlePresent(), "Message about no items in cart isn't present, there are products in cart!");
        cartPage.clickRemoveProductFromCart();
        Assert.assertTrue(cartPage.isNoItemsInCartTitlePresent(), "Message about no items in cart is present, cart is empty!");
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Verify total cost in a cart.", value = {"mobile", "regression"})
    public void testVerifyTotalCostInCart() {
        NavbarMenu navbarMenu = new NavbarMenu(getDriver());
        navbarMenu.openBottomMenuItem(NavbarItems.CATALOG);
        CatalogPageBase catalogPage = new CatalogPage(getDriver());
        catalogPage.addTwoProductsInCart();
        navbarMenu.openBottomMenuItem(NavbarItems.CART);
        CartPageBase cartPage = new CartPage(getDriver());
        Assert.assertFalse(cartPage.isNoItemsInCartTitlePresent(), "Message about no items in cart isn't present, there are products in cart!");
        Assert.assertEquals(cartPage.calculateItemsPrice(), cartPage.getTotalPrice(), "Total price isn't match!");
    }
}
