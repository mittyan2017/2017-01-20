package ICCharger;
import java.util.ArrayList;

//�w���؃N���X
public class StudentCard {
	private String studentName;//�w����
	private int studentNum;//�w���ԍ�
	private int accountBalance;//�`���[�W�c��
	static private ArrayList<StudentCard> studentCardList_=new ArrayList<StudentCard>();//�w���؂̃��X�g
	
	//�R���X�g���N�^
	StudentCard(){
		studentCardList_.add(this);//���X�g�Ɋw���؂�ǉ�
	}
	StudentCard(String _name,int _num,int _money){
		studentName=_name;
		studentNum=_num;
		accountBalance=_money;//�e�ϐ�����
		studentCardList_.add(this);
	}
	
	
	
	//�Z�b�^�[�E�Q�b�^�[
	String getStudentName(){//�w������Ԃ�
		return studentName;
	}
	void setStudentName(String _str){//�w�������Z�b�g
		studentName=_str;
	}
	
	//�w���ԍ���Ԃ�
	int getStudentNum(){//�w���ԍ���Ԃ�
		return studentNum;
	}
	//�w���ԍ����Z�b�g
	void setStudentNum(int _num){//�w���ԍ����Z�b�g
		studentNum=_num;
	}
	
	int getMoney(){//�`���[�W�c����Ԃ�
		return accountBalance;
	}
	void setMoney(int _money){//�`���[�W�c�����Z�b�g
		accountBalance=_money;
	}
	
	static ArrayList<StudentCard> getStudentCardList(){
		return studentCardList_;
	}
}
