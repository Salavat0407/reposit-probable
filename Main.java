public class Main{
	public static void main(String[] args){
		ItemStorage<Integer> i1 = new ItemStorage<>(100);//число 100 автоматически преобразуется в объект Integer, который попадает в диапазон от -128 до 127
		i1.compareWith(100); //оба значения ссылаются на один и тот же участок памяти, поэтому выведет true
		ItemStorage<Integer> i2 = new ItemStorage<>(200); // число 200 не входит в диапазон кэширования, поэтому создается новый объект, ссылки разные
		i2.compareWith(200); //выведет false
		ItemStorage<Fraction2> i3 = new ItemStorage<>(new Fraction2(1,2));
		System.out.println(i3.getValue().equals(new Fraction2(1,2)));
	}
}
