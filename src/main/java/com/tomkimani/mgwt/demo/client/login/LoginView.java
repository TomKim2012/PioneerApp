package com.tomkimani.mgwt.demo.client.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;
import com.googlecode.mgwt.ui.client.widget.Button;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.WidgetList;
import com.tomkimani.mgwt.demo.client.css.LogoBundle;
import com.tomkimani.mgwt.demo.client.login.LoginActivity.ILoginView;
import com.tomkimani.mgwt.demo.client.ui.PasswordField;
import com.tomkimani.mgwt.demo.client.ui.TextField;

public class LoginView implements ILoginView{

	private static LoginViewUiBinder uiBinder = GWT
			.create(LoginViewUiBinder.class);
	interface LoginViewUiBinder extends UiBinder<Widget, LoginView> {
	}
	
	LayoutPanel LayoutPanel;
	WidgetList widgetList;
	Button loginButton;
	
	//private final Widget widget;
	
	public LoginView() {
		//widget = uiBinder.createAndBindUi(this);
		widgetList = new WidgetList();
		LayoutPanel = new LayoutPanel();
		loginButton = new Button("LOGIN");
	
		//Logo
		Image logo = new Image(LogoBundle.INSTANCE.logo());
		logo.getElement().getStyle().setMarginLeft(20.0, Unit.PCT);
		LayoutPanel.add(logo);
		
		
		//UserName And Password TexFields
		widgetList.setRound(true);
		
		widgetList.add(new TextField("UserName"));
		widgetList.add(new PasswordField("Password"));
		LayoutPanel.add(widgetList);
		
		
		//LoginButton
		loginButton.setConfirm(true);
		LayoutPanel.add(loginButton);
	}
	
	@Override
	public Widget asWidget() {
		return LayoutPanel;
	}
	
	public HasTapHandlers getLoginButton() {
		return loginButton;
	}

}
