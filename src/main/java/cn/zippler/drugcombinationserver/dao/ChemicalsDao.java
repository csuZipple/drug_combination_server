package cn.zippler.drugcombinationserver.dao;

import cn.zippler.drugcombinationserver.entity.Chemicals;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ChemicalsDao extends JpaRepository<Chemicals,Long> {
    List<Chemicals> findByName(String name);
}
