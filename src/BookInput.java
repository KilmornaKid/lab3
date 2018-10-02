import javax.swing.*;

public class BookInput {
    public static void main(String[] args) {

        Book favBook  = new Book();
        favBook.setTitle(JOptionPane.showInputDialog(null,"Please enter your favourite book:"));
        favBook.setisbn(JOptionPane.showInputDialog(null,"Please enter the ISBN of the book:"));
        favBook.setNumOfPages(Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of pages in the book:")));
        favBook.setPrice(Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter your price of the book:")));

        Book out = new Book();
        out.setTitle(JOptionPane.showInputDialog(null,"Please enter your favourite book:"));
        out.setisbn(JOptionPane.showInputDialog(null,"Please enter the ISBN of the book: "));
        out.setNumOfPages(Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of pages in the book:")));
        out.setTitle(JOptionPane.showInputDialog(null,"Please enter your price of the book:"));



        System.exit(0);

    }
}
