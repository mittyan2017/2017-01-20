package ICCharger;

public class ShopCharger {
	static StudentCard insertedStudentCard;
	
	static void insertStudentCard(StudentCard _Card){
		insertedStudentCard=_Card;
	}
	
	static void chargeMoney(int _moneyNum){//�`���[�W����
		if(insertedStudentCard!=null){
			insertedStudentCard.set_money(insertedStudentCard.get_money()+_moneyNum);
		}
		else {
			System.out.println("�w���؂��}������Ă��܂���");
		}
	}
	
	static void printAccountBalance(){
		System.out.println("Name:"+insertedStudentCard.get_studentName() + "�c��:"+insertedStudentCard.get_money());
	}
}
