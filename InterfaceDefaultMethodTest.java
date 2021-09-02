interface Area{
	void calculate();
	default void sqrt(int n){
		System.out.println(Math.sqrt(n));

	}
}

public class InterfaceDefaultMethodTest{
	public static void main(String[] args){
		System.out.println("It's working");
		Area area = new Area(){
			@Override
			public void calculate(){
				System.out.println("calculate method..");		
			}
		};
		
		area.calculate();
		
	}
	
	
	
	/*public void calculate(){		
		System.out.println("calculate method..");
		sqrt(49);
	}*/
}
