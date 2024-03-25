package coms.travelapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelController {
	
	@GetMapping("/welcome")
	
	public String getMessage() {
		return "Welcome to application";
	}

}
