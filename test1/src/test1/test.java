package test1;

public class test {
	public static void story(int beerNum) {
		for(int i=beerNum;i>=0;i--) {
			if(i>=3) {
				System.out.println(i+" bottles of beer on the wall"+"\n"
						+ "take one down"+"\n"
						+ "pass it around"+"\n"
						+ (i-1)+" bottles of beer on the wall");
			}else {
				if(i==2)
					System.out.println(i+" bottles of beer on the wall"+"\n"
							+ "take one down"+"\n"
							+ (i-1)+" bottle of beer on the wall");
				if(i==1)
					System.out.println(i+" bottle of beer on the wall"+"\n"
							+ "take one down"+"\n"
							+ (i-1)+" bottle of beer on the wall");
			}
		}
	}

	static int arry[]= {2,3};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int beerNum=99;
		story(beerNum);
		//System.out.println(arry[2]);
	}

}
