package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.MyItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.MyItemsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyItemsPageBase.class)
public class MyItemsPage extends MyItemsPageBase {

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.myfitnesspal.android:id/" + "%s']" + "//android.widget.Button[@text='CREATE']")
    private ExtendedWebElement items;

    @FindBy(xpath = "//android.widget.TextView[contains(@text, 'Foods')]")
    private ExtendedWebElement foodsCount;

    public MyItemsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage openItem(MyItems item) {
        items.format(item.getId()).click(3);
        return initPage(getDriver(), item.getPage());
    }

    @Override
    public String getFoodsCount() {
        return foodsCount.getText().split(" ")[0];
    }


}
