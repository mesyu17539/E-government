package com.project.web.person;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {
	@Autowired PersonService service;
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	@RequestMapping("/")
	public String home(Locale locale, Model model) {
		System.out.println("PersonController");
		Map<String,String> map = new HashMap<>();
		String result = "false";
		map.put("type", "member");
		map.put("id", "id");
		map.put("pass", "pass");
		map.put("data1", "anti2110");
		map.put("data2", "4512");
		
		if(service.exist(map) == 1) {
			result = "true";
		}
		System.out.println("존재여부는 "+result);
		model.addAttribute("exist", result);
		return "app";
	}
	
	@RequestMapping("/exist")
	public String exist() {
		System.out.println("exist");
		return "component/exist";
	}
	
	@RequestMapping("/not-exist")
	public String notExist() {
		System.out.println("not-exist");
		return "component/not-exist";
	}
}
