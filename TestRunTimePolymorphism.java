import static java.lang.System.out;
public class TestRunTimePolymorphism{
	public static void main(String[] args){
		out.println("it's working..");
		SBI sbi = new SBI();
		Bank hdfc = new HDFC();
		out.println("SBI interest rate="+sbi.getInterestRate());
		out.println("SBI test rate="+sbi.test);
		out.println("HDFC interest rate="+hdfc.getInterestRate());
	}	
}

class Bank{
	float getInterestRate(){
		return 0;
	}
}

class SBI extends Bank{
	public int test;
	SBI(){
		test=100;
	}
	float getInterestRate(){
		return 8.5f;
	}

}

class HDFC extends Bank{
	float getInterestRate(){
		return 9.5f;
	}
}
