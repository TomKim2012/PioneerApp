/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.tomkimani.mgwt.demo.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.tomkimani.mgwt.demo.client.dashboard.DashboardView;
import com.tomkimani.mgwt.demo.client.dashboard.DashboardActivity.ITestView;
import com.tomkimani.mgwt.demo.client.login.LoginActivity.ILoginView;
import com.tomkimani.mgwt.demo.client.login.LoginView;

/**
 * @author Daniel Kurka
 * 
 */
public class ClientFactoryImpl implements ClientFactory {

	private EventBus eventBus;
	private PlaceController placeController;

	public ClientFactoryImpl() {
		eventBus = new SimpleEventBus();
		placeController = new PlaceController(eventBus);
	}

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public ITestView getTestView() {
		return new DashboardView();
	}

	@Override
	public ILoginView getLoginView() {
		return new LoginView();
	}
}
