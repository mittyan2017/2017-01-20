package ICCharger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

//�`���[�W�@�N���X
public class ShopCharger {
	private StudentCard insertedStudentCard;//�}�����ꂽ�J�[�h
	
	private static Calendar calendar=Calendar.getInstance();//�J�����_�[
	private static ArrayList<HashMap<String,Integer>> chargeData=new ArrayList<HashMap<String,Integer>>();//�`���[�W����
	
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

			HashMap<String,Integer> data=new HashMap<String,Integer>();
			data.put("�N", calendar.get(Calendar.YEAR));
			data.put("��", calendar.get(Calendar.MONTH));
			data.put("��", calendar.get(Calendar.DATE));
			data.put("��", calendar.get(Calendar.HOUR_OF_DAY));
			data.put("��", calendar.get(Calendar.MINUTE));
			data.put("�b", calendar.get(Calendar.SECOND));
			data.put("�w���ԍ�", insertedStudentCard.get_studentNum());
			data.put("���o��", _moneyNum);
			data.put("�c��", insertedStudentCard.get_money());
			chargeData.add(data);
			
			if(chargeData.size()==6){//�ł��Â��L�^���폜
				chargeData.remove(0);
			}
			
		}
	}
	
	static void printChargeMemory(){//�`���[�W������\��
		for(HashMap<String,Integer> list:chargeData){
			System.out.println(list.get("�N")+"�N"+list.get("��")+"��"+list.get("��")+"��"+list.get("��")+"��"+list.get("��")+"��"+list.get("�b")+"�b");
			System.out.println("���p�Ҕԍ��F"+list.get("�w���ԍ�")+"�@�����z�F"+list.get("���o��")+"�@�c���F"+list.get("�c��"));
		}
	}
	
	void printAccountBalance(){
		if(insertedStudentCard!=null){
			System.out.println("Name:"+insertedStudentCard.get_studentName() + "�@�c��:"+insertedStudentCard.get_money());
		}
	}
}
