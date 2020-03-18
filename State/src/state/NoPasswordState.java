package state;

import context.ATMmachine;

public class NoPasswordState implements State {
	
	ATMmachine machine;
	
	public NoPasswordState(ATMmachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("Only one card can be inserted at a time");
	}

	@Override
	public void enterPassword() {
		System.out.println("Please enter your password：");
		String password = machine.enterPwd();
		if(Integer.parseInt(password) == machine.getYourBankPassword()) {
			System.out.println("Identity success！");
			machine.setState(machine.getIdentitySuccess());
		}else {
			System.out.println("Password invalid！");
			machine.setState(machine.getPasswordInvalid());
			machine.enterPassword();
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
