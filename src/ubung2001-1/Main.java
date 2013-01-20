package malc;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		int [] ar = {4,1,2};
		int b = ar[ar.length-1];
        System.arraycopy(ar, 0, ar, 1, ar.length-1);
        ar[0] = b;
		System.out.println(Arrays.toString(ar));
		
		
		
		for(int i =0, rechts = ar.length-1; i<rechts; i++, rechts--){
			System.out.println(" dsfkjh");
		}
		
		
		try {
		int [] ard ={1,2,3};
		for (int i =2; i<ard.length; i--){
			System.out.println(ard[i]);
			
		}
		}catch(ArrayIndexOutOfBoundsException g ){
		
			System.out.println(g.getMessage());
			System.out.println(g.toString());
		//break;
			System.out.println("fegler");
		}catch(Exception g){
			System.out.println(g.getMessage());
			System.out.println(g.toString());
			System.out.println("anderee fehler");
		}
		
		
		
		
//		int [] rea ={1,2,3};
//		for (int i =2; i>=0; i--){
//			System.out.println(rea[i]);
//			
//		}
		
		
		
		
		
		
		
//		 String[] pro = {
//				  "java.version", "java.vm.version", "java.runtime.version"
//				  };
//
//				  Properties properties = System.getProperties();
//				  for (int i = 0; i < pro.length; i++) {
//				  System.out.print(pro[i]+"\t\t: ");
//				  System.out.println(properties.getProperty(pro[i]));
//				  }
				  
		
		
		
		
	}

}
