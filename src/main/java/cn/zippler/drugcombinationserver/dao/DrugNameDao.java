package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.DrugName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugNameDao extends JpaRepository<DrugName,Long> {
}
