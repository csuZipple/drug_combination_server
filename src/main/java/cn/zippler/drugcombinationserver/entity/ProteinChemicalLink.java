package cn.zippler.drugcombinationserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "protein_chemical_link")
public class ProteinChemicalLink {
    @Id
    private long id;
    @Column(name = "chemical")
    private String chemical;
    @Column(name = "protein")
    private String protein;
    @Column(name = "experimental")
    private String experimental;
    @Column(name = "prediction")
    private String prediction;
    @Column(name = "database")
    private String database;
    @Column(name = "textmining")
    private String textmining;
    @Column(name = "combined_score")
    private String combinedScore;

    public String getChemical() {
        return chemical;
    }

    public void setChemical(String chemical) {
        this.chemical = chemical;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getExperimental() {
        return experimental;
    }

    public void setExperimental(String experimental) {
        this.experimental = experimental;
    }

    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
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
