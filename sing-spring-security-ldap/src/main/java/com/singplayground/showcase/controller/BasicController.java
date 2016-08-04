package com.singplayground.showcase.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/basic")
public class BasicController {

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public ModelAndView test1Controller() throws Exception {
		System.out.println("-------- ");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName(); //get logged in username
		System.out.println("this is test");
		System.out.println("------ name : " + name);
		//CustomUser customUser = (CustomUser) auth.getPrincipal();
		//CustomUser customUser = (CustomUser) auth.getDetails();
		/*
				System.out.println("this is customUser :  " + customUser.getUsername());
				System.out.println("-----");
				System.out.println("******** this is name " + name);
				System.out.println("======== email : " + customUser.getEmail());
				System.out.println("The size of the authorities : " + auth.getAuthorities().size());
		*/
		//auth.get

		ModelAndView mav = new ModelAndView();
		mav.setViewName("basic/test");
		return mav;
	}
}
