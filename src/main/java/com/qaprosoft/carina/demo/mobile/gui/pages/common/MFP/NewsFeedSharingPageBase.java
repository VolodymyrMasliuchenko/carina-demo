package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.NewsFeedSharingCheckboxItems;
import org.openqa.selenium.WebDriver;

public abstract class NewsFeedSharingPageBase extends AbstractPage {
    public NewsFeedSharingPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void selectCheckboxItem(NewsFeedSharingCheckboxItems item);
    public abstract void deselectCheckboxItem(NewsFeedSharingCheckboxItems item);
    public abstract boolean isCheckboxItemSelected(NewsFeedSharingCheckboxItems item);
    public abstract SharingAndPrivacyPageBase clickBackButton();

}
