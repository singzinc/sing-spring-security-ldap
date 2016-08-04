package com.singplayground.showcase.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/json")
public class JsonController {

	@RequestMapping(value = "public/test1", method = RequestMethod.GET)
	public @ResponseBody String publicJson1Controller() throws Exception {
		System.out.println("return string");
		return "test";
	}

	@RequestMapping(value = "public/test2", method = RequestMethod.GET)
	public @ResponseBody HashMap publicJson2Controller() throws Exception {
		System.out.println("return json for public");
		HashMap hm = new HashMap();
		hm.put("name", "john");
		return hm;
	}

	@RequestMapping(value = "private/test", method = RequestMethod.GET)
	public @ResponseBody HashMap privateJsonController() throws Exception {
		System.out.println("return json for private");
		HashMap hm = new HashMap();
		hm.put("name", "may");
		return hm;
	}

}
