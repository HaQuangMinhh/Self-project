package Nhap1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class User {
    
    private int UserId ; 
    private String Name ; 
    private String Email ; 
    private int OverDueCount ;
    
    public User(int userId, String name, String email) {
        UserId = userId;
        Name = name;
        Email = email;
        OverDueCount = 0 ; 
    }

    // Search Item 
    public List<Item> searchItem (List<Item> items , String query ){
        List<Item> result = new ArrayList<>() ; 
        
        for ( Item eachItem : items  ) {
            if ( eachItem.getItemTitle().toLowerCase().contains(query.toLowerCase()) ) {
                result.add(eachItem);
            }
        }
        return result ; 
    } 




    // tăng quá hạn 
    public boolean hasOverDue() {
        return OverDueCount > 0 ; 
    }
    public void increaseOverDue() {
        OverDueCount++ ; 
    }



    public int getUserId() {
        return UserId;
    }
    public void setUserId(int userId) {
        UserId = userId;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public int getOverDueCount() {
        return OverDueCount;
    }
    public void setOverDueCount(int overDueCount) {
        OverDueCount = overDueCount;
    } 


    

}
