import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class member {

    Scanner sc = new Scanner(System.in);
   static ArrayList <String> users = new ArrayList <String>();
   main m = new main();

    public void addMember(){

        System.out.println("Add Meamber");
        System.out.println("Add name");
        String name = sc.next();

        users.add(name);
        System.out.println("User added successfully");


            System.out.println("You want to add another Member?(YES/NO)");
            String respond = sc.next();

            if(respond.equalsIgnoreCase("yes")){

                addMember();
            }
            else if(respond.equalsIgnoreCase("no")){

                System.out.println("Do you want to perform another operation?");
                String respond2 = sc.next();

                if(respond2.equalsIgnoreCase("yes")){

                    m.operatinsToBeDone();
                    
                }

                else if(respond2.equalsIgnoreCase("no")){

                    System.out.println("Thanks for using our system");
                }


            }
        }


        public void updateMember(){


            System.out.println("Enter the name to be updated");
            String name = sc.next();

           for(Object user:users){

            if(user.equals(name)){

                int indexOfName = users.indexOf(name);

                System.out.println("Enter new name");
                String name2 = sc.next();
                users.set(indexOfName,name2);
                System.out.println("Name successfully updated");
                System.out.println("");
                System.out.println("You want to Change another one?(Yes/No)");
                String respond = sc.next();

                if(respond.equalsIgnoreCase("yes")){

                    updateMember();
                }
                else if(respond.equalsIgnoreCase("no")){

                System.out.println("Do you want to perform another operation?");
                String respond2 = sc.next();

                if(respond2.equalsIgnoreCase("yes")){

                    m.operatinsToBeDone();
                    
                }

                else if(respond2.equalsIgnoreCase("no")){

                    System.out.println("Thanks for using our system");
                }
                
                }
            }

         
     }

     if(!users.equals(name)){

        System.out.println("Name enterd doesnt exists");
        System.out.println("Want to try?(Yes/NO)");
        String answer = sc.next();

        if(answer.equalsIgnoreCase("yes")){

            updateMember();
        }
       }
    }


    public void removeMember(){

        System.out.println("Enter the name of user to be removed");
        String name = sc.next();

        if(users.contains(name)){

            users.remove(name);
            System.out.println("User was successfully removed");
            System.out.println("");
            System.out.println("Want to remoce another one?(YES/NO)");
            String respond = sc.next();

            if(respond.equalsIgnoreCase("yes")){

                removeMember();
            }

            else if(respond.equalsIgnoreCase("no")){

                System.out.println("Want to perform another operation(YES/NO)");
                String respond2 = sc.next();

                if(respond2.equalsIgnoreCase("yes")){

                    m.operatinsToBeDone();
                }

                else if(respond2.equalsIgnoreCase("no")){

                    System.out.println("Thanks for using our system");
                }

            }
        }

        else{

            System.out.println("User doesnt exist");
            System.out.println("Want to try again(YES/NO)");
            String respond = sc.next();

            if(respond.equalsIgnoreCase("yes")){

                removeMember();
            }

            else if(respond.equalsIgnoreCase("no")){

                System.out.println("Want to perform another operation(YES/NO)");
                String respond2 = sc.next();

                if(respond2.equalsIgnoreCase("yes")){

                    m.operatinsToBeDone();
                }

                else if(respond2.equalsIgnoreCase("no")){

                    System.out.println("Thanks for using our system");
                }

            }
        }
    }

    public void report(){

        Catalogue_Management cm = new Catalogue_Management();

        System.out.println("Full Detail Report");
        System.out.println("Number of Students Registerd " + users.size());
        System.out.println("");
        System.out.println("Students Names " + users);
        System.out.println("");
        System.out.println("Number of Books Availables " + cm.book.size());
        System.out.println("");
        System.out.println("List of Books Availables "  + cm.book);
        System.out.println("");
        System.out.println("want to perform another operation(YES/NO)");
        String respond = sc.next();

        if(respond.equalsIgnoreCase("yes")){

            m.operatinsToBeDone();
        }

        else if(respond.equalsIgnoreCase("no")){

            System.out.println("Thanks for using our System");
        }
    }
    
    
}
