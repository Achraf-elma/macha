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
    
    public void add(String name) {
	partnerDAO.addPartnerById(name);
    }
    
    public void delete(String name) {
	partnerDAO.deletePartnerById(name);
    }
}
