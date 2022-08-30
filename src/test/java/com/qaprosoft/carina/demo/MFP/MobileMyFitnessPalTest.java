package com.qaprosoft.carina.demo.MFP;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.*;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.*;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Intefaces.IConstants;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.agent.core.annotation.TestRailCaseId;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
        int fatCount = 1;
        int carbsCount = 1;
        int proteinCount = 1;

        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        DiaryPageBase diaryPage = (DiaryPageBase) commonPage.openBottomMenuItem(BottomMenu.DIARY);
        Assert.assertTrue(diaryPage.isPageOpened(), "Diary page isn't opened");

        QuickAddPageBase quickAddPage = diaryPage.openQuickAddOption();
        Assert.assertTrue(quickAddPage.isPageOpened(), "Quick add page isn't opened");
        quickAddPage.quickAddNutrient(fatCount,carbsCount,proteinCount);
        Assert.assertEquals(quickAddPage.getQuickAddCalories(),expectedCaloriesCount, "Calories count isn't 17");
        quickAddPage.submitNutrient();
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Custom dashboard validation, custom Summary page validation.", value = {"mobile","regression"})
    @TestRailCaseId("4,5")
    public void testCustomDashboardValidation() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        DiaryPageBase diaryPage = (DiaryPageBase) commonPage.openBottomMenuItem(BottomMenu.DIARY);
        Assert.assertTrue(diaryPage.isPageOpened(), "Diary page isn't opened");

        //Custom dashboard validation.
        CustomDashboardPageBase customDashboardPage = diaryPage.openMoreDashboardOption();
        Assert.assertTrue(customDashboardPage.isPageOpened(), "Custom dashboard page isn't opened");
        customDashboardPage.chooseDashboardItem(CustomDashboardItems.CALORIE_FOCUS);
        Assert.assertTrue(diaryPage.isPageOpened(), "Diary page isn't opened");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.GOAL), IConstants.GOAL + "isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.FOOD), IConstants.FOOD + "isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.EXERCISE), IConstants.EXERCISE + "isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.REMAINING), IConstants.REMAINING + "isn't present on Diary page");

        diaryPage.openMoreDashboardOption();
        Assert.assertTrue(customDashboardPage.isPageOpened(), "Custom dashboard page isn't opened");
        customDashboardPage.chooseDashboardItem(CustomDashboardItems.MACROUNUTRIENT_FOCUS);
        Assert.assertTrue(diaryPage.isPageOpened(), "Diary page isn't opened");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CARBS), IConstants.CARBS + "isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.FAT), IConstants.FAT + "isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.PROTEIN), IConstants.PROTEIN + "isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CALORIES), IConstants.CALORIES + "isn't present on Diary page");

        diaryPage.openMoreDashboardOption();
        Assert.assertTrue(customDashboardPage.isPageOpened(), "Custom dashboard page isn't opened");
        customDashboardPage.chooseDashboardItem(CustomDashboardItems.HEART_HEALTHY);
        Assert.assertTrue(diaryPage.isPageOpened(), "Diary page isn't opened");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.FAT), IConstants.FAT + "isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.SODIUM), IConstants.SODIUM + "isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CHOLESTEROL), IConstants.CHOLESTEROL + " isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CALORIES), IConstants.CALORIES + " isn't present on Diary page");

        diaryPage.openMoreDashboardOption();
        Assert.assertTrue(customDashboardPage.isPageOpened(), "Custom dashboard page isn't opened");
        customDashboardPage.chooseDashboardItem(CustomDashboardItems.LOWCARB);
        customDashboardPage.closePopUp();
        Assert.assertTrue(diaryPage.isPageOpened(), "Diary page isn't opened");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CARBS), IConstants.CARBS + " isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.SUGAR), IConstants.SUGAR + " isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.FIBER), IConstants.FIBER + " isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CALORIES), IConstants.CALORIES + " isn't present on Diary page");

        //Custom Summary page validation.
        diaryPage.openMoreDashboardOption();
        Assert.assertTrue(customDashboardPage.isPageOpened(), "Custom dashboard page isn't opened");
        CustomSummaryPageBase customSummaryPage = (CustomSummaryPageBase) customDashboardPage.chooseDashboardItem(CustomDashboardItems.CUSTOM);
        customSummaryPage.checkNutrient(CustomSummaryPageItems.FAT);
        softAssert.assertTrue(customSummaryPage.isNutrientByNameChecked(CustomSummaryPageItems.FAT), "Fat isn't checked");
        customSummaryPage.checkNutrient(CustomSummaryPageItems.CARBOHYDRATES);
        softAssert.assertTrue(customSummaryPage.isNutrientByNameChecked(CustomSummaryPageItems.CARBOHYDRATES), "Carbohydrates isn't checked");
        customSummaryPage.checkNutrient(CustomSummaryPageItems.PROTEIN);
        softAssert.assertTrue(customSummaryPage.isNutrientByNameChecked(CustomSummaryPageItems.PROTEIN), "Protein isn't checked");
        customSummaryPage.submitSettings();
        Assert.assertTrue(diaryPage.isPageOpened(), "Diary page isn't opened");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.PROTEIN), IConstants.PROTEIN + " isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.FAT), IConstants.FAT + " isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CARBS), IConstants.CARBS + " isn't present on Diary page");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CALORIES), IConstants.CALORIES + " isn't present on Diary page");
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Custom Summary nutrients validation.", value = {"mobile","regression"})
    @TestRailCaseId("6")
    public void testCustomSummaryNutrientsValidation() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        DiaryPageBase diaryPage = (DiaryPageBase) commonPage.openBottomMenuItem(BottomMenu.DIARY);
        Assert.assertTrue(diaryPage.isPageOpened(), "Diary page isn't opened");

        CustomDashboardPageBase customDashboardPage = diaryPage.openMoreDashboardOption();
        Assert.assertTrue(customDashboardPage.isPageOpened(), "Custom dashboard page isn't opened");
        CustomSummaryPageBase customSummaryPage = (CustomSummaryPageBase) customDashboardPage.chooseDashboardItem(CustomDashboardItems.CUSTOM);
        customSummaryPage.checkNutrient(CustomSummaryPageItems.FAT);
        customSummaryPage.checkNutrient(CustomSummaryPageItems.CARBOHYDRATES);
        customSummaryPage.checkNutrient(CustomSummaryPageItems.PROTEIN);
        Assert.assertTrue(commonPage.isItemByTextPresent(IConstants._3_OF_3_NUTRIENTS_SELECTED), IConstants._3_OF_3_NUTRIENTS_SELECTED + " text isn't present");
        Assert.assertTrue(customSummaryPage.isDoneButtonActive(), "Done button isn't active when 3 nutrients are selected");
        customSummaryPage.uncheckNutrient(CustomSummaryPageItems.FAT);
        Assert.assertTrue(commonPage.isItemByTextPresent(IConstants._2_OF_3_NUTRIENTS_SELECTED), IConstants._2_OF_3_NUTRIENTS_SELECTED + " text isn't present");
        Assert.assertFalse(customSummaryPage.isDoneButtonActive(), "Done button is active when 2 of 3 nutrients are selected");
        customSummaryPage.checkNutrient(CustomSummaryPageItems.FAT);
        customSummaryPage.checkNutrient(CustomSummaryPageItems.SAT_FAT);
        Assert.assertTrue(commonPage.isItemByTextPresent(IConstants._4_OF_3_NUTRIENTS_SELECTED), IConstants._4_OF_3_NUTRIENTS_SELECTED + " text isn't present");
        Assert.assertFalse(customSummaryPage.isDoneButtonActive(), "Done button is active when 4 of 3 nutrients are selected");
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "More menu options validation.", value = {"mobile","regression"})
    @TestRailCaseId("7")
    public void testMoreMenuOptionsValidation() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        MoreMenuPageBase moreMenuPage = (MoreMenuPageBase) commonPage.openBottomMenuItem(BottomMenu.MORE);
        Assert.assertTrue(moreMenuPage.isPageOpened(), "More menu page isn't opened");

        for (MoreMenuItems item : MoreMenuItems.values()) {
            softAssert.assertTrue(moreMenuPage.isMenuItemPresent(item), item + " item isn't present on More menu page");
        }
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "My Premium Tools page validation.", value = {"mobile","regression"})
    @TestRailCaseId("8")
    public void testMyPremiumToolsPageValidation() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        MoreMenuPageBase moreMenuPage = (MoreMenuPageBase) commonPage.openBottomMenuItem(BottomMenu.MORE);
        Assert.assertTrue(moreMenuPage.isPageOpened(), "More menu page isn't opened");
        MyPremiumToolsPageBase myPremiumToolsPage = (MyPremiumToolsPageBase) moreMenuPage.clickMenuItem(MoreMenuItems.MY_PREMIUM_TOOLS);
        Assert.assertTrue(myPremiumToolsPage.isPageOpened(), "My premium tools page isn't opened");

        for (MyPremiumToolsItems item : MyPremiumToolsItems.values()) {
            softAssert.assertTrue(myPremiumToolsPage.isMyPremiumItemNamePresent(item), item.getName() + " name isn't present on My premium tools page");
            softAssert.assertTrue(myPremiumToolsPage.isDescriptionPresent(item), item.getDescription() + " description isn't present on My premium tools page");
        }

        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Plans page validation.", value = {"mobile","regression"})
    @TestRailCaseId("9")
    public void testPlansPageValidation() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        PlansPageBase plansPage = (PlansPageBase) commonPage.openBottomMenuItem(BottomMenu.PLANS);
        Assert.assertTrue(plansPage.isPageOpened(), "Plans page isn't opened");

        for (PlanFilterButton plan : PlanFilterButton.values()) {
            softAssert.assertTrue(plansPage.isPlanRadioButtonPresent(plan), plan.getButtonName() + " button isn't present");
        }

        softAssert.assertTrue(plansPage.isItemByTextPresent(IConstants.FIND_A_PLAN), IConstants.FIND_A_PLAN + " text isn't present");
        softAssert.assertTrue(plansPage.isItemByTextPresent(IConstants.FIND_PLAN_DESC), IConstants.FIND_PLAN_DESC + " text isn't present");
        softAssert.assertTrue(plansPage.isItemByTextPresent(IConstants.FILTER_BY),IConstants.FILTER_BY + " text isn't present");
        softAssert.assertTrue(plansPage.isItemByTextPresent(IConstants.LOOKING_FOR_MORE_PLANS),IConstants.LOOKING_FOR_MORE_PLANS + " text isn't present");
        softAssert.assertTrue(plansPage.isItemByTextPresent(IConstants.LOOKING_FOR_MORE_PLANS_DESC),IConstants.LOOKING_FOR_MORE_PLANS_DESC + " text isn't present");
        softAssert.assertTrue(plansPage.isItemByTextPresent(IConstants.TAKE_THE_SURVEY),IConstants.TAKE_THE_SURVEY + " link isn't present");

        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Plans filters checking.", value = {"mobile","regression"})
    @TestRailCaseId("10")
    public void testPlansFilteringChecking() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        PlansPageBase plansPage = (PlansPageBase) commonPage.openBottomMenuItem(BottomMenu.PLANS);
        Assert.assertTrue(plansPage.isPageOpened(), "Plans page isn't opened");

       for (PlanFilterButton button : PlanFilterButton.values()) {
            plansPage.clickPlanRadioButton(button);
            for (PlanFilteredCards card : button.getFilteredPlan()) {
                softAssert.assertTrue(plansPage.isPlanFilteredCardPresent(card), card.getText() + " plan card isn't present");
            }
        }

        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "User can't add two plans.", value = {"mobile","regression"})
    @TestRailCaseId("11")
    public void testUserAddTwoPlans() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        PlansPageBase plansPage = (PlansPageBase) commonPage.openBottomMenuItem(BottomMenu.PLANS);
        Assert.assertTrue(plansPage.isPageOpened(), "Plans page isn't opened");

        plansPage.endPlanIfPresent();
        plansPage.clickPlanRadioButton(PlanFilterButton.MEAL_PLAN);
        PlanDetailsPageBase planDetailsPage = plansPage.openPlanCard(PlanFilteredCards.LOW_CARB);
        Assert.assertTrue(planDetailsPage.isPageOpened(), "Plan details page isn't opened");
        planDetailsPage.startPlan();
        plansPage.clickClosePopUpButton();

        plansPage.clickAddPlanButton();
        Assert.assertTrue(plansPage.isPlanFilteredCardPresent(PlanFilteredCards.LOW_CARB),PlanFilteredCards.LOW_CARB + " plan card isn't present");
        plansPage.clickPlanRadioButton(PlanFilterButton.MEAL_PLAN);
        plansPage.openPlanCard(PlanFilteredCards.HIGH_PROTEIN);
        Assert.assertTrue(planDetailsPage.isPageOpened(), "Plan details page isn't opened");
        planDetailsPage.startPlan();
        plansPage.clickClosePopUpButton();

        plansPage.clickAddPlanButton();
        Assert.assertFalse(plansPage.isActivePlanCardPresent(PlanFilteredCards.LOW_CARB),PlanFilteredCards.LOW_CARB + " plan card is present");
        Assert.assertTrue(plansPage.isActivePlanCardPresent(PlanFilteredCards.HIGH_PROTEIN),PlanFilteredCards.HIGH_PROTEIN + " plan card isn't present");
    }

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "Amount of created food is changing.", value = {"mobile","regression"})
    @TestRailCaseId("12")
    public void testAmountOfCreatedFoodChanged() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        DashboardPageBase dashboardPage = loginPage.loginToAccount(R.TESTDATA.get("email"), R.TESTDATA.get("password"));
        Assert.assertTrue(dashboardPage.isPageOpened(), "Dashboard page isn't opened");

        Assert.assertTrue(dashboardPage.isUserAvatarPresent(), "User avatar isn't present");
        AccountPageBase accountPage = dashboardPage.clickUserAvatar();
        Assert.assertTrue(accountPage.isPageOpened(), "Account info page isn't opened");
        MyItemsPageBase myItemsPage = (MyItemsPageBase) accountPage.openNavbarItem(AccountPageNavbarItems.MY_ITEMS);
        //set old count of Food
        int oldFoodValue = Integer.parseInt(myItemsPage.getFoodsCount());

        CreateFoodsPageBase createFoodsPage = (CreateFoodsPageBase) myItemsPage.openItem(MyItems.FOODS);
        Assert.assertTrue(createFoodsPage.isPageOpened(), "Create Food page isn't opened");
        createFoodsPage.createFood("brand", "description", 1,"unit",1,1);
        //check if count of Food +1
        Assert.assertEquals(oldFoodValue + 1, Integer.parseInt(myItemsPage.getFoodsCount()), "Didn't add food");
    }
}
