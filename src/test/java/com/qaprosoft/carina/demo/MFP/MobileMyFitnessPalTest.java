package com.qaprosoft.carina.demo.MFP;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.*;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.BottomMenu;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.agent.core.annotation.TestRailCaseId;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileMyFitnessPalTest implements IAbstractTest, IMobileUtils {

    final String email = "test_weight_user@gmail.com";
    final String password = "";
    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testLoginPageMyFitnessPal() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(email, password);
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Check that tap on Bottom Menu item leads to each item's page.", value = {"mobile","regression"})
    @TestRailCaseId("1")
    public void testBottomMenu() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(email, password);

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);

        Assert.assertTrue(commonPage.isElementBottomMenuPresent(BottomMenu.DIARY), "Diary icon isn't present");
        DiaryPageBase diaryPage = (DiaryPageBase) commonPage.openBottomMenuItem(BottomMenu.DIARY);
        Assert.assertTrue(diaryPage.isPageOpened(), "Diary page isn't opened");

        Assert.assertTrue(commonPage.isElementBottomMenuPresent(BottomMenu.NEWSFEED), "Newsfeed icon isn't present");
        NewsFeedPageBase newsFeedPage = (NewsFeedPageBase) commonPage.openBottomMenuItem(BottomMenu.NEWSFEED);
        Assert.assertTrue(newsFeedPage.isPageOpened(), "Newsfeed page isn't opened");

        Assert.assertTrue(commonPage.isElementBottomMenuPresent(BottomMenu.PLANS), "Plans icon isn't present");
        PlansPageBase plansPage = (PlansPageBase) commonPage.openBottomMenuItem(BottomMenu.PLANS);
        Assert.assertTrue(plansPage.isPageOpened(), "Plans page isn't opened");

        Assert.assertTrue(commonPage.isElementBottomMenuPresent(BottomMenu.DASHBOARD), "Dashboard icon isn't present");
        DashboardPageBase dashboardPage = (DashboardPageBase) commonPage.openBottomMenuItem(BottomMenu.DASHBOARD);
        Assert.assertTrue(dashboardPage.isPageOpened(), "Dashboard page isn't opened");
    }
}