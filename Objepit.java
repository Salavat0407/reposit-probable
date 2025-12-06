public abstract class Objepit{
	private String name;
	private int potok;
	private boolean isOpen;
	private double srchek;
	
	public Objepit(String name, int potok, boolean isOpen, double srchek){
		setName(name);
		setPotok(potok);
		setIsOpen(isOpen);
		setSrchek(srchek);
	}
	
	public void setSrchek(double srchek){
		if ((srchek < 0) || (srchek > 0 && !getIsOpen())){
			System.out.println("Введена неверная сумма среднего чека");
		} else {
			this.srchek = srchek;
		}
	}
	
	public double getSrchek(){
		return srchek;
	}
	
	public void setName(String name){
		if (name == null || name.isEmpty()){
			System.out.println("Введено неверное имя заведения");
		}
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setPotok(int potok){
		if ((potok < 0) || (potok > 0 && !getIsOpen())){
			System.out.println("Введено неверное количество гостей");
		} else {
			this.potok = potok;
		}
	}
	
	public int getPotok(){
		return potok;
	}
	
	public void setIsOpen(boolean isOpen){
		this.isOpen = isOpen;
	}
	
	public boolean getIsOpen(){
		return isOpen;
	}
	
	public abstract void menu();
	
	
	public double viruchka(){
		return getPotok() * getSrchek();
	}
		
		
}
