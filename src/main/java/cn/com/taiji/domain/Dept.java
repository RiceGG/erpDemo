package cn.com.taiji.domain;

public class Dept {
	private Integer dept_id;
	private String dname;
	private Integer parent_id;
	
	public Dept() {}

	public Dept(Integer dept_id, String dname, Integer parent_id) {
		super();
		this.dept_id = dept_id;
		this.dname = dname;
		this.parent_id = parent_id;
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

	@Override
	public String toString() {
		return "Dept [dept_id=" + dept_id + ", dname=" + dname + ", parent_id=" + parent_id + "]";
	}
	
}
