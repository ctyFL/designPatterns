package context;

import java.util.Scanner;

import state.IdentitySuccessState;
import state.NoCardInsertState;
import state.NoPasswordState;
import state.PasswordInvalidState;
import state.State;

public class ATMmachine {
	
	private State noCardInsert;
	private State noPassword;
	private State passwordInvalid;
	private State identitySuccess;
	
	private State state;
	private int yourBankPassword = 123456;
	
	public ATMmachine() {
		noCardInsert = new NoCardInsertState(this);
		noPassword = new NoPasswordState(this);
		passwordInvalid = new PasswordInvalidState(this);
		identitySuccess = new IdentitySuccessState(this);
		state = noCardInsert;
	}
	
	public void insertCard() {
		state.insertCard();
	}
	
	public void enterPassword() {
		state.enterPassword();
	}
	
	public void drawMoney() {
		state.drawMoney();
	}
	
	public void returnCard() {
		state.returnCard();
	}
	
	public String enterPwd() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	public State getNoCardInsert() {
		return noCardInsert;
	}

	public State getNoPassword() {
		return noPassword;
	}

	public State getPasswordInvalid() {
		return passwordInvalid;
	}

	public State getIdentitySuccess() {
		return identitySuccess;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getYourBankPassword() {
		return yourBankPassword;
	}

}
