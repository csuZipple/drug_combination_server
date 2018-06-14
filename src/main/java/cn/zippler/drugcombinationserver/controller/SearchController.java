package cn.zippler.drugcombinationserver.controller;

import cn.zippler.drugcombinationserver.dao.*;
import cn.zippler.drugcombinationserver.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/query")
public class SearchController {
    /*
     * should optimize the method . cost too much time
     * */
    private final IntegratedDrugDao integratedDrugDao;
    private final NciDrugDao nciDrugDao;
    private final Pmc3DrugDao pmc3DrugDao;
    private final Pmc5DrugDao pmc5DrugDao;
    private final PmidDrugDao pmidDrugDao;

    @Autowired
    public SearchController(IntegratedDrugDao integratedDrugDao, NciDrugDao nciDrugDao, Pmc3DrugDao pmc3DrugDao, Pmc5DrugDao pmc5DrugDao, PmidDrugDao pmidDrugDao) {
        this.integratedDrugDao = integratedDrugDao;
        this.nciDrugDao = nciDrugDao;
        this.pmc3DrugDao = pmc3DrugDao;
        this.pmc5DrugDao = pmc5DrugDao;
        this.pmidDrugDao = pmidDrugDao;
    }


    @RequestMapping("/search")
    @ResponseBody
    public Map<String,List> search(@RequestParam("q")String value){
        //each step cost too much time ...
        long current =System.currentTimeMillis();
        long origin = current;
        List<IntegratedDrug> integratedDrug1List = integratedDrugDao.findByDrug1NameLike(value);
        System.out.println("第一部分搜索："+(System.currentTimeMillis()-current));
        current = System.currentTimeMillis();
        List<IntegratedDrug> integratedDrug2List = integratedDrugDao.findByDrug2NameLike(value);
        System.out.println("第二部分搜索："+(System.currentTimeMillis()-current));
        current = System.currentTimeMillis();

        List<NciDrug> nciDrugList = nciDrugDao.findByDrug1nameLike(value);
        System.out.println("第三部分搜索："+(System.currentTimeMillis()-current));

        current = System.currentTimeMillis();

        List<Pmc3Drug> pmc3Drug1List = pmc3DrugDao.findByDrug1NameLike(value);
        System.out.println("第四部分搜索："+(System.currentTimeMillis()-current));

        current = System.currentTimeMillis();

        List<Pmc3Drug> pmc3Drug2List = pmc3DrugDao.findByDrug2NameLike(value);
        System.out.println("第五部分搜索："+(System.currentTimeMillis()-current));

        current = System.currentTimeMillis();

        List<Pmc5Drug> pmc5Drug1sList = pmc5DrugDao.findBySm1NameLike(value);
        System.out.println("第六部分搜索："+(System.currentTimeMillis()-current));

        current = System.currentTimeMillis();

        List<Pmc5Drug> pmc5Drug2sList = pmc5DrugDao.findBySm2NameLike(value);
        System.out.println("第七部分搜索："+(System.currentTimeMillis()-current));

        current = System.currentTimeMillis();

        List<PmidDrug> pmidDrugAList = pmidDrugDao.findByDrugAnameLike(value);
        System.out.println("第八部分搜索："+(System.currentTimeMillis()-current));

        current = System.currentTimeMillis();

        List<PmidDrug> pmidDrugBList = pmidDrugDao.findByDrugBnameLike(value);
        System.out.println("第九部分搜索："+(System.currentTimeMillis()-current));

        System.out.println("总耗时："+(System.currentTimeMillis()-origin)+" ms");

        Map<String,List> result = new HashMap<>();
        result.put("integrateDrug1List",integratedDrug1List);
        result.put("integratedDrug2List",integratedDrug2List);
        result.put("nciDrugList",nciDrugList);
        result.put("pmc3Drug1List",pmc3Drug1List);
        result.put("pmc3Drug2List",pmc3Drug2List);
        result.put("pmc5Drug1sList",pmc5Drug1sList);
        result.put("pmc5Drug2sList",pmc5Drug2sList);
        result.put("pmidDrugAList",pmidDrugAList);
        result.put("pmidDrugBList",pmidDrugBList);

        return result;// TO achieve this function.
    }
}
