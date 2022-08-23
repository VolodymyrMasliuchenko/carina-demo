package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

public enum PlanPageItems {
    FREE("Free"),
    MEAL_PLAN("Meal Plan"),
    NUTRITION("Nutrition"),
    WALKING("Walking"),
    WORKOUT("Workout");

    private String buttonName;

    PlanPageItems(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {
        return buttonName;
    }
}
