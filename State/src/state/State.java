package state;

public interface State {
	/**
	 * 插入银行卡
	 */
	void insertCard();
	
	/**
	 * 输入密码
	 */
	void enterPassword();
	
	/*
	 * 取款
	 */
	void drawMoney();
	
	/**
	 * 退卡
	 */
	void returnCard();

}
