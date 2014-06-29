package com.sdk.kswf.controller;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.TransactionManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sdk.kswf.model.User;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

	private static final Logger logger = LoggerFactory
			.getLogger(UserController.class);

	@RequestMapping(value = "addUser", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	@ResponseBody
	public String addUser() {
		User test = new User();
		test.setName("admin");
		test.setPassword("admin");
		logger.info("user{}", test);
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(test);
		session.getTransaction().commit();
		session.close();
		sf.close();
		return "thank youadd test user";
	}

	public void delUser() {
		// TODO Auto-generated method stub

	}

	public List<User> listUser() {

		return null;
	}

}
