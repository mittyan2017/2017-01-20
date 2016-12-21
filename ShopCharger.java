package ICCharger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

//チャージ機クラス
public class ShopCharger {
	private StudentCard insertedStudentCard;//挿入されたカード
	
	private static Calendar calendar=Calendar.getInstance();//カレンダー
	private static ArrayList<HashMap<String,Integer>> chargeData=new ArrayList<HashMap<String,Integer>>();//チャージ履歴
	
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

			HashMap<String,Integer> data=new HashMap<String,Integer>();
			data.put("年", calendar.get(Calendar.YEAR));
			data.put("月", calendar.get(Calendar.MONTH));
			data.put("日", calendar.get(Calendar.DATE));
			data.put("時", calendar.get(Calendar.HOUR_OF_DAY));
			data.put("分", calendar.get(Calendar.MINUTE));
			data.put("秒", calendar.get(Calendar.SECOND));
			data.put("学生番号", insertedStudentCard.get_studentNum());
			data.put("入出金", _moneyNum);
			data.put("残高", insertedStudentCard.get_money());
			chargeData.add(data);
			
			if(chargeData.size()==6){//最も古い記録を削除
				chargeData.remove(0);
			}
			
		}
	}
	
	static void printChargeMemory(){//チャージ履歴を表示
		for(HashMap<String,Integer> list:chargeData){
			System.out.println(list.get("年")+"年"+list.get("月")+"月"+list.get("日")+"日"+list.get("時")+"時"+list.get("分")+"分"+list.get("秒")+"秒");
			System.out.println("利用者番号："+list.get("学生番号")+"　入金額："+list.get("入出金")+"　残高："+list.get("残高"));
		}
	}
	
	void printAccountBalance(){
		if(insertedStudentCard!=null){
			System.out.println("Name:"+insertedStudentCard.get_studentName() + "　残高:"+insertedStudentCard.get_money());
		}
	}
}
