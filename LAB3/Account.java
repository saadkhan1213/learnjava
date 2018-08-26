class Account {

  private int accountNumber;
  private String holderName;
  private String type;
  private double balance;

  public Account() {
    System.out.println("I am Default Constructor");

  }

  public Account(int an, String hn, String t, double b) {
    System.out.println("--------------------------------");
    System.out.println("I am Parameterized Constructor with 4 parameter");
    accountNumber = an;
    holderName = hn;
    type = t;
    balance = b;

  }

  public void deposit(int amount) {

    balance += amount;
  }

  public void withdraw(int amount) {

    if (amount > 25000) {
      System.out.println("Amount Exceeded");
    }

    else {
      if (amount > balance) {
        System.out.println("Balance is Insufficient");
      }

      else {

        balance -= amount;
        System.out.println("Withdraw Operation Done.");
      }
    }
  }

  public void print() {
    System.out.println("----------------------------");
    System.out.println("Account Number:" + accountNumber);
    System.out.println("Holder Name:" + holderName);
    System.out.println("Type:" + type);
    System.out.println("Balance:" + balance);
  }
}