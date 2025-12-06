import java.util.regex.*;
public class Table{
	private String tableNumber;
	private int capacity;
	private boolean status;
	
	public Table(String tableNumber, int capacity, boolean status){
		setTableNumber(tableNumber);
		setCapacity(capacity);
		setStatus(status);
	}
	
	public void setTableNumber(String tableNumber){
		if (tableNumber.matches("\\d{2}")){
			this.tableNumber = tableNumber;
		} else {
			System.out.println("Введен неккоректный номер столика");
		}
	}
	
	public void setCapacity(int capacity){
		if (capacity <= 0){
			System.out.println("Введена неккоректная вместительность столика");
		}
		this.capacity = capacity;
	}
	
	public void setStatus(boolean status){
		this.status = status;
	}
	
	
	public String getTableNumber(){
		return tableNumber;
	}
	
	public int getCapacity(){
		return capacity;
	}
	
	public boolean getStatus(){
		return status;
	}
	
	
	public void occupy(){
		setStatus(false);
		System.out.println("Столик " + getTableNumber() +  " заняли");
	}
	
	public void free(){
		setStatus(true);
		System.out.println("Столик " + getTableNumber() +  " освободился");
	}
}
