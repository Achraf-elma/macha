package businessLogic;

import java.util.*;

public class User {
	
	private String nickname;
	private String pwd;
	private String userfirstname;
	private String userlastname;
	private String userdateofbirth;
	private String address;
	
	public User(String nick, String pwd, String firstname, String lastname, Date birth, String address) {
		
	}
	public User(String nick, String pwd) {
		this.nickname = nick;
		this.pwd = pwd;
		
	}
	// communication object
	public void login(String userid, String pwd) {
		if(userid.equals(this.nickname) && pwd.equals(this.pwd)) {
			System.out.println("Login correct");
		}
		else {
			System.out.println("Login incorrect");
		}
	}
}
