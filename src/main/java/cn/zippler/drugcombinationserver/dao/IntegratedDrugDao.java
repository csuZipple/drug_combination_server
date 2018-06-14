package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.IntegratedDrug;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IntegratedDrugDao extends JpaRepository<IntegratedDrug, Long> {
    List<IntegratedDrug> findByDrug1NameLike(String drug1Name);
    List<IntegratedDrug> findByDrug2NameLike(String drug2Name);
}
