package database;

public abstract class AbstractDAOFactory {
	
	public abstract UserDAO createUserDAO();
    public abstract PartnersDAO createPartnerDAO();
    public abstract EventDAO createEventDAO();
    public abstract InvitationDAO createInvitationDAO();
    public abstract CategoryDAO createCategoryDAO();
}
