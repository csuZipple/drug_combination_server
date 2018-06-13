package cn.zippler.drugcombinationserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`pmc5248573(twodrugs)`")
public class Pmc5Drug {
    @Id
    private long id;
    @Column(name = "source")
    private String source;
    @Column(name = "Cell HMS LINCS ID")
    private String cellHmsLincsId;
    @Column(name = "Cell Name")
    private String cellName;
    @Column(name = "Small-Molecule1-HMS-LINCS-ID")
    private String smallMolecule1HmsLincsId;
    @Column(name = "SM1Name")
    private String sm1Name;
    @Column(name = "Small Molecule 2 HMS LINCS ID")
    private String smallMolecule2HmsLincsId;
    @Column(name = "SM2Name")
    private String sm2Name;
    @Column(name = "Conc1")
    private String conc1;
    @Column(name = "Conc2")
    private String conc2;
    @Column(name = "Small Mol Conc Unit")
    private String smallMolConcUnit;
    @Column(name = "Time Point")
    private String timePoint;
    @Column(name = "Time Point Unit")
    private String timePointUnit;
    @Column(name = "Mean Relative Viability")
    private String meanRelativeViablity;
    @Column(name = "Mean Apoptosis Fraction")
    private String meanApoptosisFraction;
    @Column(name = "Growth")
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

    public String getCellHmsLincsId() {
        return cellHmsLincsId;
    }

    public void setCellHmsLincsId(String cellHmsLincsId) {
        this.cellHmsLincsId = cellHmsLincsId;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public String getSmallMolecule1HmsLincsId() {
        return smallMolecule1HmsLincsId;
    }

    public void setSmallMolecule1HmsLincsId(String smallMolecule1HmsLincsId) {
        this.smallMolecule1HmsLincsId = smallMolecule1HmsLincsId;
    }

    public String getSm1Name() {
        return sm1Name;
    }

    public void setSm1Name(String sm1Name) {
        this.sm1Name = sm1Name;
    }

    public String getSmallMolecule2HmsLincsId() {
        return smallMolecule2HmsLincsId;
    }

    public void setSmallMolecule2HmsLincsId(String smallMolecule2HmsLincsId) {
        this.smallMolecule2HmsLincsId = smallMolecule2HmsLincsId;
    }

    public String getSm2Name() {
        return sm2Name;
    }

    public void setSm2Name(String sm2Name) {
        this.sm2Name = sm2Name;
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

    public String getSmallMolConcUnit() {
        return smallMolConcUnit;
    }

    public void setSmallMolConcUnit(String smallMolConcUnit) {
        this.smallMolConcUnit = smallMolConcUnit;
    }

    public String getTimePoint() {
        return timePoint;
    }

    public void setTimePoint(String timePoint) {
        this.timePoint = timePoint;
    }

    public String getTimePointUnit() {
        return timePointUnit;
    }

    public void setTimePointUnit(String timePointUnit) {
        this.timePointUnit = timePointUnit;
    }

    public String getMeanRelativeViablity() {
        return meanRelativeViablity;
    }

    public void setMeanRelativeViablity(String meanRelativeViablity) {
        this.meanRelativeViablity = meanRelativeViablity;
    }

    public String getMeanApoptosisFraction() {
        return meanApoptosisFraction;
    }

    public void setMeanApoptosisFraction(String meanApoptosisFraction) {
        this.meanApoptosisFraction = meanApoptosisFraction;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }
}
