package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DeleteDiaryPopUpPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DeleteDiaryPopUpPageBase.class)
public class DeleteDiaryPopUpPage extends DeleteDiaryPopUpPageBase {

    @FindBy(xpath = "//android.widget.Button[@text='Delete']")
    private ExtendedWebElement deleteButton;

    public DeleteDiaryPopUpPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase submitDeleteDiary() {
        deleteButton.click(3);
        return initPage(getDriver(), DiaryPageBase.class);
    }


}
