package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums;

public enum CustomSummaryPageItems {

    FAT("cbFat"),
    SAT_FAT("cbSatFat"),
    POLY_FAT("cbPolyFat"),
    MONO_FAT("cbMonoFat"),
    TRANS_FAT("cbTransFat"),
    CHOLESTEROL("cbCholesterol"),
    SODIUM("cbSodium"),
    POTASSIUM("cbPotassium"),
    CARBOHYDRATES("cbCarbs"),
    FIBER("cbFiber"),
    SUGAR("cbSugar"),
    PROTEIN("cbProtein"),
    VITAMIN_A("cbVitaminA"),
    VITAMIN_C("cbVitaminC"),
    CALCIUM("cbCalcium"),
    IRON("cbIron");

    private String androidOption;

    CustomSummaryPageItems(String androidOption) {
        this.androidOption = androidOption;
    }

    public String getAndroidOption() {
        return androidOption;
    }
}
