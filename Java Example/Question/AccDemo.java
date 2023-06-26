public class AccDemo{
	int a;
	AccDemo(){
		a=9000;
	}
	public static void main(String[] args){
		AccDemo d1 = new AccDemo();
		AccDemo d2 = new AccDemo();

		System.out.println(d1.a);
		System.out.println(d2.a);
		
	}
}