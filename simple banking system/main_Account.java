
import java.util.Random;

public class main_Account implements Account {

    Random r = new Random();

     User user4;

    public  void addAccount(User user){

    this.user4 = user;


   
    StringBuilder sb = new StringBuilder(13);
    for(int i =0; i<13; i++){

     sb.append(account_no.charAt(r.nextInt(account_no.length())));

    }

    String Account_N0 = sb.toString() ;
    int cvv = r.nextInt(CVV);

    String CARD_NUMBER = sb.append(card_number.charAt(r.nextInt(card_number.length()))).toString();

    int EXPRING_DATE = r.nextInt(expiring_date);

    int EXPIRING_YEAR = expiring_year[r.nextInt(expiring_year.length)];


    System.out.println("This "+ Account_N0+ "was created for " + this.user4.name);
    }
    
    @Override
    public void deposit() {
   }

    @Override
    public void withdraw() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
   

 
    
}
