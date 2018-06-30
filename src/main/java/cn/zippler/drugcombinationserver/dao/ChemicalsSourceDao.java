package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.ChemicalSources;
import cn.zippler.drugcombinationserver.entity.Chemicals;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChemicalsSourceDao extends JpaRepository<ChemicalSources,Long> {

}
