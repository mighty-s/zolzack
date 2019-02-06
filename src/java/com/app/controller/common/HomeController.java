package com.app.controller.common;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.common.collection.VO;
import com.common.controller.CommonController;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController extends CommonController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public ModelAndView home(@ModelAttribute("defaultVO") VO vo, Locale locale) {
		ModelAndView mav = new ModelAndView("home");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		mav.addObject("serverTime", formattedDate);
		mav.addObject("defaultVO", vo);
		
		return mav;
	}
	
}