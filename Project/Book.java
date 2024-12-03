package Nhap1;

public class Book extends Item {
    private String Author ;

    
    public Book(int itemId, String itemTitle, String author) {
        super(itemId, itemTitle);
        Author = author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    } 

    

}
