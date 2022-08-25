package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

public enum PlanFilterButton {
    FREE("Free"),
    MEAL_PLAN("Meal Plan"),
    NUTRITION("Nutrition"),
    WALKING("Walking"),
    WORKOUT("Workout");

    private String buttonName;

    PlanFilterButton(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {
        return buttonName;
    }
}
