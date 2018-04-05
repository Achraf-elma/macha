package database;

import java.sql.Connection;

public class PostgresFactory extends AbstractDAOFactory{
	
	Connection coSql = ConnectionPostgreSQL.getInstance();

	public UserDAO createUserDAO() {
		return new UserDAOPostgres(coSql);
	}
        
    public PartnersDAO createPartnerDAO() {
		return new PartnersDAOPostgres(coSql);
	}
        
        public EventDAO createEventDAO() {
            return new EventDAOPostgres(coSql);
        }
   
    public InvitationDAO createInvitationDAO() {
         return new InvitationDAOPostgres(coSql);
    }

    public CategoryDAO createCategoryDAO() {
         return new CategoryDAOPostgres(coSql);
    }


}
// Connection here