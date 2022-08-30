package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.AccountPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.AccountPageTabs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AccountPageBase.class)
public class AccountPage extends AccountPageBase {

    @FindBy(id = "com.myfitnesspal.android:id/toolbarUsername")
    private ExtendedWebElement accountUsername;

    @ExtendedFindBy(accessibilityId = "%s")
    private ExtendedWebElement tabName;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return accountUsername.isElementPresent(3);
    }
    @Override
    public String getAccountUsername() {
        return accountUsername.getText();
    }

    @Override
    public AbstractPage openNavbarItem(AccountPageTabs item) {
        tabName.format(item.getId()).click(3);
        return initPage(getDriver(), item.getPage());
    }


}
