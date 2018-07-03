package cn.zippler.drugcombinationserver;

import cn.zippler.drugcombinationserver.listener.ApplicationInitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DrugCombinationServerApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(DrugCombinationServerApplication.class);
		springApplication.addListeners(new ApplicationInitListener());
		springApplication.run(args);
	}
}
