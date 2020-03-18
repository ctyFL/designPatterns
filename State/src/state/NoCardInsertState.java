package state;

import context.ATMmachine;

public class NoCardInsertState implements State {

	ATMmachine machine;
	
	public NoCardInsertState(ATMmachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("Insert your bank card");
		machine.setState(machine.getNoPassword());
	}
	
	@Override
	public void enterPassword() {
		System.out.println("Please insert your bank card first");
	}

	@Override
	public void drawMoney() {
		System.out.println("Please insert your bank card first");
	}

	@Override
	public void returnCard() {
		System.out.println("No card insert");
	}
	
}
