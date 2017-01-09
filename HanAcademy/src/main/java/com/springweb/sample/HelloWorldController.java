package com.springweb.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView welcomeMessage(
			@RequestParam(value = "name", required = false) String name) {
		// Name of your jsp file as parameter
		ModelAndView view = new ModelAndView("hello");
		view.addObject("name", name);
		return view;
	}
	
	@RequestMapping("/home")
    public ModelAndView welcomeUser() {
        // Name of your jsp file as parameter
        ModelAndView view = new ModelAndView("/client/home");
        return view;
    }
	
	@RequestMapping("/admin")
    public ModelAndView welcomeAdmin() {
        // Name of your jsp file as parameter
        ModelAndView view = new ModelAndView("/admin/adminLogin");
        return view;
    }
}
