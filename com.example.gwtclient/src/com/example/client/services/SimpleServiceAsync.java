package com.example.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;

public interface SimpleServiceAsync extends RemoteService{
	
	public void getWorld(AsyncCallback<String> callback);

}
