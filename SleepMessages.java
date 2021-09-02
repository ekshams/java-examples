public class SleepMessages{
	public static void main(String args[])throws InterruptedException{
		String messages []={
		"Message-1", 
		"Message-2", 
		"Message-3"
		};
		for(int i=0; i<messages.length;i++){
			Thread.sleep(1000);
			System.out.format("%s\n", messages[i]);
			//System.out.println(messages[i]);			
		}		
	}
}
