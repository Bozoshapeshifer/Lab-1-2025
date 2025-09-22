import myfirstpackage.*;
class MyFirstClass {
	public static void main(String[] s) {
		MysecondClass qwerty = new MysecondClass(0,0);
		int i,j;
		for(i=1;i<=8;i++) {
			for(j=1;j<=8;j++) {
				qwerty.setnumbera(i);
				qwerty.setnumberb(j);
				System.out.print(qwerty.multiply()+"\t");
				
			}
			System.out.println();
		}

	}
}