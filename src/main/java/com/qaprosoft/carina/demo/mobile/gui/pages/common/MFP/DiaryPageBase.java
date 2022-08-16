package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DiaryPageBase extends AbstractPage {

    public DiaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isEditDiaryButtonPresent();

    public abstract void isGoalAndRemainingCaloriesEquals();

    public abstract int getRemainingCalories();

    public abstract int getGoalCalories();

}
