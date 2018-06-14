package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.IntegratedDrug;
import cn.zippler.drugcombinationserver.entity.Pmc3Drug;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pmc3DrugDao extends JpaRepository<Pmc3Drug, Long> {
    List<Pmc3Drug> findByDrug1NameLike(String drug1Name);
    List<Pmc3Drug> findByDrug2NameLike(String drug2Name);
}
