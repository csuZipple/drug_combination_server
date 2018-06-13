package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.IntegratedDrug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntegratedDrugDao extends JpaRepository<IntegratedDrug, Long> {
}
