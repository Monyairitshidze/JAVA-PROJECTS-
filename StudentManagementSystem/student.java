
import java.util.ArrayList;
import java.util.Scanner;

public class student extends User {
   
    ArrayList <Object> afterProcessed = new ArrayList<>();

    public student(String name,int age,String subject){

        Name = name;
        Age = age;
        Subject = subject;
    
    }

    @Override
    void addStudent(){

    Scanner sc = new Scanner(System.in);


        ArrayList <Object> beforeProcessed = new ArrayList<>();


        beforeProcessed.add(Name);
        beforeProcessed.add(Age);
        beforeProcessed.add(Subject);


            afterProcessed = beforeProcessed;

     System.out.println("ADDED ");

     System.out.println("[ " + afterProcessed + " ]");

     viewStudent();

       
    }

    @Override
    void viewStudent(){

        
        
        for(int i =0; i<afterProcessed.size(); i++){

            System.out.println(afterProcessed);
        }
    }

    
}
