package com.ForDocker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping("/dispaly")
public String toDisplay() {
	return "Hello Everyone";
}
}
