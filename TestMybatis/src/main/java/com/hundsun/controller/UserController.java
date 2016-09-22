package com.hundsun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hundsun.model.User;
import com.hundsun.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String listAll(Model model){
		model.addAttribute("list", userService.findAll());
		return "list";
	}

	@RequestMapping("/addUser")
	public String addUser(@RequestParam("name") String name,
			@RequestParam("password") String password,
			@RequestParam("address") String address,
			@RequestParam("age") Integer age) {
		User u = new User(name, password, address, age);
		int re =userService.insertUser(u);
		if(re==0){
			return "fail";
		}
		return "success";
	}

	@RequestMapping("/test")
	public ModelAndView test(Model model) {
		User user = userService.getUserById(1);
		ModelAndView mv = new ModelAndView();
		mv.addObject(user);
		mv.setViewName("message");
		return mv;
	}

	@RequestMapping("/toAdd")
	public String toAdd() {
		return "add";
	}

}
