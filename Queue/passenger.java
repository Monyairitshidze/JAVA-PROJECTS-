import java.util.HashMap;
import java.util.Scanner;

public class passenger {

    Scanner sc = new Scanner(System.in);

    static HashMap <Integer,String> m = new HashMap<Integer,String>();

        main ma = new main();

    public void addPassenger(){

        String respond , respond1 = null;

        do { 

            System.out.println("Enter the passenger's name: ");
            String name = sc.next();

            m.put(m.size(),name);
            System.out.println("Detains" + m);
            System.out.println("");

            System.out.println("Want to add another one?(YES/NO)");
            respond= sc.next();

           

            if(respond.equalsIgnoreCase("no")){

                System.out.println("Want to perform another operation??(YES/NO)");
                 respond1 = sc.next();

                if(respond1.equalsIgnoreCase("yes")){

                    ma.opertaionTobeDone();
                    
                }

                else if(respond1.equalsIgnoreCase("no")){

                    System.out.println("Thanks for using our System");
                    break;
                }
            }


        } while (respond.equalsIgnoreCase("yes"));
        


    }


    public void displayListOfUsers(){


        System.out.println("The total list of users is: " + m.size());
        System.out.println("Full Details:" + m.entrySet());
        System.out.println("");
        System.out.println("Do you want to perform another operation?(YES/NO)");
        String answer = sc.next();

        if(answer.equalsIgnoreCase("yes")){

            ma.opertaionTobeDone();
        }

        else{

            System.out.println("Thanks for using our system");
        }
        
    }


    public void findNextPersonInQueue(){

        System.out.println("Enter the id of the person:");
        int id = sc.nextInt();

        int k  = 0;

        for(int i=0; i<m.size(); i++){
          

            if(m.containsKey(i)){

                  k = id+1;

                System.out.println("NEEXT ONE IN A LINE IS: " + m.get(k));

            }
            break;

        }

        System.out.println("Want to add find the next one(YES/NO)");
        String answer = sc.next();

        if(answer.equalsIgnoreCase("yes")){

            findNextPersonInQueue();
        }

        else if(answer.equalsIgnoreCase("no")){

            System.out.println("want to perform another operation?(YES/NO)");
            String respond = sc.next();

            if(respond.equalsIgnoreCase("yes")){

                ma.opertaionTobeDone();
            }

            else {

                System.out.println("Thanks for Using Our System");
                
            }
            
        }
        


        
    }

    public void removeAndServeTheNext(){

        int i;

        for(i =0 ; i<m.size();){

            System.out.println("Serving customer: " + i);
            m.remove(i);

            break;
        }
           
        int j = i +1 ;

        System.out.println("Ready for another one?(YES/NO)");
        String answer = sc.next();

        if(answer.equalsIgnoreCase("yes")){

            System.out.println("Next");

    
            for(i =j; i<m.size(); i++){
    
                System.out.println("Serving customer: " + i);
                m.remove(i);
    
            }

            System.out.println("Ready for another one?(YES/NO)");
            String answer1 = sc.next();
    
            if(answer1.equalsIgnoreCase("yes")){

                removeAndServeTheNext();
            }

            else{

                System.out.println("No lonegr serving");
                System.out.println("");
                System.out.println("want to perform another task?(YES/NO)");
                String respond = sc.next();
    
                if(respond.equalsIgnoreCase("yes")){
    
                    ma.opertaionTobeDone();
                }
    
                else if(respond.equalsIgnoreCase("no")){
    
                System.out.println("Thanks for using our system");
                }
            }

        }
        

    }

    public void numberOfWaitingPassenger(){

        System.out.println("Before serving");
        System.out.println("The number is: "+ m.size());

        int i;
        for(i =0 ; i<m.size();){

            System.out.println("Serving customer: " + i);
            System.out.println("");
            m.remove(i);

            break;
        }

        System.out.println("System after serving customer " + m.size());

        System.out.println("");
        System.out.println("want to serve again?(YES/NO)");
        String answer = sc.next();

        if(answer.equalsIgnoreCase("yes")){

            numberOfWaitingPassenger();
        }

        else if(answer.equalsIgnoreCase("no")){


            System.out.println("want to perform another operation?(YES/NO)");
            String respond = sc.next();

            if(respond.equalsIgnoreCase("yes")){

                ma.opertaionTobeDone();
            }

            else {

                System.out.println("Thanks for Using Our System");
                
            }
            
            

        }

    }
    

    
    
}
