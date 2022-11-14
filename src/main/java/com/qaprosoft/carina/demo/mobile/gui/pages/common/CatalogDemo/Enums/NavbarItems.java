package com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.Enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.CartPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.CatalogPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.MenuPageBase;

public enum NavbarItems {
    CATALOG("tab bar option catalog", CatalogPageBase.class),
    CART("tab bar option cart", CartPageBase.class),
    MENU("tab bar option menu", MenuPageBase.class);

    private String optionTitle;
    private Class<? extends AbstractPage> page;

    NavbarItems(String optionTitle, Class<? extends AbstractPage> page) {
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
