
//201124

package com.yedam.db;

public class Dept {
	
	//field
	private int departmentId;
	private String departmentName;
	private int managerId;
	private int locationId;
	
	//constructor
	
	
	//method

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public void showDeptInfo() {
		System.out.println("부서번호: " + this.departmentId + "부서이름: " + this.departmentName + "매니저아이디: " + this.managerId + "지역번호: " + this.locationId);
	}

	

	

}
