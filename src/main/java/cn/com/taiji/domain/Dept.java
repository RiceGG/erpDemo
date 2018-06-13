package cn.com.taiji.domain;

import java.util.List;

public class Dept {
	private Integer dept_id;
	private String dname;
	private Integer parent_id;
	
	private List<Employee> emps;
	
	public Dept() {}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}



	public Dept(Integer dept_id, String dname, Integer parent_id) {
		this.dept_id = dept_id;
		this.dname = dname;
		this.parent_id = parent_id;
	}

	public Dept(Integer dept_id, String dname, Integer parent_id, List<Employee> emps) {
		this.dept_id = dept_id;
		this.dname = dname;
		this.parent_id = parent_id;
		this.emps = emps;
	}



	public Integer getDept_id() {
		return dept_id;
	}

	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	
	
}
