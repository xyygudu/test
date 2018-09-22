package Car;
import java.lang.String;
import java.util.*;

public class Car {
	private String name;//车名
	private int volume;//容量
	private float consumption;//耗油量
	
	
	public Car(String na,int vol,float cons) {
		name=na;volume=vol;consumption=cons;
		
	}
	
	
	public void carInfo() {
		System.out.println(name+"的基本信息如下：");
		System.out.println("容量："+volume);
		System.out.println("耗油量："+consumption);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入汽车相关属性");
		System.out.println("车名	 容量 耗油量");
		Scanner in=new Scanner(System.in);
		String name=in.next();//车名
		int volume=in.nextInt();//容量
		float consumption=in.nextFloat();//耗油量
		
		Car car=new Car(name,volume,consumption);
	
		car.carInfo();

	}

}
