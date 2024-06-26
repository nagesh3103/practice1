package immutable;

public class PaymentTest {
    public static void main(String[] args) {
        Account account=new Account("5454","3263");
        Payment paymentMobile = new Payment(500,"1233455");
        Payment paymentWeb = new Payment(account,account,500);
        System.out.println(paymentMobile);
    }
}
