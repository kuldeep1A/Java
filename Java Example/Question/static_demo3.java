class  static_demo3 
{
	static int a=2000;

	static { a=a+8000; }
	public static void main(String[] args)
	{
		a=a+2000;
		System.out.println(a);
	}
	static{ a=a*10;	}
}
