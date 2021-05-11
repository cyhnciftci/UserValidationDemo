package eCommerceDemo.core;

import eCommerceDemo.GoogleVerify.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void registerSystem() {
		GoogleManager manager = new GoogleManager();
		manager.register();
		
	}

}
