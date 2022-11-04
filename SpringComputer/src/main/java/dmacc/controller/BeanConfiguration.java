package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;
import dmacc.beans.Specs;

@Configuration
public class BeanConfiguration {

	@Bean
	public Computer computer() {
		Computer bean = new Computer();
		bean.setBrand("Dell");
		bean.setMonitors(1);
		bean.setType("Laptop");
		return bean;
	}
	
	@Bean
	public Specs specs() {
		Specs bean = new Specs(16, "2080 Super", "i7");
		return bean;
	}
}
