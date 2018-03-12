
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionPostgreSQL{

	/**
	 * URL de connection
	 */
	private static String url = "jdbc:postgresql://ec2-79-125-12-27.eu-west-1.compute.amazonaws.com/de1d4s2ta7acdb?sslmode=require";
	/**
	 * Nom du user
	 */
	private static String user = "kycwwiftikpegb";
	/**
	 * Mot de passe du user
	 */
	private static String passwd = "9fa070253aec8d296f0db3310e47ff66904a73e047e214d11675b50a7cb6dd01";
	/**
	 * Objet Connection
	 */
	private static Connection connect;
	
	/**
	 * Méthode qui va nous retourner notre instance
	 * et la créer si elle n'existe pas...
	 * @return
	 */
	public static Connection getInstance(){
		if(connect == null){
			try {
				Properties props = new Properties();
				props.setProperty("ssl","true");
				connect = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return connect;	
	}	
}
