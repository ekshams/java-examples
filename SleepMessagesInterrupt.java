public class SleepMessagesInterrupt{
	public static void main(String args[]){
		String messages []={
		"Message-1", 
		"Message-2", 
		"Message-3"
		};
		for(int i=0; i<messages.length;i++){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("Exception:"+ e);				
			}
			
			System.out.println(messages[i]);			
		}		
	}
}
