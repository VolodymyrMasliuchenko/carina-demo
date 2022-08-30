package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.MyItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.MyItemsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MyItemsPageBase.class)
public class MyItemsPage extends MyItemsPageBase {
    public MyItemsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage openItem(MyItems item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public String getFoodsCount() {
        throw new NotImplementedException("Not implemented");
    }
}
