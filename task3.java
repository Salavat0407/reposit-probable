import java.util.Scanner;
import java.util.regex.*;
public class Task7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String html = sc.nextLine();
		Pattern pattern = Pattern.compile("<h3>[A-Z][a-z]+?</h3>");
		Matcher matcher = pattern.matcher(html);
		while (matcher.find()) {
			System.out.println("Найден товар: " + matcher.group());
		}
	}
}
