
package com.tomkimani.mgwt.demo.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.ui.client.dialog.Dialogs;
import com.tomkimani.mgwt.demo.client.dashboard.DashboardActivity;
import com.tomkimani.mgwt.demo.client.login.LoginActivity;
import com.tomkimani.mgwt.demo.client.places.LoginPlace;
import com.tomkimani.mgwt.demo.client.places.DashboardPlace;


/**
 * 
 */
public class PhoneActivityMapper implements ActivityMapper {

	private final ClientFactory clientFactory;

	public PhoneActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		//Dialogs.alert("Going", place.toString(), null);
		if(place instanceof DashboardPlace){
			return new DashboardActivity(clientFactory);
		}
		
		else if(place instanceof LoginPlace){
			return new LoginActivity(clientFactory);
		}
		
		else{
		     return new LoginActivity(clientFactory);
		}
	}
	
}
