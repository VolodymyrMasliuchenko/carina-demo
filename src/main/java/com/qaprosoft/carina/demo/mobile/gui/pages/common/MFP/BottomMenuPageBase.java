package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class BottomMenuPageBase extends AbstractPage {
    public BottomMenuPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isDashboardIconPresent();

    public abstract boolean isDiaryIconPresent();

    public abstract boolean isNewsFeedIconPresent();

    public abstract boolean isPlansIconPresent();

    public abstract void tapDashboardIcon();
    public abstract void tapDiaryIcon();
    public abstract void tapNewsFeedIcon();
    public abstract void tapPlansIcon();

    public abstract AbstractPage tapToIconToOpenPage(BottomMenu menu);

    public enum BottomMenu {
        DASHBOARD("dashboard"),
        DIARY("diary"),
        NEWSFEED("newsfeed"),
        PLANS("plans");

        public final String value;

        BottomMenu(String value) {
            this.value = value;
        }

    }

}
