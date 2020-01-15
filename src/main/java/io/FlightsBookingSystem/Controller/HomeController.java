package io.FlightsBookingSystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//	welcome message appear after login using the below URL
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}
		
}
