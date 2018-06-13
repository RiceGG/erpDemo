package cn.com.taiji.domain;

public class Salary {
	private Integer emp_id;
	private Double emp_salary;
	public Salary() {}
	public Salary(Integer emp_id, Double emp_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_salary = emp_salary;
	}
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public Double getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(Double emp_salary) {
		this.emp_salary = emp_salary;
	}
	@Override
	public String toString() {
		return "Salary [emp_id=" + emp_id + ", emp_salary=" + emp_salary + "]";
	}
	
	
}
