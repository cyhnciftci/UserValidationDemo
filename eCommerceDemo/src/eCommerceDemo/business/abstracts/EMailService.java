package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface EMailService {
	void verifyEMail(User user);
	void verifyClickEmail(User user);

}
