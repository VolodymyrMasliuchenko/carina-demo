package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DeleteDiaryPopUpPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.EditDiaryPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DiaryPageBase.class)
public class DiaryPage extends DiaryPageBase {

    @FindBy(xpath = "(//android.widget.TextView[@text='Diary'])[1]")
    private ExtendedWebElement diaryPageTitle;

    @ExtendedFindBy(accessibilityId = "Edit Diary")
    private ExtendedWebElement editDiaryButton;

    @FindBy(id = "com.myfitnesspal.android:id/remaining_diary")
    private ExtendedWebElement remainingCalories;

    @FindBy(id = "com.myfitnesspal.android:id/goal")
    private ExtendedWebElement goalCalories;

    public DiaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isEditDiaryButtonPresent() {
        return editDiaryButton.isElementPresent(3);
    }



    @Override
    public void isGoalAndRemainingCaloriesEquals() {
        if (!isEditDiaryButtonPresent()) {
            Assert.assertEquals(getRemainingCalories(),getGoalCalories(), "Remaining calories isn't equals to goal calories");
        } else {
            Assert.assertTrue(isEditDiaryButtonPresent(), "Edit diary button isn't present");
            editDiaryButton.click(3);
            EditDiaryPageBase editDiaryPage = initPage(getDriver(), EditDiaryPageBase.class);
            DeleteDiaryPopUpPageBase deleteDiaryPopUpPage = editDiaryPage.clearDiaryFromEditPage();
            deleteDiaryPopUpPage.submitDeleteDiary();
        }
    }

    @Override
    public int getRemainingCalories() {
        String replacedRemain = remainingCalories.getText();
        return Integer.parseInt(replacedRemain.replace(",",""));
    }

    @Override
    public int getGoalCalories() {
        String replacedGoal = goalCalories.getText();
        return Integer.parseInt(replacedGoal.replace(",",""));
    }

    public boolean isPageOpened() {
        return diaryPageTitle.isElementPresent();
    }


}
