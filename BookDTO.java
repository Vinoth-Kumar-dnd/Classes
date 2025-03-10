package classesobj;

public class BookDTO {

	
	private long id;
	private String name;
	private int year;
	private String Author;
	private int tot_pages;
	
	
	
	
	BookDTO(long id,String name,int year,String Author,int tot_pages){
		this.id=id;
		this.Author=Author;
		this.name=name;
		this.year=year;
		this.tot_pages=tot_pages;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getTot_pages() {
		return tot_pages;
	}
	public void setTot_pages(int tot_pages) {
		this.tot_pages = tot_pages;
	}
	
	
	public void isoldornew() {
		if(year>2024) {
			System.out.println("It is a new book");
		}
		else {
			System.out.println("It is a old book");
		}
	}
	public void islargeorsmall() {
		if(tot_pages>1500) {
			System.out.println("It is a large book");
		}
		else {
			System.out.println("It is a small book");
		}
	}	
	
	
}
