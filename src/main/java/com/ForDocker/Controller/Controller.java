package com.ForDocker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/mydevops")
	public String getOutput() {
		return "Task Completed";
	}
}
