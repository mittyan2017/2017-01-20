package ICCharger;

//ShopCharger�N���X������ē��삳����
public class MainShopCharger {
	public static void main(String[] args) {
		ShopCharger ShopCharger1=new ShopCharger();//�`���[�W���[�N���X
		StudentCard StudentCard1=new StudentCard();//�J�[�h�N���X�P
		StudentCard StudentCard2=new StudentCard();//�J�[�h�N���X�Q

		ShopCharger1.insertStudentCard(StudentCard1);//�}��
		ShopCharger1.chargeMoney(100);//�c�����o�����ꂷ��@�{�œ����@�|�ň����o��
		ShopCharger1.printAccountBalance();//�w�����Ǝc����\��
		ShopCharger1.chargeMoney(-500);//�c�������o��
		
		ShopCharger1.insertStudentCard(StudentCard2);
		ShopCharger1.chargeMoney(200);
		ShopCharger1.printAccountBalance();
		
	}

}
