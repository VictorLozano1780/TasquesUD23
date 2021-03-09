/**
 * 
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Víctor Lozano
 *
 */
@Controller
public class HelloController {
	
	@GetMapping("/")
	public String hola() {
		return "hola";
	}
	
}

