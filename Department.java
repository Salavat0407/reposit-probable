import java.util.Scanner;
import java.util.regex.*;
public class Department {
    private String departmentName;
    private String headOfDepartment;
    private String officeRoom;
    private String email;
    private String phoneNumber;
    private double budget;
	private static int totalDepartments = 0;
	private final double universityBudget = 1000.90;
    Scanner sc = new Scanner(System.in);
	
	public Department(){
		this("null", "null", "null", "null", "null", 0.0);
	}
	
	public Department(String departmentName, String headOfDepartment, String officeRoom){
		this(departmentName, headOfDepartment, officeRoom, "null", "null", 0.0);
	}
	
	public Department(String departmentName, String headOfDepartment, String officeRoom, String email, String phoneNumber, double budget){
		this.departmentName = departmentName;
		this.headOfDepartment = headOfDepartment;
		this.officeRoom = officeRoom;
		setEmail(email);
		setNumber(phoneNumber);
		setBudget(budget);
		totalDepartments++;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getNumber(){
		return phoneNumber;
	}
	
	public double getBudget(){
		return budget;
	}
	
	public void setEmail(String email){
		while (email.matches("[a-z]\\w+@[a-z]+\\.(ru|com)") == false){
			System.out.println("Введите корректный email: ");
			email = sc.nextLine();
		}
		this.email = email;
	}
	
	public void setNumber(String phoneNumber){
		while (!phoneNumber.matches("\\d+")){
			System.out.println("Введите корректный номер телефона: ");
			phoneNumber = sc.nextLine();
		}
		this.phoneNumber = phoneNumber;
	}
	
	public void setBudget(double budget){
		while (budget < 0.0){
			System.out.println("Введите корректный бюджет: ");
			budget = sc.nextDouble();
		}
		this.budget = budget;
		
	}
	
	public static void validateEmail(String email){
		if (email.matches("[a-z]\\w+@[a-z]+\\.ru")){
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	
	public void contact(String message){
		System.out.println("Message for " + phoneNumber + " " + message);
	}
	
	public void contact(){
		System.out.println(phoneNumber);
	}
	
	public void allocateBudget(double amount){
		if (budget >= amount){
			budget = budget - amount;
			System.out.println(budget);
		} else {
			System.out.println("Бюдждет не может быть изъят");
		}
	}
	
	public void allocateBudget(double amount){
		if (budget >= amount){
			budget = budget - amount;
			System.out.println(budget);
		} else {
			System.out.println("Бюдждет не может быть изъят");
		}
	}
	
	public void allocateBudget(double amount, String purpose){
		if (budget >= amount){
			budget = budget - amount;
			System.out.println("Бюджет в размере " + amount + " изъят для " + purpose);
		} else {
			System.out.println("Бюдждет не может быть изъят");
		}
			
}
