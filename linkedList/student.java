import java.util.ArrayList;
import java.util.Scanner;

class  student{

   String name;
   int marks;


    static ArrayList names = new ArrayList();
    Scanner sc = new Scanner(System.in);
    main m = new main();


    void addStudent(){

        System.out.println("Add new Student");
        System.out.println("Enter student name");
        String name = sc.next();

        names.add(name);

        System.out.println("Student "+ name + " was Added Successfully");
        System.out.println("");
        System.out.println("Do you want to add another student?(YES/NO)");
        String answer = sc.next();

        if(answer.equalsIgnoreCase("yes")){

            addStudent();
        }
        else if(answer.equalsIgnoreCase("no")){

        System.out.println("Want to perform another operation?(YES/NO)");
        String answer2 = sc.next();

        if(answer2.equalsIgnoreCase("yes")){

         m.operationsToBeDone();
        }
        else if(answer2.equalsIgnoreCase("no")){

            System.out.println("Thanks for using our System");
        }


        }


    }


    public void searchStudent(){

        System.out.println("Enter the name of student");
        String name = sc.next();

        if(names.contains(name)){

            System.out.println("Student Exists");
            System.out.println("");
            System.out.println("You want to serach another one?(YESNO)");
            String answer2 = sc.next();

            if(answer2.equalsIgnoreCase("yes")){

                searchStudent();
            }
            else if(answer2.equalsIgnoreCase("no")){

                System.out.println("Want to perform another operation?(YES/NO)");
                String answer3 = sc.next();
        
                if(answer3.equalsIgnoreCase("yes")){
        
                 m.operationsToBeDone();
                }
                else if(answer3.equalsIgnoreCase("no")){
        
                    System.out.println("Thanks for using our System");
                }

            }
            
        }

        else{

         System.out.println("Sorry Student is not Available");
         System.out.println("Try Again Enter Another name");
         String tried_name = sc.next();

         if(names.contains(tried_name)){

            System.out.println("Student exist");

            System.out.println("You want to search another one?(YESNO)");
            String answer2 = sc.next();

            if(answer2.equalsIgnoreCase("yes")){

                searchStudent();
            }
            else if(answer2.equalsIgnoreCase("no")){

                System.out.println("Want to perform another operation?(YES/NO)");
                String answer3 = sc.next();
        
                if(answer3.equalsIgnoreCase("yes")){
        
                 m.operationsToBeDone();
                }
                else if(answer3.equalsIgnoreCase("no")){
        
                    System.out.println("Thanks for using our System");
                    
                }
            }

        }
            }
        }


        public void removeStudent(){

            System.out.println("Enter name of Students To be Removed");
            String name = sc.next();

            if(names.contains(name)){

                names.remove(name);
                System.out.println("Student "+ name + " was successfully removed");
                System.out.println("");
                System.out.println("Want to remove another one?(YES/NO)");
                String respond1 = sc.next();

                if(respond1.equalsIgnoreCase("yes")){

                    removeStudent();
                }
                else if(respond1.equalsIgnoreCase("no")){

                    System.out.println("Want to perform another operation?(YES/NO)");
                    String respond2 = sc.next();

                    if(respond2.equalsIgnoreCase("yes")){
                        m.operationsToBeDone();
                    }

                    else if(respond2.equalsIgnoreCase("no")){

                        System.out.println("Thank you for using our system");

                    }
                }
            }

            else{

                System.out.println("Student doesnt exist");
                System.out.println("Try again! Enter another name");
                String respond3 = sc.next();

                if(names.contains(respond3)){

                    names.remove(name);
                    System.out.println("Student "+ name + " was successfully removed");
                    System.out.println("");
                    System.out.println("Want to remove another one?(YES/NO)");
                    String respond1 = sc.next();
    
                    if(respond1.equalsIgnoreCase("yes")){
    
                        removeStudent();
                    }
                    else if(respond1.equalsIgnoreCase("no")){
    
                        System.out.println("Want to perform another operation?(YES/NO)");
                        String respond2 = sc.next();
    
                        if(respond2.equalsIgnoreCase("yes")){
                            m.operationsToBeDone();
                        }
    
                        else if(respond2.equalsIgnoreCase("no")){
    
                            System.out.println("Thank you for using our system");
    
                        }

                  }
                }
            }
        }

    void viewStudent(){

        System.out.println("Registerd Students");

        System.out.println("");
        System.out.println(names);

        m.operationsToBeDone();


    }

}