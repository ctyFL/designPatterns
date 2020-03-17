package test;

import context.ATMmachine;

public class ATMtest {

	public static void main(String[] args) {
		ATMmachine machine = new ATMmachine();
//		machine.drawMoney();
//		machine.enterPassword();
//		machine.returnCard();
//		machine.insertCard();
//		
//		machine.drawMoney();
//		machine.returnCard();
//		machine.enterPassword();
//		
		machine.insertCard();
		machine.enterPassword();
		machine.drawMoney();
		machine.returnCard();
		machine.drawMoney();
	}

}
