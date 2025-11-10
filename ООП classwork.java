public class Student {
	
	private String firstName;
	private String lastName;
	private int age;
	private String group;
	private double averageGrade;
	private boolean isActive; 
	
	public Student(){
		this("Name", "LastName", "11-400", 18, 0.0, true);
		/*
		this.firstName = "Name";
		this.lastName = "LastName";
		this.age = 18;
		this.group = "11-400";
		this.averageGrade = 0.0;
		this. isActive = true;
		*/
	}
	
	public Student(String firstName, String lastName, String group){
		this(firstName, lastName, group, 18, 0.0, true);
		/*
		this.firstName = firatName;
		this.lastName = lastName;
		this.age = 18;
		this.group = group;
		this.averageGrade = 0.0;
		this. isActive = true;
		*/
	}
	
	public Student(String firstName, String lastName, String group, int age, double averageGrade, boolean isActive){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.group = group;
		this.averageGrade = averageGrade;
		this. isActive = isActive;
	}
	
	//Методы поведения
	
	public String displayInfo(){
		String result = firstName + "\n" + lastName + "\n" + group + "\n" + age + "\n" + averageGrade;
		return result;
		
	}
	
	public void updateGrade(double newGrade){
		averageGrade = newGrade;
	}
	
	public void activateStudent(){
		isActive = true;
	}
	
	public void deactivateStudent(){
		isActive = false;
	}
	
	public void transferToNewGroup(String group){
		this.group = group;
		System.out.println("Студент перевелся в группу: " + group);
	}
}
