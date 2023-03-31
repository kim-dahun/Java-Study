package edu.java.inner02;

public class Book {
	// field
	private String title; // 책의 제목
	private String author; // 책의 저자
	private String publisher; // 출판사

	// constructor
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	// method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("BookInfo( title = %s, author = %s, publisher = %s )", this.title, this.author,
				this.publisher);
	}

	// ---------- Factory(Builder) 디자인 패턴 ----------
	public static BookBuilder builder() { // 객체 생성을 위한 도구

		return new BookBuilder();
		// -> 외부 클래스는 static으로 선언된 내부 클래스의 private 생성자를 호출할 수 있다!

	}

	public static class BookBuilder { // 객체 생성 도구 클래스

		private String title; // 필드는 부품
		private String author;
		private String publisher;

		private BookBuilder() { // 도구가 아무데서나 생성되지 않고, 필요한 곳에서만 쓰이도록.
								// 이 도구는 Book 클래스를 만드는 데만 쓰이는 도구.
		}

		public BookBuilder title(String title) { // 부품 붙이기
			this.title = title;
			return this; // this : BookBuilder 타입으로 생성된 객체(인스턴스)
		}

		public BookBuilder author(String author) { // 부품 붙이기
			this.author = author;
			return this;
		}

		public BookBuilder publisher(String publisher) {
			this.publisher = publisher;
			return this;
		}

		public Book build() { // 완성된 제품을 리턴해서 필요한 곳으로 날림.
			
			return new Book(title,author,publisher);
			
		}
		
	}

}
