package ICCharger;

public class MainShopCharger {
	static StudentCard insertedStudentCard;
	
	static void insertStudentCard(StudentCard _Card){
		insertedStudentCard=_Card;
	}
	
	static void chargeMoney(int _moneyNum){//チャージする
		if(insertedStudentCard!=null){
			insertedStudentCard.set_money(insertedStudentCard.get_money()+_moneyNum);
		}
		else {
			System.out.println("学生証が挿入されていません");
		}
	}
	
	static void printAccountBalance(){
		System.out.println("Name:"+insertedStudentCard.get_studentName() + "残高:"+insertedStudentCard.get_money());
	}
	public static void main(String[] args) {
		StudentCard StudentCard1=new StudentCard();
		StudentCard StudentCard2=new StudentCard();

		insertStudentCard(StudentCard1);
		chargeMoney(100);
		printAccountBalance();
		
		insertStudentCard(StudentCard2);
		chargeMoney(200);
		printAccountBalance();
		
	}

}
