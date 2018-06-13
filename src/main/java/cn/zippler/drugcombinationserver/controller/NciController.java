package cn.zippler.drugcombinationserver.controller;

import cn.zippler.drugcombinationserver.dao.NciDrugDao;
import cn.zippler.drugcombinationserver.entity.NciDrug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nci")
public class NciController {
    private  NciDrugDao nciDrugDao;

    @Autowired
    public NciController(NciDrugDao nciDrugDao) {
        this.nciDrugDao = nciDrugDao;
    }


    @RequestMapping("/list")
    public List<NciDrug> findAll(){
        return nciDrugDao.findAll();
    }

    @RequestMapping("/list/{id}")
    public Optional<NciDrug> findOne(@PathVariable("id") long id){
        return nciDrugDao.findById(id);
    }

    @RequestMapping("/page")
    public Page<NciDrug> getPage(@RequestParam(value = "page", defaultValue = "0") Integer page, @RequestParam(value = "size", defaultValue = "10") Integer size){
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        Pageable pageable = new PageRequest(page, size, sort);
        return nciDrugDao.findAll(pageable);
    }
}
