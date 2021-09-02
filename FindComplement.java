import java.util.Arrays;
public class FindComplement{
	public static void main(String... args){
		System.out.println("It's working");
		int[] globalSet = {1,2,3,4,5,8,29};
		int[] setA = {3,4,5,29};
		int[] complementOfA;
		System.out.println("nums:"+ Arrays.toString(globalSet));
		
		for(int i=0; i<globalSet.length; i++){
			int flag=0;
			for(int j=0; j<setA.length; j++){
				if(globalSet[i] == setA[j]){
					flag=1;
				}
			}
			if(flag==0){
				System.out.println(globalSet[i]);
			}
				
		}		
	}
}
