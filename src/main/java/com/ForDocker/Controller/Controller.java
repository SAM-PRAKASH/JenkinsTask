package com.ForDocker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping("/toWindow")
public String getWishes() {
	return "Keep your face always toward the sunshine, and shadows will fall behind you.";
}
}
