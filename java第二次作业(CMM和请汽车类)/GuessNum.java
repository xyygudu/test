package guessnum;
import java.util.*;
import java.lang.String;
import java.util.Random;

public class GuessNum {
	public int scoreNum;//�÷�
	Scanner in;
	
	public GuessNum() {
		scoreNum=10;
		in=new Scanner(System.in);
	}
	
	public int inputNum() {
		return in.nextInt();
	}
	
	public boolean isTrue(int randnum,int num) {
		if(randnum==num) {
			return true;
		}else {
			scoreNum--;//�û��÷ּ�һ
			return false;
		}
	}
	public int RandomNum() {
		System.out.println("������Ѿ�����,�������0-10��������10��������");
		Random rand=new Random();
		
		return rand.nextInt(10);//�������0-10��������10��������
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randNum,num;
		GuessNum guessnum=new GuessNum();
		while(true) {
			//���������
			randNum=guessnum.RandomNum();	
			System.out.println("��������µ�����(��ֻ����λ���)");
			for(int i=5;i>0;i--) {
				num=guessnum.inputNum();
				if(guessnum.isTrue(randNum, num)) {
					System.out.println("��¶���,��ĵ÷��ǣ�"+guessnum.scoreNum);
					break;
				}else {
					if(i-1!=0)
						System.out.println("��´���,�㻹��"+(i-1)+"�λ���");
						//guessnum.scoreNum--;//�û��÷ּ�һ
					else {
						System.out.println("��´���,���Ѿ�û�л���");
						System.out.println("���յ÷֣�"+guessnum.scoreNum);
						System.out.println("�����Ϊ��"+randNum);
					}
						
				}
			}
			System.out.println("��Ϸ����������1�������棬����0���˳�");
			if(guessnum.inputNum()==0)
				break;
			else
				guessnum.scoreNum=10;//���÷���Ϊ10
			
		}
		
	}

}
