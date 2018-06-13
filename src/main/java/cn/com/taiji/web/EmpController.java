package cn.com.taiji.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
}
