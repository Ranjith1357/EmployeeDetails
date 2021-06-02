package org.emp;

public class Employee {
	
	public void empId() {
		
		System.out.println("5655");
		
	}
	
    public void empName() {
		
		System.out.println("Ranjith");
		
    }
	
    public void empDob() {
		
		System.out.println("24/04/1996");
		
    }
    
    public void empPhone() {
		
		System.out.println("7904960813");
		
    }
    
    public void empEmail() {
		
		System.out.println("ranjithr222@gmail.com");
		
    }
	
    public static void main(String[] args) {
    	Employee obj = new Employee();
    	obj.empId();
    	obj.empName();
    	obj.empDob();
    	obj.empPhone();
    	obj.empEmail();
    	
    }
	
	
	

}
