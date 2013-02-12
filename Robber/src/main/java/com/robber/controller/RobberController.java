package com.robber.controller;

/**
 * @author Sivaprakash Thiyagarajan (sivaprakasht@hotmail.com).
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RobberController {
	/**
	 * @return
	 */
	@RequestMapping("showLogin.do")
	public ModelAndView showLogin(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
	
	/**
	 * @return
	 */
	public ModelAndView authenticateUser(){
		ModelAndView mav = new ModelAndView();
		if(isValidUser()){
			
		} else {
			
		}
		return mav;
	}
	
	/**
	 * @return
	 */
	private boolean isValidUser(){
		return true;
	}
}
