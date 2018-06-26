package cn.zippler.drugcombinationserver.controller;

import cn.zippler.drugcombinationserver.dao.IntegratedDrugDao;
import cn.zippler.drugcombinationserver.entity.IntegratedDrug;
import org.springframework.beans.factory.annotation.Autowired;
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
        Sort sort = new Sort(Sort.Direction.ASC,"id");
        System.out.println("received the request of paging..current page is:"+page+" and size is"+size);
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
    public Map<String, Object> findCombinationDrug(@PathVariable("name") String name){
        long current = System.currentTimeMillis();
        Map<String, Object> resultMap = new HashMap<>();
        List<IntegratedDrug> integratedDrugList = integratedDrugDao.findByDrug1Name(name);
        Map<String, Object> map = new HashMap<>();
        Map<String, ArrayList<Object>> drug2Map = new HashMap<String, ArrayList<Object>>();
        List<String> cellline = new ArrayList<>();
        List<String> drug2NameList = new ArrayList<>();

        System.out.println("the former size:"+integratedDrugList.size());
        if (integratedDrugList.size()==0){
            integratedDrugList = integratedDrugDao.findByDrug2Name(name);

            for (int i = 0; i < integratedDrugList.size(); i++) {
                IntegratedDrug temp = integratedDrugList.get(i);
                if (map.get(temp.getCellline()) == null) {
                    map.put(temp.getCellline(),temp);
                    cellline.add(temp.getCellline());
                }

                if (temp.getDrug1Name()!=null&&!temp.getDrug1Name().equals("null")) {
                    if (drug2Map.get(temp.getDrug1Name()) == null) {
                        drug2Map.put(temp.getDrug1Name(), new ArrayList<>());
                        drug2NameList.add(temp.getDrug1Name());
                    } else {
                        ArrayList<Object> tempList = drug2Map.get(temp.getDrug1Name());
                        tempList.add(temp);
                        drug2Map.put(temp.getDrug1Name(), tempList);
                    }
                }
            }
        }else{
            for (int i = 0; i < integratedDrugList.size(); i++) {
                IntegratedDrug temp = integratedDrugList.get(i);
                if (map.get(temp.getCellline()) == null) {
                    map.put(temp.getCellline(),temp);
                    cellline.add(temp.getCellline());
                }

                if (temp.getDrug2Name()!=null&&!temp.getDrug2Name().equals("null")) {
                    if (drug2Map.get(temp.getDrug2Name()) == null) {
                        drug2Map.put(temp.getDrug2Name(), new ArrayList<>());
                        drug2NameList.add(temp.getDrug2Name());
                    } else {
                        ArrayList<Object> tempList = drug2Map.get(temp.getDrug2Name());
                        tempList.add(temp);
                        drug2Map.put(temp.getDrug2Name(), tempList);
                    }
                }
            }
        }


        System.out.println("after distinct:"+integratedDrugList.size());

        resultMap.put("cellline",cellline);
        resultMap.put("drugList",integratedDrugList);
        resultMap.put("drug2Map",drug2Map);
        resultMap.put("drug2NameList",drug2NameList);
        System.out.println("the request/drug1Name/"+name+" total cost:"+(System.currentTimeMillis()-current)+" ms");
        return resultMap;
    }
}
