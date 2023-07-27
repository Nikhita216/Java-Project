package projectbankapplication;

import java.util.Scanner;


public class JavaProject1_BankApplication {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("  Create a Account by filling following details!!");
		System.out.println("---------------------------------------------------");
		System.out.println("Enter the account number : ");
		int acc_no = sc.nextInt();
		System.out.println("Enter the Account holder name : ");
		String acc_holder_name = sc.next();
		System.out.println("Enter mobile number : ");
		long mob_no = sc.nextLong();
		System.out.println("Enter the Initial deposite : ");
		double initial_deposite = sc.nextDouble();
		System.out.println("Account Created Successfully");
		double balance = initial_deposite;
		// System.out.println("Your account balance is : "+bk.balance);
		BankAccount ba = new BankAccount(acc_no, acc_holder_name, initial_deposite, mob_no);

		while (true) {
			System.out.println("Select your choice ");
			System.out.println("------------------");
			System.out.println("1. Deposite Amount ");
			System.out.println("2. Withdraw Amount ");
			System.out.println("3. Check Balance ");
			System.out.println("4. Profile Details ");
			System.out.println("5. Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the amount you want to deposite : ");
				double deposite_amt = sc.nextDouble();
				ba.deposite(deposite_amt);
				System.out.println("Deposited Successfully");
				System.out.println("Current balance is: " + ba.getBalance());
				break;

			case 2:
				System.out.println("Enter the amount you want to Withdraw : ");
				double withdraw_amt = sc.nextDouble();
				if (ba.withdraw(withdraw_amt)) {

					System.out.println("Successfully Withdrawed");
					System.out.println("Current balance is : " + ba.getBalance());
				} else {
					try {
						throw new AccountLimitExceeds("You have insufficient balance!!");
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}

				}
				break;

			
			  case 3: 
			  System.out.println("Your current Balance is : "+ba.getBalance());
			  break;
			  
			  case 4: ba.displayProfile(acc_no, acc_holder_name, mob_no, ba.getBalance());
			  break;
			 
			case 5:
				System.out.println("Thank you!!");
				System.exit(0);
				break;

			default:
				System.out.println("Make a valid choice!!");

			}
		}

	}

}

class BankAccount {
	private int acc_no;
	private String acc_holder_name;
	private double initial_deposite, balance;
	private long mob_no;

	public BankAccount(int acc_no, String acc_holder_name, double initial_deposite, long mob_no) {
		super();
		this.acc_no = acc_no;
		this.acc_holder_name = acc_holder_name;
		this.initial_deposite = initial_deposite;
		this.balance = initial_deposite;
		this.mob_no = mob_no;
	}

	synchronized public void deposite(double amt) {
		balance = balance + amt;

	}

	synchronized public boolean withdraw(double amt) {
		if (amt <= balance) {
			balance = balance - amt;
			return true;
		}
		return false;

	}

	public double getBalance() {
		return balance;

	}
	public void displayProfile(int acc_no,String acc_holder_name, long mob_no,double balance) {
		System.out.println("Account Number : "+acc_no);
		System.out.println("Account Holder Name : "+acc_holder_name);
		System.out.println("Mobile Number : "+mob_no);
		System.out.println("Current Balance : "+balance);
	}
	
}
