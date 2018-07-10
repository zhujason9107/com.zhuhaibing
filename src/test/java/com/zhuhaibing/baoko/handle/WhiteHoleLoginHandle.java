package com.zhuhaibing.baoko.handle;

import com.zhuhaibing.baoko.base.DriverBase;
import com.zhuhaibing.baoko.page.WhiteHoleLoginPage;

public class WhiteHoleLoginHandle {
	public DriverBase driver;
	public WhiteHoleLoginPage whiteHoleLoginPage;
	public WhiteHoleLoginHandle(DriverBase driver){
		this.driver = driver;
		whiteHoleLoginPage = new WhiteHoleLoginPage(driver);
	}
	
	/**
	 * 输入用户名
	 * */
	public void sendKeysUser(String username){
		whiteHoleLoginPage.sendkeys(whiteHoleLoginPage.getUserElement(), username);
	}
	
	/**
	 * 输入密码
	 * */
	public void sendKeysPassword(String password){
		whiteHoleLoginPage.sendkeys(whiteHoleLoginPage.getPasswordElement(), password);
	}
	/**
	 * 点击登陆
	 * */
	public void clickLoginButton(){
		whiteHoleLoginPage.click(whiteHoleLoginPage.getLoginButtonElement());
	}

	/**
	 * 判断是否是登陆页面
	 * */
	public boolean assertLoginPage(){
		return whiteHoleLoginPage.assertElementIs(whiteHoleLoginPage.getUserElement());
	}
	

}
