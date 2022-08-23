package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.MoreMenuItems;
import org.openqa.selenium.WebDriver;

public abstract class MoreMenuPageBase extends AbstractPage implements IMobileUtils {
    public MoreMenuPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isMenuItemPresent(MoreMenuItems menu);
    public abstract AbstractPage clickMenuItem(MoreMenuItems menu);

}
