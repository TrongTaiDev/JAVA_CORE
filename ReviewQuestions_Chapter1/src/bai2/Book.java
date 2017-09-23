package bai2;

import javax.net.ssl.HandshakeCompletedEvent;

public class Book {
	private int ISBN;
	private String title, author;
	private int pageCount;
	
	@Override
	public int hashCode() {
		return ISBN;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Book)) return false;
		Book other = (Book)obj;
		return this.ISBN == other.ISBN;
	}
	
	public static void main(String argn[]) {
		Book book1 = new Book();
		book1.ISBN = 1;
		book1.pageCount = 199;
		book1.title = "Java";
		book1.author = "Tai";
		
		Book book2 = new Book();
		book2.ISBN = 1;
		book2.pageCount = 199;
		book2.title = "Java";
		book2.author = "Tai";
		
		if(book1.equals(book2)) {
			System.out.println("Giống!");
		}else {
			System.out.println("Khác!");
		}
	}
}
