# test
java作业

定义如下数组
int arry[]= {2,3};
System.out.println(arry[2]);
数组越界会出现异常
java.lang.ArrayIndexOutOfBoundsException: 2
	at test1/test1.test.main(test.java:30)

关于打印地址的问题
	public static void main(String[] args) {
		int beerNum=4,a=1;
		System.out.println("a的地址"+System.identityHashCode(a));
		int b=a;
		System.out.println("a的地址"+System.identityHashCode(a));
		System.out.println("b的地址"+System.identityHashCode(b));
		b=3;
		System.out.println("a的地址"+System.identityHashCode(a));
		System.out.println("b的地址"+System.identityHashCode(b));
	}
 输出结果为：
 a的地址1908316405
a的地址1908316405
b的地址1908316405
a的地址1908316405
b的地址1873653341
可见，当b改变时，并不会影响a的值
如果讲地18行的b=3改为a=3，输出结果如下：
a的地址1908316405
a的地址1908316405
b的地址1908316405
a的地址1873653341
b的地址1908316405
可见，当a的值付给b后，改变a的值并不会影响a的地址

注意：这里的identityHashCode函数并不是正真的内存地址，在java中无法打印对象实际地址
