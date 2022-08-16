package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DeleteDiaryPopUpPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.EditDiaryPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = EditDiaryPageBase.class)
public class EditDiaryPage extends EditDiaryPageBase {
    public EditDiaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DeleteDiaryPopUpPageBase clearDiaryFromEditPage() {
        throw new NotImplementedException("Not implemented");
    }
}
