package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;

import java.util.Objects;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase implements IMobileUtils {

    @FindBy(xpath = "//android.widget.FrameLayout/android.widget.TextView")
    private ExtendedWebElement loginPageTitle;

    @FindBy(id = "com.solvd.carinademoapplication:id/name")
    private ExtendedWebElement nameInputField;

    @FindBy(id = "com.solvd.carinademoapplication:id/password")
    private ExtendedWebElement passwordInputField;

    @FindBy(id = "com.solvd.carinademoapplication:id/radio_male")
    private ExtendedWebElement maleRadioBtn;

    @FindBy(id = "com.solvd.carinademoapplication:id/radio_female")
    private ExtendedWebElement femaleRadioBtn;

    @FindBy(id = "com.solvd.carinademoapplication:id/checkbox")
    private ExtendedWebElement privacyPolicyCheckbox;

    @FindBy(id = "com.solvd.carinademoapplication:id/login_button")
    private ExtendedWebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return loginPageTitle.isElementPresent();
    }

    public boolean isNameInputFieldPresent() {
        return nameInputField.isElementPresent();
    }

    public boolean isPasswordInputFieldPresent() {
        return passwordInputField.isElementPresent();
    }

    @Override
    public boolean isSexRadioButtonsPresent(genderList sex) {
        if (Objects.equals(sex.value, genderList.MALE.value)) {
            return maleRadioBtn.isElementPresent();
        } else {
            return femaleRadioBtn.isElementPresent();
        }
    }

    public boolean isPrivacyPolicyCheckboxPresent() {
        return privacyPolicyCheckbox.isElementPresent();
    }

    public boolean isNameInputFieldTyped(String username) {return nameInputField.isElementWithTextPresent(username);}
    public boolean isPasswordInputFieldTyped(String password) {return passwordInputField.isElementWithTextPresent(password);}

    public boolean isPrivacyPolicyCheckboxChecked() {
        return privacyPolicyCheckbox.isChecked();
    }

    @Override
    public boolean isSexRadioButtonsChecked(genderList sex) {
        if (Objects.equals(sex.value, genderList.MALE.value)) {
            return maleRadioBtn.isChecked();
        } else {
            return femaleRadioBtn.isChecked();
        }
    }

    @Override
    public void typeName(String name) {
        nameInputField.type(name);
        hideKeyboard();
    }

    @Override
    public void typePassword(String password) {
        passwordInputField.type(password);
    }

    @Override
    public void selectSex(genderList sex) {
        if (Objects.equals(sex.value, genderList.MALE.value)) {
            maleRadioBtn.click();
        } else {
            femaleRadioBtn.click();
        }
    }

    @Override
    public void checkPrivacyPolicyCheckbox() {
        privacyPolicyCheckbox.click();
    }

    @Override
    public CarinaDescriptionPageBase clickLoginBtn() {
        loginBtn.click();
        return initPage(getDriver(), CarinaDescriptionPageBase.class);
    }

    @Override
    public boolean isLoginBtnActive() {
        return Boolean.parseBoolean(loginBtn.getAttribute("enabled"));
    }

    @Override
    public CarinaDescriptionPageBase login() {
        String username = "Test user";
        String password = RandomStringUtils.randomAlphabetic(10);
        genderList sex = genderList.MALE;
        typeName(username);
        typePassword(password);
        selectSex(sex);
        checkPrivacyPolicyCheckbox();
        return clickLoginBtn();
    }

}
