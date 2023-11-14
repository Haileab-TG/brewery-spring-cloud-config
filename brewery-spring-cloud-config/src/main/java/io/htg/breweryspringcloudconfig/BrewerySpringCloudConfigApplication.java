package io.htg.breweryspringcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BrewerySpringCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrewerySpringCloudConfigApplication.class, args);
	}

}
