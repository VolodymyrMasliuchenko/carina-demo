package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.QuickAddPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = QuickAddPageBase.class)
public class QuickAddPage extends QuickAddPageBase {

    @FindBy(xpath = "//android.widget.TextView[@text='Quick Add']")
    private ExtendedWebElement quickAddPageTitle;

    @FindBy(id = "com.myfitnesspal.android:id/tvQuickFat")
    private ExtendedWebElement fatTextField;

    @FindBy(id = "com.myfitnesspal.android:id/tvQuickCarbs")
    private ExtendedWebElement carbsTextField;

    @FindBy(id = "com.myfitnesspal.android:id/tvQuickProtein")
    private ExtendedWebElement proteinTextField;

    @FindBy(id = "com.myfitnesspal.android:id/tvQuickCalories")
    private ExtendedWebElement caloriesTextField;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Done']")
    private ExtendedWebElement doneQuickAddButton;

    public QuickAddPage(WebDriver driver) {
        super(driver);
    }

    public int getCaloriesInt() {
        return Integer.parseInt(caloriesTextField.getText());
    }

    public boolean isPageOpened() {
        return quickAddPageTitle.isElementPresent(3);
    }

    @Override
    public void quickAddNutrient(int fatInt, int carbsInt, int proteinInt) {
        this.fatTextField.click(3);
        this.fatTextField.type(String.valueOf(fatInt),1);
        this.carbsTextField.click(3);
        this.carbsTextField.type(String.valueOf(carbsInt),1);
        this.proteinTextField.click(3);
        this.proteinTextField.type(String.valueOf(proteinInt),1);
    }

    @Override
    public DiaryPageBase submitNutrient() {
        doneQuickAddButton.click(3);
        return initPage(getDriver(), DiaryPageBase.class);
    }

}
