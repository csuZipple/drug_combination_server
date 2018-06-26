package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.IntegratedDrug;
import cn.zippler.drugcombinationserver.entity.Pmc5Drug;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pmc5DrugDao extends JpaRepository<Pmc5Drug, Long> {
    List<Pmc5Drug> findByDrug1NameLike(String sm1name);
    List<Pmc5Drug> findByDrug2NameLike(String sm2name);

}
