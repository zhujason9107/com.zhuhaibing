package com.zhuhaibing.baoko.page;

import org.openqa.selenium.WebElement;

import com.zhuhaibing.baoko.base.DriverBase;
import com.zhuhaibing.baoko.util.GetByLocator;



public class WhiteHoleLoginPage extends BasePage{

	public WhiteHoleLoginPage(DriverBase driver) {
		super(driver);
	}
	
	/**
	 * 获取用户名输入框
	 * */
	public WebElement getUserElement(){
		return element(GetByLocator.getLocator("username"));
	}
	
	/**
	 * 获取密码输入框Element
	 * */
	public WebElement getPasswordElement(){
		return element(GetByLocator.getLocator("password"));
	}
	/**
	 * 获取登陆按钮element
	 * */
	public WebElement getLoginButtonElement(){
		return element(GetByLocator.getLocator("loginbutton"));
	}
	
}
