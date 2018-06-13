package cn.com.taiji.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.taiji.dao.EmpMapper;
import cn.com.taiji.domain.Employee;
import cn.com.taiji.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService{
	@Resource
	private EmpMapper em;
	@Override
	public List<Employee> emps() {
		List<Employee> emps = em.listEmp();
		return emps;
	}
	@Override
	public void delEmp(int id) {
		em.delEmp(id);
	}

}
