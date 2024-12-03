package Nhap1;

public class Student {
    
    private String Id ; 
    private String Name ; 
    private double Score ;
    
    public Student(String id, String name, double score) {
        Id = id;
        Name = name;
        Score = score;
    }
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getScore() {
        return Score;
    }
    public void setScore(double score) {
        Score = score;
    }
    @Override
    public String toString() {
        return "Student [Id=" + Id + ", Name=" + Name + ", Score=" + Score + "]";
    } 



}
