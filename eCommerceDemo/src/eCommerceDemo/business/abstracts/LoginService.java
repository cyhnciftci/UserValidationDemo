package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface LoginService {
	void register(User user);
	void login(String eMail, String password);
}
