package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.NciDrug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NciDrugDao extends JpaRepository<NciDrug, Long> {
}
