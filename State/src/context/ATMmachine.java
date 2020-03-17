package context;

import java.util.Scanner;

public class ATMmachine {

	private static final int NOCARDINSERT = 0;
	private static final int NOPASSWORD = 1;
	private static final int PASSWORDINVALID = 2;
	private static final int IDENTITYSUCCESS = 3;
	
	private int state;
	private int yourBankPassword = 123456;
	
	public ATMmachine() {
		state = NOCARDINSERT;
	}
	
	public void insertCard() {
		if(state == NOCARDINSERT) {
			System.out.println("Insert your bank card");
			state = NOPASSWORD;
		}else if(state == NOPASSWORD) {
			System.out.println("Only one card can be inserted at a time");
		}else if(state == PASSWORDINVALID) {
			System.out.println("Only one card can be inserted at a time");
		}else if(state == IDENTITYSUCCESS) {
			System.out.println("Only one card can be inserted at a time");
		}
	}
	
	public void enterPassword() {
		if(state == NOCARDINSERT) {
			System.out.println("Please insert your bank card first");
		}else if(state == NOPASSWORD) {
			System.out.println("Please enter your password：");
			String password = enterPwd();
			if(Integer.parseInt(password) == yourBankPassword) {
				System.out.println("Identity success！");
				state = IDENTITYSUCCESS;
			}else {
				System.out.println("Password invalid！");
				state = PASSWORDINVALID;
				this.enterPassword();
			}
		}else if(state == PASSWORDINVALID) {
			System.out.println("Please reenter your password：");
			String password = enterPwd();
			if(Integer.parseInt(password) == yourBankPassword) {
				System.out.println("Identity success！");
				state = IDENTITYSUCCESS;
			}else {
				System.out.println("Sorry! please reinsert the card");
				state = NOCARDINSERT;
			}
		}else if(state == IDENTITYSUCCESS) {
			System.out.println("There is no need to enter the password again");
		}
	}
	
	public void drawMoney() {
		if(state == NOCARDINSERT) {
			System.out.println("Please insert your bank card first");
		}else if(state == NOPASSWORD) {
			System.out.println("Please enter your password first");
		}else if(state == PASSWORDINVALID) {
			System.out.println("Please enter your password first");
		}else if(state == IDENTITYSUCCESS) {
			System.out.println("Withdraw money");
		}
	}
	
	public void returnCard() {
		if(state == NOCARDINSERT) {
			System.out.println("No card insert");
		}else if(state == NOPASSWORD) {
			System.out.println("Return the Card");
			state = NOCARDINSERT;
		}else if(state == PASSWORDINVALID) {
			System.out.println("Return the Card");
			state = NOCARDINSERT;
		}else if(state == IDENTITYSUCCESS) {
			System.out.println("Return the Card");
			state = NOCARDINSERT;
		}
	}
	
	public String enterPwd() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
}
