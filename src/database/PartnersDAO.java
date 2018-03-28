package database;

import businessLogic.Partner;
import java.sql.Connection;
import database.ConnectionPostgreSQL;

/**
 *
 * @author maximesoustelle
 */
public abstract class PartnersDAO {
    private Partner p;	
    private String name;
    private Connection coSql;
	
    public abstract void addPartnerById(String name);
    public abstract void deletePartnerById(String name);
}
