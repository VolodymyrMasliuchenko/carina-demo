package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.EditDiaryPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = EditDiaryPageBase.class)
public class EditDiaryPage extends EditDiaryPageBase {

    @ExtendedFindBy(accessibilityId = "View Nutrition")
    private ExtendedWebElement clearTrash;

    @FindBy(id = "com.myfitnesspal.android:id/select_all")
    private ExtendedWebElement selectAll;

    @FindBy(xpath = "//android.widget.Button[@text='Delete']")
    private ExtendedWebElement deleteButtonPopUp;

    public EditDiaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase clearDiaryFromEditPage() {
        selectAll.click(3);
        clearTrash.click(3);
        deleteButtonPopUp.click(3);
        return initPage(getDriver(), DiaryPageBase.class);
    }


}
