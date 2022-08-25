package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

public enum PlanFilterButton {
    FREE("Free", new PlanFilteredCards[] {
        PlanFilteredCards.SIMPLE_START_CHALLENGE,
        PlanFilteredCards.EAT_GREEN,
        PlanFilteredCards.MINDFUL_AND_MOTIVATED,
        PlanFilteredCards.MY_FITNESS_PAL_101_
    }),
    MEAL_PLAN("Meal Plan", new PlanFilteredCards[] {
            PlanFilteredCards.HIGH_PROTEIN,
            PlanFilteredCards.LOW_CARB
    }),
    NUTRITION("Nutrition", new PlanFilteredCards[] {
            PlanFilteredCards.SIMPLE_START_CHALLENGE,
            PlanFilteredCards.REACHING_YOUR_CALORIE_GOAL,
            PlanFilteredCards.SUPPORT_YOUR_IMMUNE_SYSTEM,
            PlanFilteredCards.HEALTHY_KICKSTART,
            PlanFilteredCards.EAT_GREEN,
            PlanFilteredCards.MINDFUL_AND_MOTIVATED,
            PlanFilteredCards.BUILDING_HEALTHY_HABITS,
            PlanFilteredCards.INTRO_TO_MACRO_TRACKING
    }),
    WALKING("Walking", new PlanFilteredCards[] {
            PlanFilteredCards._9000_STEPS_A_DAY,
            PlanFilteredCards._6000_STEPS_A_DAY,
            PlanFilteredCards._11000_STEPS_A_DAY
    }),
    WORKOUT("Workout", new PlanFilteredCards[] {
            PlanFilteredCards.TONED_UPPER_BODY,
            PlanFilteredCards.PROGRESSIVE_DUMBBELL,
            PlanFilteredCards.PROGRESSIVE_BODYWEIGHT,
            PlanFilteredCards.CORE_PLUS,
            PlanFilteredCards.TOTAL_BODY_POWER,
            PlanFilteredCards.LOW_IMPACT_STRENGTH,
            PlanFilteredCards.STRONG_GLUTES_AND_THIGHS
    });

    private String buttonName;
    private PlanFilteredCards [] filteredPlan;

    PlanFilterButton(String buttonName, PlanFilteredCards[] filteredPlan) {
        this.buttonName = buttonName;
        this.filteredPlan = filteredPlan;
    }

    public String getButtonName() {
        return buttonName;
    }

    public PlanFilteredCards[] getFilteredPlan() {
        return filteredPlan;
    }
}
