package database;

import businessLogic.Partner;
import java.sql.Connection;
import database.ConnectionPostgreSQL;
import javafx.collections.ObservableList;

/**
 *
 * @author maximesoustelle
 */
public abstract class PartnersDAO {
    private Partner[] p;	
    private String name;
    private Connection coSql;
	
    public abstract void addPartnerById(String name, String desc);
    public abstract void deletePartnerById(String name);
    public abstract String getAll();
    public abstract void updatePartnerById(String name, String desc);
    public abstract ObservableList<Partner> getAllPartner();
}
