package com.vmware.tacmobile.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@SpringBootApplication
public class HelloJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloJavaApplication.class, args);
	}

}
