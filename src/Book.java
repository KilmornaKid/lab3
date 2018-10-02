//Book.java
/*This is a program which...*/

public class Book {
    private String title;
    private double price;
    private int numOfPages;
    private String isbn;

    //accessor
    public String getTitle(){return title;}
    public int getNumOfPages(){return numOfPages;}
    public double getPrice(){return price;}
    public String getisbn(){return isbn;}


    //mutator
    public void setTitle(String title){this.title = title;}
    public void setNumOfPages(int numOfPages){this.numOfPages = numOfPages;}
    public void setPrice(double price){this.price = price;}
    public void setisbn(String isbn){this.isbn = isbn;}


    //Constructor Method
    public Book(){String title;}{
        this.title = "title";
        this.price = 0;
        this.numOfPages = 0;
        this.isbn = "No ISBN";
    }


    public Book(String titleEntry, int numOfPagesEntry, double priceEntry, String isbnEntry){
        setTitle(titleEntry);
        setisbn(isbnEntry);
        setNumOfPages(numOfPagesEntry);
        setPrice(priceEntry);
    }

    public String toString(){
        return "Title " + title + "\nISBN: " + isbn + "\nPrice: " + price + "\nNumber of pages: " + numOfPages;
    }

}