package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CustomSummaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;

public enum CustomDashboardItems {
    //
    CALORIE_FOCUS("rbCaloriesRem", DiaryPageBase.class),
    MACROUNUTRIENT_FOCUS("rbMacrosRem", DiaryPageBase.class),
    HEART_HEALTHY("rbHeartHealthy", DiaryPageBase.class),
    LOWCARB("rbLowCarb", DiaryPageBase.class),
    CUSTOM("rbCustomSummary", CustomSummaryPageBase.class);

    private String androidId;

    private Class<? extends AbstractPage> page;

    CustomDashboardItems(String androidId, Class<? extends AbstractPage> page) {
        this.androidId = androidId;
        this.page = page;
    }

    public String getAndroidId() {
        return androidId;
    }

    public Class<? extends AbstractPage> getPage() {
        return page;
    }
}
