 
package userinterface.userView;
 
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
 
public class Person {
 
    public StringProperty nomp;
    public StringProperty prenomp;
 
    public Person() {
        this.nomp = null;
        this.prenomp = null;
    }
 
    public Person(String pnom, String pprenom) {
        this.nomp = new SimpleStringProperty(pnom);
        this.prenomp = new SimpleStringProperty(pprenom);
    }
 
    /**
     * @return the nom
     */
    public String getnNom() {
        return this.nomp.get();
    }
 
    /**
     * @param nom the nom to set
     */
    public void setNNom(String nom) {
        this.nomp.set(nom);
    }
 
    /**
     * @return the prenom
     */
    public String getPPrenom() {
        return this.prenomp.get();
    }
 
    /**
     * @param pprenom the prenom to set
     */
    public void setPrenom(String pprenom) {
        this.prenomp.set(pprenom);
    }
 
}