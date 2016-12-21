package ICCharger;

public class ShopCharger {
	StudentCard insertedStudentCard;
	
	void insertStudentCard(StudentCard _Card){
		insertedStudentCard=_Card;
	}
	
	void chargeMoney(int _moneyNum){//チャージする
		if(insertedStudentCard==null){
			System.out.println("学生証が挿入されていません");
		}
		if(insertedStudentCard.get_money()+_moneyNum<0){
			System.out.println("残高が不足しています。　残高："+insertedStudentCard.get_money());
		}
		else {
			insertedStudentCard.set_money(insertedStudentCard.get_money()+_moneyNum);
		}
	}
	
	void printAccountBalance(){
		System.out.println("Name:"+insertedStudentCard.get_studentName() + "　残高:"+insertedStudentCard.get_money());
	}
}
