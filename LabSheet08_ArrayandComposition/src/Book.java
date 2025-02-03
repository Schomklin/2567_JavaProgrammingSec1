
public class Book {
	private String title;
	private Author author; //concept Composition
	private int pages;
	
	Book(String title, Author author, int pages){
		this.title = title;
		this.author = author;
		this.pages = pages;		
	}
	
	Book(String title,Author author){
		//this(title,author,0);
		this.title = title;
		this.author = author;
		this.pages = 0;
	}
	
	Book(){
		//this(null,null,0);
		this.title = null;
		this.author = null;
		this.pages = 0;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public void setPages(int pages) {
		this.pages = pages;		
	}
	
	public int getPages() {
		return this.pages;
	}
	
	public String toString() {
		return getTitle()+" has " + getPages() + " pages write by "+ author.toString();
	}

}






