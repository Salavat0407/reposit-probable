import java.util.Scanner;
import java.util.regex.*;
public class Task7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Статистика слов");
		System.out.println("Общее количество слов");
		System.out.println(kolvo(str));
		System.out.println("Самое длинное слово");
		System.out.println(longest(str));
		System.out.println("Количество уникальных слов");
		System.out.println(unic(str));
		System.out.println("Статистика чисел");
		int cntch = 0;
		int sum = 0;
		//нахождение всех чисел
		Pattern pattern = Pattern.compile("([1-9][0-9]*)|([0-9]\\,[1-9]+)");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()){
			System.out.println("Найдено число: " + matcher.group());
			cntch++;
		}
		//нахождение суммы продаж
		Pattern pattern1 = Pattern.compile("([1-9][0-9]*\\$)|([0-9]\\,[1-9]+\\$)");
		Matcher matcher1 = pattern1.matcher(str);
		while (matcher1.find()){
			System.out.println("Найдена сумма: " + matcher1.group());
		}
		System.out.println("Статистика контактов"); //статистика контактов
		//нахождение email-адресов
		Pattern pattern2 = Pattern.compile("\\w+@\\w+\\.\\w+");
		Matcher matcher2 = pattern2.matcher(str);
		while (matcher2.find()){
			System.out.println("Найден e-mail: " + matcher2.group());
		}
		//нахождение телефонных контактов
		Pattern pattern3 = Pattern.compile("\\+79\\d{9}");
		Matcher matcher3 = pattern3.matcher(str);
		while (matcher3.find()){
			System.out.println("Найден номер телефона: " + matcher3.group());
		}
		
		
		
		
		//статистика символов
		System.out.println("Статистика символов");
		//общее колчество символов
		System.out.println("Общее количество символов");
		System.out.println(str.length());
		//вывод количества букв
		System.out.println("Количество букв");
		System.out.println(bukva(str));
		//вывод количества цифр
		System.out.println("Количество цифр");
		System.out.println(cifra(str));
		//вывод количества спц символов
		System.out.println("Количество специальных символов");
		System.out.println(cpec(str));
		//вывод количества предложений
		System.out.println("Количество предложений");
		System.out.println(pred(str));
		//вывод среднего количества предложений
		System.out.println("Средняя длина предложений");
		System.out.println(str.length()/pred(str));
		
		
		
		
	}
	
	//создание массива со словами
	public static String[] massive(String user){
		int index = 0;
		String word = "";
		String[] array = new String[kolvo(user)];
		for (int i = 0; i<user.length(); i++){
			if (user.charAt(i)!=' '){
				word+=user.charAt(i);
			} else {
				array[index]=word;
				word="";
				index++;
			}
			array[index]=word;
		}
		return array;
	}
	
	//нахождение количества уникальных слов
	public static String longest(String user){
		String[] array = massive(user);
		String most = "";
		int srav = 0;
		for (int i = 0; i<kolvo(user); i++){
			if (array[i].length()>srav){
				most = array[i];
				srav = array[i].length();
			}
		}
		return most;
	}
			
	
	//нахождение количества слов
	public static int kolvo(String user){
		int cnt = 0;
		for (int i = 0; i<user.length(); i++){
			if (user.charAt(i)==' '){
				cnt++;
			}
		}
		return cnt +1;
	}
	
	//нахождение количества уникальных слов
	public static int unic(String user){
		String[] array = massive(user);
		int cnt = 1;
		for (int i = 0; i<kolvo(user)-1; i++){
			boolean flag = true;
			for (int j = i+1; j<kolvo(user); j++){
				if (array[i].equals(array[j])){
					flag = false;
					break;
				}
			}
			if (flag == true){
				cnt++;
			}
		}
		return cnt;
	}
	//нахождение количества букв
	public static int bukva(String user){
		Pattern pattern4 = Pattern.compile("([A-Z]{1})|([a-z]{1})");
		Matcher matcher4 = pattern4.matcher(user);
		int cntbukv = 0;
		while (matcher4.find()){
			cntbukv++;
			
		}
		return cntbukv;
	}
	//нахождение количества букв
	public static int cifra(String user){
		Pattern pattern5 = Pattern.compile("\\d");
		Matcher matcher5 = pattern5.matcher(user);
		int cntcifr = 0;
		while (matcher5.find()){
			cntcifr ++;
			
		}
		return cntcifr;
	}
	//нахождение спец символов
	public static int cpec(String user){
		Pattern pattern6 = Pattern.compile("[^0-9a-zA-Z]");
		Matcher matcher6 = pattern6.matcher(user);
		int cntcpec = 0;
		while (matcher6.find()){
			cntcpec ++;
			
		}
		return cntcpec;
	}
	//нахождение предложений
	public static int pred(String user){
		int cntpred = 1;
		for (int i = 0; i<user.length()-1; i++){
			if (user.charAt(i)=='.' && user.charAt(i+1)==' ' ){
				cntpred++;
			}
		}
		return cntpred;
	}
		
	
		
}
