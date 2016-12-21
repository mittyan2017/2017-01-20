package ICCharger;
import java.util.ArrayList;

//学生証クラス
public class StudentCard {
	private String studentName;//学生名
	private int studentNum;//学生番号
	private int accountBalance;//チャージ残高
	static private ArrayList<StudentCard> studentCardList_=new ArrayList<StudentCard>();//学生証のリスト
	
	//コンストラクタ
	StudentCard(){
		studentCardList_.add(this);//リストに学生証を追加
	}
	StudentCard(String _name,int _num,int _money){
		studentName=_name;
		studentNum=_num;
		accountBalance=_money;//各変数入力
		studentCardList_.add(this);
	}
	
	
	
	//セッター・ゲッター
	String get_studentName(){//学生名を返す
		return studentName;
	}
	void set_studentName(String _str){//学生名をセット
		studentName=_str;
	}
	
	//学生番号を返す
	int get_studentNum(){//学生番号を返す
		return studentNum;
	}
	//学生番号をセット
	void set_studentNum(int _num){//学生番号をセット
		studentNum=_num;
	}
	
	int get_money(){//チャージ残高を返す
		return accountBalance;
	}
	void set_money(int _money){//チャージ残高をセット
		accountBalance=_money;
	}
	
	static ArrayList<StudentCard> get_studentCardList(){
		return studentCardList_;
	}
}
