package cn.com.taiji.domain;

public class Employee {
	private Integer emp_id;
	private String ename;
	private Integer esex;
	private Integer dept_id;
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getEsex() {
		return esex;
	}
	public void setEsex(Integer esex) {
		this.esex = esex;
	}
	
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public Employee() {
	}
	public Employee(Integer emp_id, String ename, Integer esex, Integer dept_id) {
		this.emp_id = emp_id;
		this.ename = ename;
		this.esex = esex;
		this.dept_id = dept_id;
	}
	
}
