package com.infydemo.docker.DockerInfyDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.infydemo.docker"})
public class DockerInfyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerInfyDemoApplication.class, args);
	}

}
