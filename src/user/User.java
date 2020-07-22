package user;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	String username;
	String password;
	int age;
	Set<Integer>orderIds;
	
	public User(String customUsername, String customPassword, int customAge, Set<Integer>orderIDs) {
		
		this.username = customUsername;
		this.password = customPassword;
		this.age = customAge;
		this.orderIds = orderIDs;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set a = new HashSet();
		a.add(1212);
		
		User Frank = new User("frankZawacki", "password", 21, a);
	}

}
