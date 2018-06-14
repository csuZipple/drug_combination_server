package cn.zippler.drugcombinationserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pmid26983881")
public class PmidDrug {
    @Id
    private long id;
    @Column(name = "source")
    private String source;
    @Column(name = "BatchID")
    private String batchId;
    @Column(name = "cell_line")
    private String cellline;
    @Column(name = "drugAname")
    private String drugAname;
    @Column(name = "Conc1")
    private String conc1;
    @Column(name = "drugBname")
    private String drugBname;
    @Column(name = "Conc2")
    private String conc2;
    @Column(name = "combination_name")
    private String combinationName;
    @Column(name = "viability1")
    private String viability1;
    @Column(name = "viability2")
    private String viability2;
    @Column(name = "viability3")
    private String viability3;
    @Column(name = "viability4")
    private String viability4;
    @Column(name = "`mean viability`")
    private String meanViability;
    @Column(name = "`mu/muMax`")
    private String muMax;
    @Column(name = "`X/X0`")
    private String x0;
    @Column(name = "median")
    private String median;
    @Column(name = "growth")
    private String growth;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getDrugAname() {
        return drugAname;
    }

    public void setDrugAname(String drugAname) {
        this.drugAname = drugAname;
    }

    public String getConc1() {
        return conc1;
    }

    public void setConc1(String conc1) {
        this.conc1 = conc1;
    }

    public String getDrugBname() {
        return drugBname;
    }

    public void setDrugBname(String drugBname) {
        this.drugBname = drugBname;
    }

    public String getConc2() {
        return conc2;
    }

    public void setConc2(String conc2) {
        this.conc2 = conc2;
    }

    public String getCombinationName() {
        return combinationName;
    }

    public void setCombinationName(String combinationName) {
        this.combinationName = combinationName;
    }

    public String getViability1() {
        return viability1;
    }

    public void setViability1(String viability1) {
        this.viability1 = viability1;
    }

    public String getViability2() {
        return viability2;
    }

    public void setViability2(String viability2) {
        this.viability2 = viability2;
    }

    public String getViability3() {
        return viability3;
    }

    public void setViability3(String viability3) {
        this.viability3 = viability3;
    }

    public String getViability4() {
        return viability4;
    }

    public void setViability4(String viability4) {
        this.viability4 = viability4;
    }

    public String getMuMax() {
        return muMax;
    }

    public void setMuMax(String muMax) {
        this.muMax = muMax;
    }

    public String getX0() {
        return x0;
    }

    public void setX0(String x0) {
        this.x0 = x0;
    }

    public String getMedian() {
        return median;
    }

    public void setMedian(String median) {
        this.median = median;
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

    public String getMeanViability() {
        return meanViability;
    }

    public void setMeanViability(String meanViability) {
        this.meanViability = meanViability;
    }
}
