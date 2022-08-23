package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.MyPremiumToolsItems;
import org.openqa.selenium.WebDriver;

public abstract class MyPremiumToolsPageBase extends AbstractPage implements IMobileUtils {
    public MyPremiumToolsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isMyPremiumPageItemNamePresent(MyPremiumToolsItems item);
    public abstract boolean isMyPremiumPageItemDescriptionPresent(MyPremiumToolsItems item);

}
