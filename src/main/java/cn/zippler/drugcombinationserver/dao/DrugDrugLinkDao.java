package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.ChemicalSources;
import cn.zippler.drugcombinationserver.entity.DrugDrugLink;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DrugDrugLinkDao extends JpaRepository<DrugDrugLink,Long> {

}
