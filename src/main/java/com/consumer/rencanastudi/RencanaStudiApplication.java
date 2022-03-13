package com.consumer.rencanastudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@EntityScan("com.consumer.rencanastudi")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class RencanaStudiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RencanaStudiApplication.class, args);
	}

}
