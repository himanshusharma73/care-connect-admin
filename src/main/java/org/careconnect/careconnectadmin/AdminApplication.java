package org.careconnect.careconnectadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("org.careconnect.careconnectcommon.entity")
@ComponentScan({"org.careconnect.careconnectcommon","org.careconnect.careconnectadmin"})
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}

}
