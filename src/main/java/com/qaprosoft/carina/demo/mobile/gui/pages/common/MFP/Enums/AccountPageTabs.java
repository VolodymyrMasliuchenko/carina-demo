package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.MyInfoPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.MyItemsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.MyPostsPageBase;

public enum AccountPageTabs {
    MY_INFO("My Info", MyInfoPageBase.class),
    MY_ITEMS("My Items", MyItemsPageBase.class),
    MY_POSTS("My Posts", MyPostsPageBase.class);

    private String id;
    private Class<? extends AbstractPage> page;

    AccountPageTabs(String id, Class<? extends AbstractPage> page) {
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
