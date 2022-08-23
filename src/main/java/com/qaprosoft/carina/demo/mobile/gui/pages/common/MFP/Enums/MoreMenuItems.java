package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.*;

public enum MoreMenuItems {
    MY_PREMIUM_TOOLS("My Premium Tools", MyPremiumToolsPageBase.class),
    RECIPE_DISCOVERY("Recipe Discovery", RecipeDiscoveryPageBase.class),
    PROGRESS("Progress", ProgressPageBase.class),
    WORKOUT_ROUTINE("Workout Routines", WorkoutRoutinesPageBase.class),
    GOALS("Goals", GoalsPageBase.class),
    NUTRITION("Nutrition", NutritionPageBase.class),
    RECIPES_MEALS_FOOD("Recipes, Meals & Foods", RecipesMealsFoodsPageBase.class),
    APPS_DEVICES("Apps & Devices", AppsDevicesPageBase.class),
    STEPS("Steps", StepsPageBase.class),
    COMMUNITY("Community", CommunityPageBase.class),
    REMINDERS("Reminders", RemindersPageBase.class),
    FRIENDS("Friends", FriendsPageBase.class),
    MESSAGES("Messages", MessagesPageBase.class),
    PRIVACY_CENTER("Privacy Center", PrivacyCenterPageBase.class),
    SETTINGS("Settings", SettingsPageBase.class),
    HELP("Help", HelpPageBase.class);

    private String text;
    private Class<? extends AbstractPage> page;

    MoreMenuItems(String text, Class<? extends AbstractPage> page) {
        this.text = text;
        this.page = page;
    }

    public String getText() {
        return text;
    }

    public Class<? extends AbstractPage> getPage() {
        return page;
    }
}
