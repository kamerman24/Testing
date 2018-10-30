public class Account {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNum;
    public int amount;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Your new balance: " + balance);
    }

    public void withdraw(int amount) {
        if( balance - amount <  0 ){
            System.out.println("You dont have enough funds");
        }else {
            balance -= amount;

        }
        System.out.println("Your new balance: " + balance);

    }
}
