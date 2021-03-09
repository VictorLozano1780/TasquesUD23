/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Víctor Lozano
 *
 */
@RestController
public class HolaMundoController {
@RequestMapping("/")
public String holaMundo() {
	return "Hola mundo";
}
}
