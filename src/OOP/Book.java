package OOP;

public class Book {

		String name;
		int pages;
		String authorName;
		int price;
		
		void printBookInfo()
		{
			System.out.println("Name: "+name);
			System.out.println("Author: "+authorName);
			System.out.println("Price: "+price);
			System.out.println("Number of pages: "+pages);
		}
		public static void main(String[] args) {
			Book b = new Book();
			
			b.name = "Math";
			b.authorName = "R.K Singh";
			b.price = 500;
			b.pages = 900;
			
			b.printBookInfo();
		}
}
