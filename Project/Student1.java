package Nhap1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student1 extends User {
    
    private String StudentId ;

    public Student1(int userId, String name, String email, String studentId) {
        super( userId, name, email );
        StudentId = studentId ;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    } 

    public void borrowBook (Book book ) {
        if ( hasOverDue() ) {
            System.out.println( getName() + " can not borrow book due to ourdue items." );
            return ; 
        }

        if ( book.getItemStatus().equals("available") ) {
            book.setItemStatus("borrowed");
            System.out.println(getName() + " borrowed the book: " + book.getItemTitle() );
        } else {
            System.out.println(book.getItemTitle() + " is not available ");
        }

    }


    // Method 1 : Easy 
    // public void bookRoom (Room room ) {
    //     if ( hasOverDue() ) {
    //         System.out.println( getName() + " can not book room due to ourdue items ");
    //         return ; 
    //     }

    //     if ( room.getItemStatus().equals("available") ) {
    //         room.setItemStatus("Booked");
    //         System.out.println(getName() + " Booked successfully: " + room.getRoomInfor());
    //     } else {
    //         System.out.println(room.getRoomInfor() + " is not available ");
    //     }
    // }


    //  Method 2 : Hard 
    public void bookRoom ( Room room , int duration ) {
        if (hasOverDue()) {
            System.out.println( getName() +  " cannot book rooms due to overdue items " );
            return ; 
        }

        if ( room.getItemStatus().equals("available") ) {
            room.setItemStatus("Booked");

            // Calculate the time 
            LocalDateTime startTime = LocalDateTime.now() ; 
            LocalDateTime endTime ; 





        }



    }



}
