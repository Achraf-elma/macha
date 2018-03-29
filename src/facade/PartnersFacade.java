package facade;
import database.*;
import businessLogic.*;

/**
 *
 * @author maximesoustelle
 */
public class PartnersFacade {
    private AbstractDAOFactory af = new PostgresFactory();
    private PartnersDAO partnerDAO = af.createPartnerDAO();
    private Boolean connected=false; 
    private String prt;
    
    public void add(String name) {
	partnerDAO.addPartnerById(name);
    }
    
    public void delete(String name) {
	partnerDAO.deletePartnerById(name);
    }
    
    public String getAll() {
	this.prt = partnerDAO.getAll();
        return this.prt;
    }
    
    public void update(String name, String desc) {
	partnerDAO.updatePartnerById(name,desc);
    }
}
