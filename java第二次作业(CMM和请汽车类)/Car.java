package Car;
import java.lang.String;
import java.util.*;

public class Car {
	private String name;//����
	private int volume;//����
	private float consumption;//������
	
	
	public Car(String na,int vol,float cons) {
		name=na;volume=vol;consumption=cons;
		
	}
	
	
	public void carInfo() {
		System.out.println(name+"�Ļ�����Ϣ���£�");
		System.out.println("������"+volume);
		System.out.println("��������"+consumption);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����������������");
		System.out.println("����	 ���� ������");
		Scanner in=new Scanner(System.in);
		String name=in.next();//����
		int volume=in.nextInt();//����
		float consumption=in.nextFloat();//������
		
		Car car=new Car(name,volume,consumption);
	
		car.carInfo();

	}

}
