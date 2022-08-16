package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class DeleteDiaryPopUpPageBase extends AbstractPage {

    public DeleteDiaryPopUpPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract DiaryPageBase submitDeleteDiary();

}
