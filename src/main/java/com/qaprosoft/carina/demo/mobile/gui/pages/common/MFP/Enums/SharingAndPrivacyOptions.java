package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.NewsFeedSharingPageBase;

public enum SharingAndPrivacyOptions {
    NEWS_FEED_SHARING("News Feed Sharing", NewsFeedSharingPageBase.class),
    DIARY_SHARING("Diary Sharing", AbstractPage.class),
    EMAIL_SETTINGS("Email Settings", AbstractPage.class),
    FACEBOOK_SETTINGS("Facebook Settings", AbstractPage.class),
    AUTO_PLAY_SETTINGS("Auto-Play Settings", AbstractPage.class);

    private String text;
    private Class<? extends AbstractPage> page;

    SharingAndPrivacyOptions(String text, Class<? extends AbstractPage> page) {
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
