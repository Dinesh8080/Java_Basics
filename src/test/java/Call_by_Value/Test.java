package Call_by_Value;

public class Test {

	public int add () {
	
	System.out.println("add"+" ");
	int a = 10;
	int b = 20;
    int c= a +b ;
	return c;
				
	}
	
	public String gettrainer () {
	String name = "Dinesh Deshmukh";
    return name ;
	}
	
	public static void main(String[] args) {
		
		
// add method as integer- 
		
		Test t1 = new Test();
		int s2 =t1.add();
		System.out.println(s2);
		System.out.println(s2-10);
		
	//get trainer method as string -
		
		String D3=t1.gettrainer();
		System.out.println(D3);
		
		
		if (D3.equals("Dinesh Deshmukh")) {
		System.out.println ("Pass");
		}
		else { 
			System.out.println("fail");
	}

	}
}
