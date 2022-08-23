package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

public enum MyPremiumToolsItems {

    CUSTOM_HOME_SCREEN_DASHBOARD("Custom Home Screen Dashboard", "Quickly see the nutrients that matter most to you."),
    CARBS_PROTEIN_FAT_GOALS("Carbs, Protein & Fat Goals", "Set the ideal ratio for your personal nutrition goals."),
    CALORIE_GOALS_BY_MEAL("Calorie Goals by Meal", "Hit your daily goals by breaking them into smaller ones."),
    EXERCISE_CALORIE_SETTINGS("Exercise Calorie Settings", "You decide how movement affects daily calorie goals."),
    QUICK_ADD_CARBS_PROTEIN_FAT("Quick Add Carbs, Protein & Fat", "Skip the food search—log macros or calories in seconds."),
    CARBS_PROTEIN_FAT_BY_MEAL("Carbs, Protein & Fat by Meal", "Real-time ratios help you maintain your macro goals."),
    CUSTOM_GOALS_BY_DAY("Custom Goals by Day", "Set calories & macros according to each day’s needs."),
    NET_CARBS_MODE("Net Carbs Mode", "Simplify tracking while on a low-carb diet."),
    NUTRITION_INSIGHTS("Nutrition Insights", "Deeper insights empower you to make smarter choices."),
    PERCENT_OF_DAILY_TOTALS("Percent of Daily Totals", "Discover how individual foods impact your daily goals."),
    UNLIMITED_WEEKLY_DIGESTS("Unlimited Weekly Digests", "Revisit your nutrition & fitness progress for any week."),
    FOOD_TIMESTAMPS("Food Timestamps", "Learn how meal timing impacts energy, workouts & more."),
    PROGRESS_DATA_FILE_EXPORT("Progress Data File Export", "Analyze all your progress data or share with a trainer."),
    TOP_MEAL_PLANS("Top Meal Plans", "Learn how to cook & eat for your personal nutrition goals."),
    QUICK_LOG_RECIPES("Quick Log Recipes", "Save your favorites from MyFitnessPal & tap once to log."),
    WORKOUT_PLANS("Workout Plans", "Conquer your personal fitness goals, one day at a time."),
    WORKOUT_ROUTINES("Workout Routines", "Stay inspired with our trackable, expert-led workouts.");

    private String name;
    private String description;

    MyPremiumToolsItems(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
