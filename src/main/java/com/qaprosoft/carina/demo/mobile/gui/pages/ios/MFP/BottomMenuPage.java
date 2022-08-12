package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.BottomMenuPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = BottomMenuPageBase.class)
public class BottomMenuPage extends BottomMenuPageBase {
    public BottomMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDashboardIconPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isDiaryIconPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isNewsFeedIconPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isPlansIconPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void tapDashboardIcon() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void tapDiaryIcon() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void tapNewsFeedIcon() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void tapPlansIcon() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public AbstractPage tapToIconToOpenPage(BottomMenu menu) {
        throw new NotImplementedException("Not implemented");
    }
}
