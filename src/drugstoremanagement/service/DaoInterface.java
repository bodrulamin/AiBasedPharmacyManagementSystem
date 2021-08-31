/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drugstoremanagement.service;

import drugstoremanagement.model.Drug;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author b
 */
public interface DaoInterface {
    void add(Drug drug);
    void delete(int id);
    void update(Drug drug);
    void sale(Drug drug);
   List<Drug> getDrugList();
    
}
