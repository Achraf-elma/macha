package facade;
import database.*;
import businessLogic.*;
import javafx.collections.ObservableList;

public class UserLoginFacade {

	private AbstractDAOFactory af = new PostgresFactory();
	private UserDAO ud = af.createUserDAO();
	private Boolean connected=false; 
	
	public void login(String userid, String pwd) {
		User userCreated = ud.createById(userid, pwd);
		
		if(userCreated != null){
			setConnected(true);
		}else{
			setConnected(false);
		}
        }
        
	public ObservableList<User> getAllUser(){
            return ud.getAll();
        }
	


	public Boolean getConnected() {
		return connected;
	}

	public void setConnected(Boolean connected) {
		this.connected = connected;
	}
}
