package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.EditDiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.QuickAddPageBase;
import com.sun.istack.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DiaryPageBase.class)
public class DiaryPage extends DiaryPageBase {
    private final Logger LOGGER = Logger.getLogger(DiaryPage.class);

    @FindBy(xpath = "(//android.widget.TextView[@text='Diary'])[1]")
    private ExtendedWebElement diaryPageTitle;

    @ExtendedFindBy(accessibilityId = "Edit Diary")
    private ExtendedWebElement editDiaryButton;

    @FindBy(id = "com.myfitnesspal.android:id/remaining_diary")
    private ExtendedWebElement remainingCalories;

    @FindBy(id = "com.myfitnesspal.android:id/goal")
    private ExtendedWebElement goalCalories;

    @FindBy(xpath = "(//android.widget.Button)[2]")
    private ExtendedWebElement moreOptionFoodButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Quick Add']")
    private ExtendedWebElement quickAddButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc='NO THANKS']")
    private ExtendedWebElement noThanksGuidePopUpButton;

    public DiaryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return diaryPageTitle.isElementPresent();
    }

    @Override
    public boolean isEditDiaryButtonPresent() {
        return editDiaryButton.isElementPresent(3);
    }

    @Override
    public void cleanDiary() {
        if (!isEditDiaryButtonPresent()) {
            LOGGER.info("Edit diary button isn't present!");
        } else {
            editDiaryButton.click(3);
            EditDiaryPageBase editDiaryPage = initPage(getDriver(), EditDiaryPageBase.class);
            editDiaryPage.clearDiaryFromEditPage();
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

    @Override
    public QuickAddPageBase openQuickAddOption() {
        moreOptionFoodButton.click(3);
        quickAddButton.click(3);
        noThanksGuidePopUpButton.click(3);
        return initPage(getDriver(), QuickAddPageBase.class);
    }


}
