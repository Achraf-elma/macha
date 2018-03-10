package database;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.sql.*;

public class ConnectionPostgreSQL{
	private String nom;
	private String mdp;
	private String dateOfBirth;
	private String firstname;
	private String lastname;
	private String address;
	
	public ConnectionPostgreSQL(String userid, String pwd) {
		try {
			// Chargement du pilote JDBC
			Class.forName("org.postgresql.Driver");
			// URL de connexion
			String url = "jdbc:postgresql://localhost:5432/macha";
			// Connexion
			Connection con = DriverManager.getConnection(url, "postgres", "cypcyp");
			// Cr�ation d'une instruction
			Statement statement = con.createStatement();
			// Ex�cution d'une requete
			String query = "SELECT * FROM Users WHERE nickname = '" + userid + "'";
			ResultSet resultset = statement.executeQuery(query);
			// Traitement des r�sultats
			while(resultset.next()) {
				//System.out.println(resultset.getString(1) + " " + resultset.getString(2));
				this.nom = resultset.getString(1);
				this.mdp = resultset.getString(2);
				this.dateOfBirth = resultset.getString(3);
				this.firstname = resultset.getString(4);
				this.lastname = resultset.getString(5);
				this.address = resultset.getString(6);
			}
			
			// fermeture de la connexion
			con.close();
		} catch( ClassNotFoundException e) { 
			System.err.println("Erreur lors du chargement du pilote : " + e);
		} catch(SQLException sqle) {
			System.err.print("Erreur SQL : " + sqle);
		}
	}
	
	//GETTERS & SETTERS

	public String getUserName() {
		return this.nom;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPwd() {
		return this.mdp;
	}
	
	public static void main(String[] args) {
		//ConnectionPostgreSQL test = new ConnectionPostgreSQL();
	}	
}
