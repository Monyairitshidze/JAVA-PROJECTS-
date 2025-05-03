
import java.util.Scanner;


public class main{

   

    public static void main(String[] args) {
        
        main m = new main();
        m.opertaionTobeDone();
        

    }

    public void opertaionTobeDone(){


        passenger p = new passenger();



        Scanner sc = new Scanner(System.in);

        System.out.println("1.Add passwnger to the Queue");
        System.out.println("2.View next Passenger");
        System.out.println("3.Remove and serve the next passenger");
        System.out.println("4.View the number of waiting passenger");
        System.out.println("5.Display full Queue");
        System.out.println("Enter your choice(1-5)");
        int answer = sc.nextInt();

        if(answer ==1){

            p.addPassenger();

        }

        else if(answer == 2){


            p.findNextPersonInQueue();

        }

        else if(answer ==3){

            p.removeAndServeTheNext();
        }

        else if(answer == 4){

            p.numberOfWaitingPassenger();
        }

        else if(answer == 5){

            p.displayListOfUsers();
        }

    }
}