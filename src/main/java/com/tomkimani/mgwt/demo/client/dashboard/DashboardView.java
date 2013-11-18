package com.tomkimani.mgwt.demo.client.dashboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.dom.client.Style.VerticalAlign;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasVerticalAlignment.VerticalAlignmentConstant;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.ProgressIndicator;
import com.googlecode.mgwt.ui.client.widget.tabbar.BookmarkTabBarButton;
import com.googlecode.mgwt.ui.client.widget.tabbar.FeaturedTabBarButton;
import com.googlecode.mgwt.ui.client.widget.tabbar.MoreTabBarButton;
import com.googlecode.mgwt.ui.client.widget.tabbar.MostViewedTabBarButton;
import com.googlecode.mgwt.ui.client.widget.tabbar.TabPanel;
import com.tomkimani.mgwt.demo.client.dashboard.DashboardActivity.ITestView;
import com.tomkimani.mgwt.demo.client.ui.IconButton;

public class DashboardView implements ITestView{

	private static TestViewUiBinder uiBinder = GWT.create(TestViewUiBinder.class);
	
	private final Widget widget;
	private LayoutPanel panel;
	private TabPanel tabPanel;
	private HeaderPanel headerPanel;
	private ProgressIndicator progressIndicator;
	private HeaderButton logoutButton;
	private HTML title;
	private FeaturedTabBarButton transactionButton;
	private BookmarkTabBarButton customersButton;
	private MoreTabBarButton settingsButton;
	
	@UiField VerticalPanel vPanel;
	@UiField IconButton btnDeposit;

	interface TestViewUiBinder extends UiBinder<Widget, DashboardView> {
	}

	public DashboardView() {
		widget = uiBinder.createAndBindUi(this);
		
		//Container
		panel = new LayoutPanel();
		
		//Header
		createHeader();
		createTabPanel();
		
		panel.add(headerPanel);
		panel.add(tabPanel);
		
	}
	
	@Override
	public Widget asWidget() {
		return panel;
	}
	
	private void createHeader(){
		//Initializations
		headerPanel = new HeaderPanel();
		title = new HTML();
		logoutButton = new HeaderButton();
	
		
		title.setText("Pioneer FSA");
		headerPanel.setCenterWidget(title);
		
		//Logout
		logoutButton.setText("LogOut");
		headerPanel.setRightWidget(logoutButton);
		
	}
	
	private void createTabPanel(){
		tabPanel= new TabPanel();
		transactionButton= new FeaturedTabBarButton();
		customersButton = new BookmarkTabBarButton();
		settingsButton = new MoreTabBarButton();
		
		//Vertical Panel
		vPanel.setSpacing(10);
		//vPanel.setHeight("290px");
		//TabBar Buttons
		transactionButton.setText("Home");
		customersButton.setText("Transactions");
		settingsButton.setText("Settings");
		
		//TabPanel::Transaction Panel
		tabPanel.add(transactionButton,widget);
		tabPanel.add(customersButton, progressIndicator);
		tabPanel.add(settingsButton, progressIndicator);
	}
	
	
	public HasTapHandlers getLogoutButton() {
		return logoutButton;
	}
			
}
