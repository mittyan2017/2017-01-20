package ICCharger;

//ShopChargerクラスを作って動作させる
public class MainShopCharger {
	public static void main(String[] args) {
		ShopCharger ShopCharger1=new ShopCharger();//チャージャークラス
		StudentCard StudentCard1=new StudentCard();//カードクラス１
		StudentCard StudentCard2=new StudentCard();//カードクラス２

		ShopCharger1.insertStudentCard(StudentCard1);//挿入
		ShopCharger1.chargeMoney(100);//残高を出し入れする　＋で入金　－で引き出し
		ShopCharger1.printAccountBalance();//学生名と残高を表示
		ShopCharger1.chargeMoney(-500);//残高引き出し
		
		ShopCharger1.insertStudentCard(StudentCard2);
		ShopCharger1.chargeMoney(200);
		ShopCharger1.printAccountBalance();
		
	}

}
