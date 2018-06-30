package cn.zippler.drugcombinationserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "drug_drug_links")
public class DrugDrugLink {

    @Id
    private long id;
    @Column(name = "chemical1")
    private String chemical1;
    @Column(name = "chemical2")
    private String chemical2;
    @Column(name = "similarity")
    private String similarity;
    @Column(name = "experimental")
    private String experimental;
    @Column(name = "database")
    private String database;
    @Column(name = "textmining")
    private String textmining;
    @Column(name = "combined_score")
    private String combinedScore;

    public String getChemical1() {
        return chemical1;
    }

    public void setChemical1(String chemical1) {
        this.chemical1 = chemical1;
    }

    public String getChemical2() {
        return chemical2;
    }

    public void setChemical2(String chemical2) {
        this.chemical2 = chemical2;
    }

    public String getSimilarity() {
        return similarity;
    }

    public void setSimilarity(String similarity) {
        this.similarity = similarity;
    }

    public String getExperimental() {
        return experimental;
    }

    public void setExperimental(String experimental) {
        this.experimental = experimental;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getTextmining() {
        return textmining;
    }

    public void setTextmining(String textmining) {
        this.textmining = textmining;
    }

    public String getCombinedScore() {
        return combinedScore;
    }

    public void setCombinedScore(String combinedScore) {
        this.combinedScore = combinedScore;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
