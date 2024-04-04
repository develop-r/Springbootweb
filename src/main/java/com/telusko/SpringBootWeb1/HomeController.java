package com.telusko.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@ModelAttribute("course")
	public String courseName(){
		return "java";
	}
	@RequestMapping("/")
	public String home() {
		System.out.println("Home method called");
		return "index";
	}
	@RequestMapping("addAlien")
	public String addAlien( Alien alien) {


		/*Alien alien=new Alien();
		alien.setAid(aid);
		alien.setAname(aname);
		alien.setAclass(aclass);
		model.addObject("alien",alien);
		model.setViewName("result");*/
		return "result";
	}

}
