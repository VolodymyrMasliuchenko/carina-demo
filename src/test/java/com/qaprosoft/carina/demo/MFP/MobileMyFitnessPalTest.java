package com.qaprosoft.carina.demo.MFP;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.*;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.BottomMenu;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.agent.core.annotation.TestRailCaseId;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileMyFitnessPalTest implements IAbstractTest, IMobileUtils {
    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testLoginPageMyFitnessPal() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(R.TESTDATA.get("email"), R.TESTDATA.get("password"));
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Check that tap on Bottom Menu item leads to each item's page.", value = {"mobile","regression"})
    @TestRailCaseId("1")
    public void testBottomMenu() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

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

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Check that Goal calories value equals Remaining value.", value = {"mobile","regression"})
    @TestRailCaseId("2")
    public void testGoalAndRemainingCalories() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        DiaryPageBase diaryPage = (DiaryPageBase) commonPage.openBottomMenuItem(BottomMenu.DIARY);
        diaryPage.cleanDiary();
        Assert.assertEquals(diaryPage.getRemainingCalories(),diaryPage.getGoalCalories(), "Remaining calories isn't equals to goal calories");
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Calories validation on Quick Add page.", value = {"mobile","regression"})
    @TestRailCaseId("3")
    public void testQuickAddPage() {
        int expectedCaloriesCount = 17;
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        DiaryPageBase diaryPage = (DiaryPageBase) commonPage.openBottomMenuItem(BottomMenu.DIARY);
        Assert.assertTrue(diaryPage.isPageOpened(), "Diary page isn't opened");

        QuickAddPageBase quickAddPage = diaryPage.quickAddOption();
        Assert.assertTrue(quickAddPage.isPageOpened(), "Quick add page isn't opened");
        quickAddPage.quickAddNutrient(1,1,1);
        Assert.assertEquals(quickAddPage.getCaloriesInt(),expectedCaloriesCount, "Calories count isn't 17");
        quickAddPage.submitNutrient();
    }

}
