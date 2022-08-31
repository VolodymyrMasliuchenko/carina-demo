package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

public enum EndPlanCheckBoxItems {
    I_LOST_INTEREST("I lost interest."),
    THE_PLAN_WASNT_HELPFUL("The plan wasn’t helpful to me."),
    JUST_WANTED_TO_WHAT_THIS_PLAN_ABOUT("I just wanted to see what the plan was about."),
    I_WANT_TO_START_DIFFERENT_PLAN("I want to start a different plan."),
    OTHER_PRIORITIES_IN_LIFE("Other priorities in my life took precedent."),
    I_FORGOT_ABOUT_IT("I forgot about it."),
    THE_PLAN_WAS_TOO_HARD("The plan was too hard to follow."),
    WANT_TO_RESTART_PLAN("I want to restart the plan."),
    WASNT_WHAT_I_EXPECTED("The plan wasn’t what I expected.");

    private String text;

    EndPlanCheckBoxItems(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
