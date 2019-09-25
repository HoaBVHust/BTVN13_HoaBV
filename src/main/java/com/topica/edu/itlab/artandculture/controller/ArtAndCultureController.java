package com.topica.edu.itlab.artandculture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArtAndCultureController {

	@RequestMapping("/styles")
	public ModelAndView styles() {
		ModelAndView moderAndView = new ModelAndView("style-guide");
		return moderAndView;
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView moderAndView = new ModelAndView("page-about");
		return moderAndView;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView moderAndView = new ModelAndView("page-contact");
		return moderAndView;
	}
	
}
