package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CreateFoodsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.MyItemsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

public class CreateFoodsPage extends CreateFoodsPageBase {
    public CreateFoodsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public MyItemsPageBase createFood(String brand, String description, int servingSize, String units, int servingSizePerContainer, int calories) {
        throw new NotImplementedException("Not implemented");
    }
}
