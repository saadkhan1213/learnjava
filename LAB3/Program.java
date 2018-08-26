class Program {

    public static void main(String args[]) {
        Account saad = new Account(1, "Saad", "Saving", 5000);
        saad.print();
        saad.deposit(500);
        saad.withdraw(5000);
        saad.print();

    }
}