package com.example.server;

import org.eclipse.core.runtime.Platform;

import com.example.client.services.SimpleService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class SimpleServiceImpl extends RemoteServiceServlet implements SimpleService {

	private static final long serialVersionUID = 1L;

	public String getWorld() {
		return Platform.getOS();
	}

}
