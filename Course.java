import java.util.Scanner;

public class Course {
    private String courseCode;
    private String courseName;
    private int maxStudents;
    private int currentStudents;
    private boolean isActive;
    private static int totalCourses = 0;
    private final int MAX_CREDITS_PER_SEMESTER = 100;
    Scanner sc = new Scanner(System.in);
    
    public Course() {
        this("000", "Java_Util", 100, 0, false);
    }
    
    public Course(String courseCode, String courseName, boolean isActive) {
        this(courseCode, courseName, 80, 0, isActive);
    }
    
    public Course(String courseCode, String courseName, int maxStudents, int currentStudents, boolean isActive) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.isActive = isActive;
        this.maxStudents = maxStudents;
        setCurrentStud(currentStudents);
        totalCourses++;
    }
    
    public void setCurrentStud(int num) {
        while (num < 0 || num > maxStudents) {
            System.out.println("Введите текущее количество записанных: ");
            num = sc.nextInt();
        }
        this.currentStudents = num;
    }
    

    public int getCurrentStud() {
        return currentStudents;
    }
    
    public static int getTotalCourse() {
        return totalCourses;
    }
    
    public boolean enrollStudent(String studentId) {
        if (currentStudents + 1 <= maxStudents) {
            System.out.println("Студент с ID: " + studentId + " зачислен на курс " + courseName);
            currentStudents++;
            return true;
        } else {
            System.out.println("Студент с ID: " + studentId + " не может быть зачислен на курс " + courseName);
            return false;
        }
    }
    
    public boolean enrollStudent() {
        if (currentStudents + 1 <= maxStudents) {
            System.out.println("Студент зачислен на курс " + courseName);
            currentStudents++;
            return true;
        } else {
            System.out.println("Студент не может быть зачислен на курс " + courseName);
            return false;
        }
    }
    
    public void displayInfo() {
        displayInfo(true);
    }
    
    public void displayInfo(boolean showAvailability) {
        System.out.println("Код курса: " + courseCode + "\nНазвание курса: " + courseName + 
                         "\nМаксимальное количество студентов: " + maxStudents + 
                         "\nТекущее количество студентов: " + currentStudents);
        if (showAvailability) {
            int free = maxStudents - currentStudents;
            System.out.println("Свободных мест: " + free);
        }
    }
}
