package database;

public class PostgresFactory extends AbstractDAOFactory{
	
	public UserDAO createUserDAO() {
		return new UserDAOPostgres();
	}

}
