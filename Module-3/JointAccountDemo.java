class JointAccount{
    private double balance;
    public JointAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public synchronized void deposit(double amount, String accountHolderName){
        System.out.println(accountHolderName + " is depositing$ " + amount);
        balance +=amount;
        System.out.println("New balance after deposit by " + accountHolderName +" is: "+ balance);
    }
    public synchronized void withdraw(double amount, String accountHolderName){
        if(balance>=amount){
            System.out.println(accountHolderName + " is withdrawing $ "+ amount);
            balance -= amount;
            System.out.println("Updated balance afte withdraw by " + accountHolderName + " is: $ " + balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}

class AccountHolder implements Runnable{
    private JointAccount account;
    private String accountHolderName;
    public AccountHolder(JointAccount account, String accountHolderName){
        this.account = account;
        this.accountHolderName = accountHolderName;
    }
    @Override
    public void run(){
        for(int i=0; i<5;i++){
            double amount = Math.random()*500;
            account.deposit(amount, accountHolderName);

            amount = Math.random()*300;
            account.withdraw(amount, accountHolderName);

            try{
                Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
            }
        }
    }
}

public class JointAccountDemo {
    public static void main(String args[]){
        JointAccount account = new JointAccount(1000.0);
        AccountHolder accountHolder1 = new AccountHolder(account, "Dhyan");
        AccountHolder accountHolder2 = new AccountHolder(account, "Kartik");

        Thread thread1 = new Thread(accountHolder1);
        Thread thread2 = new Thread(accountHolder2);

        thread1.start();
        thread2.start();
    }
}
