package cn.zippler.drugcombinationserver.controller;

import cn.zippler.drugcombinationserver.dao.PmidDrugDao;
import cn.zippler.drugcombinationserver.entity.PmidDrug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/pmid2")
public class PmidDrugController {
    private PmidDrugDao pmidDrugDao;

    @Autowired
    public PmidDrugController(PmidDrugDao pmidDrugDao) {
        this.pmidDrugDao = pmidDrugDao;
    }


    @RequestMapping("/list")
    public List<PmidDrug> findAll(){
        return pmidDrugDao.findAll();
    }

    @RequestMapping("/list/{id}")
    public Optional<PmidDrug> findOne(@PathVariable("id") long id){
        return pmidDrugDao.findById(id);
    }

    @RequestMapping("/page")
    public Page<PmidDrug> getPage(@RequestParam(value = "page", defaultValue = "0") Integer page, @RequestParam(value = "size", defaultValue = "10") Integer size){
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        Pageable pageable = new PageRequest(page, size, sort);
        return pmidDrugDao.findAll(pageable);
    }
}
