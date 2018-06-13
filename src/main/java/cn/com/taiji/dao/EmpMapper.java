package cn.com.taiji.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.taiji.domain.Employee;


@Repository
public interface EmpMapper {
	public List<Employee> listEmp();
	
}
