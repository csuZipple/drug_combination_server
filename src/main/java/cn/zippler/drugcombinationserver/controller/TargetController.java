package cn.zippler.drugcombinationserver.controller;

import cn.zippler.drugcombinationserver.dao.ChemicalsDao;
import cn.zippler.drugcombinationserver.dao.ChemicalsSourceDao;
import cn.zippler.drugcombinationserver.dao.DrugDrugLinkDao;
import cn.zippler.drugcombinationserver.dao.ProteinChemicalLinkDao;
import cn.zippler.drugcombinationserver.entity.Chemicals;
import cn.zippler.drugcombinationserver.entity.IntegratedDrug;
import cn.zippler.drugcombinationserver.entity.ProteinChemicalLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/target")
public class TargetController {
    private final ChemicalsDao chemicalsDao;
    private final ChemicalsSourceDao chemicalsSourceDao;
    private final DrugDrugLinkDao drugDrugLinkDao;
    private final ProteinChemicalLinkDao proteinChemicalLinkDao;

    @Autowired
    public TargetController(ChemicalsDao chemicalsDao, ChemicalsSourceDao chemicalsSourceDao, DrugDrugLinkDao drugDrugLinkDao, ProteinChemicalLinkDao proteinChemicalLinkDao) {
        this.chemicalsDao = chemicalsDao;
        this.chemicalsSourceDao = chemicalsSourceDao;
        this.drugDrugLinkDao = drugDrugLinkDao;
        this.proteinChemicalLinkDao = proteinChemicalLinkDao;
    }
    @RequestMapping("/list}")
    public List<Chemicals> list(){
        return chemicalsDao.findAll();
    }

    @RequestMapping("/page")
    public Page<Chemicals> getPage(@RequestParam(value = "page", defaultValue = "0") Integer page, @RequestParam(value = "size", defaultValue = "10") Integer size){
        Sort sort = new Sort(Sort.Direction.ASC,"id");
        System.out.println("received the request of paging..current page is:"+page+" and size is"+size);
        Pageable pageable = new PageRequest(page, size, sort);
        return chemicalsDao.findAll(pageable);
    }

    @RequestMapping("/drug/{drugName}")
    @ResponseBody
    public Map<String, Object> target(@PathVariable("drugName") String drugName){
        List<Chemicals> chemicalsList = chemicalsDao.findByName(drugName);
        List<ProteinChemicalLink> proteinChemicalLinkList = null;
        Map<String,Object> result = new HashMap<>();
        if (chemicalsList.size()==0){
            System.out.println("no data found");
        }else{
            for (Chemicals chemicals:chemicalsList) {//2
                String chemicalsId = chemicals.getChemical();
                result.put("drug",drugName);
                if (chemicalsId.contains("m")){
                    proteinChemicalLinkList = proteinChemicalLinkDao.findByChemical(chemicalsId);
                    result.put("data",proteinChemicalLinkList);
                }
            }
        }

        return result;
    }
}
