package state;

import context.ATMmachine;

public class IdentitySuccessState implements State {

	ATMmachine machine;
	
	public IdentitySuccessState(ATMmachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("Only one card can be inserted at a time");
	}

	@Override
	public void enterPassword() {
		System.out.println("There is no need to enter the password again");
	}
	
	@Override
	public void drawMoney() {
		System.out.println("Withdraw money");
	}

	@Override
	public void returnCard() {
		System.out.println("Return the Card");
		machine.setState(machine.getNoCardInsert());
	}
	
}
