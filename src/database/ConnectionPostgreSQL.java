package database;
import java.sql.Connection;
import java.sql.*;

public class ConnectionPostgreSQL{

	public ConnectionPostgreSQL() {
		try {
			// Chargement du pilote JDBC
			Class.forName("org.postgresql.Driver");
			// URL de connexion
			String url = "jdbc:postgresql://localhost:5432/macha";
			// Connexion
			Connection con = DriverManager.getConnection(url, "postgres", "cypcyp");
			// Création d'une instruction
			Statement statement = con.createStatement();
			// Exécution d'une requete
			String query = "SELECT * FROM Users";
			ResultSet resultset = statement.executeQuery(query);
			// Traitement des résultats
			while(resultset.next()) {
				System.out.println(resultset.getString(1) + " " + resultset.getString(2));
			}
			// fermeture de la connexion
			con.close();
		} catch( ClassNotFoundException e) { 
			System.err.println("Erreur lors du chargement du pilote : " + e);
		} catch(SQLException sqle) {
			System.err.print("Erreur SQL : " + sqle);
		}
	}


	public static void main(String[] args) {
		ConnectionPostgreSQL test = new ConnectionPostgreSQL();
	}	
}
