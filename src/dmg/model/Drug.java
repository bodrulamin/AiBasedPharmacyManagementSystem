package dmg.model;

import java.io.Serializable;
import java.sql.Date;

public class Drug implements Serializable {

    private int id;
    private String name;
    private double buyprice;
    private double sellprice;
    private int quantity;
    private int batchno;
    private Date expdate;
    private Date mfgdate;
    private String companyid;
    private Date entrydate;

    public Drug(int id, String name, double buyprice, double sellprice, int quantity, int batchno, Date expdate, Date mfgdate, String companyid, Date entrydate) {
        this.id = id;
        this.name = name;
        this.buyprice = buyprice;
        this.sellprice = sellprice;
        this.quantity = quantity;
        this.batchno = batchno;
        this.expdate = expdate;
        this.mfgdate = mfgdate;
        this.companyid = companyid;
        this.entrydate = entrydate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(double buyprice) {
        this.buyprice = buyprice;
    }

    public double getSellprice() {
        return sellprice;
    }

    public void setSellprice(double sellprice) {
        this.sellprice = sellprice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBatchno() {
        return batchno;
    }

    public void setBatchno(int batchno) {
        this.batchno = batchno;
    }

    public Date getExpdate() {
        return expdate;
    }

    public void setExpdate(Date expdate) {
        this.expdate = expdate;
    }

    public Date getMfgdate() {
        return mfgdate;
    }

    public void setMfgdate(Date mfgdate) {
        this.mfgdate = mfgdate;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    @Override
    public String toString() {
        return "Drug{" + "id=" + id + ", name=" + name + ", buyprice=" + buyprice + ", sellprice=" + sellprice + ", quantity=" + quantity + ", batchno=" + batchno + ", expdate=" + expdate + ", mfgdate=" + mfgdate + ", companyid=" + companyid + ", entrydate=" + entrydate + '}';
    }

}
