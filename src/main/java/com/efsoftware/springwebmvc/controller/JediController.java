package com.efsoftware.springwebmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.efsoftware.springwebmvc.model.Jedi;
import com.efsoftware.springwebmvc.repository.JediRepository;

@Controller
public class JediController {
	@Autowired
	private JediRepository jediRepository;

	@GetMapping("/jedi")
	public ModelAndView getJedi(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("jedi");  
		
		modelAndView.addObject("allJedi", jediRepository.getAllJedi());      
		return  modelAndView;        
	}
	
	@GetMapping("/new-jedi")
	public ModelAndView newJedi(){  
		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("new-jedi");
		
		modelAndView.addObject("jedi", new Jedi());          
		return  modelAndView;      
	}
	
	@PostMapping("/jedi")
	public String createJedi(@ModelAttribute Jedi jedi) {  	
		jediRepository.add(jedi);  
		
		return "redirect:jedi";
	}
}
