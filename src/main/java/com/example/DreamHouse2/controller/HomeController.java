package com.example.DreamHouse2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.DreamHouse2.model.House;

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

	@PostMapping("/question")
	public String add(@Validated @ModelAttribute House house,BindingResult result){
		if(result.hasErrors()){
			return "redirect:/";
		}
		return "result";

	}
}
