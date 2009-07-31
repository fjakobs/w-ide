package org.eclipse.wide.client.nav;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class NavEntryPoint implements EntryPoint {

	public void onModuleLoad() {
		Label label = new Label("W-IDE Test");
		RootPanel.get().add(label);
	}

}
