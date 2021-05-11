package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.CheckManager;
import eCommerceDemo.business.concretes.EMailManager;
import eCommerceDemo.business.concretes.LoginManager;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.GoogleManagerAdapter;
import eCommerceDemo.dataAccess.concretes.InMemory.InMemoryUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new LoginManager(new EMailManager(), new CheckManager(), new InMemoryUserDao()), new GoogleManagerAdapter());
		User user1 = new User(1, "sefer", "çiftçi", "seferceyhunciftci@gmail.com", "121212");
		userService.register(user1);
		userService.login("seferceyhunciftci@gmail.com", "121212");
		System.out.println("Google Simülasyon");
		userService.registerGoogle();
		System.out.println("----------------------------------");
		
		

	}

}
