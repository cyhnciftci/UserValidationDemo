package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.EMailService;
import eCommerceDemo.entities.concretes.User;

public class EMailManager implements EMailService {

	@Override
	public void verifyEMail(User user) {
		System.out.println("Mailinize doðrulama kodu gönderildi: " + user.geteMail());
		
	}

	@Override
	public void verifyClickEmail(User user) {
		System.out.println("Doðrulamak için týklayýn: "+ user.getFirstName());
		
	}

}
