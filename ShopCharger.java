package ICCharger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

//�`���[�W�@�N���X
public class ShopCharger {
	StudentCard insertedStudentCard;//�}�����ꂽ�J�[�h
	
	static Calendar calendae=Calendar.getInstance();//�J�����_�[
	static ArrayList<HashMap<String,Integer>> chargeData=new ArrayList<HashMap<String,Integer>>();//�`���[�W����
	
	void insertStudentCard(StudentCard _Card){//�J�[�h��}������
		insertedStudentCard=_Card;
	}
	void putOutStidentCard(){//�J�[�h��r�o����
		insertedStudentCard=null;
	}
	
	void chargeMoney(int _moneyNum){//�`���[�W����E�����o��
		if(insertedStudentCard==null){
			System.out.println("�w���؂��}������Ă��܂���");
		}
		else if(insertedStudentCard.get_money()+_moneyNum<0){
			System.out.println("�c�����s�����Ă��܂��B�@�c���F"+insertedStudentCard.get_money());
		}
		else {
			insertedStudentCard.set_money(insertedStudentCard.get_money()+_moneyNum);
		}
	}
	
	void printAccountBalance(){
		if(insertedStudentCard!=null){
			System.out.println("Name:"+insertedStudentCard.get_studentName() + "�@�c��:"+insertedStudentCard.get_money());
		}
	}
}
