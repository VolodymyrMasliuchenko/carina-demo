package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.NewsFeedPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansPageBase;

public enum BottomMenu {

        DASHBOARD("Dashboard", "Dashboard", DashboardPageBase.class),
        DIARY("Diary", "Diary", DiaryPageBase.class),
        NEWSFEED("Newsfeed", "Newsfeed", NewsFeedPageBase.class),
        PLANS("Plans", "Plans", PlansPageBase.class);

        private String optionAndroid;
        private String optionIos;
        private Class<? extends AbstractPage> page;

        BottomMenu(String optionAndroid, String optionIos, Class<? extends AbstractPage> page) {
            this.optionAndroid = optionAndroid;
            this.optionIos = optionIos;
            this.page = page;
        }

        public String getOptionAndroid() {
            return optionAndroid;
        }

        public String getOptionIos() {
            return optionIos;
        }

        public Class<? extends AbstractPage> getPage() {
            return page;
        }
}
