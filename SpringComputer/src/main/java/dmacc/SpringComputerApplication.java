package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Computer;
import dmacc.beans.Specs;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class SpringComputerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringComputerApplication.class, args);
	}
		@Autowired
		ComputerRepository repo;
		
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
		
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Computer c = appContext.getBean("computer", Computer.class);
		c.setBrand("Dell");
		repo.save(c);
		
		Computer x = new Computer("Desktop", "Alienware", 2);
		Specs s = new Specs(32, "3090", "ryzen 7");
		x.setSpecs(s);
		repo.save(x);
		
		List<Computer> allMyComputers = repo.findAll();
		for(Computer comps: allMyComputers) {
			System.out.println(comps.toString());
		}
		((AbstractApplicationContext) appContext).close();
		
		
	
	
	}
	
}
