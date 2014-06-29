package com.sdk.kswf.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController extends BaseController {

	private static final Logger logger = LoggerFactory
			.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	@ResponseBody
	public ModelAndView login(HttpServletRequest request) {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		logger.info("userName: {}.", userName);
		logger.info("password: {}.", password);

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("userName", userName);

        //TODO:
        //userService.login(userName, password);
        
        ModelAndView mv = new ModelAndView("login", model);

        return mv;


	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	@ResponseBody
	public void logout() {

	}
}
