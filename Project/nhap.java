package Nhap1;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class nhap {
    
    public static void main(String[] args) {
        Student c = new Student("1", "Minh", 100) ; 
        Student a = new Student("2", "Minh2", 5) ;
        Student b = new Student("3", "Minh3", 50) ;  

        LinkedList<Student> linkedList = new LinkedList<>() ; 
        linkedList.add(c); 
        linkedList.add(a); 
        linkedList.add(b);
        
        for (Student student : linkedList) {
            System.out.println(student);
        }
        System.out.println("----------------------------------------------");
        // remove 
        linkedList.removeIf(s -> s.getId().equals("3"));

        for (Student student : linkedList) {
            System.out.println(student);
        }
        System.out.println("----------------------------------------------");
        
        Set<Integer> tree = new TreeSet<>() ; 
        tree.add(10);
        tree.add(2);
        tree.add(15);

        for (Integer integer : tree) {
            System.out.println(integer);
        }




    }

}
