package com.tomkimani.mgwt.demo.client.css;

import com.googlecode.mgwt.ui.client.theme.base.HeaderCss;
import com.googlecode.mgwt.ui.client.theme.base.MGWTClientBundleBaseThemeDesktop;
import com.googlecode.mgwt.ui.client.theme.base.TabBarCss;

public interface MyClientBundle extends MGWTClientBundleBaseThemeDesktop{
	
	@Override
	@Source({ "com/googlecode/mgwt/ui/client/theme/base/css/tabbar.css","tabbar.css"})
	TabBarCss getTabBarCss();
	
	@Override
	@Source({ "com/googlecode/mgwt/ui/client/theme/base/css/header.css", "com/googlecode/mgwt/ui/client/theme/base/css/iphone/header.css" })
	HeaderCss getHeaderCss();
	
	
	@Override
	@Source({ "com/googlecode/mgwt/ui/client/theme/base/css/buttons.css", "buttons.css" })
	ButtonsCss getButtonCss();

	
	/*@Source({"fontawesome/font-awesome.css"})
	FontOwesomeCss getFontOwesomeCss();
	*/
}
