import java.util.Scanner;

interface Account{

    double balance = 0;
    String account_no = "1234567890";
    int CVV = 900;
    String card_number = "1234567890123";
    int expiring_date = 12;
    int[] expiring_year = {24,25,26,27,28,29,30,31,32,33,34,35};

    void deposit();
    
    void withdraw();

    Scanner sc = new Scanner(System.in);
}