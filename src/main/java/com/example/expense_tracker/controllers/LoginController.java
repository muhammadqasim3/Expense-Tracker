package com.example.expense_tracker.controllers;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.expense_tracker.models.Expense;
import com.example.expense_tracker.models.User;
import com.example.expense_tracker.services.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user", new User());
		return mav;
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("user") User user) {
		
		user = userService.login(user.getEmail(), user.getPassword());
		
		if(Objects.nonNull(user)) {
			return "redirect:/expenses";
		}else {
			return "redirect:/login";	
		}
		
		
	}
	
}
