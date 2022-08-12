package com.qaprosoft.carina.demo.MFP;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.*;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.agent.core.annotation.TestRailCaseId;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileMyFitnessPalTest implements IAbstractTest, IMobileUtils {

    final String email = "";
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
        //check if all elements we're using present
        BottomMenuPageBase bottomMenu = initPage(getDriver(), BottomMenuPageBase.class);
        Assert.assertTrue(bottomMenu.isDashboardIconPresent(), "Dashboard icon isn't present");
        Assert.assertTrue(bottomMenu.isDiaryIconPresent(), "Diary icon isn't present");
        Assert.assertTrue(bottomMenu.isNewsFeedIconPresent(), "Newsfeed icon isn't present");
        Assert.assertTrue(bottomMenu.isPlansIconPresent(), "Plans icon isn't present");
        //choose and check if diary page was opened
        DiaryPageBase diaryPage = (DiaryPageBase) bottomMenu.tapToIconToOpenPage(BottomMenuPageBase.BottomMenu.DIARY);
        Assert.assertTrue(diaryPage.isPageOpened(), "Diary page isn't opened");
        //choose and check if newsfeed page was opened
        NewsFeedPageBase newsFeedPage = (NewsFeedPageBase) bottomMenu.tapToIconToOpenPage(BottomMenuPageBase.BottomMenu.NEWSFEED);
        Assert.assertTrue(newsFeedPage.isPageOpened(), "Newsfeed page isn't opened");
        //choose and check if plans page was opened
        PlansPageBase plansPage = (PlansPageBase) bottomMenu.tapToIconToOpenPage(BottomMenuPageBase.BottomMenu.PLANS);
        Assert.assertTrue(plansPage.isPageOpened(), "Plans page isn't opened");
        //choose and check if dashboard page was opened
        DashboardPageBase dashboardPage = (DashboardPageBase) bottomMenu.tapToIconToOpenPage(BottomMenuPageBase.BottomMenu.DASHBOARD);
        Assert.assertTrue(dashboardPage.isPageOpened(), "Dashboard page isn't opened");
    }
}
