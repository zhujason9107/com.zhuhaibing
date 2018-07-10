package com.zhuhaibing.baoko.testcase;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.zhuhaibing.baoko.base.DriverBase;
import com.zhuhaibing.baoko.business.WhiteHolePro;
import com.zhuhaibing.baoko.util.ExcelUtil;



public class LoginTest extends CaseBase{
	public DriverBase driver;
	public WhiteHolePro whiteHolePro;
	
	/*
	 * 备注   备注
	 * */
	@BeforeClass
	@Parameters(value= {"browserType","loginPage"})
	public void loginTest(String browserType,String url){
		this.driver = InitDriver(browserType);
		driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		sleep(2000);
		whiteHolePro=new WhiteHolePro(driver);
	}
	
	@Test(dataProvider="datas")
	public void test(String username,String password,String expectvale){
		
		whiteHolePro.login(username, password);
		sleep(2000);
		WebElement tips=driver.findElement(By.xpath("//*[contains(text(),"+expectvale+")]"));
		Assert.assertNotNull(tips);
		sleep(3000);
		driver.refresh();
	}
	
	@DataProvider
	public Object[][] datas(){
		Object[][] datas=ExcelUtil.read("/baidonglogin.xlsx",1,1,1,3);
		
		return datas;
	}
	
	public void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
