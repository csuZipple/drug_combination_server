package cn.zippler.drugcombinationserver.controller;

import cn.zippler.drugcombinationserver.dao.Pmc5DrugDao;
import cn.zippler.drugcombinationserver.entity.Pmc5Drug;
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
@RequestMapping("/pmc5")
public class Pmc5DrugController {
    private Pmc5DrugDao pmc5DrugDao;

    @Autowired
    public Pmc5DrugController(Pmc5DrugDao pmc5DrugDao) {
        this.pmc5DrugDao = pmc5DrugDao;
    }


    @RequestMapping("/list")
    public List<Pmc5Drug> findAll(){
        return pmc5DrugDao.findAll();
    }

    @RequestMapping("/list/{id}")
    public Optional<Pmc5Drug> findOne(@PathVariable("id") long id){
        return pmc5DrugDao.findById(id);
    }

    @RequestMapping("/page")
    public Page<Pmc5Drug> getPage(@RequestParam(value = "page", defaultValue = "0") Integer page, @RequestParam(value = "size", defaultValue = "10") Integer size){
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        Pageable pageable = new PageRequest(page, size, sort);
        return pmc5DrugDao.findAll(pageable);
    }
}
