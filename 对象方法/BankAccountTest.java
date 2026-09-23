public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1000);
        
        System.out.println(a1.getBalance());

        a1.setBalance(1500);

        System.out.println(a1.getBalance());

        a1.setBalance(-500);
    }
}