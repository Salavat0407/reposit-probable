import java.util.Scanner;
import java.util.regex.*;
public class Task7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String csv = sc.nextLine();
		Pattern pattern = Pattern.compile("[A-Z][a-z]+,([1-9]|[1-9]\\d),([A-Z][a-z]+)");
		Matcher matcher = pattern.matcher(csv);
		while (matcher.find()) {
			System.out.println("Найден пользователь "+ matcher.group());
		}
	}
}
