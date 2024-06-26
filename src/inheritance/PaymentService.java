package inheritance;

public class PaymentService {
    public void payment(double amount,String typeOfPayment){
        if("card".equalsIgnoreCase(typeOfPayment)){
            double charges = (amount*2)/100;
            double finalAmount = amount + charges;
        }

    }

}
