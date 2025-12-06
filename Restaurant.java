public class Restaurant extends Objepit{
	private String napitok;
	private String bludo;
	private int oficianti;
	
	public Restaurant(String name, int potok, boolean isOpen, double srchek, String napitok, String bludo, int oficianti){
		super(name, potok, isOpen, srchek);
		setNapitok(napitok);
		setBludo(bludo);
		setOficianti(oficianti);
	}
	
	public void setNapitok(String napitok){
		if (napitok == null || napitok.isEmpty()){
			System.out.println("Введите корректное название напитка");
		}
		this.napitok = napitok;
	}
	
	public String getNapitok(){
		return napitok;
	}
	
	public void setBludo(String bludo){
		if (bludo == null || bludo.isEmpty()){
			System.out.println("Введите корректное название блюда");
		}
		this.bludo = bludo;
	} 
	
	public String getBludo(){
		return bludo;
	}
	
	public void setOficianti(int oficianti){
		if (oficianti <= 0){
			System.out.println("Введите корректное число официантов");
		}
		this.oficianti = oficianti;
	}
	
	public int getOficianti(){
		return oficianti;
	}
	
	@Override
	public void menu(){
		System.out.println("Фирменное блюдо: " + getBludo() + "\n" + "Уникальный напиток: " + getNapitok());
	}
	
	public double zp(){
		return this.viruchka()/getOficianti();
	}
}
