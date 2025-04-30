import java.util.Scanner;

public class main{


    public static void main(String[] args) {

        main m = new main();
        m.operatinsToBeDone();
        
    }

    public void operatinsToBeDone(){


        Catalogue_Management cm = new Catalogue_Management();
        member m = new member();

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("Choose your option:");
        System.out.println("1.Catalogue Management");
        System.out.println("2.Member Management");
        System.out.println("3.Reporting");
        System.err.println("Enter a number coresponding with your option(1-3)");
        int respond1 = sc.nextInt();

        if(respond1 == 1){

        System.out.println("Choose your option:");
        System.out.println("1.ADD BOOKS");
        System.out.println("2.SEARCH BOOKS");
        System.out.println("3.REMOVE BOOKS");

        System.err.println("Enter a number coresponding with your option");
        int respond2 = sc.nextInt();

        if(respond2 == 1){

            cm.addBooks();
            
        }

        else if(respond2 == 2){

          cm.searchBook();

        }

        else if(respond2 == 3){

         cm.removeBook();
         
        }
        }

        else if(respond1 == 2){

        System.out.println("Choose your option:");
        System.out.println("1.ADD MEMBER");
        System.out.println("2.UPDATE MEMBER");
        System.out.println("3.REMOVE MEMBER");

        System.err.println("Enter a number coresponding with your option");
        int respond2 = sc.nextInt();

        if(respond2 == 1){

            m.addMember();


        }
        else if(respond2 == 2){

            m.updateMember();
            
        }

        else if(respond2 == 3){

            m.removeMember();
        }

        }

        else if(respond1 == 3){

            m.report();
        }
    
    }
}