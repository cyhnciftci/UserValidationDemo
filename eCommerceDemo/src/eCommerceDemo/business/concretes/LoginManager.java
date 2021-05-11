package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.CheckService;
import eCommerceDemo.business.abstracts.EMailService;
import eCommerceDemo.business.abstracts.LoginService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class LoginManager implements LoginService {
	private EMailService eMailService;
	private CheckService checkService;
	private UserDao userDao;

	public LoginManager(EMailService eMailService, CheckService checkService, UserDao userDao) {
		super();
		this.eMailService = eMailService;
		this.checkService = checkService;
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		if (!userDao.eMailExist(user)) {
			System.out.println("Hata: EMail daha önce kullanýlmýþ" + user.geteMail());
			return;
		}
		if(checkService.checkFirstName(user.getFirstName()))  
		{ 	
			System.out.println("Ýsim doðrulandý: ");
		}
		else {
			return;
		}
		
		if(checkService.checkLastName(user.getLastName())) {
			System.out.println("Soyisim doðrulandý: ");
		}
		else {
			return;
		}
		
		if(checkService.checkEmail(user.geteMail())) {
			System.out.println("EMail Doðrulandý");	
		}
		else {
			return;
		}
		
		if(checkService.checkPassword(user.getPassword())) {
			System.out.println("Þifre doðrulandý: ");	
		}
		else {
			return;
		}
		eMailService.verifyClickEmail(user);
		eMailService.verifyEMail(user);
		userDao.add(user);
		System.out.println("Kayýt baþarýlý: " + user.getFirstName());
		
	}

	@Override
	public void login(String eMail, String password) {
		for (User user : userDao.getAll()) {
			if (eMail==user.geteMail() && password == user.getPassword()) {
				System.out.println("Giriþ Baþarýlý");
				return;
			}
			System.out.println("Tekrar deneyiniz");
		}
		
	}

}
