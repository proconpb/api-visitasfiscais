package procon.api.visitasfiscais.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import procon.api.visitasfiscais.repository.UserRepository;

@Controller
public class UserController {

	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("usersList", this.userRepository.findAll());
		
		return "user";
	}
	
	
	
}
