package in.strikes.curdSpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
// /*it is for autoconfiguration of data/*
@SpringBootApplication
public class CurdSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdSpringBootDemoApplication.class, args);

	}

}
