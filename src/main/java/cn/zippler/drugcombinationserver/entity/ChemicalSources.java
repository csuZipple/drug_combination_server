package cn.zippler.drugcombinationserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`chemical.sources.v5.0`")
public class ChemicalSources {
    @Id
    private long id;
    @Column(name = "chemical")
    private String chemical;
    @Column(name = "alias")
    private String alias;
    @Column(name = "source")
    private String source;
    @Column(name = "code")
    private String code;

    public String getChemical() {
        return chemical;
    }

    public void setChemical(String chemical) {
        this.chemical = chemical;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
