package eCommerceDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.CheckService;

public class CheckManager implements CheckService {
	public static final String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

	@Override
	public boolean checkPassword(String password) {
		if(password.length()<6) {
			System.out.println("Parola en az 6 haneli olmalýdýr.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (!matcher.matches()) {
			System.out.println("Mailinizi regex formatýnda giriniz.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length()<2) {
			System.out.println("Your name must contain at least 2 characters.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()<2) {
			System.out.println("Your surname must contain at least 2 characters.");
			return false;
		}
		return true;
	}

}
