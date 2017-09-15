package com.cucumberframework.framework.configreader;

import com.cucumberframework.framework.configuration.browser.BrowserType;

public interface ConfigReader {
	public String getUserName();
	public String getPassword();
	public String getWebsite();
	public int getPageLoadTimeOut();
	public int getImplicitWait();
	public int getExplicitWait();
	public BrowserType getBrowser();
}
