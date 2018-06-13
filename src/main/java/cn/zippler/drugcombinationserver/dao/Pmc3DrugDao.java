package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.Pmc3Drug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pmc3DrugDao extends JpaRepository<Pmc3Drug, Long> {
}
