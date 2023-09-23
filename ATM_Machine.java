package atm_interface;
import java.util.Scanner;


public class ATM_Machine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        int balance = 1000;

        while (true) {
            System.out.println("ATM Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation: ");
            
            int operation = scanner.nextInt();
            

            switch (operation) {
                case 1:
                    System.out.print("Enter money to be withdrawn: ");
                    int withdrawalAmount = scanner.nextInt();
                    if (withdrawalAmount <= balance) {
                        balance -= withdrawalAmount;
                        System.out.println("Amount withdrawn successfully");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 2:
                    System.out.print("Enter money to be deposited: ");
                    int depositAmount = scanner.nextInt();
                    balance += depositAmount;
                    System.out.println("Amount deposited successfully");
                    break;
                case 3:
                    System.out.println("Balance: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);
                default:
                    System.out.println("Invalid operation");
            }
        }
    }
}