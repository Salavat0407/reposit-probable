import java.util.Scanner;
import java.util.regex.*;
public class Task7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String post = sc.nextLine();
		Pattern pattern = Pattern.compile("#[a-z]+");
		Matcher matcher = pattern.matcher(post);
		while (matcher.find()) {
			System.out.println("Найден хэштэг " + matcher.group());
		}
	}
}
