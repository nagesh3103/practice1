package immutable;

public class Payment {
    private int amount;
    private Account fromAccount;
    private Account toAccount;
    private String phNo;

    public Payment(int amount,String phNo){
        this.amount=amount;
        this.phNo=phNo;
    }
    public Payment(Account fromAccount,Account toAccount,int amount){
        this.fromAccount=fromAccount;
        this.toAccount=toAccount;
        this.amount=amount;
    }

    public int getAmount() {
        return amount;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public String getPhNo() {
        return phNo;
    }
}
