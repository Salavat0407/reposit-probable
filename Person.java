public class Person{
	private String id;
	private String fullname;
	
	public Person(String id, String fullname){
		setId(id);
		setFullName(fullname);
	}

	public void setId(String id){
		if (id.matches("\\d{4}")){
			this.id = id;
		} else {
			System.out.println("Введен неккоректный id");
		}
	}
	
	public void setFullName(String fullname){
		if (fullname == null || fullname.isEmpty()){
			System.out.println("Введено неккоректное имя");
		} 
		this.fullname = fullname;
	}
	
	public String getId(){
		return id;
	}
	
	public String getFullName(){
		return fullname;
	}
	
	public String displayInfo(){
		return "ID: " + getId() + "\n" + "fullname: " + getFullName();
	}
	
}
