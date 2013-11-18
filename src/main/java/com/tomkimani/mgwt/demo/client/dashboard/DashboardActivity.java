package com.tomkimani.mgwt.demo.client.dashboard;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.tomkimani.mgwt.demo.client.ClientFactory;
import com.tomkimani.mgwt.demo.client.places.DashboardPlace;
import com.tomkimani.mgwt.demo.client.places.LoginPlace;

public class DashboardActivity extends MGWTAbstractActivity {
		ClientFactory factory;
		
		public interface ITestView extends IsWidget{
			public HasTapHandlers getLogoutButton();
		}
		public DashboardActivity(ClientFactory factory) {
			this.factory= factory;
		}
		
		@Override
		public void start(AcceptsOneWidget panel, EventBus eventBus) {
			ITestView view = factory.getTestView();
			panel.setWidget((IsWidget)view);
			
			addHandlerRegistration(view.getLogoutButton().addTapHandler(new TapHandler() {
				
				@Override
				public void onTap(TapEvent event) {
					factory.getPlaceController().goTo(new LoginPlace());
				}
			}));
		}
}
