package com.singplayground.showcase.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.singplayground.security.model.CustomUser;

@Controller
@RequestMapping(value = "/basic2")
public class Basic2Controller {

	@RequestMapping(value = "test2", method = RequestMethod.GET)
	public ModelAndView test2Controller() throws Exception {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName(); //get logged in username
		CustomUser customUser = (CustomUser) SecurityContextHolder.getContextHolderStrategy().getContext().getAuthentication().getPrincipal();
		//CustomUser customUser = (CustomUser) auth.getDetails();

		System.out.println("this is customUser :  " + customUser.getUsername());
		System.out.println("-----");
		System.out.println("******** this is name " + name);
		System.out.println("======== email : " + customUser.getEmail());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("basic/test");
		return mav;
	}

}
