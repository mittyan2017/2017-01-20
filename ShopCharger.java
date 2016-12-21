package ICCharger;

public class ShopCharger {
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
}
