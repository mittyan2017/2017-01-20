package ICCharger;

public class ShopCharger {
	StudentCard insertedStudentCard;
	
	void insertStudentCard(StudentCard _Card){
		insertedStudentCard=_Card;
	}
	
	void chargeMoney(int _moneyNum){//�`���[�W����
		if(insertedStudentCard==null){
			System.out.println("�w���؂��}������Ă��܂���");
		}
		if(insertedStudentCard.get_money()+_moneyNum<0){
			System.out.println("�c�����s�����Ă��܂��B�@�c���F"+insertedStudentCard.get_money());
		}
		else {
			insertedStudentCard.set_money(insertedStudentCard.get_money()+_moneyNum);
		}
	}
	
	void printAccountBalance(){
		System.out.println("Name:"+insertedStudentCard.get_studentName() + "�@�c��:"+insertedStudentCard.get_money());
	}
}
