package facade;
import database.*;
import businessLogic.*;
import javafx.collections.ObservableList;

/**
 *
 * @author maximesoustelle
 */
public class PartnersFacade {
    private AbstractDAOFactory af = new PostgresFactory();
    private PartnersDAO partnerDAO = af.createPartnerDAO();
    private Boolean connected=false; 
    private String prt;
    
    public void add(String name, String desc) {
	partnerDAO.addPartnerById(name, desc);
    }
    
    public void delete(String name) {
	partnerDAO.deletePartnerById(name);
    }
    
    public String getAll() {
	this.prt = partnerDAO.getAll();
        return this.prt;
    }
    public ObservableList<Partner> getAllPartner(){
        return partnerDAO.getAllPartner();
    }
    public void update(String name, String desc) {
	partnerDAO.updatePartnerById(name,desc);
    }

    
}
