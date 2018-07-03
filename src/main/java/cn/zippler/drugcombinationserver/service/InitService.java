package cn.zippler.drugcombinationserver.service;

import cn.zippler.drugcombinationserver.dao.DrugNameDao;
import cn.zippler.drugcombinationserver.dao.IntegratedDrugDao;
import cn.zippler.drugcombinationserver.entity.DrugName;
import cn.zippler.drugcombinationserver.entity.IntegratedDrug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InitService {
    private  IntegratedDrugDao integratedDrugDao;

    private  DrugNameDao drugNameDao;

    @Autowired
    public InitService(IntegratedDrugDao integratedDrugDao, DrugNameDao drugNameDao) {
        this.integratedDrugDao = integratedDrugDao;
        this.drugNameDao = drugNameDao;
    }

    public void getAllDrugName(){
        long current = System.currentTimeMillis();
        List<IntegratedDrug> drugs = integratedDrugDao.findAll();
        List<String> result = new ArrayList<>();
        for (IntegratedDrug drug : drugs) {
            String drug1name = drug.getDrug1Name();
            String drug2name = drug.getDrug2Name();
            if (!result.contains(drug1name)) {
                result.add(drug1name);
            }

            if (!result.contains(drug2name)) {
                result.add(drug2name);
            }
        }
        System.out.println("find all successfully.then store the data.");
        for (String drugname:result) {
            DrugName drug = new DrugName();
            drug.setDrugName(drugname);
            drugNameDao.saveAndFlush(drug);
        }

        System.out.println("the request /getAllDrugName/ total cost:"+(System.currentTimeMillis()-current)+" ms");
    }
}
