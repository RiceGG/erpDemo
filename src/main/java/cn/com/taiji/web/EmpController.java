package cn.com.taiji.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.taiji.domain.Employee;
import cn.com.taiji.service.impl.EmpServiceImpl;

@Controller
public class EmpController {
	
	@Autowired
	private EmpServiceImpl empService;
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping("/emp")
	public String emp() {
		return "redirect:listEmp";
	}
	@RequestMapping("/listEmp")
	public String listEmp(Model model) {
		List<Employee> emps = empService.emps();
		model.addAttribute("emps",emps);
		return "emp";
	}
}
