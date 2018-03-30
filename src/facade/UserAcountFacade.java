package facade;
import database.*;
import businessLogic.*;
import javafx.collections.ObservableList;

public class UserAcountFacade {

	private AbstractDAOFactory af = new PostgresFactory();
	private UserDAO ud = af.createUserDAO();
	
	
	public void getLoggedUser() {
		
        }
}