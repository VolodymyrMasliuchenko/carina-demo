package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class QuickAddPageBase extends AbstractPage {
    public QuickAddPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract int getCaloriesInt();

    public abstract DiaryPageBase submitNutrient();

    public abstract void quickAddNutrient(int fatInt, int carbsInt, int proteinInt);

}
