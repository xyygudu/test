package car;
import java.lang.String;
import java.util.*;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(1);
		Integer integer =new Integer (10);
		list.add(integer);
		
		//待测试integer是引用的list的地址还是将list中的对象拷贝到integer中
		integer = list.get(0);
		//先输出integer的值
		System.out.println(integer);//结果输出10
		
		//试图改变list集合中的第一个地址的值，观察integer是否会一起改变
		list.remove(0);
		list.add(new Integer(4));//将原来的10改为了现在的4
		//打印list.get(0)的值和integer的值做比较
		System.out.println(list.get(0));//输出4
		System.out.println(integer);//输出10
		//由此可见，改变list地址的值并没有改变integer的值，所以这是个拷贝过程
		//发过来测试结果一样，即先改变integer的值，发现list.get(0)并未发生改变
		//即证：list是通过拷贝的方式付给integer
		int cnt=integer.intValue();//这也是个拷贝过程
	}

}
