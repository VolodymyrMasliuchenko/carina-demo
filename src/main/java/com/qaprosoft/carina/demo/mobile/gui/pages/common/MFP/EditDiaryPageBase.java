package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class EditDiaryPageBase extends AbstractPage {
    public EditDiaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract DeleteDiaryPopUpPageBase clearDiaryFromEditPage();

}
