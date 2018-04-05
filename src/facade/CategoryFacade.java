/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import businessLogic.Category;
import businessLogic.User;
import database.AbstractDAOFactory;
import database.CategoryDAO;
import database.PostgresFactory;
import database.UserDAO;
import javafx.collections.ObservableList;

/**
 *
 * @author h
 */
public class CategoryFacade {
    private AbstractDAOFactory af = new PostgresFactory();
	private CategoryDAO ud = af.createCategoryDAO();
        
        public ObservableList<Category> getAll(){
            return ud.getAll();
        }
}
