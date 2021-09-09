/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmg.drug;
 
  import java.util.List;

 
public interface DrugOutDao {   
    DrugOut getDrugOut(int id) ;
    void addDrugOut(DrugOut drugOut);
    void deleteDrugOut(int id);
    void updateDrugOut(DrugOut drugOut); 
    public List<DrugOut> getDrugOutList(String q);     
}
