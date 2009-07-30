package com.example.client;

import com.example.client.services.SimpleService;
import com.example.client.services.SimpleServiceAsync;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Main entry point for the example project.
 * @author Ian Bull
 *
 */
public class StartingPoint implements EntryPoint {

	/**
	 * Starting point for the Module
	 */
	public void onModuleLoad() {
		final Label label = new Label("Hello, ");
		
		SimpleServiceAsync simpleService = (SimpleServiceAsync) GWT.create(SimpleService.class);
		String moduleRelativeURL = GWT.getModuleBaseURL() + "simpleservice";
		((ServiceDefTarget)simpleService).setServiceEntryPoint(moduleRelativeURL);
		
		simpleService.getWorld(new AsyncCallback<String>() {

			public void onFailure(Throwable arg0) {
				// Do nothing on failure
			}

			public void onSuccess(String arg0) {
				label.setText(label.getText() + arg0);
			}
		});
		RootPanel.get().add(label);
	}

}
