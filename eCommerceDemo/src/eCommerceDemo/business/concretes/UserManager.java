package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.LoginService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.GoogleService;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService {
	private LoginService loginService;
	private GoogleService googleService;
	

	public UserManager(LoginService loginService, GoogleService googleService) {
		super();
		this.loginService = loginService;
		this.googleService = googleService;
	}

	@Override
	public void login(String email, String password) {
		loginService.login(email, password);
		
	}

	@Override
	public void register(User user) {
		loginService.register(user);
		
	}

	@Override
	public void registerGoogle() {
		googleService.registerSystem();
		
	}

}
