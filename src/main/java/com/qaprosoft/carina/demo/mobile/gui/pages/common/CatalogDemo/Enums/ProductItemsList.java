package com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.Enums;

public enum ProductItemsList {
    SL_BACKPACK("Sauce Labs Backpack"),
    SL_LIGHT("Sauce Labs Bike Light"),
    SL_T_SHIRT("Sauce Labs Bolt T-Shirt"),
    SL_JACKET("Sauce Labs Fleece Jacket"),
    SL_ONESIE("Sauce Labs Onesie"),
    SLT_SHIRT_TWO("Test.allTheThings() T-Shirt");

    private String optionTitle;

    ProductItemsList(String optionTitle) {
        this.optionTitle = optionTitle;
    }

    public String getOptionTitle() {
        return optionTitle;
    }
}
