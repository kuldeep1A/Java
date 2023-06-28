interface ABC{
	void m1();
	int x=9000;
}

class InterfaceDemo implements ABC{
	public void m1(){		// use public
		System.out.println("Hinata");
		System.out.println(x);
	}
	public static void main(String[] args){
		InterfaceDemo d1= new InterfaceDemo();
		d1.m1();
		
	}
}


/* Methods are by default public in interface, if we try to implement an interface then we should decleare them public.*/