public class ItemStorage<T>{
	private T value;
	
	public ItemStorage(T value){
		this.value = value;
	}
	
	public T getValue(){
		return value;
	}
	
	public void setValue(T value){
		if (value == null){
			System.out.println("Ошибка, объект не может быть пустым");
		} else {
			this.value = value;
		}
	}
	
	public void compareWith(T overValue){
		if (overValue == null){
			System.out.println("Опачки! Ревизия невозможна, объект не найден");
		} else if ((overValue.equals(value))) {
			System.out.println("Значения идентичны. Контроль качества пройден");
		} else {
			System.out.println("Контроль качества НЕ пройден!!!");
		}
	}
}
