package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CommentsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CommentsPageBase.class)
public class CommentsPage extends CommentsPageBase {
    public CommentsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void addCommentPost(String comment) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void deleteCommentPost() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public String getCommentText() {
        throw new NotImplementedException("Not implemented");
    }
}
