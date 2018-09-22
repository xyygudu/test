package guessnum;
import java.util.*;
import java.lang.String;
import java.util.Random;

public class GuessNum {
	public int scoreNum;//得分
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
			scoreNum--;//用户得分减一
			return false;
		}
	}
	public int RandomNum() {
		System.out.println("随机数已经生成,随机数在0-10（不包括10）的整数");
		Random rand=new Random();
		
		return rand.nextInt(10);//随机数在0-10（不包括10）的整数
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randNum,num;
		GuessNum guessnum=new GuessNum();
		while(true) {
			//生成随机数
			randNum=guessnum.RandomNum();	
			System.out.println("请输入你猜的数字(你只有五次机会)");
			for(int i=5;i>0;i--) {
				num=guessnum.inputNum();
				if(guessnum.isTrue(randNum, num)) {
					System.out.println("你猜对了,你的得分是："+guessnum.scoreNum);
					break;
				}else {
					if(i-1!=0)
						System.out.println("你猜错了,你还有"+(i-1)+"次机会");
						//guessnum.scoreNum--;//用户得分减一
					else {
						System.out.println("你猜错了,你已经没有机会");
						System.out.println("最终得分："+guessnum.scoreNum);
						System.out.println("随机数为："+randNum);
					}
						
				}
			}
			System.out.println("游戏结束，按“1”，重玩，按“0”退出");
			if(guessnum.inputNum()==0)
				break;
			else
				guessnum.scoreNum=10;//重置分数为10
			
		}
		
	}

}
