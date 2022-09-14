package mypkg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home_controller {
	@RequestMapping("/home")
	public ModelAndView home(Product product) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("product",product);
		mv.setViewName("page1");
		return mv;
	}
	

}
