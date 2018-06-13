package cn.zippler.drugcombinationserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "integrated")
public class IntegratedDrug {
    @Id
    private long id;
    @Column(name = "Fid")
    private long fid;
    private String source;
    @Column(name = "Drug1Name")
    private String drug1Name;
    @Column(name = "Drug2Name")
    private String drug2Name;
    @Column(name = "Conc1")
    private String conc1;
    @Column(name = "Conc2")
    private String conc2;
    @Column(name = "Growth")
    private String growth;
    @Column(name = "cellline")
    private String cellline;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFid() {
        return fid;
    }

    public void setFid(long fid) {
        this.fid = fid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDrug1Name() {
        return drug1Name;
    }

    public void setDrug1Name(String drug1Name) {
        this.drug1Name = drug1Name;
    }

    public String getDrug2Name() {
        return drug2Name;
    }

    public void setDrug2Name(String drug2Name) {
        this.drug2Name = drug2Name;
    }

    public String getConc1() {
        return conc1;
    }

    public void setConc1(String conc1) {
        this.conc1 = conc1;
    }

    public String getConc2() {
        return conc2;
    }

    public void setConc2(String conc2) {
        this.conc2 = conc2;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public String getCellline() {
        return cellline;
    }

    public void setCellline(String cellline) {
        this.cellline = cellline;
    }
}
