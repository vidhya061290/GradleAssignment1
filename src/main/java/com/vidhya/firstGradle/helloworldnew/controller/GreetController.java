package com.vidhya.firstGradle.helloworldnew.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("print")
public class GreetController {
	
	@GetMapping(path="/greet")
	public String toPrint() {
		return "Hello!" + " $Vidhya$";
	}
	

}
