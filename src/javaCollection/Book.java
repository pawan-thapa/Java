package javaCollection;


public class Book {
	
private int price;
private String name;
private String author;
private String publication;

public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublication() {
	return publication;
}
public void setPublication(String publication) {
	this.publication = publication;
}
@Override
public String toString() {
	return "Book [price=" + price + ", name=" + name + ", author=" + author + ", publication=" + publication + "]";
}

}
