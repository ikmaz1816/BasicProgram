package basicprogram;

public class Functions {
	//Function with no arguments and no return type
	public static void disp()
	{
		System.out.println("Hello");
	}
	public static int add()
	{
		return 2+3;
	}
	public static void add1(int n,int m)
	{
		System.out.println(n+m);
	}
	public static int add2(int n,int m)
	{
		return n+m;
	}
	public static void main(String[] args) {
		disp();
		System.out.println(add());
		int n=5;
		int m=3;
		add1(n,m);
		System.out.println(add2(n,m));
		}
	}


