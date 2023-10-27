package DemoSpringMVC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	@GetMapping("/trang-chu")
	public ModelAndView index() {
		ModelAndView nav = new ModelAndView("home"); 
		return nav;
	}
}
