package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PrivacyCenterPageBase;

public enum SettingOptions {
    PRIVACY_CENTER("textPrivacyCenter", PrivacyCenterPageBase.class),
    EDIT_PROFILE("textEditProfile", AbstractPage.class),
    MY_GOALS("textMyGoals", AbstractPage.class),
    PREMIUM_SUBSCRIPTION("textPremiumSubscription", AbstractPage.class),
    MY_APPS_DEVICES("textAppsDevices", AbstractPage.class),
    DELETE_ACCOUNT("textDeleteAccount", AbstractPage.class),
    CHANGE_PASSWORD("textChangePassword", AbstractPage.class),
    LOG_OUT("textLogOut", AbstractPage.class),
    APPEARANCE("textAppearanceSettings", AbstractPage.class),
    DIARY_SETTINGS("textDiarySettings", AbstractPage.class),
    REMINDERS("textReminders", AbstractPage.class),
    WEEKLY_NUTRITION_SETTINGS("textWeeklyNutrition", AbstractPage.class),
    STEPS("textSteps", AbstractPage.class),
    PUSH_NOTIFICATIONS("textPushNotifications", AbstractPage.class);

    private String id;
    private Class<? extends AbstractPage> page;

    SettingOptions(String id, Class<? extends AbstractPage> page) {
        this.id = id;
        this.page = page;
    }

    public String getId() {
        return id;
    }

    public Class<? extends AbstractPage> getPage() {
        return page;
    }
}
