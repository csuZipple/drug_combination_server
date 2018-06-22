package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.IntegratedDrug;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IntegratedDrugDao extends JpaRepository<IntegratedDrug, Long> {
    List<IntegratedDrug> findByDrug1NameContaining(String drug1Name);//Containing
    List<IntegratedDrug> findByDrug2NameContaining(String drug2Name);
    List<IntegratedDrug> findByDrug1Name(String drug1Name);
    List<IntegratedDrug> findByDrug2Name(String drug2Name);
}
