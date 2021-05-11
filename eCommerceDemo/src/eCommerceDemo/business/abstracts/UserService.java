package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
	void login(String email,String password); 
	void register(User user);
	void registerGoogle();

}
