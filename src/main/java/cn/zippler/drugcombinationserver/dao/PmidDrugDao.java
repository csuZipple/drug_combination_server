package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.IntegratedDrug;
import cn.zippler.drugcombinationserver.entity.PmidDrug;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PmidDrugDao extends JpaRepository<PmidDrug, Long> {
    List<PmidDrug> findByDrug1nameLike(String drugAName);
    List<PmidDrug> findByDrug2nameLike(String drugBName);
}
