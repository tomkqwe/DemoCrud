package ru.lebedev.DemoCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDemoCrudApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoCrudApplication::main).with(TestDemoCrudApplication.class).run(args);
	}

}
