package eCommerceDemo.dataAccess.concretes.InMemory;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("Kullanýcý Eklendi: " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		this.users.remove(user);
		System.out.println("Kullanýcý Silindi: " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý Güncellendi: " + user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public boolean eMailExist(User user) {
		for (User people : users) {
			if(people.geteMail()==user.geteMail()) {
				return false;
			}
		}
		return true;
	}

}
