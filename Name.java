import java.util.Scanner;
import java.util.regex.*;
public class Tasknn{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		if (s1.matches("[A-Z][a-z]{1,14}")){
			System.out.println(true);
		} else {
			System.out.println(false);
	}
}
