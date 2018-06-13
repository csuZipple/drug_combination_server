package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.Pmc5Drug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pmc5DrugDao extends JpaRepository<Pmc5Drug, Long> {
}
