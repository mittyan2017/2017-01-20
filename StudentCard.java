package ICCharger;
import java.util.ArrayList;

public class StudentCard {
	private String studentName;
	private int studentNum;
	private int accountBalance;//‹à
	private ArrayList<StudentCard> studentCardList_=new ArrayList<StudentCard>();
	
	StudentCard(){
		studentCardList_.add(this);
	}
	
	int get_money(){
		return accountBalance;
	}
	void set_money(int _money){
		accountBalance=_money;
	}
	
	String get_studentName(){
		return studentName;
	}
	
}
