package facade;

import database.AbstractDAOFactory;
import database.PostgresFactory;
import database.UserDAO;
import userinterface.UserIndex;
import businessLogic.User;

public class UserIndexFacade {

	private AbstractDAOFactory af = new PostgresFactory();
	private UserDAO ud = af.createUserDAO();
	
	public UserIndexFacade(User usr) {
		UserIndex ui = new UserIndex (usr);
	}
	
}
