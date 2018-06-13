package cn.zippler.drugcombinationserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * the ncidatabase table;
 */
@Entity
@Table(name = "ncidatabase")
public class NciDrug {
    @Id
    private long id;
    @Column(name = "COMBODRUGSEQ")
    private long comboDrugSeq;
    @Column(name = "source")
    private String source;
    @Column(name = "SCREENER")
    private String screener;
    @Column(name = "STUDY")
    private String study;
    @Column(name = "TESTDATE")
    private String testDate;
    @Column(name = "PLATE")
    private String plate;
    @Column(name = "PANELNBR")
    private String panelNbr;
    @Column(name = "CELLNBR")
    private String cellNbr;

    @Column(name = "PREFIX1")
    private String prefix1;
    @Column(name = "NSC1")
    private String nsc1;
    @Column(name = "Drug1name")
    private String drug1name;
    @Column(name = "SAMPLE1")
    private String sample1;
    @Column(name = "CONCINDEX1")
    private String concIndex1;
    @Column(name = "CONC1")
    private String conc1;
    @Column(name = "CONCUNIT1")
    private String concUnit1;

    @Column(name = "PREFIX2")
    private String prefix2;
    @Column(name = "NSC2")
    private String nsc2;
    @Column(name = "Drug2name")
    private String drug2name;
    @Column(name = "SAMPLE2")
    private String sample2;
    @Column(name = "CONCINDEX2")
    private String concIndex2;
    @Column(name = "CONC2")
    private String conc2;
    @Column(name = "CONCUNIT2")
    private String concUnit2;

    @Column(name = "PERCENTGROWTH")
    private String percentGrownth;
    @Column(name = "PERCENTGROWTHNOTZ")
    private String percentGrowthNotz;
    @Column(name = "TESTVALUE")
    private String testValue;
    @Column(name = "CONTROLVALUE")
    private String controlValue;
    @Column(name = "TZVALUE")
    private String tzValue;
    @Column(name = "EXPECTEDGROWTH")
    private String expectedGrowth;
    @Column(name = "SCORE")
    private String score;
    @Column(name = "VALID")
    private String valid;
    @Column(name = "PANEL")
    private String panel;
    @Column(name = "CELLNAME")
    private String cellName;
    @Column(name = "growth")
    private String growth;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getComboDrugSeq() {
        return comboDrugSeq;
    }

    public void setComboDrugSeq(long comboDrugSeq) {
        this.comboDrugSeq = comboDrugSeq;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getScreener() {
        return screener;
    }

    public void setScreener(String screener) {
        this.screener = screener;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getPanelNbr() {
        return panelNbr;
    }

    public void setPanelNbr(String panelNbr) {
        this.panelNbr = panelNbr;
    }

    public String getCellNbr() {
        return cellNbr;
    }

    public void setCellNbr(String cellNbr) {
        this.cellNbr = cellNbr;
    }

    public String getPrefix1() {
        return prefix1;
    }

    public void setPrefix1(String prefix1) {
        this.prefix1 = prefix1;
    }

    public String getNsc1() {
        return nsc1;
    }

    public void setNsc1(String nsc1) {
        this.nsc1 = nsc1;
    }

    public String getDrug1name() {
        return drug1name;
    }

    public void setDrug1name(String drug1name) {
        this.drug1name = drug1name;
    }

    public String getSample1() {
        return sample1;
    }

    public void setSample1(String sample1) {
        this.sample1 = sample1;
    }

    public String getConcIndex1() {
        return concIndex1;
    }

    public void setConcIndex1(String concIndex1) {
        this.concIndex1 = concIndex1;
    }

    public String getConc1() {
        return conc1;
    }

    public void setConc1(String conc1) {
        this.conc1 = conc1;
    }

    public String getConcUnit1() {
        return concUnit1;
    }

    public void setConcUnit1(String concUnit1) {
        this.concUnit1 = concUnit1;
    }

    public String getPrefix2() {
        return prefix2;
    }

    public void setPrefix2(String prefix2) {
        this.prefix2 = prefix2;
    }

    public String getNsc2() {
        return nsc2;
    }

    public void setNsc2(String nsc2) {
        this.nsc2 = nsc2;
    }

    public String getDrug2name() {
        return drug2name;
    }

    public void setDrug2name(String drug2name) {
        this.drug2name = drug2name;
    }

    public String getSample2() {
        return sample2;
    }

    public void setSample2(String sample2) {
        this.sample2 = sample2;
    }

    public String getConcIndex2() {
        return concIndex2;
    }

    public void setConcIndex2(String concIndex2) {
        this.concIndex2 = concIndex2;
    }

    public String getConc2() {
        return conc2;
    }

    public void setConc2(String conc2) {
        this.conc2 = conc2;
    }

    public String getConcUnit2() {
        return concUnit2;
    }

    public void setConcUnit2(String concUnit2) {
        this.concUnit2 = concUnit2;
    }

    public String getPercentGrownth() {
        return percentGrownth;
    }

    public void setPercentGrownth(String percentGrownth) {
        this.percentGrownth = percentGrownth;
    }

    public String getPercentGrowthNotz() {
        return percentGrowthNotz;
    }

    public void setPercentGrowthNotz(String percentGrowthNotz) {
        this.percentGrowthNotz = percentGrowthNotz;
    }

    public String getTestValue() {
        return testValue;
    }

    public void setTestValue(String testValue) {
        this.testValue = testValue;
    }

    public String getControlValue() {
        return controlValue;
    }

    public void setControlValue(String controlValue) {
        this.controlValue = controlValue;
    }

    public String getTzValue() {
        return tzValue;
    }

    public void setTzValue(String tzValue) {
        this.tzValue = tzValue;
    }

    public String getExpectedGrowth() {
        return expectedGrowth;
    }

    public void setExpectedGrowth(String expectedGrowth) {
        this.expectedGrowth = expectedGrowth;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getPanel() {
        return panel;
    }

    public void setPanel(String panel) {
        this.panel = panel;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }
}
