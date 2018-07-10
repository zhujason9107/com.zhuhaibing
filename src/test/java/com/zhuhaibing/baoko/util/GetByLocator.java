package com.zhuhaibing.baoko.util;

import org.openqa.selenium.By;

public class GetByLocator {
	public static By getLocator(String key){
		ProUtil pro = new ProUtil("elements.properties");
		String locator = pro.getPro(key);
		String locatorType = locator.split(">")[0];
		String locatorValue = locator.split(">")[1];
		if(locatorType.equalsIgnoreCase("id")){
			return By.id(locatorValue);
		}else if(locatorType.equalsIgnoreCase("name")){
			return By.name(locatorValue);
		}else if(locatorType.equalsIgnoreCase("tagName")){
			return By.tagName(locatorValue);
		}else if(locatorType.equalsIgnoreCase("linkText")){
			return By.linkText(locatorValue);
		}else if(locatorType.equalsIgnoreCase("className")){
			return By.className(locatorValue);
		}else{
			return By.xpath(locatorValue);
		}
	}
}
