package com.javier.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsAssignmentApplication.class, args);
	}
	@RequestMapping("/")
	public String string() {
		return "Hello client, how are you doing?";
	}
	@RequestMapping("/random")
	public String random() {
		return "Random message";
	}
}
