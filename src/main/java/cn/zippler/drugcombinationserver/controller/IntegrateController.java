package cn.zippler.drugcombinationserver.controller;

import cn.zippler.drugcombinationserver.dao.IntegratedDrugDao;
import cn.zippler.drugcombinationserver.entity.IntegratedDrug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/integrate")
public class IntegrateController {
    private IntegratedDrugDao integratedDrugDao;

    @Autowired
    public IntegrateController(IntegratedDrugDao integratedDrugDao) {
        this.integratedDrugDao = integratedDrugDao;
    }

    @RequestMapping("/list")
    public List<IntegratedDrug> findAll(){
        return integratedDrugDao.findAll();
    }

    @RequestMapping("/list/{id}")
    public Optional<IntegratedDrug> findOne(@PathVariable("id") long id){
        return integratedDrugDao.findById(id);
    }
    @RequestMapping("/page")
    public Page<IntegratedDrug> getPage(@RequestParam(value = "page", defaultValue = "0") Integer page, @RequestParam(value = "size", defaultValue = "10") Integer size){
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        Pageable pageable = new PageRequest(page, size, sort);
        return integratedDrugDao.findAll(pageable);
    }

    @RequestMapping("/search")
    @ResponseBody
    public List<IntegratedDrug> search(@RequestParam("q")String value){
        long current =System.currentTimeMillis();
        List<IntegratedDrug> integratedDrug1List = integratedDrugDao.findByDrug1NameContaining(value);
        System.out.println("搜索第一部分耗时："+(System.currentTimeMillis()- current)+" ms");
        if (integratedDrug1List.size()!=0){
            return integratedDrug1List;
        }
        List<IntegratedDrug> integratedDrug2List = integratedDrugDao.findByDrug2NameContaining(value);
        System.out.println("搜索总耗时："+(System.currentTimeMillis()- current)+" ms");
        integratedDrug1List.addAll(integratedDrug2List);
        return integratedDrug1List;// TO achieve this function.
    }

    @RequestMapping("/drug1Name/{name}")
    public List<String> findAllDrug1Name(@PathVariable("name") String name) {
        List<IntegratedDrug> integratedDrugList = integratedDrugDao.findByDrug1Name(name);
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (IntegratedDrug temp : integratedDrugList) {
            if (map.get(temp.getDrug2Name()) == null) {
                map.put(temp.getDrug2Name(), 1);
                result.add(temp.getDrug2Name());
            }
        }
        return result;
    }
}
