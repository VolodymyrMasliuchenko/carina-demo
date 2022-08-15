package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class LoginPageBase extends AbstractPage {

	public LoginPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract boolean isSexRadioButtonsChecked(GenderList sex);

	public abstract void typeName(String name);

	public abstract void typePassword(String password);

	public void selectSex(GenderList sex) {
		throw new NotImplementedException("Method is not implemented for IOS");
	}

	public abstract void checkPrivacyPolicyCheckbox();

	public abstract CarinaDescriptionPageBase clickLoginBtn();

	public abstract boolean isLoginBtnActive();

	public abstract boolean isNameInputFieldPresent();

	public abstract boolean isPasswordInputFieldPresent();

	public abstract boolean isSexRadioButtonsPresent(GenderList sex);

	public abstract boolean isPrivacyPolicyCheckboxPresent();

	public abstract String getUsernameInputField();

	public abstract String getPasswordInputField();


	public abstract boolean isPrivacyPolicyCheckboxChecked();

	public abstract CarinaDescriptionPageBase login();

	public enum GenderList {
		MALE("male"),
		FEMALE("female");

		public final String value;

		GenderList(String value) {
			this.value = value;
		}

	}
}
