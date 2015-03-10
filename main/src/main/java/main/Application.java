package main;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	@PostConstruct
	public void init() {
		log.debug("application started ....");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
