package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CommentsPageBase extends AbstractPage implements IMobileUtils {
    public CommentsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void addCommentPost(String comment);

    public abstract void deleteCommentPost();

    public abstract String getCommentText();

}
