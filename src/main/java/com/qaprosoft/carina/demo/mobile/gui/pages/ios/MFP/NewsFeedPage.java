package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.NewsFeedPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = NewsFeedPageBase.class)
public class NewsFeedPage extends NewsFeedPageBase {
    public NewsFeedPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void likePostIfPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void unlikePostIfPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isLikeCountPresent() {
        throw new NotImplementedException("Not implemented");
    }
}
