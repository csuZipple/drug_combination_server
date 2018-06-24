package cn.zippler.drugcombinationserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`PMC3926026(459agents)`")
public class Pmc3Drug {
    @Id
    private long id;

    @Column(name = "source")
    private String source;

    @Column(name = "`Drug1 id`")
    private String drug1Id;

    @Column(name = "Drug1Name")
    private String drug1Name;

    @Column(name = "`DRUG1 Target`")
    private String drug1Target;

    @Column(name = "`Drug2 id`")
    private String drug2Id;

    @Column(name = "Drug2Name")
    private String drug2Name;

    @Column(name = "Conc1")
    private String conc1;

    @Column(name = "Conc2")
    private String conc2;

    @Column(name = "mqcClass")
    private String mqcClass;//?

    @Column(name = "mqcConfidence")
    private String mqcConfidence;//?

    @Column(name = "MedianExcess")
    private String medianExcess;//?

    @Column(name = "NumExcess")
    private String numExcess;//?

    @Column(name = "ExcessHSA")
    private String excessHSA;

    @Column(name = "ExcessCRX")
    private String excessCRX;
    @Column(name = "LS3x3")
    private String ls3x3;

    @Column(name = "Beta")
    private String beta;

    @Column(name = "Gamma")
    private String gamma;

    @Column(name = "Growth")
    private String growth;

    @Column(name = "DBSumPos")
    private String dbSumPos;//?

    @Column(name = "DBSumNeg")
    private String dbSumNeg;//?

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

    public String getDrug1Id() {
        return drug1Id;
    }

    public void setDrug1Id(String drug1Id) {
        this.drug1Id = drug1Id;
    }

    public String getDrug1Name() {
        return drug1Name;
    }

    public void setDrug1Name(String drug1Name) {
        this.drug1Name = drug1Name;
    }

    public String getDrug1Target() {
        return drug1Target;
    }

    public void setDrug1Target(String drug1Target) {
        this.drug1Target = drug1Target;
    }

    public String getDrug2Id() {
        return drug2Id;
    }

    public void setDrug2Id(String drug2Id) {
        this.drug2Id = drug2Id;
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

    public String getMqcClass() {
        return mqcClass;
    }

    public void setMqcClass(String mqcClass) {
        this.mqcClass = mqcClass;
    }

    public String getMqcConfidence() {
        return mqcConfidence;
    }

    public void setMqcConfidence(String mqcConfidence) {
        this.mqcConfidence = mqcConfidence;
    }

    public String getMedianExcess() {
        return medianExcess;
    }

    public void setMedianExcess(String medianExcess) {
        this.medianExcess = medianExcess;
    }

    public String getNumExcess() {
        return numExcess;
    }

    public void setNumExcess(String numExcess) {
        this.numExcess = numExcess;
    }

    public String getExcessHSA() {
        return excessHSA;
    }

    public void setExcessHSA(String excessHSA) {
        this.excessHSA = excessHSA;
    }

    public String getExcessCRX() {
        return excessCRX;
    }

    public void setExcessCRX(String excessCRX) {
        this.excessCRX = excessCRX;
    }

    public String getLs3x3() {
        return ls3x3;
    }

    public void setLs3x3(String ls3x3) {
        this.ls3x3 = ls3x3;
    }

    public String getBeta() {
        return beta;
    }

    public void setBeta(String beta) {
        this.beta = beta;
    }

    public String getGamma() {
        return gamma;
    }

    public void setGamma(String gamma) {
        this.gamma = gamma;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public String getDbSumPos() {
        return dbSumPos;
    }

    public void setDbSumPos(String dbSumPos) {
        this.dbSumPos = dbSumPos;
    }

    public String getDbSumNeg() {
        return dbSumNeg;
    }

    public void setDbSumNeg(String dbSumNeg) {
        this.dbSumNeg = dbSumNeg;
    }
}
