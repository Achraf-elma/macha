package facade;

import database.AbstractDAOFactory;
import database.PostgresFactory;
import database.UserDAO;
import userinterface.UserIndex;

import java.sql.Date;

import businessLogic.User;

public class SignUpFacade {

	private AbstractDAOFactory af = new PostgresFactory();
	private UserDAO ud = af.createUserDAO();
	
	
	public void signUp(String userNick, String pwd, String userFirstName, String userLastName, Date dateBirth, String adress) {
		
		
		User userCreated = ud.createById(userNick, pwd, userFirstName, userLastName, (java.sql.Date) dateBirth, adress);
	
	}
	/*public void display(String nick) {
		ud.display(nick);
	}*/
	
}