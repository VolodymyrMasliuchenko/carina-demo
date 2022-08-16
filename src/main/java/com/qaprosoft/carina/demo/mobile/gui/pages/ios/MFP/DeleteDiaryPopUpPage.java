package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DeleteDiaryPopUpPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DeleteDiaryPopUpPageBase.class)
public class DeleteDiaryPopUpPage extends DeleteDiaryPopUpPageBase {
    public DeleteDiaryPopUpPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase submitDeleteDiary() {
        throw new NotImplementedException("Not implemented");
    }
}
