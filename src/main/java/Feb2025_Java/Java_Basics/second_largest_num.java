 package Feb2025_Java.Java_Basics;

public class second_largest_num {

	public static void main(String[] args) {
		int ary [] = {1,2,3,4,5,6};
		
		int max1 =Integer.MAX_VALUE,
				
			max2 =Integer.MIN_VALUE;
		
		
		for (int e :ary ) {
			if (e > max1) {
				max1 = max2 ;
				max1= e;
				
				break ;
			}
		
		 if  ( e < max2 && e!= max1){
				max2 =e;
			
			}
		 System.out.println(max1);
			//System.out.println(max2);
		}
	}
}
		
	

