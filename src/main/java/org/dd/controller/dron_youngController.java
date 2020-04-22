package org.dd.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/test/")
public class dron_youngController {

	@GetMapping("/dron_young")
	public void home() {
		
	}
}
		
		
		
		
		
		
		
