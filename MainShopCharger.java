package ICCharger;

public class MainShopCharger {
	public static void main(String[] args) {
		ShopCharger ShopCharger1=new ShopCharger();
		StudentCard StudentCard1=new StudentCard();
		StudentCard StudentCard2=new StudentCard();

		ShopCharger1.insertStudentCard(StudentCard1);
		ShopCharger1.chargeMoney(100);
		ShopCharger1.printAccountBalance();
		
		ShopCharger1.insertStudentCard(StudentCard2);
		ShopCharger1.chargeMoney(200);
		ShopCharger1.printAccountBalance();
		
	}

}
