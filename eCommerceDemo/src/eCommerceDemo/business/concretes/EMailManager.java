package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.EMailService;
import eCommerceDemo.entities.concretes.User;

public class EMailManager implements EMailService {

	@Override
	public void verifyEMail(User user) {
		System.out.println("Mailinize do�rulama kodu g�nderildi: " + user.geteMail());
		
	}

	@Override
	public void verifyClickEmail(User user) {
		System.out.println("Do�rulamak i�in t�klay�n: "+ user.getFirstName());
		
	}

}
