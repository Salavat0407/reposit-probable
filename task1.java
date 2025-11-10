import java.util.Scanner;
import java.util.regex.*;
public class Task7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		Pattern pattern = Pattern.compile("\".+?\"");
		Matcher matcher = pattern.matcher(str1);
		System.out.println("Начинаем поиск..."); 
		while (matcher.find()){
			String found = matcher.group();
			System.out.println("Найдена цитата: " + found);
		}
		System.out.println("Поиск завершен");
	}
}
