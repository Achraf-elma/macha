package database;

public abstract class AbstractDAOFactory {
	
	public abstract UserDAO createUserDAO();
        public abstract PartnersDAO createPartnerDAO();

}
