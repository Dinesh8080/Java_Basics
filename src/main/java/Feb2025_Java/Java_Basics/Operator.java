package Feb2025_Java.Java_Basics;

class Calc {

public int mul(int n1, int n2)
	{
	int d;
		d = n1*n2;
		return d;
	}
public int mul(int n1, int n2,int c)
{
int d;
	d = n1*n2/c;
	return d;
}
}





public class Operator {

	public static void main(String[] args) {
		
		Calc cl = new Calc();
		int a=12;
		int b=123;
		int p =2;
		
		int k =cl.mul(a, b,p);
	
		System.out.println(k);
		
	}

}
