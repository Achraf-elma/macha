/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import businessLogic.Category;
import java.sql.Connection;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author h
 */
public abstract class CategoryDAO {
    
     private Category u;
    private String categoryName;
    private String categoryID;
	private String numberOfEvent;
         private ObservableList<Category> CategoryData = FXCollections.observableArrayList();
         
         private Connection coSql;
         
          public abstract String getnbEvent(String categoryID) throws SQLException;
          public abstract ObservableList<Category> getAll();
}
