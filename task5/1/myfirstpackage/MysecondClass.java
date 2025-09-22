package myfirstpackage;
public class MysecondClass {
	private int a,b;

	public MysecondClass(int a,int b)
	{
		this.a = a;
		this.b = b;
	}

	public int getA()
	{
		return a;
	}


	public int getB()
	{
		return b;
	}


	public void setnumbera(int a)
	{
		this.a = a;
	}


	public void setnumberb(int b)
	{
		this.b = b;
	}

	public int multiply()
	{
		return a*b;
	}
}