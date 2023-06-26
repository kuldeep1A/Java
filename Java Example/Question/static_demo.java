class static_demo 
{
	int a;
	public static void main(String[] args) 
	{
		static_demo d1=new static_demo();
		static_demo d2=new static_demo();
		static_demo d3=new static_demo();
			
		d1.a=9000;
		d2.a=12000;
		d3.a=15000;
		System.out.println(d1.a);
		System.out.println(d2.a);
		System.out.println(d3.a);
	}
}
