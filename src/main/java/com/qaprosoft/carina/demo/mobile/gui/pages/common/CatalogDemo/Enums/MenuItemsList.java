package com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.Enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.MenuPageBase;

public enum MenuItemsList {
    WEB_VIEW("menu item webview", AbstractPage.class),
    QR_CODE_SCANNER("menu item qr code scanner", AbstractPage.class),
    GEO_LOCATION("menu item geo location", AbstractPage.class),
    DRAWING("menu item drawing", AbstractPage.class),
    REPORT_A_BUG("menu item report a bug", AbstractPage.class),
    ABOUT("menu item about", AbstractPage.class),
    RESET_APP_STATE("menu item reset app", AbstractPage.class),
    FACE_ID("menu item biometrics", AbstractPage.class),
    LOG_IN("menu item log in", LoginPageBase.class),
    LOG_OUT("menu item log out", MenuPageBase.class),
    API_CALLS("menu item api calls", AbstractPage.class),
    SAUCE_BOT_VIDEO("menu item sauce bot video", AbstractPage.class);

    private String optionTitle;
    private Class<? extends AbstractPage> page;

    MenuItemsList(String optionTitle, Class<? extends AbstractPage> page) {
        this.optionTitle = optionTitle;
        this.page = page;
    }

    public String getOptionTitle() {
        return optionTitle;
    }

    public Class<? extends AbstractPage> getPage() {
        return page;
    }
}
