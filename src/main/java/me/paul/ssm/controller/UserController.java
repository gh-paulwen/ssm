package me.paul.ssm.controller;

import java.io.IOException;
import java.io.Writer;

import me.paul.ssm.entity.User;
import me.paul.ssm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/save",method=RequestMethod.GET)
	public String save(Model model,@ModelAttribute() User user){
		userService.save(user);
		model.addAttribute("generatedKey", user.getId());
		return "index";
	}
	
	@RequestMapping(path="/get/{id}",method=RequestMethod.GET)
	public String get(@PathVariable("id") int id,Writer writer) throws IOException{
		User user = userService.get(id);
		writer.write(user.toString());
		return null;
	}

}
