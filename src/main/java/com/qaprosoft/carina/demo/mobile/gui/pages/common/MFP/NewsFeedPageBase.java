package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class NewsFeedPageBase extends AbstractPage implements IMobileUtils {
    public NewsFeedPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void likePostIfPresent();

    public abstract void unlikePostIfPresent();

    public abstract boolean isLikeCountPresent();

    public abstract CommentsPageBase openPostCommentsPage();
}
