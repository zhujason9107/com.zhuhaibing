package com.zhuhaibing.baoko.testcase;

import com.zhuhaibing.baoko.base.DriverBase;

public class CaseBase {
	public DriverBase InitDriver(String browser){
		return new DriverBase(browser);
	}
}
