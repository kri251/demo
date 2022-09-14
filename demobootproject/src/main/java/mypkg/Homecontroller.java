package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("products")
public class Homecontroller{
	@GetMapping("/add")
	public String addproduct() {
		return "add product controls";
		
	}
	@GetMapping("/show")
	public ModelAndView getproducts() {
		ModelAndView mv=new ModelAndView();
				mv.setViewName("MyFile");
				return mv;
	}
}

