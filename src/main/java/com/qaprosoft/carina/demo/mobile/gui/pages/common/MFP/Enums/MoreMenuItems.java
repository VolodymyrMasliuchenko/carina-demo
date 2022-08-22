package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

public enum MoreMenuItems {
    MY_PREMIUM_TOOLS("My Premium Tools"),
    RECIPE_DISCOVERY("Recipe Discovery"),
    PROGRESS("Progress"),
    WORKOUT_ROUTINE("Workout Routines"),
    GOALS("Goals"),
    NUTRITION("Nutrition"),
    RECIPES_MEALS_FOOD("Recipes, Meals & Foods"),
    APPS_DEVICES("Apps & Devices"),
    STEPS("Steps"),
    COMMUNITY("Community"),
    REMINDERS("Reminders"),
    FRIENDS("Friends"),
    MESSAGES("Messages"),
    PRIVACY_CENTER("Privacy Center"),
    SETTINGS("Settings"),
    HELP("Help"),
    SYNC("Sync");

    private String text;

    MoreMenuItems(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
