package cn.zippler.drugcombinationserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`chemicals.v5.0`")
public class Chemicals {
    @Id
    private long id;
    @Column(name = "chemical")
    private String chemical;
    @Column(name = "name")
    private String name;
    @Column(name = "molecular_weight")
    private String molecularWeight;
    @Column(name = "SMILES_string")
    private String smileString;

    public String getChemical() {
        return chemical;
    }

    public void setChemical(String chemical) {
        this.chemical = chemical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(String molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public String getSmileString() {
        return smileString;
    }

    public void setSmileString(String smileString) {
        this.smileString = smileString;
    }
}
