public class Student{
	private String studentId;
	private String firstname;
	private String lastName;
	private int age;
	private double averageGrade;
	private String faculty;
	private static int totalStudents = 0;
	private static final String UNIVERSITY_NAME = "KFU";
	
	
	public Student(){
		this("ID", "Ivan", "Ivanov", 18, 0.0, "ITIS");
	}
	
	public Student(String studentId, String firstname, String lastName){
		this(studentId, firstname, lastName, 18, 0.0, "ITIS");
	}
	
	public Student(String studentId, String firstname, String lastName, int age, double averageGrade, String faculty){
		this.studentId = studentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.averageGrade = averageGrade;
		this.faculty = faculty;
	}
	
	public static int getTotalStudents(){
		return totalStudents;
	}
	
	
	public void setAge(int age1){
		if (age>=16 && age<=70){
			this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAverageGrade(double grade){
		if (grade>=0.0 && grade <= 5.0){
			this.averageGrade = grade;
		}
	}
	
	public int getGrade(){
		return this.averageGrade;
	}
	
	public void setId(String Id){
		if (Id != null && Id != ""){
			this.studentId = Id;
		}
	}
	
	public int getId(){
		return studentId;
	}
	
	public String displayInfo(){
		String result = "ID студента: " + studentId + "\n" + "Имя студента: " + firstname + "\n" + "Фамилия студента: " + lastname + "\n" + "Возраст студента: " + age + "\n" + "Средний балл студента: " + averageGrade + "\n" + "Факультет студента: " + faculty;
		return result;
		
	}
	
	public String displayInfo(boolean detailed){
		String result = "";
		if (detailed == false){
			result = studentId + "\n" + firstname + "\n" + lastname;
		} else {
			result = "ID студента: " + studentId + "\n" + "Имя студента: " + firstname + "\n" + "Фамилия студента: " + lastname + "\n" + "Возраст студента: " + age + "\n" + "Средний балл студента: " + averageGrade + "\n" + "Название факультета: " + faculty + "\n" + "Общее количество студентов: " + totalStudents + "\n" + "Название университета: " + UNIVERSITY_NAME;
		}
		return result;
	}
	
	public void updateGrade(double newGrade){
		setAverageGrade(newGrade);
	}
	
	public void updateGrade(double newGrade, String subject){
		System.out.println("Средний балл по " + subject + " = " + updateGrade(newGrade));
	}
}
*/

/*
import java.util.Scanner;
public class Student{
	private Scanner sc = new Scanner(System.in);
	private final String universityName = "KFU";
	private static int totalStudents = 0;
	private String studentId;
	private String firstname;
	private String lastName;
	private int age;
	private double averageGrade;
	private String faculty;
	
	public Student(){
		this("001", "Name", "Lastname", 17, 0.0, "ITIS");
	}
	
	public Student(String studentId, String firstname, String lastName){
		this(studentId, firstname, lastName, 17, 0.0, "ITIS");
	}
	
	public Student(String studentId, String firstname, String lastName, int age, double averageGrade, String faculty){
		this.studentId = studentId;
		this.firstname = firstname;
		this.lastName = lastName;
		this.age = age;
		this.averageGrade = averageGrade;
		this.faculty = faculty;
		totalStudents++;
	}
	
	public static int getTotalStudents(){
		return totalStudents;
	}
	
	public void setAge(int age){
		while(age<=16 || age >= 70){
			System.out.println("Введи нормальный возраст");
			age = sc.nextInt();
		}
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setGrade(double averageGrade){
		while(averageGrade <= 0.0 || averageGrade >= 5.0){
			System.out.println("Средний балл: ");
			averageGrade = sc.nextInt();
		}
		this.averageGrade = averageGrade;
	}
	
	public double getGrade(){
		return this.averageGrade;
	}
	
	public void setID(String studentId){
		while(studentId == null || studentId == ""){
			System.out.println("ID студента: ");
			studentId = sc.nextLine();
		}
		this.studentId = studentId;
	}
	
	public String getID(){
		return this.studentId;
	}
	
	public String displayInfo(){
		String result = "ID студента: " + studentId + "\n" + "Имя студента: " + firstname + "\n" + "Фамилия студента: " + lastName + "\n" + "Возраст студента: " + age + "\n" + "Средний балл студента: " + averageGrade + "\n" + "Факультет студента: " + faculty;
		return result;
		
	}
	
	public String displayInfo(boolean detailed){
		String result = "";
		if (detailed == false){
			result = studentId + "\n" + firstname + "\n" + lastName;
		} else {
			result = "ID студента: " + studentId + "\n" + "Имя студента: " + firstname + "\n" + "Фамилия студента: " + lastName + "\n" + "Возраст студента: " + age + "\n" + "Средний балл студента: " + averageGrade + "\n" + "Название факультета: " + faculty + "\n" + "Общее количество студентов: " + totalStudents + "\n" + "Название университета: " + universityName;
		}
		return result;
	}
	public void updateGrade(double newGrade){
		setAverageGrade(newGrade);
	}
	
	public void updateGrade(double newGrade, String subject){
		System.out.println("Средний балл по " + subject + " = " + newGrade);
		setAverageGrade(newGrade);
	}
}
