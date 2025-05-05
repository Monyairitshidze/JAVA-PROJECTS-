import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        
        main m = new main();
        m.operataionToBeDone();
    }

    public void operataionToBeDone(){

        account a = new account();

        Scanner sc = new Scanner(System.in);

        System.out.println("Select option");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");

        int num = sc.nextInt();

        if(num == 1){

            a.deposit();

        }
        else if(num ==2 ){

            a.withdrawal();
        }
    }
}