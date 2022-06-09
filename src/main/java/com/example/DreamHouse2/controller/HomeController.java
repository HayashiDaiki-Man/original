package com.example.DreamHouse2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.DreamHouse2.model.Garden;
import com.example.DreamHouse2.model.House;
import com.example.DreamHouse2.model.Roof;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String getIndex(){
		return "index";
	}

	@GetMapping("/question")
	public String getQuestion(){
		return "question";
	}

	@PostMapping("/add")
	public String add(@Validated @ModelAttribute Roof roof,House house,Garden garden,BindingResult result){
		if(result.hasErrors()){
			return "redirect:/";
		}
		return "result";

	}
}
