package com.zhuhaibing.baoko.business;

import com.zhuhaibing.baoko.base.DriverBase;
import com.zhuhaibing.baoko.handle.WhiteHoleLoginHandle;

public class WhiteHolePro {
	public WhiteHoleLoginHandle whiteHoleLoginHandle;
	public DriverBase driver;
	/**
	 * @param driver
	 */
	public WhiteHolePro(DriverBase driver){
		this.driver = driver;
		whiteHoleLoginHandle = new WhiteHoleLoginHandle(driver);
	}
	/**
	 * @param username
	 * @param password
	 */
	public void login(String username,String password){
		if(whiteHoleLoginHandle.assertLoginPage()){
			whiteHoleLoginHandle.sendKeysUser(username);
			whiteHoleLoginHandle.sendKeysPassword(password);
//			System.out.println("卧槽");
			whiteHoleLoginHandle.clickLoginButton();
		}else{
			System.out.println("页面不存在或者状态不正确。");
		}
	}
}
