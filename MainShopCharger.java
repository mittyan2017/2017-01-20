package ICCharger;

public class MainShopCharger {
	StudentCard insertedStudentCard;
	
	void insertStudentCard(StudentCard _Card){
		insertedStudentCard=_Card;
	}
	
	void chargeMoney(int _moneyNum){//チャージする
		if(insertedStudentCard!=null){
			insertedStudentCard.set_money(insertedStudentCard.get_money()+_moneyNum);
			printAccountBalance();
		}
	}
	
	void printAccountBalance(){
		System.out.println("Name:"+insertedStudentCard.get_studentName() + "残高:"+insertedStudentCard.get_money());
	}
	public static void main(String[] args) {
		
		
		System.out.println("test");
		
	}

}
