package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CreateFoodsPageBase extends AbstractPage {
    public CreateFoodsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract MyItemsPageBase createFood(String brand, String description, int servingSize, String units, int servingSizePerContainer, int calories);

}
