public class Book{
	private String title;
	private String author;
	private int year;
	private boolean isAvailable;
	private int pageCount;
	
	public Book(){
		this("Title", "Author", 0, false, 0);
	}
	
	public Book(String title, String author, int year){
		this(title, author, year, false, 0);
	}
	
	public Book(String title, String author, int year, boolean isAvailable, int pageCount){
		this.title = title;
		this.author = author;
		this.year = year;
		this.isAvailable = isAvailable;
		this.pageCount = pageCount;
	}
	
	public String displayInfo(){
		String result = title + "\n" + author + "\n" + year + "\n" + isAvailable + "\n" + pageCount;
		return result;
	}
	public void borrowBook(){
		isAvailable = false;
	}
	public void returnBook(){
		isAvailable = true;
	}
	public void updateYear(int newYear){
		year = newYear;
	}
}
