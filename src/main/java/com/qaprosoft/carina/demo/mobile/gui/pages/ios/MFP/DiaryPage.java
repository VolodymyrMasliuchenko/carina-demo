package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;

import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DiaryPageBase.class)
public class DiaryPage extends DiaryPageBase {
    public DiaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isEditDiaryButtonPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void cleanDiary() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public int getRemainingCalories() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public int getGoalCalories() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void addQuickFood() {
        throw new NotImplementedException("Not implemented");
    }
}
