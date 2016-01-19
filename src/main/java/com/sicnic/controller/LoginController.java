package com.sicnic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sicnic.services.UsuariosService;

import java.util.Locale;
import java.util.Map;

@Controller
public class LoginController {

	private UsuariosService userService;

	@Autowired
	public void setUserService(UsuariosService userService) {
		this.userService = userService;
	}

	@RequestMapping("/login")
	public String index() {
		return "pages/login";
	}

	@RequestMapping("/loginError")
	public String logerror(Model model) {
		model.addAttribute("logerror", true);
		return "pages/login";
	}

	@RequestMapping("/logout")
	public String logout(Model model) {
		return "pages/login";
	}

	@RequestMapping("/users")
	public String getusers(Model model) {

		return "pages/login";
	}
}
