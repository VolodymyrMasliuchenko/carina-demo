package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

public enum PlanFilteredCards {
    
    TONED_UPPER_BODY("Toned Upper Body"),
    _9000_STEPS_A_DAY("9,000 Steps a Day"),
    PROGRESSIVE_DUMBBELL("Progressive Dumbbell"),
    HIGH_PROTEIN("High Protein"),
    SIMPLE_START_CHALLENGE("Simple Start Challenge"),
    PROGRESSIVE_BODYWEIGHT("Progressive Bodyweight"),
    REACHING_YOUR_CALORIE_GOAL("Reaching Your Calorie Goal"),
    SUPPORT_YOUR_IMMUNE_SYSTEM("Support Your Immune System"),
    _6000_STEPS_A_DAY("6,000 Steps a Day"),
    HEALTHY_KICKSTART("Healthy Kickstart"),
    EAT_GREEN("Eat Green"),
    MINDFUL_AND_MOTIVATED("Mindful + Motivated"),
    _11000_STEPS_A_DAY("11,000 Steps a Day"),
    BUILDING_HEALTHY_HABITS("Building Healthy Habits"),
    CORE_PLUS("Core Plus"),
    TOTAL_BODY_POWER("Total Body Power"),
    LOW_IMPACT_STRENGTH("Low Impact Strength"),
    LOW_CARB("Low Carb"),
    STRONG_GLUTES_AND_THIGHS("Strong Glutes & Thighs"),
    INTRO_TO_MACRO_TRACKING("Intro to Macro Tracking"),
    MY_FITNESS_PAL_101_("MyFitnessPal 101");

    private String text;

    PlanFilteredCards(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
