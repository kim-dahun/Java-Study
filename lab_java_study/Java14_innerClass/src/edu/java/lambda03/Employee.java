package edu.java.lambda03;

public class Employee {

	private Integer empId; // 직원의 사번
	private String empName; // 직원의 이름
	private String dept; // 부서이름.
	private String empTitle; // 직급명
	private Double salary; // 급여

	public Employee(Integer empId, String empName, String dept, String empTitle, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.empTitle = empTitle;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmpTitle() {
		return empTitle;
	}

	public void setEmpTitle(String empTitle) {
		this.empTitle = empTitle;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Employee(Id=%d, Name=%s, dept=%s, title=%s, salary=%f)", this.empId, this.empName,
				this.dept, this.empTitle, this.salary);

	}

}
