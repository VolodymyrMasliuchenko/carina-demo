package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.*;

public enum MyItems {
    MEALS("meals", CreateMealsPageBase.class),
    RECIPES("recipes", CreateRecipesPageBase.class),
    FOODS("foods", CreateFoodsPageBase.class),
    CARDIO("cardio", CreateCardioPageBase.class),
    STRENGTH("strength", CreateStrengthPageBase.class);

    private String id;
    private Class<? extends AbstractPage> page;

    MyItems(String id, Class<? extends AbstractPage> page) {
        this.id = id;
        this.page = page;
    }

    public String getId() {
        return id;
    }

    public Class<? extends AbstractPage> getPage() {
        return page;
    }
}
