package cn.zippler.drugcombinationserver.controller;

import cn.zippler.drugcombinationserver.dao.Pmc3DrugDao;
import cn.zippler.drugcombinationserver.entity.Pmc3Drug;
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
@RequestMapping("/pmc3")
public class Pmc3DrugController {
    private  Pmc3DrugDao pmc3DrugDao;

    @Autowired
    public Pmc3DrugController(Pmc3DrugDao pmc3DrugDao) {
        this.pmc3DrugDao = pmc3DrugDao;
    }


    @RequestMapping("/list")
    public List<Pmc3Drug> findAll(){
        return pmc3DrugDao.findAll();
    }

    @RequestMapping("/list/{id}")
    public Optional<Pmc3Drug> findOne(@PathVariable("id") long id){
        return pmc3DrugDao.findById(id);
    }

    @RequestMapping("/page")
    public Page<Pmc3Drug> getPage(@RequestParam(value = "page", defaultValue = "0") Integer page, @RequestParam(value = "size", defaultValue = "10") Integer size){
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        Pageable pageable = new PageRequest(page, size, sort);
        return pmc3DrugDao.findAll(pageable);
    }
}
