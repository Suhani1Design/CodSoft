import java.util.Scanner;

public class AtmInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000;

        while (true) {

            System.out.println("\n====== ATM MENU ======");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance = ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Money Deposited Successfully!");
                        System.out.println("Updated Balance = ₹" + balance);
                    } else {
                        System.out.println("Invalid Amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance && withdraw > 0) {
                        balance = balance - withdraw;
                        System.out.println("Money Withdrawn Successfully!");
                        System.out.println("Remaining Balance = ₹" + balance);
                    } else {
                        System.out.println("Insufficient Balance or Invalid Amount!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}
