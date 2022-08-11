package com.qaprosoft.carina.demo.MFP;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.*;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;

public class MobileMyFitnessPalTest implements IAbstractTest, IMobileUtils {

    @Test
    @MethodOwner(owner = "vmasliuchenko")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testLoginPageMyFitnessPal() {
        String email = "";
        String password = "";
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.loginToAccount(email, password);
    }
}
