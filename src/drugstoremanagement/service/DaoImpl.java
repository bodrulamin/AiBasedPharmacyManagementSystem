/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drugstoremanagement.service;

import drugstoremanagement.model.Drug;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author b
 */
public class DaoImpl implements DaoInterface {

    Connection conn = DBConnector.getConnection();

    @Override
    public void add(Drug drug) {
        try {
            String sql = "insert into drugs values (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, drug.getId());
            ps.setString(2, drug.getName());
            ps.setDouble(3, drug.getPrice());
            ps.setInt(4, drug.getQuantity());
            ps.setString(5, drug.getCompany());
            ps.execute();
            System.out.println("Added Successfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        try {
            String sql = "delete from drugs where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            System.out.println("deleted succesfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void update(Drug drug) {
        delete(drug.getId());
        add(drug);
    }

    @Override
    public List<Drug> getDrugList() {
        List<Drug> dList = new ArrayList<Drug>();
        String sql = "select * from drugs";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Drug drug = new Drug(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getString(5));
                dList.add(drug);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dList;
    }

    @Override
    public void sale(Drug drug) {
        delete(drug.getId());
        add(drug);
    }

}
