package practice;

public class Book {
	private int id;
	private String title;
	private String author;
	
	Book(int id , String title, String author){
		this.id=id;
		this.title=title;
		this.author=author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}

//id, title, author (private)
//User (parent)
//StudentUser (child)
//abstract class LibraryActions → issueBook(), returnBook()
//interface Display → showDetails()
//Requirements:
//Use constructor to set book details
//Use Scanner to take user details
//Override methods where required
//Use final variable LATE_FEE
//Use this and super