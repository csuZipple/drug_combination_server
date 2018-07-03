package cn.zippler.drugcombinationserver.entity;

import javax.persistence.*;

@Entity
@Table(name = "drug")
public class DrugName {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "drugname")
    private String drugName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
}
