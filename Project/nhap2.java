package Nhap1;

import java.util.ArrayList;
import java.util.List;

public class nhap2 {
    

    public static void main(String[] args) {
        Book java = new Book(1, "Java", "John");

        Book cSharp = new Book(2, "Project", "Han");

        Room room1 = new Room(101, "Study Room A");
        Room room2 = new Room(101, "Study Room A");

        // Student
        Student1 student1 = new Student1(1, "Minh", "123@123" , "S100");

        Student1 student2 = new Student1(2, "Kiet", "123@123" , "S101");

        // Search for books 
        List<Item> items = new ArrayList<>() ; 
        items.add(java) ;
        items.add(cSharp) ;
        
        System.out.println("Search result: ");
        List<Item> searchResults = student1.searchItem(items, "java"); 
        
        if ( searchResults.isEmpty() ) {
            System.out.println("No items in list");
        } else {
            for ( Item item : searchResults) {
                System.out.println( item.getItemTitle() + " found");
            }
        }

        System.out.println("------------------------------------");
        student1.borrowBook(java);
        System.out.println("------------------------------------");
        student2.borrowBook(java);
        System.out.println("------------------------------------");

        student1.bookRoom(room1);
        System.out.println("------------------------------------");
        student2.bookRoom(room1);
        System.out.println("------------------------------------");

        // test overdue items 
        student1.increaseOverDue();
        
        student1.bookRoom(room2);
        student1.borrowBook(cSharp);
        System.out.println("------------------------------------");

        


    }

}
