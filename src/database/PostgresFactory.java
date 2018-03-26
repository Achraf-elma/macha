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

}
// Connection here