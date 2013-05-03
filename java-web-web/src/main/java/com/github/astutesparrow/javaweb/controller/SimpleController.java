package com.github.astutesparrow.javaweb.controller;

import com.github.astutesparrow.javaweb.simple.Simple;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/simple")
public class SimpleController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getCreateForm(Model model) {
		model.addAttribute("page_title", "PAGE_TITLE");
		Simple simple = new Simple();
		simple.setAge(27);
		simple.setName("中文_ABC_智深");
		model.addAttribute("simple", simple);
		return new ModelAndView("simple/simple", "simple", simple);
	}

}
