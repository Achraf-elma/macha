package businessLogic;

import java.util.*;

public class User {
	
	private String nickname;
	private String pwd;
	private String userfirstname;
	private String userlastname;
	private String userdateofbirth;
	private String address;
	
	public User(String nick, String pwd, String firstname, String lastname, String birth, String address) {
		
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
		
	// GETTERS & SETTERS
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserfirstname() {
		return userfirstname;
	}
	public void setUserfirstname(String userfirstname) {
		this.userfirstname = userfirstname;
	}
	public String getUserlastname() {
		return userlastname;
	}
	public void setUserlastname(String userlastname) {
		this.userlastname = userlastname;
	}
	public String getUserdateofbirth() {
		return userdateofbirth;
	}
	public void setUserdateofbirth(String userdateofbirth) {
		this.userdateofbirth = userdateofbirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
