package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.IntegratedDrug;
import cn.zippler.drugcombinationserver.entity.NciDrug;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NciDrugDao extends JpaRepository<NciDrug, Long> {
    List<NciDrug> findByDrug1nameLike(String drug1Name);
}
