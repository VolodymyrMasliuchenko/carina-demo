package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CustomSummaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;

public enum CustomDashboardItems {

    CALORIEFOCUS("rbCaloriesRem","", DiaryPageBase.class),
    MACROUNUTRIENTFOCUS("rbMacrosRem","", DiaryPageBase.class),
    HEARTHEALTHY("rbHeartHealthy","", DiaryPageBase.class),
    LOWCARB("rbLowCarb","", DiaryPageBase.class);

    private String androidOption;
    private String iosOption;
    private Class<? extends AbstractPage> page;

    CustomDashboardItems(String androidOption, String iosOption, Class<? extends AbstractPage> page) {
        this.androidOption = androidOption;
        this.iosOption = iosOption;
        this.page = page;
    }

    public String getAndroidOption() {
        return androidOption;
    }

    public String getIosOption() {
        return iosOption;
    }

    public Class<? extends AbstractPage> getPage() {
        return page;
    }
}
