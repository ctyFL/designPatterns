package state;

import context.ATMmachine;

public class PasswordInvalidState implements State {

	ATMmachine machine;
	
	public PasswordInvalidState(ATMmachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("Only one card can be inserted at a time");
	}

	@Override
	public void enterPassword() {
		System.out.println("Please reenter your password：");
		String password = machine.enterPwd();
		if(Integer.parseInt(password) == machine.getYourBankPassword()) {
			System.out.println("Identity success！");
			machine.setState(machine.getIdentitySuccess());
		}else {
			System.out.println("Sorry! please reinsert the card");
			machine.setState(machine.getNoCardInsert());
		}
	}

	@Override
	public void drawMoney() {
		System.out.println("Please enter your password first");
	}

	@Override
	public void returnCard() {
		System.out.println("Return the Card");
		machine.setState(machine.getNoCardInsert());
	}
	
}
