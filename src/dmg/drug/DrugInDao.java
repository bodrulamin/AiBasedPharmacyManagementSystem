/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmg.drug;
 
  import java.util.List;

 
public interface DrugInDao {   
    DrugIn getDrugIn(int id) ;
    void addDrugIn(DrugIn drug);
    void deleteDrugIn(int id);
    void updateDrugIn(DrugIn drug); 
    public List<DrugIn> getDrugInList(String q);     

    public int getNextBillId();
}
