package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.SharingAndPrivacyPageBase;

public enum PrivacyCenterOptions {
    SHARING_AND_PRIVACY("sharing_and_privacy", SharingAndPrivacyPageBase.class),
    TERMS_OF_SERVICE("tos", AbstractPage.class),
    PRIVACY_POLICY("privacy_policy", AbstractPage.class),
    PERSONALIZATION("personalization", AbstractPage.class),
    DO_NOT_SELL_MY_PERSONAL_INFORMATION("do_not_sell", AbstractPage.class),
    CONTACT_SUPPORT("contact_support", AbstractPage.class);

    private String id;
    private Class<? extends AbstractPage> page;

    PrivacyCenterOptions(String id, Class<? extends AbstractPage> page) {
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
