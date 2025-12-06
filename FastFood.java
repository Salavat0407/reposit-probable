public class FastFood extends Objepit{
	private String burger;
	private String napitok;
	private boolean zastolom;
	private int scores;
	
	public FastFood(String name, int potok, boolean isOpen, double srchek, String burger, String napitok, boolean zastolom, int scores){
		super(name, potok, isOpen, srchek);
		setBurger(burger);
		setNapitok(napitok);
		setZastolom(zastolom);
		setScores(scores);
	}
	
	public void setBurger(String burger){
		if (burger == null || burger.isEmpty()){
			System.out.println("Введите корректное название бургера");
		}
		this.burger = burger;
	}
	
	public void setNapitok(String napitok){
		if (napitok == null || napitok.isEmpty()){
			System.out.println("Введите корректное название напитка");
		}
		this.napitok = napitok;
	}
	
	public void setZastolom(boolean zastolom){
		this.zastolom = zastolom;
	}
	
	public void setScores(int scores){
		if (scores < 0){
			System.out.println("Введите корректное значение бонусов");
		}
		this.scores = scores;
	}
	
	public String getNapitok(){
		return napitok;
	}
	
	public String getBurger(){
		return burger;
	}
	
	public boolean getZastolom(){
		return zastolom;
	}
	
	public int getScores(){
		return scores;
	}
	
	
	@Override
	public void menu(){
		System.out.println("Бургер дня: " + getBurger() + "\n" + "Напиток по акции: " + getNapitok());
	}
	
	public void forfree(){
		if (getScores() >= 35 && getScores() < 70){
			System.out.println("Вы можете заказать напиток бесплатно");
		} else if (getScores() >= 70 && getScores() < 105){
			System.out.println("Вы можете заказать напиток или бургер бесплатно");
		} else if (getScores() >=105){
			System.out.println("Вы можете заказать напиток и бургер бесплатно");
		} else {
			System.out.println("У вас не хватает бонусов");
		}
	}
}
