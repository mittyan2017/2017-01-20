package ICCharger;

public class StudentCard {
	private String studentName;
	private int studentNum;
	private int accountBalance;//‹à
	
	
	int get_money(){
		return accountBalance;
	}
	void set_money(int _money){
		accountBalance=_money;
	}
}
