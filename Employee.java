import java.util.regex.*;
public class Employee extends Person {
	private double salary;
	private String role;
	
	public Employee(String id, String fullname, String role, double salary){
		super(id,fullname);
		setRole(role);
		setSalary(salary);
	}
	
	
	public void setRole(String role){
		if (role == null || role.isEmpty()){
			System.out.println("Введена неккоректная роль сотрудника");
		} 
		this.role = role;
	}
	
	public void setSalary(double salary){
		if (salary < 0){
			System.out.println("Заработная плата не может быть отрицательной");
		}
		this.salary = salary;
	}
	
	public String getRole(){
		return role;
	}
	
	public double getSalary(){
		return salary;
	}
	@Override
	public String displayInfo(){
		return "ID: " + getId() + "\n" + "fullname: " + getFullName() + "\n" + "role: " + getRole() + "\n" + "salary: " + getSalary();
	}
}
