package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CreateFoodsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.MyItemsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CreateFoodsPageBase.class)
public class CreateFoodsPage extends CreateFoodsPageBase {

    @FindBy(xpath = "//android.widget.TextView[@text='Create Food']")
    private ExtendedWebElement createFoodPageTitle;

    @FindBy(id = "com.myfitnesspal.android:id/editTxtBrandName")
    private ExtendedWebElement brandNameTextField;

    @FindBy(id = "com.myfitnesspal.android:id/editTxtDescription")
    private ExtendedWebElement descriptionTextField;

    @FindBy(id = "com.myfitnesspal.android:id/editTxtServingSizeQuantity")
    private ExtendedWebElement servingSizeTextField;

    @FindBy(id = "com.myfitnesspal.android:id/servingSizeAutoTxt")
    private ExtendedWebElement servingSizeUnitsTextField;

    @FindBy(id = "com.myfitnesspal.android:id/editTxtServingsPerContainer")
    private ExtendedWebElement servingPerContainerTextField;

    @FindBy(xpath = "//android.widget.TextView[@text='Next']")
    private ExtendedWebElement nextButton;

    @FindBy(id = "com.myfitnesspal.android:id/editTxtCalories")
    private ExtendedWebElement caloriesTextField;

    @FindBy(id = "android:id/button2")
    private ExtendedWebElement noThanksButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Save']")
    private ExtendedWebElement saveButton;

    public CreateFoodsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return createFoodPageTitle.isElementPresent(3);
    }

    @Override
    public MyItemsPageBase createFood(String brand, String description, int servingSize, String units, int servingSizePerContainer, int calories) {
        brandNameTextField.type(brand);
        descriptionTextField.type(description);
        servingSizeTextField.type(String.valueOf(servingSize));
        servingSizeUnitsTextField.type(units);
        servingPerContainerTextField.type(String.valueOf(servingSizePerContainer));
        nextButton.click(3);
        caloriesTextField.type(String.valueOf(calories));
        saveButton.click(3);
        saveButton.click(3);
        noThanksButton.click(3);
        return initPage(getDriver(), MyItemsPageBase.class);
    }

}
