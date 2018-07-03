package cn.zippler.drugcombinationserver.listener;

import cn.zippler.drugcombinationserver.service.InitService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ApplicationInitListener implements ApplicationListener<ContextRefreshedEvent>{
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("init the application");
        InitService service = event.getApplicationContext().getBean(InitService.class);
//        service.getAllDrugName();// cancel the annotation when in product environment
        System.out.println("finished start up.");
    }
}
