package com.virtusa.mrviewer.System.controller;

import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.virtusa.mrviewer.System.dto.UserDTO;
import com.virtusa.mrviewer.System.service.IUserService;

@Controller
public class AuthController {

	@Autowired
	private IUserService userService;
	
	@GetMapping("/user/signup")
	public String signupForm(Model model) {
		model.addAttribute("user", new UserDTO());
		return "registrationForm";
	}

	@PostMapping("/user/signup")
	public String signup(@Valid @ModelAttribute UserDTO dto, BindingResult result, Model model) {
		if(result.hasErrors()) {			
			model.addAttribute("user", dto);
			model.addAttribute("errors", result.getAllErrors().stream().map(e -> e.getDefaultMessage()).collect(Collectors.toList()));
			return "registrationForm";
		}
		try {
			userService.addUser(dto);
			return "redirect:/home";
		}catch(RuntimeException exception) {
			result.rejectValue("email", "Duplicate entry", "User already exists with this email");
			model.addAttribute("user", dto);
			model.addAttribute("errors", result.getAllErrors().stream().map(e -> e.getDefaultMessage()).collect(Collectors.toList()));
			return "registrationForm";
		}
	}
	
	@GetMapping("/home")
	@ResponseBody
	public String publicHome() {
		return "Homepage | Access to all";
	}
	
	// TEST
	
	@GetMapping("/user/home")
	@ResponseBody
	public String home() {
		return "HomePage";
	}
	
	@GetMapping("/admin/home")
	@ResponseBody
	public String adminHome() {
		return "Admin Home";
	}
}
