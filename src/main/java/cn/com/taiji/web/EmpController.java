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
	//默认页面
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	//跳转员工管理
	@RequestMapping("/emp")
	public String emp() {
		return "redirect:listEmp";
	}
	//显示所有员工
	@RequestMapping("/listEmp")
	public String listEmp(Model model) {
		List<Employee> emps = empService.emps();
		model.addAttribute("emps",emps);
		return "emp";
	}
	//删除员工
	@RequestMapping("/delEmp")
	public String delEmp(int id) {
		empService.delEmp(id);
		return "redirect:listEmp";
	}
	//跳转到查询页面
	@RequestMapping("/insertToEmp")
	public String insertEmp() {
		
		return "insertEmp";
	}
	
	
	
	
}
