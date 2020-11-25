
//201125

package com.yedam.db2;

public class EmployeeVO { //최상위 클래스
	//field
		private int employeeId;
		private String firstName;
		private String lastName;
		private String email;
		private String phoneNum;
		private String hireDate;
		private String jobId;
		private int salary;
		
		//constructor
		public EmployeeVO(String lastName,String hireDate) {
			super();
			this.lastName = lastName;
			this.hireDate = hireDate;
		}
		
		public EmployeeVO() {
			
		}
		
		public EmployeeVO(int employeeId, String firstName, String lastName, String email, String hireDate) {
			super();
			this.employeeId = employeeId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.hireDate = hireDate;
		}
		
//	public EmployeeVO(String email, String phoneNum, String salary) {
//			super();
//			this.email = email;
//			this.phoneNum = phoneNum;
//			this.salary = salary;
//		}
		
		//method
		public int getEmployeeId() {
			return employeeId;
		}
		
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNum() {
			return phoneNum;
		}
		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
		public String getHireDate() {
			return hireDate;
		}
		public void setHireDate(String hireDate) {
			this.hireDate = hireDate;
		}
		public String getJobId() {
			return jobId;
		}
		public void setJobId(String jobId) {
			this.jobId = jobId;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		public void showEmpinfo() {
			System.out.println("사원번호: " + this.employeeId + "이름: " + this.firstName + "성: " + this.lastName + "이메일: " + this.email + "샐러리: ");
			
		}
		
}
