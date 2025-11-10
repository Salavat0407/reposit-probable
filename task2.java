import java.util.Scanner;
import java.util.regex.*;
public class Task7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String logs = sc.nextLine();
		Pattern pattern = Pattern.compile("\\[ERROR\\]\\s(19\\d{2}?|20[0-2]\\d)-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]):\\s.+?\\[");
		Matcher matcher = pattern.matcher(logs);
		while (matcher.find()) {
			System.out.println("Найдена ошибка: " + matcher.group());
		}
	}
}
