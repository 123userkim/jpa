package com.example.test0315.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test0315.service.DeptService;

import lombok.Setter;

@Controller
@Setter
public class DeptController {
	
	@Autowired
	private DeptService ds;
	
	@RequestMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", ds.findAll());
	}
}









