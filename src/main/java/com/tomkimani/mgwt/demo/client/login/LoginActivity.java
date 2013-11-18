package com.tomkimani.mgwt.demo.client.login;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.tomkimani.mgwt.demo.client.ClientFactory;
import com.tomkimani.mgwt.demo.client.places.DashboardPlace;

public class LoginActivity extends MGWTAbstractActivity {
		ClientFactory factory;
		
		public interface ILoginView extends IsWidget{
			HasTapHandlers getLoginButton();
		}
		public LoginActivity(ClientFactory factory) {
			this.factory= factory;
		}
		
		@Override
		public void start(AcceptsOneWidget panel, EventBus eventBus) {
			ILoginView view = factory.getLoginView();
			panel.setWidget(view);
			
			
			//Add Tap Handler for Login
			addHandlerRegistration(view.getLoginButton().addTapHandler(new TapHandler() {
				
				@Override
				public void onTap(TapEvent event) {
					factory.getPlaceController().goTo(new DashboardPlace());
				}
			}));
		}
}
