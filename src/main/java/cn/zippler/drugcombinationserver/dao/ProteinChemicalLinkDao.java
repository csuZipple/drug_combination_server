package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.DrugDrugLink;
import cn.zippler.drugcombinationserver.entity.ProteinChemicalLink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProteinChemicalLinkDao extends JpaRepository<ProteinChemicalLink,Long> {
    List<ProteinChemicalLink> findByChemical(String chemical);
}
