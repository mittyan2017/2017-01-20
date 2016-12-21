package ICCharger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

//チャージ機クラス
public class ShopCharger {
	StudentCard insertedStudentCard;//挿入されたカード
	
	static Calendar calendae=Calendar.getInstance();//カレンダー
	static ArrayList<HashMap<String,Integer>> chargeData=new ArrayList<HashMap<String,Integer>>();//チャージ履歴
	
	void insertStudentCard(StudentCard _Card){//カードを挿入する
		insertedStudentCard=_Card;
	}
	void putOutStidentCard(){//カードを排出する
		insertedStudentCard=null;
	}
	
	void chargeMoney(int _moneyNum){//チャージする・引き出す
		if(insertedStudentCard==null){
			System.out.println("学生証が挿入されていません");
		}
		else if(insertedStudentCard.get_money()+_moneyNum<0){
			System.out.println("残高が不足しています。　残高："+insertedStudentCard.get_money());
		}
		else {
			insertedStudentCard.set_money(insertedStudentCard.get_money()+_moneyNum);
		}
	}
	
	void printAccountBalance(){
		if(insertedStudentCard!=null){
			System.out.println("Name:"+insertedStudentCard.get_studentName() + "　残高:"+insertedStudentCard.get_money());
		}
	}
}
