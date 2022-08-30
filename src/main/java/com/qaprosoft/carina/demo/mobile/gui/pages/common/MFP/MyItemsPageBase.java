package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.MyItems;
import org.openqa.selenium.WebDriver;

public abstract class MyItemsPageBase extends AbstractPage {
    public MyItemsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage openItem(MyItems item);

    public abstract String getFoodsCount();

}
