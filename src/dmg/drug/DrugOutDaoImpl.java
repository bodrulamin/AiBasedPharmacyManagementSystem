
package dmg.drug;

import dmg.service.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DrugOutDaoImpl implements DrugOutDao {

    public static Object lastMsg = "";

    Connection conn = DBConnector.getConnection();

    @Override
    public void addDrugOut(DrugOut drugOut) {
        try {
            String sql = "insert into drugout(drugid,buyprice,saleprice,quantity,batchno,customerid,companyid,entrydate,expdate,mfgdate) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, drugOut.getDrugid());
            ps.setDouble(2, drugOut.getBuyprice());
            ps.setDouble(3, drugOut.getSaleprice());
            ps.setInt(4, drugOut.getQuantity());
            ps.setInt(5, drugOut.getBatchno());
            ps.setInt(6, drugOut.getCustomerid());
            ps.setInt(6, drugOut.getCompanyid());
            ps.setDate(7, drugOut.getEntrydate());
            ps.setDate(8, drugOut.getExpdate());
            ps.setDate(9, drugOut.getMfgdate());

            ps.execute();

            System.out.println("Added Successfully");
            lastMsg = "Added Successfully";
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            lastMsg = ex.getMessage();
        }
    }

    @Override
    public void deleteDrugOut(int id) {

    }

    @Override
    public void updateDrugOut(DrugOut drug) {

    }

    @Override
    public List<DrugOut> getDrugOutList(String q) {
        String wildcard = "%" + q + "%";
        List<DrugOut> cList = new ArrayList<DrugOut>();
        String sql = "select * from drugout where invoiceid like ? or companyid like ? or drugid like ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, wildcard);
            ps.setString(2, wildcard);
            ps.setString(3, wildcard);
            System.out.println(ps.toString());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DrugOut drugOut = new DrugOut(
                        rs.getInt("invoiceid"),
                        rs.getInt("drugid"),
                        rs.getDouble("buyprice"),
                        rs.getDouble("saleprice"),
                        rs.getInt("quantity"),
                        rs.getInt("batchno"),
                        rs.getInt("customerid"),
                        rs.getInt("companyid"),
                        rs.getDate("entrydate"),
                        rs.getDate("expdate"),
                        rs.getDate("mfgdate")
                );
                cList.add(drugOut);
                System.out.println(drugOut);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            lastMsg = ex.getMessage();
        }
        return cList;

    }

    @Override
    public DrugOut getDrugOut(int id) {

        DrugOut drugOut = null;
        String sql = "select * from drugout where id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            System.out.println(ps.toString());
            ResultSet rs = ps.executeQuery();
            rs.next();
              drugOut = new DrugOut(
                    rs.getInt("invoiceid"),
                    rs.getInt("drugid"),
                    rs.getDouble("buyprice"),
                    rs.getDouble("saleprice"),
                    rs.getInt("quantity"),
                    rs.getInt("batchno"),
                    rs.getInt("customerid"),
                    rs.getInt("companyid"),
                    rs.getDate("entrydate"),
                    rs.getDate("expdate"),
                    rs.getDate("mfgdate")
            );

            System.out.println(drugOut);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            lastMsg = ex.getMessage();
        }
        return drugOut;

    }

}
