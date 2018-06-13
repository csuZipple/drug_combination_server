package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.PmidDrug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PmidDrugDao extends JpaRepository<PmidDrug, Long> {
}
