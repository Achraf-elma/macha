package facade;
import database.*;
import businessLogic.*;

public class InvitationFacade {
	
	private AbstractDAOFactory af = new PostgresFactory();
	private InvitationDAO ud = af.createInvitationDAO();
	private Boolean connected=false; 
	
	
}