package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BottomMenuPageBase.class)
public class BottomMenuPage extends BottomMenuPageBase {

    @FindBy(id = "com.myfitnesspal.android:id/action_dashboard")
    private ExtendedWebElement dashboardIcon;

    @FindBy(id = "com.myfitnesspal.android:id/action_diary")
    private ExtendedWebElement diaryIcon;

    @FindBy(id = "com.myfitnesspal.android:id/action_newsfeed")
    private ExtendedWebElement newsFeedIcon;

    @FindBy(id = "com.myfitnesspal.android:id/action_plans")
    private ExtendedWebElement plansIcon;

    public BottomMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDashboardIconPresent() {
        return dashboardIcon.isElementPresent();
    }

    @Override
    public boolean isDiaryIconPresent() {
        return diaryIcon.isElementPresent();
    }

    @Override
    public boolean isNewsFeedIconPresent() {
        return newsFeedIcon.isElementPresent();
    }

    @Override
    public boolean isPlansIconPresent() {
        return plansIcon.isElementPresent();
    }

    @Override
    public void tapDashboardIcon() {
        dashboardIcon.click();
    }

    @Override
    public void tapDiaryIcon() {
        diaryIcon.click();
    }

    @Override
    public void tapNewsFeedIcon() {
        newsFeedIcon.click();
    }

    @Override
    public void tapPlansIcon() {
        plansIcon.click();
    }

    @Override
    public AbstractPage tapToIconToOpenPage(BottomMenu menu) {
        if (Objects.equals(menu.value, BottomMenu.DASHBOARD.value)) {
            tapDashboardIcon();
            return initPage(getDriver(), DashboardPageBase.class);
        } else if (Objects.equals(menu.value, BottomMenu.DIARY.value)) {
            tapDiaryIcon();
            return initPage(getDriver(), DiaryPageBase.class);
        } else if (Objects.equals(menu.value, BottomMenu.NEWSFEED.value)) {
            tapNewsFeedIcon();
            return initPage(getDriver(), NewsFeedPageBase.class);
        } else {
            tapPlansIcon();
            return initPage(getDriver(), PlansPageBase.class);
        }
    }
}
