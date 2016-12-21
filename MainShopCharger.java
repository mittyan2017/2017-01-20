package ICCharger;

//ShopChargerクラスを作って動作させる
public class MainShopCharger {
	public static void main(String[] args) {
		ShopCharger ShopCharger1=new ShopCharger();//チャージャークラス
		StudentCard StudentCard1=new StudentCard("太郎",123456,0);//カードクラス１
		//StudentCard StudentCard2=new StudentCard();//カードクラス２

		ShopCharger1.insertStudentCard(StudentCard1);//挿入
		ShopCharger1.chargeMoney(100);//残高を出し入れする　＋で入金　－で引き出し
		ShopCharger1.chargeMoney(200);//残高を出し入れする　＋で入金　－で引き出し
		ShopCharger1.chargeMoney(300);//残高を出し入れする　＋で入金　－で引き出し
		ShopCharger1.chargeMoney(400);//残高を出し入れする　＋で入金　－で引き出し
		ShopCharger1.chargeMoney(500);//残高を出し入れする　＋で入金　－で引き出し
		ShopCharger1.chargeMoney(600);//残高を出し入れする　＋で入金　－で引き出し
		ShopCharger1.printAccountBalance();//学生名と残高を表示
		//ShopCharger1.chargeMoney(-500);//残高引き出し
		ShopCharger1.putOutStidentCard();//学生証を排出
		
		//ShopCharger1.insertStudentCard(StudentCard2);
		//ShopCharger1.chargeMoney(200);
		//ShopCharger1.printAccountBalance();
		
		//System.out.println("発行学生証枚数："+ StudentCard.getStudentCardList().size());

		ShopCharger.printChargeMemory();//履歴表示
	}

}
