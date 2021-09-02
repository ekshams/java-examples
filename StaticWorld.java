public class StaticWorld{
	static int counter = 0;
	int a;
	StaticWorld(){
		counter++;
	}
	static{
	counter = 99;
	}
	public static void main(String... args){	
		System.out.println("it's working");
		Test test = new Test();
		System.out.println("counter="+counter);
		System.out.println("val="+test.getVal());
		getCounter();
	}
	public static int getCounter(){
		Test tt = new Test();		
		System.out.println("getCounter()="+tt.getVal());
		return counter;
	}
}

class Test{
	static int val=0;
	public int getVal(){
	  int tt=1000;
		return tt;
	}
}
