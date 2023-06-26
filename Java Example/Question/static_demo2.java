class static_demo2 
{
	static int a;
	public static void main(String[] args) 
	{
		static_demo2 d1=new static_demo2();
		static_demo2 d2=new static_demo2();
		static_demo2 d3=new static_demo2();
			
		d1.a=9000;
		d2.a=12000;
		d3.a=15000;
		System.out.println(d1.a);
		System.out.println(d2.a);
		System.out.println(d3.a);
	}
}
 
