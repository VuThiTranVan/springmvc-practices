package app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import app.models.Student;

@Controller
public class StudentController {
//	@RequestMapping(value = "/show", method = RequestMethod.GET)
	@GetMapping(path = { "/", "/show" })
	public ModelAndView student() {
		return new ModelAndView("student", "student", new Student());
	}
	
//	@GetMapping(path = { "/", "/show" })
//	public String student(Model model) {
//		model.addAttribute("student", new Student());
//		return "student";
//	}
	
	
//	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@PostMapping(path = "/add")
	public String addStudent(@ModelAttribute("SpringWeb") Student student,

			ModelMap model) {
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());

		return "result";
	}
}
